package okhttp3.internal.cache;

import kotlin.jvm.internal.m;
import m00.a0;
import m00.h0;
import m00.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class DiskLruCache$fileSystem$1 extends p {
    @Override // m00.p, m00.o
    public final h0 x(a0 file) {
        m.f(file, "file");
        a0 a0VarB = file.b();
        if (a0VarB != null) {
            c(a0VarB);
        }
        return super.x(file);
    }
}
