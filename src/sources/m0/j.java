package m0;

import bt.e6;
import jt.t0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends n0.l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k9.q f40562e = new k9.q(11);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f40563b = new v(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ij.d f40564c = new ij.d(12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40565d;

    public j(fz.c cVar) {
        cVar.invoke(this);
    }

    public static void p(j jVar, fz.c cVar, t1.d dVar, int i11) {
        if ((i11 & 2) != 0) {
            cVar = null;
        }
        jVar.f40564c.b(1, new h(null, cVar != null ? new e6(cVar, 9) : f40562e, new t0(24), new t1.d(new i(dVar, 0), true, -291643851)));
        if (cVar != null) {
            jVar.f40565d = true;
        }
    }

    @Override // n0.l
    public final ij.d k() {
        return this.f40564c;
    }

    public final void q(int i11, av.r rVar, es.c cVar, fz.c cVar2, t1.d dVar) {
        this.f40564c.b(i11, new h(rVar, cVar == null ? f40562e : cVar, cVar2, dVar));
        if (cVar != null) {
            this.f40565d = true;
        }
    }
}
