package z3;

import a0.h0;
import java.util.ArrayList;
import java.util.List;
import w2.g1;
import w2.p0;
import w2.q0;
import w2.r0;
import w2.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f58754b = new e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f58755c = new e(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58756a;

    public /* synthetic */ e(int i11) {
        this.f58756a = i11;
    }

    @Override // w2.q0
    public final r0 e(s0 s0Var, List list, long j11) {
        switch (this.f58756a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int iJ = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    g1 g1VarB = ((p0) list.get(i12)).B(j11);
                    iJ = Math.max(iJ, g1VarB.f54501a);
                    i11 = Math.max(i11, g1VarB.f54502b);
                    arrayList.add(g1VarB);
                }
                if (list.isEmpty()) {
                    iJ = v3.a.j(j11);
                    i11 = v3.a.i(j11);
                }
                return s0Var.q0(iJ, i11, ry.s.f50855a, new a0.z(2, arrayList));
            default:
                int size2 = list.size();
                ry.s sVar = ry.s.f50855a;
                if (size2 == 0) {
                    return s0Var.q0(0, 0, sVar, c.f58746f);
                }
                if (size2 == 1) {
                    g1 g1VarB2 = ((p0) list.get(0)).B(j11);
                    return s0Var.q0(g1VarB2.f54501a, g1VarB2.f54502b, sVar, new h0(g1VarB2, 8));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i13 = 0; i13 < size3; i13++) {
                    g1 g1VarB3 = ((p0) list.get(i13)).B(j11);
                    iMax = Math.max(iMax, g1VarB3.f54501a);
                    iMax2 = Math.max(iMax2, g1VarB3.f54502b);
                    arrayList2.add(g1VarB3);
                }
                return s0Var.q0(iMax, iMax2, sVar, new a0.z(3, arrayList2));
        }
    }
}
