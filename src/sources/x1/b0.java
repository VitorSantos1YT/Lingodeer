package x1;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import l1.r1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements List, gz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f55648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55651d;

    public b0(p pVar, int i11, int i12) {
        this.f55648a = pVar;
        this.f55649b = i11;
        this.f55650c = q.f(pVar);
        this.f55651d = i12 - i11;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        b();
        int i11 = this.f55649b + this.f55651d;
        p pVar = this.f55648a;
        pVar.add(i11, obj);
        this.f55651d++;
        this.f55650c = q.f(pVar);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f55651d, collection);
    }

    public final void b() {
        if (q.f(this.f55648a) != this.f55650c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f55651d > 0) {
            b();
            int i11 = this.f55651d;
            int i12 = this.f55649b;
            p pVar = this.f55648a;
            pVar.e(i12, i11 + i12);
            this.f55651d = 0;
            this.f55650c = q.f(pVar);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
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

    @Override // java.util.List
    public final Object get(int i11) {
        b();
        q.a(i11, this.f55651d);
        return this.f55648a.get(this.f55649b + i11);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i11 = this.f55651d;
        int i12 = this.f55649b;
        Iterator it = hz.b.U(i12, i11 + i12).iterator();
        while (it.hasNext()) {
            int iNextInt = ((ry.w) it).nextInt();
            if (kotlin.jvm.internal.m.a(obj, this.f55648a.get(iNextInt))) {
                return iNextInt - i12;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f55651d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i11 = this.f55651d;
        int i12 = this.f55649b;
        for (int i13 = (i11 + i12) - 1; i13 >= i12; i13--) {
            if (kotlin.jvm.internal.m.a(obj, this.f55648a.get(i13))) {
                return i13 - i12;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z11 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z11) {
                    z11 = true;
                }
            }
            return z11;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i11;
        p1.c cVar;
        f fVarJ;
        boolean zB;
        b();
        p pVar = this.f55648a;
        int i12 = this.f55649b;
        int i13 = this.f55651d + i12;
        int size = pVar.size();
        do {
            synchronized (q.f55704a) {
                v vVar = pVar.f55703a;
                kotlin.jvm.internal.m.d(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v vVar2 = (v) l.h(vVar);
                i11 = vVar2.f55735d;
                cVar = vVar2.f55734c;
            }
            kotlin.jvm.internal.m.c(cVar);
            p1.f fVarG = cVar.g();
            fVarG.subList(i12, i13).retainAll(collection);
            p1.c cVarE = fVarG.e();
            if (kotlin.jvm.internal.m.a(cVarE, cVar)) {
                break;
            }
            v vVar3 = pVar.f55703a;
            kotlin.jvm.internal.m.d(vVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f55691c) {
                fVarJ = l.j();
                zB = q.b((v) l.w(vVar3, pVar, fVarJ), i11, cVarE, true);
            }
            l.n(fVarJ, pVar);
        } while (!zB);
        int size2 = size - pVar.size();
        if (size2 > 0) {
            this.f55650c = q.f(this.f55648a);
            this.f55651d -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i11, Object obj) {
        q.a(i11, this.f55651d);
        b();
        int i12 = i11 + this.f55649b;
        p pVar = this.f55648a;
        Object obj2 = pVar.set(i12, obj);
        this.f55650c = q.f(pVar);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f55651d;
    }

    @Override // java.util.List
    public final List subList(int i11, int i12) {
        if (!(i11 >= 0 && i11 <= i12 && i12 <= this.f55651d)) {
            r1.a("fromIndex or toIndex are out of bounds");
        }
        b();
        int i13 = this.f55649b;
        return new b0(this.f55648a, i11 + i13, i12 + i13);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i11) {
        b();
        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        wVar.f38359a = i11 - 1;
        return new ry.y(wVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.k.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i11, Collection collection) {
        b();
        int i12 = i11 + this.f55649b;
        p pVar = this.f55648a;
        boolean zAddAll = pVar.addAll(i12, collection);
        if (zAddAll) {
            this.f55651d = collection.size() + this.f55651d;
            this.f55650c = q.f(pVar);
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object remove(int i11) {
        b();
        int i12 = this.f55649b + i11;
        p pVar = this.f55648a;
        Object objRemove = pVar.remove(i12);
        this.f55651d--;
        this.f55650c = q.f(pVar);
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i11, Object obj) {
        b();
        int i12 = this.f55649b + i11;
        p pVar = this.f55648a;
        pVar.add(i12, obj);
        this.f55651d++;
        this.f55650c = q.f(pVar);
    }
}
