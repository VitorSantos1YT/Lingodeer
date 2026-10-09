package okhttp3.internal.http;

import m00.b;
import m00.c0;
import m00.j;
import m00.t;
import ns.o;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class GzipRequestBody extends RequestBody {
    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return -1L;
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        throw null;
    }

    @Override // okhttp3.RequestBody
    public final boolean isOneShot() {
        throw null;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(j jVar) {
        c0 c0VarB = b.b(new t(jVar));
        try {
            throw null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                o.m(c0VarB, th2);
                throw th3;
            }
        }
    }
}
