package com.google.common.collect;

import com.google.common.base.MoreObjects;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public class TreeRangeSet<C extends Comparable<?>> extends AbstractRangeSet<C> implements Serializable {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class AsRanges extends ForwardingCollection<Range<C>> implements Set<Range<C>> {
        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return Sets.b(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return Sets.e(this);
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final Object j0() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingCollection
        /* JADX INFO: renamed from: o0 */
        public final Collection j0() {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class Complement extends TreeRangeSet<C> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ComplementRangesByLowerBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NavigableMap f17292a = new RangesByUpperBound();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Range f17293b;

        public ComplementRangesByLowerBound(Range range) {
            this.f17293b = range;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final Iterator a() {
            Collection collectionValues;
            Range range = this.f17293b;
            Cut cut = range.f17135a;
            Cut cut2 = Cut.BelowAll.f16681b;
            Map map = this.f17292a;
            if (cut != cut2) {
                collectionValues = ((RangesByUpperBound) map).tailMap((Cut) cut.f(), range.f17135a.k() == BoundType.CLOSED).values();
            } else {
                collectionValues = ((AbstractMap) map).values();
            }
            PeekingIterator peekingIteratorI = Iterators.i(collectionValues.iterator());
            if (!range.a(cut2) || (peekingIteratorI.hasNext() && ((Range) ((Iterators.PeekingImpl) peekingIteratorI).a()).f17135a == cut2)) {
                if (!peekingIteratorI.hasNext()) {
                    return Iterators.ArrayItr.f16895d;
                }
                cut2 = ((Range) peekingIteratorI.next()).f17136b;
            }
            return new AbstractIterator<Map.Entry<Cut<Comparable<?>>, Range<Comparable<?>>>>(this, cut2, peekingIteratorI) { // from class: com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound.1

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Cut f17294c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ PeekingIterator f17295d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ ComplementRangesByLowerBound f17296e;

                {
                    this.f17295d = peekingIteratorI;
                    this.f17296e = this;
                    this.f17294c = cut2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.collect.AbstractIterator
                public final Object a() {
                    Range range2;
                    if (!this.f17296e.f17293b.f17136b.h(this.f17294c)) {
                        Cut cut3 = this.f17294c;
                        Cut.AboveAll aboveAll = Cut.AboveAll.f16680b;
                        if (cut3 != aboveAll) {
                            PeekingIterator peekingIterator = this.f17295d;
                            if (peekingIterator.hasNext()) {
                                Range range3 = (Range) peekingIterator.next();
                                range2 = new Range(this.f17294c, range3.f17135a);
                                this.f17294c = range3.f17136b;
                            } else {
                                range2 = new Range(this.f17294c, aboveAll);
                                this.f17294c = aboveAll;
                            }
                            return new ImmutableEntry(range2.f17135a, range2);
                        }
                    }
                    this.f16559a = AbstractIterator.State.DONE;
                    return null;
                }
            };
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractNavigableMap
        public final Iterator b() {
            Range range = this.f17293b;
            boolean zC = range.c();
            Cut cut = range.f17136b;
            PeekingIterator peekingIteratorI = Iterators.i(((RangesByUpperBound) this.f17292a).headMap(zC ? (Cut) cut.f() : Cut.AboveAll.f16680b, range.c() && cut.l() == BoundType.CLOSED).descendingMap().values().iterator());
            if (!peekingIteratorI.hasNext()) {
                if (range.a(Cut.BelowAll.f16681b)) {
                    throw null;
                }
                return Iterators.ArrayItr.f16895d;
            }
            Iterators.PeekingImpl peekingImpl = (Iterators.PeekingImpl) peekingIteratorI;
            Cut cut2 = ((Range) peekingImpl.a()).f17136b;
            Cut.AboveAll aboveAll = Cut.AboveAll.f16680b;
            if (cut2 == aboveAll) {
                return new AbstractIterator<Map.Entry<Cut<Comparable<?>>, Range<Comparable<?>>>>(this, (Cut) MoreObjects.a(((Range) peekingIteratorI.next()).f17135a, aboveAll), peekingIteratorI) { // from class: com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound.2

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public Cut f17297c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ PeekingIterator f17298d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ ComplementRangesByLowerBound f17299e;

                    {
                        this.f17298d = peekingIteratorI;
                        this.f17299e = this;
                        this.f17297c = cut;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.common.collect.AbstractIterator
                    public final Object a() {
                        Range range2 = this.f17299e.f17293b;
                        Cut cut3 = this.f17297c;
                        Cut.BelowAll belowAll = Cut.BelowAll.f16681b;
                        if (cut3 == belowAll) {
                            this.f16559a = AbstractIterator.State.DONE;
                            return null;
                        }
                        PeekingIterator peekingIterator = this.f17298d;
                        if (peekingIterator.hasNext()) {
                            Range range3 = (Range) peekingIterator.next();
                            Range range4 = new Range(range3.f17136b, this.f17297c);
                            this.f17297c = range3.f17135a;
                            Cut cut4 = range2.f17135a;
                            Cut cut5 = range4.f17135a;
                            if (cut4.h(cut5)) {
                                return new ImmutableEntry(cut5, range4);
                            }
                        } else if (range2.f17135a.h(belowAll)) {
                            Range range5 = new Range(belowAll, this.f17297c);
                            this.f17297c = belowAll;
                            return new ImmutableEntry(belowAll, range5);
                        }
                        this.f16559a = AbstractIterator.State.DONE;
                        return null;
                    }
                };
            }
            Cut cut3 = ((Range) peekingImpl.a()).f17136b;
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Range get(Object obj) {
            if (!(obj instanceof Cut)) {
                return null;
            }
            try {
                Cut cut = (Cut) obj;
                Map.Entry entryFirstEntry = d(Range.b(cut, BoundType.a(true))).firstEntry();
                if (entryFirstEntry == null || !((Cut) entryFirstEntry.getKey()).equals(cut)) {
                    return null;
                }
                return (Range) entryFirstEntry.getValue();
            } catch (ClassCastException unused) {
                return null;
            }
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return NaturalOrdering.f17113c;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        public final NavigableMap d(Range range) {
            Range range2 = this.f17293b;
            return !range2.e(range) ? ImmutableSortedMap.f16849t : new ComplementRangesByLowerBound(range.d(range2));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z11) {
            return d(Range.h((Cut) obj, BoundType.a(z11)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return Iterators.l(a());
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z11, Object obj2, boolean z12) {
            return d(Range.g((Cut) obj, BoundType.a(z11), (Cut) obj2, BoundType.a(z12)));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z11) {
            return d(Range.b((Cut) obj, BoundType.a(z11)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class SubRangeSet extends TreeRangeSet<C> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SubRangeSetRangesByLowerBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Range f17301a;

        /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$SubRangeSetRangesByLowerBound$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 extends AbstractIterator<Map.Entry<Cut<Comparable<?>>, Range<Comparable<?>>>> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$SubRangeSetRangesByLowerBound$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass2 extends AbstractIterator<Map.Entry<Cut<Comparable<?>>, Range<Comparable<?>>>> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        public SubRangeSetRangesByLowerBound(Range range) {
            this.f17301a = range;
            throw null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final Iterator a() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public final Iterator b() {
            throw null;
        }

        public final Range c(Object obj) {
            if (obj instanceof Cut) {
                try {
                    if (this.f17301a.a((Cut) obj)) {
                        throw null;
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return NaturalOrdering.f17113c;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            c(obj);
            return false;
        }

        public final NavigableMap d(Range range) {
            Range range2 = this.f17301a;
            if (!range.e(range2)) {
                return ImmutableSortedMap.f16849t;
            }
            new SubRangeSetRangesByLowerBound(range2.d(range));
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            c(obj);
            return null;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z11) {
            return d(Range.h((Cut) obj, BoundType.a(z11)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            throw null;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z11, Object obj2, boolean z12) {
            return d(Range.g((Cut) obj, BoundType.a(z11), (Cut) obj2, BoundType.a(z12)));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z11) {
            return d(Range.b((Cut) obj, BoundType.a(z11)));
        }
    }

    @Override // com.google.common.collect.RangeSet
    public final Set a() {
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class RangesByUpperBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Range f17300a;

        /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$RangesByUpperBound$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 extends AbstractIterator<Map.Entry<Cut<Comparable<?>>, Range<Comparable<?>>>> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$RangesByUpperBound$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass2 extends AbstractIterator<Map.Entry<Cut<Comparable<?>>, Range<Comparable<?>>>> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        public RangesByUpperBound() {
            this.f17300a = Range.f17134c;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final Iterator a() {
            Cut cut = this.f17300a.f17135a;
            if (cut == Cut.BelowAll.f16681b) {
                throw null;
            }
            throw null;
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public final Iterator b() {
            Range range = this.f17300a;
            if (!range.c()) {
                throw null;
            }
            throw null;
        }

        public final Range c(Object obj) {
            if (obj instanceof Cut) {
                try {
                    if (this.f17300a.a((Cut) obj)) {
                        throw null;
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return NaturalOrdering.f17113c;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            c(obj);
            return false;
        }

        public final NavigableMap d(Range range) {
            Range range2 = this.f17300a;
            return range.e(range2) ? new RangesByUpperBound(range.d(range2)) : ImmutableSortedMap.f16849t;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            c(obj);
            return null;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z11) {
            return d(Range.h((Cut) obj, BoundType.a(z11)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean isEmpty() {
            if (this.f17300a.equals(Range.f17134c)) {
                throw null;
            }
            a();
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            if (this.f17300a.equals(Range.f17134c)) {
                throw null;
            }
            a();
            throw null;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z11, Object obj2, boolean z12) {
            return d(Range.g((Cut) obj, BoundType.a(z11), (Cut) obj2, BoundType.a(z12)));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z11) {
            return d(Range.b((Cut) obj, BoundType.a(z11)));
        }

        public RangesByUpperBound(Range range) {
            this.f17300a = range;
        }
    }
}
