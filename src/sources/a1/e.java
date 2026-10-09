package a1;

import e2.b0;
import e2.g;
import e2.x;
import e2.z;
import s2.g0;
import s2.l;
import s2.m;
import s2.m0;
import y2.e2;
import y2.n;
import y2.p;
import y2.y1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends n implements y1, g, x {
    public fz.a S;
    public boolean T;
    public final m0 U;

    public e(fz.a aVar) {
        this.S = aVar;
        d dVar = new d(this, 0);
        l lVar = g0.f51302a;
        m0 m0Var = new m0(null, null, null, dVar);
        T0(m0Var);
        this.U = m0Var;
    }

    @Override // y2.y1
    public final void G() {
        this.U.G();
    }

    @Override // y2.y1
    public final long k() {
        p pVar = b.f270a;
        v3.c cVar = y2.f.x(this).f56881b0;
        pVar.getClass();
        int i11 = e2.f56852b;
        return y2.d.d(cVar.n0(pVar.f56985a), cVar.n0(pVar.f56986b), cVar.n0(pVar.f56987c), cVar.n0(pVar.f56988d));
    }

    @Override // y2.y1
    public final void q(l lVar, m mVar, long j11) {
        this.U.q(lVar, mVar, j11);
    }

    @Override // e2.g
    public final void u(z zVar) {
        this.T = ((b0) zVar).a();
    }
}
