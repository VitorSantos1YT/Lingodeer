package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 extends z1.q implements y2.z {
    public b0 Q;
    public fz.e R;

    @Override // y2.z
    public final w2.r0 b(w2.s0 s0Var, w2.p0 p0Var, long j11) {
        w2.g1 g1VarB = p0Var.B(v3.b.a(this.Q != b0.Vertical ? 0 : v3.a.j(j11), v3.a.h(j11), this.Q == b0.Horizontal ? v3.a.i(j11) : 0, v3.a.g(j11)));
        int iL = hz.b.l(g1VarB.f54501a, v3.a.j(j11), v3.a.h(j11));
        int iL2 = hz.b.l(g1VarB.f54502b, v3.a.i(j11), v3.a.g(j11));
        return s0Var.q0(iL, iL2, ry.s.f50855a, new fu.h0(this, iL, g1VarB, iL2, s0Var));
    }
}
