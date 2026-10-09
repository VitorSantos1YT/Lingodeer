package okhttp3.internal.http;

import m00.d0;
import m00.k;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class RealResponseBody extends ResponseBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f45355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f45356c;

    public RealResponseBody(String str, long j11, d0 d0Var) {
        this.f45354a = str;
        this.f45355b = j11;
        this.f45356c = d0Var;
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        return this.f45355b;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        String str = this.f45354a;
        if (str == null) {
            return null;
        }
        MediaType.f45062e.getClass();
        return MediaType.Companion.b(str);
    }

    @Override // okhttp3.ResponseBody
    public final k source() {
        return this.f45356c;
    }
}
