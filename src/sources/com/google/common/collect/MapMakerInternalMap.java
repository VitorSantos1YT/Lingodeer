package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.MapMakerInternalMap.InternalEntry;
import com.google.common.collect.MapMakerInternalMap.Segment;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class MapMakerInternalMap<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    public static final AnonymousClass1 L = new WeakValueReference<Object, Object, DummyInternalEntry>() { // from class: com.google.common.collect.MapMakerInternalMap.1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public final WeakValueReference a(ReferenceQueue referenceQueue, WeakValueEntry weakValueEntry) {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public final /* bridge */ /* synthetic */ InternalEntry b() {
            return null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public final Object get() {
            return null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public final void clear() {
        }
    };
    private static final long serialVersionUID = 5;
    public transient Collection H;
    public transient Set K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient int f16977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient int f16978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Segment[] f16979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Equivalence f16981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient InternalEntryHelper f16982f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public transient Set f16983t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class AbstractSerializationProxy<K, V> extends ForwardingConcurrentMap<K, V> implements Serializable {
        private static final long serialVersionUID = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Strength f16984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Strength f16985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Equivalence f16986c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f16987d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public transient AbstractMap f16988e;

        /* JADX WARN: Multi-variable type inference failed */
        public AbstractSerializationProxy(Strength strength, Strength strength2, Equivalence equivalence, int i11, ConcurrentMap concurrentMap) {
            this.f16984a = strength;
            this.f16985b = strength2;
            this.f16986c = equivalence;
            this.f16987d = i11;
            this.f16988e = (AbstractMap) concurrentMap;
        }

        @Override // com.google.common.collect.ForwardingConcurrentMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: j0 */
        public final Object o0() {
            return this.f16988e;
        }

        @Override // com.google.common.collect.ForwardingConcurrentMap, com.google.common.collect.ForwardingMap
        public final Map o0() {
            return this.f16988e;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, java.util.concurrent.ConcurrentMap] */
        @Override // com.google.common.collect.ForwardingConcurrentMap
        /* JADX INFO: renamed from: r0 */
        public final ConcurrentMap j0() {
            return this.f16988e;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class AbstractStrongKeyEntry<K, V, E extends InternalEntry<K, V, E>> implements InternalEntry<K, V, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f16989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f16990b;

        public AbstractStrongKeyEntry(Object obj, int i11) {
            this.f16989a = obj;
            this.f16990b = i11;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final Object getKey() {
            return this.f16989a;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final int i() {
            return this.f16990b;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public InternalEntry j() {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class AbstractWeakKeyEntry<K, V, E extends InternalEntry<K, V, E>> extends WeakReference<K> implements InternalEntry<K, V, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f16991a;

        public AbstractWeakKeyEntry(ReferenceQueue referenceQueue, Object obj, int i11) {
            super(obj, referenceQueue);
            this.f16991a = i11;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final Object getKey() {
            return get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final int i() {
            return this.f16991a;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public InternalEntry j() {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CleanupMapTask implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class DummyInternalEntry implements InternalEntry<Object, Object, DummyInternalEntry> {
        private DummyInternalEntry() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final Object getKey() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final Object getValue() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final int i() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final InternalEntry j() {
            throw new AssertionError();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class EntryIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<Map.Entry<K, V>> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            MapMakerInternalMap mapMakerInternalMap;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = (mapMakerInternalMap = MapMakerInternalMap.this).get(key)) != null && mapMakerInternalMap.f16982f.d().a().d(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && MapMakerInternalMap.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public abstract class HashIterator<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16994b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Segment f16995c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public AtomicReferenceArray f16996d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public InternalEntry f16997e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public WriteThroughEntry f16998f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public WriteThroughEntry f16999t;

        public HashIterator() {
            this.f16993a = MapMakerInternalMap.this.f16979c.length - 1;
            a();
        }

        public final void a() {
            this.f16998f = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i11 = this.f16993a;
                if (i11 < 0) {
                    return;
                }
                Segment[] segmentArr = MapMakerInternalMap.this.f16979c;
                this.f16993a = i11 - 1;
                Segment segment = segmentArr[i11];
                this.f16995c = segment;
                if (segment.f17003b != 0) {
                    AtomicReferenceArray atomicReferenceArray = this.f16995c.f17006e;
                    this.f16996d = atomicReferenceArray;
                    this.f16994b = atomicReferenceArray.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        public final boolean b(InternalEntry internalEntry) {
            Segment segment;
            MapMakerInternalMap mapMakerInternalMap = MapMakerInternalMap.this;
            try {
                Object key = internalEntry.getKey();
                Object value = internalEntry.getKey() == null ? null : internalEntry.getValue();
                if (value == null) {
                    return false;
                }
                this.f16998f = new WriteThroughEntry(key, value);
                return true;
            } finally {
                this.f16995c.g();
            }
        }

        public final WriteThroughEntry c() {
            WriteThroughEntry writeThroughEntry = this.f16998f;
            if (writeThroughEntry == null) {
                throw new NoSuchElementException();
            }
            this.f16999t = writeThroughEntry;
            a();
            return this.f16999t;
        }

        public final boolean d() {
            InternalEntry internalEntry = this.f16997e;
            if (internalEntry == null) {
                return false;
            }
            while (true) {
                this.f16997e = internalEntry.j();
                InternalEntry internalEntry2 = this.f16997e;
                if (internalEntry2 == null) {
                    return false;
                }
                if (b(internalEntry2)) {
                    return true;
                }
                internalEntry = this.f16997e;
            }
        }

        public final boolean e() {
            while (true) {
                int i11 = this.f16994b;
                if (i11 < 0) {
                    return false;
                }
                AtomicReferenceArray atomicReferenceArray = this.f16996d;
                this.f16994b = i11 - 1;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(i11);
                this.f16997e = internalEntry;
                if (internalEntry != null && (b(internalEntry) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f16998f != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            return c();
        }

        @Override // java.util.Iterator
        public final void remove() {
            CollectPreconditions.d(this.f16999t != null);
            MapMakerInternalMap.this.remove(this.f16999t.f17024a);
            this.f16999t = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface InternalEntry<K, V, E extends InternalEntry<K, V, E>> {
        Object getKey();

        Object getValue();

        int i();

        InternalEntry j();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface InternalEntryHelper<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> {
        Segment a(MapMakerInternalMap mapMakerInternalMap, int i11);

        InternalEntry b(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2);

        Strength c();

        Strength d();

        void e(Segment segment, InternalEntry internalEntry, Object obj);

        InternalEntry f(Segment segment, Object obj, int i11, InternalEntry internalEntry);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class KeyIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<K> {
        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public final Object next() {
            return c().f17024a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class KeySet extends AbstractSet<K> {
        public KeySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new KeyIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return MapMakerInternalMap.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SerializationProxy<K, V> extends AbstractSerializationProxy<K, V> {
        private static final long serialVersionUID = 3;

        /* JADX WARN: Multi-variable type inference failed */
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            int i11 = objectInputStream.readInt();
            MapMaker mapMaker = new MapMaker();
            int i12 = mapMaker.f16972b;
            Preconditions.n(i12, "initial capacity was already set to %s", i12 == -1);
            Preconditions.g(i11 >= 0);
            mapMaker.f16972b = i11;
            mapMaker.b(this.f16984a);
            Strength strength = mapMaker.f16975e;
            Preconditions.q("Value strength was already set to %s", strength == null, strength);
            Strength strength2 = this.f16985b;
            strength2.getClass();
            mapMaker.f16975e = strength2;
            if (strength2 != Strength.STRONG) {
                mapMaker.f16971a = true;
            }
            Equivalence equivalence = mapMaker.f16976f;
            Preconditions.q("key equivalence was already set to %s", equivalence == null, equivalence);
            Equivalence equivalence2 = this.f16986c;
            equivalence2.getClass();
            mapMaker.f16976f = equivalence2;
            mapMaker.f16971a = true;
            int i13 = mapMaker.f16973c;
            Preconditions.n(i13, "concurrency level was already set to %s", i13 == -1);
            int i14 = this.f16987d;
            Preconditions.g(i14 > 0);
            mapMaker.f16973c = i14;
            this.f16988e = (AbstractMap) mapMaker.a();
            while (true) {
                Object object = objectInputStream.readObject();
                if (object == null) {
                    return;
                } else {
                    this.f16988e.put(object, objectInputStream.readObject());
                }
            }
        }

        private Object readResolve() {
            return this.f16988e;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeInt(this.f16988e.size());
            for (Map.Entry<K, V> entry : this.f16988e.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public enum Strength {
        STRONG { // from class: com.google.common.collect.MapMakerInternalMap.Strength.1
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            public final Equivalence a() {
                return Equivalence.c();
            }
        },
        WEAK { // from class: com.google.common.collect.MapMakerInternalMap.Strength.2
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            public final Equivalence a() {
                return Equivalence.e();
            }
        };

        public abstract Equivalence a();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class StrongKeyDummyValueEntry<K> extends AbstractStrongKeyEntry<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>> implements StrongValueEntry<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>> {

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Helper<K> implements InternalEntryHelper<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> {
            static {
                new Helper();
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Segment a(MapMakerInternalMap mapMakerInternalMap, int i11) {
                return new StrongKeyDummyValueSegment(mapMakerInternalMap, i11);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry b(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2) {
                StrongKeyDummyValueEntry strongKeyDummyValueEntry = (StrongKeyDummyValueEntry) internalEntry;
                StrongKeyDummyValueEntry strongKeyDummyValueEntry2 = (StrongKeyDummyValueEntry) internalEntry2;
                Object obj = strongKeyDummyValueEntry.f16989a;
                int i11 = strongKeyDummyValueEntry.f16990b;
                return strongKeyDummyValueEntry2 == null ? new StrongKeyDummyValueEntry(obj, i11) : new LinkedStrongKeyDummyValueEntry(obj, i11, strongKeyDummyValueEntry2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength c() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength d() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final /* bridge */ /* synthetic */ void e(Segment segment, InternalEntry internalEntry, Object obj) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry f(Segment segment, Object obj, int i11, InternalEntry internalEntry) {
                StrongKeyDummyValueEntry strongKeyDummyValueEntry = (StrongKeyDummyValueEntry) internalEntry;
                return strongKeyDummyValueEntry == null ? new StrongKeyDummyValueEntry(obj, i11) : new LinkedStrongKeyDummyValueEntry(obj, i11, strongKeyDummyValueEntry);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class LinkedStrongKeyDummyValueEntry<K> extends StrongKeyDummyValueEntry<K> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final StrongKeyDummyValueEntry f17008c;

            public LinkedStrongKeyDummyValueEntry(Object obj, int i11, StrongKeyDummyValueEntry strongKeyDummyValueEntry) {
                super(obj, i11);
                this.f17008c = strongKeyDummyValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.StrongKeyDummyValueEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final Object getValue() {
                return MapMaker.Dummy.VALUE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final InternalEntry j() {
                return this.f17008c;
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public Object getValue() {
            return MapMaker.Dummy.VALUE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class StrongKeyStrongValueEntry<K, V> extends AbstractStrongKeyEntry<K, V, StrongKeyStrongValueEntry<K, V>> implements StrongValueEntry<K, V, StrongKeyStrongValueEntry<K, V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile Object f17009c;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Helper<K, V> implements InternalEntryHelper<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Helper f17010a = new Helper();

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Segment a(MapMakerInternalMap mapMakerInternalMap, int i11) {
                return new StrongKeyStrongValueSegment(mapMakerInternalMap, i11);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry b(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2) {
                StrongKeyStrongValueEntry strongKeyStrongValueEntry = (StrongKeyStrongValueEntry) internalEntry;
                StrongKeyStrongValueEntry strongKeyStrongValueEntry2 = (StrongKeyStrongValueEntry) internalEntry2;
                Object obj = strongKeyStrongValueEntry.f16989a;
                int i11 = strongKeyStrongValueEntry.f16990b;
                StrongKeyStrongValueEntry strongKeyStrongValueEntry3 = strongKeyStrongValueEntry2 == null ? new StrongKeyStrongValueEntry(obj, i11) : new LinkedStrongKeyStrongValueEntry(obj, i11, strongKeyStrongValueEntry2);
                strongKeyStrongValueEntry3.f17009c = strongKeyStrongValueEntry.f17009c;
                return strongKeyStrongValueEntry3;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength c() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength d() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final void e(Segment segment, InternalEntry internalEntry, Object obj) {
                ((StrongKeyStrongValueEntry) internalEntry).f17009c = obj;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry f(Segment segment, Object obj, int i11, InternalEntry internalEntry) {
                StrongKeyStrongValueEntry strongKeyStrongValueEntry = (StrongKeyStrongValueEntry) internalEntry;
                return strongKeyStrongValueEntry == null ? new StrongKeyStrongValueEntry(obj, i11) : new LinkedStrongKeyStrongValueEntry(obj, i11, strongKeyStrongValueEntry);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class LinkedStrongKeyStrongValueEntry<K, V> extends StrongKeyStrongValueEntry<K, V> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final StrongKeyStrongValueEntry f17011d;

            public LinkedStrongKeyStrongValueEntry(Object obj, int i11, StrongKeyStrongValueEntry strongKeyStrongValueEntry) {
                super(obj, i11);
                this.f17011d = strongKeyStrongValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final InternalEntry j() {
                return this.f17011d;
            }
        }

        public StrongKeyStrongValueEntry(Object obj, int i11) {
            super(obj, i11);
            this.f17009c = null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final Object getValue() {
            return this.f17009c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class StrongKeyWeakValueEntry<K, V> extends AbstractStrongKeyEntry<K, V, StrongKeyWeakValueEntry<K, V>> implements WeakValueEntry<K, V, StrongKeyWeakValueEntry<K, V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile WeakValueReference f17012c;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Helper<K, V> implements InternalEntryHelper<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Helper f17013a = new Helper();

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Segment a(MapMakerInternalMap mapMakerInternalMap, int i11) {
                return new StrongKeyWeakValueSegment(mapMakerInternalMap, i11);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry b(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2) {
                StrongKeyWeakValueSegment strongKeyWeakValueSegment = (StrongKeyWeakValueSegment) segment;
                StrongKeyWeakValueEntry strongKeyWeakValueEntry = (StrongKeyWeakValueEntry) internalEntry;
                StrongKeyWeakValueEntry strongKeyWeakValueEntry2 = (StrongKeyWeakValueEntry) internalEntry2;
                int i11 = Segment.f17001t;
                if (strongKeyWeakValueEntry.getValue() == null) {
                    return null;
                }
                Object obj = strongKeyWeakValueEntry.f16989a;
                int i12 = strongKeyWeakValueEntry.f16990b;
                StrongKeyWeakValueEntry strongKeyWeakValueEntry3 = strongKeyWeakValueEntry2 == null ? new StrongKeyWeakValueEntry(obj, i12) : new LinkedStrongKeyWeakValueEntry(obj, i12, strongKeyWeakValueEntry2);
                strongKeyWeakValueEntry3.f17012c = strongKeyWeakValueEntry.f17012c.a(strongKeyWeakValueSegment.H, strongKeyWeakValueEntry3);
                return strongKeyWeakValueEntry3;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength c() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength d() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final void e(Segment segment, InternalEntry internalEntry, Object obj) {
                StrongKeyWeakValueEntry strongKeyWeakValueEntry = (StrongKeyWeakValueEntry) internalEntry;
                WeakValueReference weakValueReference = strongKeyWeakValueEntry.f17012c;
                strongKeyWeakValueEntry.f17012c = new WeakValueReferenceImpl(((StrongKeyWeakValueSegment) segment).H, obj, strongKeyWeakValueEntry);
                weakValueReference.clear();
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry f(Segment segment, Object obj, int i11, InternalEntry internalEntry) {
                StrongKeyWeakValueEntry strongKeyWeakValueEntry = (StrongKeyWeakValueEntry) internalEntry;
                return strongKeyWeakValueEntry == null ? new StrongKeyWeakValueEntry(obj, i11) : new LinkedStrongKeyWeakValueEntry(obj, i11, strongKeyWeakValueEntry);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class LinkedStrongKeyWeakValueEntry<K, V> extends StrongKeyWeakValueEntry<K, V> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final StrongKeyWeakValueEntry f17014d;

            public LinkedStrongKeyWeakValueEntry(Object obj, int i11, StrongKeyWeakValueEntry strongKeyWeakValueEntry) {
                super(obj, i11);
                this.f17014d = strongKeyWeakValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final InternalEntry j() {
                return this.f17014d;
            }
        }

        public StrongKeyWeakValueEntry(Object obj, int i11) {
            super(obj, i11);
            this.f17012c = MapMakerInternalMap.L;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final Object getValue() {
            return this.f17012c.get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public final WeakValueReference k() {
            return this.f17012c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface StrongValueEntry<K, V, E extends InternalEntry<K, V, E>> extends InternalEntry<K, V, E> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class ValueIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<V> {
        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public final Object next() {
            return c().f17025b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class Values extends AbstractCollection<V> {
        public Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new ValueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class WeakKeyDummyValueEntry<K> extends AbstractWeakKeyEntry<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>> implements StrongValueEntry<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>> {

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Helper<K> implements InternalEntryHelper<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> {
            static {
                new Helper();
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Segment a(MapMakerInternalMap mapMakerInternalMap, int i11) {
                return new WeakKeyDummyValueSegment(mapMakerInternalMap, i11);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry b(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2) {
                WeakKeyDummyValueSegment weakKeyDummyValueSegment = (WeakKeyDummyValueSegment) segment;
                WeakKeyDummyValueEntry weakKeyDummyValueEntry = (WeakKeyDummyValueEntry) internalEntry;
                WeakKeyDummyValueEntry weakKeyDummyValueEntry2 = (WeakKeyDummyValueEntry) internalEntry2;
                K k11 = weakKeyDummyValueEntry.get();
                if (k11 == null) {
                    return null;
                }
                int i11 = weakKeyDummyValueEntry.f16991a;
                return weakKeyDummyValueEntry2 == null ? new WeakKeyDummyValueEntry(weakKeyDummyValueSegment.H, k11, i11) : new LinkedWeakKeyDummyValueEntry(weakKeyDummyValueSegment.H, k11, i11, weakKeyDummyValueEntry2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength c() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength d() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final /* bridge */ /* synthetic */ void e(Segment segment, InternalEntry internalEntry, Object obj) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry f(Segment segment, Object obj, int i11, InternalEntry internalEntry) {
                WeakKeyDummyValueSegment weakKeyDummyValueSegment = (WeakKeyDummyValueSegment) segment;
                WeakKeyDummyValueEntry weakKeyDummyValueEntry = (WeakKeyDummyValueEntry) internalEntry;
                return weakKeyDummyValueEntry == null ? new WeakKeyDummyValueEntry(weakKeyDummyValueSegment.H, obj, i11) : new LinkedWeakKeyDummyValueEntry(weakKeyDummyValueSegment.H, obj, i11, weakKeyDummyValueEntry);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class LinkedWeakKeyDummyValueEntry<K> extends WeakKeyDummyValueEntry<K> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final WeakKeyDummyValueEntry f17016b;

            public LinkedWeakKeyDummyValueEntry(ReferenceQueue referenceQueue, Object obj, int i11, WeakKeyDummyValueEntry weakKeyDummyValueEntry) {
                super(referenceQueue, obj, i11);
                this.f17016b = weakKeyDummyValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.WeakKeyDummyValueEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final Object getValue() {
                return MapMaker.Dummy.VALUE;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final InternalEntry j() {
                return this.f17016b;
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public Object getValue() {
            return MapMaker.Dummy.VALUE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class WeakKeyStrongValueEntry<K, V> extends AbstractWeakKeyEntry<K, V, WeakKeyStrongValueEntry<K, V>> implements StrongValueEntry<K, V, WeakKeyStrongValueEntry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile Object f17017b;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Helper<K, V> implements InternalEntryHelper<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Helper f17018a = new Helper();

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Segment a(MapMakerInternalMap mapMakerInternalMap, int i11) {
                return new WeakKeyStrongValueSegment(mapMakerInternalMap, i11);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry b(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2) {
                WeakKeyStrongValueSegment weakKeyStrongValueSegment = (WeakKeyStrongValueSegment) segment;
                WeakKeyStrongValueEntry weakKeyStrongValueEntry = (WeakKeyStrongValueEntry) internalEntry;
                WeakKeyStrongValueEntry weakKeyStrongValueEntry2 = (WeakKeyStrongValueEntry) internalEntry2;
                K k11 = weakKeyStrongValueEntry.get();
                if (k11 == null) {
                    return null;
                }
                int i11 = weakKeyStrongValueEntry.f16991a;
                WeakKeyStrongValueEntry weakKeyStrongValueEntry3 = weakKeyStrongValueEntry2 == null ? new WeakKeyStrongValueEntry(weakKeyStrongValueSegment.H, k11, i11) : new LinkedWeakKeyStrongValueEntry(weakKeyStrongValueSegment.H, k11, i11, weakKeyStrongValueEntry2);
                weakKeyStrongValueEntry3.f17017b = weakKeyStrongValueEntry.f17017b;
                return weakKeyStrongValueEntry3;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength c() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength d() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final void e(Segment segment, InternalEntry internalEntry, Object obj) {
                ((WeakKeyStrongValueEntry) internalEntry).f17017b = obj;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry f(Segment segment, Object obj, int i11, InternalEntry internalEntry) {
                WeakKeyStrongValueSegment weakKeyStrongValueSegment = (WeakKeyStrongValueSegment) segment;
                WeakKeyStrongValueEntry weakKeyStrongValueEntry = (WeakKeyStrongValueEntry) internalEntry;
                return weakKeyStrongValueEntry == null ? new WeakKeyStrongValueEntry(weakKeyStrongValueSegment.H, obj, i11) : new LinkedWeakKeyStrongValueEntry(weakKeyStrongValueSegment.H, obj, i11, weakKeyStrongValueEntry);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class LinkedWeakKeyStrongValueEntry<K, V> extends WeakKeyStrongValueEntry<K, V> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final WeakKeyStrongValueEntry f17019c;

            public LinkedWeakKeyStrongValueEntry(ReferenceQueue referenceQueue, Object obj, int i11, WeakKeyStrongValueEntry weakKeyStrongValueEntry) {
                super(referenceQueue, obj, i11);
                this.f17019c = weakKeyStrongValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final InternalEntry j() {
                return this.f17019c;
            }
        }

        public WeakKeyStrongValueEntry(ReferenceQueue referenceQueue, Object obj, int i11) {
            super(referenceQueue, obj, i11);
            this.f17017b = null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final Object getValue() {
            return this.f17017b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class WeakKeyWeakValueEntry<K, V> extends AbstractWeakKeyEntry<K, V, WeakKeyWeakValueEntry<K, V>> implements WeakValueEntry<K, V, WeakKeyWeakValueEntry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile WeakValueReference f17020b;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Helper<K, V> implements InternalEntryHelper<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Helper f17021a = new Helper();

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Segment a(MapMakerInternalMap mapMakerInternalMap, int i11) {
                return new WeakKeyWeakValueSegment(mapMakerInternalMap, i11);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry b(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2) {
                WeakKeyWeakValueSegment weakKeyWeakValueSegment = (WeakKeyWeakValueSegment) segment;
                WeakKeyWeakValueEntry weakKeyWeakValueEntry = (WeakKeyWeakValueEntry) internalEntry;
                WeakKeyWeakValueEntry weakKeyWeakValueEntry2 = (WeakKeyWeakValueEntry) internalEntry2;
                K k11 = weakKeyWeakValueEntry.get();
                if (k11 == null) {
                    return null;
                }
                int i11 = Segment.f17001t;
                if (weakKeyWeakValueEntry.f17020b.get() == null) {
                    return null;
                }
                int i12 = weakKeyWeakValueEntry.f16991a;
                WeakKeyWeakValueEntry weakKeyWeakValueEntry3 = weakKeyWeakValueEntry2 == null ? new WeakKeyWeakValueEntry(weakKeyWeakValueSegment.H, k11, i12) : new LinkedWeakKeyWeakValueEntry(weakKeyWeakValueSegment.H, k11, i12, weakKeyWeakValueEntry2);
                weakKeyWeakValueEntry3.f17020b = weakKeyWeakValueEntry.f17020b.a(weakKeyWeakValueSegment.K, weakKeyWeakValueEntry3);
                return weakKeyWeakValueEntry3;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength c() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final Strength d() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final void e(Segment segment, InternalEntry internalEntry, Object obj) {
                WeakKeyWeakValueEntry weakKeyWeakValueEntry = (WeakKeyWeakValueEntry) internalEntry;
                WeakValueReference weakValueReference = weakKeyWeakValueEntry.f17020b;
                weakKeyWeakValueEntry.f17020b = new WeakValueReferenceImpl(((WeakKeyWeakValueSegment) segment).K, obj, weakKeyWeakValueEntry);
                weakValueReference.clear();
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public final InternalEntry f(Segment segment, Object obj, int i11, InternalEntry internalEntry) {
                WeakKeyWeakValueSegment weakKeyWeakValueSegment = (WeakKeyWeakValueSegment) segment;
                WeakKeyWeakValueEntry weakKeyWeakValueEntry = (WeakKeyWeakValueEntry) internalEntry;
                return weakKeyWeakValueEntry == null ? new WeakKeyWeakValueEntry(weakKeyWeakValueSegment.H, obj, i11) : new LinkedWeakKeyWeakValueEntry(weakKeyWeakValueSegment.H, obj, i11, weakKeyWeakValueEntry);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class LinkedWeakKeyWeakValueEntry<K, V> extends WeakKeyWeakValueEntry<K, V> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final WeakKeyWeakValueEntry f17022c;

            public LinkedWeakKeyWeakValueEntry(ReferenceQueue referenceQueue, Object obj, int i11, WeakKeyWeakValueEntry weakKeyWeakValueEntry) {
                super(referenceQueue, obj, i11);
                this.f17022c = weakKeyWeakValueEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            public final InternalEntry j() {
                return this.f17022c;
            }
        }

        public WeakKeyWeakValueEntry(ReferenceQueue referenceQueue, Object obj, int i11) {
            super(referenceQueue, obj, i11);
            this.f17020b = MapMakerInternalMap.L;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final Object getValue() {
            return this.f17020b.get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public final WeakValueReference k() {
            return this.f17020b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface WeakValueEntry<K, V, E extends InternalEntry<K, V, E>> extends InternalEntry<K, V, E> {
        WeakValueReference k();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface WeakValueReference<K, V, E extends InternalEntry<K, V, E>> {
        WeakValueReference a(ReferenceQueue referenceQueue, WeakValueEntry weakValueEntry);

        InternalEntry b();

        void clear();

        Object get();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class WeakValueReferenceImpl<K, V, E extends InternalEntry<K, V, E>> extends WeakReference<V> implements WeakValueReference<K, V, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InternalEntry f17023a;

        public WeakValueReferenceImpl(ReferenceQueue referenceQueue, Object obj, InternalEntry internalEntry) {
            super(obj, referenceQueue);
            this.f17023a = internalEntry;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public final WeakValueReference a(ReferenceQueue referenceQueue, WeakValueEntry weakValueEntry) {
            return new WeakValueReferenceImpl(referenceQueue, get(), weakValueEntry);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public final InternalEntry b() {
            return this.f17023a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class WriteThroughEntry extends AbstractMapEntry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f17024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f17025b;

        public WriteThroughEntry(Object obj, Object obj2) {
            this.f17024a = obj;
            this.f17025b = obj2;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (this.f17024a.equals(entry.getKey()) && this.f17025b.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f17024a;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.f17025b;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final int hashCode() {
            return this.f17024a.hashCode() ^ this.f17025b.hashCode();
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final Object setValue(Object obj) {
            Object objPut = MapMakerInternalMap.this.put(this.f17024a, obj);
            this.f17025b = obj;
            return objPut;
        }
    }

    public MapMakerInternalMap(MapMaker mapMaker, InternalEntryHelper internalEntryHelper) {
        int i11 = mapMaker.f16973c;
        this.f16980d = Math.min(i11 == -1 ? 4 : i11, 65536);
        this.f16981e = (Equivalence) MoreObjects.a(mapMaker.f16976f, ((Strength) MoreObjects.a(mapMaker.f16974d, Strength.STRONG)).a());
        this.f16982f = internalEntryHelper;
        int i12 = mapMaker.f16972b;
        int iMin = Math.min(i12 == -1 ? 16 : i12, 1073741824);
        int i13 = 0;
        int i14 = 1;
        int i15 = 0;
        int i16 = 1;
        while (i16 < this.f16980d) {
            i15++;
            i16 <<= 1;
        }
        this.f16978b = 32 - i15;
        this.f16977a = i16 - 1;
        this.f16979c = new Segment[i16];
        int i17 = iMin / i16;
        while (i14 < (i16 * i17 < iMin ? i17 + 1 : i17)) {
            i14 <<= 1;
        }
        while (true) {
            Segment[] segmentArr = this.f16979c;
            if (i13 >= segmentArr.length) {
                return;
            }
            segmentArr[i13] = this.f16982f.a(this, i14);
            i13++;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    public final int a(Object obj) {
        int iB = this.f16981e.b(obj);
        int i11 = iB + ((iB << 15) ^ (-12931));
        int i12 = i11 ^ (i11 >>> 10);
        int i13 = i12 + (i12 << 3);
        int i14 = i13 ^ (i13 >>> 6);
        int i15 = (i14 << 2) + (i14 << 14) + i14;
        return (i15 >>> 16) ^ i15;
    }

    public final Segment b(int i11) {
        return this.f16979c[(i11 >>> this.f16978b) & this.f16977a];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (Segment segment : this.f16979c) {
            if (segment.f17003b != 0) {
                segment.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = segment.f17006e;
                    for (int i11 = 0; i11 < atomicReferenceArray.length(); i11++) {
                        atomicReferenceArray.set(i11, null);
                    }
                    segment.e();
                    segment.f17007f.set(0);
                    segment.f17004c++;
                    segment.f17003b = 0;
                    segment.unlock();
                } catch (Throwable th2) {
                    segment.unlock();
                    throw th2;
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        boolean z11 = false;
        if (obj == null) {
            return false;
        }
        int iA = a(obj);
        Segment segmentB = b(iA);
        segmentB.getClass();
        try {
            if (segmentB.f17003b == 0) {
                return false;
            }
            InternalEntry internalEntryD = segmentB.d(iA, obj);
            if (internalEntryD != null && internalEntryD.getValue() != null) {
                z11 = true;
            }
            return z11;
        } finally {
            segmentB.g();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Object value;
        if (obj != null) {
            Segment[] segmentArr = this.f16979c;
            long j11 = -1;
            int i11 = 0;
            while (i11 < 3) {
                int length = segmentArr.length;
                long j12 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    Segment segment = segmentArr[i12];
                    int i13 = segment.f17003b;
                    AtomicReferenceArray atomicReferenceArray = segment.f17006e;
                    for (int i14 = 0; i14 < atomicReferenceArray.length(); i14++) {
                        for (InternalEntry internalEntryJ = (InternalEntry) atomicReferenceArray.get(i14); internalEntryJ != null; internalEntryJ = internalEntryJ.j()) {
                            if (internalEntryJ.getKey() == null || (value = internalEntryJ.getValue()) == null) {
                                segment.m();
                                value = null;
                            }
                            if (value != null && this.f16982f.d().a().d(obj, value)) {
                                return true;
                            }
                        }
                    }
                    j12 += (long) segment.f17004c;
                }
                if (j12 == j11) {
                    return false;
                }
                i11++;
                j11 = j12;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.K;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.K = entrySet;
        return entrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iA = a(obj);
        Segment segmentB = b(iA);
        segmentB.getClass();
        try {
            InternalEntry internalEntryD = segmentB.d(iA, obj);
            if (internalEntryD == null) {
                return null;
            }
            Object value = internalEntryD.getValue();
            if (value == null) {
                segmentB.m();
            }
            return value;
        } finally {
            segmentB.g();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        Segment[] segmentArr = this.f16979c;
        long j11 = 0;
        for (int i11 = 0; i11 < segmentArr.length; i11++) {
            if (segmentArr[i11].f17003b != 0) {
                return false;
            }
            j11 += (long) segmentArr[i11].f17004c;
        }
        if (j11 == 0) {
            return true;
        }
        for (int i12 = 0; i12 < segmentArr.length; i12++) {
            if (segmentArr[i12].f17003b != 0) {
                return false;
            }
            j11 -= (long) segmentArr[i12].f17004c;
        }
        return j11 == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f16983t;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.f16983t = keySet;
        return keySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        return b(iA).h(obj, obj2, false, iA);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        return b(iA).h(obj, obj2, true, iA);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iA = a(obj);
        Segment segmentB = b(iA);
        segmentB.lock();
        try {
            segmentB.j();
            AtomicReferenceArray atomicReferenceArray = segmentB.f17006e;
            int length = (atomicReferenceArray.length() - 1) & iA;
            InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
            for (InternalEntry internalEntryJ = internalEntry; internalEntryJ != null; internalEntryJ = internalEntryJ.j()) {
                Object key = internalEntryJ.getKey();
                if (internalEntryJ.i() == iA && key != null && segmentB.f17002a.f16981e.d(obj, key)) {
                    Object value = internalEntryJ.getValue();
                    if (value == null && internalEntryJ.getValue() != null) {
                        return null;
                    }
                    segmentB.f17004c++;
                    InternalEntry internalEntryI = segmentB.i(internalEntry, internalEntryJ);
                    int i11 = segmentB.f17003b - 1;
                    atomicReferenceArray.set(length, internalEntryI);
                    segmentB.f17003b = i11;
                    return value;
                }
            }
            return null;
        } finally {
            segmentB.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object replace(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        Segment segmentB = b(iA);
        segmentB.lock();
        try {
            segmentB.j();
            AtomicReferenceArray atomicReferenceArray = segmentB.f17006e;
            int length = (atomicReferenceArray.length() - 1) & iA;
            InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
            for (InternalEntry internalEntryJ = internalEntry; internalEntryJ != null; internalEntryJ = internalEntryJ.j()) {
                Object key = internalEntryJ.getKey();
                if (internalEntryJ.i() == iA && key != null && segmentB.f17002a.f16981e.d(obj, key)) {
                    Object value = internalEntryJ.getValue();
                    if (value != null) {
                        segmentB.f17004c++;
                        segmentB.l(internalEntryJ, obj2);
                        return value;
                    }
                    if (internalEntryJ.getValue() == null) {
                        segmentB.f17004c++;
                        InternalEntry internalEntryI = segmentB.i(internalEntry, internalEntryJ);
                        int i11 = segmentB.f17003b - 1;
                        atomicReferenceArray.set(length, internalEntryI);
                        segmentB.f17003b = i11;
                    }
                    return null;
                }
            }
            return null;
        } finally {
            segmentB.unlock();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j11 = 0;
        for (Segment segment : this.f16979c) {
            j11 += (long) segment.f17003b;
        }
        return Ints.e(j11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.H;
        if (collection != null) {
            return collection;
        }
        Values values = new Values();
        this.H = values;
        return values;
    }

    public Object writeReplace() {
        InternalEntryHelper internalEntryHelper = this.f16982f;
        Strength strengthC = internalEntryHelper.c();
        Strength strengthD = internalEntryHelper.d();
        internalEntryHelper.d().a();
        return new SerializationProxy(strengthC, strengthD, this.f16981e, this.f16980d, this);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class Segment<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> extends ReentrantLock {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final /* synthetic */ int f17001t = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MapMakerInternalMap f17002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile int f17003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17004c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17005d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile AtomicReferenceArray f17006e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final AtomicInteger f17007f = new AtomicInteger();

        public Segment(MapMakerInternalMap mapMakerInternalMap, int i11) {
            this.f17002a = mapMakerInternalMap;
            AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i11);
            this.f17005d = (atomicReferenceArray.length() * 3) / 4;
            this.f17006e = atomicReferenceArray;
        }

        public final void a(ReferenceQueue referenceQueue) {
            int i11 = 0;
            do {
                Object objPoll = referenceQueue.poll();
                if (objPoll == null) {
                    return;
                }
                InternalEntry internalEntry = (InternalEntry) objPoll;
                MapMakerInternalMap mapMakerInternalMap = this.f17002a;
                mapMakerInternalMap.getClass();
                int i12 = internalEntry.i();
                Segment segmentB = mapMakerInternalMap.b(i12);
                segmentB.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = segmentB.f17006e;
                    int length = i12 & (atomicReferenceArray.length() - 1);
                    InternalEntry internalEntry2 = (InternalEntry) atomicReferenceArray.get(length);
                    for (InternalEntry internalEntryJ = internalEntry2; internalEntryJ != null; internalEntryJ = internalEntryJ.j()) {
                        if (internalEntryJ == internalEntry) {
                            segmentB.f17004c++;
                            InternalEntry internalEntryI = segmentB.i(internalEntry2, internalEntryJ);
                            int i13 = segmentB.f17003b - 1;
                            atomicReferenceArray.set(length, internalEntryI);
                            segmentB.f17003b = i13;
                            break;
                        }
                    }
                    segmentB.unlock();
                    i11++;
                } catch (Throwable th2) {
                    segmentB.unlock();
                    throw th2;
                }
            } while (i11 != 16);
        }

        public final void b(ReferenceQueue referenceQueue) {
            int i11 = 0;
            do {
                Object objPoll = referenceQueue.poll();
                if (objPoll == null) {
                    return;
                }
                WeakValueReference weakValueReference = (WeakValueReference) objPoll;
                MapMakerInternalMap mapMakerInternalMap = this.f17002a;
                mapMakerInternalMap.getClass();
                InternalEntry internalEntryB = weakValueReference.b();
                int i12 = internalEntryB.i();
                Segment segmentB = mapMakerInternalMap.b(i12);
                Object key = internalEntryB.getKey();
                segmentB.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = segmentB.f17006e;
                    int length = (atomicReferenceArray.length() - 1) & i12;
                    InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                    for (InternalEntry internalEntryJ = internalEntry; internalEntryJ != null; internalEntryJ = internalEntryJ.j()) {
                        Object key2 = internalEntryJ.getKey();
                        if (internalEntryJ.i() == i12 && key2 != null && segmentB.f17002a.f16981e.d(key, key2)) {
                            if (((WeakValueEntry) internalEntryJ).k() != weakValueReference) {
                                break;
                            }
                            segmentB.f17004c++;
                            InternalEntry internalEntryI = segmentB.i(internalEntry, internalEntryJ);
                            int i13 = segmentB.f17003b - 1;
                            atomicReferenceArray.set(length, internalEntryI);
                            segmentB.f17003b = i13;
                            break;
                        }
                    }
                    segmentB.unlock();
                    i11++;
                } catch (Throwable th2) {
                    segmentB.unlock();
                    throw th2;
                }
            } while (i11 != 16);
        }

        public final void c() {
            AtomicReferenceArray atomicReferenceArray = this.f17006e;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i11 = this.f17003b;
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
            this.f17005d = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i12 = 0; i12 < length; i12++) {
                InternalEntry internalEntryJ = (InternalEntry) atomicReferenceArray.get(i12);
                if (internalEntryJ != null) {
                    InternalEntry internalEntryJ2 = internalEntryJ.j();
                    int i13 = internalEntryJ.i() & length2;
                    if (internalEntryJ2 == null) {
                        atomicReferenceArray2.set(i13, internalEntryJ);
                    } else {
                        InternalEntry internalEntry = internalEntryJ;
                        while (internalEntryJ2 != null) {
                            int i14 = internalEntryJ2.i() & length2;
                            if (i14 != i13) {
                                internalEntry = internalEntryJ2;
                                i13 = i14;
                            }
                            internalEntryJ2 = internalEntryJ2.j();
                        }
                        atomicReferenceArray2.set(i13, internalEntry);
                        while (internalEntryJ != internalEntry) {
                            int i15 = internalEntryJ.i() & length2;
                            InternalEntry internalEntryB = this.f17002a.f16982f.b(k(), internalEntryJ, (InternalEntry) atomicReferenceArray2.get(i15));
                            if (internalEntryB != null) {
                                atomicReferenceArray2.set(i15, internalEntryB);
                            } else {
                                i11--;
                            }
                            internalEntryJ = internalEntryJ.j();
                        }
                    }
                }
            }
            this.f17006e = atomicReferenceArray2;
            this.f17003b = i11;
        }

        public final InternalEntry d(int i11, Object obj) {
            if (this.f17003b == 0) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f17006e;
            for (InternalEntry internalEntryJ = (InternalEntry) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i11); internalEntryJ != null; internalEntryJ = internalEntryJ.j()) {
                if (internalEntryJ.i() == i11) {
                    Object key = internalEntryJ.getKey();
                    if (key == null) {
                        m();
                    } else if (this.f17002a.f16981e.d(obj, key)) {
                        return internalEntryJ;
                    }
                }
            }
            return null;
        }

        public final void g() {
            if ((this.f17007f.incrementAndGet() & 63) == 0) {
                j();
            }
        }

        public final Object h(Object obj, Object obj2, boolean z11, int i11) {
            lock();
            try {
                j();
                int i12 = this.f17003b + 1;
                if (i12 > this.f17005d) {
                    c();
                    i12 = this.f17003b + 1;
                }
                AtomicReferenceArray atomicReferenceArray = this.f17006e;
                int length = (atomicReferenceArray.length() - 1) & i11;
                InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
                for (InternalEntry internalEntryJ = internalEntry; internalEntryJ != null; internalEntryJ = internalEntryJ.j()) {
                    Object key = internalEntryJ.getKey();
                    if (internalEntryJ.i() == i11 && key != null && this.f17002a.f16981e.d(obj, key)) {
                        Object value = internalEntryJ.getValue();
                        if (value == null) {
                            this.f17004c++;
                            l(internalEntryJ, obj2);
                            this.f17003b = this.f17003b;
                            return null;
                        }
                        if (z11) {
                            return value;
                        }
                        this.f17004c++;
                        l(internalEntryJ, obj2);
                        return value;
                    }
                }
                this.f17004c++;
                InternalEntry internalEntryF = this.f17002a.f16982f.f(k(), obj, i11, internalEntry);
                l(internalEntryF, obj2);
                atomicReferenceArray.set(length, internalEntryF);
                this.f17003b = i12;
                return null;
            } finally {
                unlock();
            }
        }

        public final InternalEntry i(InternalEntry internalEntry, InternalEntry internalEntry2) {
            int i11 = this.f17003b;
            InternalEntry internalEntryJ = internalEntry2.j();
            while (internalEntry != internalEntry2) {
                InternalEntry internalEntryB = this.f17002a.f16982f.b(k(), internalEntry, internalEntryJ);
                if (internalEntryB != null) {
                    internalEntryJ = internalEntryB;
                } else {
                    i11--;
                }
                internalEntry = internalEntry.j();
            }
            this.f17003b = i11;
            return internalEntryJ;
        }

        public final void j() {
            if (tryLock()) {
                try {
                    f();
                    this.f17007f.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public abstract Segment k();

        public final void l(InternalEntry internalEntry, Object obj) {
            this.f17002a.f16982f.e(k(), internalEntry, obj);
        }

        public final void m() {
            if (tryLock()) {
                try {
                    f();
                } finally {
                    unlock();
                }
            }
        }

        public void e() {
        }

        public void f() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class StrongKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> {
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment k() {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class StrongKeyStrongValueSegment<K, V> extends Segment<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> {
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment k() {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class StrongKeyWeakValueSegment<K, V> extends Segment<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> {
        public final ReferenceQueue H;

        public StrongKeyWeakValueSegment(MapMakerInternalMap mapMakerInternalMap, int i11) {
            super(mapMakerInternalMap, i11);
            this.H = new ReferenceQueue();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void e() {
            while (this.H.poll() != null) {
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void f() {
            b(this.H);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment k() {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class WeakKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> {
        public final ReferenceQueue H;

        public WeakKeyDummyValueSegment(MapMakerInternalMap mapMakerInternalMap, int i11) {
            super(mapMakerInternalMap, i11);
            this.H = new ReferenceQueue();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void e() {
            while (this.H.poll() != null) {
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void f() {
            a(this.H);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment k() {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class WeakKeyStrongValueSegment<K, V> extends Segment<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> {
        public final ReferenceQueue H;

        public WeakKeyStrongValueSegment(MapMakerInternalMap mapMakerInternalMap, int i11) {
            super(mapMakerInternalMap, i11);
            this.H = new ReferenceQueue();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void e() {
            while (this.H.poll() != null) {
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void f() {
            a(this.H);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment k() {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class WeakKeyWeakValueSegment<K, V> extends Segment<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> {
        public final ReferenceQueue H;
        public final ReferenceQueue K;

        public WeakKeyWeakValueSegment(MapMakerInternalMap mapMakerInternalMap, int i11) {
            super(mapMakerInternalMap, i11);
            this.H = new ReferenceQueue();
            this.K = new ReferenceQueue();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void e() {
            while (this.H.poll() != null) {
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void f() {
            a(this.H);
            b(this.K);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final Segment k() {
            return this;
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        boolean z11 = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int iA = a(obj);
        Segment segmentB = b(iA);
        segmentB.lock();
        try {
            segmentB.j();
            AtomicReferenceArray atomicReferenceArray = segmentB.f17006e;
            int length = (atomicReferenceArray.length() - 1) & iA;
            InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
            for (InternalEntry internalEntryJ = internalEntry; internalEntryJ != null; internalEntryJ = internalEntryJ.j()) {
                Object key = internalEntryJ.getKey();
                if (internalEntryJ.i() == iA && key != null && segmentB.f17002a.f16981e.d(obj, key)) {
                    if (segmentB.f17002a.f16982f.d().a().d(obj2, internalEntryJ.getValue())) {
                        z11 = true;
                    } else if (internalEntryJ.getValue() != null) {
                        return false;
                    }
                    segmentB.f17004c++;
                    InternalEntry internalEntryI = segmentB.i(internalEntry, internalEntryJ);
                    int i11 = segmentB.f17003b - 1;
                    atomicReferenceArray.set(length, internalEntryI);
                    segmentB.f17003b = i11;
                    return z11;
                }
            }
            return false;
        } finally {
            segmentB.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj3.getClass();
        if (obj2 == null) {
            return false;
        }
        int iA = a(obj);
        Segment segmentB = b(iA);
        segmentB.lock();
        try {
            segmentB.j();
            AtomicReferenceArray atomicReferenceArray = segmentB.f17006e;
            int length = (atomicReferenceArray.length() - 1) & iA;
            InternalEntry internalEntry = (InternalEntry) atomicReferenceArray.get(length);
            for (InternalEntry internalEntryJ = internalEntry; internalEntryJ != null; internalEntryJ = internalEntryJ.j()) {
                Object key = internalEntryJ.getKey();
                if (internalEntryJ.i() == iA && key != null && segmentB.f17002a.f16981e.d(obj, key)) {
                    Object value = internalEntryJ.getValue();
                    if (value == null) {
                        if (internalEntryJ.getValue() == null) {
                            segmentB.f17004c++;
                            InternalEntry internalEntryI = segmentB.i(internalEntry, internalEntryJ);
                            int i11 = segmentB.f17003b - 1;
                            atomicReferenceArray.set(length, internalEntryI);
                            segmentB.f17003b = i11;
                        }
                        return false;
                    }
                    if (!segmentB.f17002a.f16982f.d().a().d(obj2, value)) {
                        return false;
                    }
                    segmentB.f17004c++;
                    segmentB.l(internalEntryJ, obj3);
                    return true;
                }
            }
            return false;
        } finally {
            segmentB.unlock();
        }
    }
}
