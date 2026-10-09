package com.google.firebase.crashlytics.internal.settings;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Settings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SessionData f18915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FeatureFlagData f18916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f18918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f18919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18920f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class FeatureFlagData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f18921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f18922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f18923c;

        public FeatureFlagData(boolean z11, boolean z12, boolean z13) {
            this.f18921a = z11;
            this.f18922b = z12;
            this.f18923c = z13;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SessionData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18924a;

        public SessionData(int i11) {
            this.f18924a = i11;
        }
    }

    public Settings(long j11, SessionData sessionData, FeatureFlagData featureFlagData, double d5, double d11, int i11) {
        this.f18917c = j11;
        this.f18915a = sessionData;
        this.f18916b = featureFlagData;
        this.f18918d = d5;
        this.f18919e = d11;
        this.f18920f = i11;
    }
}
