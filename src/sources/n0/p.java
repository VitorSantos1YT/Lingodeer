package n0;

import f0.h1;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends z1.q implements x2.e, y2.z {
    public static final m T = new m();
    public q Q;
    public f0.a R;
    public h1 S;

    public final boolean T0(j jVar, int i11) {
        if (i11 == 5 || i11 == 6) {
            if (this.S == h1.Horizontal) {
                return false;
            }
        } else if (i11 == 3 || i11 == 4) {
            if (this.S == h1.Vertical) {
                return false;
            }
        } else if (i11 != 1 && i11 != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (U0(i11)) {
            if (jVar.f42960b >= this.Q.getItemCount() - 1) {
                return false;
            }
        } else if (jVar.f42959a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean U0(int i11) {
        if (i11 == 1) {
            return false;
        }
        if (i11 == 2) {
            return true;
        }
        if (i11 == 5) {
            return false;
        }
        if (i11 == 6) {
            return true;
        }
        if (i11 == 3) {
            int i12 = n.f42975a[y2.f.x(this).f56883c0.ordinal()];
            if (i12 == 1) {
                return false;
            }
            if (i12 == 2) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i11 != 4) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        int i13 = n.f42975a[y2.f.x(this).f56883c0.ordinal()];
        if (i13 == 1) {
            return true;
        }
        if (i13 == 2) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // x2.e
    public final ve.i X() {
        x2.i iVar = new x2.i(w2.f.f54483a);
        iVar.f55762e.setValue(this);
        return iVar;
    }

    @Override // y2.z
    public final w2.r0 b(w2.s0 s0Var, w2.p0 p0Var, long j11) {
        w2.g1 g1VarB = p0Var.B(j11);
        return s0Var.q0(g1VarB.f54501a, g1VarB.f54502b, ry.s.f50855a, new c1.i(g1VarB, 9));
    }
}
