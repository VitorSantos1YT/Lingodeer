package rt;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q8 {
    public static r8 a(int i11) {
        Object next;
        Iterator<E> it = r8.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((r8) next).b() != i11);
        r8 r8Var = (r8) next;
        return r8Var == null ? r8.COMPREHENSIVE : r8Var;
    }
}
