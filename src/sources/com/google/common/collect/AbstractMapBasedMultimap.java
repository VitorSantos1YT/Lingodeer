package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractMapBasedMultimap<K, V> extends AbstractMultimap<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient Map f16561f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public transient int f16562t;

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 extends AbstractMapBasedMultimap<Object, Object>.Itr<Map.Entry<Object, Object>> {
        @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
        public final Object a(Object obj, Object obj2) {
            return new ImmutableEntry(obj, obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class AsMap extends Maps.ViewCachingAbstractMap<K, Collection<V>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient Map f16563d;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public class AsMapEntries extends Maps.EntrySet<K, Collection<V>> {
            public AsMapEntries() {
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return Collections2.c(obj, AsMap.this.f16563d.entrySet());
            }

            @Override // com.google.common.collect.Maps.EntrySet
            public final Map f() {
                return AsMap.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return AsMap.this.new AsMapIterator();
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                Object objRemove;
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                Object key = entry.getKey();
                Map map = abstractMapBasedMultimap.f16561f;
                map.getClass();
                try {
                    objRemove = map.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                    objRemove = null;
                }
                Collection collection = (Collection) objRemove;
                if (collection == null) {
                    return true;
                }
                int size = collection.size();
                collection.clear();
                abstractMapBasedMultimap.f16562t -= size;
                return true;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public class AsMapIterator implements Iterator<Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator f16566a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Collection f16567b;

            public AsMapIterator() {
                this.f16566a = AsMap.this.f16563d.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f16566a.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                Map.Entry entry = (Map.Entry) this.f16566a.next();
                this.f16567b = (Collection) entry.getValue();
                return AsMap.this.d(entry);
            }

            @Override // java.util.Iterator
            public final void remove() {
                Preconditions.p("no calls to next() since the last call to remove()", this.f16567b != null);
                this.f16566a.remove();
                AbstractMapBasedMultimap.this.f16562t -= this.f16567b.size();
                this.f16567b.clear();
                this.f16567b = null;
            }
        }

        public AsMap(Map map) {
            this.f16563d = map;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set a() {
            return new AsMapEntries();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            if (this.f16563d == abstractMapBasedMultimap.f16561f) {
                abstractMapBasedMultimap.clear();
            } else {
                Iterators.b(new AsMapIterator());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            Map map = this.f16563d;
            map.getClass();
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        public final Map.Entry d(Map.Entry entry) {
            Object key = entry.getKey();
            return new ImmutableEntry(key, AbstractMapBasedMultimap.this.r(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean equals(Object obj) {
            return this == obj || this.f16563d.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Collection collection = (Collection) Maps.g(obj, this.f16563d);
            if (collection == null) {
                return null;
            }
            return AbstractMapBasedMultimap.this.r(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int hashCode() {
            return this.f16563d.hashCode();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return AbstractMapBasedMultimap.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            Collection collection = (Collection) this.f16563d.remove(obj);
            if (collection == null) {
                return null;
            }
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Collection collectionJ = abstractMapBasedMultimap.j();
            collectionJ.addAll(collection);
            abstractMapBasedMultimap.f16562t -= collection.size();
            collection.clear();
            return collectionJ;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f16563d.size();
        }

        @Override // java.util.AbstractMap
        public final String toString() {
            return this.f16563d.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public abstract class Itr<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator f16569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f16570b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Collection f16571c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Iterator f16572d = Iterators.EmptyModifiableIterator.INSTANCE;

        public Itr() {
            this.f16569a = AbstractMapBasedMultimap.this.f16561f.entrySet().iterator();
        }

        public abstract Object a(Object obj, Object obj2);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f16569a.hasNext() || this.f16572d.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!this.f16572d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f16569a.next();
                this.f16570b = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.f16571c = collection;
                this.f16572d = collection.iterator();
            }
            return a(this.f16570b, this.f16572d.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f16572d.remove();
            Collection collection = this.f16571c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f16569a.remove();
            }
            AbstractMapBasedMultimap.this.f16562t--;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class KeySet extends Maps.KeySet<K, Collection<V>> {
        public KeySet(Map map) {
            super(map);
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            Iterators.b(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection collection) {
            return this.f17063a.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return this == obj || this.f17063a.keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return this.f17063a.keySet().hashCode();
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            final Iterator<Map.Entry<K, V>> it = this.f17063a.entrySet().iterator();
            return new Iterator<Object>(this) { // from class: com.google.common.collect.AbstractMapBasedMultimap.KeySet.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public Map.Entry f16575a;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ KeySet f16577c;

                {
                    this.f16577c = this;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public final Object next() {
                    Map.Entry entry = (Map.Entry) it.next();
                    this.f16575a = entry;
                    return entry.getKey();
                }

                @Override // java.util.Iterator
                public final void remove() {
                    Preconditions.p("no calls to next() since the last call to remove()", this.f16575a != null);
                    Collection collection = (Collection) this.f16575a.getValue();
                    it.remove();
                    AbstractMapBasedMultimap.this.f16562t -= collection.size();
                    collection.clear();
                    this.f16575a = null;
                }
            };
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            int size;
            Collection collection = (Collection) this.f17063a.remove(obj);
            if (collection != null) {
                size = collection.size();
                collection.clear();
                AbstractMapBasedMultimap.this.f16562t -= size;
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class NavigableAsMap extends AbstractMapBasedMultimap<K, V>.SortedAsMap implements NavigableMap<K, Collection<V>> {
        public NavigableAsMap(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set b() {
            return new NavigableKeySet(g());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry ceilingEntry(Object obj) {
            Map.Entry<K, V> entryCeilingEntry = g().ceilingEntry(obj);
            if (entryCeilingEntry == null) {
                return null;
            }
            return d(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public final Object ceilingKey(Object obj) {
            return g().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet descendingKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap descendingMap() {
            return new NavigableAsMap(g().descendingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap
        /* JADX INFO: renamed from: e */
        public final SortedSet b() {
            return new NavigableKeySet(g());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap
        /* JADX INFO: renamed from: f */
        public final SortedSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry firstEntry() {
            Map.Entry<K, V> entryFirstEntry = g().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return d(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry floorEntry(Object obj) {
            Map.Entry<K, V> entryFloorEntry = g().floorEntry(obj);
            if (entryFloorEntry == null) {
                return null;
            }
            return d(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public final Object floorKey(Object obj) {
            return g().floorKey(obj);
        }

        public final Map.Entry h(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Collection collectionJ = abstractMapBasedMultimap.j();
            collectionJ.addAll((Collection) entry.getValue());
            it.remove();
            return new ImmutableEntry(entry.getKey(), abstractMapBasedMultimap.p(collectionJ));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry higherEntry(Object obj) {
            Map.Entry<K, V> entryHigherEntry = g().higherEntry(obj);
            if (entryHigherEntry == null) {
                return null;
            }
            return d(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public final Object higherKey(Object obj) {
            return g().higherKey(obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final NavigableMap g() {
            return (NavigableMap) ((SortedMap) this.f16563d);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lastEntry() {
            Map.Entry<K, V> entryLastEntry = g().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return d(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lowerEntry(Object obj) {
            Map.Entry<K, V> entryLowerEntry = g().lowerEntry(obj);
            if (entryLowerEntry == null) {
                return null;
            }
            return d(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public final Object lowerKey(Object obj) {
            return g().lowerKey(obj);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollFirstEntry() {
            return h(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollLastEntry() {
            return h(((Maps.ViewCachingAbstractMap) descendingMap()).entrySet().iterator());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z11) {
            return new NavigableAsMap(g().headMap(obj, z11));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z11, Object obj2, boolean z12) {
            return new NavigableAsMap(g().subMap(obj, z11, obj2, z12));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z11) {
            return new NavigableAsMap(g().tailMap(obj, z11));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class NavigableKeySet extends AbstractMapBasedMultimap<K, V>.SortedKeySet implements NavigableSet<K> {
        public NavigableKeySet(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public final Object ceiling(Object obj) {
            return g().ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public final Iterator descendingIterator() {
            return ((KeySet) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet descendingSet() {
            return new NavigableKeySet(g().descendingMap());
        }

        @Override // java.util.NavigableSet
        public final Object floor(Object obj) {
            return g().floorKey(obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final NavigableMap g() {
            return (NavigableMap) ((SortedMap) this.f17063a);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public final Object higher(Object obj) {
            return g().higherKey(obj);
        }

        @Override // java.util.NavigableSet
        public final Object lower(Object obj) {
            return g().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public final Object pollFirst() {
            return Iterators.j(iterator());
        }

        @Override // java.util.NavigableSet
        public final Object pollLast() {
            return Iterators.j(descendingIterator());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z11) {
            return new NavigableKeySet(g().headMap(obj, z11));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z11, Object obj2, boolean z12) {
            return new NavigableKeySet(g().subMap(obj, z11, obj2, z12));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z11) {
            return new NavigableKeySet(g().tailMap(obj, z11));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class RandomAccessWrappedList extends AbstractMapBasedMultimap<K, V>.WrappedList implements RandomAccess {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class SortedAsMap extends AbstractMapBasedMultimap<K, V>.AsMap implements SortedMap<K, Collection<V>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SortedSet f16579f;

        public SortedAsMap(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return g().comparator();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SortedSet b() {
            return new SortedKeySet(g());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public SortedSet keySet() {
            SortedSet sortedSet = this.f16579f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet sortedSetB = b();
            this.f16579f = sortedSetB;
            return sortedSetB;
        }

        @Override // java.util.SortedMap
        public final Object firstKey() {
            return g().firstKey();
        }

        public SortedMap g() {
            return (SortedMap) this.f16563d;
        }

        public SortedMap headMap(Object obj) {
            return new SortedAsMap(g().headMap(obj));
        }

        @Override // java.util.SortedMap
        public final Object lastKey() {
            return g().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return new SortedAsMap(g().subMap(obj, obj2));
        }

        public SortedMap tailMap(Object obj) {
            return new SortedAsMap(g().tailMap(obj));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class SortedKeySet extends AbstractMapBasedMultimap<K, V>.KeySet implements SortedSet<K> {
        public SortedKeySet(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public final Comparator comparator() {
            return g().comparator();
        }

        @Override // java.util.SortedSet
        public final Object first() {
            return g().firstKey();
        }

        public SortedMap g() {
            return (SortedMap) this.f17063a;
        }

        public SortedSet headSet(Object obj) {
            return new SortedKeySet(g().headMap(obj));
        }

        @Override // java.util.SortedSet
        public final Object last() {
            return g().lastKey();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return new SortedKeySet(g().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return new SortedKeySet(g().tailMap(obj));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class WrappedNavigableSet extends AbstractMapBasedMultimap<K, V>.WrappedSortedSet implements NavigableSet<V> {
        public WrappedNavigableSet(Object obj, NavigableSet navigableSet, WrappedCollection wrappedCollection) {
            super(obj, navigableSet, wrappedCollection);
        }

        @Override // java.util.NavigableSet
        public final Object ceiling(Object obj) {
            return f().ceiling(obj);
        }

        @Override // java.util.NavigableSet
        public final Iterator descendingIterator() {
            return new WrappedCollection.WrappedIterator(f().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet descendingSet() {
            return h(f().descendingSet());
        }

        @Override // java.util.NavigableSet
        public final Object floor(Object obj) {
            return f().floor(obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final NavigableSet f() {
            return (NavigableSet) ((SortedSet) this.f16583b);
        }

        public final NavigableSet h(NavigableSet navigableSet) {
            WrappedCollection wrappedCollection = this.f16584c;
            if (wrappedCollection == null) {
                wrappedCollection = this;
            }
            return new WrappedNavigableSet(this.f16582a, navigableSet, wrappedCollection);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z11) {
            return h(f().headSet(obj, z11));
        }

        @Override // java.util.NavigableSet
        public final Object higher(Object obj) {
            return f().higher(obj);
        }

        @Override // java.util.NavigableSet
        public final Object lower(Object obj) {
            return f().lower(obj);
        }

        @Override // java.util.NavigableSet
        public final Object pollFirst() {
            return Iterators.j(iterator());
        }

        @Override // java.util.NavigableSet
        public final Object pollLast() {
            return Iterators.j(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z11, Object obj2, boolean z12) {
            return h(f().subSet(obj, z11, obj2, z12));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z11) {
            return h(f().tailSet(obj, z11));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class WrappedSet extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements Set<V> {
        public WrappedSet(Object obj, Set set) {
            super(obj, set, null);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zG = Sets.g((Set) this.f16583b, collection);
            if (zG) {
                AbstractMapBasedMultimap.this.f16562t += this.f16583b.size() - size;
                e();
            }
            return zG;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class WrappedSortedSet extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements SortedSet<V> {
        public WrappedSortedSet(Object obj, SortedSet sortedSet, WrappedCollection wrappedCollection) {
            super(obj, sortedSet, wrappedCollection);
        }

        @Override // java.util.SortedSet
        public final Comparator comparator() {
            return f().comparator();
        }

        public SortedSet f() {
            return (SortedSet) this.f16583b;
        }

        @Override // java.util.SortedSet
        public final Object first() {
            d();
            return f().first();
        }

        @Override // java.util.SortedSet
        public final SortedSet headSet(Object obj) {
            d();
            SortedSet sortedSetHeadSet = f().headSet(obj);
            WrappedCollection wrappedCollection = this.f16584c;
            if (wrappedCollection == null) {
                wrappedCollection = this;
            }
            return new WrappedSortedSet(this.f16582a, sortedSetHeadSet, wrappedCollection);
        }

        @Override // java.util.SortedSet
        public final Object last() {
            d();
            return f().last();
        }

        @Override // java.util.SortedSet
        public final SortedSet subSet(Object obj, Object obj2) {
            d();
            SortedSet sortedSetSubSet = f().subSet(obj, obj2);
            WrappedCollection wrappedCollection = this.f16584c;
            if (wrappedCollection == null) {
                wrappedCollection = this;
            }
            return new WrappedSortedSet(this.f16582a, sortedSetSubSet, wrappedCollection);
        }

        @Override // java.util.SortedSet
        public final SortedSet tailSet(Object obj) {
            d();
            SortedSet sortedSetTailSet = f().tailSet(obj);
            WrappedCollection wrappedCollection = this.f16584c;
            if (wrappedCollection == null) {
                wrappedCollection = this;
            }
            return new WrappedSortedSet(this.f16582a, sortedSetTailSet, wrappedCollection);
        }
    }

    public AbstractMapBasedMultimap(Map map) {
        Preconditions.g(map.isEmpty());
        this.f16561f = map;
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Map a() {
        return new AsMap(this.f16561f);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection b(Object obj) {
        Collection collection = (Collection) this.f16561f.remove(obj);
        if (collection == null) {
            return n();
        }
        Collection collectionJ = j();
        collectionJ.addAll(collection);
        this.f16562t -= collection.size();
        collection.clear();
        return p(collectionJ);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Collection c() {
        return this instanceof SetMultimap ? new AbstractMultimap.EntrySet() : new AbstractMultimap.Entries();
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        Iterator<V> it = this.f16561f.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f16561f.clear();
        this.f16562t = 0;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(Object obj) {
        return this.f16561f.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Set d() {
        return new KeySet(this.f16561f);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Multiset f() {
        return new Multimaps.Keys(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Collection g() {
        return new AbstractMultimap.Values(this);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection get(Object obj) {
        Collection collectionK = (Collection) this.f16561f.get(obj);
        if (collectionK == null) {
            collectionK = k(obj);
        }
        return r(obj, collectionK);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Iterator i() {
        return new AnonymousClass2();
    }

    public abstract Collection j();

    public Collection k(Object obj) {
        return j();
    }

    public final Map l() {
        Map map = this.f16561f;
        if (map instanceof NavigableMap) {
            return new NavigableAsMap((NavigableMap) this.f16561f);
        }
        return map instanceof SortedMap ? new SortedAsMap((SortedMap) this.f16561f) : new AsMap(this.f16561f);
    }

    public final Set m() {
        Map map = this.f16561f;
        if (map instanceof NavigableMap) {
            return new NavigableKeySet((NavigableMap) this.f16561f);
        }
        return map instanceof SortedMap ? new SortedKeySet((SortedMap) this.f16561f) : new KeySet(this.f16561f);
    }

    public Collection n() {
        return p(j());
    }

    public final void o(Map map) {
        this.f16561f = map;
        this.f16562t = 0;
        for (V v11 : map.values()) {
            Preconditions.g(!v11.isEmpty());
            this.f16562t = v11.size() + this.f16562t;
        }
    }

    public Collection p(Collection collection) {
        return Collections.unmodifiableCollection(collection);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.f16561f.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f16562t++;
            return true;
        }
        Collection collectionK = k(obj);
        if (!collectionK.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f16562t++;
        this.f16561f.put(obj, collectionK);
        return true;
    }

    public Iterator q() {
        return new AnonymousClass1();
    }

    public Collection r(Object obj, Collection collection) {
        return new WrappedCollection(obj, collection, null);
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.f16562t;
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class WrappedList extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements List<V> {

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public class WrappedListIterator extends AbstractMapBasedMultimap<K, V>.WrappedCollection.WrappedIterator implements ListIterator<V> {
            public WrappedListIterator() {
                super();
            }

            @Override // java.util.ListIterator
            public final void add(Object obj) {
                WrappedList wrappedList = WrappedList.this;
                boolean zIsEmpty = wrappedList.isEmpty();
                b().add(obj);
                AbstractMapBasedMultimap.this.f16562t++;
                if (zIsEmpty) {
                    wrappedList.b();
                }
            }

            public final ListIterator b() {
                a();
                return (ListIterator) this.f16587a;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return b().hasPrevious();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return b().nextIndex();
            }

            @Override // java.util.ListIterator
            public final Object previous() {
                return b().previous();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return b().previousIndex();
            }

            @Override // java.util.ListIterator
            public final void set(Object obj) {
                b().set(obj);
            }

            public WrappedListIterator(int i11) {
                super(((List) WrappedList.this.f16583b).listIterator(i11));
            }
        }

        public WrappedList(Object obj, List list, WrappedCollection wrappedCollection) {
            super(obj, list, wrappedCollection);
        }

        @Override // java.util.List
        public final void add(int i11, Object obj) {
            d();
            boolean zIsEmpty = this.f16583b.isEmpty();
            ((List) this.f16583b).add(i11, obj);
            AbstractMapBasedMultimap.this.f16562t++;
            if (zIsEmpty) {
                b();
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i11, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = ((List) this.f16583b).addAll(i11, collection);
            if (zAddAll) {
                AbstractMapBasedMultimap.this.f16562t += this.f16583b.size() - size;
                if (size == 0) {
                    b();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public final Object get(int i11) {
            d();
            return ((List) this.f16583b).get(i11);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            d();
            return ((List) this.f16583b).indexOf(obj);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            d();
            return ((List) this.f16583b).lastIndexOf(obj);
        }

        @Override // java.util.List
        public final ListIterator listIterator() {
            d();
            return new WrappedListIterator();
        }

        @Override // java.util.List
        public final Object remove(int i11) {
            d();
            Object objRemove = ((List) this.f16583b).remove(i11);
            AbstractMapBasedMultimap.this.f16562t--;
            e();
            return objRemove;
        }

        @Override // java.util.List
        public final Object set(int i11, Object obj) {
            d();
            return ((List) this.f16583b).set(i11, obj);
        }

        @Override // java.util.List
        public final List subList(int i11, int i12) {
            d();
            List listSubList = ((List) this.f16583b).subList(i11, i12);
            WrappedCollection wrappedCollection = this.f16584c;
            if (wrappedCollection == null) {
                wrappedCollection = this;
            }
            boolean z11 = listSubList instanceof RandomAccess;
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Object obj = this.f16582a;
            return z11 ? new RandomAccessWrappedList(obj, listSubList, wrappedCollection) : new WrappedList(obj, listSubList, wrappedCollection);
        }

        @Override // java.util.List
        public final ListIterator listIterator(int i11) {
            d();
            return new WrappedListIterator(i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class WrappedCollection extends AbstractCollection<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f16582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Collection f16583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WrappedCollection f16584c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Collection f16585d;

        public WrappedCollection(Object obj, Collection collection, WrappedCollection wrappedCollection) {
            this.f16582a = obj;
            this.f16583b = collection;
            this.f16584c = wrappedCollection;
            this.f16585d = wrappedCollection == null ? null : wrappedCollection.f16583b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(Object obj) {
            d();
            boolean zIsEmpty = this.f16583b.isEmpty();
            boolean zAdd = this.f16583b.add(obj);
            if (zAdd) {
                AbstractMapBasedMultimap.this.f16562t++;
                if (zIsEmpty) {
                    b();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f16583b.addAll(collection);
            if (zAddAll) {
                AbstractMapBasedMultimap.this.f16562t += this.f16583b.size() - size;
                if (size == 0) {
                    b();
                }
            }
            return zAddAll;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b() {
            WrappedCollection wrappedCollection = this.f16584c;
            if (wrappedCollection != null) {
                wrappedCollection.b();
            } else {
                AbstractMapBasedMultimap.this.f16561f.put(this.f16582a, this.f16583b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f16583b.clear();
            AbstractMapBasedMultimap.this.f16562t -= size;
            e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            d();
            return this.f16583b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection collection) {
            d();
            return this.f16583b.containsAll(collection);
        }

        public final void d() {
            Collection collection;
            WrappedCollection wrappedCollection = this.f16584c;
            if (wrappedCollection != null) {
                wrappedCollection.d();
                if (wrappedCollection.f16583b != this.f16585d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f16583b.isEmpty() || (collection = (Collection) AbstractMapBasedMultimap.this.f16561f.get(this.f16582a)) == null) {
                    return;
                }
                this.f16583b = collection;
            }
        }

        public final void e() {
            WrappedCollection wrappedCollection = this.f16584c;
            if (wrappedCollection != null) {
                wrappedCollection.e();
            } else if (this.f16583b.isEmpty()) {
                AbstractMapBasedMultimap.this.f16561f.remove(this.f16582a);
            }
        }

        @Override // java.util.Collection
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            d();
            return this.f16583b.equals(obj);
        }

        @Override // java.util.Collection
        public final int hashCode() {
            d();
            return this.f16583b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            d();
            return new WrappedIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            d();
            boolean zRemove = this.f16583b.remove(obj);
            if (zRemove) {
                AbstractMapBasedMultimap.this.f16562t--;
                e();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f16583b.removeAll(collection);
            if (zRemoveAll) {
                AbstractMapBasedMultimap.this.f16562t += this.f16583b.size() - size;
                e();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection collection) {
            collection.getClass();
            int size = size();
            boolean zRetainAll = this.f16583b.retainAll(collection);
            if (zRetainAll) {
                AbstractMapBasedMultimap.this.f16562t += this.f16583b.size() - size;
                e();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            d();
            return this.f16583b.size();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            d();
            return this.f16583b.toString();
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public class WrappedIterator implements Iterator<V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator f16587a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Collection f16588b;

            public WrappedIterator() {
                Collection collection = WrappedCollection.this.f16583b;
                this.f16588b = collection;
                this.f16587a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
            }

            public final void a() {
                WrappedCollection wrappedCollection = WrappedCollection.this;
                wrappedCollection.d();
                if (wrappedCollection.f16583b != this.f16588b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                a();
                return this.f16587a.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                a();
                return this.f16587a.next();
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.f16587a.remove();
                WrappedCollection wrappedCollection = WrappedCollection.this;
                AbstractMapBasedMultimap.this.f16562t--;
                wrappedCollection.e();
            }

            public WrappedIterator(Iterator it) {
                this.f16588b = WrappedCollection.this.f16583b;
                this.f16587a = it;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends AbstractMapBasedMultimap<Object, Object>.Itr<Object> {
        @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
        public final Object a(Object obj, Object obj2) {
            return obj2;
        }
    }
}
