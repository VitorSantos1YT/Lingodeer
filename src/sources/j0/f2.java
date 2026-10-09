package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends z1.q implements y2.z {
    public float Q;
    public float R;
    public float S;
    public float T;
    public boolean U;

    @Override // y2.z
    public final int E(y2.q0 q0Var, w2.p0 p0Var, int i11) {
        long jT0 = T0(q0Var);
        if (v3.a.f(jT0)) {
            return v3.a.h(jT0);
        }
        if (!this.U) {
            i11 = v3.b.f(i11, jT0);
        }
        return v3.b.g(p0Var.p(i11), jT0);
    }

    @Override // y2.z
    public final int L(y2.q0 q0Var, w2.p0 p0Var, int i11) {
        long jT0 = T0(q0Var);
        if (v3.a.f(jT0)) {
            return v3.a.h(jT0);
        }
        if (!this.U) {
            i11 = v3.b.f(i11, jT0);
        }
        return v3.b.g(p0Var.t(i11), jT0);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    public final long T0(w2.s0 s0Var) {
        int iN0;
        int iN1;
        int iN2;
        int i11 = 0;
        if (Float.isNaN(this.S)) {
            iN0 = Integer.MAX_VALUE;
        } else {
            iN0 = s0Var.n0(this.S);
            if (iN0 < 0) {
                iN0 = 0;
            }
        }
        if (Float.isNaN(this.T)) {
            iN1 = Integer.MAX_VALUE;
        } else {
            iN1 = s0Var.n0(this.T);
            if (iN1 < 0) {
                iN1 = 0;
            }
        }
        if (Float.isNaN(this.Q)) {
            iN2 = 0;
        } else {
            iN2 = s0Var.n0(this.Q);
            if (iN2 < 0) {
                iN2 = 0;
            }
            if (iN2 > iN0) {
                iN2 = iN0;
            }
            if (iN2 == Integer.MAX_VALUE) {
                iN2 = 0;
            }
        }
        if (!Float.isNaN(this.R)) {
            int iN3 = s0Var.n0(this.R);
            if (iN3 < 0) {
                iN3 = 0;
            }
            if (iN3 > iN1) {
                iN3 = iN1;
            }
            if (iN3 != Integer.MAX_VALUE) {
                i11 = iN3;
            }
        }
        return v3.b.a(iN2, iN0, i11, iN1);
    }

    @Override // y2.z
    public final w2.r0 b(w2.s0 s0Var, w2.p0 p0Var, long j11) {
        int iJ;
        int iH;
        int i11;
        int iG;
        long jA;
        long jT0 = T0(s0Var);
        if (this.U) {
            jA = v3.b.e(j11, jT0);
        } else {
            if (Float.isNaN(this.Q)) {
                iJ = v3.a.j(j11);
                int iH2 = v3.a.h(jT0);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = v3.a.j(jT0);
            }
            if (Float.isNaN(this.S)) {
                iH = v3.a.h(j11);
                int iJ2 = v3.a.j(jT0);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = v3.a.h(jT0);
            }
            if (Float.isNaN(this.R)) {
                i11 = v3.a.i(j11);
                int iG2 = v3.a.g(jT0);
                if (i11 > iG2) {
                    i11 = iG2;
                }
            } else {
                i11 = v3.a.i(jT0);
            }
            if (Float.isNaN(this.T)) {
                iG = v3.a.g(j11);
                int i12 = v3.a.i(jT0);
                if (iG < i12) {
                    iG = i12;
                }
            } else {
                iG = v3.a.g(jT0);
            }
            jA = v3.b.a(iJ, iH, i11, iG);
        }
        w2.g1 g1VarB = p0Var.B(jA);
        return s0Var.q0(g1VarB.f54501a, g1VarB.f54502b, ry.s.f50855a, new c1.i(g1VarB, 6));
    }

    @Override // y2.z
    public final int p(y2.q0 q0Var, w2.p0 p0Var, int i11) {
        long jT0 = T0(q0Var);
        if (v3.a.e(jT0)) {
            return v3.a.g(jT0);
        }
        if (!this.U) {
            i11 = v3.b.g(i11, jT0);
        }
        return v3.b.f(p0Var.W(i11), jT0);
    }

    @Override // y2.z
    public final int t(y2.q0 q0Var, w2.p0 p0Var, int i11) {
        long jT0 = T0(q0Var);
        if (v3.a.e(jT0)) {
            return v3.a.g(jT0);
        }
        if (!this.U) {
            i11 = v3.b.g(i11, jT0);
        }
        return v3.b.f(p0Var.b(i11), jT0);
    }
}
