package com.google.android.datatransport.runtime.firebase.transport;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class GlobalMetrics {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8078b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StorageMetrics f8079a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public StorageMetrics f8080a = null;
    }

    static {
        new Builder();
    }

    public GlobalMetrics(StorageMetrics storageMetrics) {
        this.f8079a = storageMetrics;
    }
}
