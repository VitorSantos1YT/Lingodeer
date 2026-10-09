package sy;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.m;
import nv.p;
import ry.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends ry.g implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f51927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f51930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f51931e;

    public b(Object[] backing, int i11, int i12, b bVar, c root) {
        m.f(backing, "backing");
        m.f(root, "root");
        this.f51927a = backing;
        this.f51928b = i11;
        this.f51929c = i12;
        this.f51930d = bVar;
        this.f51931e = root;
        ((AbstractList) this).modCount = ((AbstractList) root).modCount;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f51931e.f51935c) {
            return new i(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        j();
        h();
        g(this.f51928b + this.f51929c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        m.f(elements, "elements");
        j();
        h();
        int size = elements.size();
        f(this.f51928b + this.f51929c, elements, size);
        return size > 0;
    }

    @Override // ry.g
    public final int b() {
        h();
        return this.f51929c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        j();
        h();
        l(this.f51928b, this.f51929c);
    }

    @Override // ry.g
    public final Object d(int i11) {
        j();
        h();
        int i12 = this.f51929c;
        if (i11 < 0 || i11 >= i12) {
            throw new IndexOutOfBoundsException(p.p("index: ", i11, i12, ", size: "));
        }
        return k(this.f51928b + i11);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        h();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f51927a;
            int i11 = this.f51929c;
            if (i11 == list.size()) {
                for (int i12 = 0; i12 < i11; i12++) {
                    if (m.a(objArr[this.f51928b + i12], list.get(i12))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i11, Collection collection, int i12) {
        ((AbstractList) this).modCount++;
        c cVar = this.f51931e;
        b bVar = this.f51930d;
        if (bVar != null) {
            bVar.f(i11, collection, i12);
        } else {
            c cVar2 = c.f51932d;
            cVar.f(i11, collection, i12);
        }
        this.f51927a = cVar.f51933a;
        this.f51929c += i12;
    }

    public final void g(int i11, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.f51931e;
        b bVar = this.f51930d;
        if (bVar != null) {
            bVar.g(i11, obj);
        } else {
            c cVar2 = c.f51932d;
            cVar.g(i11, obj);
        }
        this.f51927a = cVar.f51933a;
        this.f51929c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        h();
        int i12 = this.f51929c;
        if (i11 < 0 || i11 >= i12) {
            throw new IndexOutOfBoundsException(p.p("index: ", i11, i12, ", size: "));
        }
        return this.f51927a[this.f51928b + i11];
    }

    public final void h() {
        if (((AbstractList) this.f51931e).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        h();
        Object[] objArr = this.f51927a;
        int i11 = this.f51929c;
        int iHashCode = 1;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = objArr[this.f51928b + i12];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        h();
        for (int i11 = 0; i11 < this.f51929c; i11++) {
            if (m.a(this.f51927a[this.f51928b + i11], obj)) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        h();
        return this.f51929c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j() {
        if (this.f51931e.f51935c) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object k(int i11) {
        Object objK;
        ((AbstractList) this).modCount++;
        b bVar = this.f51930d;
        if (bVar != null) {
            objK = bVar.k(i11);
        } else {
            c cVar = c.f51932d;
            objK = this.f51931e.k(i11);
        }
        this.f51929c--;
        return objK;
    }

    public final void l(int i11, int i12) {
        if (i12 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.f51930d;
        if (bVar != null) {
            bVar.l(i11, i12);
        } else {
            c cVar = c.f51932d;
            this.f51931e.l(i11, i12);
        }
        this.f51929c -= i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        h();
        for (int i11 = this.f51929c - 1; i11 >= 0; i11--) {
            if (m.a(this.f51927a[this.f51928b + i11], obj)) {
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
        int iM;
        b bVar = this.f51930d;
        if (bVar != null) {
            iM = bVar.m(i11, i12, collection, z11);
        } else {
            c cVar = c.f51932d;
            iM = this.f51931e.m(i11, i12, collection, z11);
        }
        if (iM > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f51929c -= iM;
        return iM;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        j();
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
        j();
        h();
        return m(this.f51928b, this.f51929c, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        m.f(elements, "elements");
        j();
        h();
        return m(this.f51928b, this.f51929c, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        j();
        h();
        int i12 = this.f51929c;
        if (i11 < 0 || i11 >= i12) {
            throw new IndexOutOfBoundsException(p.p("index: ", i11, i12, ", size: "));
        }
        Object[] objArr = this.f51927a;
        int i13 = this.f51928b;
        Object obj2 = objArr[i13 + i11];
        objArr[i13 + i11] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i11, int i12) {
        jh.h.d(i11, i12, this.f51929c);
        return new b(this.f51927a, this.f51928b + i11, i12 - i11, this, this.f51931e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        m.f(array, "array");
        h();
        int length = array.length;
        int i11 = this.f51929c;
        int i12 = this.f51928b;
        if (length < i11) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f51927a, i12, i11 + i12, array.getClass());
            m.e(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        l.G(0, i12, i11 + i12, this.f51927a, array);
        int i13 = this.f51929c;
        if (i13 < array.length) {
            array[i13] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        h();
        return ew.a.g(this.f51927a, this.f51928b, this.f51929c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        h();
        int i12 = this.f51929c;
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException(p.p("index: ", i11, i12, ", size: "));
        }
        return new a(this, i11);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        j();
        h();
        int i12 = this.f51929c;
        if (i11 >= 0 && i11 <= i12) {
            g(this.f51928b + i11, obj);
            return;
        }
        throw new IndexOutOfBoundsException(p.p("index: ", i11, i12, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i11, Collection elements) {
        m.f(elements, "elements");
        j();
        h();
        int i12 = this.f51929c;
        if (i11 >= 0 && i11 <= i12) {
            int size = elements.size();
            f(this.f51928b + i11, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(p.p("index: ", i11, i12, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        h();
        Object[] objArr = this.f51927a;
        int i11 = this.f51929c;
        int i12 = this.f51928b;
        return l.N(i12, i11 + i12, objArr);
    }
}
