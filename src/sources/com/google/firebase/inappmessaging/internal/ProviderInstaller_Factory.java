package com.google.firebase.inappmessaging.internal;

import android.app.Application;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Provider;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProviderInstaller_Factory implements Factory<ProviderInstaller> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f20054a;

    public ProviderInstaller_Factory(Provider provider) {
        this.f20054a = provider;
    }

    @Override // oy.a
    public final Object get() {
        return new ProviderInstaller((Application) this.f20054a.get());
    }
}
