package y2;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements List, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f57002c;

    public s(t tVar, int i11, int i12) {
        this.f57002c = tVar;
        this.f57000a = i11;
        this.f57001b = i12;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i11, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i11, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof z1.q) && indexOf((z1.q) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((z1.q) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        Object objF = this.f57002c.f57003a.f(i11 + this.f57000a);
        kotlin.jvm.internal.m.d(objF, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (z1.q) objF;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof z1.q)) {
            return -1;
        }
        z1.q qVar = (z1.q) obj;
        int i11 = this.f57000a;
        int i12 = this.f57001b;
        if (i11 <= i12) {
            int i13 = i11;
            while (!kotlin.jvm.internal.m.a(this.f57002c.f57003a.f(i13), qVar)) {
                if (i13 != i12) {
                    i13++;
                }
            }
            return i13 - i11;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i11 = this.f57000a;
        return new sy.a(this.f57002c, i11, i11, this.f57001b);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof z1.q)) {
            return -1;
        }
        z1.q qVar = (z1.q) obj;
        int i11 = this.f57001b;
        int i12 = this.f57000a;
        if (i12 <= i11) {
            while (!kotlin.jvm.internal.m.a(this.f57002c.f57003a.f(i11), qVar)) {
                if (i11 != i12) {
                    i11--;
                }
            }
            return i11 - i12;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i11 = this.f57000a;
        return new sy.a(this.f57002c, i11, i11, this.f57001b);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f57001b - this.f57000a;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i11, int i12) {
        int i13 = this.f57000a;
        return new s(this.f57002c, i11 + i13, i13 + i12);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i11) {
        int i12 = this.f57000a;
        int i13 = this.f57001b;
        return new sy.a(this.f57002c, i11 + i12, i12, i13);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.k.b(this, objArr);
    }
}
