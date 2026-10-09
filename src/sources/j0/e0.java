package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends z1.q implements y2.z {
    public b0 Q;
    public float R;

    @Override // y2.z
    public final w2.r0 b(w2.s0 s0Var, w2.p0 p0Var, long j11) {
        int iJ;
        int iH;
        int iG;
        int iG2;
        if (!v3.a.d(j11) || this.Q == b0.Vertical) {
            iJ = v3.a.j(j11);
            iH = v3.a.h(j11);
        } else {
            int iRound = Math.round(v3.a.h(j11) * this.R);
            int iJ2 = v3.a.j(j11);
            iJ = v3.a.h(j11);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!v3.a.c(j11) || this.Q == b0.Horizontal) {
            int i11 = v3.a.i(j11);
            iG = v3.a.g(j11);
            iG2 = i11;
        } else {
            int iRound2 = Math.round(v3.a.g(j11) * this.R);
            int i12 = v3.a.i(j11);
            iG2 = v3.a.g(j11);
            if (iRound2 < i12) {
                iRound2 = i12;
            }
            if (iRound2 <= iG2) {
                iG2 = iRound2;
            }
            iG = iG2;
        }
        w2.g1 g1VarB = p0Var.B(v3.b.a(iJ, iH, iG2, iG));
        return s0Var.q0(g1VarB.f54501a, g1VarB.f54502b, ry.s.f50855a, new c1.i(g1VarB, 4));
    }
}
