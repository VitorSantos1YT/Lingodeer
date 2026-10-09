package com.google.common.cache;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractCache<K, V> implements Cache<K, V> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SimpleStatsCounter implements StatsCounter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LongAddable f16419a = LongAddables.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LongAddable f16420b = LongAddables.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LongAddable f16421c = LongAddables.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final LongAddable f16422d = LongAddables.a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final LongAddable f16423e = LongAddables.a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final LongAddable f16424f = LongAddables.a();

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void a() {
            this.f16424f.a();
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void b() {
            this.f16420b.add(1);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void c(long j11) {
            this.f16422d.a();
            this.f16423e.add(j11);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void d(long j11) {
            this.f16421c.a();
            this.f16423e.add(j11);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public final void e() {
            this.f16419a.add(1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface StatsCounter {
        void a();

        void b();

        void c(long j11);

        void d(long j11);

        void e();
    }
}
