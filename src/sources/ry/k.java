package ry;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f50849d = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f50850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f50851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f50852c;

    public k() {
        this.f50851b = f50849d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12 = this.f50852c;
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException(nv.p.p("index: ", i11, i12, ", size: "));
        }
        if (i11 == i12) {
            addLast(obj);
            return;
        }
        if (i11 == 0) {
            addFirst(obj);
            return;
        }
        n();
        f(this.f50852c + 1);
        int iM = m(this.f50850a + i11);
        int i13 = this.f50852c;
        if (i11 < ((i13 + 1) >> 1)) {
            int iX = iM == 0 ? l.X(this.f50851b) : iM - 1;
            int i14 = this.f50850a;
            int iX2 = i14 == 0 ? l.X(this.f50851b) : i14 - 1;
            int i15 = this.f50850a;
            if (iX >= i15) {
                Object[] objArr = this.f50851b;
                objArr[iX2] = objArr[i15];
                l.G(i15, i15 + 1, iX + 1, objArr, objArr);
            } else {
                Object[] objArr2 = this.f50851b;
                l.G(i15 - 1, i15, objArr2.length, objArr2, objArr2);
                Object[] objArr3 = this.f50851b;
                objArr3[objArr3.length - 1] = objArr3[0];
                l.G(0, 1, iX + 1, objArr3, objArr3);
            }
            this.f50851b[iX] = obj;
            this.f50850a = iX2;
        } else {
            int iM2 = m(i13 + this.f50850a);
            if (iM < iM2) {
                Object[] objArr4 = this.f50851b;
                l.G(iM + 1, iM, iM2, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f50851b;
                l.G(1, 0, iM2, objArr5, objArr5);
                Object[] objArr6 = this.f50851b;
                objArr6[0] = objArr6[objArr6.length - 1];
                l.G(iM + 1, iM, objArr6.length - 1, objArr6, objArr6);
            }
            this.f50851b[iM] = obj;
        }
        this.f50852c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i11, Collection elements) {
        kotlin.jvm.internal.m.f(elements, "elements");
        int i12 = this.f50852c;
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException(nv.p.p("index: ", i11, i12, ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i11 == this.f50852c) {
            return addAll(elements);
        }
        n();
        f(elements.size() + this.f50852c);
        int iM = m(this.f50852c + this.f50850a);
        int iM2 = m(this.f50850a + i11);
        int size = elements.size();
        if (i11 >= ((this.f50852c + 1) >> 1)) {
            int i13 = iM2 + size;
            if (iM2 < iM) {
                int i14 = size + iM;
                Object[] objArr = this.f50851b;
                if (i14 <= objArr.length) {
                    l.G(i13, iM2, iM, objArr, objArr);
                } else if (i13 >= objArr.length) {
                    l.G(i13 - objArr.length, iM2, iM, objArr, objArr);
                } else {
                    int length = iM - (i14 - objArr.length);
                    l.G(0, length, iM, objArr, objArr);
                    Object[] objArr2 = this.f50851b;
                    l.G(i13, iM2, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f50851b;
                l.G(size, 0, iM, objArr3, objArr3);
                Object[] objArr4 = this.f50851b;
                if (i13 >= objArr4.length) {
                    l.G(i13 - objArr4.length, iM2, objArr4.length, objArr4, objArr4);
                } else {
                    l.G(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f50851b;
                    l.G(i13, iM2, objArr5.length - size, objArr5, objArr5);
                }
            }
            e(iM2, elements);
            return true;
        }
        int i15 = this.f50850a;
        int length2 = i15 - size;
        if (iM2 < i15) {
            Object[] objArr6 = this.f50851b;
            l.G(length2, i15, objArr6.length, objArr6, objArr6);
            if (size >= iM2) {
                Object[] objArr7 = this.f50851b;
                l.G(objArr7.length - size, 0, iM2, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f50851b;
                l.G(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f50851b;
                l.G(0, size, iM2, objArr9, objArr9);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f50851b;
            l.G(length2, i15, iM2, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f50851b;
            length2 += objArr11.length;
            int i16 = iM2 - i15;
            int length3 = objArr11.length - length2;
            if (length3 >= i16) {
                l.G(length2, i15, iM2, objArr11, objArr11);
            } else {
                l.G(length2, i15, i15 + length3, objArr11, objArr11);
                Object[] objArr12 = this.f50851b;
                l.G(0, this.f50850a + length3, iM2, objArr12, objArr12);
            }
        }
        this.f50850a = length2;
        e(k(iM2 - size), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        n();
        f(this.f50852c + 1);
        int i11 = this.f50850a;
        int iX = i11 == 0 ? l.X(this.f50851b) : i11 - 1;
        this.f50850a = iX;
        this.f50851b[iX] = obj;
        this.f50852c++;
    }

    public final void addLast(Object obj) {
        n();
        f(b() + 1);
        this.f50851b[m(b() + this.f50850a)] = obj;
        this.f50852c = b() + 1;
    }

    @Override // ry.g
    public final int b() {
        return this.f50852c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            n();
            l(this.f50850a, m(b() + this.f50850a));
        }
        this.f50850a = 0;
        this.f50852c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // ry.g
    public final Object d(int i11) {
        int i12 = this.f50852c;
        if (i11 < 0 || i11 >= i12) {
            throw new IndexOutOfBoundsException(nv.p.p("index: ", i11, i12, ", size: "));
        }
        if (i11 == ns.o.A(this)) {
            return removeLast();
        }
        if (i11 == 0) {
            return removeFirst();
        }
        n();
        int iM = m(this.f50850a + i11);
        Object[] objArr = this.f50851b;
        Object obj = objArr[iM];
        if (i11 < (this.f50852c >> 1)) {
            int i13 = this.f50850a;
            if (iM >= i13) {
                l.G(i13 + 1, i13, iM, objArr, objArr);
            } else {
                l.G(1, 0, iM, objArr, objArr);
                Object[] objArr2 = this.f50851b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i14 = this.f50850a;
                l.G(i14 + 1, i14, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f50851b;
            int i15 = this.f50850a;
            objArr3[i15] = null;
            this.f50850a = h(i15);
        } else {
            int iM2 = m(ns.o.A(this) + this.f50850a);
            if (iM <= iM2) {
                Object[] objArr4 = this.f50851b;
                l.G(iM, iM + 1, iM2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f50851b;
                l.G(iM, iM + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f50851b;
                objArr6[objArr6.length - 1] = objArr6[0];
                l.G(0, 1, iM2 + 1, objArr6, objArr6);
            }
            this.f50851b[iM2] = null;
        }
        this.f50852c--;
        return obj;
    }

    public final void e(int i11, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f50851b.length;
        while (i11 < length && it.hasNext()) {
            this.f50851b[i11] = it.next();
            i11++;
        }
        int i12 = this.f50850a;
        for (int i13 = 0; i13 < i12 && it.hasNext(); i13++) {
            this.f50851b[i13] = it.next();
        }
        this.f50852c = collection.size() + this.f50852c;
    }

    public final void f(int i11) {
        if (i11 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f50851b;
        if (i11 <= objArr.length) {
            return;
        }
        if (objArr == f50849d) {
            if (i11 < 10) {
                i11 = 10;
            }
            this.f50851b = new Object[i11];
            return;
        }
        int length = objArr.length;
        int i12 = length + (length >> 1);
        if (i12 - i11 < 0) {
            i12 = i11;
        }
        if (i12 - 2147483639 > 0) {
            i12 = i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i12];
        l.G(0, this.f50850a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f50851b;
        int length2 = objArr3.length;
        int i13 = this.f50850a;
        l.G(length2 - i13, 0, i13, objArr3, objArr2);
        this.f50850a = 0;
        this.f50851b = objArr2;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f50851b[this.f50850a];
    }

    public final Object g() {
        if (isEmpty()) {
            return null;
        }
        return this.f50851b[this.f50850a];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        int iB = b();
        if (i11 < 0 || i11 >= iB) {
            throw new IndexOutOfBoundsException(nv.p.p("index: ", i11, iB, ", size: "));
        }
        return this.f50851b[m(this.f50850a + i11)];
    }

    public final int h(int i11) {
        if (i11 == l.X(this.f50851b)) {
            return 0;
        }
        return i11 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i11;
        int iM = m(b() + this.f50850a);
        int length = this.f50850a;
        if (length < iM) {
            while (length < iM) {
                if (kotlin.jvm.internal.m.a(obj, this.f50851b[length])) {
                    i11 = this.f50850a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM) {
            return -1;
        }
        int length2 = this.f50851b.length;
        while (length < length2) {
            if (kotlin.jvm.internal.m.a(obj, this.f50851b[length])) {
                i11 = this.f50850a;
            } else {
                length++;
            }
        }
        for (int i12 = 0; i12 < iM; i12++) {
            if (kotlin.jvm.internal.m.a(obj, this.f50851b[i12])) {
                length = i12 + this.f50851b.length;
                i11 = this.f50850a;
            }
        }
        return -1;
        return length - i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return b() == 0;
    }

    public final Object j() {
        if (isEmpty()) {
            return null;
        }
        return this.f50851b[m(ns.o.A(this) + this.f50850a)];
    }

    public final int k(int i11) {
        return i11 < 0 ? i11 + this.f50851b.length : i11;
    }

    public final void l(int i11, int i12) {
        if (i11 < i12) {
            l.P(i11, i12, null, this.f50851b);
            return;
        }
        Object[] objArr = this.f50851b;
        l.P(i11, objArr.length, null, objArr);
        l.P(0, i12, null, this.f50851b);
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f50851b[m(ns.o.A(this) + this.f50850a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int iX;
        int i11;
        int iM = m(b() + this.f50850a);
        int i12 = this.f50850a;
        if (i12 < iM) {
            iX = iM - 1;
            if (i12 <= iX) {
                while (!kotlin.jvm.internal.m.a(obj, this.f50851b[iX])) {
                    if (iX != i12) {
                        iX--;
                    }
                }
                i11 = this.f50850a;
                return iX - i11;
            }
            return -1;
        }
        if (i12 > iM) {
            for (int i13 = iM - 1; -1 < i13; i13--) {
                if (kotlin.jvm.internal.m.a(obj, this.f50851b[i13])) {
                    iX = i13 + this.f50851b.length;
                    i11 = this.f50850a;
                    return iX - i11;
                }
            }
            iX = l.X(this.f50851b);
            int i14 = this.f50850a;
            if (i14 <= iX) {
                while (!kotlin.jvm.internal.m.a(obj, this.f50851b[iX])) {
                    if (iX != i14) {
                        iX--;
                    }
                }
                i11 = this.f50850a;
                return iX - i11;
            }
        }
        return -1;
    }

    public final int m(int i11) {
        Object[] objArr = this.f50851b;
        return i11 >= objArr.length ? i11 - objArr.length : i11;
    }

    public final void n() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        d(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int iM;
        kotlin.jvm.internal.m.f(elements, "elements");
        boolean z11 = false;
        z11 = false;
        z11 = false;
        if (!isEmpty() && this.f50851b.length != 0) {
            int iM2 = m(b() + this.f50850a);
            int i11 = this.f50850a;
            if (i11 < iM2) {
                iM = i11;
                while (i11 < iM2) {
                    Object obj = this.f50851b[i11];
                    if (elements.contains(obj)) {
                        z11 = true;
                    } else {
                        this.f50851b[iM] = obj;
                        iM++;
                    }
                    i11++;
                }
                l.P(iM, iM2, null, this.f50851b);
            } else {
                int length = this.f50851b.length;
                boolean z12 = false;
                int i12 = i11;
                while (i11 < length) {
                    Object[] objArr = this.f50851b;
                    Object obj2 = objArr[i11];
                    objArr[i11] = null;
                    if (elements.contains(obj2)) {
                        z12 = true;
                    } else {
                        this.f50851b[i12] = obj2;
                        i12++;
                    }
                    i11++;
                }
                iM = m(i12);
                for (int i13 = 0; i13 < iM2; i13++) {
                    Object[] objArr2 = this.f50851b;
                    Object obj3 = objArr2[i13];
                    objArr2[i13] = null;
                    if (elements.contains(obj3)) {
                        z12 = true;
                    } else {
                        this.f50851b[iM] = obj3;
                        iM = h(iM);
                    }
                }
                z11 = z12;
            }
            if (z11) {
                n();
                this.f50852c = k(iM - this.f50850a);
            }
        }
        return z11;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        n();
        Object[] objArr = this.f50851b;
        int i11 = this.f50850a;
        Object obj = objArr[i11];
        objArr[i11] = null;
        this.f50850a = h(i11);
        this.f50852c = b() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        n();
        int iM = m(ns.o.A(this) + this.f50850a);
        Object[] objArr = this.f50851b;
        Object obj = objArr[iM];
        objArr[iM] = null;
        this.f50852c = b() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i11, int i12) {
        jh.h.d(i11, i12, this.f50852c);
        int i13 = i12 - i11;
        if (i13 == 0) {
            return;
        }
        if (i13 == this.f50852c) {
            clear();
            return;
        }
        if (i13 == 1) {
            d(i11);
            return;
        }
        n();
        if (i11 < this.f50852c - i12) {
            int iM = m(this.f50850a + (i11 - 1));
            int iM2 = m(this.f50850a + (i12 - 1));
            while (i11 > 0) {
                int i14 = iM + 1;
                int iMin = Math.min(i11, Math.min(i14, iM2 + 1));
                Object[] objArr = this.f50851b;
                int i15 = iM2 - iMin;
                int i16 = iM - iMin;
                l.G(i15 + 1, i16 + 1, i14, objArr, objArr);
                iM = k(i16);
                iM2 = k(i15);
                i11 -= iMin;
            }
            int iM3 = m(this.f50850a + i13);
            l(this.f50850a, iM3);
            this.f50850a = iM3;
        } else {
            int iM4 = m(this.f50850a + i12);
            int iM5 = m(this.f50850a + i11);
            int i17 = this.f50852c;
            while (true) {
                i17 -= i12;
                if (i17 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f50851b;
                i12 = Math.min(i17, Math.min(objArr2.length - iM4, objArr2.length - iM5));
                Object[] objArr3 = this.f50851b;
                int i18 = iM4 + i12;
                l.G(iM5, iM4, i18, objArr3, objArr3);
                iM4 = m(i18);
                iM5 = m(iM5 + i12);
            }
            int iM6 = m(this.f50852c + this.f50850a);
            l(k(iM6 - i13), iM6);
        }
        this.f50852c -= i13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int iM;
        kotlin.jvm.internal.m.f(elements, "elements");
        boolean z11 = false;
        z11 = false;
        z11 = false;
        if (!isEmpty() && this.f50851b.length != 0) {
            int iM2 = m(b() + this.f50850a);
            int i11 = this.f50850a;
            if (i11 < iM2) {
                iM = i11;
                while (i11 < iM2) {
                    Object obj = this.f50851b[i11];
                    if (elements.contains(obj)) {
                        this.f50851b[iM] = obj;
                        iM++;
                    } else {
                        z11 = true;
                    }
                    i11++;
                }
                l.P(iM, iM2, null, this.f50851b);
            } else {
                int length = this.f50851b.length;
                boolean z12 = false;
                int i12 = i11;
                while (i11 < length) {
                    Object[] objArr = this.f50851b;
                    Object obj2 = objArr[i11];
                    objArr[i11] = null;
                    if (elements.contains(obj2)) {
                        this.f50851b[i12] = obj2;
                        i12++;
                    } else {
                        z12 = true;
                    }
                    i11++;
                }
                iM = m(i12);
                for (int i13 = 0; i13 < iM2; i13++) {
                    Object[] objArr2 = this.f50851b;
                    Object obj3 = objArr2[i13];
                    objArr2[i13] = null;
                    if (elements.contains(obj3)) {
                        this.f50851b[iM] = obj3;
                        iM = h(iM);
                    } else {
                        z12 = true;
                    }
                }
                z11 = z12;
            }
            if (z11) {
                n();
                this.f50852c = k(iM - this.f50850a);
            }
        }
        return z11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        int iB = b();
        if (i11 < 0 || i11 >= iB) {
            throw new IndexOutOfBoundsException(nv.p.p("index: ", i11, iB, ", size: "));
        }
        int iM = m(this.f50850a + i11);
        Object[] objArr = this.f50851b;
        Object obj2 = objArr[iM];
        objArr[iM] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    public k(int i11) {
        Object[] objArr;
        if (i11 == 0) {
            objArr = f50849d;
        } else if (i11 > 0) {
            objArr = new Object[i11];
        } else {
            throw new IllegalArgumentException(nv.p.j(i11, "Illegal Capacity: "));
        }
        this.f50851b = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.m.f(array, "array");
        int length = array.length;
        int i11 = this.f50852c;
        if (length < i11) {
            Object objNewInstance = Array.newInstance(array.getClass().getComponentType(), i11);
            kotlin.jvm.internal.m.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) objNewInstance;
        }
        int iM = m(this.f50852c + this.f50850a);
        int i12 = this.f50850a;
        if (i12 < iM) {
            l.K(i12, iM, 2, this.f50851b, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.f50851b;
            l.G(0, this.f50850a, objArr.length, objArr, array);
            Object[] objArr2 = this.f50851b;
            l.G(objArr2.length - this.f50850a, 0, iM, objArr2, array);
        }
        int i13 = this.f50852c;
        if (i13 < array.length) {
            array[i13] = null;
        }
        return array;
    }

    public k(oz.j jVar) {
        Object[] objArrB = kotlin.jvm.internal.k.b(jVar, new Object[0]);
        this.f50851b = objArrB;
        this.f50852c = objArrB.length;
        if (objArrB.length == 0) {
            this.f50851b = f50849d;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.m.f(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        n();
        f(elements.size() + b());
        e(m(b() + this.f50850a), elements);
        return true;
    }
}
