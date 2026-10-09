package n3;

import hh.p0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f43172a;

    public r(q... qVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (qVarArr.length > 0) {
            q qVar = qVarArr[0];
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() != 1) {
                throw new IllegalArgumentException(p0.o(p0.q("'", str, "' must be unique. Actual [ ["), ry.m.y0(list, null, null, null, null, 63), ']').toString());
            }
            ry.m.d0(arrayList, list);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f43172a = arrayList2;
        if (arrayList2.size() > 0) {
            throw p0.e(0, arrayList2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return kotlin.jvm.internal.m.a(this.f43172a, ((r) obj).f43172a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f43172a.hashCode();
    }
}
