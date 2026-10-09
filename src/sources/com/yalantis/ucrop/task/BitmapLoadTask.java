package com.yalantis.ucrop.task;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import com.adjust.sdk.Constants;
import com.yalantis.ucrop.OkHttpClientStore;
import com.yalantis.ucrop.callback.BitmapLoadCallback;
import com.yalantis.ucrop.model.ExifInfo;
import com.yalantis.ucrop.util.BitmapLoadUtils;
import ep.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import m00.c;
import m00.k;
import m00.k0;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class BitmapLoadTask extends AsyncTask<Void, Void, BitmapWorkerResult> {
    private static final int MAX_BITMAP_SIZE = 104857600;
    private static final String TAG = "BitmapWorkerTask";
    private final BitmapLoadCallback mBitmapLoadCallback;
    private final WeakReference<Context> mContext;
    private Uri mInputUri;
    private Uri mOutputUri;
    private final int mRequiredHeight;
    private final int mRequiredWidth;

    public BitmapLoadTask(Context context, Uri uri, Uri uri2, int i11, int i12, BitmapLoadCallback bitmapLoadCallback) {
        this.mContext = new WeakReference<>(context);
        this.mInputUri = uri;
        this.mOutputUri = uri2;
        this.mRequiredWidth = i11;
        this.mRequiredHeight = i12;
        this.mBitmapLoadCallback = bitmapLoadCallback;
    }

    private boolean checkSize(Bitmap bitmap, BitmapFactory.Options options) {
        if ((bitmap != null ? bitmap.getByteCount() : 0) <= MAX_BITMAP_SIZE) {
            return false;
        }
        options.inSampleSize *= 2;
        return true;
    }

    private void copyFile(Uri uri, Uri uri2) throws Throwable {
        InputStream inputStreamOpenInputStream;
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot copy image");
        }
        Context context = this.mContext.get();
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                if (inputStreamOpenInputStream == null) {
                    throw new NullPointerException("InputStream for given input Uri is null");
                }
                OutputStream outputStreamOpenOutputStream = isContentUri(uri2) ? context.getContentResolver().openOutputStream(uri2) : new FileOutputStream(new File(uri2.getPath()));
                byte[] bArr = new byte[1024];
                while (true) {
                    int i11 = inputStreamOpenInputStream.read(bArr);
                    if (i11 <= 0) {
                        BitmapLoadUtils.close(outputStreamOpenOutputStream);
                        BitmapLoadUtils.close(inputStreamOpenInputStream);
                        this.mInputUri = this.mOutputUri;
                        return;
                    }
                    outputStreamOpenOutputStream.write(bArr, 0, i11);
                }
            } catch (Throwable th2) {
                th = th2;
                BitmapLoadUtils.close(null);
                BitmapLoadUtils.close(inputStreamOpenInputStream);
                this.mInputUri = this.mOutputUri;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpenInputStream = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    private void downloadFile(Uri uri, Uri uri2) throws Throwable {
        Response responseC;
        c cVar;
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot download image");
        }
        Context context = this.mContext.get();
        if (context == null) {
            throw new NullPointerException("Context is null");
        }
        OkHttpClient client = OkHttpClientStore.INSTANCE.getClient();
        k kVar = null;
        try {
            Request.Builder builder = new Request.Builder();
            builder.e(uri.toString());
            try {
                responseC = client.a(new Request(builder)).c();
                try {
                    ResponseBody responseBody = responseC.f45164t;
                    k kVarSource = responseBody.source();
                    try {
                        OutputStream outputStreamOpenOutputStream = isContentUri(this.mOutputUri) ? context.getContentResolver().openOutputStream(uri2) : new FileOutputStream(new File(uri2.getPath()));
                        if (outputStreamOpenOutputStream == null) {
                            throw new NullPointerException("OutputStream for given output Uri is null");
                        }
                        cVar = new c(1, outputStreamOpenOutputStream, new k0());
                        try {
                            kVarSource.O(cVar);
                            BitmapLoadUtils.close(kVarSource);
                            BitmapLoadUtils.close(cVar);
                            BitmapLoadUtils.close(responseBody);
                            client.f45084a.a();
                            this.mInputUri = this.mOutputUri;
                        } catch (Throwable th2) {
                            th = th2;
                            kVar = kVarSource;
                            BitmapLoadUtils.close(kVar);
                            BitmapLoadUtils.close(cVar);
                            if (responseC != null) {
                                BitmapLoadUtils.close(responseC.f45164t);
                            }
                            client.f45084a.a();
                            this.mInputUri = this.mOutputUri;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        cVar = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    cVar = null;
                }
            } catch (Throwable th5) {
                th = th5;
                responseC = null;
                cVar = null;
                BitmapLoadUtils.close(kVar);
                BitmapLoadUtils.close(cVar);
                if (responseC != null) {
                    BitmapLoadUtils.close(responseC.f45164t);
                }
                client.f45084a.a();
                this.mInputUri = this.mOutputUri;
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    private boolean isContentUri(Uri uri) {
        return uri.getScheme().equals("content");
    }

    private boolean isDownloadUri(Uri uri) {
        String scheme = uri.getScheme();
        return scheme.equals("http") || scheme.equals(Constants.SCHEME);
    }

    private boolean isFileUri(Uri uri) {
        return uri.getScheme().equals("file");
    }

    private void processInputUri() throws Throwable {
        this.mInputUri.getScheme();
        if (isDownloadUri(this.mInputUri)) {
            downloadFile(this.mInputUri, this.mOutputUri);
        } else if (isContentUri(this.mInputUri)) {
            copyFile(this.mInputUri, this.mOutputUri);
        } else if (!isFileUri(this.mInputUri)) {
            throw new IllegalArgumentException(a.e("Invalid Uri scheme", this.mInputUri.getScheme()));
        }
    }

    @Override // android.os.AsyncTask
    public BitmapWorkerResult doInBackground(Void... voidArr) {
        Context context = this.mContext.get();
        if (context == null) {
            return new BitmapWorkerResult(new NullPointerException("context is null"));
        }
        if (this.mInputUri == null) {
            return new BitmapWorkerResult(new NullPointerException("Input Uri cannot be null"));
        }
        try {
            processInputUri();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inSampleSize = BitmapLoadUtils.calculateInSampleSize(options, this.mRequiredWidth, this.mRequiredHeight);
            boolean z11 = false;
            options.inJustDecodeBounds = false;
            Bitmap bitmapDecodeStream = null;
            while (!z11) {
                try {
                    InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(this.mInputUri);
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                        if (options.outWidth == -1 || options.outHeight == -1) {
                            BitmapWorkerResult bitmapWorkerResult = new BitmapWorkerResult(new IllegalArgumentException("Bounds for bitmap could not be retrieved from the Uri: [" + this.mInputUri + "]"));
                            BitmapLoadUtils.close(inputStreamOpenInputStream);
                            return bitmapWorkerResult;
                        }
                        BitmapLoadUtils.close(inputStreamOpenInputStream);
                        if (!checkSize(bitmapDecodeStream, options)) {
                            z11 = true;
                        }
                    } catch (Throwable th2) {
                        BitmapLoadUtils.close(inputStreamOpenInputStream);
                        throw th2;
                    }
                } catch (IOException e8) {
                    return new BitmapWorkerResult(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.mInputUri + "]", e8));
                } catch (OutOfMemoryError unused) {
                    options.inSampleSize *= 2;
                }
            }
            if (bitmapDecodeStream == null) {
                return new BitmapWorkerResult(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.mInputUri + "]"));
            }
            int exifOrientation = BitmapLoadUtils.getExifOrientation(context, this.mInputUri);
            int iExifToDegrees = BitmapLoadUtils.exifToDegrees(exifOrientation);
            int iExifToTranslation = BitmapLoadUtils.exifToTranslation(exifOrientation);
            ExifInfo exifInfo = new ExifInfo(exifOrientation, iExifToDegrees, iExifToTranslation);
            Matrix matrix = new Matrix();
            if (iExifToDegrees != 0) {
                matrix.preRotate(iExifToDegrees);
            }
            if (iExifToTranslation != 1) {
                matrix.postScale(iExifToTranslation, 1.0f);
            }
            return !matrix.isIdentity() ? new BitmapWorkerResult(BitmapLoadUtils.transformBitmap(bitmapDecodeStream, matrix), exifInfo) : new BitmapWorkerResult(bitmapDecodeStream, exifInfo);
        } catch (IOException | NullPointerException e10) {
            return new BitmapWorkerResult(e10);
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(BitmapWorkerResult bitmapWorkerResult) {
        Exception exc = bitmapWorkerResult.mBitmapWorkerException;
        if (exc == null) {
            this.mBitmapLoadCallback.onBitmapLoaded(bitmapWorkerResult.mBitmapResult, bitmapWorkerResult.mExifInfo, this.mInputUri, this.mOutputUri);
        } else {
            this.mBitmapLoadCallback.onFailure(exc);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class BitmapWorkerResult {
        Bitmap mBitmapResult;
        Exception mBitmapWorkerException;
        ExifInfo mExifInfo;

        public BitmapWorkerResult(Bitmap bitmap, ExifInfo exifInfo) {
            this.mBitmapResult = bitmap;
            this.mExifInfo = exifInfo;
        }

        public BitmapWorkerResult(Exception exc) {
            this.mBitmapWorkerException = exc;
        }
    }
}
