package okhttp3;

import java.io.File;
import java.io.FileInputStream;
import kotlin.jvm.internal.m;
import m00.d;
import m00.j;
import m00.k0;
import ns.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class RequestBody$Companion$asRequestBody$1 extends RequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaType f45145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f45146b;

    public RequestBody$Companion$asRequestBody$1(MediaType mediaType, File file) {
        this.f45145a = mediaType;
        this.f45146b = file;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.f45146b.length();
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.f45145a;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(j jVar) {
        File file = this.f45146b;
        m.f(file, "<this>");
        d dVar = new d(new FileInputStream(file), k0.f40719d);
        try {
            jVar.m0(dVar);
            dVar.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                o.m(dVar, th2);
                throw th3;
            }
        }
    }
}
