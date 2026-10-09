package d1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements w2.q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f22935a = new m0();

    @Override // w2.q0
    public final w2.r0 e(w2.s0 s0Var, List list, long j11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            w2.g1 g1VarB = ((w2.p0) list.get(i11)).B(j11);
            iMax = Math.max(iMax, g1VarB.f54501a);
            iMax2 = Math.max(iMax2, g1VarB.f54502b);
            arrayList.add(g1VarB);
        }
        return s0Var.q0(iMax, iMax2, ry.s.f50855a, new l0(0, arrayList));
    }
}
