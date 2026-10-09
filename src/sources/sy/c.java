package sy;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.m;
import mf.sOm.txBUGYhC;
import nv.p;
import ry.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends ry.g implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f51932d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f51933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f51935c;

    static {
        c cVar = new c(0);
        cVar.f51935c = true;
        f51932d = cVar;
    }

    public c(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f51933a = new Object[i11];
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f51935c) {
            return new i(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        int i11 = this.f51934b;
        ((AbstractList) this).modCount++;
        j(i11, 1);
        this.f51933a[i11] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        m.f(elements, "elements");
        h();
        int size = elements.size();
        f(this.f51934b, elements, size);
        return size > 0;
    }

    @Override // ry.g
    public final int b() {
        return this.f51934b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        l(0, this.f51934b);
    }

    @Override // ry.g
    public final Object d(int i11) {
        h();
        int i12 = this.f51934b;
        if (i11 < 0 || i11 >= i12) {
            throw new IndexOutOfBoundsException(p.p("index: ", i11, i12, ", size: "));
        }
        return k(i11);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f51933a;
            int i11 = this.f51934b;
            if (i11 == list.size()) {
                for (int i12 = 0; i12 < i11; i12++) {
                    if (m.a(objArr[i12], list.get(i12))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i11, Collection collection, int i12) {
        ((AbstractList) this).modCount++;
        j(i11, i12);
        Iterator it = collection.iterator();
        for (int i13 = 0; i13 < i12; i13++) {
            this.f51933a[i11 + i13] = it.next();
        }
    }

    public final void g(int i11, Object obj) {
        ((AbstractList) this).modCount++;
        j(i11, 1);
        this.f51933a[i11] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        int i12 = this.f51934b;
        if (i11 < 0 || i11 >= i12) {
            throw new IndexOutOfBoundsException(p.p("index: ", i11, i12, ", size: "));
        }
        return this.f51933a[i11];
    }

    public final void h() {
        if (this.f51935c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f51933a;
        int i11 = this.f51934b;
        int iHashCode = 1;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = objArr[i12];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i11 = 0; i11 < this.f51934b; i11++) {
            if (m.a(this.f51933a[i11], obj)) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f51934b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i11, int i12) {
        int i13 = this.f51934b + i12;
        if (i13 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f51933a;
        if (i13 > objArr.length) {
            int length = objArr.length;
            int i14 = length + (length >> 1);
            if (i14 - i13 < 0) {
                i14 = i13;
            }
            if (i14 - 2147483639 > 0) {
                i14 = i13 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i14);
            m.e(objArrCopyOf, "copyOf(...)");
            this.f51933a = objArrCopyOf;
        }
        Object[] objArr2 = this.f51933a;
        l.G(i11 + i12, i11, this.f51934b, objArr2, objArr2);
        this.f51934b += i12;
    }

    public final Object k(int i11) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f51933a;
        Object obj = objArr[i11];
        l.G(i11, i11 + 1, this.f51934b, objArr, objArr);
        Object[] objArr2 = this.f51933a;
        int i12 = this.f51934b - 1;
        m.f(objArr2, "<this>");
        objArr2[i12] = null;
        this.f51934b--;
        return obj;
    }

    public final void l(int i11, int i12) {
        if (i12 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f51933a;
        l.G(i11, i11 + i12, this.f51934b, objArr, objArr);
        Object[] objArr2 = this.f51933a;
        int i13 = this.f51934b;
        ew.a.A(i13 - i12, i13, objArr2);
        this.f51934b -= i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i11 = this.f51934b - 1; i11 >= 0; i11--) {
            if (m.a(this.f51933a[i11], obj)) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final int m(int i11, int i12, Collection collection, boolean z11) {
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            int i15 = i11 + i13;
            if (collection.contains(this.f51933a[i15]) == z11) {
                Object[] objArr = this.f51933a;
                i13++;
                objArr[i14 + i11] = objArr[i15];
                i14++;
            } else {
                i13++;
            }
        }
        int i16 = i12 - i14;
        Object[] objArr2 = this.f51933a;
        l.G(i11 + i14, i12 + i11, this.f51934b, objArr2, objArr2);
        Object[] objArr3 = this.f51933a;
        int i17 = this.f51934b;
        ew.a.A(i17 - i16, i17, objArr3);
        if (i16 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f51934b -= i16;
        return i16;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            d(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        m.f(elements, "elements");
        h();
        return m(0, this.f51934b, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        m.f(elements, "elements");
        h();
        return m(0, this.f51934b, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        h();
        int i12 = this.f51934b;
        if (i11 < 0 || i11 >= i12) {
            throw new IndexOutOfBoundsException(p.p("index: ", i11, i12, ", size: "));
        }
        Object[] objArr = this.f51933a;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i11, int i12) {
        jh.h.d(i11, i12, this.f51934b);
        return new b(this.f51933a, i11, i12 - i11, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        m.f(array, "array");
        int length = array.length;
        int i11 = this.f51934b;
        if (length < i11) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f51933a, 0, i11, array.getClass());
            m.e(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        l.G(0, 0, i11, this.f51933a, array);
        int i12 = this.f51934b;
        if (i12 < array.length) {
            array[i12] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return ew.a.g(this.f51933a, 0, this.f51934b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        int i12 = this.f51934b;
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException(p.p("index: ", i11, i12, ", size: "));
        }
        return new a(this, i11);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i11, Collection elements) {
        m.f(elements, "elements");
        h();
        int i12 = this.f51934b;
        if (i11 >= 0 && i11 <= i12) {
            int size = elements.size();
            f(i11, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(p.p(txBUGYhC.duyjPhMcWHpvS, i11, i12, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        h();
        int i12 = this.f51934b;
        if (i11 >= 0 && i11 <= i12) {
            ((AbstractList) this).modCount++;
            j(i11, 1);
            this.f51933a[i11] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(p.p("index: ", i11, i12, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return l.N(0, this.f51934b, this.f51933a);
    }
}
