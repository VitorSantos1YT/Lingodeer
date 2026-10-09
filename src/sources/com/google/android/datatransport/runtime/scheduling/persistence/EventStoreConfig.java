package com.google.android.datatransport.runtime.scheduling.persistence;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
abstract class EventStoreConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AutoValue_EventStoreConfig f8191a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class Builder {
    }

    static {
        AutoValue_EventStoreConfig.Builder builder = new AutoValue_EventStoreConfig.Builder();
        builder.f8183a = 10485760L;
        builder.f8184b = 200;
        builder.f8185c = 10000;
        builder.f8186d = 604800000L;
        builder.f8187e = 81920;
        String strM = builder.f8183a == null ? " maxStorageSizeInBytes" : BuildConfig.VERSION_NAME;
        if (builder.f8184b == null) {
            strM = strM.concat(" loadBatchSize");
        }
        if (builder.f8185c == null) {
            strM = defpackage.e.m(strM, " criticalSectionEnterTimeoutMs");
        }
        if (builder.f8186d == null) {
            strM = defpackage.e.m(strM, " eventCleanUpAge");
        }
        if (builder.f8187e == null) {
            strM = defpackage.e.m(strM, " maxBlobByteSizePerRow");
        }
        if (!strM.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strM));
        }
        f8191a = new AutoValue_EventStoreConfig(builder.f8184b.intValue(), builder.f8185c.intValue(), builder.f8183a.longValue(), builder.f8186d.longValue(), builder.f8187e.intValue());
    }

    public abstract int a();

    public abstract long b();

    public abstract int c();

    public abstract int d();

    public abstract long e();
}
