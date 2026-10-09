package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.internal.SharedPreferencesUtils;
import com.google.firebase.inappmessaging.internal.TestDeviceHelper;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ApiClientModule_ProvidesTestDeviceHelperFactory implements Factory<TestDeviceHelper> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApiClientModule f20194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApiClientModule_ProvidesSharedPreferencesUtilsFactory f20195b;

    public ApiClientModule_ProvidesTestDeviceHelperFactory(ApiClientModule apiClientModule, ApiClientModule_ProvidesSharedPreferencesUtilsFactory apiClientModule_ProvidesSharedPreferencesUtilsFactory) {
        this.f20194a = apiClientModule;
        this.f20195b = apiClientModule_ProvidesSharedPreferencesUtilsFactory;
    }

    @Override // oy.a
    public final Object get() {
        SharedPreferencesUtils sharedPreferencesUtils = (SharedPreferencesUtils) this.f20195b.get();
        this.f20194a.getClass();
        return new TestDeviceHelper(sharedPreferencesUtils);
    }
}
