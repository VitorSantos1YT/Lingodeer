package mt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u0 implements w2.q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f41936a = new u0();

    @Override // w2.q0
    public final w2.r0 e(w2.s0 Layout, List measurables, long j11) {
        kotlin.jvm.internal.m.f(Layout, "$this$Layout");
        kotlin.jvm.internal.m.f(measurables, "measurables");
        long jA = v3.a.a(0, 0, 0, 0, 10, j11);
        w2.g1 g1VarB = ((w2.p0) measurables.get(0)).B(jA);
        w2.g1 g1VarB2 = ((w2.p0) measurables.get(1)).B(jA);
        int iL = hz.b.l(Math.max(g1VarB.f54501a, g1VarB2.f54501a), v3.a.j(j11), v3.a.h(j11));
        int iL2 = hz.b.l((g1VarB.f54502b * 2) + g1VarB2.f54502b, v3.a.i(j11), v3.a.g(j11));
        return Layout.q0(iL, iL2, ry.s.f50855a, new t0(g1VarB, g1VarB2, iL2, 0));
    }
}
