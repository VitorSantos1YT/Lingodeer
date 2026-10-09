package h1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class bb implements w2.q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f30054a;

    public bb(float f5) {
        this.f30054a = f5;
    }

    @Override // w2.q0
    public final w2.r0 e(w2.s0 s0Var, List list, long j11) {
        Object obj;
        Object obj2;
        float fE0 = s0Var.e0(this.f30054a);
        int i11 = 0;
        long jA = v3.a.a(0, 0, 0, 0, 10, j11);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj3 = list.get(i12);
            w2.p0 p0Var = (w2.p0) obj3;
            if (w2.a0.i(p0Var) != t4.Selector && w2.a0.i(p0Var) != t4.InnerCircle) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            arrayList2.add(((w2.p0) arrayList.get(i13)).B(jA));
        }
        int size3 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                obj = null;
                break;
            }
            obj = list.get(i14);
            if (w2.a0.i((w2.p0) obj) == t4.Selector) {
                break;
            }
            i14++;
        }
        w2.p0 p0Var2 = (w2.p0) obj;
        int size4 = list.size();
        while (true) {
            if (i11 >= size4) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i11);
            if (w2.a0.i((w2.p0) obj2) == t4.InnerCircle) {
                break;
            }
            i11++;
        }
        w2.p0 p0Var3 = (w2.p0) obj2;
        return s0Var.q0(v3.a.j(j11), v3.a.i(j11), ry.s.f50855a, new ab(p0Var2 != null ? p0Var2.B(jA) : null, arrayList2, p0Var3 != null ? p0Var3.B(jA) : null, j11, fE0, 6.2831855f / arrayList2.size()));
    }
}
