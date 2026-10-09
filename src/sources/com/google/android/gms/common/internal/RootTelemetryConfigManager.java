package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RootTelemetryConfigManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static RootTelemetryConfigManager f8945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final RootTelemetryConfiguration f8946c = new RootTelemetryConfiguration(0, 0, 0, false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RootTelemetryConfiguration f8947a;

    private RootTelemetryConfigManager() {
    }

    public static synchronized RootTelemetryConfigManager a() {
        try {
            if (f8945b == null) {
                f8945b = new RootTelemetryConfigManager();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f8945b;
    }
}
