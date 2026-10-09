package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.FirebaseApp;
import com.google.firebase.inappmessaging.dagger.Module;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Module
public class GrpcClientModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseApp f20215a;

    public GrpcClientModule(FirebaseApp firebaseApp) {
        this.f20215a = firebaseApp;
    }
}
