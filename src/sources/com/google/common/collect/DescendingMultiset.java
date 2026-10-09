package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
abstract class DescendingMultiset<E> extends ForwardingMultiset<E> implements SortedMultiset<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Ordering f16699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient NavigableSet f16700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Set f16701c;

    public abstract SortedMultiset C0();

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset E0(Object obj, BoundType boundType) {
        return ((TreeMultiset) C0()).k0(obj, boundType).G();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset G() {
        return C0();
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public final Comparator comparator() {
        Ordering ordering = this.f16699a;
        if (ordering != null) {
            return ordering;
        }
        Ordering orderingG = Ordering.b(C0().comparator()).g();
        this.f16699a = orderingG;
        return orderingG;
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public final Set entrySet() {
        Set set = this.f16701c;
        if (set != null) {
            return set;
        }
        Multisets.EntrySet<Object> entrySet = new Multisets.EntrySet<Object>() { // from class: com.google.common.collect.DescendingMultiset.1EntrySetImpl
            @Override // com.google.common.collect.Multisets.EntrySet
            public final Multiset f() {
                return DescendingMultiset.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return DescendingMultiset.this.z0();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return DescendingMultiset.this.C0().entrySet().size();
            }
        };
        this.f16701c = entrySet;
        return entrySet;
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry firstEntry() {
        return C0().lastEntry();
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return Multisets.b(this);
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: j0 */
    public final Object o0() {
        return C0();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset k0(Object obj, BoundType boundType) {
        return ((TreeMultiset) C0()).E0(obj, boundType).G();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry lastEntry() {
        return C0().firstEntry();
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection
    public final Collection o0() {
        return C0();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry pollFirstEntry() {
        return C0().pollLastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry pollLastEntry() {
        return C0().pollFirstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset t1(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return C0().t1(obj2, boundType2, obj, boundType).G();
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return p0();
    }

    @Override // com.google.common.collect.ForwardingObject
    public final String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.ForwardingMultiset
    /* JADX INFO: renamed from: w0 */
    public final Multiset j0() {
        return C0();
    }

    public abstract Iterator z0();

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return ObjectArrays.c(this, objArr);
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public final NavigableSet c() {
        NavigableSet navigableSet = this.f16700b;
        if (navigableSet != null) {
            return navigableSet;
        }
        SortedMultisets.NavigableElementSet navigableElementSet = new SortedMultisets.NavigableElementSet(this);
        this.f16700b = navigableElementSet;
        return navigableElementSet;
    }
}
