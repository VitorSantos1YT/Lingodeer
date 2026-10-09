package tg;

import java.util.List;
import w2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements w2.q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f52268a = new e();

    @Override // w2.q0
    public final w2.r0 e(w2.s0 Layout, List measurables, long j11) {
        kotlin.jvm.internal.m.f(Layout, "$this$Layout");
        kotlin.jvm.internal.m.f(measurables, "measurables");
        w2.p0 p0Var = (w2.p0) measurables.get(0);
        w2.p0 p0Var2 = (w2.p0) measurables.get(1);
        int iP = p0Var.p(v3.a.g(j11));
        g1 g1VarB = p0Var2.B(v3.b.j(-iP, 0, 2, j11));
        int i11 = g1VarB.f54501a + iP;
        int i12 = g1VarB.f54502b;
        return Layout.q0(i11, i12, ry.s.f50855a, new mt.t0(p0Var.B(v3.a.a(0, iP, i12, i12, 1, j11)), g1VarB, iP, 1));
    }
}
