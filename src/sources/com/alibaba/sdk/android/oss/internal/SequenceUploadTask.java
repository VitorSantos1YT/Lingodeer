package com.alibaba.sdk.android.oss.internal;

import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.ServiceException;
import com.alibaba.sdk.android.oss.TaskCancelException;
import com.alibaba.sdk.android.oss.callback.OSSCompletedCallback;
import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.common.utils.BinaryUtil;
import com.alibaba.sdk.android.oss.common.utils.CRC64;
import com.alibaba.sdk.android.oss.common.utils.OSSSharedPreferences;
import com.alibaba.sdk.android.oss.common.utils.OSSUtils;
import com.alibaba.sdk.android.oss.model.AbortMultipartUploadRequest;
import com.alibaba.sdk.android.oss.model.CompleteMultipartUploadResult;
import com.alibaba.sdk.android.oss.model.InitiateMultipartUploadRequest;
import com.alibaba.sdk.android.oss.model.InitiateMultipartUploadResult;
import com.alibaba.sdk.android.oss.model.ListPartsRequest;
import com.alibaba.sdk.android.oss.model.ListPartsResult;
import com.alibaba.sdk.android.oss.model.PartETag;
import com.alibaba.sdk.android.oss.model.PartSummary;
import com.alibaba.sdk.android.oss.model.ResumableUploadRequest;
import com.alibaba.sdk.android.oss.model.ResumableUploadResult;
import com.alibaba.sdk.android.oss.model.UploadPartRequest;
import com.alibaba.sdk.android.oss.model.UploadPartResult;
import com.alibaba.sdk.android.oss.network.ExecutionContext;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ep.a;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.CheckedInputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class SequenceUploadTask extends BaseMultipartUploadTask<ResumableUploadRequest, ResumableUploadResult> implements Callable<ResumableUploadResult> {
    private List<Integer> mAlreadyUploadIndex;
    private File mCRC64RecordFile;
    private long mFirstPartSize;
    private File mRecordFile;
    private OSSSharedPreferences mSp;

    public SequenceUploadTask(ResumableUploadRequest resumableUploadRequest, OSSCompletedCallback<ResumableUploadRequest, ResumableUploadResult> oSSCompletedCallback, ExecutionContext executionContext, InternalRequestOperation internalRequestOperation) {
        super(internalRequestOperation, resumableUploadRequest, oSSCompletedCallback, executionContext);
        this.mAlreadyUploadIndex = new ArrayList();
        this.mSp = OSSSharedPreferences.instance(this.mContext.getApplicationContext());
    }

    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public void abortThisUpload() {
        if (this.mUploadId != null) {
            this.mApiOperation.abortMultipartUpload(new AbortMultipartUploadRequest(((ResumableUploadRequest) this.mRequest).getBucketName(), ((ResumableUploadRequest) this.mRequest).getObjectKey(), this.mUploadId), null).waitUntilFinished();
        }
    }

    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public void checkException() throws Throwable {
        if (this.mContext.getCancellationHandler().isCancelled()) {
            if (((ResumableUploadRequest) this.mRequest).deleteUploadOnCancelling().booleanValue()) {
                abortThisUpload();
                File file = this.mRecordFile;
                if (file != null) {
                    file.delete();
                }
            } else {
                List<PartETag> list = this.mPartETags;
                if (list != null && list.size() > 0 && this.mCheckCRC64 && ((ResumableUploadRequest) this.mRequest).getRecordDirectory() != null) {
                    HashMap map = new HashMap();
                    for (PartETag partETag : this.mPartETags) {
                        map.put(Integer.valueOf(partETag.getPartNumber()), Long.valueOf(partETag.getCRC64()));
                    }
                    ObjectOutputStream objectOutputStream = null;
                    try {
                        try {
                            File file2 = new File(((ResumableUploadRequest) this.mRequest).getRecordDirectory() + File.separator + this.mUploadId);
                            this.mCRC64RecordFile = file2;
                            if (!file2.exists()) {
                                this.mCRC64RecordFile.createNewFile();
                            }
                            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream(this.mCRC64RecordFile));
                            try {
                                objectOutputStream2.writeObject(map);
                                objectOutputStream2.close();
                            } catch (IOException e8) {
                                e = e8;
                                objectOutputStream = objectOutputStream2;
                                OSSLog.logThrowable2Local(e);
                                if (objectOutputStream != null) {
                                    objectOutputStream.close();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                objectOutputStream = objectOutputStream2;
                                if (objectOutputStream != null) {
                                    objectOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (IOException e10) {
                        e = e10;
                    }
                }
            }
        }
        super.checkException();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x012d  */
    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public void initMultipartUploadId() throws ServiceException, ClientException, IOException {
        String strCalculateMd5Str;
        Map map;
        boolean zIsTruncated;
        if (!OSSUtils.isEmptyString(((ResumableUploadRequest) this.mRequest).getRecordDirectory())) {
            if (this.mUploadUri != null) {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.mContext.getApplicationContext().getContentResolver().openFileDescriptor(this.mUploadUri, "r");
                try {
                    strCalculateMd5Str = BinaryUtil.calculateMd5Str(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th2) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    throw th2;
                }
            } else {
                strCalculateMd5Str = BinaryUtil.calculateMd5Str(this.mUploadFilePath);
            }
            StringBuilder sbN = a.n(strCalculateMd5Str);
            sbN.append(((ResumableUploadRequest) this.mRequest).getBucketName());
            sbN.append(((ResumableUploadRequest) this.mRequest).getObjectKey());
            sbN.append(String.valueOf(((ResumableUploadRequest) this.mRequest).getPartSize()));
            sbN.append(this.mCheckCRC64 ? "-crc64" : BuildConfig.VERSION_NAME);
            sbN.append("-sequence");
            String strCalculateMd5Str2 = BinaryUtil.calculateMd5Str(sbN.toString().getBytes());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(((ResumableUploadRequest) this.mRequest).getRecordDirectory());
            String str = File.separator;
            File file = new File(a.k(sb2, str, strCalculateMd5Str2));
            this.mRecordFile = file;
            if (file.exists()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(this.mRecordFile));
                this.mUploadId = bufferedReader.readLine();
                bufferedReader.close();
                OSSLog.logDebug("sequence [initUploadId] - Found record file, uploadid: " + this.mUploadId);
            }
            if (!OSSUtils.isEmptyString(this.mUploadId)) {
                if (this.mCheckCRC64) {
                    File file2 = new File(((ResumableUploadRequest) this.mRequest).getRecordDirectory() + str + this.mUploadId);
                    if (file2.exists()) {
                        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file2));
                        try {
                            try {
                                map = (Map) objectInputStream.readObject();
                                try {
                                    file2.delete();
                                } catch (ClassNotFoundException e8) {
                                    e = e8;
                                    OSSLog.logThrowable2Local(e);
                                }
                            } catch (ClassNotFoundException e10) {
                                e = e10;
                                map = null;
                            }
                            objectInputStream.close();
                            file2.delete();
                        } catch (Throwable th3) {
                            objectInputStream.close();
                            file2.delete();
                            throw th3;
                        }
                    } else {
                        map = null;
                    }
                } else {
                    map = null;
                }
                int nextPartNumberMarker = 0;
                do {
                    ListPartsRequest listPartsRequest = new ListPartsRequest(((ResumableUploadRequest) this.mRequest).getBucketName(), ((ResumableUploadRequest) this.mRequest).getObjectKey(), this.mUploadId);
                    if (nextPartNumberMarker > 0) {
                        listPartsRequest.setPartNumberMarker(Integer.valueOf(nextPartNumberMarker));
                    }
                    OSSAsyncTask<ListPartsResult> oSSAsyncTaskListParts = this.mApiOperation.listParts(listPartsRequest, null);
                    try {
                        ListPartsResult listPartsResult = (ListPartsResult) oSSAsyncTaskListParts.getResult();
                        zIsTruncated = listPartsResult.isTruncated();
                        nextPartNumberMarker = listPartsResult.getNextPartNumberMarker();
                        List<PartSummary> parts = listPartsResult.getParts();
                        for (int i11 = 0; i11 < parts.size(); i11++) {
                            PartSummary partSummary = parts.get(i11);
                            PartETag partETag = new PartETag(partSummary.getPartNumber(), partSummary.getETag());
                            partETag.setPartSize(partSummary.getSize());
                            if (map != null && map.size() > 0 && map.containsKey(Integer.valueOf(partETag.getPartNumber()))) {
                                partETag.setCRC64(((Long) map.get(Integer.valueOf(partETag.getPartNumber()))).longValue());
                            }
                            this.mPartETags.add(partETag);
                            this.mUploadedLength += partSummary.getSize();
                            this.mAlreadyUploadIndex.add(Integer.valueOf(partSummary.getPartNumber()));
                            if (i11 == 0) {
                                this.mFirstPartSize = partSummary.getSize();
                            }
                        }
                    } catch (ClientException e11) {
                        throw e11;
                    } catch (ServiceException e12) {
                        if (e12.getStatusCode() != 404) {
                            throw e12;
                        }
                        this.mUploadId = null;
                        zIsTruncated = false;
                    }
                    oSSAsyncTaskListParts.waitUntilFinished();
                } while (zIsTruncated);
            }
            if (!this.mRecordFile.exists() && !this.mRecordFile.createNewFile()) {
                throw new ClientException("Can't create file at path: " + this.mRecordFile.getAbsolutePath() + "\nPlease make sure the directory exist!");
            }
        }
        if (OSSUtils.isEmptyString(this.mUploadId)) {
            InitiateMultipartUploadRequest initiateMultipartUploadRequest = new InitiateMultipartUploadRequest(((ResumableUploadRequest) this.mRequest).getBucketName(), ((ResumableUploadRequest) this.mRequest).getObjectKey(), ((ResumableUploadRequest) this.mRequest).getMetadata());
            initiateMultipartUploadRequest.isSequential = true;
            this.mUploadId = ((InitiateMultipartUploadResult) this.mApiOperation.initMultipartUpload(initiateMultipartUploadRequest, null).getResult()).getUploadId();
            if (this.mRecordFile != null) {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.mRecordFile));
                bufferedWriter.write(this.mUploadId);
                bufferedWriter.close();
            }
        }
        ((ResumableUploadRequest) this.mRequest).setUploadId(this.mUploadId);
    }

    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public void processException(Exception exc) {
        if (this.mUploadException == null || !exc.getMessage().equals(this.mUploadException.getMessage())) {
            this.mUploadException = exc;
        }
        OSSLog.logThrowable2Local(exc);
        if (!this.mContext.getCancellationHandler().isCancelled() || this.mIsCancel) {
            return;
        }
        this.mIsCancel = true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ce A[Catch: IOException -> 0x01c5, TRY_LEAVE, TryCatch #8 {IOException -> 0x01c5, blocks: (B:94:0x01c1, B:98:0x01c9, B:100:0x01ce), top: B:106:0x01c1 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d4 A[Catch: all -> 0x00e0, Exception -> 0x00e3, ServiceException -> 0x00e7, TryCatch #0 {all -> 0x00e0, blocks: (B:36:0x008b, B:37:0x00a4, B:39:0x00d4, B:46:0x00eb, B:48:0x0104, B:59:0x0126, B:60:0x0138, B:79:0x0162, B:81:0x016a, B:82:0x016e, B:84:0x0188, B:85:0x01a6), top: B:104:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0104 A[Catch: all -> 0x00e0, Exception -> 0x00e3, ServiceException -> 0x00e7, TRY_LEAVE, TryCatch #0 {all -> 0x00e0, blocks: (B:36:0x008b, B:37:0x00a4, B:39:0x00d4, B:46:0x00eb, B:48:0x0104, B:59:0x0126, B:60:0x0138, B:79:0x0162, B:81:0x016a, B:82:0x016e, B:84:0x0188, B:85:0x01a6), top: B:104:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0110 A[Catch: IOException -> 0x0114, TRY_ENTER, TryCatch #3 {IOException -> 0x0114, blocks: (B:50:0x0110, B:54:0x0118, B:56:0x011d, B:71:0x0150, B:73:0x0155, B:75:0x015a, B:87:0x01b3, B:89:0x01b8), top: B:105:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0118 A[Catch: IOException -> 0x0114, TryCatch #3 {IOException -> 0x0114, blocks: (B:50:0x0110, B:54:0x0118, B:56:0x011d, B:71:0x0150, B:73:0x0155, B:75:0x015a, B:87:0x01b3, B:89:0x01b8), top: B:105:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x011d A[Catch: IOException -> 0x0114, TRY_LEAVE, TryCatch #3 {IOException -> 0x0114, blocks: (B:50:0x0110, B:54:0x0118, B:56:0x011d, B:71:0x0150, B:73:0x0155, B:75:0x015a, B:87:0x01b3, B:89:0x01b8), top: B:105:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0126 A[Catch: all -> 0x00e0, Exception -> 0x00e3, ServiceException -> 0x00e7, TRY_ENTER, TryCatch #0 {all -> 0x00e0, blocks: (B:36:0x008b, B:37:0x00a4, B:39:0x00d4, B:46:0x00eb, B:48:0x0104, B:59:0x0126, B:60:0x0138, B:79:0x0162, B:81:0x016a, B:82:0x016e, B:84:0x0188, B:85:0x01a6), top: B:104:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0150 A[Catch: IOException -> 0x0114, TRY_ENTER, TryCatch #3 {IOException -> 0x0114, blocks: (B:50:0x0110, B:54:0x0118, B:56:0x011d, B:71:0x0150, B:73:0x0155, B:75:0x015a, B:87:0x01b3, B:89:0x01b8), top: B:105:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0155 A[Catch: IOException -> 0x0114, TryCatch #3 {IOException -> 0x0114, blocks: (B:50:0x0110, B:54:0x0118, B:56:0x011d, B:71:0x0150, B:73:0x0155, B:75:0x015a, B:87:0x01b3, B:89:0x01b8), top: B:105:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x016a A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:36:0x008b, B:37:0x00a4, B:39:0x00d4, B:46:0x00eb, B:48:0x0104, B:59:0x0126, B:60:0x0138, B:79:0x0162, B:81:0x016a, B:82:0x016e, B:84:0x0188, B:85:0x01a6), top: B:104:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x016e A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:36:0x008b, B:37:0x00a4, B:39:0x00d4, B:46:0x00eb, B:48:0x0104, B:59:0x0126, B:60:0x0138, B:79:0x0162, B:81:0x016a, B:82:0x016e, B:84:0x0188, B:85:0x01a6), top: B:104:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0188 A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:36:0x008b, B:37:0x00a4, B:39:0x00d4, B:46:0x00eb, B:48:0x0104, B:59:0x0126, B:60:0x0138, B:79:0x0162, B:81:0x016a, B:82:0x016e, B:84:0x0188, B:85:0x01a6), top: B:104:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01b3 A[Catch: IOException -> 0x0114, TRY_ENTER, TryCatch #3 {IOException -> 0x0114, blocks: (B:50:0x0110, B:54:0x0118, B:56:0x011d, B:71:0x0150, B:73:0x0155, B:75:0x015a, B:87:0x01b3, B:89:0x01b8), top: B:105:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01b8 A[Catch: IOException -> 0x0114, TRY_LEAVE, TryCatch #3 {IOException -> 0x0114, blocks: (B:50:0x0110, B:54:0x0118, B:56:0x011d, B:71:0x0150, B:73:0x0155, B:75:0x015a, B:87:0x01b3, B:89:0x01b8), top: B:105:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01c9 A[Catch: IOException -> 0x01c5, TryCatch #8 {IOException -> 0x01c5, blocks: (B:94:0x01c1, B:98:0x01c9, B:100:0x01ce), top: B:106:0x01c1 }] */
    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public void uploadPart(int i11, int i12, int i13) throws Throwable {
        RandomAccessFile randomAccessFile;
        InputStream inputStream;
        BufferedInputStream bufferedInputStream;
        RandomAccessFile randomAccessFile2;
        Throwable th2;
        PartETag partETag;
        UploadPartRequest uploadPartRequest;
        UploadPartResult uploadPartResultSyncUploadPart;
        PartETag partETag2;
        RandomAccessFile randomAccessFile3 = null;
        uploadPartRequest = null;
        randomAccessFile3 = null;
        uploadPartRequest = null;
        uploadPartRequest = null;
        UploadPartRequest uploadPartRequest2 = null;
        try {
            try {
                try {
                    if (this.mContext.getCancellationHandler().isCancelled()) {
                        return;
                    }
                    this.mRunPartTaskCount++;
                    preUploadPart(i11, i12, i13);
                    long partSize = ((long) i11) * ((ResumableUploadRequest) this.mRequest).getPartSize();
                    byte[] bArr = new byte[i12];
                    if (this.mUploadUri == null) {
                        RandomAccessFile randomAccessFile4 = new RandomAccessFile(this.mUploadFile, "r");
                        try {
                            randomAccessFile4.seek(partSize);
                            randomAccessFile4.readFully(bArr, 0, i12);
                            inputStream = null;
                            bufferedInputStream = null;
                            randomAccessFile2 = randomAccessFile4;
                            uploadPartRequest = new UploadPartRequest(((ResumableUploadRequest) this.mRequest).getBucketName(), ((ResumableUploadRequest) this.mRequest).getObjectKey(), this.mUploadId, i11 + 1);
                            uploadPartRequest.setPartContent(bArr);
                            uploadPartRequest.setMd5Digest(BinaryUtil.calculateBase64Md5(bArr));
                            uploadPartRequest.setCRC64(((ResumableUploadRequest) this.mRequest).getCRC64());
                            uploadPartResultSyncUploadPart = this.mApiOperation.syncUploadPart(uploadPartRequest);
                            partETag2 = new PartETag(uploadPartRequest.getPartNumber(), uploadPartResultSyncUploadPart.getETag());
                            long j11 = i12;
                            partETag2.setPartSize(j11);
                            if (this.mCheckCRC64) {
                                partETag2.setCRC64(uploadPartResultSyncUploadPart.getClientCRC().longValue());
                            }
                            this.mPartETags.add(partETag2);
                            this.mUploadedLength += j11;
                            uploadPartFinish(partETag2);
                            if (!this.mContext.getCancellationHandler().isCancelled()) {
                                TaskCancelException taskCancelException = new TaskCancelException("sequence upload task cancel");
                                throw new ClientException(taskCancelException.getMessage(), taskCancelException, Boolean.TRUE);
                            }
                            onProgressCallback(this.mRequest, this.mUploadedLength, this.mFileLength);
                            if (randomAccessFile2 != null) {
                                randomAccessFile2.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (bufferedInputStream != null) {
                                bufferedInputStream.close();
                                return;
                            }
                            return;
                        } catch (ServiceException e8) {
                            e = e8;
                            inputStream = null;
                            bufferedInputStream = null;
                            randomAccessFile2 = randomAccessFile4;
                            if (e.getStatusCode() != 409) {
                                processException(e);
                            } else {
                                partETag = new PartETag(uploadPartRequest2.getPartNumber(), e.getPartEtag());
                                partETag.setPartSize(uploadPartRequest2.getPartContent().length);
                                if (this.mCheckCRC64) {
                                    partETag.setCRC64(new CheckedInputStream(new ByteArrayInputStream(uploadPartRequest2.getPartContent()), new CRC64()).getChecksum().getValue());
                                }
                                this.mPartETags.add(partETag);
                                this.mUploadedLength += (long) i12;
                            }
                            if (randomAccessFile2 != null) {
                                randomAccessFile2.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (bufferedInputStream == null) {
                                return;
                            }
                            bufferedInputStream.close();
                            return;
                        } catch (Exception e10) {
                            e = e10;
                            inputStream = null;
                            bufferedInputStream = null;
                            randomAccessFile3 = randomAccessFile4;
                            processException(e);
                            if (randomAccessFile3 != null) {
                                randomAccessFile3.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (bufferedInputStream == null) {
                                return;
                            }
                            bufferedInputStream.close();
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = null;
                            bufferedInputStream = null;
                            randomAccessFile = randomAccessFile4;
                            th2 = th;
                            if (randomAccessFile != null) {
                                randomAccessFile.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (bufferedInputStream == null) {
                                throw th2;
                            }
                            bufferedInputStream.close();
                            throw th2;
                        }
                    }
                    InputStream inputStreamOpenInputStream = this.mContext.getApplicationContext().getContentResolver().openInputStream(this.mUploadUri);
                    try {
                        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStreamOpenInputStream);
                        try {
                            bufferedInputStream2.skip(partSize);
                            bufferedInputStream2.read(bArr, 0, i12);
                            randomAccessFile2 = null;
                            bufferedInputStream = bufferedInputStream2;
                            inputStream = inputStreamOpenInputStream;
                            try {
                                try {
                                    uploadPartRequest = new UploadPartRequest(((ResumableUploadRequest) this.mRequest).getBucketName(), ((ResumableUploadRequest) this.mRequest).getObjectKey(), this.mUploadId, i11 + 1);
                                    try {
                                        uploadPartRequest.setPartContent(bArr);
                                        uploadPartRequest.setMd5Digest(BinaryUtil.calculateBase64Md5(bArr));
                                        uploadPartRequest.setCRC64(((ResumableUploadRequest) this.mRequest).getCRC64());
                                        uploadPartResultSyncUploadPart = this.mApiOperation.syncUploadPart(uploadPartRequest);
                                        partETag2 = new PartETag(uploadPartRequest.getPartNumber(), uploadPartResultSyncUploadPart.getETag());
                                        long j12 = i12;
                                        partETag2.setPartSize(j12);
                                        if (this.mCheckCRC64) {
                                            partETag2.setCRC64(uploadPartResultSyncUploadPart.getClientCRC().longValue());
                                        }
                                        this.mPartETags.add(partETag2);
                                        this.mUploadedLength += j12;
                                        uploadPartFinish(partETag2);
                                        if (!this.mContext.getCancellationHandler().isCancelled()) {
                                            TaskCancelException taskCancelException2 = new TaskCancelException("sequence upload task cancel");
                                            throw new ClientException(taskCancelException2.getMessage(), taskCancelException2, Boolean.TRUE);
                                        }
                                        onProgressCallback(this.mRequest, this.mUploadedLength, this.mFileLength);
                                        if (randomAccessFile2 != null) {
                                            randomAccessFile2.close();
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        if (bufferedInputStream != null) {
                                            bufferedInputStream.close();
                                            return;
                                        }
                                        return;
                                    } catch (ServiceException e11) {
                                        e = e11;
                                        uploadPartRequest2 = uploadPartRequest;
                                        if (e.getStatusCode() != 409) {
                                            processException(e);
                                        } else {
                                            partETag = new PartETag(uploadPartRequest2.getPartNumber(), e.getPartEtag());
                                            partETag.setPartSize(uploadPartRequest2.getPartContent().length);
                                            if (this.mCheckCRC64) {
                                                partETag.setCRC64(new CheckedInputStream(new ByteArrayInputStream(uploadPartRequest2.getPartContent()), new CRC64()).getChecksum().getValue());
                                            }
                                            this.mPartETags.add(partETag);
                                            this.mUploadedLength += (long) i12;
                                        }
                                        if (randomAccessFile2 != null) {
                                            randomAccessFile2.close();
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        if (bufferedInputStream == null) {
                                            return;
                                        }
                                        bufferedInputStream.close();
                                        return;
                                    }
                                } catch (ServiceException e12) {
                                    e = e12;
                                }
                            } catch (Exception e13) {
                                e = e13;
                                randomAccessFile3 = randomAccessFile2;
                                try {
                                    processException(e);
                                    if (randomAccessFile3 != null) {
                                        randomAccessFile3.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (bufferedInputStream == null) {
                                        return;
                                    }
                                    bufferedInputStream.close();
                                    return;
                                } catch (Throwable th4) {
                                    th = th4;
                                    randomAccessFile = randomAccessFile3;
                                    th2 = th;
                                    if (randomAccessFile != null) {
                                        try {
                                            randomAccessFile.close();
                                        } catch (IOException e14) {
                                            OSSLog.logThrowable2Local(e14);
                                            throw th2;
                                        }
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (bufferedInputStream == null) {
                                        throw th2;
                                    }
                                    bufferedInputStream.close();
                                    throw th2;
                                }
                            }
                        } catch (ServiceException e15) {
                            e = e15;
                            randomAccessFile2 = null;
                            bufferedInputStream = bufferedInputStream2;
                            inputStream = inputStreamOpenInputStream;
                            if (e.getStatusCode() != 409) {
                                processException(e);
                            } else {
                                partETag = new PartETag(uploadPartRequest2.getPartNumber(), e.getPartEtag());
                                partETag.setPartSize(uploadPartRequest2.getPartContent().length);
                                if (this.mCheckCRC64) {
                                    partETag.setCRC64(new CheckedInputStream(new ByteArrayInputStream(uploadPartRequest2.getPartContent()), new CRC64()).getChecksum().getValue());
                                }
                                this.mPartETags.add(partETag);
                                this.mUploadedLength += (long) i12;
                            }
                            if (randomAccessFile2 != null) {
                                randomAccessFile2.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (bufferedInputStream == null) {
                                return;
                            }
                            bufferedInputStream.close();
                            return;
                        } catch (Exception e16) {
                            e = e16;
                            bufferedInputStream = bufferedInputStream2;
                            inputStream = inputStreamOpenInputStream;
                            processException(e);
                            if (randomAccessFile3 != null) {
                                randomAccessFile3.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (bufferedInputStream == null) {
                                return;
                            }
                            bufferedInputStream.close();
                            return;
                        } catch (Throwable th5) {
                            randomAccessFile = null;
                            bufferedInputStream = bufferedInputStream2;
                            th2 = th5;
                            inputStream = inputStreamOpenInputStream;
                        }
                    } catch (ServiceException e17) {
                        e = e17;
                        randomAccessFile2 = null;
                        bufferedInputStream = null;
                    } catch (Exception e18) {
                        e = e18;
                        bufferedInputStream = null;
                    } catch (Throwable th6) {
                        th = th6;
                        randomAccessFile = null;
                        bufferedInputStream = null;
                        inputStream = inputStreamOpenInputStream;
                        th2 = th;
                    }
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (bufferedInputStream == null) {
                        throw th2;
                    }
                    bufferedInputStream.close();
                    throw th2;
                } catch (Throwable th7) {
                    th = th7;
                }
            } catch (ServiceException e19) {
                e = e19;
                randomAccessFile2 = null;
                inputStream = null;
                bufferedInputStream = null;
            } catch (Exception e21) {
                e = e21;
                inputStream = null;
                bufferedInputStream = null;
            } catch (Throwable th8) {
                th = th8;
                randomAccessFile = null;
                inputStream = null;
                bufferedInputStream = null;
            }
        } catch (IOException e22) {
            OSSLog.logThrowable2Local(e22);
        }
    }

    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public void uploadPartFinish(PartETag partETag) {
        if (!this.mContext.getCancellationHandler().isCancelled() || this.mSp.contains(this.mUploadId)) {
            return;
        }
        this.mSp.setStringValue(this.mUploadId, String.valueOf(this.mUploadedLength));
        onProgressCallback(this.mRequest, this.mUploadedLength, this.mFileLength);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public ResumableUploadResult doMultipartUpload() throws Throwable {
        long j11 = this.mUploadedLength;
        checkCancel();
        int[] iArr = this.mPartAttr;
        int i11 = iArr[0];
        int i12 = iArr[1];
        if (this.mPartETags.size() > 0 && this.mAlreadyUploadIndex.size() > 0) {
            long jLongValue = this.mUploadedLength;
            if (jLongValue > this.mFileLength) {
                throw new ClientException("The uploading file is inconsistent with before");
            }
            if (this.mFirstPartSize != i11) {
                throw new ClientException("The part size setting is inconsistent with before");
            }
            if (!TextUtils.isEmpty(this.mSp.getStringValue(this.mUploadId))) {
                jLongValue = Long.valueOf(this.mSp.getStringValue(this.mUploadId)).longValue();
            }
            long j12 = jLongValue;
            OSSProgressCallback<Request> oSSProgressCallback = this.mProgressCallback;
            if (oSSProgressCallback != 0) {
                oSSProgressCallback.onProgress(this.mRequest, j12, this.mFileLength);
            }
            this.mSp.removeKey(this.mUploadId);
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.mAlreadyUploadIndex.size() == 0 || !this.mAlreadyUploadIndex.contains(Integer.valueOf(i13 + 1))) {
                if (i13 == i12 - 1) {
                    i11 = (int) (this.mFileLength - j11);
                }
                OSSLog.logDebug("upload part readByte : " + i11);
                j11 += (long) i11;
                uploadPart(i13, i11, i12);
                if (this.mUploadException != null) {
                    break;
                }
            }
        }
        checkException();
        CompleteMultipartUploadResult completeMultipartUploadResult = completeMultipartUploadResult();
        ResumableUploadResult resumableUploadResult = completeMultipartUploadResult != null ? new ResumableUploadResult(completeMultipartUploadResult) : null;
        File file = this.mRecordFile;
        if (file != null) {
            file.delete();
        }
        File file2 = this.mCRC64RecordFile;
        if (file2 != null) {
            file2.delete();
        }
        return resumableUploadResult;
    }
}
