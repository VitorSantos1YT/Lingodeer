package com.google.common.collect;

import com.google.android.gms.internal.measurement.zzmv;
import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ImmutableSortedSet<E> extends ImmutableSet<E> implements NavigableSet<E>, SortedIterable<E> {
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Comparator f16869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient ImmutableSortedSet f16870e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder<E> extends ImmutableSet.Builder<E> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Comparator f16871f;

        public Builder(Comparator comparator) {
            comparator.getClass();
            this.f16871f = comparator;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        /* JADX INFO: renamed from: a */
        public final ImmutableCollection.Builder c(Object obj) {
            super.a(obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder
        public final ImmutableCollection.ArrayBasedBuilder c(Object obj) {
            super.a(obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder
        /* JADX INFO: renamed from: h */
        public final ImmutableSet.Builder a(Object obj) {
            super.a(obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder
        public final ImmutableSet.Builder i(Object[] objArr) {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder
        public final ImmutableSet.Builder j(Iterable iterable) {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder
        public final ImmutableSet.Builder l(ImmutableSet.Builder builder) {
            super.l(builder);
            return this;
        }

        public final void m(zzmv zzmvVar) {
            super.a(zzmvVar);
        }

        public final void n(Object... objArr) {
            super.i(objArr);
        }

        @Override // com.google.common.collect.ImmutableSet.Builder
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final ImmutableSortedSet k() {
            ImmutableSortedSet immutableSortedSetU = ImmutableSortedSet.u(this.f16871f, this.f16763b, this.f16762a);
            this.f16763b = ((RegularImmutableSortedSet) immutableSortedSetU).f17176f.size();
            this.f16764c = true;
            return immutableSortedSetU;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SerializedForm<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Comparator f16872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object[] f16873b;

        public SerializedForm(Comparator comparator, Object[] objArr) {
            this.f16872a = comparator;
            this.f16873b = objArr;
        }

        public Object readResolve() {
            Builder builder = new Builder(this.f16872a);
            builder.n(this.f16873b);
            return builder.k();
        }
    }

    public ImmutableSortedSet(Comparator comparator) {
        this.f16869d = comparator;
    }

    public static Builder H() {
        return new Builder(NaturalOrdering.f17113c);
    }

    public static ImmutableSortedSet K() {
        return RegularImmutableSortedSet.f17175t;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static ImmutableSortedSet u(Comparator comparator, int i11, Object... objArr) {
        if (i11 == 0) {
            return z(comparator);
        }
        ObjectArrays.a(i11, objArr);
        Arrays.sort(objArr, 0, i11, comparator);
        int i12 = 1;
        for (int i13 = 1; i13 < i11; i13++) {
            Object obj = objArr[i13];
            if (comparator.compare(obj, objArr[i12 - 1]) != 0) {
                objArr[i12] = obj;
                i12++;
            }
        }
        Arrays.fill(objArr, i12, i11, (Object) null);
        if (i12 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new RegularImmutableSortedSet(ImmutableList.k(i12, objArr), comparator);
    }

    public static RegularImmutableSortedSet z(Comparator comparator) {
        return NaturalOrdering.f17113c.equals(comparator) ? RegularImmutableSortedSet.f17175t : new RegularImmutableSortedSet(RegularImmutableList.f17147e, comparator);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet headSet(Object obj, boolean z11) {
        obj.getClass();
        return E(obj, z11);
    }

    public abstract ImmutableSortedSet E(Object obj, boolean z11);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet subSet(Object obj, boolean z11, Object obj2, boolean z12) {
        obj.getClass();
        obj2.getClass();
        Preconditions.g(this.f16869d.compare(obj, obj2) <= 0);
        return N(obj, z11, obj2, z12);
    }

    public abstract ImmutableSortedSet N(Object obj, boolean z11, Object obj2, boolean z12);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet tailSet(Object obj, boolean z11) {
        obj.getClass();
        return Q(obj, z11);
    }

    public abstract ImmutableSortedSet Q(Object obj, boolean z11);

    public Object ceiling(Object obj) {
        return Iterators.h(tailSet(obj, true).iterator(), null);
    }

    @Override // java.util.SortedSet, com.google.common.collect.SortedIterable
    public final Comparator comparator() {
        return this.f16869d;
    }

    public Object first() {
        return iterator().next();
    }

    public Object floor(Object obj) {
        return Iterators.h(headSet(obj, true).descendingIterator(), null);
    }

    public Object higher(Object obj) {
        return Iterators.h(tailSet(obj, false).iterator(), null);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public Object last() {
        return descendingIterator().next();
    }

    public Object lower(Object obj) {
        return Iterators.h(headSet(obj, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public abstract ImmutableSortedSet v();

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: w */
    public abstract UnmodifiableIterator descendingIterator();

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this.f16869d, toArray(ImmutableCollection.f16761a));
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet descendingSet() {
        ImmutableSortedSet immutableSortedSet = this.f16870e;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        ImmutableSortedSet immutableSortedSetV = v();
        this.f16870e = immutableSortedSetV;
        immutableSortedSetV.f16870e = this;
        return immutableSortedSetV;
    }
}
