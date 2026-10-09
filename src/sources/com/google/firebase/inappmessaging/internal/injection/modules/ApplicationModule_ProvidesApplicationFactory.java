package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ApplicationModule_ProvidesApplicationFactory implements Factory<Application> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApplicationModule f20203a;

    public ApplicationModule_ProvidesApplicationFactory(ApplicationModule applicationModule) {
        this.f20203a = applicationModule;
    }

    @Override // oy.a
    public final Object get() {
        Application application = this.f20203a.f20200a;
        Preconditions.c(application);
        return application;
    }
}
