package com.google.common.cache;

import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.base.Ticker;
import defpackage.e;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class CacheBuilder<K, V> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Supplier f16425o = Suppliers.b(new AbstractCache.StatsCounter() { // from class: com.google.common.cache.CacheBuilder.1
        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void a() {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void b() {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void e() {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void c(long j11) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void d(long j11) {
        }
    });

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Ticker f16426p;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Weigher f16431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LocalCache.Strength f16432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LocalCache.Strength f16433g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Equivalence f16436j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Equivalence f16437k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RemovalListener f16438l;
    public Ticker m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16427a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16428b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16429c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16430d = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f16434h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f16435i = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Supplier f16439n = f16425o;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class LoggerHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Logger f16440a = Logger.getLogger(CacheBuilder.class.getName());

        private LoggerHolder() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class NullListener implements RemovalListener<Object, Object> {
        private static final /* synthetic */ NullListener[] $VALUES;
        public static final NullListener INSTANCE;

        static {
            NullListener nullListener = new NullListener("INSTANCE", 0);
            INSTANCE = nullListener;
            $VALUES = new NullListener[]{nullListener};
        }

        public static NullListener valueOf(String str) {
            return (NullListener) Enum.valueOf(NullListener.class, str);
        }

        public static NullListener[] values() {
            return (NullListener[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class OneWeigher implements Weigher<Object, Object> {
        private static final /* synthetic */ OneWeigher[] $VALUES;
        public static final OneWeigher INSTANCE;

        static {
            OneWeigher oneWeigher = new OneWeigher("INSTANCE", 0);
            INSTANCE = oneWeigher;
            $VALUES = new OneWeigher[]{oneWeigher};
        }

        public static OneWeigher valueOf(String str) {
            return (OneWeigher) Enum.valueOf(OneWeigher.class, str);
        }

        public static OneWeigher[] values() {
            return (OneWeigher[]) $VALUES.clone();
        }
    }

    static {
        new Supplier<AbstractCache.StatsCounter>() { // from class: com.google.common.cache.CacheBuilder.2
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new AbstractCache.SimpleStatsCounter();
            }
        };
        f16426p = new Ticker() { // from class: com.google.common.cache.CacheBuilder.3
            @Override // com.google.common.base.Ticker
            public final long a() {
                return 0L;
            }
        };
    }

    private CacheBuilder() {
    }

    public static CacheBuilder c() {
        return new CacheBuilder();
    }

    public final LoadingCache a(CacheLoader cacheLoader) {
        b();
        cacheLoader.getClass();
        return new LocalCache.LocalLoadingCache(new LocalCache(this, cacheLoader));
    }

    public final void b() {
        if (this.f16431e == null) {
            Preconditions.p("maximumWeight requires weigher", this.f16430d == -1);
        } else if (this.f16427a) {
            Preconditions.p("weigher requires maximumWeight", this.f16430d != -1);
        } else if (this.f16430d == -1) {
            LoggerHolder.f16440a.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    public final void d() {
        LocalCache.Strength strength = LocalCache.Strength.WEAK;
        LocalCache.Strength strength2 = this.f16432f;
        Preconditions.q("Key strength was already set to %s", strength2 == null, strength2);
        strength.getClass();
        this.f16432f = strength;
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        int i11 = this.f16428b;
        if (i11 != -1) {
            toStringHelperB.a(i11, "concurrencyLevel");
        }
        long j11 = this.f16429c;
        if (j11 != -1) {
            toStringHelperB.b(j11, "maximumSize");
        }
        long j12 = this.f16430d;
        if (j12 != -1) {
            toStringHelperB.b(j12, "maximumWeight");
        }
        if (this.f16434h != -1) {
            toStringHelperB.c(e.i(this.f16434h, "ns", new StringBuilder()), "expireAfterWrite");
        }
        if (this.f16435i != -1) {
            toStringHelperB.c(e.i(this.f16435i, "ns", new StringBuilder()), "expireAfterAccess");
        }
        LocalCache.Strength strength = this.f16432f;
        if (strength != null) {
            toStringHelperB.c(Ascii.c(strength.toString()), "keyStrength");
        }
        LocalCache.Strength strength2 = this.f16433g;
        if (strength2 != null) {
            toStringHelperB.c(Ascii.c(strength2.toString()), "valueStrength");
        }
        if (this.f16436j != null) {
            toStringHelperB.f("keyEquivalence");
        }
        if (this.f16437k != null) {
            toStringHelperB.f("valueEquivalence");
        }
        if (this.f16438l != null) {
            toStringHelperB.f("removalListener");
        }
        return toStringHelperB.toString();
    }
}
