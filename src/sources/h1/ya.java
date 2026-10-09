package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ya extends z1.q implements y2.z {
    public h0.i Q;
    public boolean R;
    public boolean S;
    public b0.d T;
    public b0.d U;
    public float V;
    public float W;

    @Override // z1.q
    public final boolean I0() {
        return false;
    }

    @Override // z1.q
    public final void L0() {
        rz.e0.B(H0(), null, null, new gp.a(this, null, 5), 3);
    }

    @Override // y2.z
    public final w2.r0 b(w2.s0 s0Var, w2.p0 p0Var, long j11) {
        float f5;
        boolean z11 = (p0Var.b(v3.a.h(j11)) == 0 || p0Var.t(v3.a.g(j11)) == 0) ? false : true;
        if (this.S) {
            f5 = k1.h0.f37550i;
        } else {
            f5 = (z11 || this.R) ? r9.f30995a : r9.f30996b;
        }
        float fE0 = s0Var.e0(f5);
        b0.d dVar = this.U;
        int iFloatValue = (int) (dVar != null ? ((Number) dVar.d()).floatValue() : fE0);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            v3.i.a("width and height must be >= 0");
        }
        w2.g1 g1VarB = p0Var.B(v3.b.h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fE1 = s0Var.e0((r9.f30998d - s0Var.T(fE0)) / 2.0f);
        float fE2 = s0Var.e0((r9.f30997c - r9.f30995a) - r9.f30999e);
        boolean z12 = this.S;
        if (z12 && this.R) {
            fE1 = fE2 - s0Var.e0(k1.h0.f37556p);
        } else if (z12 && !this.R) {
            fE1 = s0Var.e0(k1.h0.f37556p);
        } else if (this.R) {
            fE1 = fE2;
        }
        b0.d dVar2 = this.U;
        vy.d dVar3 = null;
        Float f11 = dVar2 != null ? (Float) dVar2.f3474e.getValue() : null;
        if (f11 == null || f11.floatValue() != fE0) {
            rz.e0.B(H0(), null, null, new wa(this, fE0, dVar3, 0), 3);
        }
        b0.d dVar4 = this.T;
        Float f12 = dVar4 != null ? (Float) dVar4.f3474e.getValue() : null;
        if (f12 == null || f12.floatValue() != fE1) {
            rz.e0.B(H0(), null, null, new wa(this, fE1, dVar3, 1), 3);
        }
        if (Float.isNaN(this.W) && Float.isNaN(this.V)) {
            this.W = fE0;
            this.V = fE1;
        }
        return s0Var.q0(iFloatValue, iFloatValue, ry.s.f50855a, new xa(g1VarB, this, fE1));
    }
}
