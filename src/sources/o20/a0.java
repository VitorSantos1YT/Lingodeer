package o20;

import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends ResponseBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaType f44476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f44477b;

    public a0(MediaType mediaType, long j11) {
        this.f44476a = mediaType;
        this.f44477b = j11;
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        return this.f44477b;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        return this.f44476a;
    }

    @Override // okhttp3.ResponseBody
    public final m00.k source() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
