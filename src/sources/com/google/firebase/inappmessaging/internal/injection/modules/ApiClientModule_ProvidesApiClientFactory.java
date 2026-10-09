package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Provider;
import com.google.firebase.inappmessaging.internal.ApiClient;
import com.google.firebase.inappmessaging.internal.ProviderInstaller;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ApiClientModule_ProvidesApiClientFactory implements Factory<ApiClient> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApiClientModule f20184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f20185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f20186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider f20187d;

    public ApiClientModule_ProvidesApiClientFactory(ApiClientModule apiClientModule, Provider provider, Provider provider2, Provider provider3) {
        this.f20184a = apiClientModule;
        this.f20185b = provider;
        this.f20186c = provider2;
        this.f20187d = provider3;
    }

    @Override // oy.a
    public final Object get() {
        Application application = (Application) this.f20186c.get();
        ProviderInstaller providerInstaller = (ProviderInstaller) this.f20187d.get();
        ApiClientModule apiClientModule = this.f20184a;
        return new ApiClient(this.f20185b, apiClientModule.f20181a, application, apiClientModule.f20183c, providerInstaller);
    }
}
