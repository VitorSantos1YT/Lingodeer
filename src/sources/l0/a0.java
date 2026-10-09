package l0;

import l1.b3;
import w2.g1;
import w2.p0;
import w2.r0;
import w2.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends z1.q implements y2.z {
    public float Q;
    public b3 R;
    public b3 S;

    @Override // y2.z
    public final r0 b(s0 s0Var, p0 p0Var, long j11) {
        b3 b3Var = this.R;
        int iRound = (b3Var == null || ((Number) b3Var.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) b3Var.getValue()).floatValue() * this.Q);
        b3 b3Var2 = this.S;
        int iRound2 = (b3Var2 == null || ((Number) b3Var2.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) b3Var2.getValue()).floatValue() * this.Q);
        int iJ = iRound != Integer.MAX_VALUE ? iRound : v3.a.j(j11);
        int i11 = iRound2 != Integer.MAX_VALUE ? iRound2 : v3.a.i(j11);
        if (iRound == Integer.MAX_VALUE) {
            iRound = v3.a.h(j11);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = v3.a.g(j11);
        }
        g1 g1VarB = p0Var.B(v3.b.a(iJ, iRound, i11, iRound2));
        return s0Var.q0(g1VarB.f54501a, g1VarB.f54502b, ry.s.f50855a, new c1.i(g1VarB, 8));
    }
}
