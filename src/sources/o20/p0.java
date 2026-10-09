package o20;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p0 extends RequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RequestBody f44540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaType f44541b;

    public p0(RequestBody requestBody, MediaType mediaType) {
        this.f44540a = requestBody;
        this.f44541b = mediaType;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.f44540a.contentLength();
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.f44541b;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(m00.j jVar) {
        this.f44540a.writeTo(jVar);
    }
}
