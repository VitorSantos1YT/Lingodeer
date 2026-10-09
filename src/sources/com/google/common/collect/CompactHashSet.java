package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
class CompactHashSet<E> extends AbstractSet<E> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object f16657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int[] f16658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Object[] f16659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient int f16660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f16661e;

    public CompactHashSet() {
        j(3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i11 = objectInputStream.readInt();
        if (i11 < 0) {
            throw new InvalidObjectException(p.j(i11, "Invalid size: "));
        }
        j(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int iMin;
        if (m()) {
            d();
        }
        Set setF = f();
        if (setF != null) {
            return setF.add(obj);
        }
        int[] iArrO = o();
        Object[] objArrN = n();
        int i11 = this.f16661e;
        int i12 = i11 + 1;
        int iC = Hashing.c(obj);
        int iS = (1 << (this.f16660d & 31)) - 1;
        int i13 = iC & iS;
        Object obj2 = this.f16657a;
        Objects.requireNonNull(obj2);
        int iE = CompactHashing.e(i13, obj2);
        if (iE != 0) {
            int i14 = ~iS;
            int i15 = iC & i14;
            int i16 = 0;
            while (true) {
                int i17 = iE - 1;
                int i18 = iArrO[i17];
                if ((i18 & i14) == i15 && com.google.common.base.Objects.a(obj, objArrN[i17])) {
                    return false;
                }
                int i19 = i18 & iS;
                i16++;
                if (i19 == 0) {
                    if (i16 < 9) {
                        if (i12 <= iS) {
                            iArrO[i17] = CompactHashing.b(i18, i12, iS);
                            break;
                        }
                        iS = s(iS, CompactHashing.c(iS), iC, i11);
                        break;
                    }
                    return e().add(obj);
                }
                iE = i19;
            }
        } else if (i12 > iS) {
            iS = s(iS, CompactHashing.c(iS), iC, i11);
        } else {
            Object obj3 = this.f16657a;
            Objects.requireNonNull(obj3);
            CompactHashing.f(i13, i12, obj3);
        }
        int length = o().length;
        if (i12 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            r(iMin);
        }
        k(obj, i11, iC, iS);
        this.f16661e = i12;
        this.f16660d += 32;
        return true;
    }

    public int b(int i11, int i12) {
        return i11 - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (m()) {
            return;
        }
        this.f16660d += 32;
        Set setF = f();
        if (setF != null) {
            this.f16660d = Ints.c(size(), 3);
            setF.clear();
            this.f16657a = null;
            this.f16661e = 0;
            return;
        }
        Arrays.fill(n(), 0, this.f16661e, (Object) null);
        Object obj = this.f16657a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(o(), 0, this.f16661e, 0);
        this.f16661e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (m()) {
            return false;
        }
        Set setF = f();
        if (setF != null) {
            return setF.contains(obj);
        }
        int iC = Hashing.c(obj);
        int i11 = (1 << (this.f16660d & 31)) - 1;
        Object obj2 = this.f16657a;
        Objects.requireNonNull(obj2);
        int iE = CompactHashing.e(iC & i11, obj2);
        if (iE == 0) {
            return false;
        }
        int i12 = ~i11;
        int i13 = iC & i12;
        do {
            int i14 = iE - 1;
            int i15 = o()[i14];
            if ((i15 & i12) == i13 && com.google.common.base.Objects.a(obj, n()[i14])) {
                return true;
            }
            iE = i15 & i11;
        } while (iE != 0);
        return false;
    }

    public int d() {
        Preconditions.p("Arrays already allocated", m());
        int i11 = this.f16660d;
        int iMax = Math.max(4, Hashing.a(i11 + 1, 1.0d));
        this.f16657a = CompactHashing.a(iMax);
        this.f16660d = CompactHashing.b(this.f16660d, 32 - Integer.numberOfLeadingZeros(iMax - 1), 31);
        this.f16658b = new int[i11];
        this.f16659c = new Object[i11];
        return i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LinkedHashSet e() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(1 << (this.f16660d & 31), 1.0f);
        int iG = g();
        while (iG >= 0) {
            linkedHashSet.add(n()[iG]);
            iG = h(iG);
        }
        this.f16657a = linkedHashSet;
        this.f16658b = null;
        this.f16659c = null;
        this.f16660d += 32;
        return linkedHashSet;
    }

    public final Set f() {
        Object obj = this.f16657a;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public int g() {
        return isEmpty() ? -1 : 0;
    }

    public int h(int i11) {
        int i12 = i11 + 1;
        if (i12 < this.f16661e) {
            return i12;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Set setF = f();
        return setF != null ? setF.iterator() : new Iterator<Object>() { // from class: com.google.common.collect.CompactHashSet.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f16662a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f16663b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f16664c = -1;

            {
                this.f16662a = CompactHashSet.this.f16660d;
                this.f16663b = CompactHashSet.this.g();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f16663b >= 0;
            }

            @Override // java.util.Iterator
            public final Object next() {
                CompactHashSet compactHashSet = CompactHashSet.this;
                if (compactHashSet.f16660d != this.f16662a) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i11 = this.f16663b;
                this.f16664c = i11;
                Object obj = compactHashSet.n()[i11];
                this.f16663b = compactHashSet.h(this.f16663b);
                return obj;
            }

            @Override // java.util.Iterator
            public final void remove() {
                CompactHashSet compactHashSet = CompactHashSet.this;
                if (compactHashSet.f16660d != this.f16662a) {
                    throw new ConcurrentModificationException();
                }
                CollectPreconditions.d(this.f16664c >= 0);
                this.f16662a += 32;
                compactHashSet.remove(compactHashSet.n()[this.f16664c]);
                this.f16663b = compactHashSet.b(this.f16663b, this.f16664c);
                this.f16664c = -1;
            }
        };
    }

    public void j(int i11) {
        Preconditions.e("Expected size must be >= 0", i11 >= 0);
        this.f16660d = Ints.c(i11, 1);
    }

    public void k(Object obj, int i11, int i12, int i13) {
        o()[i11] = CompactHashing.b(i12, 0, i13);
        n()[i11] = obj;
    }

    public void l(int i11, int i12) {
        Object obj = this.f16657a;
        Objects.requireNonNull(obj);
        int[] iArrO = o();
        Object[] objArrN = n();
        int size = size();
        int i13 = size - 1;
        if (i11 >= i13) {
            objArrN[i11] = null;
            iArrO[i11] = 0;
            return;
        }
        Object obj2 = objArrN[i13];
        objArrN[i11] = obj2;
        objArrN[i13] = null;
        iArrO[i11] = iArrO[i13];
        iArrO[i13] = 0;
        int iC = Hashing.c(obj2) & i12;
        int iE = CompactHashing.e(iC, obj);
        if (iE == size) {
            CompactHashing.f(iC, i11 + 1, obj);
            return;
        }
        while (true) {
            int i14 = iE - 1;
            int i15 = iArrO[i14];
            int i16 = i15 & i12;
            if (i16 == size) {
                iArrO[i14] = CompactHashing.b(i15, i11 + 1, i12);
                return;
            }
            iE = i16;
        }
    }

    public final boolean m() {
        return this.f16657a == null;
    }

    public final Object[] n() {
        Object[] objArr = this.f16659c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int[] o() {
        int[] iArr = this.f16658b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public void r(int i11) {
        this.f16658b = Arrays.copyOf(o(), i11);
        this.f16659c = Arrays.copyOf(n(), i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (m()) {
            return false;
        }
        Set setF = f();
        if (setF != null) {
            return setF.remove(obj);
        }
        int i11 = (1 << (this.f16660d & 31)) - 1;
        Object obj2 = this.f16657a;
        Objects.requireNonNull(obj2);
        int iD = CompactHashing.d(obj, null, i11, obj2, o(), n(), null);
        if (iD == -1) {
            return false;
        }
        l(iD, i11);
        this.f16661e--;
        this.f16660d += 32;
        return true;
    }

    public final int s(int i11, int i12, int i13, int i14) {
        Object objA = CompactHashing.a(i12);
        int i15 = i12 - 1;
        if (i14 != 0) {
            CompactHashing.f(i13 & i15, i14 + 1, objA);
        }
        Object obj = this.f16657a;
        Objects.requireNonNull(obj);
        int[] iArrO = o();
        for (int i16 = 0; i16 <= i11; i16++) {
            int iE = CompactHashing.e(i16, obj);
            while (iE != 0) {
                int i17 = iE - 1;
                int i18 = iArrO[i17];
                int i19 = ((~i11) & i18) | i16;
                int i21 = i19 & i15;
                int iE2 = CompactHashing.e(i21, objA);
                CompactHashing.f(i21, iE, objA);
                iArrO[i17] = CompactHashing.b(i19, iE2, i15);
                iE = i18 & i11;
            }
        }
        this.f16657a = objA;
        this.f16660d = CompactHashing.b(this.f16660d, 32 - Integer.numberOfLeadingZeros(i15), 31);
        return i15;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set setF = f();
        return setF != null ? setF.size() : this.f16661e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (m()) {
            return new Object[0];
        }
        Set setF = f();
        return setF != null ? setF.toArray() : Arrays.copyOf(n(), this.f16661e);
    }

    public CompactHashSet(int i11) {
        j(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (m()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set setF = f();
        if (setF != null) {
            return setF.toArray(objArr);
        }
        Object[] objArrN = n();
        int i11 = this.f16661e;
        Preconditions.m(0, i11, objArrN.length);
        if (objArr.length < i11) {
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, i11);
        } else if (objArr.length > i11) {
            objArr[i11] = null;
        }
        System.arraycopy(objArrN, 0, objArr, 0, i11);
        return objArr;
    }
}
