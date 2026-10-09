package o20;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z extends ResponseBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResponseBody f44623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m00.d0 f44624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f44625c;

    public z(ResponseBody responseBody) {
        this.f44623a = responseBody;
        this.f44624b = m00.b.c(new y(this, responseBody.source()));
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f44623a.close();
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        return this.f44623a.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        return this.f44623a.contentType();
    }

    @Override // okhttp3.ResponseBody
    public final m00.k source() {
        return this.f44624b;
    }
}
