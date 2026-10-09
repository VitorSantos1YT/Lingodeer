package wt;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r {
    public static s a(int i11) {
        Object next;
        Iterator<E> it = s.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((s) next).b() != i11);
        s sVar = (s) next;
        return sVar == null ? s.NEW : sVar;
    }
}
