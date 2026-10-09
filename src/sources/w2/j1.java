package w2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends y2.f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j1 f54530b = new j1("Undefined intrinsics block and it is required");

    @Override // w2.q0
    public final r0 e(s0 s0Var, List list, long j11) {
        int size = list.size();
        ry.s sVar = ry.s.f50855a;
        if (size == 0) {
            return s0Var.q0(v3.a.j(j11), v3.a.i(j11), sVar, h1.f54512c);
        }
        if (size == 1) {
            g1 g1VarB = ((p0) list.get(0)).B(j11);
            return s0Var.q0(v3.b.g(g1VarB.f54501a, j11), v3.b.f(g1VarB.f54502b, j11), sVar, new a0.h0(g1VarB, 6));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i11 = 0; i11 < size2; i11++) {
            g1 g1VarB2 = ((p0) list.get(i11)).B(j11);
            iMax = Math.max(g1VarB2.f54501a, iMax);
            iMax2 = Math.max(g1VarB2.f54502b, iMax2);
            arrayList.add(g1VarB2);
        }
        return s0Var.q0(v3.b.g(iMax, j11), v3.b.f(iMax2, j11), sVar, new a0.z(1, arrayList));
    }
}
