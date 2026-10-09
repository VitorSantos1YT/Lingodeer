package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class SortedMultisets {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ElementSet<E> extends Multisets.ElementSet<E> implements SortedSet<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SortedMultiset f17201a;

        public ElementSet(SortedMultiset sortedMultiset) {
            this.f17201a = sortedMultiset;
        }

        @Override // java.util.SortedSet
        public final Comparator comparator() {
            return this.f17201a.comparator();
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        public final Multiset f() {
            return this.f17201a;
        }

        @Override // java.util.SortedSet
        public final Object first() {
            Multiset.Entry entryFirstEntry = this.f17201a.firstEntry();
            if (entryFirstEntry != null) {
                return entryFirstEntry.a();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet headSet(Object obj) {
            return this.f17201a.k0(obj, BoundType.OPEN).c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new Multisets.AnonymousClass5(this.f17201a.entrySet().iterator());
        }

        @Override // java.util.SortedSet
        public final Object last() {
            Multiset.Entry entryLastEntry = this.f17201a.lastEntry();
            if (entryLastEntry != null) {
                return entryLastEntry.a();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return this.f17201a.t1(obj, BoundType.CLOSED, obj2, BoundType.OPEN).c();
        }

        @Override // java.util.SortedSet
        public final SortedSet tailSet(Object obj) {
            return this.f17201a.E0(obj, BoundType.CLOSED).c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class NavigableElementSet<E> extends ElementSet<E> implements NavigableSet<E> {
        @Override // java.util.NavigableSet
        public final Object ceiling(Object obj) {
            return SortedMultisets.a(this.f17201a.E0(obj, BoundType.CLOSED).firstEntry());
        }

        @Override // java.util.NavigableSet
        public final Iterator descendingIterator() {
            return ((ElementSet) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet descendingSet() {
            return new NavigableElementSet(this.f17201a.G());
        }

        @Override // java.util.NavigableSet
        public final Object floor(Object obj) {
            return SortedMultisets.a(this.f17201a.k0(obj, BoundType.CLOSED).lastEntry());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z11) {
            return new NavigableElementSet(this.f17201a.k0(obj, BoundType.a(z11)));
        }

        @Override // java.util.NavigableSet
        public final Object higher(Object obj) {
            return SortedMultisets.a(this.f17201a.E0(obj, BoundType.OPEN).firstEntry());
        }

        @Override // java.util.NavigableSet
        public final Object lower(Object obj) {
            return SortedMultisets.a(this.f17201a.k0(obj, BoundType.OPEN).lastEntry());
        }

        @Override // java.util.NavigableSet
        public final Object pollFirst() {
            return SortedMultisets.a(this.f17201a.pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public final Object pollLast() {
            return SortedMultisets.a(this.f17201a.pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z11, Object obj2, boolean z12) {
            return new NavigableElementSet(this.f17201a.t1(obj, BoundType.a(z11), obj2, BoundType.a(z12)));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z11) {
            return new NavigableElementSet(this.f17201a.E0(obj, BoundType.a(z11)));
        }
    }

    private SortedMultisets() {
    }

    public static Object a(Multiset.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.a();
    }
}
