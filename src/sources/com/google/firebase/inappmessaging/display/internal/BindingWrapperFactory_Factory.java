package com.google.firebase.inappmessaging.display.internal;

import android.app.Application;
import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import com.google.firebase.inappmessaging.display.dagger.internal.Provider;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class BindingWrapperFactory_Factory implements Factory<BindingWrapperFactory> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f19757a;

    public BindingWrapperFactory_Factory(Provider provider) {
        this.f19757a = provider;
    }

    @Override // oy.a
    public final Object get() {
        return new BindingWrapperFactory((Application) this.f19757a.get());
    }
}
