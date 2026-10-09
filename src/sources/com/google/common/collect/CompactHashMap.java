package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object L = new Object();
    public transient Set H;
    public transient Collection K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object f16637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int[] f16638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Object[] f16639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Object[] f16640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f16641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int f16642f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public transient Set f16643t;

    /* JADX INFO: renamed from: com.google.common.collect.CompactHashMap$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 extends CompactHashMap<Object, Object>.Itr<Map.Entry<Object, Object>> {
        public AnonymousClass2() {
            super();
        }

        @Override // com.google.common.collect.CompactHashMap.Itr
        public final Object a(int i11) {
            return new MapEntry(i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class EntrySetView extends AbstractSet<Map.Entry<K, V>> {
        public EntrySetView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map mapF = compactHashMap.f();
            if (mapF != null) {
                return mapF.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int iK = compactHashMap.k(entry.getKey());
                if (iK != -1 && Objects.a(compactHashMap.s()[iK], entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map mapF = compactHashMap.f();
            return mapF != null ? mapF.entrySet().iterator() : new AnonymousClass2();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map mapF = compactHashMap.f();
            if (mapF != null) {
                return mapF.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (compactHashMap.o()) {
                return false;
            }
            int i11 = compactHashMap.i();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj2 = compactHashMap.f16637a;
            java.util.Objects.requireNonNull(obj2);
            int iD = CompactHashing.d(key, value, i11, obj2, compactHashMap.q(), compactHashMap.r(), compactHashMap.s());
            if (iD == -1) {
                return false;
            }
            compactHashMap.n(iD, i11);
            compactHashMap.f16642f--;
            compactHashMap.j();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return CompactHashMap.this.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public abstract class Itr<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16650c = -1;

        public Itr() {
            this.f16648a = CompactHashMap.this.f16641e;
            this.f16649b = CompactHashMap.this.g();
        }

        public abstract Object a(int i11);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f16649b >= 0;
        }

        @Override // java.util.Iterator
        public final Object next() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            if (compactHashMap.f16641e != this.f16648a) {
                throw new ConcurrentModificationException();
            }
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i11 = this.f16649b;
            this.f16650c = i11;
            Object objA = a(i11);
            this.f16649b = compactHashMap.h(this.f16649b);
            return objA;
        }

        @Override // java.util.Iterator
        public final void remove() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            if (compactHashMap.f16641e != this.f16648a) {
                throw new ConcurrentModificationException();
            }
            CollectPreconditions.d(this.f16650c >= 0);
            this.f16648a += 32;
            compactHashMap.remove(compactHashMap.r()[this.f16650c]);
            this.f16649b = compactHashMap.b(this.f16649b, this.f16650c);
            this.f16650c = -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class KeySetView extends AbstractSet<K> {
        public KeySetView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            final CompactHashMap compactHashMap = CompactHashMap.this;
            Map mapF = compactHashMap.f();
            return mapF != null ? mapF.keySet().iterator() : new CompactHashMap<Object, Object>.Itr<Object>() { // from class: com.google.common.collect.CompactHashMap.1
                @Override // com.google.common.collect.CompactHashMap.Itr
                public final Object a(int i11) {
                    Object obj = CompactHashMap.L;
                    return CompactHashMap.this.r()[i11];
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map mapF = compactHashMap.f();
            if (mapF != null) {
                return mapF.keySet().remove(obj);
            }
            return compactHashMap.p(obj) != CompactHashMap.L;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return CompactHashMap.this.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class MapEntry extends AbstractMapEntry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f16653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16654b;

        public MapEntry(int i11) {
            Object obj = CompactHashMap.L;
            this.f16653a = CompactHashMap.this.r()[i11];
            this.f16654b = i11;
        }

        public final void a() {
            int i11 = this.f16654b;
            Object obj = this.f16653a;
            CompactHashMap compactHashMap = CompactHashMap.this;
            if (i11 != -1 && i11 < compactHashMap.size()) {
                if (Objects.a(obj, compactHashMap.r()[this.f16654b])) {
                    return;
                }
            }
            Object obj2 = CompactHashMap.L;
            this.f16654b = compactHashMap.k(obj);
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f16653a;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map mapF = compactHashMap.f();
            if (mapF != null) {
                return mapF.get(this.f16653a);
            }
            a();
            int i11 = this.f16654b;
            if (i11 == -1) {
                return null;
            }
            return compactHashMap.s()[i11];
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final Object setValue(Object obj) {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map mapF = compactHashMap.f();
            Object obj2 = this.f16653a;
            if (mapF != 0) {
                return mapF.put(obj2, obj);
            }
            a();
            int i11 = this.f16654b;
            if (i11 == -1) {
                compactHashMap.put(obj2, obj);
                return null;
            }
            Object obj3 = compactHashMap.s()[i11];
            compactHashMap.s()[this.f16654b] = obj;
            return obj3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class ValuesView extends AbstractCollection<V> {
        public ValuesView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            final CompactHashMap compactHashMap = CompactHashMap.this;
            Map mapF = compactHashMap.f();
            return mapF != null ? mapF.values().iterator() : new CompactHashMap<Object, Object>.Itr<Object>() { // from class: com.google.common.collect.CompactHashMap.3
                @Override // com.google.common.collect.CompactHashMap.Itr
                public final Object a(int i11) {
                    Object obj = CompactHashMap.L;
                    return CompactHashMap.this.s()[i11];
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return CompactHashMap.this.size();
        }
    }

    public CompactHashMap() {
        l(3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i11 = objectInputStream.readInt();
        if (i11 < 0) {
            throw new InvalidObjectException(p.j(i11, "Invalid size: "));
        }
        l(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map mapF = f();
        Iterator<Map.Entry<K, V>> it = mapF != null ? mapF.entrySet().iterator() : new AnonymousClass2();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    public int b(int i11, int i12) {
        return i11 - 1;
    }

    public int c() {
        Preconditions.p("Arrays already allocated", o());
        int i11 = this.f16641e;
        int iMax = Math.max(4, Hashing.a(i11 + 1, 1.0d));
        this.f16637a = CompactHashing.a(iMax);
        this.f16641e = CompactHashing.b(this.f16641e, 32 - Integer.numberOfLeadingZeros(iMax - 1), 31);
        this.f16638b = new int[i11];
        this.f16639c = new Object[i11];
        this.f16640d = new Object[i11];
        return i11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (o()) {
            return;
        }
        j();
        Map mapF = f();
        if (mapF != null) {
            this.f16641e = Ints.c(size(), 3);
            mapF.clear();
            this.f16637a = null;
            this.f16642f = 0;
            return;
        }
        Arrays.fill(r(), 0, this.f16642f, (Object) null);
        Arrays.fill(s(), 0, this.f16642f, (Object) null);
        Object obj = this.f16637a;
        java.util.Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(q(), 0, this.f16642f, 0);
        this.f16642f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapF = f();
        if (mapF != null) {
            return mapF.containsKey(obj);
        }
        return k(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapF = f();
        if (mapF != null) {
            return mapF.containsValue(obj);
        }
        for (int i11 = 0; i11 < this.f16642f; i11++) {
            if (Objects.a(obj, s()[i11])) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Map d() {
        LinkedHashMap linkedHashMapE = e(i() + 1);
        int iG = g();
        while (iG >= 0) {
            linkedHashMapE.put(r()[iG], s()[iG]);
            iG = h(iG);
        }
        this.f16637a = linkedHashMapE;
        this.f16638b = null;
        this.f16639c = null;
        this.f16640d = null;
        j();
        return linkedHashMapE;
    }

    public LinkedHashMap e(int i11) {
        return new LinkedHashMap(i11, 1.0f);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.H;
        if (set != null) {
            return set;
        }
        EntrySetView entrySetView = new EntrySetView();
        this.H = entrySetView;
        return entrySetView;
    }

    public final Map f() {
        Object obj = this.f16637a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public int g() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapF = f();
        if (mapF != null) {
            return mapF.get(obj);
        }
        int iK = k(obj);
        if (iK == -1) {
            return null;
        }
        a(iK);
        return s()[iK];
    }

    public int h(int i11) {
        int i12 = i11 + 1;
        if (i12 < this.f16642f) {
            return i12;
        }
        return -1;
    }

    public final int i() {
        return (1 << (this.f16641e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final void j() {
        this.f16641e += 32;
    }

    public final int k(Object obj) {
        if (o()) {
            return -1;
        }
        int iC = Hashing.c(obj);
        int i11 = i();
        Object obj2 = this.f16637a;
        java.util.Objects.requireNonNull(obj2);
        int iE = CompactHashing.e(iC & i11, obj2);
        if (iE == 0) {
            return -1;
        }
        int i12 = ~i11;
        int i13 = iC & i12;
        do {
            int i14 = iE - 1;
            int i15 = q()[i14];
            if ((i15 & i12) == i13 && Objects.a(obj, r()[i14])) {
                return i14;
            }
            iE = i15 & i11;
        } while (iE != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f16643t;
        if (set != null) {
            return set;
        }
        KeySetView keySetView = new KeySetView();
        this.f16643t = keySetView;
        return keySetView;
    }

    public void l(int i11) {
        Preconditions.e("Expected size must be >= 0", i11 >= 0);
        this.f16641e = Ints.c(i11, 1);
    }

    public void m(int i11, Object obj, Object obj2, int i12, int i13) {
        q()[i11] = CompactHashing.b(i12, 0, i13);
        r()[i11] = obj;
        s()[i11] = obj2;
    }

    public void n(int i11, int i12) {
        Object obj = this.f16637a;
        java.util.Objects.requireNonNull(obj);
        int[] iArrQ = q();
        Object[] objArrR = r();
        Object[] objArrS = s();
        int size = size();
        int i13 = size - 1;
        if (i11 >= i13) {
            objArrR[i11] = null;
            objArrS[i11] = null;
            iArrQ[i11] = 0;
            return;
        }
        Object obj2 = objArrR[i13];
        objArrR[i11] = obj2;
        objArrS[i11] = objArrS[i13];
        objArrR[i13] = null;
        objArrS[i13] = null;
        iArrQ[i11] = iArrQ[i13];
        iArrQ[i13] = 0;
        int iC = Hashing.c(obj2) & i12;
        int iE = CompactHashing.e(iC, obj);
        if (iE == size) {
            CompactHashing.f(iC, i11 + 1, obj);
            return;
        }
        while (true) {
            int i14 = iE - 1;
            int i15 = iArrQ[i14];
            int i16 = i15 & i12;
            if (i16 == size) {
                iArrQ[i14] = CompactHashing.b(i15, i11 + 1, i12);
                return;
            }
            iE = i16;
        }
    }

    public final boolean o() {
        return this.f16637a == null;
    }

    public final Object p(Object obj) {
        boolean zO = o();
        Object obj2 = L;
        if (zO) {
            return obj2;
        }
        int i11 = i();
        Object obj3 = this.f16637a;
        java.util.Objects.requireNonNull(obj3);
        int iD = CompactHashing.d(obj, null, i11, obj3, q(), r(), null);
        if (iD == -1) {
            return obj2;
        }
        Object obj4 = s()[iD];
        n(iD, i11);
        this.f16642f--;
        j();
        return obj4;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i11;
        int iU;
        int length;
        int iMin;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (o()) {
            c();
        }
        Map mapF = f();
        if (mapF != 0) {
            return mapF.put(obj3, obj4);
        }
        int[] iArrQ = q();
        Object[] objArrR = r();
        Object[] objArrS = s();
        int i12 = this.f16642f;
        int i13 = i12 + 1;
        int iC = Hashing.c(obj3);
        int i14 = i();
        int i15 = iC & i14;
        Object obj5 = this.f16637a;
        java.util.Objects.requireNonNull(obj5);
        int iE = CompactHashing.e(i15, obj5);
        int i16 = 1;
        if (iE == 0) {
            if (i13 > i14) {
                iU = u(i14, CompactHashing.c(i14), iC, i12);
                i11 = 1;
            } else {
                Object obj6 = this.f16637a;
                java.util.Objects.requireNonNull(obj6);
                CompactHashing.f(i15, i13, obj6);
                i11 = 1;
            }
            length = q().length;
            if (i13 > length) {
                int i17 = i11;
                iMin = Math.min(1073741823, (Math.max(i17, length >>> 1) + length) | i17);
                if (iMin != length) {
                    t(iMin);
                }
            }
            m(i12, obj3, obj4, iC, iU);
            this.f16642f = i13;
            j();
            return null;
        }
        int i18 = ~i14;
        int i19 = iC & i18;
        int i21 = 0;
        while (true) {
            int i22 = iE - i16;
            int i23 = iArrQ[i22];
            i11 = i16;
            if ((i23 & i18) == i19 && Objects.a(obj3, objArrR[i22])) {
                Object obj7 = objArrS[i22];
                objArrS[i22] = obj4;
                a(i22);
                return obj7;
            }
            int i24 = i23 & i14;
            i21++;
            if (i24 == 0) {
                if (i21 < 9) {
                    if (i13 <= i14) {
                        iArrQ[i22] = CompactHashing.b(i23, i13, i14);
                        break;
                    }
                    i14 = u(i14, CompactHashing.c(i14), iC, i12);
                    break;
                }
                return d().put(obj3, obj4);
            }
            obj3 = obj;
            obj4 = obj2;
            iE = i24;
            i16 = i11;
        }
        iU = i14;
        length = q().length;
        if (i13 > length) {
            int i110 = i11;
            iMin = Math.min(1073741823, (Math.max(i110, length >>> 1) + length) | i110);
            if (iMin != length) {
                t(iMin);
            }
        }
        m(i12, obj3, obj4, iC, iU);
        this.f16642f = i13;
        j();
        return null;
    }

    public final int[] q() {
        int[] iArr = this.f16638b;
        java.util.Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] r() {
        Object[] objArr = this.f16639c;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapF = f();
        if (mapF != null) {
            return mapF.remove(obj);
        }
        Object objP = p(obj);
        if (objP == L) {
            return null;
        }
        return objP;
    }

    public final Object[] s() {
        Object[] objArr = this.f16640d;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapF = f();
        return mapF != null ? mapF.size() : this.f16642f;
    }

    public void t(int i11) {
        this.f16638b = Arrays.copyOf(q(), i11);
        this.f16639c = Arrays.copyOf(r(), i11);
        this.f16640d = Arrays.copyOf(s(), i11);
    }

    public final int u(int i11, int i12, int i13, int i14) {
        Object objA = CompactHashing.a(i12);
        int i15 = i12 - 1;
        if (i14 != 0) {
            CompactHashing.f(i13 & i15, i14 + 1, objA);
        }
        Object obj = this.f16637a;
        java.util.Objects.requireNonNull(obj);
        int[] iArrQ = q();
        for (int i16 = 0; i16 <= i11; i16++) {
            int iE = CompactHashing.e(i16, obj);
            while (iE != 0) {
                int i17 = iE - 1;
                int i18 = iArrQ[i17];
                int i19 = ((~i11) & i18) | i16;
                int i21 = i19 & i15;
                int iE2 = CompactHashing.e(i21, objA);
                CompactHashing.f(i21, iE, objA);
                iArrQ[i17] = CompactHashing.b(i19, iE2, i15);
                iE = i18 & i11;
            }
        }
        this.f16637a = objA;
        this.f16641e = CompactHashing.b(this.f16641e, 32 - Integer.numberOfLeadingZeros(i15), 31);
        return i15;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.K;
        if (collection != null) {
            return collection;
        }
        ValuesView valuesView = new ValuesView();
        this.K = valuesView;
        return valuesView;
    }

    public CompactHashMap(int i11) {
        l(i11);
    }

    public void a(int i11) {
    }
}
