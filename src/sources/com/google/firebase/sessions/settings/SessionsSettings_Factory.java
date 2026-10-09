package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SessionsSettings_Factory implements Factory<SessionsSettings> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f21097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f21098b;

    public SessionsSettings_Factory(Provider provider, Provider provider2) {
        this.f21097a = provider;
        this.f21098b = provider2;
    }

    @Override // oy.a
    public final Object get() {
        return new SessionsSettings((SettingsProvider) this.f21097a.get(), (SettingsProvider) this.f21098b.get());
    }
}
