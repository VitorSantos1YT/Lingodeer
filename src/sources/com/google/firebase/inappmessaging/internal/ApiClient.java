package com.google.firebase.inappmessaging.internal;

import android.app.Application;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inappmessaging.internal.time.Clock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ApiClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oy.a f19954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseApp f19955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Application f19956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Clock f19957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ProviderInstaller f19958e;

    public ApiClient(oy.a aVar, FirebaseApp firebaseApp, Application application, Clock clock, ProviderInstaller providerInstaller) {
        this.f19954a = aVar;
        this.f19955b = firebaseApp;
        this.f19956c = application;
        this.f19957d = clock;
        this.f19958e = providerInstaller;
    }
}
