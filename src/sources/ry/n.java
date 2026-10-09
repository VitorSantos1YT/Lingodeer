package ry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n extends ns.o {
    public static int W(Iterable iterable, int i11) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i11;
    }

    public static ArrayList X(Iterable iterable) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m.d0(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }
}
