package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Supplier;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Multimaps {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AsMap<K, V> extends Maps.ViewCachingAbstractMap<K, Collection<V>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Multimap f17091d;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public class EntrySet extends Maps.EntrySet<K, Collection<V>> {
            public EntrySet() {
            }

            @Override // com.google.common.collect.Maps.EntrySet
            public final Map f() {
                return AsMap.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                Set setKeySet = AsMap.this.f17091d.keySet();
                return new Maps.AnonymousClass3(setKeySet.iterator(), new Function() { // from class: com.google.common.collect.f
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        return Multimaps.AsMap.this.f17091d.get(obj);
                    }
                });
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AsMap.this.f17091d.keySet().remove(entry.getKey());
                return true;
            }
        }

        public AsMap(Multimap multimap) {
            this.f17091d = multimap;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set a() {
            return new EntrySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            this.f17091d.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return this.f17091d.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Multimap multimap = this.f17091d;
            if (multimap.containsKey(obj)) {
                return multimap.get(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean isEmpty() {
            return this.f17091d.isEmpty();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return this.f17091d.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            Multimap multimap = this.f17091d;
            if (multimap.containsKey(obj)) {
                return multimap.b(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f17091d.keySet().size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class CustomListMultimap<K, V> extends AbstractListMultimap<K, V> {
        private static final long serialVersionUID = 0;
        public transient Supplier H;

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            this.H = (Supplier) object;
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            o((Map) object2);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.H);
            objectOutputStream.writeObject(this.f16561f);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final Map a() {
            return l();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final Set d() {
            return m();
        }

        @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap
        /* JADX INFO: renamed from: s */
        public final List j() {
            return (List) this.H.get();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class CustomMultimap<K, V> extends AbstractMapBasedMultimap<K, V> {
        private static final long serialVersionUID = 0;
        public transient Supplier H;

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            this.H = (Supplier) object;
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            o((Map) object2);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.H);
            objectOutputStream.writeObject(this.f16561f);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final Map a() {
            return l();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final Set d() {
            return m();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        public final Collection j() {
            return (Collection) this.H.get();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        public final Collection p(Collection collection) {
            if (collection instanceof NavigableSet) {
                return Sets.i((NavigableSet) collection);
            }
            if (collection instanceof SortedSet) {
                return Collections.unmodifiableSortedSet((SortedSet) collection);
            }
            if (collection instanceof Set) {
                return Collections.unmodifiableSet((Set) collection);
            }
            return collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        public final Collection r(Object obj, Collection collection) {
            if (collection instanceof List) {
                List list = (List) collection;
                return list instanceof RandomAccess ? new AbstractMapBasedMultimap.RandomAccessWrappedList(obj, list, null) : new AbstractMapBasedMultimap.WrappedList(obj, list, null);
            }
            if (collection instanceof NavigableSet) {
                return new AbstractMapBasedMultimap.WrappedNavigableSet(obj, (NavigableSet) collection, null);
            }
            if (collection instanceof SortedSet) {
                return new AbstractMapBasedMultimap.WrappedSortedSet(obj, (SortedSet) collection, null);
            }
            return collection instanceof Set ? new AbstractMapBasedMultimap.WrappedSet(obj, (Set) collection) : new AbstractMapBasedMultimap.WrappedCollection(obj, collection, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class CustomSetMultimap<K, V> extends AbstractSetMultimap<K, V> {
        private static final long serialVersionUID = 0;
        public transient Supplier H;

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            this.H = (Supplier) object;
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            o((Map) object2);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.H);
            objectOutputStream.writeObject(this.f16561f);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final Map a() {
            return l();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final Set d() {
            return m();
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public final Collection p(Collection collection) {
            if (collection instanceof NavigableSet) {
                return Sets.i((NavigableSet) collection);
            }
            return collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : Collections.unmodifiableSet((Set) collection);
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        public final Collection r(Object obj, Collection collection) {
            if (collection instanceof NavigableSet) {
                return new AbstractMapBasedMultimap.WrappedNavigableSet(obj, (NavigableSet) collection, null);
            }
            return collection instanceof SortedSet ? new AbstractMapBasedMultimap.WrappedSortedSet(obj, (SortedSet) collection, null) : new AbstractMapBasedMultimap.WrappedSet(obj, (Set) collection);
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        /* JADX INFO: renamed from: s */
        public final Set j() {
            return (Set) this.H.get();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class CustomSortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;
        public transient Supplier H;

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            Supplier supplier = (Supplier) object;
            this.H = supplier;
            ((SortedSet) supplier.get()).comparator();
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            o((Map) object2);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.H);
            objectOutputStream.writeObject(this.f16561f);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final Map a() {
            return l();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        public final Set d() {
            return m();
        }

        @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final SortedSet j() {
            return (SortedSet) this.H.get();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class Entries<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        public abstract Multimap b();

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            b().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b().g0(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return b().size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Keys<K, V> extends AbstractMultiset<K> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Multimap f17093c;

        /* JADX INFO: renamed from: com.google.common.collect.Multimaps$Keys$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 extends TransformedIterator<Map.Entry<Object, Collection<Object>>, Multiset.Entry<Object>> {
            @Override // com.google.common.collect.TransformedIterator
            public final Object a(Object obj) {
                final Map.Entry entry = (Map.Entry) obj;
                return new Multisets.AbstractEntry<Object>() { // from class: com.google.common.collect.Multimaps.Keys.1.1
                    @Override // com.google.common.collect.Multiset.Entry
                    public final Object a() {
                        return entry.getKey();
                    }

                    @Override // com.google.common.collect.Multiset.Entry
                    public final int getCount() {
                        return ((Collection) entry.getValue()).size();
                    }
                };
            }
        }

        public Keys(Multimap multimap) {
            this.f17093c = multimap;
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public final Set c() {
            return this.f17093c.keySet();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.f17093c.clear();
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f17093c.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final int e() {
            return this.f17093c.Y().size();
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator f() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator g() {
            return new AnonymousClass1(this.f17093c.Y().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new Maps.AnonymousClass1(this.f17093c.e().iterator());
        }

        @Override // com.google.common.collect.Multiset
        public final int q0(Object obj) {
            Collection collection = (Collection) Maps.g(obj, this.f17093c.Y());
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.f17093c.size();
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int u0(int i11, Object obj) {
            CollectPreconditions.b(i11, "occurrences");
            if (i11 == 0) {
                return q0(obj);
            }
            Collection collection = (Collection) Maps.g(obj, this.f17093c.Y());
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i11 >= size) {
                collection.clear();
                return size;
            }
            Iterator it = collection.iterator();
            for (int i12 = 0; i12 < i11; i12++) {
                it.next();
                it.remove();
            }
            return size;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class MapMultimap<K, V> extends AbstractMultimap<K, V> implements SetMultimap<K, V>, Serializable {
        private static final long serialVersionUID = 7845222491160860175L;

        /* JADX INFO: renamed from: com.google.common.collect.Multimaps$MapMultimap$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 extends Sets.ImprovedAbstractSet<Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f17095a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapMultimap f17096b;

            public AnonymousClass1(MapMultimap mapMultimap, Object obj) {
                this.f17095a = obj;
                this.f17096b = mapMultimap;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return new Iterator<Object>() { // from class: com.google.common.collect.Multimaps.MapMultimap.1.1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public int f17097a;

                    @Override // java.util.Iterator
                    public final boolean hasNext() {
                        if (this.f17097a != 0) {
                            return false;
                        }
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        anonymousClass1.f17096b.getClass();
                        Object obj = anonymousClass1.f17095a;
                        throw null;
                    }

                    @Override // java.util.Iterator
                    public final Object next() {
                        hasNext();
                        throw new NoSuchElementException();
                    }

                    @Override // java.util.Iterator
                    public final void remove() {
                        CollectPreconditions.d(this.f17097a == 1);
                        this.f17097a = -1;
                        throw null;
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                this.f17096b.getClass();
                throw null;
            }
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Map a() {
            return new AsMap(this);
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final /* bridge */ /* synthetic */ Collection b(Object obj) {
            b(obj);
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Collection c() {
            throw new AssertionError("unreachable");
        }

        @Override // com.google.common.collect.Multimap
        public final void clear() {
            throw null;
        }

        @Override // com.google.common.collect.Multimap
        public final boolean containsKey(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean containsValue(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Set d() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final Collection e() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Multiset f() {
            return new Keys(this);
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Collection g() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean g0(Object obj, Object obj2) {
            throw null;
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Collection get(Object obj) {
            return new AnonymousClass1(this, obj);
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final int hashCode() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Iterator i() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean remove(Object obj, Object obj2) {
            throw null;
        }

        @Override // com.google.common.collect.Multimap
        public final int size() {
            throw null;
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Set b(Object obj) {
            new HashSet(2);
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final Set e() {
            throw null;
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Set get(Object obj) {
            return new AnonymousClass1(this, obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class TransformedEntriesListMultimap<K, V1, V2> extends TransformedEntriesMultimap<K, V1, V2> implements ListMultimap<K, V2> {
        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap
        public final Collection j(Object obj, Collection collection) {
            Maps.EntryTransformer entryTransformer = this.f17100t;
            entryTransformer.getClass();
            return Lists.e((List) collection, new Maps.AnonymousClass10(entryTransformer, obj));
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final List b(Object obj) {
            List list = (List) this.f17099f.b(obj);
            Maps.EntryTransformer entryTransformer = this.f17100t;
            entryTransformer.getClass();
            return Lists.e(list, new Maps.AnonymousClass10(entryTransformer, obj));
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final List get(Object obj) {
            List list = (List) this.f17099f.get(obj);
            Maps.EntryTransformer entryTransformer = this.f17100t;
            entryTransformer.getClass();
            return Lists.e(list, new Maps.AnonymousClass10(entryTransformer, obj));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class TransformedEntriesMultimap<K, V1, V2> extends AbstractMultimap<K, V2> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Multimap f17099f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final Maps.EntryTransformer f17100t;

        public TransformedEntriesMultimap(Multimap multimap, Maps.EntryTransformer entryTransformer) {
            multimap.getClass();
            this.f17099f = multimap;
            this.f17100t = entryTransformer;
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Map a() {
            return new Maps.TransformedEntriesMap(this.f17099f.Y(), new Maps.EntryTransformer() { // from class: com.google.common.collect.g
                @Override // com.google.common.collect.Maps.EntryTransformer
                public final Object a(Object obj, Object obj2) {
                    return this.f17311a.j(obj, (Collection) obj2);
                }
            });
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Collection b(Object obj) {
            return j(obj, this.f17099f.b(obj));
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Collection c() {
            return new AbstractMultimap.Entries();
        }

        @Override // com.google.common.collect.Multimap
        public final void clear() {
            this.f17099f.clear();
        }

        @Override // com.google.common.collect.Multimap
        public final boolean containsKey(Object obj) {
            return this.f17099f.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Set d() {
            return this.f17099f.keySet();
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Multiset f() {
            return this.f17099f.T();
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Collection g() {
            Collection collectionE = this.f17099f.e();
            final Maps.EntryTransformer entryTransformer = this.f17100t;
            entryTransformer.getClass();
            return new Collections2.TransformedCollection(collectionE, new Function<Map.Entry<Object, Object>, Object>() { // from class: com.google.common.collect.Maps.11
                public AnonymousClass11() {
                }

                @Override // com.google.common.base.Function
                public final Object apply(Map.Entry<Object, Object> entry) {
                    Map.Entry<Object, Object> entry2 = entry;
                    return entryTransformer.a(entry2.getKey(), entry2.getValue());
                }
            });
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Collection get(Object obj) {
            return j(obj, this.f17099f.get(obj));
        }

        @Override // com.google.common.collect.AbstractMultimap
        public final Iterator i() {
            Iterator it = this.f17099f.e().iterator();
            Maps.EntryTransformer entryTransformer = this.f17100t;
            entryTransformer.getClass();
            return new Iterators.AnonymousClass6(it, new Maps.AnonymousClass13(entryTransformer));
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean isEmpty() {
            return this.f17099f.isEmpty();
        }

        public Collection j(Object obj, Collection collection) {
            Maps.EntryTransformer entryTransformer = this.f17100t;
            entryTransformer.getClass();
            Maps.AnonymousClass10 anonymousClass10 = new Maps.AnonymousClass10(entryTransformer, obj);
            return collection instanceof List ? Lists.e((List) collection, anonymousClass10) : new Collections2.TransformedCollection(collection, anonymousClass10);
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public final boolean remove(Object obj, Object obj2) {
            return get(obj).remove(obj2);
        }

        @Override // com.google.common.collect.Multimap
        public final int size() {
            return this.f17099f.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class UnmodifiableListMultimap<K, V> extends UnmodifiableMultimap<K, V> implements ListMultimap<K, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Collection b(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Collection get(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public final /* bridge */ /* synthetic */ Object j0() {
            return null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap
        public final /* bridge */ /* synthetic */ Multimap o0() {
            return null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final List b(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final List get(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class UnmodifiableMultimap<K, V> extends ForwardingMultimap<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final Multiset T() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final Map Y() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Collection b(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Collection e() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Collection get(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final Set keySet() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public Multimap j0() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final boolean put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final Collection values() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class UnmodifiableSetMultimap<K, V> extends UnmodifiableMultimap<K, V> implements SetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public /* bridge */ /* synthetic */ Collection b(Object obj) {
            b(obj);
            throw null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final Collection e() {
            throw null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object j0() {
            return null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap
        public /* bridge */ /* synthetic */ Multimap o0() {
            return null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set b(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public final Set e() {
            throw null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set get(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class UnmodifiableSortedSetMultimap<K, V> extends UnmodifiableSetMultimap<K, V> implements SortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Collection b(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Collection get(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        public final /* bridge */ /* synthetic */ Object j0() {
            return null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap
        public final /* bridge */ /* synthetic */ Multimap o0() {
            return null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Set b(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final Set get(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final SortedSet b(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final SortedSet get(Object obj) {
            throw null;
        }
    }

    private Multimaps() {
    }

    public static ListMultimap a(ListMultimap listMultimap, a7.c cVar) {
        return new TransformedEntriesListMultimap(listMultimap, new Maps.AnonymousClass9(cVar));
    }
}
