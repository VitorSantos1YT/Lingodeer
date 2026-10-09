package com.google.common.cache;

import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Strings;
import com.google.common.base.Supplier;
import com.google.common.base.Ticker;
import com.google.common.collect.AbstractSequentialIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Ints;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.common.util.concurrent.Uninterruptibles;
import fa.EQx.nuRcCS;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class LocalCache<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    public static final Logger Y = Logger.getLogger(LocalCache.class.getName());
    public static final AnonymousClass1 Z = new ValueReference<Object, Object>() { // from class: com.google.common.cache.LocalCache.1
        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean a() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final ReferenceEntry b() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final int d() {
            return 0;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final Object e() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final Object get() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean isActive() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final void c(Object obj) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final ValueReference f(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return this;
        }
    };

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Queue f16442a0 = new AbstractQueue<Object>() { // from class: com.google.common.cache.LocalCache.2
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return ImmutableSet.s().iterator();
        }

        @Override // java.util.Queue
        public final boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public final Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public final Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return 0;
        }
    };
    public final Strength H;
    public final long K;
    public final Weigher L;
    public final long M;
    public final long N;
    public final long O;
    public final AbstractQueue P;
    public final RemovalListener Q;
    public final Ticker R;
    public final EntryFactory S;
    public final AbstractCache.StatsCounter T;
    public final CacheLoader U;
    public Set V;
    public Collection W;
    public Set X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Segment[] f16445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Equivalence f16447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Equivalence f16448f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Strength f16449t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public abstract class AbstractCacheSet<T> extends AbstractSet<T> {
        public AbstractCacheSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LocalCache.this.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class AbstractReferenceEntry<K, V> implements ReferenceEntry<K, V> {
        @Override // com.google.common.cache.ReferenceEntry
        public Object getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int i() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry j() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ValueReference k() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry l() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void m(ValueReference valueReference) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long n() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void o(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry p() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long q() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void r(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry s() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void t(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void u(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void v(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void w(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry z() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public enum EntryFactory {
        STRONG { // from class: com.google.common.cache.LocalCache.EntryFactory.1
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry e(int i11, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                return new StrongEntry(obj, i11, referenceEntry);
            }
        },
        STRONG_ACCESS { // from class: com.google.common.cache.LocalCache.EntryFactory.2
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry b(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                ReferenceEntry referenceEntryB = super.b(segment, referenceEntry, referenceEntry2, obj);
                EntryFactory.a(referenceEntry, referenceEntryB);
                return referenceEntryB;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry e(int i11, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                StrongAccessEntry strongAccessEntry = new StrongAccessEntry(obj, i11, referenceEntry);
                strongAccessEntry.f16483e = Long.MAX_VALUE;
                NullEntry nullEntry = NullEntry.INSTANCE;
                strongAccessEntry.f16484f = nullEntry;
                strongAccessEntry.f16485t = nullEntry;
                return strongAccessEntry;
            }
        },
        STRONG_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.3
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry b(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                ReferenceEntry referenceEntryB = super.b(segment, referenceEntry, referenceEntry2, obj);
                EntryFactory.c(referenceEntry, referenceEntryB);
                return referenceEntryB;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry e(int i11, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                StrongWriteEntry strongWriteEntry = new StrongWriteEntry(obj, i11, referenceEntry);
                strongWriteEntry.f16494e = Long.MAX_VALUE;
                NullEntry nullEntry = NullEntry.INSTANCE;
                strongWriteEntry.f16495f = nullEntry;
                strongWriteEntry.f16496t = nullEntry;
                return strongWriteEntry;
            }
        },
        STRONG_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.4
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry b(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                ReferenceEntry referenceEntryB = super.b(segment, referenceEntry, referenceEntry2, obj);
                EntryFactory.a(referenceEntry, referenceEntryB);
                EntryFactory.c(referenceEntry, referenceEntryB);
                return referenceEntryB;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry e(int i11, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                StrongAccessWriteEntry strongAccessWriteEntry = new StrongAccessWriteEntry(obj, i11, referenceEntry);
                strongAccessWriteEntry.f16486e = Long.MAX_VALUE;
                NullEntry nullEntry = NullEntry.INSTANCE;
                strongAccessWriteEntry.f16487f = nullEntry;
                strongAccessWriteEntry.f16488t = nullEntry;
                strongAccessWriteEntry.H = Long.MAX_VALUE;
                strongAccessWriteEntry.K = nullEntry;
                strongAccessWriteEntry.L = nullEntry;
                return strongAccessWriteEntry;
            }
        },
        WEAK { // from class: com.google.common.cache.LocalCache.EntryFactory.5
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry e(int i11, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                return new WeakEntry(i11, referenceEntry, obj, segment.H);
            }
        },
        WEAK_ACCESS { // from class: com.google.common.cache.LocalCache.EntryFactory.6
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry b(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                ReferenceEntry referenceEntryB = super.b(segment, referenceEntry, referenceEntry2, obj);
                EntryFactory.a(referenceEntry, referenceEntryB);
                return referenceEntryB;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry e(int i11, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                WeakAccessEntry weakAccessEntry = new WeakAccessEntry(i11, referenceEntry, obj, segment.H);
                weakAccessEntry.f16498d = Long.MAX_VALUE;
                NullEntry nullEntry = NullEntry.INSTANCE;
                weakAccessEntry.f16499e = nullEntry;
                weakAccessEntry.f16500f = nullEntry;
                return weakAccessEntry;
            }
        },
        WEAK_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.7
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry b(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                ReferenceEntry referenceEntryB = super.b(segment, referenceEntry, referenceEntry2, obj);
                EntryFactory.c(referenceEntry, referenceEntryB);
                return referenceEntryB;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry e(int i11, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                WeakWriteEntry weakWriteEntry = new WeakWriteEntry(i11, referenceEntry, obj, segment.H);
                weakWriteEntry.f16509d = Long.MAX_VALUE;
                NullEntry nullEntry = NullEntry.INSTANCE;
                weakWriteEntry.f16510e = nullEntry;
                weakWriteEntry.f16511f = nullEntry;
                return weakWriteEntry;
            }
        },
        WEAK_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.8
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry b(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
                ReferenceEntry referenceEntryB = super.b(segment, referenceEntry, referenceEntry2, obj);
                EntryFactory.a(referenceEntry, referenceEntryB);
                EntryFactory.c(referenceEntry, referenceEntryB);
                return referenceEntryB;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public final ReferenceEntry e(int i11, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                WeakAccessWriteEntry weakAccessWriteEntry = new WeakAccessWriteEntry(i11, referenceEntry, obj, segment.H);
                weakAccessWriteEntry.f16501d = Long.MAX_VALUE;
                NullEntry nullEntry = NullEntry.INSTANCE;
                weakAccessWriteEntry.f16502e = nullEntry;
                weakAccessWriteEntry.f16503f = nullEntry;
                weakAccessWriteEntry.f16504t = Long.MAX_VALUE;
                weakAccessWriteEntry.H = nullEntry;
                weakAccessWriteEntry.K = nullEntry;
                return weakAccessWriteEntry;
            }
        };

        static final int ACCESS_MASK = 1;
        static final int WEAK_MASK = 4;
        static final int WRITE_MASK = 2;
        static final EntryFactory[] factories = {STRONG, STRONG_ACCESS, STRONG_WRITE, STRONG_ACCESS_WRITE, WEAK, WEAK_ACCESS, WEAK_WRITE, WEAK_ACCESS_WRITE};

        public static void a(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
            referenceEntry2.o(referenceEntry.q());
            ReferenceEntry referenceEntryL = referenceEntry.l();
            Logger logger = LocalCache.Y;
            referenceEntryL.t(referenceEntry2);
            referenceEntry2.w(referenceEntryL);
            ReferenceEntry referenceEntryS = referenceEntry.s();
            referenceEntry2.t(referenceEntryS);
            referenceEntryS.w(referenceEntry2);
            NullEntry nullEntry = NullEntry.INSTANCE;
            referenceEntry.t(nullEntry);
            referenceEntry.w(nullEntry);
        }

        public static void c(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
            referenceEntry2.r(referenceEntry.n());
            ReferenceEntry referenceEntryZ = referenceEntry.z();
            Logger logger = LocalCache.Y;
            referenceEntryZ.u(referenceEntry2);
            referenceEntry2.v(referenceEntryZ);
            ReferenceEntry referenceEntryP = referenceEntry.p();
            referenceEntry2.u(referenceEntryP);
            referenceEntryP.v(referenceEntry2);
            NullEntry nullEntry = NullEntry.INSTANCE;
            referenceEntry.u(nullEntry);
            referenceEntry.v(nullEntry);
        }

        public ReferenceEntry b(Segment segment, ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj) {
            return e(referenceEntry.i(), segment, referenceEntry2, obj);
        }

        public abstract ReferenceEntry e(int i11, Segment segment, ReferenceEntry referenceEntry, Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class EntryIterator extends LocalCache<K, V>.HashIterator<Map.Entry<K, V>> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class EntrySet extends LocalCache<K, V>.AbstractCacheSet<Map.Entry<K, V>> {
        public EntrySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            LocalCache localCache;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = (localCache = LocalCache.this).get(key)) != null && localCache.f16448f.d(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && LocalCache.this.remove(key, entry.getValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public abstract class HashIterator<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16457b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Segment f16458c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public AtomicReferenceArray f16459d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ReferenceEntry f16460e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public WriteThroughEntry f16461f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public WriteThroughEntry f16462t;

        public HashIterator() {
            this.f16456a = LocalCache.this.f16445c.length - 1;
            a();
        }

        public final void a() {
            this.f16461f = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i11 = this.f16456a;
                if (i11 < 0) {
                    return;
                }
                Segment[] segmentArr = LocalCache.this.f16445c;
                this.f16456a = i11 - 1;
                Segment segment = segmentArr[i11];
                this.f16458c = segment;
                if (segment.f16476b != 0) {
                    AtomicReferenceArray atomicReferenceArray = this.f16458c.f16480f;
                    this.f16459d = atomicReferenceArray;
                    this.f16457b = atomicReferenceArray.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        public final boolean b(ReferenceEntry referenceEntry) {
            Object obj;
            Segment segment;
            LocalCache localCache = LocalCache.this;
            try {
                long jA = localCache.R.a();
                Object key = referenceEntry.getKey();
                Object obj2 = null;
                if (referenceEntry.getKey() != null && (obj = referenceEntry.k().get()) != null && !localCache.e(referenceEntry, jA)) {
                    obj2 = obj;
                }
                if (obj2 == null) {
                    return false;
                }
                this.f16461f = new WriteThroughEntry(key, obj2);
                return true;
            } finally {
                this.f16458c.l();
            }
        }

        public final WriteThroughEntry c() {
            WriteThroughEntry writeThroughEntry = this.f16461f;
            if (writeThroughEntry == null) {
                throw new NoSuchElementException();
            }
            this.f16462t = writeThroughEntry;
            a();
            return this.f16462t;
        }

        public final boolean d() {
            ReferenceEntry referenceEntry = this.f16460e;
            if (referenceEntry == null) {
                return false;
            }
            while (true) {
                this.f16460e = referenceEntry.j();
                ReferenceEntry referenceEntry2 = this.f16460e;
                if (referenceEntry2 == null) {
                    return false;
                }
                if (b(referenceEntry2)) {
                    return true;
                }
                referenceEntry = this.f16460e;
            }
        }

        public final boolean e() {
            while (true) {
                int i11 = this.f16457b;
                if (i11 < 0) {
                    return false;
                }
                AtomicReferenceArray atomicReferenceArray = this.f16459d;
                this.f16457b = i11 - 1;
                ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(i11);
                this.f16460e = referenceEntry;
                if (referenceEntry != null && (b(referenceEntry) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f16461f != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            return c();
        }

        @Override // java.util.Iterator
        public final void remove() {
            Preconditions.r(this.f16462t != null);
            LocalCache.this.remove(this.f16462t.f16519a);
            this.f16462t = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class KeyIterator extends LocalCache<K, V>.HashIterator<K> {
        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public final Object next() {
            return c().f16519a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class KeySet extends LocalCache<K, V>.AbstractCacheSet<K> {
        public KeySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return LocalCache.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new KeyIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return LocalCache.this.remove(obj) != null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class LoadingSerializationProxy<K, V> extends ManualSerializationProxy<K, V> implements LoadingCache<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        public transient LoadingCache P;

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.P = p0().a(this.N);
        }

        private Object readResolve() {
            return this.P;
        }

        @Override // com.google.common.base.Function
        public final Object apply(Object obj) {
            return ((LocalLoadingCache) this.P).apply(obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class LocalLoadingCache<K, V> extends LocalManualCache<K, V> implements LoadingCache<K, V> {
        private static final long serialVersionUID = 1;

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use LoadingSerializationProxy");
        }

        @Override // com.google.common.base.Function
        public final Object apply(Object obj) {
            try {
                return get(obj);
            } catch (ExecutionException e8) {
                throw new UncheckedExecutionException(e8.getCause());
            }
        }

        @Override // com.google.common.cache.LoadingCache
        public final Object get(Object obj) {
            Object obj2;
            ReferenceEntry referenceEntryI;
            LocalCache localCache = this.f16467a;
            CacheLoader cacheLoader = localCache.U;
            obj.getClass();
            int iD = localCache.d(obj);
            Segment segmentF = localCache.f(iD);
            segmentF.getClass();
            cacheLoader.getClass();
            try {
                try {
                    if (segmentF.f16476b == 0 || (referenceEntryI = segmentF.i(iD, obj)) == null) {
                        obj2 = obj;
                    } else {
                        long jA = segmentF.f16475a.R.a();
                        Object objJ = segmentF.j(referenceEntryI, jA);
                        if (objJ != null) {
                            segmentF.o(referenceEntryI, jA);
                            segmentF.P.e();
                            Object objV = segmentF.v(referenceEntryI, obj, iD, objJ, jA, cacheLoader);
                            segmentF.l();
                            return objV;
                        }
                        obj2 = obj;
                        ValueReference valueReferenceK = referenceEntryI.k();
                        if (valueReferenceK.a()) {
                            Object objZ = segmentF.z(referenceEntryI, obj2, valueReferenceK);
                            segmentF.l();
                            return objZ;
                        }
                    }
                    Object objK = segmentF.k(obj2, iD, cacheLoader);
                    segmentF.l();
                    return objK;
                } catch (ExecutionException e8) {
                    Throwable cause = e8.getCause();
                    if (cause instanceof Error) {
                        throw new ExecutionError((Error) cause);
                    }
                    if (cause instanceof RuntimeException) {
                        throw new UncheckedExecutionException(cause);
                    }
                    throw e8;
                }
            } catch (Throwable th2) {
                segmentF.l();
                throw th2;
            }
        }

        @Override // com.google.common.cache.LocalCache.LocalManualCache
        public Object writeReplace() {
            return new LoadingSerializationProxy(this.f16467a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class LocalManualCache<K, V> implements Cache<K, V>, Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalCache f16467a;

        /* JADX INFO: renamed from: com.google.common.cache.LocalCache$LocalManualCache$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 extends CacheLoader<Object, Object> {
            @Override // com.google.common.cache.CacheLoader
            public final Object a(Object obj) {
                throw null;
            }
        }

        public LocalManualCache(LocalCache localCache) {
            this.f16467a = localCache;
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use ManualSerializationProxy");
        }

        public Object writeReplace() {
            return new ManualSerializationProxy(this.f16467a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ManualSerializationProxy<K, V> extends ForwardingCache<K, V> implements Serializable {
        private static final long serialVersionUID = 1;
        public final Weigher H;
        public final int K;
        public final RemovalListener L;
        public final Ticker M;
        public final CacheLoader N;
        public transient Cache O;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Strength f16468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Strength f16469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Equivalence f16470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Equivalence f16471d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f16472e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f16473f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final long f16474t;

        public ManualSerializationProxy(LocalCache localCache) {
            Strength strength = localCache.f16449t;
            Strength strength2 = localCache.H;
            Equivalence equivalence = localCache.f16447e;
            Equivalence equivalence2 = localCache.f16448f;
            long j11 = localCache.N;
            long j12 = localCache.M;
            long j13 = localCache.K;
            Weigher weigher = localCache.L;
            int i11 = localCache.f16446d;
            RemovalListener removalListener = localCache.Q;
            Ticker ticker = localCache.R;
            CacheLoader cacheLoader = localCache.U;
            this.f16468a = strength;
            this.f16469b = strength2;
            this.f16470c = equivalence;
            this.f16471d = equivalence2;
            this.f16472e = j11;
            this.f16473f = j12;
            this.f16474t = j13;
            this.H = weigher;
            this.K = i11;
            this.L = removalListener;
            this.M = (ticker == Ticker.f16416a || ticker == CacheBuilder.f16426p) ? null : ticker;
            this.N = cacheLoader;
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            CacheBuilder cacheBuilderP0 = p0();
            cacheBuilderP0.b();
            this.O = new LocalManualCache(new LocalCache(cacheBuilderP0, null));
        }

        private Object readResolve() {
            return this.O;
        }

        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: j0 */
        public final Object o0() {
            return this.O;
        }

        @Override // com.google.common.cache.ForwardingCache
        /* JADX INFO: renamed from: o0 */
        public final Cache j0() {
            return this.O;
        }

        public final CacheBuilder p0() {
            CacheBuilder cacheBuilderC = CacheBuilder.c();
            Strength strength = cacheBuilderC.f16432f;
            Preconditions.q("Key strength was already set to %s", strength == null, strength);
            Strength strength2 = this.f16468a;
            strength2.getClass();
            cacheBuilderC.f16432f = strength2;
            Strength strength3 = cacheBuilderC.f16433g;
            Preconditions.q("Value strength was already set to %s", strength3 == null, strength3);
            Strength strength4 = this.f16469b;
            strength4.getClass();
            cacheBuilderC.f16433g = strength4;
            Equivalence equivalence = cacheBuilderC.f16436j;
            Preconditions.q("key equivalence was already set to %s", equivalence == null, equivalence);
            Equivalence equivalence2 = this.f16470c;
            equivalence2.getClass();
            cacheBuilderC.f16436j = equivalence2;
            Equivalence equivalence3 = cacheBuilderC.f16437k;
            Preconditions.q("value equivalence was already set to %s", equivalence3 == null, equivalence3);
            Equivalence equivalence4 = this.f16471d;
            equivalence4.getClass();
            cacheBuilderC.f16437k = equivalence4;
            int i11 = cacheBuilderC.f16428b;
            Preconditions.n(i11, "concurrency level was already set to %s", i11 == -1);
            int i12 = this.K;
            Preconditions.g(i12 > 0);
            cacheBuilderC.f16428b = i12;
            Preconditions.r(cacheBuilderC.f16438l == null);
            RemovalListener removalListener = this.L;
            removalListener.getClass();
            cacheBuilderC.f16438l = removalListener;
            cacheBuilderC.f16427a = false;
            long j11 = this.f16472e;
            String str = nuRcCS.CKVQRUi;
            if (j11 > 0) {
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long j12 = cacheBuilderC.f16434h;
                Preconditions.o(j12, "expireAfterWrite was already set to %s ns", j12 == -1);
                if (!(j11 >= 0)) {
                    throw new IllegalArgumentException(Strings.c(str, Long.valueOf(j11), timeUnit));
                }
                cacheBuilderC.f16434h = timeUnit.toNanos(j11);
            }
            long j13 = this.f16473f;
            if (j13 > 0) {
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                long j14 = cacheBuilderC.f16435i;
                Preconditions.o(j14, "expireAfterAccess was already set to %s ns", j14 == -1);
                if (!(j13 >= 0)) {
                    throw new IllegalArgumentException(Strings.c(str, Long.valueOf(j13), timeUnit2));
                }
                cacheBuilderC.f16435i = timeUnit2.toNanos(j13);
            }
            CacheBuilder.OneWeigher oneWeigher = CacheBuilder.OneWeigher.INSTANCE;
            long j15 = this.f16474t;
            Weigher weigher = this.H;
            if (weigher != oneWeigher) {
                Preconditions.r(cacheBuilderC.f16431e == null);
                if (cacheBuilderC.f16427a) {
                    long j16 = cacheBuilderC.f16429c;
                    Preconditions.o(j16, "weigher can not be combined with maximum size (%s provided)", j16 == -1);
                }
                weigher.getClass();
                cacheBuilderC.f16431e = weigher;
                if (j15 != -1) {
                    long j17 = cacheBuilderC.f16430d;
                    Preconditions.o(j17, "maximum weight was already set to %s", j17 == -1);
                    long j18 = cacheBuilderC.f16429c;
                    Preconditions.o(j18, "maximum size was already set to %s", j18 == -1);
                    Preconditions.e("maximum weight must not be negative", j15 >= 0);
                    cacheBuilderC.f16430d = j15;
                }
            } else if (j15 != -1) {
                long j19 = cacheBuilderC.f16429c;
                Preconditions.o(j19, "maximum size was already set to %s", j19 == -1);
                long j21 = cacheBuilderC.f16430d;
                Preconditions.o(j21, "maximum weight was already set to %s", j21 == -1);
                Preconditions.p("maximum size can not be combined with weigher", cacheBuilderC.f16431e == null);
                Preconditions.e("maximum size must not be negative", j15 >= 0);
                cacheBuilderC.f16429c = j15;
            }
            Ticker ticker = this.M;
            if (ticker != null) {
                Preconditions.r(cacheBuilderC.m == null);
                cacheBuilderC.m = ticker;
            }
            return cacheBuilderC;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Segment<K, V> extends ReentrantLock {
        public static final /* synthetic */ int Q = 0;
        public final ReferenceQueue H;
        public final ReferenceQueue K;
        public final AbstractQueue L;
        public final AtomicInteger M = new AtomicInteger();
        public final AbstractQueue N;
        public final AbstractQueue O;
        public final AbstractCache.StatsCounter P;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalCache f16475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile int f16476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f16477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16478d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f16479e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile AtomicReferenceArray f16480f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final long f16481t;

        public Segment(LocalCache localCache, int i11, long j11, AbstractCache.StatsCounter statsCounter) {
            this.f16475a = localCache;
            this.f16481t = j11;
            statsCounter.getClass();
            this.P = statsCounter;
            AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i11);
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.f16479e = length;
            if (localCache.L == CacheBuilder.OneWeigher.INSTANCE && length == j11) {
                this.f16479e = length + 1;
            }
            this.f16480f = atomicReferenceArray;
            Strength strength = localCache.f16449t;
            Strength strength2 = Strength.STRONG;
            this.H = strength != strength2 ? new ReferenceQueue() : null;
            this.K = localCache.H != strength2 ? new ReferenceQueue() : null;
            this.L = (AbstractQueue) ((localCache.b() || localCache.a()) ? new ConcurrentLinkedQueue() : LocalCache.f16442a0);
            this.N = (AbstractQueue) (localCache.c() ? new WriteQueue() : LocalCache.f16442a0);
            this.O = (AbstractQueue) ((localCache.b() || localCache.a()) ? new AccessQueue() : LocalCache.f16442a0);
        }

        public final ReferenceEntry a(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
            Object key = referenceEntry.getKey();
            if (key == null) {
                return null;
            }
            ValueReference valueReferenceK = referenceEntry.k();
            Object obj = valueReferenceK.get();
            if (obj == null && valueReferenceK.isActive()) {
                return null;
            }
            ReferenceEntry referenceEntryB = this.f16475a.S.b(this, referenceEntry, referenceEntry2, key);
            referenceEntryB.m(valueReferenceK.f(this.K, obj, referenceEntryB));
            return referenceEntryB;
        }

        public final void b() {
            while (true) {
                ReferenceEntry referenceEntry = (ReferenceEntry) this.L.poll();
                if (referenceEntry == null) {
                    return;
                }
                AbstractQueue abstractQueue = this.O;
                if (abstractQueue.contains(referenceEntry)) {
                    abstractQueue.add(referenceEntry);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:41:0x00f8 A[EDGE_INSN: B:41:0x00f8->B:52:0x0118 BREAK  A[LOOP:3: B:29:0x00b7->B:48:0x010c]] */
        public final void c() throws Throwable {
            Segment segment;
            int i11 = 0;
            if (this.f16475a.f16449t != Strength.STRONG) {
                int i12 = 0;
                do {
                    Object objPoll = this.H.poll();
                    if (objPoll == null) {
                        break;
                    }
                    ReferenceEntry referenceEntry = (ReferenceEntry) objPoll;
                    LocalCache localCache = this.f16475a;
                    localCache.getClass();
                    int i13 = referenceEntry.i();
                    Segment segmentF = localCache.f(i13);
                    segmentF.lock();
                    try {
                        AtomicReferenceArray atomicReferenceArray = segmentF.f16480f;
                        int length = i13 & (atomicReferenceArray.length() - 1);
                        ReferenceEntry referenceEntry2 = (ReferenceEntry) atomicReferenceArray.get(length);
                        for (ReferenceEntry referenceEntryJ = referenceEntry2; referenceEntryJ != null; referenceEntryJ = referenceEntryJ.j()) {
                            if (referenceEntryJ == referenceEntry) {
                                segmentF.f16478d++;
                                ReferenceEntry referenceEntryS = segmentF.s(referenceEntry2, referenceEntryJ, referenceEntryJ.getKey(), referenceEntryJ.k().get(), referenceEntryJ.k(), RemovalCause.COLLECTED);
                                int i14 = segmentF.f16476b - 1;
                                atomicReferenceArray.set(length, referenceEntryS);
                                segmentF.f16476b = i14;
                                break;
                            }
                        }
                        segmentF.unlock();
                        segmentF.u();
                        i12++;
                    } catch (Throwable th2) {
                        segmentF.unlock();
                        segmentF.u();
                        throw th2;
                    }
                } while (i12 != 16);
            }
            if (this.f16475a.H != Strength.STRONG) {
                do {
                    Object objPoll2 = this.K.poll();
                    if (objPoll2 == null) {
                        return;
                    }
                    ValueReference valueReference = (ValueReference) objPoll2;
                    LocalCache localCache2 = this.f16475a;
                    localCache2.getClass();
                    ReferenceEntry referenceEntryB = valueReference.b();
                    int i15 = referenceEntryB.i();
                    Segment segmentF2 = localCache2.f(i15);
                    Object key = referenceEntryB.getKey();
                    segmentF2.lock();
                    try {
                        AtomicReferenceArray atomicReferenceArray2 = segmentF2.f16480f;
                        int length2 = i15 & (atomicReferenceArray2.length() - 1);
                        ReferenceEntry referenceEntryJ2 = (ReferenceEntry) atomicReferenceArray2.get(length2);
                        int i16 = i15;
                        segment = segmentF2;
                        while (true) {
                            if (referenceEntryJ2 == null) {
                                segment.unlock();
                                if (!segment.isHeldByCurrentThread()) {
                                    segment.u();
                                    break;
                                }
                                break;
                            }
                            int i17 = i16;
                            try {
                                Object key2 = referenceEntryJ2.getKey();
                                if (referenceEntryJ2.i() == i17 && key2 != null && segment.f16475a.f16447e.d(key, key2)) {
                                    if (referenceEntryJ2.k() != valueReference) {
                                        segment.unlock();
                                        if (!segment.isHeldByCurrentThread()) {
                                            segment.u();
                                            break;
                                        }
                                        break;
                                    }
                                    segment.f16478d++;
                                    ReferenceEntry referenceEntryS2 = segment.s(referenceEntryJ2, referenceEntryJ2, key2, valueReference.get(), valueReference, RemovalCause.COLLECTED);
                                    int i18 = segment.f16476b - 1;
                                    atomicReferenceArray2.set(length2, referenceEntryS2);
                                    segment.f16476b = i18;
                                    segment.unlock();
                                    if (!segment.isHeldByCurrentThread()) {
                                        segment.u();
                                        break;
                                    }
                                    break;
                                }
                                referenceEntryJ2 = referenceEntryJ2.j();
                                i16 = i17;
                            } catch (Throwable th3) {
                                th = th3;
                                segment.unlock();
                                if (!segment.isHeldByCurrentThread()) {
                                    segment.u();
                                }
                                throw th;
                            }
                        }
                        i11++;
                    } catch (Throwable th4) {
                        th = th4;
                        segment = segmentF2;
                    }
                } while (i11 != 16);
            }
        }

        public final void d(Object obj, Object obj2, int i11, RemovalCause removalCause) {
            this.f16477c -= (long) i11;
            if (removalCause.a()) {
                this.P.a();
            }
            LocalCache localCache = this.f16475a;
            if (localCache.P != LocalCache.f16442a0) {
                localCache.P.offer(new RemovalNotification(obj, obj2));
            }
        }

        public final void e(ReferenceEntry referenceEntry) {
            ReferenceEntry referenceEntry2;
            if (this.f16475a.a()) {
                b();
                long jD = referenceEntry.k().d();
                long j11 = this.f16481t;
                if (jD > j11 && !q(referenceEntry, referenceEntry.i(), RemovalCause.SIZE)) {
                    throw new AssertionError();
                }
                while (this.f16477c > j11) {
                    Iterator it = this.O.iterator();
                    do {
                        if (!it.hasNext()) {
                            throw new AssertionError();
                        }
                        referenceEntry2 = (ReferenceEntry) it.next();
                    } while (referenceEntry2.k().d() <= 0);
                    if (!q(referenceEntry2, referenceEntry2.i(), RemovalCause.SIZE)) {
                        throw new AssertionError();
                    }
                }
            }
        }

        public final void f() {
            AtomicReferenceArray atomicReferenceArray = this.f16480f;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i11 = this.f16476b;
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
            this.f16479e = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i12 = 0; i12 < length; i12++) {
                ReferenceEntry referenceEntryJ = (ReferenceEntry) atomicReferenceArray.get(i12);
                if (referenceEntryJ != null) {
                    ReferenceEntry referenceEntryJ2 = referenceEntryJ.j();
                    int i13 = referenceEntryJ.i() & length2;
                    if (referenceEntryJ2 == null) {
                        atomicReferenceArray2.set(i13, referenceEntryJ);
                    } else {
                        ReferenceEntry referenceEntry = referenceEntryJ;
                        while (referenceEntryJ2 != null) {
                            int i14 = referenceEntryJ2.i() & length2;
                            if (i14 != i13) {
                                referenceEntry = referenceEntryJ2;
                                i13 = i14;
                            }
                            referenceEntryJ2 = referenceEntryJ2.j();
                        }
                        atomicReferenceArray2.set(i13, referenceEntry);
                        while (referenceEntryJ != referenceEntry) {
                            int i15 = referenceEntryJ.i() & length2;
                            ReferenceEntry referenceEntryA = a(referenceEntryJ, (ReferenceEntry) atomicReferenceArray2.get(i15));
                            if (referenceEntryA != null) {
                                atomicReferenceArray2.set(i15, referenceEntryA);
                            } else {
                                p(referenceEntryJ);
                                i11--;
                            }
                            referenceEntryJ = referenceEntryJ.j();
                        }
                    }
                }
            }
            this.f16480f = atomicReferenceArray2;
            this.f16476b = i11;
        }

        public final void g(long j11) {
            ReferenceEntry referenceEntry;
            ReferenceEntry referenceEntry2;
            b();
            do {
                referenceEntry = (ReferenceEntry) this.N.peek();
                LocalCache localCache = this.f16475a;
                if (referenceEntry == null || !localCache.e(referenceEntry, j11)) {
                    do {
                        referenceEntry2 = (ReferenceEntry) this.O.peek();
                        if (referenceEntry2 == null || !localCache.e(referenceEntry2, j11)) {
                            return;
                        }
                    } while (q(referenceEntry2, referenceEntry2.i(), RemovalCause.EXPIRED));
                    throw new AssertionError();
                }
            } while (q(referenceEntry, referenceEntry.i(), RemovalCause.EXPIRED));
            throw new AssertionError();
        }

        public final Object h(Object obj, int i11, LoadingValueReference loadingValueReference, ListenableFuture listenableFuture) throws Throwable {
            Object objA;
            AbstractCache.StatsCounter statsCounter = this.P;
            try {
                objA = Uninterruptibles.a(listenableFuture);
                try {
                    if (objA == null) {
                        throw new CacheLoader.InvalidCacheLoadException("CacheLoader returned null for key " + obj + ".");
                    }
                    Stopwatch stopwatch = loadingValueReference.f16466c;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    statsCounter.d(stopwatch.a());
                    x(obj, i11, loadingValueReference, objA);
                    return objA;
                } catch (Throwable th2) {
                    th = th2;
                    if (objA == null) {
                        Stopwatch stopwatch2 = loadingValueReference.f16466c;
                        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                        statsCounter.c(stopwatch2.a());
                        lock();
                        try {
                            AtomicReferenceArray atomicReferenceArray = this.f16480f;
                            int length = (atomicReferenceArray.length() - 1) & i11;
                            ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
                            for (ReferenceEntry referenceEntryJ = referenceEntry; referenceEntryJ != null; referenceEntryJ = referenceEntryJ.j()) {
                                Object key = referenceEntryJ.getKey();
                                if (referenceEntryJ.i() == i11 && key != null && this.f16475a.f16447e.d(obj, key)) {
                                    if (referenceEntryJ.k() != loadingValueReference) {
                                        break;
                                    }
                                    if (!loadingValueReference.f16464a.isActive()) {
                                        atomicReferenceArray.set(length, r(referenceEntry, referenceEntryJ));
                                        break;
                                    }
                                    referenceEntryJ.m(loadingValueReference.f16464a);
                                    break;
                                }
                            }
                        } finally {
                            unlock();
                            u();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                objA = null;
            }
        }

        public final ReferenceEntry i(int i11, Object obj) {
            AtomicReferenceArray atomicReferenceArray = this.f16480f;
            for (ReferenceEntry referenceEntryJ = (ReferenceEntry) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i11); referenceEntryJ != null; referenceEntryJ = referenceEntryJ.j()) {
                if (referenceEntryJ.i() == i11) {
                    Object key = referenceEntryJ.getKey();
                    if (key == null) {
                        y();
                    } else if (this.f16475a.f16447e.d(obj, key)) {
                        return referenceEntryJ;
                    }
                }
            }
            return null;
        }

        public final Object j(ReferenceEntry referenceEntry, long j11) {
            if (referenceEntry.getKey() == null) {
                y();
                return null;
            }
            Object obj = referenceEntry.k().get();
            if (obj == null) {
                y();
                return null;
            }
            if (!this.f16475a.e(referenceEntry, j11)) {
                return obj;
            }
            if (!tryLock()) {
                return null;
            }
            try {
                g(j11);
                return null;
            } finally {
                unlock();
            }
        }

        public final Object k(Object obj, int i11, CacheLoader cacheLoader) {
            LoadingValueReference loadingValueReference;
            ValueReference valueReferenceK;
            Object objH;
            lock();
            try {
                long jA = this.f16475a.R.a();
                t(jA);
                boolean z11 = true;
                int i12 = this.f16476b - 1;
                AtomicReferenceArray atomicReferenceArray = this.f16480f;
                int length = (atomicReferenceArray.length() - 1) & i11;
                ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
                ReferenceEntry referenceEntryE = referenceEntry;
                while (true) {
                    loadingValueReference = null;
                    if (referenceEntryE == null) {
                        valueReferenceK = null;
                        break;
                    }
                    Object key = referenceEntryE.getKey();
                    if (referenceEntryE.i() == i11 && key != null && this.f16475a.f16447e.d(obj, key)) {
                        valueReferenceK = referenceEntryE.k();
                        if (!valueReferenceK.a()) {
                            Object obj2 = valueReferenceK.get();
                            if (obj2 == null) {
                                d(key, obj2, valueReferenceK.d(), RemovalCause.COLLECTED);
                            } else {
                                if (!this.f16475a.e(referenceEntryE, jA)) {
                                    n(referenceEntryE, jA);
                                    this.P.e();
                                    unlock();
                                    u();
                                    return obj2;
                                }
                                d(key, obj2, valueReferenceK.d(), RemovalCause.EXPIRED);
                            }
                            this.N.remove(referenceEntryE);
                            this.O.remove(referenceEntryE);
                            this.f16476b = i12;
                            break;
                        }
                        z11 = false;
                        break;
                    }
                    referenceEntryE = referenceEntryE.j();
                }
                if (z11) {
                    loadingValueReference = new LoadingValueReference();
                    if (referenceEntryE == null) {
                        EntryFactory entryFactory = this.f16475a.S;
                        obj.getClass();
                        referenceEntryE = entryFactory.e(i11, this, referenceEntry, obj);
                        referenceEntryE.m(loadingValueReference);
                        atomicReferenceArray.set(length, referenceEntryE);
                    } else {
                        referenceEntryE.m(loadingValueReference);
                    }
                }
                unlock();
                u();
                if (!z11) {
                    return z(referenceEntryE, obj, valueReferenceK);
                }
                try {
                    synchronized (referenceEntryE) {
                        objH = h(obj, i11, loadingValueReference, loadingValueReference.g(obj, cacheLoader));
                    }
                    this.P.b();
                    return objH;
                } catch (Throwable th2) {
                    this.P.b();
                    throw th2;
                }
            } catch (Throwable th3) {
                unlock();
                u();
                throw th3;
            }
        }

        public final void l() {
            if ((this.M.incrementAndGet() & 63) == 0) {
                t(this.f16475a.R.a());
                u();
            }
        }

        /* JADX WARN: Code duplicated, block: B:65:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public final Object m(Object obj, Object obj2, boolean z11, int i11) throws Throwable {
            Throwable th2;
            ReferenceEntry referenceEntryJ;
            Segment<K, V> segment;
            Throwable th3;
            Segment<K, V> segment2;
            int i12;
            lock();
            try {
                long jA = this.f16475a.R.a();
                t(jA);
                if (this.f16476b + 1 <= this.f16479e) {
                    AtomicReferenceArray atomicReferenceArray = this.f16480f;
                    int length = i11 & (atomicReferenceArray.length() - 1);
                    ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
                    referenceEntryJ = referenceEntry;
                    while (referenceEntryJ != null) {
                        Object key = referenceEntryJ.getKey();
                        if (referenceEntryJ.i() == i11) {
                        }
                        Object obj3 = obj;
                        Object obj4 = obj2;
                        segment = this;
                        referenceEntryJ = referenceEntryJ.j();
                        obj = obj3;
                        obj2 = obj4;
                    }
                    Object obj5 = obj;
                    Object obj6 = obj2;
                    this.f16478d++;
                    ReferenceEntry referenceEntryE = this.f16475a.S.e(i11, this, referenceEntry, obj5);
                    w(referenceEntryE, obj5, obj6, jA);
                    atomicReferenceArray.set(length, referenceEntryE);
                    this.f16476b++;
                    e(referenceEntryE);
                    unlock();
                    u();
                    return null;
                }
                try {
                    f();
                    AtomicReferenceArray atomicReferenceArray2 = this.f16480f;
                    int length2 = i11 & (atomicReferenceArray2.length() - 1);
                    ReferenceEntry referenceEntry2 = (ReferenceEntry) atomicReferenceArray2.get(length2);
                    referenceEntryJ = referenceEntry2;
                    try {
                        while (referenceEntryJ != null) {
                            try {
                                try {
                                    Object key2 = referenceEntryJ.getKey();
                                    if (referenceEntryJ.i() == i11 || key2 == null || !this.f16475a.f16447e.d(obj, key2)) {
                                        Object obj7 = obj;
                                        Object obj8 = obj2;
                                        segment = this;
                                        try {
                                            referenceEntryJ = referenceEntryJ.j();
                                            obj = obj7;
                                            obj2 = obj8;
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    } else {
                                        ValueReference valueReferenceK = referenceEntryJ.k();
                                        Object obj9 = valueReferenceK.get();
                                        if (obj9 == null) {
                                            this.f16478d++;
                                            if (valueReferenceK.isActive()) {
                                                d(obj, obj9, valueReferenceK.d(), RemovalCause.COLLECTED);
                                                segment2 = this;
                                                segment2.w(referenceEntryJ, obj, obj2, jA);
                                                i12 = segment2.f16476b;
                                            } else {
                                                segment2 = this;
                                                segment2.w(referenceEntryJ, obj, obj2, jA);
                                                i12 = segment2.f16476b + 1;
                                            }
                                            segment2.f16476b = i12;
                                            e(referenceEntryJ);
                                            unlock();
                                            u();
                                            return null;
                                        }
                                        Object obj10 = obj;
                                        Object obj11 = obj2;
                                        if (z11) {
                                            n(referenceEntryJ, jA);
                                            unlock();
                                            u();
                                            return obj9;
                                        }
                                        try {
                                            this.f16478d++;
                                            d(obj10, obj9, valueReferenceK.d(), RemovalCause.REPLACED);
                                            w(referenceEntryJ, obj10, obj11, jA);
                                            segment = this;
                                            e(referenceEntryJ);
                                            unlock();
                                            u();
                                            return obj9;
                                        } catch (Throwable th5) {
                                            th3 = th5;
                                        }
                                        th2 = th;
                                    }
                                    th = th4;
                                } catch (Throwable th6) {
                                    th = th6;
                                    segment = this;
                                }
                                th3 = th;
                                th2 = th3;
                            } catch (Throwable th7) {
                                th = th7;
                            }
                        }
                        this.f16478d++;
                        ReferenceEntry referenceEntryE2 = this.f16475a.S.e(i11, this, referenceEntry2, obj5);
                        w(referenceEntryE2, obj5, obj6, jA);
                        atomicReferenceArray2.set(length2, referenceEntryE2);
                        this.f16476b++;
                        e(referenceEntryE2);
                        unlock();
                        u();
                        return null;
                    } catch (Throwable th8) {
                        th = th8;
                    }
                    Object obj12 = obj;
                    Object obj13 = obj2;
                } catch (Throwable th9) {
                    th2 = th9;
                }
            } catch (Throwable th10) {
                th = th10;
            }
            unlock();
            u();
            throw th2;
        }

        public final void n(ReferenceEntry referenceEntry, long j11) {
            if (this.f16475a.b()) {
                referenceEntry.o(j11);
            }
            this.O.add(referenceEntry);
        }

        public final void o(ReferenceEntry referenceEntry, long j11) {
            if (this.f16475a.b()) {
                referenceEntry.o(j11);
            }
            this.L.add(referenceEntry);
        }

        public final void p(ReferenceEntry referenceEntry) {
            Object key = referenceEntry.getKey();
            referenceEntry.i();
            d(key, referenceEntry.k().get(), referenceEntry.k().d(), RemovalCause.COLLECTED);
            this.N.remove(referenceEntry);
            this.O.remove(referenceEntry);
        }

        public final boolean q(ReferenceEntry referenceEntry, int i11, RemovalCause removalCause) {
            AtomicReferenceArray atomicReferenceArray = this.f16480f;
            int length = i11 & (atomicReferenceArray.length() - 1);
            ReferenceEntry referenceEntry2 = (ReferenceEntry) atomicReferenceArray.get(length);
            for (ReferenceEntry referenceEntryJ = referenceEntry2; referenceEntryJ != null; referenceEntryJ = referenceEntryJ.j()) {
                if (referenceEntryJ == referenceEntry) {
                    this.f16478d++;
                    ReferenceEntry referenceEntryS = s(referenceEntry2, referenceEntryJ, referenceEntryJ.getKey(), referenceEntryJ.k().get(), referenceEntryJ.k(), removalCause);
                    int i12 = this.f16476b - 1;
                    atomicReferenceArray.set(length, referenceEntryS);
                    this.f16476b = i12;
                    return true;
                }
            }
            return false;
        }

        public final ReferenceEntry r(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2) {
            int i11 = this.f16476b;
            ReferenceEntry referenceEntryJ = referenceEntry2.j();
            while (referenceEntry != referenceEntry2) {
                ReferenceEntry referenceEntryA = a(referenceEntry, referenceEntryJ);
                if (referenceEntryA != null) {
                    referenceEntryJ = referenceEntryA;
                } else {
                    p(referenceEntry);
                    i11--;
                }
                referenceEntry = referenceEntry.j();
            }
            this.f16476b = i11;
            return referenceEntryJ;
        }

        public final ReferenceEntry s(ReferenceEntry referenceEntry, ReferenceEntry referenceEntry2, Object obj, Object obj2, ValueReference valueReference, RemovalCause removalCause) {
            d(obj, obj2, valueReference.d(), removalCause);
            this.N.remove(referenceEntry2);
            this.O.remove(referenceEntry2);
            if (!valueReference.a()) {
                return r(referenceEntry, referenceEntry2);
            }
            valueReference.c(null);
            return referenceEntry;
        }

        public final void t(long j11) {
            if (tryLock()) {
                try {
                    c();
                    g(j11);
                    this.M.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public final void u() {
            if (isHeldByCurrentThread()) {
                return;
            }
            while (true) {
                LocalCache localCache = this.f16475a;
                if (((RemovalNotification) localCache.P.poll()) == null) {
                    return;
                }
                try {
                    localCache.Q.getClass();
                } catch (Throwable th2) {
                    LocalCache.Y.log(Level.WARNING, "Exception thrown by removal listener", th2);
                }
            }
        }

        public final Object v(ReferenceEntry referenceEntry, final Object obj, final int i11, Object obj2, long j11, CacheLoader cacheLoader) {
            Object objA;
            LoadingValueReference loadingValueReference;
            final LoadingValueReference loadingValueReference2;
            if (this.f16475a.O > 0 && j11 - referenceEntry.n() > this.f16475a.O && !referenceEntry.k().a()) {
                lock();
                try {
                    long jA = this.f16475a.R.a();
                    t(jA);
                    AtomicReferenceArray atomicReferenceArray = this.f16480f;
                    int length = (atomicReferenceArray.length() - 1) & i11;
                    ReferenceEntry referenceEntry2 = (ReferenceEntry) atomicReferenceArray.get(length);
                    ReferenceEntry referenceEntryJ = referenceEntry2;
                    while (true) {
                        objA = null;
                        if (referenceEntryJ != null) {
                            Object key = referenceEntryJ.getKey();
                            if (referenceEntryJ.i() == i11 && key != null && this.f16475a.f16447e.d(obj, key)) {
                                ValueReference valueReferenceK = referenceEntryJ.k();
                                if (valueReferenceK.a() || jA - referenceEntryJ.n() < this.f16475a.O) {
                                    unlock();
                                    u();
                                    loadingValueReference2 = null;
                                    break;
                                }
                                this.f16478d++;
                                loadingValueReference = new LoadingValueReference(valueReferenceK);
                                referenceEntryJ.m(loadingValueReference);
                            } else {
                                referenceEntryJ = referenceEntryJ.j();
                            }
                        } else {
                            this.f16478d++;
                            loadingValueReference = new LoadingValueReference();
                            EntryFactory entryFactory = this.f16475a.S;
                            obj.getClass();
                            ReferenceEntry referenceEntryE = entryFactory.e(i11, this, referenceEntry2, obj);
                            referenceEntryE.m(loadingValueReference);
                            atomicReferenceArray.set(length, referenceEntryE);
                        }
                        unlock();
                        u();
                        loadingValueReference2 = loadingValueReference;
                        break;
                    }
                    if (loadingValueReference2 != null) {
                        final ListenableFuture listenableFutureG = loadingValueReference2.g(obj, cacheLoader);
                        listenableFutureG.N(new Runnable() { // from class: com.google.common.cache.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                LocalCache.Segment segment = this.f16537a;
                                Object obj3 = obj;
                                int i12 = i11;
                                LocalCache.LoadingValueReference loadingValueReference3 = loadingValueReference2;
                                ListenableFuture listenableFuture = listenableFutureG;
                                int i13 = LocalCache.Segment.Q;
                                try {
                                    segment.h(obj3, i12, loadingValueReference3, listenableFuture);
                                } catch (Throwable th2) {
                                    LocalCache.Y.log(Level.WARNING, "Exception thrown during refresh", th2);
                                    loadingValueReference3.f16465b.n(th2);
                                }
                            }
                        }, MoreExecutors.a());
                        if (listenableFutureG.isDone()) {
                            try {
                                objA = Uninterruptibles.a(listenableFutureG);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    if (objA != null) {
                        return objA;
                    }
                } catch (Throwable th2) {
                    unlock();
                    u();
                    throw th2;
                }
            }
            return obj2;
        }

        public final void w(ReferenceEntry referenceEntry, Object obj, Object obj2, long j11) {
            ValueReference valueReferenceK = referenceEntry.k();
            LocalCache localCache = this.f16475a;
            localCache.L.getClass();
            referenceEntry.m(localCache.H.b(1, this, referenceEntry, obj2));
            b();
            this.f16477c += (long) 1;
            if (localCache.b()) {
                referenceEntry.o(j11);
            }
            if (localCache.c() || localCache.O > 0) {
                referenceEntry.r(j11);
            }
            this.O.add(referenceEntry);
            this.N.add(referenceEntry);
            valueReferenceK.c(obj2);
        }

        /* JADX WARN: Code duplicated, block: B:74:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public final void x(Object obj, int i11, LoadingValueReference loadingValueReference, Object obj2) throws Throwable {
            Throwable th2;
            ReferenceEntry referenceEntryJ;
            Segment<K, V> segment;
            Throwable th3;
            lock();
            try {
                long jA = this.f16475a.R.a();
                t(jA);
                int i12 = this.f16476b + 1;
                if (i12 <= this.f16479e) {
                    AtomicReferenceArray atomicReferenceArray = this.f16480f;
                    int length = i11 & (atomicReferenceArray.length() - 1);
                    ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
                    referenceEntryJ = referenceEntry;
                    while (referenceEntryJ != null) {
                        Object key = referenceEntryJ.getKey();
                        if (referenceEntryJ.i() == i11) {
                        }
                        Object obj3 = obj;
                        Object obj4 = obj2;
                        segment = this;
                        referenceEntryJ = referenceEntryJ.j();
                        obj = obj3;
                        obj2 = obj4;
                    }
                    Object obj5 = obj;
                    Object obj6 = obj2;
                    this.f16478d++;
                    EntryFactory entryFactory = this.f16475a.S;
                    obj5.getClass();
                    ReferenceEntry referenceEntryE = entryFactory.e(i11, this, referenceEntry, obj5);
                    w(referenceEntryE, obj5, obj6, jA);
                    atomicReferenceArray.set(length, referenceEntryE);
                    this.f16476b = i12;
                    e(referenceEntryE);
                    unlock();
                    u();
                    return;
                }
                try {
                    f();
                    i12 = this.f16476b + 1;
                    AtomicReferenceArray atomicReferenceArray2 = this.f16480f;
                    int length2 = i11 & (atomicReferenceArray2.length() - 1);
                    ReferenceEntry referenceEntry2 = (ReferenceEntry) atomicReferenceArray2.get(length2);
                    referenceEntryJ = referenceEntry2;
                    while (referenceEntryJ != null) {
                        try {
                            Object key2 = referenceEntryJ.getKey();
                            if (referenceEntryJ.i() == i11 || key2 == null || !this.f16475a.f16447e.d(obj, key2)) {
                                Object obj7 = obj;
                                Object obj8 = obj2;
                                segment = this;
                                try {
                                    referenceEntryJ = referenceEntryJ.j();
                                    obj = obj7;
                                    obj2 = obj8;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } else {
                                ValueReference valueReferenceK = referenceEntryJ.k();
                                Object obj9 = valueReferenceK.get();
                                if (loadingValueReference != valueReferenceK && (obj9 != null || valueReferenceK == LocalCache.Z)) {
                                    d(obj, obj2, 0, RemovalCause.REPLACED);
                                    unlock();
                                    u();
                                    return;
                                }
                                this.f16478d++;
                                try {
                                    if (loadingValueReference.f16464a.isActive()) {
                                        d(obj, obj9, loadingValueReference.f16464a.d(), obj9 == null ? RemovalCause.COLLECTED : RemovalCause.REPLACED);
                                        i12--;
                                    }
                                    try {
                                        w(referenceEntryJ, obj, obj2, jA);
                                        segment = this;
                                        segment.f16476b = i12;
                                        e(referenceEntryJ);
                                        unlock();
                                        u();
                                        return;
                                    } catch (Throwable th5) {
                                        th3 = th5;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    segment = this;
                                    th3 = th;
                                }
                            }
                            th = th4;
                        } catch (Throwable th7) {
                            th = th7;
                            segment = this;
                        }
                        th3 = th;
                        th2 = th3;
                    }
                    Object obj10 = obj;
                    Object obj11 = obj2;
                    try {
                        this.f16478d++;
                        EntryFactory entryFactory2 = this.f16475a.S;
                        obj10.getClass();
                        ReferenceEntry referenceEntryE2 = entryFactory2.e(i11, this, referenceEntry2, obj10);
                        try {
                            w(referenceEntryE2, obj10, obj11, jA);
                            atomicReferenceArray2.set(length2, referenceEntryE2);
                            this.f16476b = i12;
                            e(referenceEntryE2);
                            unlock();
                            u();
                            return;
                        } catch (Throwable th8) {
                            th = th8;
                            th2 = th;
                            unlock();
                            u();
                            throw th2;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                    }
                } catch (Throwable th10) {
                    th2 = th10;
                }
            } catch (Throwable th11) {
                th = th11;
            }
            unlock();
            u();
            throw th2;
        }

        public final void y() {
            if (tryLock()) {
                try {
                    c();
                } finally {
                    unlock();
                }
            }
        }

        public final Object z(ReferenceEntry referenceEntry, Object obj, ValueReference valueReference) {
            AbstractCache.StatsCounter statsCounter = this.P;
            if (!valueReference.a()) {
                throw new AssertionError();
            }
            Preconditions.q("Recursive load of: %s", !Thread.holdsLock(referenceEntry), obj);
            try {
                Object objE = valueReference.e();
                if (objE != null) {
                    o(referenceEntry, this.f16475a.R.a());
                    statsCounter.b();
                    return objE;
                }
                throw new CacheLoader.InvalidCacheLoadException("CacheLoader returned null for key " + obj + ".");
            } catch (Throwable th2) {
                statsCounter.b();
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public enum Strength {
        STRONG { // from class: com.google.common.cache.LocalCache.Strength.1
            @Override // com.google.common.cache.LocalCache.Strength
            public final Equivalence a() {
                return Equivalence.c();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            public final ValueReference b(int i11, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                return i11 == 1 ? new StrongValueReference(obj) : new WeightedStrongValueReference(obj, i11);
            }
        },
        SOFT { // from class: com.google.common.cache.LocalCache.Strength.2
            @Override // com.google.common.cache.LocalCache.Strength
            public final Equivalence a() {
                return Equivalence.e();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            public final ValueReference b(int i11, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                ReferenceQueue referenceQueue = segment.K;
                return i11 == 1 ? new SoftValueReference(referenceQueue, obj, referenceEntry) : new WeightedSoftValueReference(i11, referenceEntry, obj, referenceQueue);
            }
        },
        WEAK { // from class: com.google.common.cache.LocalCache.Strength.3
            @Override // com.google.common.cache.LocalCache.Strength
            public final Equivalence a() {
                return Equivalence.e();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            public final ValueReference b(int i11, Segment segment, ReferenceEntry referenceEntry, Object obj) {
                ReferenceQueue referenceQueue = segment.K;
                return i11 == 1 ? new WeakValueReference(referenceQueue, obj, referenceEntry) : new WeightedWeakValueReference(i11, referenceEntry, obj, referenceQueue);
            }
        };

        public abstract Equivalence a();

        public abstract ValueReference b(int i11, Segment segment, ReferenceEntry referenceEntry, Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class StrongAccessEntry<K, V> extends StrongEntry<K, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile long f16483e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ReferenceEntry f16484f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public ReferenceEntry f16485t;

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry l() {
            return this.f16485t;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void o(long j11) {
            this.f16483e = j11;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final long q() {
            return this.f16483e;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry s() {
            return this.f16484f;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void t(ReferenceEntry referenceEntry) {
            this.f16484f = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void w(ReferenceEntry referenceEntry) {
            this.f16485t = referenceEntry;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class StrongAccessWriteEntry<K, V> extends StrongEntry<K, V> {
        public volatile long H;
        public ReferenceEntry K;
        public ReferenceEntry L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile long f16486e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ReferenceEntry f16487f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public ReferenceEntry f16488t;

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry l() {
            return this.f16488t;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final long n() {
            return this.H;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void o(long j11) {
            this.f16486e = j11;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry p() {
            return this.K;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final long q() {
            return this.f16486e;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void r(long j11) {
            this.H = j11;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry s() {
            return this.f16487f;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void t(ReferenceEntry referenceEntry) {
            this.f16487f = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void u(ReferenceEntry referenceEntry) {
            this.K = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void v(ReferenceEntry referenceEntry) {
            this.L = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void w(ReferenceEntry referenceEntry) {
            this.f16488t = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry z() {
            return this.L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class StrongEntry<K, V> extends AbstractReferenceEntry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f16489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f16490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ReferenceEntry f16491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile ValueReference f16492d = LocalCache.Z;

        public StrongEntry(Object obj, int i11, ReferenceEntry referenceEntry) {
            this.f16489a = obj;
            this.f16490b = i11;
            this.f16491c = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final Object getKey() {
            return this.f16489a;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final int i() {
            return this.f16490b;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry j() {
            return this.f16491c;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ValueReference k() {
            return this.f16492d;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void m(ValueReference valueReference) {
            this.f16492d = valueReference;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class StrongWriteEntry<K, V> extends StrongEntry<K, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile long f16494e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ReferenceEntry f16495f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public ReferenceEntry f16496t;

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final long n() {
            return this.f16494e;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry p() {
            return this.f16495f;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void r(long j11) {
            this.f16494e = j11;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void u(ReferenceEntry referenceEntry) {
            this.f16495f = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final void v(ReferenceEntry referenceEntry) {
            this.f16496t = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry z() {
            return this.f16496t;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class ValueIterator extends LocalCache<K, V>.HashIterator<V> {
        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public final Object next() {
            return c().f16520b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface ValueReference<K, V> {
        boolean a();

        ReferenceEntry b();

        void c(Object obj);

        int d();

        Object e();

        ValueReference f(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry);

        Object get();

        boolean isActive();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class Values extends AbstractCollection<V> {
        public Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return LocalCache.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new ValueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return LocalCache.this.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class WeakAccessEntry<K, V> extends WeakEntry<K, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile long f16498d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ReferenceEntry f16499e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ReferenceEntry f16500f;

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry l() {
            return this.f16500f;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void o(long j11) {
            this.f16498d = j11;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final long q() {
            return this.f16498d;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry s() {
            return this.f16499e;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void t(ReferenceEntry referenceEntry) {
            this.f16499e = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void w(ReferenceEntry referenceEntry) {
            this.f16500f = referenceEntry;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class WeakAccessWriteEntry<K, V> extends WeakEntry<K, V> {
        public ReferenceEntry H;
        public ReferenceEntry K;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile long f16501d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ReferenceEntry f16502e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ReferenceEntry f16503f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public volatile long f16504t;

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry l() {
            return this.f16503f;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final long n() {
            return this.f16504t;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void o(long j11) {
            this.f16501d = j11;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry p() {
            return this.H;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final long q() {
            return this.f16501d;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void r(long j11) {
            this.f16504t = j11;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry s() {
            return this.f16502e;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void t(ReferenceEntry referenceEntry) {
            this.f16502e = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void u(ReferenceEntry referenceEntry) {
            this.H = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void v(ReferenceEntry referenceEntry) {
            this.K = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void w(ReferenceEntry referenceEntry) {
            this.f16503f = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry z() {
            return this.K;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class WeakEntry<K, V> extends WeakReference<K> implements ReferenceEntry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f16505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ReferenceEntry f16506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile ValueReference f16507c;

        public WeakEntry(int i11, ReferenceEntry referenceEntry, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.f16507c = LocalCache.Z;
            this.f16505a = i11;
            this.f16506b = referenceEntry;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final Object getKey() {
            return get();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final int i() {
            return this.f16505a;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final ReferenceEntry j() {
            return this.f16506b;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final ValueReference k() {
            return this.f16507c;
        }

        public ReferenceEntry l() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void m(ValueReference valueReference) {
            this.f16507c = valueReference;
        }

        public long n() {
            throw new UnsupportedOperationException();
        }

        public void o(long j11) {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry p() {
            throw new UnsupportedOperationException();
        }

        public long q() {
            throw new UnsupportedOperationException();
        }

        public void r(long j11) {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry s() {
            throw new UnsupportedOperationException();
        }

        public void t(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void u(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void v(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void w(ReferenceEntry referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry z() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class WeakWriteEntry<K, V> extends WeakEntry<K, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile long f16509d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ReferenceEntry f16510e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ReferenceEntry f16511f;

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final long n() {
            return this.f16509d;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry p() {
            return this.f16510e;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void r(long j11) {
            this.f16509d = j11;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void u(ReferenceEntry referenceEntry) {
            this.f16510e = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final void v(ReferenceEntry referenceEntry) {
            this.f16511f = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public final ReferenceEntry z() {
            return this.f16511f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class WeightedSoftValueReference<K, V> extends SoftValueReference<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f16512b;

        public WeightedSoftValueReference(int i11, ReferenceEntry referenceEntry, Object obj, ReferenceQueue referenceQueue) {
            super(referenceQueue, obj, referenceEntry);
            this.f16512b = i11;
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        public final int d() {
            return this.f16512b;
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        public final ValueReference f(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return new WeightedSoftValueReference(this.f16512b, referenceEntry, obj, referenceQueue);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class WeightedStrongValueReference<K, V> extends StrongValueReference<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f16513b;

        public WeightedStrongValueReference(Object obj, int i11) {
            super(obj);
            this.f16513b = i11;
        }

        @Override // com.google.common.cache.LocalCache.StrongValueReference, com.google.common.cache.LocalCache.ValueReference
        public final int d() {
            return this.f16513b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class WeightedWeakValueReference<K, V> extends WeakValueReference<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f16514b;

        public WeightedWeakValueReference(int i11, ReferenceEntry referenceEntry, Object obj, ReferenceQueue referenceQueue) {
            super(referenceQueue, obj, referenceEntry);
            this.f16514b = i11;
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        public final int d() {
            return this.f16514b;
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        public final ValueReference f(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return new WeightedWeakValueReference(this.f16514b, referenceEntry, obj, referenceQueue);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class WriteThroughEntry implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f16519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f16520b;

        public WriteThroughEntry(Object obj, Object obj2) {
            this.f16519a = obj;
            this.f16520b = obj2;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (this.f16519a.equals(entry.getKey()) && this.f16520b.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f16519a;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.f16520b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f16519a.hashCode() ^ this.f16520b.hashCode();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            Object objPut = LocalCache.this.put(this.f16519a, obj);
            this.f16520b = obj;
            return objPut;
        }

        public final String toString() {
            return this.f16519a + "=" + this.f16520b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.common.cache.LocalCache, java.util.AbstractMap] */
    public LocalCache(CacheBuilder cacheBuilder, CacheLoader cacheLoader) {
        long j11;
        ?? abstractMap = new AbstractMap();
        int i11 = cacheBuilder.f16428b;
        Supplier supplier = cacheBuilder.f16439n;
        abstractMap.f16446d = Math.min(i11 == -1 ? 4 : i11, 65536);
        Strength strength = cacheBuilder.f16432f;
        Strength strength2 = Strength.STRONG;
        Strength strength3 = (Strength) MoreObjects.a(strength, strength2);
        abstractMap.f16449t = strength3;
        abstractMap.H = (Strength) MoreObjects.a(cacheBuilder.f16433g, strength2);
        abstractMap.f16447e = (Equivalence) MoreObjects.a(cacheBuilder.f16436j, ((Strength) MoreObjects.a(cacheBuilder.f16432f, strength2)).a());
        abstractMap.f16448f = (Equivalence) MoreObjects.a(cacheBuilder.f16437k, ((Strength) MoreObjects.a(cacheBuilder.f16433g, strength2)).a());
        if (cacheBuilder.f16434h == 0 || cacheBuilder.f16435i == 0) {
            j11 = 0;
        } else {
            j11 = cacheBuilder.f16431e == null ? cacheBuilder.f16429c : cacheBuilder.f16430d;
        }
        abstractMap.K = j11;
        Weigher weigher = cacheBuilder.f16431e;
        CacheBuilder.OneWeigher oneWeigher = CacheBuilder.OneWeigher.INSTANCE;
        Weigher weigher2 = (Weigher) MoreObjects.a(weigher, oneWeigher);
        abstractMap.L = weigher2;
        long j12 = cacheBuilder.f16435i;
        abstractMap.M = j12 == -1 ? 0L : j12;
        long j13 = cacheBuilder.f16434h;
        abstractMap.N = j13 == -1 ? 0L : j13;
        abstractMap.O = 0L;
        RemovalListener removalListener = cacheBuilder.f16438l;
        CacheBuilder.NullListener nullListener = CacheBuilder.NullListener.INSTANCE;
        RemovalListener removalListener2 = (RemovalListener) MoreObjects.a(removalListener, nullListener);
        abstractMap.Q = removalListener2;
        abstractMap.P = (AbstractQueue) (removalListener2 == nullListener ? f16442a0 : new ConcurrentLinkedQueue());
        int i12 = 0;
        int i13 = 1;
        boolean z11 = abstractMap.c() || 0 > 0 || abstractMap.b();
        Ticker ticker = cacheBuilder.m;
        if (ticker == null) {
            ticker = z11 ? Ticker.f16416a : CacheBuilder.f16426p;
        }
        abstractMap.R = ticker;
        abstractMap.S = EntryFactory.factories[((abstractMap.b() || abstractMap.a() || abstractMap.b()) ? (char) 1 : (char) 0) | (strength3 != Strength.WEAK ? (char) 0 : (char) 4) | (abstractMap.c() || abstractMap.c() || (0L > 0L ? 1 : (0L == 0L ? 0 : -1)) > 0 ? 2 : 0)];
        abstractMap.T = (AbstractCache.StatsCounter) supplier.get();
        abstractMap.U = cacheLoader;
        int iMin = Math.min(16, 1073741824);
        if (abstractMap.a() && weigher2 == oneWeigher) {
            iMin = (int) Math.min(iMin, j11);
        }
        int i14 = 0;
        int i15 = 1;
        while (i15 < abstractMap.f16446d && (!abstractMap.a() || ((long) i15) * 20 <= abstractMap.K)) {
            i14++;
            i15 <<= 1;
        }
        abstractMap.f16444b = 32 - i14;
        abstractMap.f16443a = i15 - 1;
        abstractMap.f16445c = new Segment[i15];
        int i16 = iMin / i15;
        while (i13 < (i16 * i15 < iMin ? i16 + 1 : i16)) {
            i13 <<= 1;
        }
        if (abstractMap.a()) {
            long j14 = abstractMap.K;
            long j15 = i15;
            long j16 = (j14 / j15) + 1;
            long j17 = j14 % j15;
            while (true) {
                Segment[] segmentArr = abstractMap.f16445c;
                if (i12 >= segmentArr.length) {
                    return;
                }
                if (i12 == j17) {
                    j16--;
                }
                long j18 = j16;
                segmentArr[i12] = new Segment(abstractMap, i13, j18, (AbstractCache.StatsCounter) supplier.get());
                i12++;
                j16 = j18;
            }
        } else {
            int i17 = i13;
            LocalCache localCache = abstractMap;
            while (true) {
                Segment[] segmentArr2 = localCache.f16445c;
                if (i12 >= segmentArr2.length) {
                    return;
                }
                segmentArr2[i12] = new Segment(localCache, i17, -1L, (AbstractCache.StatsCounter) supplier.get());
                i12++;
                localCache = this;
            }
        }
    }

    public final boolean a() {
        return this.K >= 0;
    }

    public final boolean b() {
        return this.M > 0;
    }

    public final boolean c() {
        return this.N > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (Segment segment : this.f16445c) {
            if (segment.f16476b != 0) {
                segment.lock();
                try {
                    segment.t(segment.f16475a.R.a());
                    AtomicReferenceArray atomicReferenceArray = segment.f16480f;
                    for (int i11 = 0; i11 < atomicReferenceArray.length(); i11++) {
                        for (ReferenceEntry referenceEntryJ = (ReferenceEntry) atomicReferenceArray.get(i11); referenceEntryJ != null; referenceEntryJ = referenceEntryJ.j()) {
                            if (referenceEntryJ.k().isActive()) {
                                Object key = referenceEntryJ.getKey();
                                Object obj = referenceEntryJ.k().get();
                                RemovalCause removalCause = (key == null || obj == null) ? RemovalCause.COLLECTED : RemovalCause.EXPLICIT;
                                referenceEntryJ.i();
                                segment.d(key, obj, referenceEntryJ.k().d(), removalCause);
                            }
                        }
                    }
                    for (int i12 = 0; i12 < atomicReferenceArray.length(); i12++) {
                        atomicReferenceArray.set(i12, null);
                    }
                    LocalCache localCache = segment.f16475a;
                    if (localCache.f16449t != Strength.STRONG) {
                        while (segment.H.poll() != null) {
                        }
                    }
                    if (localCache.H != Strength.STRONG) {
                        while (segment.K.poll() != null) {
                        }
                    }
                    segment.N.clear();
                    segment.O.clear();
                    segment.M.set(0);
                    segment.f16478d++;
                    segment.f16476b = 0;
                    segment.unlock();
                    segment.u();
                } catch (Throwable th2) {
                    segment.unlock();
                    segment.u();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0044 A[Catch: all -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:6:0x000f, B:8:0x0013, B:24:0x0044, B:11:0x0023, B:13:0x002b, B:16:0x0034, B:19:0x003a, B:20:0x003d, B:15:0x0031), top: B:35:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iD = d(obj);
        Segment segmentF = f(iD);
        segmentF.getClass();
        try {
            if (segmentF.f16476b == 0) {
                segmentF.l();
                return false;
            }
            long jA = segmentF.f16475a.R.a();
            ReferenceEntry referenceEntryI = segmentF.i(iD, obj);
            if (referenceEntryI != null) {
                if (segmentF.f16475a.e(referenceEntryI, jA)) {
                    if (segmentF.tryLock()) {
                        try {
                            segmentF.g(jA);
                            segmentF.unlock();
                        } catch (Throwable th2) {
                            segmentF.unlock();
                            throw th2;
                        }
                    }
                }
                if (referenceEntryI == null) {
                    segmentF.l();
                    return false;
                }
                boolean z11 = referenceEntryI.k().get() != null;
                segmentF.l();
                return z11;
            }
            referenceEntryI = null;
            if (referenceEntryI == null) {
                segmentF.l();
                return false;
            }
            if (referenceEntryI.k().get() != null) {
            }
            segmentF.l();
            return z11;
        } catch (Throwable th3) {
            segmentF.l();
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        int i11 = 0;
        if (obj == null) {
            return false;
        }
        long jA = this.R.a();
        Segment[] segmentArr = this.f16445c;
        long j11 = -1;
        int i12 = 0;
        while (i12 < 3) {
            int length = segmentArr.length;
            long j12 = 0;
            int i13 = i11 == true ? 1 : 0;
            while (i13 < length) {
                Segment segment = segmentArr[i13];
                int i14 = segment.f16476b;
                AtomicReferenceArray atomicReferenceArray = segment.f16480f;
                int i15 = i11;
                while (i15 < atomicReferenceArray.length()) {
                    ReferenceEntry referenceEntryJ = (ReferenceEntry) atomicReferenceArray.get(i15);
                    while (referenceEntryJ != null) {
                        Segment[] segmentArr2 = segmentArr;
                        Object objJ = segment.j(referenceEntryJ, jA);
                        ReferenceEntry referenceEntry = referenceEntryJ;
                        if (objJ != null && this.f16448f.d(obj, objJ)) {
                            return true;
                        }
                        referenceEntryJ = referenceEntry.j();
                        segmentArr = segmentArr2;
                    }
                    i15++;
                }
                j12 += (long) segment.f16478d;
                i13++;
                i11 = i15;
            }
            boolean z11 = i11;
            Segment[] segmentArr3 = segmentArr;
            if (j12 == j11) {
                return z11;
            }
            i12++;
            j11 = j12;
            i11 = z11 ? 1 : 0;
            segmentArr = segmentArr3;
        }
        return i11 == true ? 1 : 0;
    }

    public final int d(Object obj) {
        int iB;
        Equivalence equivalence = this.f16447e;
        if (obj == null) {
            equivalence.getClass();
            iB = 0;
        } else {
            iB = equivalence.b(obj);
        }
        int i11 = iB + ((iB << 15) ^ (-12931));
        int i12 = i11 ^ (i11 >>> 10);
        int i13 = i12 + (i12 << 3);
        int i14 = i13 ^ (i13 >>> 6);
        int i15 = (i14 << 2) + (i14 << 14) + i14;
        return (i15 >>> 16) ^ i15;
    }

    public final boolean e(ReferenceEntry referenceEntry, long j11) {
        referenceEntry.getClass();
        if (!b() || j11 - referenceEntry.q() < this.M) {
            return c() && j11 - referenceEntry.n() >= this.N;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.X;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.X = entrySet;
        return entrySet;
    }

    public final Segment f(int i11) {
        return this.f16445c[(i11 >>> this.f16444b) & this.f16443a];
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045 A[Catch: all -> 0x0062, TRY_ENTER, TryCatch #0 {all -> 0x0062, blocks: (B:6:0x000f, B:8:0x0013, B:25:0x0045, B:27:0x004f, B:32:0x0065, B:11:0x0022, B:13:0x002a, B:16:0x0033, B:19:0x0039, B:20:0x003d, B:15:0x0030), top: B:37:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x004f A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #0 {all -> 0x0062, blocks: (B:6:0x000f, B:8:0x0013, B:25:0x0045, B:27:0x004f, B:32:0x0065, B:11:0x0022, B:13:0x002a, B:16:0x0033, B:19:0x0039, B:20:0x003d, B:15:0x0030), top: B:37:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0065 A[Catch: all -> 0x0062, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0062, blocks: (B:6:0x000f, B:8:0x0013, B:25:0x0045, B:27:0x004f, B:32:0x0065, B:11:0x0022, B:13:0x002a, B:16:0x0033, B:19:0x0039, B:20:0x003d, B:15:0x0030), top: B:37:0x000f, inners: #1 }] */
    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        ReferenceEntry referenceEntry;
        Object obj2;
        if (obj == null) {
            return null;
        }
        int iD = d(obj);
        Segment segmentF = f(iD);
        segmentF.getClass();
        try {
            if (segmentF.f16476b != 0) {
                long jA = segmentF.f16475a.R.a();
                ReferenceEntry referenceEntryI = segmentF.i(iD, obj);
                if (referenceEntryI != null) {
                    if (!segmentF.f16475a.e(referenceEntryI, jA)) {
                        referenceEntry = referenceEntryI;
                    } else if (segmentF.tryLock()) {
                        try {
                            segmentF.g(jA);
                            segmentF.unlock();
                        } catch (Throwable th2) {
                            segmentF.unlock();
                            throw th2;
                        }
                    }
                    if (referenceEntry == null) {
                        segmentF.l();
                        return null;
                    }
                    obj2 = referenceEntry.k().get();
                    if (obj2 != null) {
                        segmentF.o(referenceEntry, jA);
                        Object objV = segmentF.v(referenceEntry, referenceEntry.getKey(), iD, obj2, jA, segmentF.f16475a.U);
                        segmentF.l();
                        return objV;
                    }
                    segmentF.y();
                }
                referenceEntry = null;
                if (referenceEntry == null) {
                    segmentF.l();
                    return null;
                }
                obj2 = referenceEntry.k().get();
                if (obj2 != null) {
                    segmentF.o(referenceEntry, jA);
                    Object objV2 = segmentF.v(referenceEntry, referenceEntry.getKey(), iD, obj2, jA, segmentF.f16475a.U);
                    segmentF.l();
                    return objV2;
                }
                segmentF.y();
            }
            segmentF.l();
            return null;
        } catch (Throwable th3) {
            segmentF.l();
            throw th3;
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        Segment[] segmentArr = this.f16445c;
        long j11 = 0;
        for (Segment segment : segmentArr) {
            if (segment.f16476b != 0) {
                return false;
            }
            j11 += (long) segment.f16478d;
        }
        if (j11 == 0) {
            return true;
        }
        for (Segment segment2 : segmentArr) {
            if (segment2.f16476b != 0) {
                return false;
            }
            j11 -= (long) segment2.f16478d;
        }
        return j11 == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.V;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.V = keySet;
        return keySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iD = d(obj);
        return f(iD).m(obj, obj2, false, iD);
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
        int iD = d(obj);
        return f(iD).m(obj, obj2, true, iD);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        RemovalCause removalCause;
        if (obj == null) {
            return null;
        }
        int iD = d(obj);
        Segment segmentF = f(iD);
        segmentF.lock();
        try {
            segmentF.t(segmentF.f16475a.R.a());
            AtomicReferenceArray atomicReferenceArray = segmentF.f16480f;
            int length = iD & (atomicReferenceArray.length() - 1);
            ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
            for (ReferenceEntry referenceEntryJ = referenceEntry; referenceEntryJ != null; referenceEntryJ = referenceEntryJ.j()) {
                Object key = referenceEntryJ.getKey();
                if (referenceEntryJ.i() == iD && key != null && segmentF.f16475a.f16447e.d(obj, key)) {
                    ValueReference valueReferenceK = referenceEntryJ.k();
                    Object obj2 = valueReferenceK.get();
                    if (obj2 == null) {
                        if (!valueReferenceK.isActive()) {
                            break;
                        }
                        removalCause = RemovalCause.COLLECTED;
                    } else {
                        removalCause = RemovalCause.EXPLICIT;
                    }
                    RemovalCause removalCause2 = removalCause;
                    segmentF.f16478d++;
                    ReferenceEntry referenceEntryS = segmentF.s(referenceEntry, referenceEntryJ, key, obj2, valueReferenceK, removalCause2);
                    int i11 = segmentF.f16476b - 1;
                    atomicReferenceArray.set(length, referenceEntryS);
                    segmentF.f16476b = i11;
                    return obj2;
                }
            }
            return null;
        } finally {
            segmentF.unlock();
            segmentF.u();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object replace(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iD = d(obj);
        Segment segmentF = f(iD);
        segmentF.lock();
        try {
            long jA = segmentF.f16475a.R.a();
            segmentF.t(jA);
            AtomicReferenceArray atomicReferenceArray = segmentF.f16480f;
            int length = iD & (atomicReferenceArray.length() - 1);
            ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
            ReferenceEntry referenceEntryJ = referenceEntry;
            while (referenceEntryJ != null) {
                Object key = referenceEntryJ.getKey();
                if (referenceEntryJ.i() == iD && key != null && segmentF.f16475a.f16447e.d(obj, key)) {
                    ValueReference valueReferenceK = referenceEntryJ.k();
                    Object obj3 = valueReferenceK.get();
                    if (obj3 == null) {
                        if (!valueReferenceK.isActive()) {
                            break;
                        }
                        segmentF.f16478d++;
                        ReferenceEntry referenceEntryS = segmentF.s(referenceEntry, referenceEntryJ, key, obj3, valueReferenceK, RemovalCause.COLLECTED);
                        int i11 = segmentF.f16476b - 1;
                        atomicReferenceArray.set(length, referenceEntryS);
                        segmentF.f16476b = i11;
                        break;
                    }
                    ReferenceEntry referenceEntry2 = referenceEntryJ;
                    segmentF.f16478d++;
                    segmentF.d(obj, obj3, valueReferenceK.d(), RemovalCause.REPLACED);
                    segmentF.w(referenceEntry2, obj, obj2, jA);
                    segmentF.e(referenceEntry2);
                    segmentF.unlock();
                    segmentF.u();
                    return obj3;
                }
                Object obj4 = obj2;
                referenceEntry = referenceEntry;
                obj = obj;
                referenceEntryJ = referenceEntryJ.j();
                obj2 = obj4;
            }
            segmentF.unlock();
            segmentF.u();
            return null;
        } catch (Throwable th2) {
            segmentF.unlock();
            segmentF.u();
            throw th2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long jMax = 0;
        for (Segment segment : this.f16445c) {
            jMax += (long) Math.max(0, segment.f16476b);
        }
        return Ints.e(jMax);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.W;
        if (collection != null) {
            return collection;
        }
        Values values = new Values();
        this.W = values;
        return values;
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class LoadingValueReference<K, V> implements ValueReference<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile ValueReference f16464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SettableFuture f16465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Stopwatch f16466c;

        public LoadingValueReference() {
            this(LocalCache.Z);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean a() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final ReferenceEntry b() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final void c(Object obj) {
            if (obj != null) {
                this.f16465b.m(obj);
            } else {
                this.f16464a = LocalCache.Z;
            }
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final int d() {
            return this.f16464a.d();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final Object e() {
            return Uninterruptibles.a(this.f16465b);
        }

        public final ListenableFuture g(Object obj, CacheLoader cacheLoader) {
            try {
                this.f16466c.b();
                Object obj2 = this.f16464a.get();
                if (obj2 == null) {
                    Object objA = cacheLoader.a(obj);
                    return this.f16465b.m(objA) ? this.f16465b : Futures.g(objA);
                }
                ListenableFuture listenableFutureB = cacheLoader.b(obj, obj2);
                return listenableFutureB == null ? Futures.g(null) : Futures.l(listenableFutureB, new Function() { // from class: com.google.common.cache.b
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj3) {
                        this.f16536a.f16465b.m(obj3);
                        return obj3;
                    }
                }, MoreExecutors.a());
            } catch (Throwable th2) {
                ListenableFuture listenableFutureF = this.f16465b.n(th2) ? this.f16465b : Futures.f(th2);
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return listenableFutureF;
            }
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final Object get() {
            return this.f16464a.get();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean isActive() {
            return this.f16464a.isActive();
        }

        public LoadingValueReference(ValueReference valueReference) {
            this.f16465b = SettableFuture.q();
            this.f16466c = new Stopwatch();
            this.f16464a = valueReference;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final ValueReference f(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class NullEntry implements ReferenceEntry<Object, Object> {
        private static final /* synthetic */ NullEntry[] $VALUES;
        public static final NullEntry INSTANCE;

        static {
            NullEntry nullEntry = new NullEntry("INSTANCE", 0);
            INSTANCE = nullEntry;
            $VALUES = new NullEntry[]{nullEntry};
        }

        public static NullEntry valueOf(String str) {
            return (NullEntry) Enum.valueOf(NullEntry.class, str);
        }

        public static NullEntry[] values() {
            return (NullEntry[]) $VALUES.clone();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final Object getKey() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final int i() {
            return 0;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final ReferenceEntry j() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final ValueReference k() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final long n() {
            return 0L;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final long q() {
            return 0L;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final ReferenceEntry l() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final ReferenceEntry p() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final ReferenceEntry s() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final ReferenceEntry z() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void m(ValueReference valueReference) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void o(long j11) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void r(long j11) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void t(ReferenceEntry referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void u(ReferenceEntry referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void v(ReferenceEntry referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public final void w(ReferenceEntry referenceEntry) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AccessQueue<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AnonymousClass1 f16451a;

        public AccessQueue() {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            anonymousClass1.f16452a = anonymousClass1;
            anonymousClass1.f16453b = anonymousClass1;
            this.f16451a = anonymousClass1;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            AnonymousClass1 anonymousClass1 = this.f16451a;
            ReferenceEntry referenceEntry = anonymousClass1.f16452a;
            while (referenceEntry != anonymousClass1) {
                ReferenceEntry referenceEntryS = referenceEntry.s();
                Logger logger = LocalCache.Y;
                NullEntry nullEntry = NullEntry.INSTANCE;
                referenceEntry.t(nullEntry);
                referenceEntry.w(nullEntry);
                referenceEntry = referenceEntryS;
            }
            anonymousClass1.f16452a = anonymousClass1;
            anonymousClass1.f16453b = anonymousClass1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return ((ReferenceEntry) obj).s() != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            AnonymousClass1 anonymousClass1 = this.f16451a;
            return anonymousClass1.f16452a == anonymousClass1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            AnonymousClass1 anonymousClass1 = this.f16451a;
            ReferenceEntry referenceEntry = anonymousClass1.f16452a;
            if (referenceEntry == anonymousClass1) {
                referenceEntry = null;
            }
            return new AbstractSequentialIterator<ReferenceEntry<Object, Object>>(referenceEntry) { // from class: com.google.common.cache.LocalCache.AccessQueue.2
                @Override // com.google.common.collect.AbstractSequentialIterator
                public final Object a(Object obj) {
                    ReferenceEntry referenceEntryS = ((ReferenceEntry) obj).s();
                    if (referenceEntryS == AccessQueue.this.f16451a) {
                        return null;
                    }
                    return referenceEntryS;
                }
            };
        }

        @Override // java.util.Queue
        public final boolean offer(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry referenceEntryL = referenceEntry.l();
            ReferenceEntry referenceEntryS = referenceEntry.s();
            Logger logger = LocalCache.Y;
            referenceEntryL.t(referenceEntryS);
            referenceEntryS.w(referenceEntryL);
            AnonymousClass1 anonymousClass1 = this.f16451a;
            ReferenceEntry referenceEntry2 = anonymousClass1.f16453b;
            referenceEntry2.t(referenceEntry);
            referenceEntry.w(referenceEntry2);
            referenceEntry.t(anonymousClass1);
            anonymousClass1.f16453b = referenceEntry;
            return true;
        }

        @Override // java.util.Queue
        public final Object peek() {
            AnonymousClass1 anonymousClass1 = this.f16451a;
            ReferenceEntry referenceEntry = anonymousClass1.f16452a;
            if (referenceEntry == anonymousClass1) {
                return null;
            }
            return referenceEntry;
        }

        @Override // java.util.Queue
        public final Object poll() {
            AnonymousClass1 anonymousClass1 = this.f16451a;
            ReferenceEntry referenceEntry = anonymousClass1.f16452a;
            if (referenceEntry == anonymousClass1) {
                return null;
            }
            remove(referenceEntry);
            return referenceEntry;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry referenceEntryL = referenceEntry.l();
            ReferenceEntry referenceEntryS = referenceEntry.s();
            Logger logger = LocalCache.Y;
            referenceEntryL.t(referenceEntryS);
            referenceEntryS.w(referenceEntryL);
            NullEntry nullEntry = NullEntry.INSTANCE;
            referenceEntry.t(nullEntry);
            referenceEntry.w(nullEntry);
            return referenceEntryS != nullEntry;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            AnonymousClass1 anonymousClass1 = this.f16451a;
            int i11 = 0;
            for (ReferenceEntry referenceEntryS = anonymousClass1.f16452a; referenceEntryS != anonymousClass1; referenceEntryS = referenceEntryS.s()) {
                i11++;
            }
            return i11;
        }

        /* JADX INFO: renamed from: com.google.common.cache.LocalCache$AccessQueue$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public class AnonymousClass1 extends AbstractReferenceEntry<K, V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public ReferenceEntry f16452a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public ReferenceEntry f16453b;

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final ReferenceEntry l() {
                return this.f16453b;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final long q() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final ReferenceEntry s() {
                return this.f16452a;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final void t(ReferenceEntry referenceEntry) {
                this.f16452a = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final void w(ReferenceEntry referenceEntry) {
                this.f16453b = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final void o(long j11) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class WriteQueue<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AnonymousClass1 f16515a;

        public WriteQueue() {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            anonymousClass1.f16516a = anonymousClass1;
            anonymousClass1.f16517b = anonymousClass1;
            this.f16515a = anonymousClass1;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            AnonymousClass1 anonymousClass1 = this.f16515a;
            ReferenceEntry referenceEntry = anonymousClass1.f16516a;
            while (referenceEntry != anonymousClass1) {
                ReferenceEntry referenceEntryP = referenceEntry.p();
                Logger logger = LocalCache.Y;
                NullEntry nullEntry = NullEntry.INSTANCE;
                referenceEntry.u(nullEntry);
                referenceEntry.v(nullEntry);
                referenceEntry = referenceEntryP;
            }
            anonymousClass1.f16516a = anonymousClass1;
            anonymousClass1.f16517b = anonymousClass1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return ((ReferenceEntry) obj).p() != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            AnonymousClass1 anonymousClass1 = this.f16515a;
            return anonymousClass1.f16516a == anonymousClass1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            AnonymousClass1 anonymousClass1 = this.f16515a;
            ReferenceEntry referenceEntry = anonymousClass1.f16516a;
            if (referenceEntry == anonymousClass1) {
                referenceEntry = null;
            }
            return new AbstractSequentialIterator<ReferenceEntry<Object, Object>>(referenceEntry) { // from class: com.google.common.cache.LocalCache.WriteQueue.2
                @Override // com.google.common.collect.AbstractSequentialIterator
                public final Object a(Object obj) {
                    ReferenceEntry referenceEntryP = ((ReferenceEntry) obj).p();
                    if (referenceEntryP == WriteQueue.this.f16515a) {
                        return null;
                    }
                    return referenceEntryP;
                }
            };
        }

        @Override // java.util.Queue
        public final boolean offer(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry referenceEntryZ = referenceEntry.z();
            ReferenceEntry referenceEntryP = referenceEntry.p();
            Logger logger = LocalCache.Y;
            referenceEntryZ.u(referenceEntryP);
            referenceEntryP.v(referenceEntryZ);
            AnonymousClass1 anonymousClass1 = this.f16515a;
            ReferenceEntry referenceEntry2 = anonymousClass1.f16517b;
            referenceEntry2.u(referenceEntry);
            referenceEntry.v(referenceEntry2);
            referenceEntry.u(anonymousClass1);
            anonymousClass1.f16517b = referenceEntry;
            return true;
        }

        @Override // java.util.Queue
        public final Object peek() {
            AnonymousClass1 anonymousClass1 = this.f16515a;
            ReferenceEntry referenceEntry = anonymousClass1.f16516a;
            if (referenceEntry == anonymousClass1) {
                return null;
            }
            return referenceEntry;
        }

        @Override // java.util.Queue
        public final Object poll() {
            AnonymousClass1 anonymousClass1 = this.f16515a;
            ReferenceEntry referenceEntry = anonymousClass1.f16516a;
            if (referenceEntry == anonymousClass1) {
                return null;
            }
            remove(referenceEntry);
            return referenceEntry;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry referenceEntryZ = referenceEntry.z();
            ReferenceEntry referenceEntryP = referenceEntry.p();
            Logger logger = LocalCache.Y;
            referenceEntryZ.u(referenceEntryP);
            referenceEntryP.v(referenceEntryZ);
            NullEntry nullEntry = NullEntry.INSTANCE;
            referenceEntry.u(nullEntry);
            referenceEntry.v(nullEntry);
            return referenceEntryP != nullEntry;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            AnonymousClass1 anonymousClass1 = this.f16515a;
            int i11 = 0;
            for (ReferenceEntry referenceEntryP = anonymousClass1.f16516a; referenceEntryP != anonymousClass1; referenceEntryP = referenceEntryP.p()) {
                i11++;
            }
            return i11;
        }

        /* JADX INFO: renamed from: com.google.common.cache.LocalCache$WriteQueue$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public class AnonymousClass1 extends AbstractReferenceEntry<K, V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public ReferenceEntry f16516a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public ReferenceEntry f16517b;

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final long n() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final ReferenceEntry p() {
                return this.f16516a;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final void u(ReferenceEntry referenceEntry) {
                this.f16516a = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final void v(ReferenceEntry referenceEntry) {
                this.f16517b = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final ReferenceEntry z() {
                return this.f16517b;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public final void r(long j11) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SoftValueReference<K, V> extends SoftReference<V> implements ValueReference<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReferenceEntry f16482a;

        public SoftValueReference(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            super(obj, referenceQueue);
            this.f16482a = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean a() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final ReferenceEntry b() {
            return this.f16482a;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int d() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final Object e() {
            return get();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference f(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return new SoftValueReference(referenceQueue, obj, referenceEntry);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final void c(Object obj) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class StrongValueReference<K, V> implements ValueReference<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f16493a;

        public StrongValueReference(Object obj) {
            this.f16493a = obj;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean a() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final ReferenceEntry b() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int d() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final Object e() {
            return this.f16493a;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final Object get() {
            return this.f16493a;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final void c(Object obj) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final ValueReference f(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class WeakValueReference<K, V> extends WeakReference<V> implements ValueReference<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReferenceEntry f16508a;

        public WeakValueReference(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            super(obj, referenceQueue);
            this.f16508a = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean a() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final ReferenceEntry b() {
            return this.f16508a;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int d() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final Object e() {
            return get();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference f(ReferenceQueue referenceQueue, Object obj, ReferenceEntry referenceEntry) {
            return new WeakValueReference(referenceQueue, obj, referenceEntry);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public final void c(Object obj) {
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        RemovalCause removalCause;
        boolean z11 = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int iD = d(obj);
        Segment segmentF = f(iD);
        segmentF.lock();
        try {
            segmentF.t(segmentF.f16475a.R.a());
            AtomicReferenceArray atomicReferenceArray = segmentF.f16480f;
            int length = iD & (atomicReferenceArray.length() - 1);
            ReferenceEntry referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
            for (ReferenceEntry referenceEntryJ = referenceEntry; referenceEntryJ != null; referenceEntryJ = referenceEntryJ.j()) {
                Object key = referenceEntryJ.getKey();
                if (referenceEntryJ.i() == iD && key != null && segmentF.f16475a.f16447e.d(obj, key)) {
                    ValueReference valueReferenceK = referenceEntryJ.k();
                    Object obj3 = valueReferenceK.get();
                    if (segmentF.f16475a.f16448f.d(obj2, obj3)) {
                        removalCause = RemovalCause.EXPLICIT;
                    } else {
                        if (obj3 != null || !valueReferenceK.isActive()) {
                            break;
                            break;
                        }
                        removalCause = RemovalCause.COLLECTED;
                    }
                    RemovalCause removalCause2 = removalCause;
                    segmentF.f16478d++;
                    ReferenceEntry referenceEntryS = segmentF.s(referenceEntry, referenceEntryJ, key, obj3, valueReferenceK, removalCause2);
                    int i11 = segmentF.f16476b - 1;
                    atomicReferenceArray.set(length, referenceEntryS);
                    segmentF.f16476b = i11;
                    if (removalCause2 != RemovalCause.EXPLICIT) {
                        break;
                    }
                    z11 = true;
                    break;
                }
            }
            return z11;
        } finally {
            segmentF.unlock();
            segmentF.u();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(Object obj, Object obj2, Object obj3) throws Throwable {
        Object obj4 = obj;
        obj4.getClass();
        obj3.getClass();
        if (obj2 == null) {
            return false;
        }
        int iD = d(obj);
        Segment segmentF = f(iD);
        segmentF.lock();
        try {
            long jA = segmentF.f16475a.R.a();
            segmentF.t(jA);
            AtomicReferenceArray atomicReferenceArray = segmentF.f16480f;
            int length = (atomicReferenceArray.length() - 1) & iD;
            ReferenceEntry referenceEntryJ = (ReferenceEntry) atomicReferenceArray.get(length);
            int i11 = length;
            while (referenceEntryJ != null) {
                int i12 = i11;
                Object key = referenceEntryJ.getKey();
                if (referenceEntryJ.i() == iD && key != null && segmentF.f16475a.f16447e.d(obj4, key)) {
                    ValueReference valueReferenceK = referenceEntryJ.k();
                    Object obj5 = valueReferenceK.get();
                    if (obj5 == null) {
                        if (!valueReferenceK.isActive()) {
                            break;
                        }
                        segmentF.f16478d++;
                        ReferenceEntry referenceEntryS = segmentF.s(referenceEntryJ, referenceEntryJ, key, obj5, valueReferenceK, RemovalCause.COLLECTED);
                        int i13 = segmentF.f16476b - 1;
                        atomicReferenceArray.set(i12, referenceEntryS);
                        segmentF.f16476b = i13;
                        break;
                    }
                    ReferenceEntry referenceEntry = referenceEntryJ;
                    if (segmentF.f16475a.f16448f.d(obj2, obj5)) {
                        segmentF.f16478d++;
                        segmentF.d(obj4, obj5, valueReferenceK.d(), RemovalCause.REPLACED);
                        try {
                            segmentF.w(referenceEntry, obj4, obj3, jA);
                            segmentF.e(referenceEntry);
                            segmentF.unlock();
                            segmentF.u();
                            return true;
                        } catch (Throwable th2) {
                            th = th2;
                            segmentF = segmentF;
                            segmentF.unlock();
                            segmentF.u();
                            throw th;
                        }
                    }
                    segmentF.n(referenceEntry, jA);
                    break;
                }
                referenceEntryJ = referenceEntryJ.j();
                i11 = i12;
                obj4 = obj;
            }
            segmentF.unlock();
            segmentF.u();
            return false;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
