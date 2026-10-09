package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e5 extends z1.q implements y2.l, y2.z {
    @Override // y2.z
    public final w2.r0 b(w2.s0 s0Var, w2.p0 p0Var, long j11) {
        float f5 = ((v3.f) y2.f.i(this, s4.f31053a)).f53489a;
        float f11 = 0;
        if (f5 < f11) {
            f5 = f11;
        }
        w2.g1 g1VarB = p0Var.B(j11);
        boolean z11 = this.P && !Float.isNaN(f5) && v3.f.a(f5, f11) > 0;
        int iN0 = Float.isNaN(f5) ? 0 : s0Var.n0(f5);
        int iMax = z11 ? Math.max(g1VarB.f54501a, iN0) : g1VarB.f54501a;
        int iMax2 = z11 ? Math.max(g1VarB.f54502b, iN0) : g1VarB.f54502b;
        return s0Var.q0(iMax, iMax2, ry.s.f50855a, new d5(iMax, iMax2, g1VarB));
    }
}
