package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.InstanceFactory;
import com.google.firebase.sessions.dagger.internal.Provider;
import vy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class RemoteSettingsFetcher_Factory implements Factory<RemoteSettingsFetcher> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f21077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InstanceFactory f21078b;

    public RemoteSettingsFetcher_Factory(Provider provider, InstanceFactory instanceFactory) {
        this.f21077a = provider;
        this.f21078b = instanceFactory;
    }

    @Override // oy.a
    public final Object get() {
        return new RemoteSettingsFetcher((ApplicationInfo) this.f21077a.get(), (i) this.f21078b.f21050a);
    }
}
