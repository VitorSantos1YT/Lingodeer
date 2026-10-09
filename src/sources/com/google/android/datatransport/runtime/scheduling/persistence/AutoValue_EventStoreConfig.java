package com.google.android.datatransport.runtime.scheduling.persistence;

import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_EventStoreConfig extends EventStoreConfig {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8182f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends EventStoreConfig.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f8183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f8184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f8185c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f8186d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f8187e;
    }

    public AutoValue_EventStoreConfig(int i11, int i12, long j11, long j12, int i13) {
        this.f8178b = j11;
        this.f8179c = i11;
        this.f8180d = i12;
        this.f8181e = j12;
        this.f8182f = i13;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public final int a() {
        return this.f8180d;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public final long b() {
        return this.f8181e;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public final int c() {
        return this.f8179c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public final int d() {
        return this.f8182f;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public final long e() {
        return this.f8178b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventStoreConfig)) {
            return false;
        }
        EventStoreConfig eventStoreConfig = (EventStoreConfig) obj;
        return this.f8178b == eventStoreConfig.e() && this.f8179c == eventStoreConfig.c() && this.f8180d == eventStoreConfig.a() && this.f8181e == eventStoreConfig.b() && this.f8182f == eventStoreConfig.d();
    }

    public final int hashCode() {
        long j11 = this.f8178b;
        int i11 = (((((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ this.f8179c) * 1000003) ^ this.f8180d) * 1000003;
        long j12 = this.f8181e;
        return ((i11 ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003) ^ this.f8182f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f8178b);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f8179c);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f8180d);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f8181e);
        sb2.append(", maxBlobByteSizePerRow=");
        return p0.i(this.f8182f, "}", sb2);
    }
}
