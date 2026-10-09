package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.FirebaseApp;
import com.google.firebase.inappmessaging.dagger.Module;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.installations.FirebaseInstallationsApi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Module
public class ApiClientModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseApp f20181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseInstallationsApi f20182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clock f20183c;

    public ApiClientModule(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, Clock clock) {
        this.f20181a = firebaseApp;
        this.f20182b = firebaseInstallationsApi;
        this.f20183c = clock;
    }
}
