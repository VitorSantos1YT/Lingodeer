package com.google.common.collect;

import com.google.common.base.Function;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class Synchronized {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SynchronizedAsMap<K, V> extends SynchronizedMap<K, Collection<V>> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public transient Set f17241f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public transient Collection f17242t;

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public final boolean containsValue(Object obj) {
            return values().contains(obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public final Set entrySet() {
            Set set;
            synchronized (this.f17259b) {
                try {
                    if (this.f17241f == null) {
                        this.f17241f = new SynchronizedAsMapEntries(((Map) this.f17258a).entrySet(), this.f17259b);
                    }
                    set = this.f17241f;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public final Object get(Object obj) {
            Collection collectionB;
            synchronized (this.f17259b) {
                Collection collection = (Collection) super.get(obj);
                collectionB = collection == null ? null : Synchronized.b(this.f17259b, collection);
            }
            return collectionB;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public final Collection values() {
            Collection collection;
            synchronized (this.f17259b) {
                try {
                    if (this.f17242t == null) {
                        this.f17242t = new SynchronizedAsMapValues(((Map) this.f17258a).values(), this.f17259b);
                    }
                    collection = this.f17242t;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return collection;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SynchronizedAsMapValues<V> extends SynchronizedCollection<Collection<V>> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new TransformedIterator<Collection<Object>, Collection<Object>>(super.iterator()) { // from class: com.google.common.collect.Synchronized.SynchronizedAsMapValues.1
                @Override // com.google.common.collect.TransformedIterator
                public final Object a(Object obj) {
                    return Synchronized.b(SynchronizedAsMapValues.this.f17259b, (Collection) obj);
                }
            };
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SynchronizedBiMap<K, V> extends SynchronizedMap<K, V> implements BiMap<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public transient Set f17247f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public transient BiMap f17248t;

        @Override // com.google.common.collect.BiMap
        public final BiMap Z() {
            BiMap biMap;
            synchronized (this.f17259b) {
                try {
                    if (this.f17248t == null) {
                        SynchronizedBiMap synchronizedBiMap = new SynchronizedBiMap(((BiMap) ((Map) this.f17258a)).Z(), this.f17259b);
                        synchronizedBiMap.f17248t = this;
                        this.f17248t = synchronizedBiMap;
                    }
                    biMap = this.f17248t;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return biMap;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap
        public final Map d() {
            return (BiMap) ((Map) this.f17258a);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public final Set values() {
            Set set;
            synchronized (this.f17259b) {
                try {
                    if (this.f17247f == null) {
                        this.f17247f = new SynchronizedSet(((BiMap) ((Map) this.f17258a)).values(), this.f17259b);
                    }
                    set = this.f17247f;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SynchronizedDeque<E> extends SynchronizedQueue<E> implements Deque<E> {
        private static final long serialVersionUID = 0;

        @Override // java.util.Deque
        public final void addFirst(Object obj) {
            synchronized (this.f17259b) {
                ((Deque) super.d()).addFirst(obj);
            }
        }

        @Override // java.util.Deque
        public final void addLast(Object obj) {
            synchronized (this.f17259b) {
                ((Deque) super.d()).addLast(obj);
            }
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedQueue, com.google.common.collect.Synchronized.SynchronizedCollection
        public final Collection d() {
            return (Deque) super.d();
        }

        @Override // java.util.Deque
        public final Iterator descendingIterator() {
            Iterator<E> itDescendingIterator;
            synchronized (this.f17259b) {
                itDescendingIterator = ((Deque) super.d()).descendingIterator();
            }
            return itDescendingIterator;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedQueue
        /* JADX INFO: renamed from: g */
        public final Queue d() {
            return (Deque) super.d();
        }

        @Override // java.util.Deque
        public final Object getFirst() {
            Object first;
            synchronized (this.f17259b) {
                first = ((Deque) super.d()).getFirst();
            }
            return first;
        }

        @Override // java.util.Deque
        public final Object getLast() {
            Object last;
            synchronized (this.f17259b) {
                last = ((Deque) super.d()).getLast();
            }
            return last;
        }

        @Override // java.util.Deque
        public final boolean offerFirst(Object obj) {
            boolean zOfferFirst;
            synchronized (this.f17259b) {
                zOfferFirst = ((Deque) super.d()).offerFirst(obj);
            }
            return zOfferFirst;
        }

        @Override // java.util.Deque
        public final boolean offerLast(Object obj) {
            boolean zOfferLast;
            synchronized (this.f17259b) {
                zOfferLast = ((Deque) super.d()).offerLast(obj);
            }
            return zOfferLast;
        }

        @Override // java.util.Deque
        public final Object peekFirst() {
            Object objPeekFirst;
            synchronized (this.f17259b) {
                objPeekFirst = ((Deque) super.d()).peekFirst();
            }
            return objPeekFirst;
        }

        @Override // java.util.Deque
        public final Object peekLast() {
            Object objPeekLast;
            synchronized (this.f17259b) {
                objPeekLast = ((Deque) super.d()).peekLast();
            }
            return objPeekLast;
        }

        @Override // java.util.Deque
        public final Object pollFirst() {
            Object objPollFirst;
            synchronized (this.f17259b) {
                objPollFirst = ((Deque) super.d()).pollFirst();
            }
            return objPollFirst;
        }

        @Override // java.util.Deque
        public final Object pollLast() {
            Object objPollLast;
            synchronized (this.f17259b) {
                objPollLast = ((Deque) super.d()).pollLast();
            }
            return objPollLast;
        }

        @Override // java.util.Deque
        public final Object pop() {
            Object objPop;
            synchronized (this.f17259b) {
                objPop = ((Deque) super.d()).pop();
            }
            return objPop;
        }

        @Override // java.util.Deque
        public final void push(Object obj) {
            synchronized (this.f17259b) {
                ((Deque) super.d()).push(obj);
            }
        }

        @Override // java.util.Deque
        public final Object removeFirst() {
            Object objRemoveFirst;
            synchronized (this.f17259b) {
                objRemoveFirst = ((Deque) super.d()).removeFirst();
            }
            return objRemoveFirst;
        }

        @Override // java.util.Deque
        public final boolean removeFirstOccurrence(Object obj) {
            boolean zRemoveFirstOccurrence;
            synchronized (this.f17259b) {
                zRemoveFirstOccurrence = ((Deque) super.d()).removeFirstOccurrence(obj);
            }
            return zRemoveFirstOccurrence;
        }

        @Override // java.util.Deque
        public final Object removeLast() {
            Object objRemoveLast;
            synchronized (this.f17259b) {
                objRemoveLast = ((Deque) super.d()).removeLast();
            }
            return objRemoveLast;
        }

        @Override // java.util.Deque
        public final boolean removeLastOccurrence(Object obj) {
            boolean zRemoveLastOccurrence;
            synchronized (this.f17259b) {
                zRemoveLastOccurrence = ((Deque) super.d()).removeLastOccurrence(obj);
            }
            return zRemoveLastOccurrence;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SynchronizedEntry<K, V> extends SynchronizedObject implements Map.Entry<K, V> {
        private static final long serialVersionUID = 0;

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean zEquals;
            synchronized (this.f17259b) {
                zEquals = ((Map.Entry) this.f17258a).equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            Object key;
            synchronized (this.f17259b) {
                key = ((Map.Entry) this.f17258a).getKey();
            }
            return key;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            Object value;
            synchronized (this.f17259b) {
                value = ((Map.Entry) this.f17258a).getValue();
            }
            return value;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            int iHashCode;
            synchronized (this.f17259b) {
                iHashCode = ((Map.Entry) this.f17258a).hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            Object value;
            synchronized (this.f17259b) {
                value = ((Map.Entry) this.f17258a).setValue(obj);
            }
            return value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SynchronizedList<E> extends SynchronizedCollection<E> implements List<E> {
        private static final long serialVersionUID = 0;

        @Override // java.util.List
        public final void add(int i11, Object obj) {
            synchronized (this.f17259b) {
                d().add(i11, obj);
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i11, Collection collection) {
            boolean zAddAll;
            synchronized (this.f17259b) {
                zAddAll = d().addAll(i11, collection);
            }
            return zAddAll;
        }

        @Override // java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f17259b) {
                zEquals = d().equals(obj);
            }
            return zEquals;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final List d() {
            return (List) ((Collection) this.f17258a);
        }

        @Override // java.util.List
        public final Object get(int i11) {
            Object obj;
            synchronized (this.f17259b) {
                obj = d().get(i11);
            }
            return obj;
        }

        @Override // java.util.Collection, java.util.List
        public final int hashCode() {
            int iHashCode;
            synchronized (this.f17259b) {
                iHashCode = d().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            int iIndexOf;
            synchronized (this.f17259b) {
                iIndexOf = d().indexOf(obj);
            }
            return iIndexOf;
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int iLastIndexOf;
            synchronized (this.f17259b) {
                iLastIndexOf = d().lastIndexOf(obj);
            }
            return iLastIndexOf;
        }

        @Override // java.util.List
        public final ListIterator listIterator() {
            return d().listIterator();
        }

        @Override // java.util.List
        public final Object remove(int i11) {
            Object objRemove;
            synchronized (this.f17259b) {
                objRemove = d().remove(i11);
            }
            return objRemove;
        }

        @Override // java.util.List
        public final Object set(int i11, Object obj) {
            Object obj2;
            synchronized (this.f17259b) {
                obj2 = d().set(i11, obj);
            }
            return obj2;
        }

        @Override // java.util.List
        public final List subList(int i11, int i12) {
            List listD;
            synchronized (this.f17259b) {
                listD = Synchronized.d(d().subList(i11, i12), this.f17259b);
            }
            return listD;
        }

        @Override // java.util.List
        public final ListIterator listIterator(int i11) {
            return d().listIterator(i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SynchronizedListMultimap<K, V> extends SynchronizedMultimap<K, V> implements ListMultimap<K, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap
        public final Multimap d() {
            return (ListMultimap) ((Multimap) this.f17258a);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final List b(Object obj) {
            List listB;
            synchronized (this.f17259b) {
                listB = ((ListMultimap) ((Multimap) this.f17258a)).b(obj);
            }
            return listB;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final List get(Object obj) {
            List listD;
            synchronized (this.f17259b) {
                listD = Synchronized.d(((ListMultimap) ((Multimap) this.f17258a)).get(obj), this.f17259b);
            }
            return listD;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SynchronizedMap<K, V> extends SynchronizedObject implements Map<K, V> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public transient Set f17249c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public transient Collection f17250d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public transient Set f17251e;

        @Override // java.util.Map
        public final void clear() {
            synchronized (this.f17259b) {
                d().clear();
            }
        }

        @Override // java.util.Map
        public final boolean containsKey(Object obj) {
            boolean zContainsKey;
            synchronized (this.f17259b) {
                zContainsKey = d().containsKey(obj);
            }
            return zContainsKey;
        }

        public boolean containsValue(Object obj) {
            boolean zContainsValue;
            synchronized (this.f17259b) {
                zContainsValue = d().containsValue(obj);
            }
            return zContainsValue;
        }

        public Map d() {
            return (Map) this.f17258a;
        }

        public Set entrySet() {
            Set set;
            synchronized (this.f17259b) {
                try {
                    if (this.f17251e == null) {
                        this.f17251e = new SynchronizedSet(d().entrySet(), this.f17259b);
                    }
                    set = this.f17251e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // java.util.Map
        public final boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f17259b) {
                zEquals = d().equals(obj);
            }
            return zEquals;
        }

        public Object get(Object obj) {
            Object obj2;
            synchronized (this.f17259b) {
                obj2 = d().get(obj);
            }
            return obj2;
        }

        @Override // java.util.Map
        public final int hashCode() {
            int iHashCode;
            synchronized (this.f17259b) {
                iHashCode = d().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Map
        public final boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f17259b) {
                zIsEmpty = d().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // java.util.Map
        public Set keySet() {
            Set set;
            synchronized (this.f17259b) {
                try {
                    if (this.f17249c == null) {
                        this.f17249c = new SynchronizedSet(d().keySet(), this.f17259b);
                    }
                    set = this.f17249c;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // java.util.Map
        public final Object put(Object obj, Object obj2) {
            Object objPut;
            synchronized (this.f17259b) {
                objPut = d().put(obj, obj2);
            }
            return objPut;
        }

        @Override // java.util.Map
        public final void putAll(Map map) {
            synchronized (this.f17259b) {
                d().putAll(map);
            }
        }

        @Override // java.util.Map
        public final Object remove(Object obj) {
            Object objRemove;
            synchronized (this.f17259b) {
                objRemove = d().remove(obj);
            }
            return objRemove;
        }

        @Override // java.util.Map
        public final int size() {
            int size;
            synchronized (this.f17259b) {
                size = d().size();
            }
            return size;
        }

        public Collection values() {
            Collection collection;
            synchronized (this.f17259b) {
                try {
                    if (this.f17250d == null) {
                        this.f17250d = new SynchronizedCollection(d().values(), this.f17259b);
                    }
                    collection = this.f17250d;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return collection;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SynchronizedMultimap<K, V> extends SynchronizedObject implements Multimap<K, V> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public transient Collection f17252c;

        @Override // com.google.common.collect.Multimap
        public final Multiset T() {
            synchronized (this.f17259b) {
            }
            return null;
        }

        @Override // com.google.common.collect.Multimap
        public final Map Y() {
            synchronized (this.f17259b) {
            }
            return null;
        }

        public Collection b(Object obj) {
            Collection collectionB;
            synchronized (this.f17259b) {
                collectionB = d().b(obj);
            }
            return collectionB;
        }

        @Override // com.google.common.collect.Multimap
        public final void clear() {
            synchronized (this.f17259b) {
                d().clear();
            }
        }

        @Override // com.google.common.collect.Multimap
        public final boolean containsKey(Object obj) {
            boolean zContainsKey;
            synchronized (this.f17259b) {
                zContainsKey = d().containsKey(obj);
            }
            return zContainsKey;
        }

        public Multimap d() {
            return (Multimap) this.f17258a;
        }

        @Override // com.google.common.collect.Multimap
        public Collection e() {
            synchronized (this.f17259b) {
            }
            return null;
        }

        @Override // com.google.common.collect.Multimap
        public final boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f17259b) {
                zEquals = d().equals(obj);
            }
            return zEquals;
        }

        @Override // com.google.common.collect.Multimap
        public final boolean g0(Object obj, Object obj2) {
            boolean zG0;
            synchronized (this.f17259b) {
                zG0 = d().g0(obj, obj2);
            }
            return zG0;
        }

        public Collection get(Object obj) {
            Collection collectionB;
            synchronized (this.f17259b) {
                collectionB = Synchronized.b(this.f17259b, d().get(obj));
            }
            return collectionB;
        }

        @Override // com.google.common.collect.Multimap
        public final int hashCode() {
            int iHashCode;
            synchronized (this.f17259b) {
                iHashCode = d().hashCode();
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.Multimap
        public final boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f17259b) {
                zIsEmpty = d().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // com.google.common.collect.Multimap
        public final Set keySet() {
            synchronized (this.f17259b) {
            }
            return null;
        }

        @Override // com.google.common.collect.Multimap
        public final boolean put(Object obj, Object obj2) {
            boolean zPut;
            synchronized (this.f17259b) {
                zPut = d().put(obj, obj2);
            }
            return zPut;
        }

        @Override // com.google.common.collect.Multimap
        public final boolean remove(Object obj, Object obj2) {
            boolean zRemove;
            synchronized (this.f17259b) {
                zRemove = d().remove(obj, obj2);
            }
            return zRemove;
        }

        @Override // com.google.common.collect.Multimap
        public final int size() {
            int size;
            synchronized (this.f17259b) {
                size = d().size();
            }
            return size;
        }

        @Override // com.google.common.collect.Multimap
        public final Collection values() {
            Collection collection;
            synchronized (this.f17259b) {
                try {
                    if (this.f17252c == null) {
                        this.f17252c = new SynchronizedCollection(d().values(), this.f17259b);
                    }
                    collection = this.f17252c;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return collection;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SynchronizedMultiset<E> extends SynchronizedCollection<E> implements Multiset<E> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public transient Set f17253c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public transient Set f17254d;

        @Override // com.google.common.collect.Multiset
        public final boolean J(int i11, Object obj) {
            boolean zJ;
            synchronized (this.f17259b) {
                zJ = d().J(i11, obj);
            }
            return zJ;
        }

        @Override // com.google.common.collect.Multiset
        public final int add(int i11, Object obj) {
            int iAdd;
            synchronized (this.f17259b) {
                iAdd = d().add(i11, obj);
            }
            return iAdd;
        }

        @Override // com.google.common.collect.Multiset
        public final Set c() {
            Set set;
            synchronized (this.f17259b) {
                try {
                    if (this.f17253c == null) {
                        this.f17253c = Synchronized.a(d().c(), this.f17259b);
                    }
                    set = this.f17253c;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // com.google.common.collect.Multiset
        public final Set entrySet() {
            Set set;
            synchronized (this.f17259b) {
                try {
                    if (this.f17254d == null) {
                        this.f17254d = Synchronized.a(d().entrySet(), this.f17259b);
                    }
                    set = this.f17254d;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // java.util.Collection, com.google.common.collect.Multiset
        public final boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f17259b) {
                zEquals = d().equals(obj);
            }
            return zEquals;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Multiset d() {
            return (Multiset) ((Collection) this.f17258a);
        }

        @Override // java.util.Collection, com.google.common.collect.Multiset
        public final int hashCode() {
            int iHashCode;
            synchronized (this.f17259b) {
                iHashCode = d().hashCode();
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.Multiset
        public final int q0(Object obj) {
            int iQ0;
            synchronized (this.f17259b) {
                iQ0 = d().q0(obj);
            }
            return iQ0;
        }

        @Override // com.google.common.collect.Multiset
        public final int u0(int i11, Object obj) {
            int iU0;
            synchronized (this.f17259b) {
                iU0 = d().u0(i11, obj);
            }
            return iU0;
        }

        @Override // com.google.common.collect.Multiset
        public final int w1(Object obj) {
            int iW1;
            synchronized (this.f17259b) {
                iW1 = d().w1(obj);
            }
            return iW1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SynchronizedObject implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f17258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f17259b;

        public SynchronizedObject(Object obj, Object obj2) {
            obj.getClass();
            this.f17258a = obj;
            this.f17259b = obj2 == null ? this : obj2;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            synchronized (this.f17259b) {
                objectOutputStream.defaultWriteObject();
            }
        }

        public final String toString() {
            String string;
            synchronized (this.f17259b) {
                string = this.f17258a.toString();
            }
            return string;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SynchronizedQueue<E> extends SynchronizedCollection<E> implements Queue<E> {
        private static final long serialVersionUID = 0;

        @Override // java.util.Queue
        public final Object element() {
            Object objElement;
            synchronized (this.f17259b) {
                objElement = d().element();
            }
            return objElement;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Queue d() {
            return (Queue) ((Collection) this.f17258a);
        }

        @Override // java.util.Queue
        public final boolean offer(Object obj) {
            boolean zOffer;
            synchronized (this.f17259b) {
                zOffer = d().offer(obj);
            }
            return zOffer;
        }

        @Override // java.util.Queue
        public final Object peek() {
            Object objPeek;
            synchronized (this.f17259b) {
                objPeek = d().peek();
            }
            return objPeek;
        }

        @Override // java.util.Queue
        public final Object poll() {
            Object objPoll;
            synchronized (this.f17259b) {
                objPoll = d().poll();
            }
            return objPoll;
        }

        @Override // java.util.Queue
        public final Object remove() {
            Object objRemove;
            synchronized (this.f17259b) {
                objRemove = d().remove();
            }
            return objRemove;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SynchronizedRandomAccessList<E> extends SynchronizedList<E> implements RandomAccess {
        private static final long serialVersionUID = 0;
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SynchronizedSet<E> extends SynchronizedCollection<E> implements Set<E> {
        private static final long serialVersionUID = 0;

        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f17259b) {
                zEquals = d().equals(obj);
            }
            return zEquals;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Set d() {
            return (Set) ((Collection) this.f17258a);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            int iHashCode;
            synchronized (this.f17259b) {
                iHashCode = d().hashCode();
            }
            return iHashCode;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SynchronizedSetMultimap<K, V> extends SynchronizedMultimap<K, V> implements SetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public SetMultimap d() {
            return (SetMultimap) ((Multimap) this.f17258a);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set b(Object obj) {
            Set setB;
            synchronized (this.f17259b) {
                setB = d().b(obj);
            }
            return setB;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public final Set e() {
            synchronized (this.f17259b) {
            }
            return null;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set get(Object obj) {
            SynchronizedSet synchronizedSet;
            synchronized (this.f17259b) {
                synchronizedSet = new SynchronizedSet(d().get(obj), this.f17259b);
            }
            return synchronizedSet;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SynchronizedSortedMap<K, V> extends SynchronizedMap<K, V> implements SortedMap<K, V> {
        private static final long serialVersionUID = 0;

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            Comparator<? super K> comparator;
            synchronized (this.f17259b) {
                comparator = d().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedMap
        public final Object firstKey() {
            Object objFirstKey;
            synchronized (this.f17259b) {
                objFirstKey = d().firstKey();
            }
            return objFirstKey;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public SortedMap d() {
            return (SortedMap) ((Map) this.f17258a);
        }

        public SortedMap headMap(Object obj) {
            SynchronizedSortedMap synchronizedSortedMap;
            synchronized (this.f17259b) {
                synchronizedSortedMap = new SynchronizedSortedMap(d().headMap(obj), this.f17259b);
            }
            return synchronizedSortedMap;
        }

        @Override // java.util.SortedMap
        public final Object lastKey() {
            Object objLastKey;
            synchronized (this.f17259b) {
                objLastKey = d().lastKey();
            }
            return objLastKey;
        }

        public SortedMap subMap(Object obj, Object obj2) {
            SynchronizedSortedMap synchronizedSortedMap;
            synchronized (this.f17259b) {
                synchronizedSortedMap = new SynchronizedSortedMap(d().subMap(obj, obj2), this.f17259b);
            }
            return synchronizedSortedMap;
        }

        public SortedMap tailMap(Object obj) {
            SynchronizedSortedMap synchronizedSortedMap;
            synchronized (this.f17259b) {
                synchronizedSortedMap = new SynchronizedSortedMap(d().tailMap(obj), this.f17259b);
            }
            return synchronizedSortedMap;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SynchronizedSortedSet<E> extends SynchronizedSet<E> implements SortedSet<E> {
        private static final long serialVersionUID = 0;

        @Override // java.util.SortedSet
        public final Comparator comparator() {
            Comparator<? super E> comparator;
            synchronized (this.f17259b) {
                comparator = d().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedSet
        public final Object first() {
            Object objFirst;
            synchronized (this.f17259b) {
                objFirst = d().first();
            }
            return objFirst;
        }

        public SortedSet headSet(Object obj) {
            SynchronizedSortedSet synchronizedSortedSet;
            synchronized (this.f17259b) {
                synchronizedSortedSet = new SynchronizedSortedSet(d().headSet(obj), this.f17259b);
            }
            return synchronizedSortedSet;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public SortedSet d() {
            return (SortedSet) super.d();
        }

        @Override // java.util.SortedSet
        public final Object last() {
            Object objLast;
            synchronized (this.f17259b) {
                objLast = d().last();
            }
            return objLast;
        }

        public SortedSet subSet(Object obj, Object obj2) {
            SynchronizedSortedSet synchronizedSortedSet;
            synchronized (this.f17259b) {
                synchronizedSortedSet = new SynchronizedSortedSet(d().subSet(obj, obj2), this.f17259b);
            }
            return synchronizedSortedSet;
        }

        public SortedSet tailSet(Object obj) {
            SynchronizedSortedSet synchronizedSortedSet;
            synchronized (this.f17259b) {
                synchronizedSortedSet = new SynchronizedSortedSet(d().tailSet(obj), this.f17259b);
            }
            return synchronizedSortedSet;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SynchronizedTable<R, C, V> extends SynchronizedObject implements Table<R, C, V> {

        /* JADX INFO: renamed from: com.google.common.collect.Synchronized$SynchronizedTable$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass2 implements Function<Map<Object, Object>, Map<Object, Object>> {
            @Override // com.google.common.base.Function
            public final Map<Object, Object> apply(Map<Object, Object> map) {
                throw null;
            }
        }

        @Override // com.google.common.collect.Table
        public final Set A() {
            SynchronizedSet synchronizedSet;
            synchronized (this.f17259b) {
                synchronizedSet = new SynchronizedSet(((Table) this.f17258a).A(), this.f17259b);
            }
            return synchronizedSet;
        }

        @Override // com.google.common.collect.Table
        public final boolean equals(Object obj) {
            boolean zEquals;
            if (this == obj) {
                return true;
            }
            synchronized (this.f17259b) {
                zEquals = ((Table) this.f17258a).equals(obj);
            }
            return zEquals;
        }

        @Override // com.google.common.collect.Table
        public final Map f() {
            SynchronizedMap synchronizedMap;
            synchronized (this.f17259b) {
                synchronizedMap = new SynchronizedMap(new Maps.TransformedEntriesMap(((Table) this.f17258a).f(), new Maps.AnonymousClass9(new Function<Map<Object, Object>, Map<Object, Object>>() { // from class: com.google.common.collect.Synchronized.SynchronizedTable.1
                    @Override // com.google.common.base.Function
                    public final Map<Object, Object> apply(Map<Object, Object> map) {
                        return new SynchronizedMap(map, SynchronizedTable.this.f17259b);
                    }
                })), this.f17259b);
            }
            return synchronizedMap;
        }

        @Override // com.google.common.collect.Table
        public final int hashCode() {
            int iHashCode;
            synchronized (this.f17259b) {
                iHashCode = ((Table) this.f17258a).hashCode();
            }
            return iHashCode;
        }

        @Override // com.google.common.collect.Table
        public final int size() {
            int size;
            synchronized (this.f17259b) {
                size = ((Table) this.f17258a).size();
            }
            return size;
        }
    }

    private Synchronized() {
    }

    public static Set a(Set set, Object obj) {
        return set instanceof SortedSet ? new SynchronizedSortedSet((SortedSet) set, obj) : new SynchronizedSet(set, obj);
    }

    public static Collection b(Object obj, Collection collection) {
        if (collection instanceof SortedSet) {
            return new SynchronizedSortedSet((SortedSet) collection, obj);
        }
        if (collection instanceof Set) {
            return new SynchronizedSet((Set) collection, obj);
        }
        return collection instanceof List ? d((List) collection, obj) : new SynchronizedCollection(collection, obj);
    }

    public static Map.Entry c(Map.Entry entry, Object obj) {
        if (entry == null) {
            return null;
        }
        return new SynchronizedEntry(entry, obj);
    }

    public static List d(List list, Object obj) {
        return list instanceof RandomAccess ? new SynchronizedRandomAccessList(list, obj) : new SynchronizedList(list, obj);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SynchronizedSortedSetMultimap<K, V> extends SynchronizedSetMultimap<K, V> implements SortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap
        public final Multimap d() {
            return (SortedSetMultimap) super.d();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap
        /* JADX INFO: renamed from: g */
        public final SetMultimap d() {
            return (SortedSetMultimap) super.d();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final SortedSet b(Object obj) {
            SortedSet sortedSetB;
            synchronized (this.f17259b) {
                sortedSetB = ((SortedSetMultimap) super.d()).b(obj);
            }
            return sortedSetB;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public final SortedSet get(Object obj) {
            SynchronizedSortedSet synchronizedSortedSet;
            synchronized (this.f17259b) {
                synchronizedSortedSet = new SynchronizedSortedSet(((SortedSetMultimap) super.d()).get(obj), this.f17259b);
            }
            return synchronizedSortedSet;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SynchronizedCollection<E> extends SynchronizedObject implements Collection<E> {
        private static final long serialVersionUID = 0;

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            boolean zAdd;
            synchronized (this.f17259b) {
                zAdd = d().add(obj);
            }
            return zAdd;
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection collection) {
            boolean zAddAll;
            synchronized (this.f17259b) {
                zAddAll = d().addAll(collection);
            }
            return zAddAll;
        }

        @Override // java.util.Collection
        public final void clear() {
            synchronized (this.f17259b) {
                d().clear();
            }
        }

        public boolean contains(Object obj) {
            boolean zContains;
            synchronized (this.f17259b) {
                zContains = d().contains(obj);
            }
            return zContains;
        }

        public boolean containsAll(Collection collection) {
            boolean zContainsAll;
            synchronized (this.f17259b) {
                zContainsAll = d().containsAll(collection);
            }
            return zContainsAll;
        }

        public Collection d() {
            return (Collection) this.f17258a;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f17259b) {
                zIsEmpty = d().isEmpty();
            }
            return zIsEmpty;
        }

        public Iterator iterator() {
            return d().iterator();
        }

        public boolean remove(Object obj) {
            boolean zRemove;
            synchronized (this.f17259b) {
                zRemove = d().remove(obj);
            }
            return zRemove;
        }

        public boolean removeAll(Collection collection) {
            boolean zRemoveAll;
            synchronized (this.f17259b) {
                zRemoveAll = d().removeAll(collection);
            }
            return zRemoveAll;
        }

        public boolean retainAll(Collection collection) {
            boolean zRetainAll;
            synchronized (this.f17259b) {
                zRetainAll = d().retainAll(collection);
            }
            return zRetainAll;
        }

        @Override // java.util.Collection
        public final int size() {
            int size;
            synchronized (this.f17259b) {
                size = d().size();
            }
            return size;
        }

        public Object[] toArray() {
            Object[] array;
            synchronized (this.f17259b) {
                array = d().toArray();
            }
            return array;
        }

        public Object[] toArray(Object[] objArr) {
            Object[] array;
            synchronized (this.f17259b) {
                array = d().toArray(objArr);
            }
            return array;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SynchronizedAsMapEntries<K, V> extends SynchronizedSet<Map.Entry<K, Collection<V>>> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            boolean zContains;
            synchronized (this.f17259b) {
                zContains = !(obj instanceof Map.Entry) ? false : d().contains(new Maps.AnonymousClass7((Map.Entry) obj));
            }
            return zContains;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection collection) {
            boolean zA;
            synchronized (this.f17259b) {
                zA = Collections2.a(d(), collection);
            }
            return zA;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet, java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            boolean zB;
            if (obj == this) {
                return true;
            }
            synchronized (this.f17259b) {
                zB = Sets.b(d(), obj);
            }
            return zB;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new TransformedIterator<Map.Entry<Object, Collection<Object>>, Map.Entry<Object, Collection<Object>>>(super.iterator()) { // from class: com.google.common.collect.Synchronized.SynchronizedAsMapEntries.1
                @Override // com.google.common.collect.TransformedIterator
                public final Object a(Object obj) {
                    final Map.Entry entry = (Map.Entry) obj;
                    return new ForwardingMapEntry<Object, Collection<Object>>(this) { // from class: com.google.common.collect.Synchronized.SynchronizedAsMapEntries.1.1

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ AnonymousClass1 f17245b;

                        {
                            this.f17245b = this;
                        }

                        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                        public final Object getValue() {
                            return Synchronized.b(SynchronizedAsMapEntries.this.f17259b, (Collection) entry.getValue());
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
                    };
                }
            };
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            boolean zRemove;
            synchronized (this.f17259b) {
                zRemove = !(obj instanceof Map.Entry) ? false : d().remove(new Maps.AnonymousClass7((Map.Entry) obj));
            }
            return zRemove;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            boolean zK;
            synchronized (this.f17259b) {
                zK = Iterators.k(collection, d().iterator());
            }
            return zK;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            boolean z11;
            synchronized (this.f17259b) {
                Iterator it = d().iterator();
                collection.getClass();
                z11 = false;
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                        z11 = true;
                    }
                }
            }
            return z11;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            Object[] objArr;
            synchronized (this.f17259b) {
                Set setD = d();
                objArr = new Object[setD.size()];
                ObjectArrays.b(setD, objArr);
            }
            return objArr;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public final Object[] toArray(Object[] objArr) {
            Object[] objArrC;
            synchronized (this.f17259b) {
                objArrC = ObjectArrays.c(d(), objArr);
            }
            return objArrC;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SynchronizedNavigableMap<K, V> extends SynchronizedSortedMap<K, V> implements NavigableMap<K, V> {
        private static final long serialVersionUID = 0;
        public transient NavigableSet H;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public transient NavigableSet f17255f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public transient NavigableMap f17256t;

        @Override // java.util.NavigableMap
        public final Map.Entry ceilingEntry(Object obj) {
            Map.Entry entryC;
            synchronized (this.f17259b) {
                entryC = Synchronized.c(((NavigableMap) super.d()).ceilingEntry(obj), this.f17259b);
            }
            return entryC;
        }

        @Override // java.util.NavigableMap
        public final Object ceilingKey(Object obj) {
            Object objCeilingKey;
            synchronized (this.f17259b) {
                objCeilingKey = ((NavigableMap) super.d()).ceilingKey(obj);
            }
            return objCeilingKey;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, com.google.common.collect.Synchronized.SynchronizedMap
        public final Map d() {
            return (NavigableMap) super.d();
        }

        @Override // java.util.NavigableMap
        public final NavigableSet descendingKeySet() {
            synchronized (this.f17259b) {
                try {
                    NavigableSet navigableSet = this.f17255f;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    SynchronizedNavigableSet synchronizedNavigableSet = new SynchronizedNavigableSet(((NavigableMap) super.d()).descendingKeySet(), this.f17259b);
                    this.f17255f = synchronizedNavigableSet;
                    return synchronizedNavigableSet;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.NavigableMap
        public final NavigableMap descendingMap() {
            synchronized (this.f17259b) {
                try {
                    NavigableMap navigableMap = this.f17256t;
                    if (navigableMap != null) {
                        return navigableMap;
                    }
                    SynchronizedNavigableMap synchronizedNavigableMap = new SynchronizedNavigableMap(((NavigableMap) super.d()).descendingMap(), this.f17259b);
                    this.f17256t = synchronizedNavigableMap;
                    return synchronizedNavigableMap;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.NavigableMap
        public final Map.Entry firstEntry() {
            Map.Entry entryC;
            synchronized (this.f17259b) {
                entryC = Synchronized.c(((NavigableMap) super.d()).firstEntry(), this.f17259b);
            }
            return entryC;
        }

        @Override // java.util.NavigableMap
        public final Map.Entry floorEntry(Object obj) {
            Map.Entry entryC;
            synchronized (this.f17259b) {
                entryC = Synchronized.c(((NavigableMap) super.d()).floorEntry(obj), this.f17259b);
            }
            return entryC;
        }

        @Override // java.util.NavigableMap
        public final Object floorKey(Object obj) {
            Object objFloorKey;
            synchronized (this.f17259b) {
                objFloorKey = ((NavigableMap) super.d()).floorKey(obj);
            }
            return objFloorKey;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap
        /* JADX INFO: renamed from: g */
        public final SortedMap d() {
            return (NavigableMap) super.d();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z11) {
            SynchronizedNavigableMap synchronizedNavigableMap;
            synchronized (this.f17259b) {
                synchronizedNavigableMap = new SynchronizedNavigableMap(((NavigableMap) super.d()).headMap(obj, z11), this.f17259b);
            }
            return synchronizedNavigableMap;
        }

        @Override // java.util.NavigableMap
        public final Map.Entry higherEntry(Object obj) {
            Map.Entry entryC;
            synchronized (this.f17259b) {
                entryC = Synchronized.c(((NavigableMap) super.d()).higherEntry(obj), this.f17259b);
            }
            return entryC;
        }

        @Override // java.util.NavigableMap
        public final Object higherKey(Object obj) {
            Object objHigherKey;
            synchronized (this.f17259b) {
                objHigherKey = ((NavigableMap) super.d()).higherKey(obj);
            }
            return objHigherKey;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public final Set keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lastEntry() {
            Map.Entry entryC;
            synchronized (this.f17259b) {
                entryC = Synchronized.c(((NavigableMap) super.d()).lastEntry(), this.f17259b);
            }
            return entryC;
        }

        @Override // java.util.NavigableMap
        public final Map.Entry lowerEntry(Object obj) {
            Map.Entry entryC;
            synchronized (this.f17259b) {
                entryC = Synchronized.c(((NavigableMap) super.d()).lowerEntry(obj), this.f17259b);
            }
            return entryC;
        }

        @Override // java.util.NavigableMap
        public final Object lowerKey(Object obj) {
            Object objLowerKey;
            synchronized (this.f17259b) {
                objLowerKey = ((NavigableMap) super.d()).lowerKey(obj);
            }
            return objLowerKey;
        }

        @Override // java.util.NavigableMap
        public final NavigableSet navigableKeySet() {
            synchronized (this.f17259b) {
                try {
                    NavigableSet navigableSet = this.H;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    SynchronizedNavigableSet synchronizedNavigableSet = new SynchronizedNavigableSet(((NavigableMap) super.d()).navigableKeySet(), this.f17259b);
                    this.H = synchronizedNavigableSet;
                    return synchronizedNavigableSet;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollFirstEntry() {
            Map.Entry entryC;
            synchronized (this.f17259b) {
                entryC = Synchronized.c(((NavigableMap) super.d()).pollFirstEntry(), this.f17259b);
            }
            return entryC;
        }

        @Override // java.util.NavigableMap
        public final Map.Entry pollLastEntry() {
            Map.Entry entryC;
            synchronized (this.f17259b) {
                entryC = Synchronized.c(((NavigableMap) super.d()).pollLastEntry(), this.f17259b);
            }
            return entryC;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z11, Object obj2, boolean z12) {
            SynchronizedNavigableMap synchronizedNavigableMap;
            synchronized (this.f17259b) {
                synchronizedNavigableMap = new SynchronizedNavigableMap(((NavigableMap) super.d()).subMap(obj, z11, obj2, z12), this.f17259b);
            }
            return synchronizedNavigableMap;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z11) {
            SynchronizedNavigableMap synchronizedNavigableMap;
            synchronized (this.f17259b) {
                synchronizedNavigableMap = new SynchronizedNavigableMap(((NavigableMap) super.d()).tailMap(obj, z11), this.f17259b);
            }
            return synchronizedNavigableMap;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SynchronizedNavigableSet<E> extends SynchronizedSortedSet<E> implements NavigableSet<E> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public transient NavigableSet f17257c;

        @Override // java.util.NavigableSet
        public final Object ceiling(Object obj) {
            Object objCeiling;
            synchronized (this.f17259b) {
                objCeiling = ((NavigableSet) super.d()).ceiling(obj);
            }
            return objCeiling;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection
        public final Collection d() {
            return (NavigableSet) super.d();
        }

        @Override // java.util.NavigableSet
        public final Iterator descendingIterator() {
            return ((NavigableSet) super.d()).descendingIterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet descendingSet() {
            synchronized (this.f17259b) {
                try {
                    NavigableSet navigableSet = this.f17257c;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    SynchronizedNavigableSet synchronizedNavigableSet = new SynchronizedNavigableSet(((NavigableSet) super.d()).descendingSet(), this.f17259b);
                    this.f17257c = synchronizedNavigableSet;
                    return synchronizedNavigableSet;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.NavigableSet
        public final Object floor(Object obj) {
            Object objFloor;
            synchronized (this.f17259b) {
                objFloor = ((NavigableSet) super.d()).floor(obj);
            }
            return objFloor;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, com.google.common.collect.Synchronized.SynchronizedSet
        /* JADX INFO: renamed from: g */
        public final Set d() {
            return (NavigableSet) super.d();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z11) {
            SynchronizedNavigableSet synchronizedNavigableSet;
            synchronized (this.f17259b) {
                synchronizedNavigableSet = new SynchronizedNavigableSet(((NavigableSet) super.d()).headSet(obj, z11), this.f17259b);
            }
            return synchronizedNavigableSet;
        }

        @Override // java.util.NavigableSet
        public final Object higher(Object obj) {
            Object objHigher;
            synchronized (this.f17259b) {
                objHigher = ((NavigableSet) super.d()).higher(obj);
            }
            return objHigher;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet
        /* JADX INFO: renamed from: j */
        public final SortedSet d() {
            return (NavigableSet) super.d();
        }

        @Override // java.util.NavigableSet
        public final Object lower(Object obj) {
            Object objLower;
            synchronized (this.f17259b) {
                objLower = ((NavigableSet) super.d()).lower(obj);
            }
            return objLower;
        }

        @Override // java.util.NavigableSet
        public final Object pollFirst() {
            Object objPollFirst;
            synchronized (this.f17259b) {
                objPollFirst = ((NavigableSet) super.d()).pollFirst();
            }
            return objPollFirst;
        }

        @Override // java.util.NavigableSet
        public final Object pollLast() {
            Object objPollLast;
            synchronized (this.f17259b) {
                objPollLast = ((NavigableSet) super.d()).pollLast();
            }
            return objPollLast;
        }

        @Override // java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z11, Object obj2, boolean z12) {
            SynchronizedNavigableSet synchronizedNavigableSet;
            synchronized (this.f17259b) {
                synchronizedNavigableSet = new SynchronizedNavigableSet(((NavigableSet) super.d()).subSet(obj, z11, obj2, z12), this.f17259b);
            }
            return synchronizedNavigableSet;
        }

        @Override // java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z11) {
            SynchronizedNavigableSet synchronizedNavigableSet;
            synchronized (this.f17259b) {
                synchronizedNavigableSet = new SynchronizedNavigableSet(((NavigableSet) super.d()).tailSet(obj, z11), this.f17259b);
            }
            return synchronizedNavigableSet;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }
    }
}
