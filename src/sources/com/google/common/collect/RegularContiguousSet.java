package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class RegularContiguousSet<C extends Comparable> extends ContiguousSet<C> {
    public static final /* synthetic */ int H = 0;
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Range f17139t;

    /* JADX INFO: renamed from: com.google.common.collect.RegularContiguousSet$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass3 extends ImmutableAsList<Comparable> {
        @Override // com.google.common.collect.ImmutableAsList
        public final ImmutableCollection D() {
            return null;
        }

        @Override // java.util.List
        public final Object get(int i11) {
            Preconditions.i(i11, size());
            throw null;
        }

        @Override // com.google.common.collect.ImmutableAsList, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SerializedForm<C extends Comparable> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Range f17142a;

        public SerializedForm(Range range) {
            this.f17142a = range;
        }

        private Object readResolve() {
            return new RegularContiguousSet(this.f17142a);
        }
    }

    public RegularContiguousSet(Range range) {
        this.f17139t = range;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final ContiguousSet E(Comparable comparable, boolean z11) {
        return Z(Range.h(comparable, BoundType.a(z11)));
    }

    @Override // com.google.common.collect.ContiguousSet
    public final Range T() {
        BoundType boundType = BoundType.CLOSED;
        Range range = this.f17139t;
        return new Range(range.f17135a.m(boundType), range.f17136b.n(boundType));
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final ContiguousSet N(Comparable comparable, boolean z11, Comparable comparable2, boolean z12) {
        return (comparable.compareTo(comparable2) != 0 || z11 || z12) ? Z(Range.g(comparable, BoundType.a(z11), comparable2, BoundType.a(z12))) : new EmptyContiguousSet();
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final ContiguousSet Q(Comparable comparable, boolean z11) {
        return Z(Range.b(comparable, BoundType.a(z11)));
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final Comparable first() {
        Comparable comparableJ = this.f17139t.f17135a.j();
        Objects.requireNonNull(comparableJ);
        return comparableJ;
    }

    public final ContiguousSet Z(Range range) {
        Range range2 = this.f17139t;
        if (!range2.e(range)) {
            return new EmptyContiguousSet();
        }
        range2.d(range);
        throw null;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final Comparable last() {
        Comparable comparableG = this.f17139t.f17136b.g();
        Objects.requireNonNull(comparableG);
        return comparableG;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.f17139t.a((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return Collections2.a(this, collection);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RegularContiguousSet) {
            throw null;
        }
        return super.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean h() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return Sets.e(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: j */
    public final UnmodifiableIterator iterator() {
        return new AbstractSequentialIterator<Comparable>(this, first()) { // from class: com.google.common.collect.RegularContiguousSet.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Comparable f17140b;

            {
                this.f17140b = this.last();
            }

            @Override // com.google.common.collect.AbstractSequentialIterator
            public final Object a(Object obj) {
                Comparable comparable = (Comparable) obj;
                int i11 = RegularContiguousSet.H;
                Comparable comparable2 = this.f17140b;
                if (comparable2 == null) {
                    throw null;
                }
                Range range = Range.f17134c;
                if (comparable.compareTo(comparable2) == 0) {
                    return null;
                }
                throw null;
            }
        };
    }

    @Override // com.google.common.collect.ImmutableSet
    public final ImmutableList o() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        first();
        last();
        throw null;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final UnmodifiableIterator descendingIterator() {
        return new AbstractSequentialIterator<Comparable>(this, last()) { // from class: com.google.common.collect.RegularContiguousSet.2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Comparable f17141b;

            {
                this.f17141b = this.first();
            }

            @Override // com.google.common.collect.AbstractSequentialIterator
            public final Object a(Object obj) {
                Comparable comparable = (Comparable) obj;
                int i11 = RegularContiguousSet.H;
                Comparable comparable2 = this.f17141b;
                if (comparable2 == null) {
                    throw null;
                }
                Range range = Range.f17134c;
                if (comparable.compareTo(comparable2) == 0) {
                    return null;
                }
                throw null;
            }
        };
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this.f17139t);
    }
}
