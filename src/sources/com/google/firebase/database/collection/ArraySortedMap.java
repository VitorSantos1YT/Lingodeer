package com.google.firebase.database.collection;

import com.google.firebase.database.snapshot.ChildKey;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ArraySortedMap<K, V> extends ImmutableSortedMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f19024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f19025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Comparator f19026c;

    /* JADX INFO: renamed from: com.google.firebase.database.collection.ArraySortedMap$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 implements Iterator<Map.Entry<Object, Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f19028b;

        public AnonymousClass1(int i11, boolean z11) {
            this.f19028b = z11;
            this.f19027a = i11;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f19028b) {
                return this.f19027a >= 0;
            }
            return this.f19027a < ArraySortedMap.this.f19024a.length;
        }

        @Override // java.util.Iterator
        public final Map.Entry<Object, Object> next() {
            ArraySortedMap arraySortedMap = ArraySortedMap.this;
            Object[] objArr = arraySortedMap.f19024a;
            int i11 = this.f19027a;
            Object obj = objArr[i11];
            Object obj2 = arraySortedMap.f19025b[i11];
            this.f19027a = this.f19028b ? i11 - 1 : i11 + 1;
            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
        }
    }

    public ArraySortedMap(Comparator comparator) {
        this.f19024a = new Object[0];
        this.f19025b = new Object[0];
        this.f19026c = comparator;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final boolean b(Object obj) {
        return m(obj) != -1;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Object d(ChildKey childKey) {
        int iM = m(childKey);
        if (iM != -1) {
            return this.f19025b[iM];
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Comparator e() {
        return this.f19026c;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Object f() {
        Object[] objArr = this.f19024a;
        if (objArr.length > 0) {
            return objArr[objArr.length - 1];
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Object g() {
        Object[] objArr = this.f19024a;
        if (objArr.length > 0) {
            return objArr[0];
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Object h(Object obj) {
        int iM = m(obj);
        if (iM == -1) {
            throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
        }
        if (iM <= 0) {
            return null;
        }
        return this.f19024a[iM - 1];
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final boolean isEmpty() {
        return this.f19024a.length == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new AnonymousClass1(0, false);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final void j(LLRBNode.NodeVisitor nodeVisitor) {
        int i11 = 0;
        while (true) {
            Object[] objArr = this.f19024a;
            if (i11 >= objArr.length) {
                return;
            }
            nodeVisitor.a(objArr[i11], this.f19025b[i11]);
            i11++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final ImmutableSortedMap k(Iterable iterable, Object obj) {
        int iM = m(obj);
        Comparator comparator = this.f19026c;
        Object[] objArr = this.f19025b;
        Object[] objArr2 = this.f19024a;
        if (iM != -1) {
            if (objArr2[iM] == obj && objArr[iM] == iterable) {
                return this;
            }
            int length = objArr2.length;
            Object[] objArr3 = new Object[length];
            System.arraycopy(objArr2, 0, objArr3, 0, length);
            objArr3[iM] = obj;
            int length2 = objArr.length;
            Object[] objArr4 = new Object[length2];
            System.arraycopy(objArr, 0, objArr4, 0, length2);
            objArr4[iM] = iterable;
            return new ArraySortedMap(comparator, objArr3, objArr4);
        }
        if (objArr2.length > 25) {
            HashMap map = new HashMap(objArr2.length + 1);
            for (int i11 = 0; i11 < objArr2.length; i11++) {
                map.put(objArr2[i11], objArr[i11]);
            }
            map.put(obj, iterable);
            return RBTreeSortedMap.Builder.b(new ArrayList(map.keySet()), map, comparator);
        }
        int i12 = 0;
        while (i12 < objArr2.length && comparator.compare(objArr2[i12], obj) < 0) {
            i12++;
        }
        int length3 = objArr2.length + 1;
        Object[] objArr5 = new Object[length3];
        System.arraycopy(objArr2, 0, objArr5, 0, i12);
        objArr5[i12] = obj;
        int i13 = i12 + 1;
        System.arraycopy(objArr2, i12, objArr5, i13, (length3 - i12) - 1);
        int length4 = objArr.length + 1;
        Object[] objArr6 = new Object[length4];
        System.arraycopy(objArr, 0, objArr6, 0, i12);
        objArr6[i12] = iterable;
        System.arraycopy(objArr, i12, objArr6, i13, (length4 - i12) - 1);
        return new ArraySortedMap(comparator, objArr5, objArr6);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final ImmutableSortedMap l(Object obj) {
        int iM = m(obj);
        if (iM == -1) {
            return this;
        }
        Object[] objArr = this.f19024a;
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, iM);
        int i11 = iM + 1;
        System.arraycopy(objArr, i11, objArr2, iM, length - iM);
        Object[] objArr3 = this.f19025b;
        int length2 = objArr3.length - 1;
        Object[] objArr4 = new Object[length2];
        System.arraycopy(objArr3, 0, objArr4, 0, iM);
        System.arraycopy(objArr3, i11, objArr4, iM, length2 - iM);
        return new ArraySortedMap(this.f19026c, objArr2, objArr4);
    }

    public final int m(Object obj) {
        int i11 = 0;
        for (Object obj2 : this.f19024a) {
            if (this.f19026c.compare(obj, obj2) == 0) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final int size() {
        return this.f19024a.length;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public final Iterator v1() {
        return new AnonymousClass1(this.f19024a.length - 1, true);
    }

    public ArraySortedMap(Comparator comparator, Object[] objArr, Object[] objArr2) {
        this.f19024a = objArr;
        this.f19025b = objArr2;
        this.f19026c = comparator;
    }
}
