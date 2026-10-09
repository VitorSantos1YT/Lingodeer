package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.internal.SharedPreferencesUtils;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ApiClientModule_ProvidesSharedPreferencesUtilsFactory implements Factory<SharedPreferencesUtils> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApiClientModule f20193a;

    public ApiClientModule_ProvidesSharedPreferencesUtilsFactory(ApiClientModule apiClientModule) {
        this.f20193a = apiClientModule;
    }

    @Override // oy.a
    public final Object get() {
        return new SharedPreferencesUtils(this.f20193a.f20181a);
    }
}
