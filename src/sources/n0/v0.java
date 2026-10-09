package n0;

import f0.h1;
import y2.b2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends z1.q implements b2 {
    public fz.a Q;
    public r0 R;
    public h1 S;
    public boolean T;
    public g3.l U;
    public final t0 V = new t0(this, 0);
    public t0 W;

    public v0(fz.a aVar, r0 r0Var, h1 h1Var, boolean z11) {
        this.Q = aVar;
        this.R = r0Var;
        this.S = h1Var;
        this.T = z11;
        T0();
    }

    @Override // z1.q
    public final boolean I0() {
        return false;
    }

    public final void T0() {
        this.U = new g3.l(new u0(this, 0), new u0(this, 1));
        this.W = this.T ? new t0(this, 1) : null;
    }

    @Override // y2.b2
    public final void i0(g3.b0 b0Var) {
        g3.z.f(b0Var);
        b0Var.b(g3.x.M, this.V);
        if (this.S == h1.Vertical) {
            g3.l lVar = this.U;
            if (lVar == null) {
                kotlin.jvm.internal.m.n("scrollAxisRange");
                throw null;
            }
            g3.a0 a0Var = g3.x.f28730v;
            mz.j jVar = g3.z.f28737a[13];
            b0Var.b(a0Var, lVar);
        } else {
            g3.l lVar2 = this.U;
            if (lVar2 == null) {
                kotlin.jvm.internal.m.n("scrollAxisRange");
                throw null;
            }
            g3.a0 a0Var2 = g3.x.f28729u;
            mz.j jVar2 = g3.z.f28737a[12];
            b0Var.b(a0Var2, lVar2);
        }
        t0 t0Var = this.W;
        if (t0Var != null) {
            b0Var.b(g3.n.f28671f, new g3.a(null, t0Var));
        }
        b0Var.b(g3.n.C, new g3.a(null, new a0.o0(new u0(this, 2), 10)));
        g3.d dVarE = this.R.e();
        g3.a0 a0Var3 = g3.x.f28715f;
        mz.j jVar3 = g3.z.f28737a[23];
        b0Var.b(a0Var3, dVarE);
    }
}
