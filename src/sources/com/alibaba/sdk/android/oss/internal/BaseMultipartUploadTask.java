package com.alibaba.sdk.android.oss.internal;

import android.net.Uri;
import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.ServiceException;
import com.alibaba.sdk.android.oss.TaskCancelException;
import com.alibaba.sdk.android.oss.callback.OSSCompletedCallback;
import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.common.OSSHeaders;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.common.utils.BinaryUtil;
import com.alibaba.sdk.android.oss.model.CompleteMultipartUploadRequest;
import com.alibaba.sdk.android.oss.model.CompleteMultipartUploadResult;
import com.alibaba.sdk.android.oss.model.MultipartUploadRequest;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import com.alibaba.sdk.android.oss.model.ObjectMetadata;
import com.alibaba.sdk.android.oss.model.PartETag;
import com.alibaba.sdk.android.oss.model.UploadPartRequest;
import com.alibaba.sdk.android.oss.model.UploadPartResult;
import com.alibaba.sdk.android.oss.network.ExecutionContext;
import com.youth.banner.config.BannerConfig;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseMultipartUploadTask<Request extends MultipartUploadRequest, Result extends CompleteMultipartUploadResult> implements Callable<Result> {
    protected final int CPU_SIZE;
    protected final int KEEP_ALIVE_TIME;
    protected final int MAX_CORE_POOL_SIZE;
    protected final int MAX_IMUM_POOL_SIZE;
    protected final int MAX_QUEUE_SIZE;
    protected final int PART_SIZE_ALIGN_NUM;
    protected InternalRequestOperation mApiOperation;
    protected boolean mCheckCRC64;
    protected OSSCompletedCallback<Request, Result> mCompletedCallback;
    protected ExecutionContext mContext;
    protected long mFileLength;
    protected boolean mIsCancel;
    protected long mLastPartSize;
    protected Object mLock;
    protected int[] mPartAttr;
    protected List<PartETag> mPartETags;
    protected int mPartExceptionCount;
    protected ThreadPoolExecutor mPoolExecutor;
    protected OSSProgressCallback<Request> mProgressCallback;
    protected Request mRequest;
    protected int mRunPartTaskCount;
    protected Exception mUploadException;
    protected File mUploadFile;
    protected String mUploadFilePath;
    protected String mUploadId;
    protected Uri mUploadUri;
    protected long mUploadedLength;

    public BaseMultipartUploadTask(InternalRequestOperation internalRequestOperation, Request request, OSSCompletedCallback<Request, Result> oSSCompletedCallback, ExecutionContext executionContext) {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors() * 2;
        this.CPU_SIZE = iAvailableProcessors;
        int iIntValue = iAvailableProcessors < 5 ? iAvailableProcessors : 5;
        this.MAX_CORE_POOL_SIZE = iIntValue;
        this.MAX_IMUM_POOL_SIZE = iAvailableProcessors;
        this.KEEP_ALIVE_TIME = BannerConfig.LOOP_TIME;
        this.MAX_QUEUE_SIZE = 5000;
        this.PART_SIZE_ALIGN_NUM = 4096;
        this.mPartETags = new ArrayList();
        this.mLock = new Object();
        this.mUploadedLength = 0L;
        this.mCheckCRC64 = false;
        this.mPartAttr = new int[2];
        this.mApiOperation = internalRequestOperation;
        this.mRequest = request;
        this.mProgressCallback = request.getProgressCallback();
        this.mCompletedCallback = oSSCompletedCallback;
        this.mContext = executionContext;
        this.mCheckCRC64 = request.getCRC64() == OSSRequest.CRC64Config.YES;
        if (request.getThreadNum() != null && request.getThreadNum().intValue() > 0) {
            iIntValue = request.getThreadNum().intValue();
            iAvailableProcessors = request.getThreadNum().intValue();
        }
        this.mPoolExecutor = new ThreadPoolExecutor(iIntValue, iAvailableProcessors, 3000L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(5000), new ThreadFactory() { // from class: com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "oss-android-multipart-thread");
            }
        });
    }

    public abstract void abortThisUpload();

    public long ceilPartSize(long j11) {
        return ((j11 + 4095) / 4096) * 4096;
    }

    public void checkCancel() throws ClientException {
        if (this.mContext.getCancellationHandler().isCancelled()) {
            TaskCancelException taskCancelException = new TaskCancelException("multipart cancel");
            throw new ClientException(taskCancelException.getMessage(), taskCancelException, Boolean.TRUE);
        }
    }

    public void checkException() throws ServiceException, ClientException, IOException {
        if (this.mUploadException != null) {
            releasePool();
            Exception exc = this.mUploadException;
            if (exc instanceof IOException) {
                throw ((IOException) exc);
            }
            if (exc instanceof ServiceException) {
                throw ((ServiceException) exc);
            }
            if (!(exc instanceof ClientException)) {
                throw new ClientException(this.mUploadException.getMessage(), this.mUploadException);
            }
            throw ((ClientException) exc);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0056 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void checkInitData() throws com.alibaba.sdk.android.oss.ClientException {
        /*
            r6 = this;
            Request extends com.alibaba.sdk.android.oss.model.MultipartUploadRequest r0 = r6.mRequest
            java.lang.String r0 = r0.getUploadFilePath()
            r1 = 0
            if (r0 == 0) goto L24
            Request extends com.alibaba.sdk.android.oss.model.MultipartUploadRequest r0 = r6.mRequest
            java.lang.String r0 = r0.getUploadFilePath()
            r6.mUploadFilePath = r0
            r6.mUploadedLength = r1
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r6.mUploadFilePath
            r0.<init>(r3)
            r6.mUploadFile = r0
            long r3 = r0.length()
            r6.mFileLength = r3
            goto L70
        L24:
            Request extends com.alibaba.sdk.android.oss.model.MultipartUploadRequest r0 = r6.mRequest
            android.net.Uri r0 = r0.getUploadUri()
            if (r0 == 0) goto L70
            Request extends com.alibaba.sdk.android.oss.model.MultipartUploadRequest r0 = r6.mRequest
            android.net.Uri r0 = r0.getUploadUri()
            r6.mUploadUri = r0
            r0 = 0
            com.alibaba.sdk.android.oss.network.ExecutionContext r3 = r6.mContext     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            android.net.Uri r4 = r6.mUploadUri     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            java.lang.String r5 = "r"
            android.os.ParcelFileDescriptor r0 = r3.openFileDescriptor(r4, r5)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            long r3 = r0.getStatSize()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            r6.mFileLength = r3     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            r0.close()     // Catch: java.io.IOException -> L51
            goto L70
        L51:
            r0 = move-exception
            com.alibaba.sdk.android.oss.common.OSSLog.logThrowable2Local(r0)
            goto L70
        L56:
            r1 = move-exception
            goto L65
        L58:
            r1 = move-exception
            com.alibaba.sdk.android.oss.ClientException r2 = new com.alibaba.sdk.android.oss.ClientException     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = r1.getMessage()     // Catch: java.lang.Throwable -> L56
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L56
            r2.<init>(r3, r1, r4)     // Catch: java.lang.Throwable -> L56
            throw r2     // Catch: java.lang.Throwable -> L56
        L65:
            if (r0 == 0) goto L6f
            r0.close()     // Catch: java.io.IOException -> L6b
            goto L6f
        L6b:
            r0 = move-exception
            com.alibaba.sdk.android.oss.common.OSSLog.logThrowable2Local(r0)
        L6f:
            throw r1
        L70:
            long r3 = r6.mFileLength
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto Lbb
            int[] r0 = r6.mPartAttr
            r6.checkPartSize(r0)
            Request extends com.alibaba.sdk.android.oss.model.MultipartUploadRequest r0 = r6.mRequest
            long r0 = r0.getPartSize()
            int[] r2 = r6.mPartAttr
            r3 = 1
            r2 = r2[r3]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "[checkInitData] - partNumber : "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.alibaba.sdk.android.oss.common.OSSLog.logDebug(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "[checkInitData] - partSize : "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.alibaba.sdk.android.oss.common.OSSLog.logDebug(r4)
            if (r2 <= r3) goto Lba
            r2 = 102400(0x19000, double:5.05923E-319)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto Lb2
            goto Lba
        Lb2:
            com.alibaba.sdk.android.oss.ClientException r0 = new com.alibaba.sdk.android.oss.ClientException
            java.lang.String r1 = "Part size must be greater than or equal to 100KB!"
            r0.<init>(r1)
            throw r0
        Lba:
            return
        Lbb:
            com.alibaba.sdk.android.oss.ClientException r0 = new com.alibaba.sdk.android.oss.ClientException
            java.lang.String r1 = "file length must not be 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask.checkInitData():void");
    }

    public void checkPartSize(int[] iArr) {
        long partSize = this.mRequest.getPartSize();
        OSSLog.logDebug("[checkPartSize] - mFileLength : " + this.mFileLength);
        OSSLog.logDebug("[checkPartSize] - partSize : " + partSize);
        long j11 = this.mFileLength;
        long j12 = j11 / partSize;
        if (j11 % partSize != 0) {
            j12++;
        }
        if (j12 == 1) {
            partSize = j11;
        } else if (j12 > 5000) {
            partSize = ceilPartSize(j11 / ((long) 4999));
            long j13 = this.mFileLength;
            j12 = (j13 / partSize) + (j13 % partSize == 0 ? 0L : 1L);
        }
        int i11 = (int) partSize;
        iArr[0] = i11;
        iArr[1] = (int) j12;
        this.mRequest.setPartSize(i11);
        OSSLog.logDebug("[checkPartSize] - partNumber : " + j12);
        OSSLog.logDebug("[checkPartSize] - partSize : " + i11);
        long j14 = this.mFileLength % partSize;
        if (j14 != 0) {
            partSize = j14;
        }
        this.mLastPartSize = partSize;
    }

    public boolean checkWaitCondition(int i11) {
        return this.mPartETags.size() != i11;
    }

    public CompleteMultipartUploadResult completeMultipartUploadResult() throws ClientException {
        CompleteMultipartUploadResult completeMultipartUploadResultSyncCompleteMultipartUpload;
        if (this.mPartETags.size() > 0) {
            Collections.sort(this.mPartETags, new Comparator<PartETag>() { // from class: com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask.2
                @Override // java.util.Comparator
                public int compare(PartETag partETag, PartETag partETag2) {
                    if (partETag.getPartNumber() < partETag2.getPartNumber()) {
                        return -1;
                    }
                    return partETag.getPartNumber() > partETag2.getPartNumber() ? 1 : 0;
                }
            });
            CompleteMultipartUploadRequest completeMultipartUploadRequest = new CompleteMultipartUploadRequest(this.mRequest.getBucketName(), this.mRequest.getObjectKey(), this.mUploadId, this.mPartETags);
            if (this.mRequest.getCallbackParam() != null) {
                completeMultipartUploadRequest.setCallbackParam(this.mRequest.getCallbackParam());
            }
            if (this.mRequest.getCallbackVars() != null) {
                completeMultipartUploadRequest.setCallbackVars(this.mRequest.getCallbackVars());
            }
            if (this.mRequest.getMetadata() != null) {
                ObjectMetadata objectMetadata = new ObjectMetadata();
                for (String str : this.mRequest.getMetadata().getRawMetadata().keySet()) {
                    if (!str.equals(OSSHeaders.STORAGE_CLASS)) {
                        objectMetadata.setHeader(str, this.mRequest.getMetadata().getRawMetadata().get(str));
                    }
                }
                completeMultipartUploadRequest.setMetadata(objectMetadata);
            }
            completeMultipartUploadRequest.setCRC64(this.mRequest.getCRC64());
            completeMultipartUploadResultSyncCompleteMultipartUpload = this.mApiOperation.syncCompleteMultipartUpload(completeMultipartUploadRequest);
        } else {
            completeMultipartUploadResultSyncCompleteMultipartUpload = null;
        }
        this.mUploadedLength = 0L;
        return completeMultipartUploadResultSyncCompleteMultipartUpload;
    }

    public abstract Result doMultipartUpload();

    public abstract void initMultipartUploadId();

    public void notifyMultipartThread() {
        this.mLock.notify();
        this.mPartExceptionCount = 0;
    }

    public void onProgressCallback(Request request, long j11, long j12) {
        OSSProgressCallback<Request> oSSProgressCallback = this.mProgressCallback;
        if (oSSProgressCallback != null) {
            oSSProgressCallback.onProgress(request, j11, j12);
        }
    }

    public abstract void processException(Exception exc);

    public void releasePool() {
        ThreadPoolExecutor threadPoolExecutor = this.mPoolExecutor;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.getQueue().clear();
            this.mPoolExecutor.shutdown();
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0156 A[Catch: IOException -> 0x012b, TRY_ENTER, TryCatch #5 {IOException -> 0x012b, blocks: (B:53:0x0127, B:57:0x012f, B:59:0x0134, B:78:0x0156, B:80:0x015b, B:82:0x0160), top: B:99:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x015b A[Catch: IOException -> 0x012b, TryCatch #5 {IOException -> 0x012b, blocks: (B:53:0x0127, B:57:0x012f, B:59:0x0134, B:78:0x0156, B:80:0x015b, B:82:0x0160), top: B:99:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0160 A[Catch: IOException -> 0x012b, TRY_LEAVE, TryCatch #5 {IOException -> 0x012b, blocks: (B:53:0x0127, B:57:0x012f, B:59:0x0134, B:78:0x0156, B:80:0x015b, B:82:0x0160), top: B:99:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0170 A[Catch: IOException -> 0x016c, TryCatch #7 {IOException -> 0x016c, blocks: (B:87:0x0168, B:91:0x0170, B:93:0x0175), top: B:102:0x0168 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0175 A[Catch: IOException -> 0x016c, TRY_LEAVE, TryCatch #7 {IOException -> 0x016c, blocks: (B:87:0x0168, B:91:0x0170, B:93:0x0175), top: B:102:0x0168 }] */
    public void uploadPart(int i11, int i12, int i13) throws Throwable {
        Throwable th2;
        InputStream inputStream;
        BufferedInputStream bufferedInputStream;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                if (this.mContext.getCancellationHandler().isCancelled()) {
                    this.mPoolExecutor.getQueue().clear();
                    return;
                }
                synchronized (this.mLock) {
                    this.mRunPartTaskCount++;
                }
                preUploadPart(i11, i12, i13);
                byte[] bArr = new byte[i12];
                long partSize = ((long) i11) * this.mRequest.getPartSize();
                if (this.mUploadUri != null) {
                    InputStream inputStreamOpenInputStream = this.mContext.getApplicationContext().getContentResolver().openInputStream(this.mUploadUri);
                    try {
                        bufferedInputStream = new BufferedInputStream(inputStreamOpenInputStream);
                        try {
                            bufferedInputStream.skip(partSize);
                            bufferedInputStream.read(bArr, 0, i12);
                            inputStream = inputStreamOpenInputStream;
                            randomAccessFile = null;
                        } catch (Exception e8) {
                            e = e8;
                            inputStream = inputStreamOpenInputStream;
                            try {
                                processException(e);
                                if (randomAccessFile2 != null) {
                                    randomAccessFile2.close();
                                }
                                if (bufferedInputStream != null) {
                                    bufferedInputStream.close();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                if (randomAccessFile2 != null) {
                                    try {
                                        randomAccessFile2.close();
                                    } catch (IOException e10) {
                                        OSSLog.logThrowable2Local(e10);
                                        throw th2;
                                    }
                                }
                                if (bufferedInputStream != null) {
                                    bufferedInputStream.close();
                                }
                                if (inputStream != null) {
                                    throw th2;
                                }
                                inputStream.close();
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            inputStream = inputStreamOpenInputStream;
                            if (randomAccessFile2 != null) {
                                randomAccessFile2.close();
                            }
                            if (bufferedInputStream != null) {
                                bufferedInputStream.close();
                            }
                            if (inputStream != null) {
                                throw th2;
                            }
                            inputStream.close();
                            throw th2;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        bufferedInputStream = null;
                    } catch (Throwable th5) {
                        th2 = th5;
                        bufferedInputStream = null;
                    }
                } else {
                    randomAccessFile = new RandomAccessFile(this.mUploadFile, "r");
                    try {
                        randomAccessFile.seek(partSize);
                        randomAccessFile.readFully(bArr, 0, i12);
                        inputStream = null;
                        bufferedInputStream = null;
                    } catch (Exception e12) {
                        e = e12;
                        inputStream = null;
                        bufferedInputStream = null;
                        randomAccessFile2 = randomAccessFile;
                        processException(e);
                        if (randomAccessFile2 != null) {
                            randomAccessFile2.close();
                        }
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                        inputStream = null;
                        bufferedInputStream = null;
                        randomAccessFile2 = randomAccessFile;
                        if (randomAccessFile2 != null) {
                            randomAccessFile2.close();
                        }
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        if (inputStream != null) {
                            throw th2;
                        }
                        inputStream.close();
                        throw th2;
                    }
                }
                try {
                    UploadPartRequest uploadPartRequest = new UploadPartRequest(this.mRequest.getBucketName(), this.mRequest.getObjectKey(), this.mUploadId, i11 + 1);
                    uploadPartRequest.setPartContent(bArr);
                    uploadPartRequest.setMd5Digest(BinaryUtil.calculateBase64Md5(bArr));
                    uploadPartRequest.setCRC64(this.mRequest.getCRC64());
                    UploadPartResult uploadPartResultSyncUploadPart = this.mApiOperation.syncUploadPart(uploadPartRequest);
                    synchronized (this.mLock) {
                        try {
                            PartETag partETag = new PartETag(uploadPartRequest.getPartNumber(), uploadPartResultSyncUploadPart.getETag());
                            long j11 = i12;
                            partETag.setPartSize(j11);
                            if (this.mCheckCRC64) {
                                partETag.setCRC64(uploadPartResultSyncUploadPart.getClientCRC().longValue());
                            }
                            this.mPartETags.add(partETag);
                            this.mUploadedLength += j11;
                            uploadPartFinish(partETag);
                            if (!this.mContext.getCancellationHandler().isCancelled()) {
                                if (this.mPartETags.size() == i13 - this.mPartExceptionCount) {
                                    notifyMultipartThread();
                                }
                                onProgressCallback(this.mRequest, this.mUploadedLength, this.mFileLength);
                            } else if (this.mPartETags.size() == this.mRunPartTaskCount - this.mPartExceptionCount) {
                                TaskCancelException taskCancelException = new TaskCancelException("multipart cancel");
                                throw new ClientException(taskCancelException.getMessage(), taskCancelException, Boolean.TRUE);
                            }
                        } catch (Throwable th7) {
                            throw th7;
                        }
                    }
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Exception e13) {
                    e = e13;
                    randomAccessFile2 = randomAccessFile;
                    processException(e);
                    if (randomAccessFile2 != null) {
                        randomAccessFile2.close();
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Throwable th8) {
                    th2 = th8;
                    randomAccessFile2 = randomAccessFile;
                    if (randomAccessFile2 != null) {
                        randomAccessFile2.close();
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (inputStream != null) {
                        throw th2;
                    }
                    inputStream.close();
                    throw th2;
                }
            } catch (IOException e14) {
                OSSLog.logThrowable2Local(e14);
            }
        } catch (Exception e15) {
            e = e15;
            inputStream = null;
            bufferedInputStream = null;
        } catch (Throwable th9) {
            th2 = th9;
            inputStream = null;
            bufferedInputStream = null;
        }
    }

    @Override // java.util.concurrent.Callable
    public Result call() throws ServiceException, ClientException {
        try {
            checkInitData();
            initMultipartUploadId();
            Result result = (Result) doMultipartUpload();
            OSSCompletedCallback<Request, Result> oSSCompletedCallback = this.mCompletedCallback;
            if (oSSCompletedCallback == null) {
                return result;
            }
            oSSCompletedCallback.onSuccess(this.mRequest, result);
            return result;
        } catch (ServiceException e8) {
            OSSCompletedCallback<Request, Result> oSSCompletedCallback2 = this.mCompletedCallback;
            if (oSSCompletedCallback2 != null) {
                oSSCompletedCallback2.onFailure(this.mRequest, null, e8);
            }
            throw e8;
        } catch (Exception e10) {
            ClientException clientException = e10 instanceof ClientException ? (ClientException) e10 : new ClientException(e10.toString(), e10);
            OSSCompletedCallback<Request, Result> oSSCompletedCallback3 = this.mCompletedCallback;
            if (oSSCompletedCallback3 != null) {
                oSSCompletedCallback3.onFailure(this.mRequest, clientException, null);
            }
            throw clientException;
        }
    }

    public void uploadPartFinish(PartETag partETag) {
    }

    public void preUploadPart(int i11, int i12, int i13) {
    }
}
