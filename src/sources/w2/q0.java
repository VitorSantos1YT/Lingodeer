package w2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface q0 {
    default int a(s sVar, List list, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new k((p0) list.get(i12), t.Max, u.Height, 0));
        }
        return e(new w(sVar, sVar.getLayoutDirection()), arrayList, v3.b.b(i11, 0, 13)).f();
    }

    r0 e(s0 s0Var, List list, long j11);

    default int f(s sVar, List list, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new k((p0) list.get(i12), t.Min, u.Width, 0));
        }
        return e(new w(sVar, sVar.getLayoutDirection()), arrayList, v3.b.b(0, i11, 7)).h();
    }

    default int h(s sVar, List list, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new k((p0) list.get(i12), t.Max, u.Width, 0));
        }
        return e(new w(sVar, sVar.getLayoutDirection()), arrayList, v3.b.b(0, i11, 7)).h();
    }

    default int i(s sVar, List list, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new k((p0) list.get(i12), t.Min, u.Height, 0));
        }
        return e(new w(sVar, sVar.getLayoutDirection()), arrayList, v3.b.b(i11, 0, 13)).f();
    }
}
