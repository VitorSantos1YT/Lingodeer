package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends z1.q implements y2.z {
    public float Q;
    public float R;
    public float S;
    public float T;
    public boolean U;

    @Override // y2.z
    public final w2.r0 b(w2.s0 s0Var, w2.p0 p0Var, long j11) {
        int iN0 = s0Var.n0(this.S) + s0Var.n0(this.Q);
        int iN1 = s0Var.n0(this.T) + s0Var.n0(this.R);
        w2.g1 g1VarB = p0Var.B(v3.b.i(j11, -iN0, -iN1));
        return s0Var.q0(v3.b.g(g1VarB.f54501a + iN0, j11), v3.b.f(g1VarB.f54502b + iN1, j11), ry.s.f50855a, new com.google.accompanist.permissions.a(28, this, g1VarB));
    }
}
