package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Collections2 {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class FilteredCollection<E> extends AbstractCollection<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Collection f16630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Predicate f16631b;

        public FilteredCollection(Collection collection, Predicate predicate) {
            this.f16630a = collection;
            this.f16631b = predicate;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(Object obj) {
            Preconditions.g(this.f16631b.apply(obj));
            return this.f16630a.add(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection collection) {
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                Preconditions.g(this.f16631b.apply(it.next()));
            }
            return this.f16630a.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            Iterables.f(this.f16630a, this.f16631b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (Collections2.c(obj, this.f16630a)) {
                return this.f16631b.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection collection) {
            return Collections2.a(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return !Iterables.a(this.f16630a, this.f16631b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return Iterators.e(this.f16630a.iterator(), this.f16631b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            return contains(obj) && this.f16630a.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection collection) {
            Iterator<E> it = this.f16630a.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f16631b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z11 = true;
                }
            }
            return z11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection collection) {
            Iterator<E> it = this.f16630a.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f16631b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z11 = true;
                }
            }
            return z11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            Iterator<E> it = this.f16630a.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                if (this.f16631b.apply(it.next())) {
                    i11++;
                }
            }
            return i11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final Object[] toArray() {
            return Lists.a(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            return Lists.a(iterator()).toArray(objArr);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class OrderedPermutationCollection<E> extends AbstractCollection<List<E>> {
        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof List) {
                throw null;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            new OrderedPermutationIterator();
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return 0;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return "orderedPermutationCollection(null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class OrderedPermutationIterator<E> extends AbstractIterator<List<E>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f16632c;

        @Override // com.google.common.collect.AbstractIterator
        public final Object a() {
            ArrayList arrayList = this.f16632c;
            if (arrayList == null) {
                this.f16559a = AbstractIterator.State.DONE;
                return null;
            }
            ImmutableList immutableListN = ImmutableList.n(arrayList);
            Objects.requireNonNull(this.f16632c);
            int size = this.f16632c.size();
            int i11 = size - 2;
            if (i11 < 0) {
                this.f16632c = null;
                return immutableListN;
            }
            this.f16632c.get(i11);
            this.f16632c.get(size - 1);
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class PermutationCollection<E> extends AbstractCollection<List<E>> {
        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof List) {
                throw null;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            new PermutationIterator();
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            throw null;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return "permutations(null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class PermutationIterator<E> extends AbstractIterator<List<E>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f16633c = new ArrayList((Collection) null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16634d;

        public PermutationIterator() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractIterator
        public final Object a() {
            if (this.f16634d <= 0) {
                this.f16559a = AbstractIterator.State.DONE;
                return null;
            }
            ArrayList arrayList = this.f16633c;
            ImmutableList immutableListN = ImmutableList.n(arrayList);
            int size = arrayList.size() - 1;
            this.f16634d = size;
            if (size == -1) {
                return immutableListN;
            }
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class TransformedCollection<F, T> extends AbstractCollection<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Collection f16635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function f16636b;

        public TransformedCollection(Collection collection, Function function) {
            collection.getClass();
            this.f16635a = collection;
            function.getClass();
            this.f16636b = function;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.f16635a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return this.f16635a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return Iterators.m(this.f16635a.iterator(), this.f16636b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.f16635a.size();
        }
    }

    private Collections2() {
    }

    public static boolean a(Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static Collection b(Predicate predicate) {
        throw null;
    }

    public static boolean c(Object obj, Collection collection) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
