package com.google.firebase.sessions.settings;

import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.TimeProvider;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class RemoteSettings_Factory implements Factory<RemoteSettings> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f21079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f21080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f21081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider f21082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider f21083e;

    public RemoteSettings_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f21079a = provider;
        this.f21080b = provider2;
        this.f21081c = provider3;
        this.f21082d = provider4;
        this.f21083e = provider5;
    }

    @Override // oy.a
    public final Object get() {
        return new RemoteSettings((TimeProvider) this.f21079a.get(), (FirebaseInstallationsApi) this.f21080b.get(), (ApplicationInfo) this.f21081c.get(), (CrashlyticsSettingsFetcher) this.f21082d.get(), (SettingsCache) this.f21083e.get());
    }
}
