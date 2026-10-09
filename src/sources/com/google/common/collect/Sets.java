package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Sets {

    /* JADX INFO: renamed from: com.google.common.collect.Sets$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends SetView<Object> {

        /* JADX INFO: renamed from: com.google.common.collect.Sets$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class C00241 extends AbstractIterator<Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Iterator f17182c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Iterator f17183d;

            public C00241() {
                AnonymousClass1.this.getClass();
                throw null;
            }

            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                Iterator it = this.f17182c;
                if (it.hasNext()) {
                    return it.next();
                }
                Iterator it2 = this.f17183d;
                if (it2.hasNext()) {
                    it2.next();
                    throw null;
                }
                this.f16559a = AbstractIterator.State.DONE;
                return null;
            }
        }

        @Override // com.google.common.collect.Sets.SetView
        /* JADX INFO: renamed from: b */
        public final UnmodifiableIterator iterator() {
            return new C00241();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            throw null;
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new C00241();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Sets$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass4 extends SetView<Object> {

        /* JADX INFO: renamed from: com.google.common.collect.Sets$4$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 extends AbstractIterator<Object> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        @Override // com.google.common.collect.Sets.SetView
        /* JADX INFO: renamed from: b */
        public final UnmodifiableIterator iterator() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            throw null;
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Sets$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass5 extends AbstractSet<Set<Object>> {

        /* JADX INFO: renamed from: com.google.common.collect.Sets$5$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 extends AbstractIterator<Set<Object>> {

            /* JADX INFO: renamed from: com.google.common.collect.Sets$5$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
            class C00251 extends AbstractSet<Object> {

                /* JADX INFO: renamed from: com.google.common.collect.Sets$5$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
                class C00261 extends AbstractIterator<Object> {
                    @Override // com.google.common.collect.AbstractIterator
                    public final Object a() {
                        throw null;
                    }
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj) {
                    throw null;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
                    return new C00261();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
                    throw null;
                }
            }

            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if ((obj instanceof Set) && ((Set) obj).size() == 0) {
                throw null;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            new AnonymousClass1();
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            throw null;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CartesianSet<E> extends ForwardingCollection<List<E>> implements Set<List<E>> {

        /* JADX INFO: renamed from: com.google.common.collect.Sets$CartesianSet$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 extends ImmutableList<List<Object>> {
            @Override // java.util.List
            public final Object get(int i11) {
                throw null;
            }

            @Override // com.google.common.collect.ImmutableCollection
            public final boolean h() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                throw null;
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            public Object writeReplace() {
                return super.writeReplace();
            }
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            ((List) obj).size();
            throw null;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            if (obj instanceof CartesianSet) {
                throw null;
            }
            if (obj instanceof Set) {
                Set set = (Set) obj;
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            size();
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: j0 */
        public final /* bridge */ /* synthetic */ Object o0() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingCollection
        public final Collection o0() {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class DescendingSet<E> extends ForwardingNavigableSet<E> {
        @Override // com.google.common.collect.ForwardingNavigableSet
        /* JADX INFO: renamed from: C0 */
        public final NavigableSet o0() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final Object ceiling(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final Comparator comparator() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final Iterator descendingIterator() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final NavigableSet descendingSet() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final Object first() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final Object floor(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet headSet(Object obj) {
            headSet(obj, false);
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final Object higher(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: j0 */
        public final /* bridge */ /* synthetic */ Object o0() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final Object last() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final Object lower(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        public final /* bridge */ /* synthetic */ Collection o0() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final Object pollFirst() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final Object pollLast() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet subSet(Object obj, Object obj2) {
            subSet(obj, true, obj2, false);
            throw null;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet tailSet(Object obj) {
            tailSet(obj, true);
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final Object[] toArray(Object[] objArr) {
            return ObjectArrays.c(this, objArr);
        }

        @Override // com.google.common.collect.ForwardingObject
        public final String toString() {
            return r0();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet
        /* JADX INFO: renamed from: w0 */
        public final /* bridge */ /* synthetic */ Set o0() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet
        /* JADX INFO: renamed from: z0 */
        public final /* bridge */ /* synthetic */ SortedSet j0() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z11) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z11, Object obj2, boolean z12) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z11) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return p0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class FilteredNavigableSet<E> extends FilteredSortedSet<E> implements NavigableSet<E> {
        @Override // java.util.NavigableSet
        public final Object ceiling(Object obj) {
            NavigableSet<E> navigableSetTailSet = ((NavigableSet) this.f16630a).tailSet(obj, true);
            return Iterators.f(navigableSetTailSet.iterator(), this.f16631b);
        }

        @Override // java.util.NavigableSet
        public final Iterator descendingIterator() {
            return Iterators.e(((NavigableSet) this.f16630a).descendingIterator(), this.f16631b);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet descendingSet() {
            return Sets.c(((NavigableSet) this.f16630a).descendingSet(), this.f16631b);
        }

        @Override // java.util.NavigableSet
        public final Object floor(Object obj) {
            return Iterators.f(((NavigableSet) this.f16630a).headSet(obj, true).descendingIterator(), this.f16631b);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z11) {
            return Sets.c(((NavigableSet) this.f16630a).headSet(obj, z11), this.f16631b);
        }

        @Override // java.util.NavigableSet
        public final Object higher(Object obj) {
            NavigableSet<E> navigableSetTailSet = ((NavigableSet) this.f16630a).tailSet(obj, false);
            return Iterators.f(navigableSetTailSet.iterator(), this.f16631b);
        }

        @Override // com.google.common.collect.Sets.FilteredSortedSet, java.util.SortedSet
        public final Object last() {
            Iterator<E> itDescendingIterator = ((NavigableSet) this.f16630a).descendingIterator();
            itDescendingIterator.getClass();
            Predicate predicate = this.f16631b;
            predicate.getClass();
            while (itDescendingIterator.hasNext()) {
                E next = itDescendingIterator.next();
                if (predicate.apply(next)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.NavigableSet
        public final Object lower(Object obj) {
            return Iterators.f(((NavigableSet) this.f16630a).headSet(obj, false).descendingIterator(), this.f16631b);
        }

        @Override // java.util.NavigableSet
        public final Object pollFirst() {
            return Iterables.e((NavigableSet) this.f16630a, this.f16631b);
        }

        @Override // java.util.NavigableSet
        public final Object pollLast() {
            return Iterables.e(((NavigableSet) this.f16630a).descendingSet(), this.f16631b);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z11, Object obj2, boolean z12) {
            return Sets.c(((NavigableSet) this.f16630a).subSet(obj, z11, obj2, z12), this.f16631b);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z11) {
            return Sets.c(((NavigableSet) this.f16630a).tailSet(obj, z11), this.f16631b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class FilteredSet<E> extends Collections2.FilteredCollection<E> implements Set<E> {
        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return Sets.b(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return Sets.e(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class FilteredSortedSet<E> extends FilteredSet<E> implements SortedSet<E> {
        @Override // java.util.SortedSet
        public final Comparator comparator() {
            return ((SortedSet) this.f16630a).comparator();
        }

        @Override // java.util.SortedSet
        public final Object first() {
            Iterator<E> it = this.f16630a.iterator();
            it.getClass();
            Predicate predicate = this.f16631b;
            predicate.getClass();
            while (it.hasNext()) {
                E next = it.next();
                if (predicate.apply(next)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet headSet(Object obj) {
            return new FilteredSortedSet(((SortedSet) this.f16630a).headSet(obj), this.f16631b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.SortedSet] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public Object last() {
            ?? HeadSet = (SortedSet) this.f16630a;
            while (true) {
                Object objLast = HeadSet.last();
                if (this.f16631b.apply(objLast)) {
                    return objLast;
                }
                HeadSet = HeadSet.headSet(objLast);
            }
        }

        @Override // java.util.SortedSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return new FilteredSortedSet(((SortedSet) this.f16630a).subSet(obj, obj2), this.f16631b);
        }

        @Override // java.util.SortedSet
        public final SortedSet tailSet(Object obj) {
            return new FilteredSortedSet(((SortedSet) this.f16630a).tailSet(obj), this.f16631b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class ImprovedAbstractSet<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            return Sets.g(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            collection.getClass();
            return super.retainAll(collection);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class PowerSet<E> extends AbstractSet<Set<E>> {

        /* JADX INFO: renamed from: com.google.common.collect.Sets$PowerSet$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 extends AbstractIndexedListIterator<Set<Object>> {
            @Override // com.google.common.collect.AbstractIndexedListIterator
            public final Object a(int i11) {
                throw null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (obj instanceof Set) {
                throw null;
            }
            return false;
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            if (obj instanceof PowerSet) {
                throw null;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            throw null;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return "powerSet(null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class SetView<E> extends AbstractSet<E> {
        public /* synthetic */ SetView(int i11) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public abstract UnmodifiableIterator iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        private SetView() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SubSet<E> extends AbstractSet<E> {

        /* JADX INFO: renamed from: com.google.common.collect.Sets$SubSet$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 extends UnmodifiableIterator<Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f17193a;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f17193a != 0;
            }

            @Override // java.util.Iterator
            public final Object next() {
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(this.f17193a);
                if (iNumberOfTrailingZeros == 32) {
                    throw new NoSuchElementException();
                }
                this.f17193a = (~(1 << iNumberOfTrailingZeros)) & this.f17193a;
                throw null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            new AnonymousClass1();
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return Integer.bitCount(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class UnmodifiableNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NavigableSet f17194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SortedSet f17195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public transient UnmodifiableNavigableSet f17196c;

        public UnmodifiableNavigableSet(NavigableSet navigableSet) {
            navigableSet.getClass();
            this.f17194a = navigableSet;
            this.f17195b = Collections.unmodifiableSortedSet(navigableSet);
        }

        @Override // java.util.NavigableSet
        public final Object ceiling(Object obj) {
            return this.f17194a.ceiling(obj);
        }

        @Override // java.util.NavigableSet
        public final Iterator descendingIterator() {
            return Iterators.n(this.f17194a.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet descendingSet() {
            UnmodifiableNavigableSet unmodifiableNavigableSet = this.f17196c;
            if (unmodifiableNavigableSet != null) {
                return unmodifiableNavigableSet;
            }
            UnmodifiableNavigableSet unmodifiableNavigableSet2 = new UnmodifiableNavigableSet(this.f17194a.descendingSet());
            this.f17196c = unmodifiableNavigableSet2;
            unmodifiableNavigableSet2.f17196c = this;
            return unmodifiableNavigableSet2;
        }

        @Override // java.util.NavigableSet
        public final Object floor(Object obj) {
            return this.f17194a.floor(obj);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z11) {
            return Sets.i(this.f17194a.headSet(obj, z11));
        }

        @Override // java.util.NavigableSet
        public final Object higher(Object obj) {
            return this.f17194a.higher(obj);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: j0 */
        public final Object o0() {
            return this.f17195b;
        }

        @Override // java.util.NavigableSet
        public final Object lower(Object obj) {
            return this.f17194a.lower(obj);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        public final Collection o0() {
            return this.f17195b;
        }

        @Override // java.util.NavigableSet
        public final Object pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public final Object pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z11, Object obj2, boolean z12) {
            return Sets.i(this.f17194a.subSet(obj, z11, obj2, z12));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z11) {
            return Sets.i(this.f17194a.tailSet(obj, z11));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet
        /* JADX INFO: renamed from: w0 */
        public final Set o0() {
            return this.f17195b;
        }

        @Override // com.google.common.collect.ForwardingSortedSet
        /* JADX INFO: renamed from: z0 */
        public final SortedSet j0() {
            return this.f17195b;
        }
    }

    private Sets() {
    }

    public static SetView a(final Set set, final Set set2) {
        Preconditions.k(set, "set1");
        return new SetView<Object>() { // from class: com.google.common.collect.Sets.3

            /* JADX INFO: renamed from: com.google.common.collect.Sets$3$1, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
            class AnonymousClass1 extends AbstractIterator<Object> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Iterator f17191c;

                public AnonymousClass1() {
                    this.f17191c = set.iterator();
                }

                @Override // com.google.common.collect.AbstractIterator
                public final Object a() {
                    Object next;
                    do {
                        Iterator it = this.f17191c;
                        if (!it.hasNext()) {
                            this.f16559a = AbstractIterator.State.DONE;
                            return null;
                        }
                        next = it.next();
                    } while (((SingletonImmutableSet) set2).f17197d.equals(next));
                    return next;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // com.google.common.collect.Sets.SetView
            /* JADX INFO: renamed from: b */
            public final UnmodifiableIterator iterator() {
                return new AnonymousClass1();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return set.contains(obj) && !set2.contains(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean isEmpty() {
                return set2.containsAll(set);
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return new AnonymousClass1();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                Iterator it = set.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    if (!set2.contains(it.next())) {
                        i11++;
                    }
                }
                return i11;
            }
        };
    }

    public static boolean b(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static NavigableSet c(NavigableSet navigableSet, Predicate predicate) {
        if (navigableSet instanceof FilteredSet) {
            FilteredSet filteredSet = (FilteredSet) navigableSet;
            return new FilteredNavigableSet((NavigableSet) filteredSet.f16630a, Predicates.c(filteredSet.f16631b, predicate));
        }
        navigableSet.getClass();
        predicate.getClass();
        return new FilteredNavigableSet(navigableSet, predicate);
    }

    public static Set d(Set set, Predicate predicate) {
        if (set instanceof SortedSet) {
            Collection collection = (SortedSet) set;
            if (!(collection instanceof FilteredSet)) {
                predicate.getClass();
                return new FilteredSortedSet(collection, predicate);
            }
            FilteredSet filteredSet = (FilteredSet) collection;
            return new FilteredSortedSet((SortedSet) filteredSet.f16630a, Predicates.c(filteredSet.f16631b, predicate));
        }
        if (set instanceof FilteredSet) {
            FilteredSet filteredSet2 = (FilteredSet) set;
            return new FilteredSet((Set) filteredSet2.f16630a, Predicates.c(filteredSet2.f16631b, predicate));
        }
        set.getClass();
        predicate.getClass();
        return new FilteredSet(set, predicate);
    }

    public static int e(Set set) {
        Iterator it = set.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i11 = ~(~(i11 + (next != null ? next.hashCode() : 0)));
        }
        return i11;
    }

    public static SetView f(final Set set, final ImmutableSet immutableSet) {
        Preconditions.k(set, "set1");
        Preconditions.k(immutableSet, "set2");
        return new SetView<Object>() { // from class: com.google.common.collect.Sets.2

            /* JADX INFO: renamed from: com.google.common.collect.Sets$2$1, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
            class AnonymousClass1 extends AbstractIterator<Object> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Iterator f17187c;

                public AnonymousClass1() {
                    this.f17187c = set.iterator();
                }

                @Override // com.google.common.collect.AbstractIterator
                public final Object a() {
                    Object next;
                    do {
                        Iterator it = this.f17187c;
                        if (!it.hasNext()) {
                            this.f16559a = AbstractIterator.State.DONE;
                            return null;
                        }
                        next = it.next();
                    } while (!immutableSet.contains(next));
                    return next;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // com.google.common.collect.Sets.SetView
            /* JADX INFO: renamed from: b */
            public final UnmodifiableIterator iterator() {
                return new AnonymousClass1();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return set.contains(obj) && immutableSet.contains(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean containsAll(Collection collection) {
                return set.containsAll(collection) && immutableSet.containsAll(collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean isEmpty() {
                return Collections.disjoint(immutableSet, set);
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return new AnonymousClass1();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                Iterator it = set.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    if (immutableSet.contains(it.next())) {
                        i11++;
                    }
                }
                return i11;
            }
        };
    }

    public static boolean g(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).c();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? h(set, collection.iterator()) : Iterators.k(collection, set.iterator());
    }

    public static boolean h(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static NavigableSet i(NavigableSet navigableSet) {
        return ((navigableSet instanceof ImmutableCollection) || (navigableSet instanceof UnmodifiableNavigableSet)) ? navigableSet : new UnmodifiableNavigableSet(navigableSet);
    }
}
