package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.installations.FirebaseInstallationsApi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ApiClientModule_ProvidesFirebaseInstallationsFactory implements Factory<FirebaseInstallationsApi> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApiClientModule f20192a;

    public ApiClientModule_ProvidesFirebaseInstallationsFactory(ApiClientModule apiClientModule) {
        this.f20192a = apiClientModule;
    }

    @Override // oy.a
    public final Object get() {
        FirebaseInstallationsApi firebaseInstallationsApi = this.f20192a.f20182b;
        Preconditions.c(firebaseInstallationsApi);
        return firebaseInstallationsApi;
    }
}
