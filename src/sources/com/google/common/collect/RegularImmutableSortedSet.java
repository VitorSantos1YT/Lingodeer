package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class RegularImmutableSortedSet<E> extends ImmutableSortedSet<E> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final RegularImmutableSortedSet f17175t;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient ImmutableList f17176f;

    static {
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        f17175t = new RegularImmutableSortedSet(RegularImmutableList.f17147e, NaturalOrdering.f17113c);
    }

    public RegularImmutableSortedSet(ImmutableList immutableList, Comparator comparator) {
        super(comparator);
        this.f17176f = immutableList;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet E(Object obj, boolean z11) {
        return R(0, T(obj, z11));
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet N(Object obj, boolean z11, Object obj2, boolean z12) {
        return Q(obj, z11).E(obj2, z12);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet Q(Object obj, boolean z11) {
        return R(W(obj, z11), this.f17176f.size());
    }

    public final RegularImmutableSortedSet R(int i11, int i12) {
        ImmutableList immutableList = this.f17176f;
        if (i11 == 0 && i12 == immutableList.size()) {
            return this;
        }
        Comparator comparator = this.f16869d;
        return i11 < i12 ? new RegularImmutableSortedSet(immutableList.subList(i11, i12), comparator) : ImmutableSortedSet.z(comparator);
    }

    public final int T(Object obj, boolean z11) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f17176f, obj, this.f16869d);
        if (iBinarySearch >= 0) {
            return z11 ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public final int W(Object obj, boolean z11) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f17176f, obj, this.f16869d);
        if (iBinarySearch >= 0) {
            return z11 ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public final ImmutableList b() {
        return this.f17176f;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iW = W(obj, true);
        ImmutableList immutableList = this.f17176f;
        if (iW == immutableList.size()) {
            return null;
        }
        return immutableList.get(iW);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f17176f, obj, this.f16869d) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).c();
        }
        Comparator comparator = this.f16869d;
        if (!SortedIterables.a(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        UnmodifiableIterator it = iterator();
        Iterator<E> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        E next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int d(int i11, Object[] objArr) {
        return this.f17176f.d(i11, objArr);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] e() {
        return this.f17176f.e();
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.f17176f.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.f16869d;
        if (!SortedIterables.a(comparator, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            UnmodifiableIterator it2 = iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                E next2 = it.next();
                if (next2 == null || comparator.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int f() {
        return this.f17176f.f();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f17176f.get(0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iT = T(obj, true) - 1;
        if (iT == -1) {
            return null;
        }
        return this.f17176f.get(iT);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int g() {
        return this.f17176f.g();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean h() {
        return this.f17176f.h();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object higher(Object obj) {
        int iW = W(obj, false);
        ImmutableList immutableList = this.f17176f;
        if (iW == immutableList.size()) {
            return null;
        }
        return immutableList.get(iW);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: j */
    public final UnmodifiableIterator iterator() {
        return this.f17176f.listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        ImmutableList immutableList = this.f17176f;
        return immutableList.get(immutableList.size() - 1);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iT = T(obj, false) - 1;
        if (iT == -1) {
            return null;
        }
        return this.f17176f.get(iT);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f17176f.size();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet v() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f16869d);
        return isEmpty() ? ImmutableSortedSet.z(comparatorReverseOrder) : new RegularImmutableSortedSet(this.f17176f.x(), comparatorReverseOrder);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    /* JADX INFO: renamed from: w */
    public final UnmodifiableIterator descendingIterator() {
        return this.f17176f.x().listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
