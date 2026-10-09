package okhttp3;

import m00.j;
import m00.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class RequestBody$Companion$toRequestBody$1 extends RequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaType f45150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f45151b;

    public RequestBody$Companion$toRequestBody$1(l lVar, MediaType mediaType) {
        this.f45150a = mediaType;
        this.f45151b = lVar;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.f45151b.e();
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.f45150a;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(j jVar) {
        jVar.Q0(this.f45151b);
    }
}
