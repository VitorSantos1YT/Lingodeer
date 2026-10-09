package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractMapBasedMultiset<E> extends AbstractMultiset<E> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient ObjectCountHashMap f16595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient long f16596d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public abstract class Itr<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16600b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16601c;

        public Itr() {
            this.f16599a = AbstractMapBasedMultiset.this.f16595c.c();
            this.f16601c = AbstractMapBasedMultiset.this.f16595c.f17121d;
        }

        public abstract Object a(int i11);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (AbstractMapBasedMultiset.this.f16595c.f17121d == this.f16601c) {
                return this.f16599a >= 0;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object objA = a(this.f16599a);
            int i11 = this.f16599a;
            this.f16600b = i11;
            this.f16599a = AbstractMapBasedMultiset.this.f16595c.k(i11);
            return objA;
        }

        @Override // java.util.Iterator
        public final void remove() {
            AbstractMapBasedMultiset abstractMapBasedMultiset = AbstractMapBasedMultiset.this;
            if (abstractMapBasedMultiset.f16595c.f17121d != this.f16601c) {
                throw new ConcurrentModificationException();
            }
            CollectPreconditions.d(this.f16600b != -1);
            abstractMapBasedMultiset.f16596d -= (long) abstractMapBasedMultiset.f16595c.o(this.f16600b);
            this.f16599a = abstractMapBasedMultiset.f16595c.l(this.f16599a, this.f16600b);
            this.f16600b = -1;
            this.f16601c = abstractMapBasedMultiset.f16595c.f17121d;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i11 = objectInputStream.readInt();
        this.f16595c = h(3);
        Serialization.d(this, objectInputStream, i11);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.g(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final boolean J(int i11, Object obj) {
        CollectPreconditions.b(i11, "oldCount");
        CollectPreconditions.b(0, "newCount");
        int iG = this.f16595c.g(obj);
        if (iG == -1) {
            if (i11 == 0) {
                return true;
            }
        } else if (this.f16595c.f(iG) == i11) {
            this.f16595c.o(iG);
            this.f16596d -= (long) i11;
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int add(int i11, Object obj) {
        if (i11 == 0) {
            return this.f16595c.d(obj);
        }
        Preconditions.b(i11, "occurrences cannot be negative: %s", i11 > 0);
        int iG = this.f16595c.g(obj);
        if (iG == -1) {
            this.f16595c.m(i11, obj);
            this.f16596d += (long) i11;
            return 0;
        }
        int iF = this.f16595c.f(iG);
        long j11 = i11;
        long j12 = ((long) iF) + j11;
        Preconditions.d(j12, "too many occurrences: %s", j12 <= 2147483647L);
        ObjectCountHashMap objectCountHashMap = this.f16595c;
        Preconditions.i(iG, objectCountHashMap.f17120c);
        objectCountHashMap.f17119b[iG] = (int) j12;
        this.f16596d += j11;
        return iF;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f16595c.a();
        this.f16596d = 0L;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final int e() {
        return this.f16595c.f17120c;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator f() {
        return new AbstractMapBasedMultiset<Object>.Itr<Object>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.1
            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            public final Object a(int i11) {
                return AbstractMapBasedMultiset.this.f16595c.e(i11);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator g() {
        return new AbstractMapBasedMultiset<Object>.Itr<Multiset.Entry<Object>>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.2
            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            public final Object a(int i11) {
                ObjectCountHashMap objectCountHashMap = AbstractMapBasedMultiset.this.f16595c;
                Preconditions.i(i11, objectCountHashMap.f17120c);
                return new ObjectCountHashMap.MapEntry(i11);
            }
        };
    }

    public abstract ObjectCountHashMap h(int i11);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return Multisets.b(this);
    }

    @Override // com.google.common.collect.Multiset
    public final int q0(Object obj) {
        return this.f16595c.d(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return Ints.e(this.f16596d);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int u0(int i11, Object obj) {
        if (i11 == 0) {
            return this.f16595c.d(obj);
        }
        Preconditions.b(i11, "occurrences cannot be negative: %s", i11 > 0);
        int iG = this.f16595c.g(obj);
        if (iG == -1) {
            return 0;
        }
        int iF = this.f16595c.f(iG);
        if (iF > i11) {
            ObjectCountHashMap objectCountHashMap = this.f16595c;
            Preconditions.i(iG, objectCountHashMap.f17120c);
            objectCountHashMap.f17119b[iG] = iF - i11;
        } else {
            this.f16595c.o(iG);
            i11 = iF;
        }
        this.f16596d -= (long) i11;
        return iF;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int w1(Object obj) {
        CollectPreconditions.b(0, "count");
        ObjectCountHashMap objectCountHashMap = this.f16595c;
        objectCountHashMap.getClass();
        int iN = objectCountHashMap.n(Hashing.c(obj), obj);
        this.f16596d += (long) (0 - iN);
        return iN;
    }
}
