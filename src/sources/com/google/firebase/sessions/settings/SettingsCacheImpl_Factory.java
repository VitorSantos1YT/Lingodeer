package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.TimeProvider;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;
import n5.f;
import vy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SettingsCacheImpl_Factory implements Factory<SettingsCacheImpl> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f21113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f21114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f21115c;

    public SettingsCacheImpl_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.f21113a = provider;
        this.f21114b = provider2;
        this.f21115c = provider3;
    }

    @Override // oy.a
    public final Object get() {
        return new SettingsCacheImpl((i) this.f21113a.get(), (TimeProvider) this.f21114b.get(), (f) this.f21115c.get());
    }
}
