package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class UnmodifiableSortedMultiset<E> extends Multisets.UnmodifiableMultiset<E> implements SortedMultiset<E> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient UnmodifiableSortedMultiset f17303d;

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset E0(Object obj, BoundType boundType) {
        SortedMultiset sortedMultisetE0 = ((SortedMultiset) this.f17109a).E0(obj, boundType);
        sortedMultisetE0.getClass();
        return new UnmodifiableSortedMultiset(sortedMultisetE0);
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset G() {
        UnmodifiableSortedMultiset unmodifiableSortedMultiset = this.f17303d;
        if (unmodifiableSortedMultiset != null) {
            return unmodifiableSortedMultiset;
        }
        UnmodifiableSortedMultiset unmodifiableSortedMultiset2 = new UnmodifiableSortedMultiset(((SortedMultiset) this.f17109a).G());
        unmodifiableSortedMultiset2.f17303d = this;
        this.f17303d = unmodifiableSortedMultiset2;
        return unmodifiableSortedMultiset2;
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public final Comparator comparator() {
        return ((SortedMultiset) this.f17109a).comparator();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry firstEntry() {
        return ((SortedMultiset) this.f17109a).firstEntry();
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final Object j0() {
        return (SortedMultiset) this.f17109a;
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset k0(Object obj, BoundType boundType) {
        SortedMultiset sortedMultisetK0 = ((SortedMultiset) this.f17109a).k0(obj, boundType);
        sortedMultisetK0.getClass();
        return new UnmodifiableSortedMultiset(sortedMultisetK0);
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry lastEntry() {
        return ((SortedMultiset) this.f17109a).lastEntry();
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection
    /* JADX INFO: renamed from: o0 */
    public final Collection j0() {
        return (SortedMultiset) this.f17109a;
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset t1(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        SortedMultiset sortedMultisetT1 = ((SortedMultiset) this.f17109a).t1(obj, boundType, obj2, boundType2);
        sortedMultisetT1.getClass();
        return new UnmodifiableSortedMultiset(sortedMultisetT1);
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset
    /* JADX INFO: renamed from: w0 */
    public final Multiset j0() {
        return (SortedMultiset) this.f17109a;
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset
    public final Set z0() {
        return Sets.i(((SortedMultiset) this.f17109a).c());
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public final NavigableSet c() {
        return (NavigableSet) super.c();
    }
}
