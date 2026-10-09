package y0;

import d1.q0;
import d1.r0;
import d1.s0;
import l1.g0;
import l1.t;
import rz.z1;
import w2.x;
import y2.l;
import y2.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends n implements l, z0.d {
    public o20.i S;
    public r0 T;
    public s0 U;
    public q0 V;
    public z1 W;
    public final g0 X = t.s(new xa.a(this, 7));
    public f2.c Y = f2.c.f26571e;

    public k(o20.i iVar, r0 r0Var, s0 s0Var, q0 q0Var) {
        this.S = iVar;
        this.T = r0Var;
        this.U = s0Var;
        this.V = q0Var;
    }

    @Override // z1.q
    public final void L0() {
        this.S.f44522b = this;
    }

    @Override // z1.q
    public final void M0() {
        this.S.f44522b = null;
    }

    @Override // z0.d
    public final v0.c R() {
        return (v0.c) this.X.getValue();
    }

    @Override // z0.d
    public final long h0(x xVar) {
        return l0(xVar).d();
    }

    @Override // z0.d
    public final f2.c l0(x xVar) {
        if (!this.P) {
            return this.Y;
        }
        f2.c cVar = (f2.c) this.V.invoke(xVar);
        this.Y = cVar;
        return cVar;
    }
}
