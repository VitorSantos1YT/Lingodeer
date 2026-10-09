package p1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends ry.e implements List, Collection, gz.a {
    @Override // ry.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // ry.a, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract c d(int i11, Object obj);

    public abstract c e(Object obj);

    public c f(Collection collection) {
        f fVarG = g();
        fVarG.addAll(collection);
        return fVarG.e();
    }

    public abstract f g();

    public abstract c h(b bVar);

    @Override // ry.e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract c j(int i11);

    public abstract c k(int i11, Object obj);

    @Override // ry.e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // ry.e, java.util.List
    public final List subList(int i11, int i12) {
        return new o1.a(this, i11, i12);
    }
}
