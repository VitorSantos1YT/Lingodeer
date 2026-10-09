package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class RegularImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {
    public static final long[] M = {0};
    public static final ImmutableSortedMultiset N = new RegularImmutableSortedMultiset(NaturalOrdering.f17113c);
    public final transient long[] H;
    public final transient int K;
    public final transient int L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final transient RegularImmutableSortedSet f17174t;

    public RegularImmutableSortedMultiset(Comparator comparator) {
        this.f17174t = ImmutableSortedSet.z(comparator);
        this.H = M;
        this.K = 0;
        this.L = 0;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public final NavigableSet c() {
        return this.f17174t;
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return n(0);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean h() {
        if (this.K <= 0) {
            if (this.L >= this.H.length - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset
    /* JADX INFO: renamed from: l */
    public final ImmutableSet c() {
        return this.f17174t;
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return n(this.L - 1);
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public final Multiset.Entry n(int i11) {
        E e8 = this.f17174t.f17176f.get(i11);
        int i12 = this.K + i11;
        long[] jArr = this.H;
        return new Multisets.ImmutableEntry(e8, (int) (jArr[i12 + 1] - jArr[i12]));
    }

    @Override // com.google.common.collect.Multiset
    public final int q0(Object obj) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.f17174t;
        regularImmutableSortedSet.getClass();
        int i11 = -1;
        if (obj != null) {
            try {
                int iBinarySearch = Collections.binarySearch(regularImmutableSortedSet.f17176f, obj, regularImmutableSortedSet.f16869d);
                if (iBinarySearch >= 0) {
                    i11 = iBinarySearch;
                }
            } catch (ClassCastException unused) {
            }
        }
        if (i11 < 0) {
            return 0;
        }
        int i12 = this.K + i11;
        long[] jArr = this.H;
        return (int) (jArr[i12 + 1] - jArr[i12]);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset
    /* JADX INFO: renamed from: r */
    public final ImmutableSortedSet c() {
        return this.f17174t;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    /* JADX INFO: renamed from: s */
    public final ImmutableSortedMultiset k0(Object obj, BoundType boundType) {
        boundType.getClass();
        return u(0, this.f17174t.T(obj, boundType == BoundType.CLOSED));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i11 = this.L;
        int i12 = this.K;
        long[] jArr = this.H;
        return Ints.e(jArr[i11 + i12] - jArr[i12]);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    /* JADX INFO: renamed from: t */
    public final ImmutableSortedMultiset E0(Object obj, BoundType boundType) {
        boundType.getClass();
        return u(this.f17174t.W(obj, boundType == BoundType.CLOSED), this.L);
    }

    public final ImmutableSortedMultiset u(int i11, int i12) {
        int i13 = this.L;
        Preconditions.m(i11, i12, i13);
        RegularImmutableSortedSet regularImmutableSortedSet = this.f17174t;
        if (i11 == i12) {
            Comparator comparator = regularImmutableSortedSet.f16869d;
            return NaturalOrdering.f17113c.equals(comparator) ? N : new RegularImmutableSortedMultiset(comparator);
        }
        if (i11 == 0 && i12 == i13) {
            return this;
        }
        return new RegularImmutableSortedMultiset(regularImmutableSortedSet.R(i11, i12), this.H, this.K + i11, i12 - i11);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public final Set c() {
        return this.f17174t;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public final SortedSet c() {
        return this.f17174t;
    }

    public RegularImmutableSortedMultiset(RegularImmutableSortedSet regularImmutableSortedSet, long[] jArr, int i11, int i12) {
        this.f17174t = regularImmutableSortedSet;
        this.H = jArr;
        this.K = i11;
        this.L = i12;
    }
}
