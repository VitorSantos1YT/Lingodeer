package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 extends z1.q implements y2.z {
    public t1 Q;

    @Override // y2.z
    public final w2.r0 b(w2.s0 s0Var, w2.p0 p0Var, long j11) {
        float fB = this.Q.b(s0Var.getLayoutDirection());
        float fC = this.Q.c();
        float fD = this.Q.d(s0Var.getLayoutDirection());
        float fA = this.Q.a();
        float f5 = 0;
        if (!((v3.f.a(fA, f5) >= 0) & (v3.f.a(fB, f5) >= 0) & (v3.f.a(fC, f5) >= 0) & (v3.f.a(fD, f5) >= 0))) {
            k0.a.a("Padding must be non-negative");
        }
        int iN0 = s0Var.n0(fB);
        int iN1 = s0Var.n0(fD) + iN0;
        int iN2 = s0Var.n0(fC);
        int iN3 = s0Var.n0(fA) + iN2;
        w2.g1 g1VarB = p0Var.B(v3.b.i(j11, -iN1, -iN3));
        return s0Var.q0(v3.b.g(g1VarB.f54501a + iN1, j11), v3.b.f(g1VarB.f54502b + iN3, j11), ry.s.f50855a, new y0(g1VarB, iN0, iN2, 1));
    }
}
