package com.google.common.collect;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class DescendingImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final transient ImmutableSortedMultiset f16697t;

    public DescendingImmutableSortedMultiset(ImmutableSortedMultiset immutableSortedMultiset) {
        this.f16697t = immutableSortedMultiset;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public final SortedMultiset G() {
        return this.f16697t;
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry firstEntry() {
        return this.f16697t.lastEntry();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean h() {
        return this.f16697t.h();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry lastEntry() {
        return this.f16697t.firstEntry();
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public final Multiset.Entry n(int i11) {
        return (Multiset.Entry) this.f16697t.entrySet().b().x().get(i11);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset
    /* JADX INFO: renamed from: o */
    public final ImmutableSortedMultiset G() {
        return this.f16697t;
    }

    @Override // com.google.common.collect.Multiset
    public final int q0(Object obj) {
        return this.f16697t.q0(obj);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedSet c() {
        return this.f16697t.c().descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMultiset k0(Object obj, BoundType boundType) {
        return this.f16697t.E0(obj, boundType).G();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f16697t.size();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMultiset E0(Object obj, BoundType boundType) {
        return this.f16697t.k0(obj, boundType).G();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
