package c2;

import a0.b2;
import a0.j;
import kotlin.jvm.internal.m;
import se.p;
import y2.g2;
import y2.y;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends q implements g2, y {
    public g Q;
    public g R;
    public long S;

    @Override // z1.q
    public final void M0() {
        this.R = null;
        this.Q = null;
    }

    public final boolean T0(b2 b2Var) {
        g gVar = this.Q;
        if (gVar != null) {
            return gVar.T0(b2Var);
        }
        g gVar2 = this.R;
        if (gVar2 != null) {
            return gVar2.T0(b2Var);
        }
        return false;
    }

    public final void U0(b2 b2Var) {
        g gVar = this.R;
        if (gVar != null) {
            gVar.U0(b2Var);
            return;
        }
        g gVar2 = this.Q;
        if (gVar2 != null) {
            gVar2.U0(b2Var);
        }
    }

    public final void V0(b2 b2Var) {
        g gVar = this.R;
        if (gVar != null) {
            gVar.V0(b2Var);
        }
        g gVar2 = this.Q;
        if (gVar2 != null) {
            gVar2.V0(b2Var);
        }
        this.Q = null;
    }

    public final void W0(b2 b2Var) {
        g2 g2Var;
        g gVar;
        g gVar2 = this.Q;
        if (gVar2 == null || !p.K(gVar2, ub.a.V(b2Var))) {
            if (this.f58482a.P) {
                kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                y2.f.C(this, new j(yVar, this, b2Var, 3));
                g2Var = (g2) yVar.f38361a;
            } else {
                g2Var = null;
            }
            gVar = (g) g2Var;
        } else {
            gVar = gVar2;
        }
        if (gVar != null && gVar2 == null) {
            gVar.U0(b2Var);
            gVar.W0(b2Var);
            g gVar3 = this.R;
            if (gVar3 != null) {
                gVar3.V0(b2Var);
            }
        } else if (gVar == null && gVar2 != null) {
            g gVar4 = this.R;
            if (gVar4 != null) {
                gVar4.U0(b2Var);
                gVar4.W0(b2Var);
            }
            gVar2.V0(b2Var);
        } else if (!m.a(gVar, gVar2)) {
            if (gVar != null) {
                gVar.U0(b2Var);
                gVar.W0(b2Var);
            }
            if (gVar2 != null) {
                gVar2.V0(b2Var);
            }
        } else if (gVar != null) {
            gVar.W0(b2Var);
        } else {
            g gVar5 = this.R;
            if (gVar5 != null) {
                gVar5.W0(b2Var);
            }
        }
        this.Q = gVar;
    }

    public final void X0(b2 b2Var) {
        g gVar = this.R;
        if (gVar != null) {
            gVar.X0(b2Var);
            return;
        }
        g gVar2 = this.Q;
        if (gVar2 != null) {
            gVar2.X0(b2Var);
        }
    }

    @Override // y2.g2
    public final Object h() {
        return e.f6506a;
    }

    @Override // y2.y
    public final void l(long j11) {
        this.S = j11;
    }
}
