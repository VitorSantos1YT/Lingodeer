package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.lang.Comparable;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ContiguousSet<C extends Comparable> extends ImmutableSortedSet<C> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f16677f = 0;

    public ContiguousSet() {
        super(NaturalOrdering.f17113c);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: A */
    public final ImmutableSortedSet headSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return E(comparable, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: D */
    public final ImmutableSortedSet headSet(Object obj, boolean z11) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return E(comparable, z11);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: L */
    public final ImmutableSortedSet subSet(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        Preconditions.g(this.f16869d.compare(comparable, comparable2) <= 0);
        return N(comparable, true, comparable2, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: M */
    public final ImmutableSortedSet subSet(Object obj, boolean z11, Object obj2, boolean z12) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        Preconditions.g(this.f16869d.compare(comparable, comparable2) <= 0);
        return N(comparable, z11, comparable2, z12);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: O */
    public final ImmutableSortedSet tailSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return Q(comparable, true);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: P */
    public final ImmutableSortedSet tailSet(Object obj, boolean z11) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return Q(comparable, z11);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: R */
    public abstract ContiguousSet E(Comparable comparable, boolean z11);

    public abstract Range T();

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: W */
    public abstract ContiguousSet N(Comparable comparable, boolean z11, Comparable comparable2, boolean z12);

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: X */
    public abstract ContiguousSet Q(Comparable comparable, boolean z11);

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z11) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return E(comparable, z11);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z11, Object obj2, boolean z12) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        Preconditions.g(this.f16869d.compare(comparable, comparable2) <= 0);
        return N(comparable, z11, comparable2, z12);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z11) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return Q(comparable, z11);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return T().toString();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet v() {
        return new DescendingImmutableSortedSet(this);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return E(comparable, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return Q(comparable, true);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        Preconditions.g(this.f16869d.compare(comparable, comparable2) <= 0);
        return N(comparable, true, comparable2, false);
    }
}
