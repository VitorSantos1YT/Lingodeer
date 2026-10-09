package com.alibaba.sdk.android.oss.network;

import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import java.io.InputStream;
import m00.b;
import m00.d;
import m00.j;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ProgressTouchableRequestBody<T extends OSSRequest> extends RequestBody {
    private static final int SEGMENT_SIZE = 2048;
    private OSSProgressCallback callback;
    private long contentLength;
    private String contentType;
    private InputStream inputStream;
    private T request;

    public ProgressTouchableRequestBody(InputStream inputStream, long j11, String str, ExecutionContext executionContext) {
        this.inputStream = inputStream;
        this.contentType = str;
        this.contentLength = j11;
        this.callback = executionContext.getProgressCallback();
        this.request = (T) executionContext.getRequest();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        String str = this.contentType;
        MediaType.f45062e.getClass();
        return MediaType.Companion.b(str);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(j jVar) {
        d dVarI = b.i(this.inputStream);
        long j11 = 0;
        while (true) {
            long j12 = this.contentLength;
            if (j11 >= j12) {
                break;
            }
            long j13 = dVarI.read(jVar.w(), Math.min(j12 - j11, 2048L));
            if (j13 == -1) {
                break;
            }
            long j14 = j11 + j13;
            jVar.flush();
            OSSProgressCallback oSSProgressCallback = this.callback;
            if (oSSProgressCallback != null && j14 != 0) {
                oSSProgressCallback.onProgress(this.request, j14, this.contentLength);
            }
            j11 = j14;
        }
        dVarI.close();
    }
}
