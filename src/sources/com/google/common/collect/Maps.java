package com.google.common.collect;

import com.google.common.base.Converter;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Maps {

    /* JADX INFO: renamed from: com.google.common.collect.Maps$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends TransformedIterator<Map.Entry<Object, Object>, Object> {
        @Override // com.google.common.collect.TransformedIterator
        public final Object a(Object obj) {
            return ((Map.Entry) obj).getKey();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$10, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass10 implements Function<Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ EntryTransformer f17027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f17028b;

        public AnonymousClass10(EntryTransformer entryTransformer, Object obj) {
            this.f17027a = entryTransformer;
            this.f17028b = obj;
        }

        @Override // com.google.common.base.Function
        public final Object apply(Object obj) {
            return this.f17027a.a(this.f17028b, obj);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$12, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass12 extends AbstractMapEntry<Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map.Entry f17030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ EntryTransformer f17031b;

        public AnonymousClass12(Map.Entry entry, EntryTransformer entryTransformer) {
            this.f17030a = entry;
            this.f17031b = entryTransformer;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f17030a.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            Map.Entry entry = this.f17030a;
            return this.f17031b.a(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$13, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass13 implements Function<Map.Entry<Object, Object>, Map.Entry<Object, Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ EntryTransformer f17032a;

        public AnonymousClass13(EntryTransformer entryTransformer) {
            this.f17032a = entryTransformer;
        }

        @Override // com.google.common.base.Function
        public final Map.Entry<Object, Object> apply(Map.Entry<Object, Object> entry) {
            Map.Entry<Object, Object> entry2 = entry;
            EntryTransformer entryTransformer = this.f17032a;
            entryTransformer.getClass();
            entry2.getClass();
            return new AnonymousClass12(entry2, entryTransformer);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 extends TransformedIterator<Map.Entry<Object, Object>, Object> {
        @Override // com.google.common.collect.TransformedIterator
        public final Object a(Object obj) {
            return ((Map.Entry) obj).getValue();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass3 extends TransformedIterator<Object, Map.Entry<Object, Object>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function f17033b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Iterator it, Function function) {
            super(it);
            this.f17033b = function;
        }

        @Override // com.google.common.collect.TransformedIterator
        public final Object a(Object obj) {
            return new ImmutableEntry(obj, this.f17033b.apply(obj));
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass5 extends ForwardingSortedSet<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SortedSet f17035a;

        public AnonymousClass5(SortedSet sortedSet) {
            this.f17035a = sortedSet;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet headSet(Object obj) {
            return new AnonymousClass5(super.headSet(obj));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final Object j0() {
            return this.f17035a;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* JADX INFO: renamed from: o0 */
        public final Collection j0() {
            return this.f17035a;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return new AnonymousClass5(super.subSet(obj, obj2));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet tailSet(Object obj) {
            return new AnonymousClass5(super.tailSet(obj));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet
        /* JADX INFO: renamed from: w0 */
        public final Set j0() {
            return this.f17035a;
        }

        @Override // com.google.common.collect.ForwardingSortedSet
        /* JADX INFO: renamed from: z0 */
        public final SortedSet j0() {
            return this.f17035a;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass7 extends AbstractMapEntry<Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map.Entry f17037a;

        public AnonymousClass7(Map.Entry entry) {
            this.f17037a = entry;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f17037a.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.f17037a.getValue();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$8, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass8 extends UnmodifiableIterator<Map.Entry<Object, Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f17038a;

        public AnonymousClass8(Iterator it) {
            this.f17038a = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f17038a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry entry = (Map.Entry) this.f17038a.next();
            entry.getClass();
            return new AnonymousClass7(entry);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$9, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass9 implements EntryTransformer<Object, Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function f17039a;

        public AnonymousClass9(Function function) {
            this.f17039a = function;
        }

        @Override // com.google.common.collect.Maps.EntryTransformer
        public final Object a(Object obj, Object obj2) {
            return this.f17039a.apply(obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class AbstractFilteredMap<K, V> extends ViewCachingAbstractMap<K, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map f17040d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Predicate f17041e;

        public AbstractFilteredMap(Map map, Predicate predicate) {
            this.f17040d = map;
            this.f17041e = predicate;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Collection c() {
            return new FilteredMapValues(this, this.f17040d, this.f17041e);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            Map map = this.f17040d;
            return map.containsKey(obj) && d(obj, map.get(obj));
        }

        public final boolean d(Object obj, Object obj2) {
            return this.f17041e.apply(new ImmutableEntry(obj, obj2));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Object obj2 = this.f17040d.get(obj);
            if (obj2 == null || !d(obj, obj2)) {
                return null;
            }
            return obj2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean isEmpty() {
            return entrySet().isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            Preconditions.g(d(obj, obj2));
            return this.f17040d.put(obj, obj2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void putAll(Map map) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                Preconditions.g(d(entry.getKey(), entry.getValue()));
            }
            this.f17040d.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            if (containsKey(obj)) {
                return this.f17040d.remove(obj);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class AsMapView<K, V> extends ViewCachingAbstractMap<K, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Set f17042d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Function f17043e;

        public AsMapView(Set set, Function function) {
            set.getClass();
            this.f17042d = set;
            function.getClass();
            this.f17043e = function;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set a() {
            return new EntrySet<Object, Object>() { // from class: com.google.common.collect.Maps.AsMapView.1EntrySetImpl
                @Override // com.google.common.collect.Maps.EntrySet
                public final Map f() {
                    return AsMapView.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
                    AsMapView asMapView = AsMapView.this;
                    Set setD = asMapView.d();
                    return new AnonymousClass3(setD.iterator(), asMapView.f17043e);
                }
            };
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set b() {
            final Set setD = d();
            return new ForwardingSet<Object>() { // from class: com.google.common.collect.Maps.4
                @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
                public final boolean add(Object obj) {
                    throw new UnsupportedOperationException();
                }

                @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
                public final boolean addAll(Collection collection) {
                    throw new UnsupportedOperationException();
                }

                @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
                public final Object j0() {
                    return setD;
                }

                @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
                /* JADX INFO: renamed from: o0 */
                public final Collection j0() {
                    return setD;
                }

                @Override // com.google.common.collect.ForwardingSet
                /* JADX INFO: renamed from: w0 */
                public final Set j0() {
                    return setD;
                }
            };
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Collection c() {
            return new Collections2.TransformedCollection(this.f17042d, this.f17043e);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            d().clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return d().contains(obj);
        }

        public Set d() {
            return this.f17042d;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            if (Collections2.c(obj, d())) {
                return this.f17043e.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            if (d().remove(obj)) {
                return this.f17043e.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return d().size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class BiMapConverter<A, B> extends Converter<A, B> implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Converter
        public final Object b(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Function
        public final boolean equals(Object obj) {
            if (obj instanceof BiMapConverter) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Maps.asConverter(null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class DescendingMap<K, V> extends ForwardingMap<K, V> implements NavigableMap<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public transient Ordering f17045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public transient Set f17046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public transient NavigableSet f17047c;

        @Override // java.util.NavigableMap
        public final Map.Entry ceilingEntry(Object obj) {
            return w0().floorEntry(obj);
        }

        @Override // java.util.NavigableMap
        public final Object ceilingKey(Object obj) {
            return w0().floorKey(obj);
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            Ordering ordering = this.f17045a;
            if (ordering != null) {
                return ordering;
            }
            Comparator<? super K> comparator = w0().comparator();
            if (comparator == null) {
                comparator = NaturalOrdering.f17113c;
            }
            Ordering orderingG = Ordering.b(comparator).g();
            this.f17045a = orderingG;
            return orderingG;
        }

        @Override // java.util.NavigableMap
        public final NavigableSet descendingKeySet() {
            return w0().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap descendingMap() {
            return w0();
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final Set entrySet() {
            Set set = this.f17046b;
            if (set != null) {
                return set;
            }
            EntrySet<Object, Object> entrySet = new EntrySet<Object, Object>() { // from class: com.google.common.collect.Maps.DescendingMap.1EntrySetImpl
                @Override // com.google.common.collect.Maps.EntrySet
                public final Map f() {
                    return DescendingMap.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
                    return DescendingMap.this.r0();
                }
            };
            this.f17046b = entrySet;
            return entrySet;
        }

        @Override // java.util.NavigableMap
        public final Map.Entry firstEntry() {
            return w0().lastEntry();
        }

        @Override // java.util.SortedMap
        public final Object firstKey() {
            return w0().lastKey();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry floorEntry(Object obj) {
            return w0().ceilingEntry(obj);
        }

        @Override // java.util.NavigableMap
        public final Object floorKey(Object obj) {
            return w0().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z11) {
            return w0().tailMap(obj, z11).descendingMap();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry higherEntry(Object obj) {
            return w0().lowerEntry(obj);
        }

        @Override // java.util.NavigableMap
        public final Object higherKey(Object obj) {
            return w0().lowerKey(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Object j0() {
            return w0();
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final Set keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lastEntry() {
            return w0().firstEntry();
        }

        @Override // java.util.SortedMap
        public final Object lastKey() {
            return w0().firstKey();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lowerEntry(Object obj) {
            return w0().higherEntry(obj);
        }

        @Override // java.util.NavigableMap
        public final Object lowerKey(Object obj) {
            return w0().higherKey(obj);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet navigableKeySet() {
            NavigableSet navigableSet = this.f17047c;
            if (navigableSet != null) {
                return navigableSet;
            }
            NavigableKeySet navigableKeySet = new NavigableKeySet(this);
            this.f17047c = navigableKeySet;
            return navigableKeySet;
        }

        @Override // com.google.common.collect.ForwardingMap
        /* JADX INFO: renamed from: o0 */
        public final Map j0() {
            return w0();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollFirstEntry() {
            return w0().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollLastEntry() {
            return w0().pollFirstEntry();
        }

        public abstract Iterator r0();

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z11, Object obj2, boolean z12) {
            return w0().subMap(obj2, z12, obj, z11).descendingMap();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z11) {
            return w0().headMap(obj, z11).descendingMap();
        }

        @Override // com.google.common.collect.ForwardingObject
        public final String toString() {
            return Maps.h(this);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public final Collection values() {
            return new Values(this);
        }

        public abstract NavigableMap w0();

        @Override // java.util.NavigableMap, java.util.SortedMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public enum EntryFunction implements Function<Map.Entry<?, ?>, Object> {
        KEY { // from class: com.google.common.collect.Maps.EntryFunction.1
            @Override // com.google.common.base.Function
            public final Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE { // from class: com.google.common.collect.Maps.EntryFunction.2
            @Override // com.google.common.base.Function
            public final Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class EntrySet<K, V> extends Sets.ImprovedAbstractSet<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            f().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object objG = Maps.g(key, f());
            if (Objects.a(objG, entry.getValue())) {
                return objG != null || f().containsKey(key);
            }
            return false;
        }

        public abstract Map f();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return f().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj) && (obj instanceof Map.Entry)) {
                return f().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            try {
                collection.getClass();
                return Sets.g(this, collection);
            } catch (UnsupportedOperationException unused) {
                return Sets.h(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet(Maps.c(collection.size()));
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSet.add(((Map.Entry) obj).getKey());
                    }
                }
                return f().keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return f().size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface EntryTransformer<K, V1, V2> {
        Object a(Object obj, Object obj2);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class FilteredEntryBiMap<K, V> extends FilteredEntryMap<K, V> implements BiMap<K, V> {

        /* JADX INFO: renamed from: com.google.common.collect.Maps$FilteredEntryBiMap$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 implements Predicate<Map.Entry<Object, Object>> {
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                new ImmutableEntry(entry.getValue(), entry.getKey());
                throw null;
            }
        }

        @Override // com.google.common.collect.BiMap
        public final BiMap Z() {
            return null;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public final Collection values() {
            throw null;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public final Set values() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class FilteredEntryMap<K, V> extends AbstractFilteredMap<K, V> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Set f17049f;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public class EntrySet extends ForwardingSet<Map.Entry<K, V>> {
            public EntrySet() {
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return new TransformedIterator<Map.Entry<Object, Object>, Map.Entry<Object, Object>>(FilteredEntryMap.this.f17049f.iterator()) { // from class: com.google.common.collect.Maps.FilteredEntryMap.EntrySet.1
                    @Override // com.google.common.collect.TransformedIterator
                    public final Object a(Object obj) {
                        final Map.Entry entry = (Map.Entry) obj;
                        return new ForwardingMapEntry<Object, Object>(this) { // from class: com.google.common.collect.Maps.FilteredEntryMap.EntrySet.1.1

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ AnonymousClass1 f17053b;

                            {
                                this.f17053b = this;
                            }

                            @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                            public final Object j0() {
                                return entry;
                            }

                            @Override // com.google.common.collect.ForwardingMapEntry
                            /* JADX INFO: renamed from: o0 */
                            public final Map.Entry j0() {
                                return entry;
                            }

                            @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                            public final Object setValue(Object obj2) {
                                Preconditions.g(FilteredEntryMap.this.d(getKey(), obj2));
                                return super.setValue(obj2);
                            }
                        };
                    }
                };
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public final Object j0() {
                return FilteredEntryMap.this.f17049f;
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
            /* JADX INFO: renamed from: o0 */
            public final Collection j0() {
                return FilteredEntryMap.this.f17049f;
            }

            @Override // com.google.common.collect.ForwardingSet
            /* JADX INFO: renamed from: w0 */
            public final Set j0() {
                return FilteredEntryMap.this.f17049f;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public class KeySet extends KeySet<K, V> {
            public KeySet() {
                super(FilteredEntryMap.this);
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                FilteredEntryMap filteredEntryMap = FilteredEntryMap.this;
                if (!filteredEntryMap.containsKey(obj)) {
                    return false;
                }
                filteredEntryMap.f17040d.remove(obj);
                return true;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean removeAll(Collection collection) {
                FilteredEntryMap filteredEntryMap = FilteredEntryMap.this;
                return FilteredEntryMap.e(filteredEntryMap.f17040d, filteredEntryMap.f17041e, collection);
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean retainAll(Collection collection) {
                FilteredEntryMap filteredEntryMap = FilteredEntryMap.this;
                return FilteredEntryMap.f(filteredEntryMap.f17040d, filteredEntryMap.f17041e, collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final Object[] toArray() {
                return Lists.a(iterator()).toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final Object[] toArray(Object[] objArr) {
                return Lists.a(iterator()).toArray(objArr);
            }
        }

        public FilteredEntryMap(Map map, Predicate predicate) {
            super(map, predicate);
            this.f17049f = Sets.d(map.entrySet(), this.f17041e);
        }

        public static boolean e(Map map, Predicate predicate, Collection collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (predicate.apply(next) && collection.contains(next.getKey())) {
                    it.remove();
                    z11 = true;
                }
            }
            return z11;
        }

        public static boolean f(Map map, Predicate predicate, Collection collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (predicate.apply(next) && !collection.contains(next.getKey())) {
                    it.remove();
                    z11 = true;
                }
            }
            return z11;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set a() {
            return new EntrySet();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set b() {
            return new KeySet();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class FilteredEntryNavigableMap<K, V> extends AbstractNavigableMap<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NavigableMap f17055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Predicate f17056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map f17057c;

        public FilteredEntryNavigableMap(NavigableMap navigableMap, Predicate predicate) {
            navigableMap.getClass();
            this.f17055a = navigableMap;
            this.f17056b = predicate;
            this.f17057c = new FilteredEntryMap(navigableMap, predicate);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final Iterator a() {
            return Iterators.e(this.f17055a.entrySet().iterator(), this.f17056b);
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public final Iterator b() {
            return Iterators.e(this.f17055a.descendingMap().entrySet().iterator(), this.f17056b);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public final void clear() {
            ((AbstractMap) this.f17057c).clear();
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return this.f17055a.comparator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return ((AbstractFilteredMap) this.f17057c).containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public final NavigableMap descendingMap() {
            return Maps.d(this.f17055a.descendingMap(), this.f17056b);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public final Set entrySet() {
            return ((ViewCachingAbstractMap) this.f17057c).entrySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            return ((AbstractFilteredMap) this.f17057c).get(obj);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z11) {
            return Maps.d(this.f17055a.headMap(obj, z11), this.f17056b);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean isEmpty() {
            return !Iterables.a(this.f17055a.entrySet(), this.f17056b);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public final NavigableSet navigableKeySet() {
            return new NavigableKeySet<Object, Object>(this) { // from class: com.google.common.collect.Maps.FilteredEntryNavigableMap.1
                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean removeAll(Collection collection) {
                    FilteredEntryNavigableMap filteredEntryNavigableMap = FilteredEntryNavigableMap.this;
                    return FilteredEntryMap.e(filteredEntryNavigableMap.f17055a, filteredEntryNavigableMap.f17056b, collection);
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean retainAll(Collection collection) {
                    FilteredEntryNavigableMap filteredEntryNavigableMap = FilteredEntryNavigableMap.this;
                    return FilteredEntryMap.f(filteredEntryNavigableMap.f17055a, filteredEntryNavigableMap.f17056b, collection);
                }
            };
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public final Map.Entry pollFirstEntry() {
            return (Map.Entry) Iterables.e(this.f17055a.entrySet(), this.f17056b);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public final Map.Entry pollLastEntry() {
            return (Map.Entry) Iterables.e(this.f17055a.descendingMap().entrySet(), this.f17056b);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            return ((AbstractFilteredMap) this.f17057c).put(obj, obj2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void putAll(Map map) {
            ((AbstractFilteredMap) this.f17057c).putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            return ((AbstractFilteredMap) this.f17057c).remove(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return ((AbstractMap) this.f17057c).size();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z11, Object obj2, boolean z12) {
            return Maps.d(this.f17055a.subMap(obj, z11, obj2, z12), this.f17056b);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z11) {
            return Maps.d(this.f17055a.tailMap(obj, z11), this.f17056b);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public final Collection values() {
            return new FilteredMapValues(this, this.f17055a, this.f17056b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class FilteredEntrySortedMap<K, V> extends FilteredEntryMap<K, V> implements SortedMap<K, V> {

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public class SortedKeySet extends FilteredEntryMap<K, V>.KeySet implements SortedSet<K> {
            public SortedKeySet() {
                super();
            }

            @Override // java.util.SortedSet
            public final Comparator comparator() {
                return ((SortedMap) FilteredEntrySortedMap.this.f17040d).comparator();
            }

            @Override // java.util.SortedSet
            public final Object first() {
                return FilteredEntrySortedMap.this.firstKey();
            }

            @Override // java.util.SortedSet
            public final SortedSet headSet(Object obj) {
                return (SortedSet) ((FilteredEntrySortedMap) FilteredEntrySortedMap.this.headMap(obj)).keySet();
            }

            @Override // java.util.SortedSet
            public final Object last() {
                return FilteredEntrySortedMap.this.lastKey();
            }

            @Override // java.util.SortedSet
            public final SortedSet subSet(Object obj, Object obj2) {
                return (SortedSet) ((FilteredEntrySortedMap) FilteredEntrySortedMap.this.subMap(obj, obj2)).keySet();
            }

            @Override // java.util.SortedSet
            public final SortedSet tailSet(Object obj) {
                return (SortedSet) ((FilteredEntrySortedMap) FilteredEntrySortedMap.this.tailMap(obj)).keySet();
            }
        }

        @Override // com.google.common.collect.Maps.FilteredEntryMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set b() {
            return new SortedKeySet();
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return ((SortedMap) this.f17040d).comparator();
        }

        @Override // java.util.SortedMap
        public final Object firstKey() {
            return ((SortedSet) super.keySet()).iterator().next();
        }

        @Override // java.util.SortedMap
        public final SortedMap headMap(Object obj) {
            return new FilteredEntrySortedMap(((SortedMap) this.f17040d).headMap(obj), this.f17041e);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (SortedSet) super.keySet();
        }

        @Override // java.util.SortedMap
        public final Object lastKey() {
            Map map = this.f17040d;
            SortedMap<K, V> sortedMapHeadMap = (SortedMap) map;
            while (true) {
                K kLastKey = sortedMapHeadMap.lastKey();
                if (d(kLastKey, map.get(kLastKey))) {
                    return kLastKey;
                }
                sortedMapHeadMap = ((SortedMap) map).headMap(kLastKey);
            }
        }

        @Override // java.util.SortedMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return new FilteredEntrySortedMap(((SortedMap) this.f17040d).subMap(obj, obj2), this.f17041e);
        }

        @Override // java.util.SortedMap
        public final SortedMap tailMap(Object obj) {
            return new FilteredEntrySortedMap(((SortedMap) this.f17040d).tailMap(obj), this.f17041e);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class FilteredKeyMap<K, V> extends AbstractFilteredMap<K, V> {
        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set a() {
            return Sets.d(this.f17040d.entrySet(), this.f17041e);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public final Set b() {
            return Sets.d(this.f17040d.keySet(), null);
        }

        @Override // com.google.common.collect.Maps.AbstractFilteredMap, java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            if (this.f17040d.containsKey(obj)) {
                throw null;
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class FilteredMapValues<K, V> extends Values<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f17060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Predicate f17061c;

        public FilteredMapValues(AbstractMap abstractMap, Map map, Predicate predicate) {
            super(abstractMap);
            this.f17060b = map;
            this.f17061c = predicate;
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            Iterator<Map.Entry<K, V>> it = this.f17060b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f17061c.apply(next) && Objects.a(next.getValue(), obj)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection collection) {
            Iterator<Map.Entry<K, V>> it = this.f17060b.entrySet().iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f17061c.apply(next) && collection.contains(next.getValue())) {
                    it.remove();
                    z11 = true;
                }
            }
            return z11;
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection collection) {
            Iterator<Map.Entry<K, V>> it = this.f17060b.entrySet().iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f17061c.apply(next) && !collection.contains(next.getValue())) {
                    it.remove();
                    z11 = true;
                }
            }
            return z11;
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
    public static abstract class IteratorBasedAbstractMap<K, V> extends AbstractMap<K, V> {
        public abstract Iterator a();

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            Iterators.b(a());
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set entrySet() {
            return new EntrySet<Object, Object>() { // from class: com.google.common.collect.Maps.IteratorBasedAbstractMap.1
                @Override // com.google.common.collect.Maps.EntrySet
                public final Map f() {
                    return IteratorBasedAbstractMap.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
                    return IteratorBasedAbstractMap.this.a();
                }
            };
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class KeySet<K, V> extends Sets.ImprovedAbstractSet<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f17063a;

        public KeySet(Map map) {
            map.getClass();
            this.f17063a = map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            f().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return f().containsKey(obj);
        }

        public Map f() {
            return this.f17063a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return f().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new AnonymousClass1(f().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            f().remove(obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return f().size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class MapDifferenceImpl<K, V> implements MapDifference<K, V> {
        @Override // com.google.common.collect.MapDifference
        public Map a() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MapDifference)) {
                return false;
            }
            ((MapDifference) obj).a();
            throw null;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{null, null, null, null});
        }

        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class NavigableAsMapView<K, V> extends AbstractNavigableMap<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NavigableSet f17064a;

        public NavigableAsMapView(NavigableSet navigableSet) {
            navigableSet.getClass();
            this.f17064a = navigableSet;
            throw null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final Iterator a() {
            return new AnonymousClass3(this.f17064a.iterator(), null);
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public final Iterator b() {
            descendingMap();
            throw null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public final void clear() {
            this.f17064a.clear();
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return this.f17064a.comparator();
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public final NavigableMap descendingMap() {
            new NavigableAsMapView(this.f17064a.descendingSet());
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            if (Collections2.c(obj, this.f17064a)) {
                throw null;
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z11) {
            new NavigableAsMapView(this.f17064a.headSet(obj, z11));
            throw null;
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public final NavigableSet navigableKeySet() {
            return new AnonymousClass6(this.f17064a);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f17064a.size();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z11, Object obj2, boolean z12) {
            new NavigableAsMapView(this.f17064a.subSet(obj, z11, obj2, z12));
            throw null;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z11) {
            new NavigableAsMapView(this.f17064a.tailSet(obj, z11));
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SortedAsMapView<K, V> extends AsMapView<K, V> implements SortedMap<K, V> {
        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return ((SortedSet) this.f17042d).comparator();
        }

        @Override // com.google.common.collect.Maps.AsMapView
        public final Set d() {
            return (SortedSet) this.f17042d;
        }

        @Override // java.util.SortedMap
        public final Object firstKey() {
            return ((SortedSet) this.f17042d).first();
        }

        @Override // java.util.SortedMap
        public final SortedMap headMap(Object obj) {
            return new SortedAsMapView(((SortedSet) this.f17042d).headSet(obj), this.f17043e);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return new AnonymousClass5((SortedSet) this.f17042d);
        }

        @Override // java.util.SortedMap
        public final Object lastKey() {
            return ((SortedSet) this.f17042d).last();
        }

        @Override // java.util.SortedMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return new SortedAsMapView(((SortedSet) this.f17042d).subSet(obj, obj2), this.f17043e);
        }

        @Override // java.util.SortedMap
        public final SortedMap tailMap(Object obj) {
            return new SortedAsMapView(((SortedSet) this.f17042d).tailSet(obj), this.f17043e);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SortedKeySet<K, V> extends KeySet<K, V> implements SortedSet<K> {
        @Override // java.util.SortedSet
        public final Comparator comparator() {
            return f().comparator();
        }

        @Override // java.util.SortedSet
        public final Object first() {
            return f().firstKey();
        }

        @Override // com.google.common.collect.Maps.KeySet
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public SortedMap f() {
            return (SortedMap) this.f17063a;
        }

        public SortedSet headSet(Object obj) {
            return new SortedKeySet(f().headMap(obj));
        }

        @Override // java.util.SortedSet
        public final Object last() {
            return f().lastKey();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return new SortedKeySet(f().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return new SortedKeySet(f().tailMap(obj));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SortedMapDifferenceImpl<K, V> extends MapDifferenceImpl<K, V> implements SortedMapDifference<K, V> {
        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public final /* bridge */ /* synthetic */ Map a() {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class TransformedEntriesMap<K, V1, V2> extends IteratorBasedAbstractMap<K, V2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f17065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EntryTransformer f17066b;

        public TransformedEntriesMap(Map map, EntryTransformer entryTransformer) {
            map.getClass();
            this.f17065a = map;
            entryTransformer.getClass();
            this.f17066b = entryTransformer;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final Iterator a() {
            Iterator it = this.f17065a.entrySet().iterator();
            EntryTransformer entryTransformer = this.f17066b;
            entryTransformer.getClass();
            return new Iterators.AnonymousClass6(it, new AnonymousClass13(entryTransformer));
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public final void clear() {
            this.f17065a.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return this.f17065a.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Map map = this.f17065a;
            Object obj2 = map.get(obj);
            if (obj2 != null || map.containsKey(obj)) {
                return this.f17066b.a(obj, obj2);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return this.f17065a.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            Map map = this.f17065a;
            if (map.containsKey(obj)) {
                return this.f17066b.a(obj, map.remove(obj));
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f17065a.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Collection values() {
            return new Values(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class TransformedEntriesNavigableMap<K, V1, V2> extends TransformedEntriesSortedMap<K, V1, V2> implements NavigableMap<K, V2> {
        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final NavigableMap b() {
            return (NavigableMap) ((SortedMap) this.f17065a);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry ceilingEntry(Object obj) {
            return d(b().ceilingEntry(obj));
        }

        @Override // java.util.NavigableMap
        public final Object ceilingKey(Object obj) {
            return b().ceilingKey(obj);
        }

        public final Map.Entry d(Map.Entry entry) {
            if (entry == null) {
                return null;
            }
            EntryTransformer entryTransformer = this.f17066b;
            entryTransformer.getClass();
            return new AnonymousClass12(entry, entryTransformer);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet descendingKeySet() {
            return b().descendingKeySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap descendingMap() {
            return new TransformedEntriesNavigableMap(b().descendingMap(), this.f17066b);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry firstEntry() {
            return d(b().firstEntry());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry floorEntry(Object obj) {
            return d(b().floorEntry(obj));
        }

        @Override // java.util.NavigableMap
        public final Object floorKey(Object obj) {
            return b().floorKey(obj);
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry higherEntry(Object obj) {
            return d(b().higherEntry(obj));
        }

        @Override // java.util.NavigableMap
        public final Object higherKey(Object obj) {
            return b().higherKey(obj);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lastEntry() {
            return d(b().lastEntry());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lowerEntry(Object obj) {
            return d(b().lowerEntry(obj));
        }

        @Override // java.util.NavigableMap
        public final Object lowerKey(Object obj) {
            return b().lowerKey(obj);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet navigableKeySet() {
            return b().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollFirstEntry() {
            return d(b().pollFirstEntry());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollLastEntry() {
            return d(b().pollLastEntry());
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z11, Object obj2, boolean z12) {
            return new TransformedEntriesNavigableMap(b().subMap(obj, z11, obj2, z12), this.f17066b);
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z11) {
            return new TransformedEntriesNavigableMap(b().headMap(obj, z11), this.f17066b);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z11) {
            return new TransformedEntriesNavigableMap(b().tailMap(obj, z11), this.f17066b);
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class TransformedEntriesSortedMap<K, V1, V2> extends TransformedEntriesMap<K, V1, V2> implements SortedMap<K, V2> {
        public SortedMap b() {
            return (SortedMap) this.f17065a;
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedMap
        public final Object firstKey() {
            return b().firstKey();
        }

        public SortedMap headMap(Object obj) {
            return new TransformedEntriesSortedMap(b().headMap(obj), this.f17066b);
        }

        @Override // java.util.SortedMap
        public final Object lastKey() {
            return b().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return new TransformedEntriesSortedMap(b().subMap(obj, obj2), this.f17066b);
        }

        public SortedMap tailMap(Object obj) {
            return new TransformedEntriesSortedMap(b().tailMap(obj), this.f17066b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class UnmodifiableBiMap<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f17067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BiMap f17068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public BiMap f17069c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public transient Set f17070d;

        public UnmodifiableBiMap(BiMap biMap, BiMap biMap2) {
            this.f17067a = Collections.unmodifiableMap(biMap);
            this.f17068b = biMap;
            this.f17069c = biMap2;
        }

        @Override // com.google.common.collect.BiMap
        public final BiMap Z() {
            BiMap biMap = this.f17069c;
            if (biMap != null) {
                return biMap;
            }
            UnmodifiableBiMap unmodifiableBiMap = new UnmodifiableBiMap(this.f17068b.Z(), this);
            this.f17069c = unmodifiableBiMap;
            return unmodifiableBiMap;
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Object j0() {
            return this.f17067a;
        }

        @Override // com.google.common.collect.ForwardingMap
        /* JADX INFO: renamed from: o0 */
        public final Map j0() {
            return this.f17067a;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public final Set values() {
            Set set = this.f17070d;
            if (set != null) {
                return set;
            }
            Set setUnmodifiableSet = Collections.unmodifiableSet(this.f17068b.values());
            this.f17070d = setUnmodifiableSet;
            return setUnmodifiableSet;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class UnmodifiableEntries<K, V> extends ForwardingCollection<Map.Entry<K, V>> {
        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            throw null;
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

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final Object[] toArray(Object[] objArr) {
            return ObjectArrays.c(this, objArr);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return p0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class UnmodifiableEntrySet<K, V> extends UnmodifiableEntries<K, V> implements Set<Map.Entry<K, V>> {
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
    public static class UnmodifiableNavigableMap<K, V> extends ForwardingSortedMap<K, V> implements NavigableMap<K, V>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NavigableMap f17071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public transient UnmodifiableNavigableMap f17072b;

        public UnmodifiableNavigableMap(NavigableMap navigableMap) {
            this.f17071a = navigableMap;
        }

        @Override // java.util.NavigableMap
        public final Map.Entry ceilingEntry(Object obj) {
            return Maps.a(this.f17071a.ceilingEntry(obj));
        }

        @Override // java.util.NavigableMap
        public final Object ceilingKey(Object obj) {
            return this.f17071a.ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet descendingKeySet() {
            return Sets.i(this.f17071a.descendingKeySet());
        }

        @Override // java.util.NavigableMap
        public final NavigableMap descendingMap() {
            UnmodifiableNavigableMap unmodifiableNavigableMap = this.f17072b;
            if (unmodifiableNavigableMap != null) {
                return unmodifiableNavigableMap;
            }
            UnmodifiableNavigableMap unmodifiableNavigableMap2 = new UnmodifiableNavigableMap(this.f17071a.descendingMap(), this);
            this.f17072b = unmodifiableNavigableMap2;
            return unmodifiableNavigableMap2;
        }

        @Override // java.util.NavigableMap
        public final Map.Entry firstEntry() {
            return Maps.a(this.f17071a.firstEntry());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry floorEntry(Object obj) {
            return Maps.a(this.f17071a.floorEntry(obj));
        }

        @Override // java.util.NavigableMap
        public final Object floorKey(Object obj) {
            return this.f17071a.floorKey(obj);
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry higherEntry(Object obj) {
            return Maps.a(this.f17071a.higherEntry(obj));
        }

        @Override // java.util.NavigableMap
        public final Object higherKey(Object obj) {
            return this.f17071a.higherKey(obj);
        }

        @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Object j0() {
            return Collections.unmodifiableSortedMap(this.f17071a);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final Set keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lastEntry() {
            return Maps.a(this.f17071a.lastEntry());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lowerEntry(Object obj) {
            return Maps.a(this.f17071a.lowerEntry(obj));
        }

        @Override // java.util.NavigableMap
        public final Object lowerKey(Object obj) {
            return this.f17071a.lowerKey(obj);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet navigableKeySet() {
            return Sets.i(this.f17071a.navigableKeySet());
        }

        @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap
        /* JADX INFO: renamed from: o0 */
        public final Map j0() {
            return Collections.unmodifiableSortedMap(this.f17071a);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollFirstEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollLastEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingSortedMap
        /* JADX INFO: renamed from: r0 */
        public final SortedMap o0() {
            return Collections.unmodifiableSortedMap(this.f17071a);
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z11) {
            NavigableMap<K, V> navigableMapHeadMap = this.f17071a.headMap(obj, z11);
            navigableMapHeadMap.getClass();
            return navigableMapHeadMap instanceof UnmodifiableNavigableMap ? navigableMapHeadMap : new UnmodifiableNavigableMap(navigableMapHeadMap);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z11, Object obj2, boolean z12) {
            NavigableMap<K, V> navigableMapSubMap = this.f17071a.subMap(obj, z11, obj2, z12);
            navigableMapSubMap.getClass();
            return navigableMapSubMap instanceof UnmodifiableNavigableMap ? navigableMapSubMap : new UnmodifiableNavigableMap(navigableMapSubMap);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z11) {
            NavigableMap<K, V> navigableMapTailMap = this.f17071a.tailMap(obj, z11);
            navigableMapTailMap.getClass();
            return navigableMapTailMap instanceof UnmodifiableNavigableMap ? navigableMapTailMap : new UnmodifiableNavigableMap(navigableMapTailMap);
        }

        public UnmodifiableNavigableMap(NavigableMap navigableMap, UnmodifiableNavigableMap unmodifiableNavigableMap) {
            this.f17071a = navigableMap;
            this.f17072b = unmodifiableNavigableMap;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ValueDifferenceImpl<V> implements MapDifference.ValueDifference<V> {
        public final boolean equals(Object obj) {
            return (obj instanceof MapDifference.ValueDifference) && Objects.a(null, null) && Objects.a(null, null);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{null, null});
        }

        public final String toString() {
            return "(null, null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Values<K, V> extends AbstractCollection<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f17073a;

        public Values(Map map) {
            this.f17073a = map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.f17073a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f17073a.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return this.f17073a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new AnonymousClass2(this.f17073a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                Map map = this.f17073a;
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    if (Objects.a(obj, entry.getValue())) {
                        map.remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            try {
                collection.getClass();
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                Map map = this.f17073a;
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return map.keySet().removeAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                Map map = this.f17073a;
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return map.keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.f17073a.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class ViewCachingAbstractMap<K, V> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public transient Set f17074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public transient Set f17075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public transient Collection f17076c;

        public abstract Set a();

        public Set b() {
            return new KeySet(this);
        }

        public Collection c() {
            return new Values(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set entrySet() {
            Set set = this.f17074a;
            if (set != null) {
                return set;
            }
            Set setA = a();
            this.f17074a = setA;
            return setA;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            Set set = this.f17075b;
            if (set != null) {
                return set;
            }
            Set setB = b();
            this.f17075b = setB;
            return setB;
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public Collection values() {
            Collection collection = this.f17076c;
            if (collection != null) {
                return collection;
            }
            Collection collectionC = c();
            this.f17076c = collectionC;
            return collectionC;
        }
    }

    private Maps() {
    }

    public static Map.Entry a(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return new AnonymousClass7(entry);
    }

    public static Map b(Set set, Function function) {
        return new AsMapView(set, function);
    }

    public static int c(int i11) {
        if (i11 < 3) {
            CollectPreconditions.b(i11, "expectedSize");
            return i11 + 1;
        }
        if (i11 < 1073741824) {
            return (int) Math.ceil(((double) i11) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static NavigableMap d(NavigableMap navigableMap, Predicate predicate) {
        predicate.getClass();
        if (!(navigableMap instanceof FilteredEntryNavigableMap)) {
            navigableMap.getClass();
            return new FilteredEntryNavigableMap(navigableMap, predicate);
        }
        FilteredEntryNavigableMap filteredEntryNavigableMap = (FilteredEntryNavigableMap) navigableMap;
        return new FilteredEntryNavigableMap(filteredEntryNavigableMap.f17055a, Predicates.c(filteredEntryNavigableMap.f17056b, predicate));
    }

    public static ImmutableMap e(ImmutableSet immutableSet) {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(immutableSet.size());
        Iterator<E> it = immutableSet.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            builder.c(it.next(), Integer.valueOf(i11));
            i11++;
        }
        return builder.a(true);
    }

    public static Object f(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static Object g(Object obj, Map map) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String h(Map map) {
        int size = map.size();
        CollectPreconditions.b(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb2.append('{');
        boolean z11 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z11) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z11 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    public static Map i(Map map, Function function) {
        function.getClass();
        return new TransformedEntriesMap(map, new AnonymousClass9(function));
    }

    /* JADX INFO: renamed from: com.google.common.collect.Maps$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass6 extends ForwardingNavigableSet<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NavigableSet f17036a;

        public AnonymousClass6(NavigableSet navigableSet) {
            this.f17036a = navigableSet;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet
        /* JADX INFO: renamed from: C0 */
        public final NavigableSet o0() {
            return this.f17036a;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final NavigableSet descendingSet() {
            return new AnonymousClass6(super.descendingSet());
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet headSet(Object obj) {
            return new AnonymousClass5(super.headSet(obj));
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final Object j0() {
            return this.f17036a;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* JADX INFO: renamed from: o0 */
        public final Collection j0() {
            return this.f17036a;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return new AnonymousClass5(super.subSet(obj, obj2));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet tailSet(Object obj) {
            return new AnonymousClass5(super.tailSet(obj));
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet
        /* JADX INFO: renamed from: w0 */
        public final Set j0() {
            return this.f17036a;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet
        /* JADX INFO: renamed from: z0 */
        public final SortedSet j0() {
            return this.f17036a;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z11) {
            return new AnonymousClass6(super.headSet(obj, z11));
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z11, Object obj2, boolean z12) {
            return new AnonymousClass6(super.subSet(obj, z11, obj2, z12));
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z11) {
            return new AnonymousClass6(super.tailSet(obj, z11));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class NavigableKeySet<K, V> extends SortedKeySet<K, V> implements NavigableSet<K> {
        @Override // java.util.NavigableSet
        public final Object ceiling(Object obj) {
            return ((NavigableMap) this.f17063a).ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public final Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet descendingSet() {
            return ((NavigableMap) this.f17063a).descendingKeySet();
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, com.google.common.collect.Maps.KeySet
        public final Map f() {
            return (NavigableMap) this.f17063a;
        }

        @Override // java.util.NavigableSet
        public final Object floor(Object obj) {
            return ((NavigableMap) this.f17063a).floorKey(obj);
        }

        @Override // com.google.common.collect.Maps.SortedKeySet
        /* JADX INFO: renamed from: g */
        public final SortedMap f() {
            return (NavigableMap) this.f17063a;
        }

        @Override // java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z11) {
            return ((NavigableMap) this.f17063a).headMap(obj, z11).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public final Object higher(Object obj) {
            return ((NavigableMap) this.f17063a).higherKey(obj);
        }

        @Override // java.util.NavigableSet
        public final Object lower(Object obj) {
            return ((NavigableMap) this.f17063a).lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public final Object pollFirst() {
            return Maps.f(((NavigableMap) this.f17063a).pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public final Object pollLast() {
            return Maps.f(((NavigableMap) this.f17063a).pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z11, Object obj2, boolean z12) {
            return ((NavigableMap) this.f17063a).subMap(obj, z11, obj2, z12).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z11) {
            return ((NavigableMap) this.f17063a).tailMap(obj, z11).navigableKeySet();
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }
    }
}
