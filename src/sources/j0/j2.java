package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 extends z1.q implements y2.z {
    public float Q;
    public float R;

    @Override // y2.z
    public final int E(y2.q0 q0Var, w2.p0 p0Var, int i11) {
        int iP = p0Var.p(i11);
        int iN0 = !Float.isNaN(this.Q) ? q0Var.n0(this.Q) : 0;
        return iP < iN0 ? iN0 : iP;
    }

    @Override // y2.z
    public final int L(y2.q0 q0Var, w2.p0 p0Var, int i11) {
        int iT = p0Var.t(i11);
        int iN0 = !Float.isNaN(this.Q) ? q0Var.n0(this.Q) : 0;
        return iT < iN0 ? iN0 : iT;
    }

    @Override // y2.z
    public final w2.r0 b(w2.s0 s0Var, w2.p0 p0Var, long j11) {
        int iJ;
        int i11;
        if (Float.isNaN(this.Q) || v3.a.j(j11) != 0) {
            iJ = v3.a.j(j11);
        } else {
            int iN0 = s0Var.n0(this.Q);
            iJ = v3.a.h(j11);
            if (iN0 < 0) {
                iN0 = 0;
            }
            if (iN0 <= iJ) {
                iJ = iN0;
            }
        }
        int iH = v3.a.h(j11);
        if (Float.isNaN(this.R) || v3.a.i(j11) != 0) {
            i11 = v3.a.i(j11);
        } else {
            int iN1 = s0Var.n0(this.R);
            i11 = v3.a.g(j11);
            int i12 = iN1 >= 0 ? iN1 : 0;
            if (i12 <= i11) {
                i11 = i12;
            }
        }
        w2.g1 g1VarB = p0Var.B(v3.b.a(iJ, iH, i11, v3.a.g(j11)));
        return s0Var.q0(g1VarB.f54501a, g1VarB.f54502b, ry.s.f50855a, new c1.i(g1VarB, 7));
    }

    @Override // y2.z
    public final int p(y2.q0 q0Var, w2.p0 p0Var, int i11) {
        int iW = p0Var.W(i11);
        int iN0 = !Float.isNaN(this.R) ? q0Var.n0(this.R) : 0;
        return iW < iN0 ? iN0 : iW;
    }

    @Override // y2.z
    public final int t(y2.q0 q0Var, w2.p0 p0Var, int i11) {
        int iB = p0Var.b(i11);
        int iN0 = !Float.isNaN(this.R) ? q0Var.n0(this.R) : 0;
        return iB < iN0 ? iN0 : iB;
    }
}
