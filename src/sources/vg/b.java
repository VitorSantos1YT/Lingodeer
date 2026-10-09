package vg;

import java.util.List;
import l1.b1;
import ry.s;
import w2.g1;
import w2.p0;
import w2.q0;
import w2.r0;
import w2.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f54018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f54019b;

    public b(long j11, b1 b1Var) {
        this.f54018a = j11;
        this.f54019b = b1Var;
    }

    @Override // w2.q0
    public final r0 e(s0 Layout, List measurables, long j11) {
        v3.l lVar;
        kotlin.jvm.internal.m.f(Layout, "$this$Layout");
        kotlin.jvm.internal.m.f(measurables, "measurables");
        p0 p0Var = (p0) ry.m.Q0(measurables);
        s sVar = s.f50855a;
        if (p0Var == null) {
            return Layout.q0(0, 0, sVar, new st.a(27));
        }
        g1 g1VarB = p0Var.B(this.f54018a);
        b1 b1Var = this.f54019b;
        v3.l lVar2 = (v3.l) b1Var.getValue();
        if (lVar2 == null || g1VarB.f54501a != ((int) (lVar2.f53498a >> 32)) || (lVar = (v3.l) b1Var.getValue()) == null || g1VarB.f54502b != ((int) (lVar.f53498a & 4294967295L))) {
            b1Var.setValue(new v3.l((((long) g1VarB.f54502b) & 4294967295L) | (((long) g1VarB.f54501a) << 32)));
        }
        return Layout.q0(g1VarB.f54501a, g1VarB.f54502b, sVar, new c1.i(g1VarB, 11));
    }
}
