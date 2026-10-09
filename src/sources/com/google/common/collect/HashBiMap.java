package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import hh.p0;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements BiMap<K, V>, Serializable {
    public transient int[] H;
    public transient int K;
    public transient int L;
    public transient int[] M;
    public transient int[] N;
    public transient BiMap O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object[] f16738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Object[] f16739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient int f16740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient int f16741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int[] f16742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int[] f16743f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public transient int[] f16744t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class EntryForKey extends AbstractMapEntry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f16745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16746b;

        public EntryForKey(int i11) {
            this.f16745a = HashBiMap.this.f16738a[i11];
            this.f16746b = i11;
        }

        public final void a() {
            int i11 = this.f16746b;
            Object obj = this.f16745a;
            HashBiMap hashBiMap = HashBiMap.this;
            if (i11 == -1 || i11 > hashBiMap.f16740c || !Objects.a(hashBiMap.f16738a[i11], obj)) {
                this.f16746b = hashBiMap.f(Hashing.c(obj), obj);
            }
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f16745a;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            a();
            int i11 = this.f16746b;
            if (i11 == -1) {
                return null;
            }
            return HashBiMap.this.f16739b[i11];
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final Object setValue(Object obj) {
            a();
            int i11 = this.f16746b;
            HashBiMap hashBiMap = HashBiMap.this;
            if (i11 == -1) {
                hashBiMap.put(this.f16745a, obj);
                return null;
            }
            Object obj2 = hashBiMap.f16739b[i11];
            if (Objects.a(obj2, obj)) {
                return obj;
            }
            hashBiMap.m(this.f16746b, obj);
            return obj2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class EntryForValue<K, V> extends AbstractMapEntry<V, K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashBiMap f16748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f16749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16750c;

        public EntryForValue(HashBiMap hashBiMap, int i11) {
            this.f16748a = hashBiMap;
            this.f16749b = hashBiMap.f16739b[i11];
            this.f16750c = i11;
        }

        public final void a() {
            int i11 = this.f16750c;
            Object obj = this.f16749b;
            HashBiMap hashBiMap = this.f16748a;
            if (i11 == -1 || i11 > hashBiMap.f16740c || !Objects.a(obj, hashBiMap.f16739b[i11])) {
                hashBiMap.getClass();
                this.f16750c = hashBiMap.g(Hashing.c(obj), obj);
            }
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f16749b;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            a();
            int i11 = this.f16750c;
            if (i11 == -1) {
                return null;
            }
            return this.f16748a.f16738a[i11];
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final Object setValue(Object obj) {
            a();
            int i11 = this.f16750c;
            HashBiMap hashBiMap = this.f16748a;
            if (i11 != -1) {
                Object obj2 = hashBiMap.f16738a[i11];
                if (Objects.a(obj2, obj)) {
                    return obj;
                }
                hashBiMap.l(this.f16750c, obj);
                return obj2;
            }
            hashBiMap.getClass();
            Object obj3 = this.f16749b;
            int iC = Hashing.c(obj3);
            int iG = hashBiMap.g(iC, obj3);
            if (iG != -1) {
                if (Objects.a(hashBiMap.f16738a[iG], obj)) {
                    return null;
                }
                hashBiMap.l(iG, obj);
                return null;
            }
            int i12 = hashBiMap.L;
            int iC2 = Hashing.c(obj);
            Preconditions.f("Key already present: %s", hashBiMap.f(iC2, obj) == -1, obj);
            hashBiMap.e(hashBiMap.f16740c + 1);
            Object[] objArr = hashBiMap.f16738a;
            int i13 = hashBiMap.f16740c;
            objArr[i13] = obj;
            hashBiMap.f16739b[i13] = obj3;
            hashBiMap.h(i13, iC2);
            hashBiMap.i(hashBiMap.f16740c, iC);
            int i14 = i12 == -2 ? hashBiMap.K : hashBiMap.N[i12];
            hashBiMap.n(i12, hashBiMap.f16740c);
            hashBiMap.n(hashBiMap.f16740c, i14);
            hashBiMap.f16740c++;
            hashBiMap.f16741d++;
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class EntrySet extends View<K, V, Map.Entry<K, V>> {
        @Override // com.google.common.collect.HashBiMap.View
        public final Object b(int i11) {
            return new EntryForKey(i11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            entry.getValue();
            Hashing.c(key);
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            entry.getValue();
            Hashing.c(key);
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Inverse<K, V> extends AbstractMap<V, K> implements BiMap<V, K>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public transient Set f16751a;

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            throw null;
        }

        @Override // com.google.common.collect.BiMap
        public final BiMap Z() {
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsValue(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set entrySet() {
            Set set = this.f16751a;
            if (set != null) {
                return set;
            }
            InverseEntrySet inverseEntrySet = new InverseEntrySet(null);
            this.f16751a = inverseEntrySet;
            return inverseEntrySet;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public final Collection values() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public final Set values() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class InverseEntrySet<K, V> extends View<K, V, Map.Entry<V, K>> {
        @Override // com.google.common.collect.HashBiMap.View
        public final Object b(int i11) {
            return new EntryForValue(this.f16752a, i11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            HashBiMap hashBiMap = this.f16752a;
            hashBiMap.getClass();
            int iG = hashBiMap.g(Hashing.c(key), key);
            return iG != -1 && Objects.a(hashBiMap.f16738a[iG], value);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iC = Hashing.c(key);
            HashBiMap hashBiMap = this.f16752a;
            int iG = hashBiMap.g(iC, key);
            if (iG == -1 || !Objects.a(hashBiMap.f16738a[iG], value)) {
                return false;
            }
            hashBiMap.j(iG, Hashing.c(hashBiMap.f16738a[iG]), iC);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class KeySet extends View<K, V, K> {
        @Override // com.google.common.collect.HashBiMap.View
        public final Object b(int i11) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Hashing.c(obj);
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class ValueSet extends View<K, V, V> {
        @Override // com.google.common.collect.HashBiMap.View
        public final Object b(int i11) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Hashing.c(obj);
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class View<K, V, T> extends AbstractSet<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashBiMap f16752a;

        public View(HashBiMap hashBiMap) {
            this.f16752a = hashBiMap;
        }

        public abstract Object b(int i11);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            this.f16752a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new Iterator<Object>() { // from class: com.google.common.collect.HashBiMap.View.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f16753a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f16754b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public int f16755c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public int f16756d;

                {
                    HashBiMap hashBiMap = View.this.f16752a;
                    this.f16753a = hashBiMap.K;
                    this.f16754b = -1;
                    this.f16755c = hashBiMap.f16741d;
                    this.f16756d = hashBiMap.f16740c;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    if (View.this.f16752a.f16741d == this.f16755c) {
                        return this.f16753a != -2 && this.f16756d > 0;
                    }
                    throw new ConcurrentModificationException();
                }

                @Override // java.util.Iterator
                public final Object next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    int i11 = this.f16753a;
                    View view = View.this;
                    Object objB = view.b(i11);
                    int i12 = this.f16753a;
                    this.f16754b = i12;
                    this.f16753a = view.f16752a.N[i12];
                    this.f16756d--;
                    return objB;
                }

                @Override // java.util.Iterator
                public final void remove() {
                    View view = View.this;
                    HashBiMap hashBiMap = view.f16752a;
                    if (view.f16752a.f16741d != this.f16755c) {
                        throw new ConcurrentModificationException();
                    }
                    CollectPreconditions.d(this.f16754b != -1);
                    int i11 = this.f16754b;
                    hashBiMap.k(i11, Hashing.c(hashBiMap.f16738a[i11]));
                    if (this.f16753a == hashBiMap.f16740c) {
                        this.f16753a = this.f16754b;
                    }
                    this.f16754b = -1;
                    this.f16755c = hashBiMap.f16741d;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f16752a.f16740c;
        }
    }

    public static int[] b(int i11) {
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i11 = objectInputStream.readInt();
        CollectPreconditions.b(16, "expectedSize");
        int iA = Hashing.a(16, 1.0d);
        this.f16740c = 0;
        this.f16738a = new Object[16];
        this.f16739b = new Object[16];
        this.f16742e = b(iA);
        this.f16743f = b(iA);
        this.f16744t = b(16);
        this.H = b(16);
        this.K = -2;
        this.L = -2;
        this.M = b(16);
        this.N = b(16);
        Serialization.b(this, objectInputStream, i11);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.e(this, objectOutputStream);
    }

    @Override // com.google.common.collect.BiMap
    public final BiMap Z() {
        return this.O;
    }

    public final int a(int i11) {
        return i11 & (this.f16742e.length - 1);
    }

    public final void c(int i11, int i12) {
        Preconditions.g(i11 != -1);
        int iA = a(i12);
        int[] iArr = this.f16742e;
        int i13 = iArr[iA];
        if (i13 == i11) {
            int[] iArr2 = this.f16744t;
            iArr[iA] = iArr2[i11];
            iArr2[i11] = -1;
            return;
        }
        int i14 = this.f16744t[i13];
        while (true) {
            int i15 = i13;
            i13 = i14;
            if (i13 == -1) {
                throw new AssertionError("Expected to find entry with key " + this.f16738a[i11]);
            }
            if (i13 == i11) {
                int[] iArr3 = this.f16744t;
                iArr3[i15] = iArr3[i11];
                iArr3[i11] = -1;
                return;
            }
            i14 = this.f16744t[i13];
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f16738a, 0, this.f16740c, (Object) null);
        Arrays.fill(this.f16739b, 0, this.f16740c, (Object) null);
        Arrays.fill(this.f16742e, -1);
        Arrays.fill(this.f16743f, -1);
        Arrays.fill(this.f16744t, 0, this.f16740c, -1);
        Arrays.fill(this.H, 0, this.f16740c, -1);
        Arrays.fill(this.M, 0, this.f16740c, -1);
        Arrays.fill(this.N, 0, this.f16740c, -1);
        this.f16740c = 0;
        this.K = -2;
        this.L = -2;
        this.f16741d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return f(Hashing.c(obj), obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return g(Hashing.c(obj), obj) != -1;
    }

    public final void d(int i11, int i12) {
        Preconditions.g(i11 != -1);
        int iA = a(i12);
        int[] iArr = this.f16743f;
        int i13 = iArr[iA];
        if (i13 == i11) {
            int[] iArr2 = this.H;
            iArr[iA] = iArr2[i11];
            iArr2[i11] = -1;
            return;
        }
        int i14 = this.H[i13];
        while (true) {
            int i15 = i13;
            i13 = i14;
            if (i13 == -1) {
                throw new AssertionError("Expected to find entry with value " + this.f16739b[i11]);
            }
            if (i13 == i11) {
                int[] iArr3 = this.H;
                iArr3[i15] = iArr3[i11];
                iArr3[i11] = -1;
                return;
            }
            i14 = this.H[i13];
        }
    }

    public final void e(int i11) {
        int[] iArr = this.f16744t;
        if (iArr.length < i11) {
            int iB = ImmutableCollection.Builder.b(iArr.length, i11);
            this.f16738a = Arrays.copyOf(this.f16738a, iB);
            this.f16739b = Arrays.copyOf(this.f16739b, iB);
            int[] iArr2 = this.f16744t;
            int length = iArr2.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr2, iB);
            Arrays.fill(iArrCopyOf, length, iB, -1);
            this.f16744t = iArrCopyOf;
            int[] iArr3 = this.H;
            int length2 = iArr3.length;
            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, iB);
            Arrays.fill(iArrCopyOf2, length2, iB, -1);
            this.H = iArrCopyOf2;
            int[] iArr4 = this.M;
            int length3 = iArr4.length;
            int[] iArrCopyOf3 = Arrays.copyOf(iArr4, iB);
            Arrays.fill(iArrCopyOf3, length3, iB, -1);
            this.M = iArrCopyOf3;
            int[] iArr5 = this.N;
            int length4 = iArr5.length;
            int[] iArrCopyOf4 = Arrays.copyOf(iArr5, iB);
            Arrays.fill(iArrCopyOf4, length4, iB, -1);
            this.N = iArrCopyOf4;
        }
        if (this.f16742e.length < i11) {
            int iA = Hashing.a(i11, 1.0d);
            this.f16742e = b(iA);
            this.f16743f = b(iA);
            for (int i12 = 0; i12 < this.f16740c; i12++) {
                int iA2 = a(Hashing.c(this.f16738a[i12]));
                int[] iArr6 = this.f16744t;
                int[] iArr7 = this.f16742e;
                iArr6[i12] = iArr7[iA2];
                iArr7[iA2] = i12;
                int iA3 = a(Hashing.c(this.f16739b[i12]));
                int[] iArr8 = this.H;
                int[] iArr9 = this.f16743f;
                iArr8[i12] = iArr9[iA3];
                iArr9[iA3] = i12;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return null;
    }

    public final int f(int i11, Object obj) {
        int[] iArr = this.f16742e;
        int[] iArr2 = this.f16744t;
        Object[] objArr = this.f16738a;
        for (int i12 = iArr[a(i11)]; i12 != -1; i12 = iArr2[i12]) {
            if (Objects.a(objArr[i12], obj)) {
                return i12;
            }
        }
        return -1;
    }

    public final int g(int i11, Object obj) {
        int[] iArr = this.f16743f;
        int[] iArr2 = this.H;
        Object[] objArr = this.f16739b;
        for (int i12 = iArr[a(i11)]; i12 != -1; i12 = iArr2[i12]) {
            if (Objects.a(objArr[i12], obj)) {
                return i12;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        int iF = f(Hashing.c(obj), obj);
        if (iF == -1) {
            return null;
        }
        return this.f16739b[iF];
    }

    public final void h(int i11, int i12) {
        Preconditions.g(i11 != -1);
        int iA = a(i12);
        int[] iArr = this.f16744t;
        int[] iArr2 = this.f16742e;
        iArr[i11] = iArr2[iA];
        iArr2[iA] = i11;
    }

    public final void i(int i11, int i12) {
        Preconditions.g(i11 != -1);
        int iA = a(i12);
        int[] iArr = this.H;
        int[] iArr2 = this.f16743f;
        iArr[i11] = iArr2[iA];
        iArr2[iA] = i11;
    }

    public final void j(int i11, int i12, int i13) {
        int i14;
        int i15;
        Preconditions.g(i11 != -1);
        c(i11, i12);
        d(i11, i13);
        n(this.M[i11], this.N[i11]);
        int i16 = this.f16740c - 1;
        if (i16 != i11) {
            int i17 = this.M[i16];
            int i18 = this.N[i16];
            n(i17, i11);
            n(i11, i18);
            Object[] objArr = this.f16738a;
            Object obj = objArr[i16];
            Object[] objArr2 = this.f16739b;
            Object obj2 = objArr2[i16];
            objArr[i11] = obj;
            objArr2[i11] = obj2;
            int iA = a(Hashing.c(obj));
            int[] iArr = this.f16742e;
            int i19 = iArr[iA];
            if (i19 == i16) {
                iArr[iA] = i11;
            } else {
                int i21 = this.f16744t[i19];
                while (true) {
                    i14 = i19;
                    i19 = i21;
                    if (i19 == i16) {
                        break;
                    } else {
                        i21 = this.f16744t[i19];
                    }
                }
                this.f16744t[i14] = i11;
            }
            int[] iArr2 = this.f16744t;
            iArr2[i11] = iArr2[i16];
            iArr2[i16] = -1;
            int iA2 = a(Hashing.c(obj2));
            int[] iArr3 = this.f16743f;
            int i22 = iArr3[iA2];
            if (i22 == i16) {
                iArr3[iA2] = i11;
            } else {
                int i23 = this.H[i22];
                while (true) {
                    i15 = i22;
                    i22 = i23;
                    if (i22 == i16) {
                        break;
                    } else {
                        i23 = this.H[i22];
                    }
                }
                this.H[i15] = i11;
            }
            int[] iArr4 = this.H;
            iArr4[i11] = iArr4[i16];
            iArr4[i16] = -1;
        }
        Object[] objArr3 = this.f16738a;
        int i24 = this.f16740c;
        objArr3[i24 - 1] = null;
        this.f16739b[i24 - 1] = null;
        this.f16740c = i24 - 1;
        this.f16741d++;
    }

    public final void k(int i11, int i12) {
        j(i11, i12, Hashing.c(this.f16739b[i11]));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return null;
    }

    public final void l(int i11, Object obj) {
        Preconditions.g(i11 != -1);
        int iF = f(Hashing.c(obj), obj);
        int i12 = this.L;
        if (iF != -1) {
            throw new IllegalArgumentException(p0.k(obj, "Key already present in map: "));
        }
        if (i12 == i11) {
            i12 = this.M[i11];
        } else if (i12 == this.f16740c) {
            i12 = iF;
        }
        if (-2 == i11) {
            iF = this.N[i11];
        } else if (-2 != this.f16740c) {
            iF = -2;
        }
        n(this.M[i11], this.N[i11]);
        c(i11, Hashing.c(this.f16738a[i11]));
        this.f16738a[i11] = obj;
        h(i11, Hashing.c(obj));
        n(i12, i11);
        n(i11, iF);
    }

    public final void m(int i11, Object obj) {
        Preconditions.g(i11 != -1);
        int iC = Hashing.c(obj);
        if (g(iC, obj) != -1) {
            throw new IllegalArgumentException(p0.k(obj, "Value already present in map: "));
        }
        d(i11, Hashing.c(this.f16739b[i11]));
        this.f16739b[i11] = obj;
        i(i11, iC);
    }

    public final void n(int i11, int i12) {
        if (i11 == -2) {
            this.K = i12;
        } else {
            this.N[i11] = i12;
        }
        if (i12 == -2) {
            this.L = i11;
        } else {
            this.M[i12] = i11;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iC = Hashing.c(obj);
        int iF = f(iC, obj);
        if (iF != -1) {
            Object obj3 = this.f16739b[iF];
            if (Objects.a(obj3, obj2)) {
                return obj2;
            }
            m(iF, obj2);
            return obj3;
        }
        int iC2 = Hashing.c(obj2);
        Preconditions.f("Value already present: %s", g(iC2, obj2) == -1, obj2);
        e(this.f16740c + 1);
        Object[] objArr = this.f16738a;
        int i11 = this.f16740c;
        objArr[i11] = obj;
        this.f16739b[i11] = obj2;
        h(i11, iC);
        i(this.f16740c, iC2);
        n(this.L, this.f16740c);
        n(this.f16740c, -2);
        this.f16740c++;
        this.f16741d++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int iC = Hashing.c(obj);
        int iF = f(iC, obj);
        if (iF == -1) {
            return null;
        }
        Object obj2 = this.f16739b[iF];
        k(iF, iC);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f16740c;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    public final Set values() {
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    public final Collection values() {
        return null;
    }
}
