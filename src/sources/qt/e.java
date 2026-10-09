package qt;

import java.util.Iterator;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {
    public static f a(int i11) {
        Object next;
        Iterator<E> it = f.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((f) next).b() != i11);
        f fVar = (f) next;
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalArgumentException(p.j(i11, "未知的题型: "));
    }
}
