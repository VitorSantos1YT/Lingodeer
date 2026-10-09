package b1;

import d1.z0;
import l1.k1;
import s0.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends z1.q implements y2.l, y2.r, y2.m {
    public e Q;
    public s0 R;
    public z0 S;
    public final k1 T = l1.t.B(null);

    public r(e eVar, s0 s0Var, z0 z0Var) {
        this.Q = eVar;
        this.R = s0Var;
        this.S = z0Var;
    }

    @Override // z1.q
    public final void L0() {
        e eVar = this.Q;
        if (eVar.f3773a != null) {
            i0.a.c("Expected textInputModifierNode to be null");
        }
        eVar.f3773a = this;
    }

    @Override // z1.q
    public final void M0() {
        this.Q.k(this);
    }

    @Override // y2.r
    public final void m(y2.k1 k1Var) {
        this.T.setValue(k1Var);
    }
}
