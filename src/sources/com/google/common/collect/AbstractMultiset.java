package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractMultiset<E> extends AbstractCollection<E> implements Multiset<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Set f16610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Set f16611b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class ElementSet extends Multisets.ElementSet<E> {
        public ElementSet() {
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        public final Multiset f() {
            return AbstractMultiset.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return AbstractMultiset.this.f();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class EntrySet extends Multisets.EntrySet<E> {
        public EntrySet() {
        }

        @Override // com.google.common.collect.Multisets.EntrySet
        public Multiset f() {
            return AbstractMultiset.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return AbstractMultiset.this.g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return AbstractMultiset.this.e();
        }
    }

    public boolean J(int i11, Object obj) {
        CollectPreconditions.b(i11, "oldCount");
        CollectPreconditions.b(0, "newCount");
        if (q0(obj) != i11) {
            return false;
        }
        w1(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        add(1, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (!(collection instanceof Multiset)) {
            if (collection.isEmpty()) {
                return false;
            }
            return Iterators.a(this, collection.iterator());
        }
        Multiset multiset = (Multiset) collection;
        if (!(multiset instanceof AbstractMapBasedMultiset)) {
            if (multiset.isEmpty()) {
                return false;
            }
            for (Multiset.Entry entry : multiset.entrySet()) {
                add(entry.getCount(), entry.a());
            }
            return true;
        }
        AbstractMapBasedMultiset abstractMapBasedMultiset = (AbstractMapBasedMultiset) multiset;
        if (abstractMapBasedMultiset.isEmpty()) {
            return false;
        }
        for (int iC = abstractMapBasedMultiset.f16595c.c(); iC >= 0; iC = abstractMapBasedMultiset.f16595c.k(iC)) {
            add(abstractMapBasedMultiset.f16595c.f(iC), abstractMapBasedMultiset.f16595c.e(iC));
        }
        return true;
    }

    public Set b() {
        return new ElementSet();
    }

    @Override // com.google.common.collect.Multiset
    public Set c() {
        Set set = this.f16610a;
        if (set != null) {
            return set;
        }
        Set setB = b();
        this.f16610a = setB;
        return setB;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return q0(obj) > 0;
    }

    public Set d() {
        return new EntrySet();
    }

    public abstract int e();

    @Override // com.google.common.collect.Multiset
    public Set entrySet() {
        Set set = this.f16611b;
        if (set != null) {
            return set;
        }
        Set setD = d();
        this.f16611b = setD;
        return setD;
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final boolean equals(Object obj) {
        return Multisets.a(this, obj);
    }

    public abstract Iterator f();

    public abstract Iterator g();

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return u0(1, obj) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).c();
        }
        return c().removeAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).c();
        }
        return c().retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }

    public int u0(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }

    public int w1(Object obj) {
        CollectPreconditions.b(0, "count");
        int iQ0 = q0(obj);
        int i11 = 0 - iQ0;
        if (i11 > 0) {
            add(i11, obj);
            return iQ0;
        }
        if (i11 < 0) {
            u0(-i11, obj);
        }
        return iQ0;
    }

    public int add(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }
}
