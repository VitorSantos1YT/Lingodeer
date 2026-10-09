package ad;

import a0.h0;
import w2.g1;
import w2.p0;
import w2.r0;
import w2.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends z1.q implements y2.z {
    public int Q;
    public int R;

    @Override // y2.z
    public final r0 b(s0 s0Var, p0 measurable, long j11) {
        long jA;
        kotlin.jvm.internal.m.f(measurable, "measurable");
        long jD = v3.b.d(j11, ff.h.b(this.Q, this.R));
        if (v3.a.g(j11) == Integer.MAX_VALUE && v3.a.h(j11) != Integer.MAX_VALUE) {
            int i11 = (int) (jD >> 32);
            int i12 = (this.R * i11) / this.Q;
            jA = v3.b.a(i11, i11, i12, i12);
        } else if (v3.a.h(j11) != Integer.MAX_VALUE || v3.a.g(j11) == Integer.MAX_VALUE) {
            int i13 = (int) (jD >> 32);
            int i14 = (int) (jD & 4294967295L);
            jA = v3.b.a(i13, i13, i14, i14);
        } else {
            int i15 = (int) (jD & 4294967295L);
            int i16 = (this.Q * i15) / this.R;
            jA = v3.b.a(i16, i16, i15, i15);
        }
        g1 g1VarB = measurable.B(jA);
        return s0Var.q0(g1VarB.f54501a, g1VarB.f54502b, ry.s.f50855a, new h0(g1VarB, 3));
    }
}
