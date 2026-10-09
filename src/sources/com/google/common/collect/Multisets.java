package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Multisets {

    /* JADX INFO: renamed from: com.google.common.collect.Multisets$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends ViewMultiset<Object> {

        /* JADX INFO: renamed from: com.google.common.collect.Multisets$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class C00231 extends AbstractIterator<Multiset.Entry<Object>> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Set b() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator f() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator g() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            throw null;
        }

        @Override // com.google.common.collect.Multiset
        public final int q0(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Multisets$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 extends ViewMultiset<Object> {

        /* JADX INFO: renamed from: com.google.common.collect.Multisets$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 extends AbstractIterator<Multiset.Entry<Object>> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Set b() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator f() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator g() {
            throw null;
        }

        @Override // com.google.common.collect.Multiset
        public final int q0(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Multisets$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass3 extends ViewMultiset<Object> {

        /* JADX INFO: renamed from: com.google.common.collect.Multisets$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 extends AbstractIterator<Multiset.Entry<Object>> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Set b() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator f() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator g() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            throw null;
        }

        @Override // com.google.common.collect.Multiset
        public final int q0(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection
        public final int size() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Multisets$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass4 extends ViewMultiset<Object> {

        /* JADX INFO: renamed from: com.google.common.collect.Multisets$4$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 extends AbstractIterator<Object> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.Multisets$4$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass2 extends AbstractIterator<Multiset.Entry<Object>> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, com.google.common.collect.AbstractMultiset
        public final int e() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator f() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator g() {
            throw null;
        }

        @Override // com.google.common.collect.Multiset
        public final int q0(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Multisets$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass5 extends TransformedIterator<Multiset.Entry<Object>, Object> {
        @Override // com.google.common.collect.TransformedIterator
        public final Object a(Object obj) {
            return ((Multiset.Entry) obj).a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class AbstractEntry<E> implements Multiset.Entry<E> {
        public final boolean equals(Object obj) {
            if (obj instanceof Multiset.Entry) {
                Multiset.Entry entry = (Multiset.Entry) obj;
                if (getCount() == entry.getCount() && Objects.a(a(), entry.a())) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Object objA = a();
            return (objA == null ? 0 : objA.hashCode()) ^ getCount();
        }

        public final String toString() {
            String strValueOf = String.valueOf(a());
            int count = getCount();
            return count == 1 ? strValueOf : p.k(count, strValueOf, " x ");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class DecreasingCount implements Comparator<Multiset.Entry<?>> {
        static {
            new DecreasingCount();
        }

        private DecreasingCount() {
        }

        @Override // java.util.Comparator
        public final int compare(Multiset.Entry<?> entry, Multiset.Entry<?> entry2) {
            return entry2.getCount() - entry.getCount();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class ElementSet<E> extends Sets.ImprovedAbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            f().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return f().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection collection) {
            return f().containsAll(collection);
        }

        public abstract Multiset f();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return f().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return f().u0(Integer.MAX_VALUE, obj) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return f().entrySet().size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class EntrySet<E> extends Sets.ImprovedAbstractSet<Multiset.Entry<E>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            f().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            return entry.getCount() > 0 && f().q0(entry.a()) == entry.getCount();
        }

        public abstract Multiset f();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            Object objA = entry.a();
            int count = entry.getCount();
            if (count != 0) {
                return f().J(count, objA);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class FilteredMultiset<E> extends ViewMultiset<E> {

        /* JADX INFO: renamed from: com.google.common.collect.Multisets$FilteredMultiset$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 implements Predicate<Multiset.Entry<Object>> {
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                ((Multiset.Entry) obj).a();
                throw null;
            }
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public final int add(int i11, Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Set b() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Set d() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator f() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator g() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }

        @Override // com.google.common.collect.Multiset
        public final int q0(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public final int u0(int i11, Object obj) {
            CollectPreconditions.b(i11, "occurrences");
            if (i11 == 0 || contains(obj)) {
                throw null;
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ImmutableEntry<E> extends AbstractEntry<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f17101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17102b;

        public ImmutableEntry(Object obj, int i11) {
            this.f17101a = obj;
            this.f17102b = i11;
            CollectPreconditions.b(i11, "count");
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final Object a() {
            return this.f17101a;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final int getCount() {
            return this.f17102b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class MultisetIteratorImpl<E> implements Iterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Multiset f17103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator f17104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Multiset.Entry f17105c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17106d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17107e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f17108f;

        public MultisetIteratorImpl(Multiset multiset, Iterator it) {
            this.f17103a = multiset;
            this.f17104b = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f17106d > 0 || this.f17104b.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.f17106d == 0) {
                Multiset.Entry entry = (Multiset.Entry) this.f17104b.next();
                this.f17105c = entry;
                int count = entry.getCount();
                this.f17106d = count;
                this.f17107e = count;
            }
            this.f17106d--;
            this.f17108f = true;
            Multiset.Entry entry2 = this.f17105c;
            java.util.Objects.requireNonNull(entry2);
            return entry2.a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            CollectPreconditions.d(this.f17108f);
            if (this.f17107e == 1) {
                this.f17104b.remove();
            } else {
                Multiset.Entry entry = this.f17105c;
                java.util.Objects.requireNonNull(entry);
                this.f17103a.remove(entry.a());
            }
            this.f17107e--;
            this.f17108f = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class UnmodifiableMultiset<E> extends ForwardingMultiset<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Multiset f17109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public transient Set f17110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public transient Set f17111c;

        public UnmodifiableMultiset(SortedMultiset sortedMultiset) {
            this.f17109a = sortedMultiset;
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public final boolean J(int i11, Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public Set c() {
            Set set = this.f17110b;
            if (set != null) {
                return set;
            }
            Set setZ0 = z0();
            this.f17110b = setZ0;
            return setZ0;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public final Set entrySet() {
            Set set = this.f17111c;
            if (set != null) {
                return set;
            }
            Set setUnmodifiableSet = Collections.unmodifiableSet(this.f17109a.entrySet());
            this.f17111c = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return Iterators.n(this.f17109a.iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public final int u0(int i11, Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection
        /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Multiset o0() {
            return this.f17109a;
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public final int w1(Object obj) {
            throw new UnsupportedOperationException();
        }

        public Set z0() {
            return Collections.unmodifiableSet(this.f17109a.c());
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public final int add(int i11, Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class ViewMultiset<E> extends AbstractMultiset<E> {
        private ViewMultiset() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            c().clear();
        }

        @Override // com.google.common.collect.AbstractMultiset
        public int e() {
            return c().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return Multisets.b(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = entrySet().iterator();
            long count = 0;
            while (it.hasNext()) {
                count += (long) ((Multiset.Entry) it.next()).getCount();
            }
            return Ints.e(count);
        }
    }

    private Multisets() {
    }

    public static boolean a(Multiset multiset, Object obj) {
        if (obj == multiset) {
            return true;
        }
        if (!(obj instanceof Multiset)) {
            return false;
        }
        Multiset multiset2 = (Multiset) obj;
        if (multiset.size() != multiset2.size() || multiset.entrySet().size() != multiset2.entrySet().size()) {
            return false;
        }
        for (Multiset.Entry entry : multiset2.entrySet()) {
            if (multiset.q0(entry.a()) != entry.getCount()) {
                return false;
            }
        }
        return true;
    }

    public static Iterator b(Multiset multiset) {
        return new MultisetIteratorImpl(multiset, multiset.entrySet().iterator());
    }
}
