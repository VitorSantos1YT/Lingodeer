package y;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Collection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f56676a;

    public d(e eVar) {
        this.f56676a = eVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f56676a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f56676a.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f56676a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a(this.f56676a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f56676a;
        int iA = eVar.a(obj);
        if (iA < 0) {
            return false;
        }
        eVar.h(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.f56676a;
        int i11 = eVar.f56767c;
        int i12 = 0;
        boolean z11 = false;
        while (i12 < i11) {
            if (collection.contains(eVar.j(i12))) {
                eVar.h(i12);
                i12--;
                i11--;
                z11 = true;
            }
            i12++;
        }
        return z11;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f56676a;
        int i11 = eVar.f56767c;
        int i12 = 0;
        boolean z11 = false;
        while (i12 < i11) {
            if (!collection.contains(eVar.j(i12))) {
                eVar.h(i12);
                i12--;
                i11--;
                z11 = true;
            }
            i12++;
        }
        return z11;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f56676a.f56767c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        e eVar = this.f56676a;
        int i11 = eVar.f56767c;
        Object[] objArr = new Object[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = eVar.j(i12);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f56676a;
        int i11 = eVar.f56767c;
        if (objArr.length < i11) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i11);
        }
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = eVar.j(i12);
        }
        if (objArr.length > i11) {
            objArr[i11] = null;
        }
        return objArr;
    }
}
