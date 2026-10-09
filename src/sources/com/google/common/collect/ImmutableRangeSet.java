package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class ImmutableRangeSet<C extends Comparable> extends AbstractRangeSet<C> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ImmutableRangeSet f16827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ImmutableRangeSet f16828c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient ImmutableList f16829a;

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableRangeSet$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends ImmutableList<Range<Comparable>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f16830c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f16831d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Range f16832e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ImmutableRangeSet f16833f;

        public AnonymousClass1(ImmutableRangeSet immutableRangeSet, int i11, int i12, Range range) {
            this.f16830c = i11;
            this.f16831d = i12;
            this.f16832e = range;
            this.f16833f = immutableRangeSet;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public final Object get(int i11) {
            ImmutableList immutableList = this.f16833f.f16829a;
            int i12 = this.f16830c;
            Preconditions.i(i11, i12);
            int i13 = this.f16831d;
            return (i11 == 0 || i11 == i12 + (-1)) ? ((Range) immutableList.get(i11 + i13)).d(this.f16832e) : (Range) immutableList.get(i11 + i13);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean h() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f16830c;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class AsSet extends ImmutableSortedSet<C> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public transient Integer f16834f;

        /* JADX INFO: renamed from: com.google.common.collect.ImmutableRangeSet$AsSet$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 extends AbstractIterator<Comparable> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final UnmodifiableListIterator f16835c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final UnmodifiableIterator f16836d;

            public AnonymousClass1(AsSet asSet) {
                asSet.getClass();
                throw null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                UnmodifiableIterator unmodifiableIterator = this.f16836d;
                if (unmodifiableIterator.hasNext()) {
                    return (Comparable) unmodifiableIterator.next();
                }
                UnmodifiableListIterator unmodifiableListIterator = this.f16835c;
                if (!unmodifiableListIterator.hasNext()) {
                    this.f16559a = AbstractIterator.State.DONE;
                    return null;
                }
                Range range = (Range) unmodifiableListIterator.next();
                int i11 = ContiguousSet.f16677f;
                range.getClass();
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.ImmutableRangeSet$AsSet$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass2 extends AbstractIterator<Comparable> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final UnmodifiableListIterator f16837c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final UnmodifiableIterator f16838d;

            public AnonymousClass2(AsSet asSet) {
                asSet.getClass();
                throw null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                UnmodifiableIterator unmodifiableIterator = this.f16838d;
                if (unmodifiableIterator.hasNext()) {
                    return (Comparable) unmodifiableIterator.next();
                }
                UnmodifiableListIterator unmodifiableListIterator = this.f16837c;
                if (!unmodifiableListIterator.hasNext()) {
                    this.f16559a = AbstractIterator.State.DONE;
                    return null;
                }
                Range range = (Range) unmodifiableListIterator.next();
                int i11 = ContiguousSet.f16677f;
                range.getClass();
                throw null;
            }
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use SerializedForm");
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public final ImmutableSortedSet E(Object obj, boolean z11) {
            R(Range.h((Comparable) obj, BoundType.a(z11)));
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public final ImmutableSortedSet N(Object obj, boolean z11, Object obj2, boolean z12) {
            Comparable comparable = (Comparable) obj;
            Comparable comparable2 = (Comparable) obj2;
            if (!z11 && !z12) {
                Range range = Range.f17134c;
                if (comparable.compareTo(comparable2) == 0) {
                    return RegularImmutableSortedSet.f17175t;
                }
            }
            R(Range.g(comparable, BoundType.a(z11), comparable2, BoundType.a(z12)));
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public final ImmutableSortedSet Q(Object obj, boolean z11) {
            R(Range.b((Comparable) obj, BoundType.a(z11)));
            throw null;
        }

        public final ImmutableSortedSet R(Range range) {
            Cut cut = range.f17136b;
            throw null;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                throw null;
            } catch (ClassCastException unused) {
                return false;
            }
        }

        @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
        public final Iterator descendingIterator() {
            return new AnonymousClass2(this);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean h() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public final Iterator iterator() {
            return new AnonymousClass1(this);
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: j */
        public final UnmodifiableIterator iterator() {
            return new AnonymousClass1(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            Integer num = this.f16834f;
            num.getClass();
            return num.intValue();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public final ImmutableSortedSet v() {
            return new DescendingImmutableSortedSet(this);
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        /* JADX INFO: renamed from: w */
        public final UnmodifiableIterator descendingIterator() {
            return new AnonymousClass2(this);
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class AsSetSerializedForm<C extends Comparable> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableList f16839a;

        public AsSetSerializedForm(ImmutableList immutableList) {
            this.f16839a = immutableList;
        }

        public Object readResolve() {
            new ImmutableRangeSet(this.f16839a);
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder<C extends Comparable<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f16840a = new ArrayList();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class ComplementRanges extends ImmutableList<Range<C>> {
        @Override // java.util.List
        public final Object get(int i11) {
            Preconditions.i(i11, 0);
            throw null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean h() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return 0;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SerializedForm<C extends Comparable> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableList f16841a;

        public SerializedForm(ImmutableList immutableList) {
            this.f16841a = immutableList;
        }

        public Object readResolve() {
            ImmutableList immutableList = this.f16841a;
            if (immutableList.isEmpty()) {
                return ImmutableRangeSet.f16827b;
            }
            return immutableList.equals(ImmutableList.u(Range.f17134c)) ? ImmutableRangeSet.f16828c : new ImmutableRangeSet(immutableList);
        }
    }

    static {
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        f16827b = new ImmutableRangeSet(RegularImmutableList.f17147e);
        f16828c = new ImmutableRangeSet(ImmutableList.u(Range.f17134c));
    }

    public ImmutableRangeSet(ImmutableList immutableList) {
        this.f16829a = immutableList;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.RangeSet
    public final Set a() {
        ImmutableList immutableList = this.f16829a;
        if (immutableList.isEmpty()) {
            int i11 = ImmutableSet.f16842c;
            return RegularImmutableSet.L;
        }
        Range range = Range.f17134c;
        return new RegularImmutableSortedSet(immutableList, Range.RangeLexOrdering.f17138a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Range b(Comparable comparable) {
        int iA;
        e eVar = new e(0);
        Cut.BelowValue belowValueA = Cut.a(comparable);
        NaturalOrdering naturalOrdering = NaturalOrdering.f17113c;
        SortedLists.KeyPresentBehavior keyPresentBehavior = SortedLists.KeyPresentBehavior.ANY_PRESENT;
        SortedLists.KeyAbsentBehavior keyAbsentBehavior = SortedLists.KeyAbsentBehavior.NEXT_LOWER;
        AbstractList abstractListE = Lists.e(this.f16829a, eVar);
        naturalOrdering.getClass();
        keyPresentBehavior.getClass();
        keyAbsentBehavior.getClass();
        if (!(abstractListE instanceof RandomAccess)) {
            abstractListE = new ArrayList(abstractListE);
        }
        int size = abstractListE.size() - 1;
        int i11 = 0;
        while (true) {
            if (i11 > size) {
                iA = keyAbsentBehavior.a(i11);
                break;
            }
            int i12 = (i11 + size) >>> 1;
            int iCompare = naturalOrdering.compare(belowValueA, abstractListE.get(i12));
            if (iCompare >= 0) {
                if (iCompare <= 0) {
                    iA = i11 + keyPresentBehavior.a(naturalOrdering, belowValueA, abstractListE.subList(i11, size + 1), i12 - i11);
                    break;
                }
                i11 = i12 + 1;
            } else {
                size = i12 - 1;
            }
        }
        if (iA == -1) {
            return null;
        }
        Range range = (Range) this.f16829a.get(iA);
        if (range.a(comparable)) {
            return range;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Range c() {
        ImmutableList immutableList = this.f16829a;
        if (immutableList.isEmpty()) {
            throw new NoSuchElementException();
        }
        return new Range(((Range) immutableList.get(0)).f17135a, ((Range) immutableList.get(immutableList.size() - 1)).f17136b);
    }

    public Object writeReplace() {
        return new SerializedForm(this.f16829a);
    }
}
