package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Provider;
import com.google.firebase.inappmessaging.internal.DeveloperListenerManager;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ApplicationModule_DeveloperListenerManagerFactory implements Factory<DeveloperListenerManager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApplicationModule f20201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f20202b;

    public ApplicationModule_DeveloperListenerManagerFactory(ApplicationModule applicationModule, Provider provider) {
        this.f20201a = applicationModule;
        this.f20202b = provider;
    }

    @Override // oy.a
    public final Object get() {
        Executor executor = (Executor) this.f20202b.get();
        this.f20201a.getClass();
        return new DeveloperListenerManager(executor);
    }
}
