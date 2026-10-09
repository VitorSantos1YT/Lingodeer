package l0;

import g00.g1;
import jt.t0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends n0.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij.d f39112b = new ij.d(12);

    public h(fz.c cVar) {
        cVar.invoke(this);
    }

    public static void p(h hVar, String str, fz.f fVar, int i11) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        hVar.f39112b.b(1, new f(str != null ? new g1(str, 1) : null, new t0(24), new t1.d(new g(fVar, 0), true, -857469575)));
    }

    public static /* synthetic */ void r(h hVar, int i11, a0.e eVar, t1.d dVar, int i12) {
        if ((i12 & 2) != 0) {
            eVar = null;
        }
        hVar.q(i11, eVar, q.f39179a, dVar);
    }

    @Override // n0.l
    public final ij.d k() {
        return this.f39112b;
    }

    public final void q(int i11, fz.c cVar, fz.c cVar2, t1.d dVar) {
        this.f39112b.b(i11, new f(cVar, cVar2, dVar));
    }
}
