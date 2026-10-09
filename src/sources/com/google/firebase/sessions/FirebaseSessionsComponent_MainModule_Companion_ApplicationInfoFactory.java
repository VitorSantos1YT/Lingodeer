package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory implements Factory<ApplicationInfo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f20893a;

    public FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory(Provider provider) {
        this.f20893a = provider;
    }

    @Override // oy.a
    public final Object get() {
        FirebaseApp firebaseApp = (FirebaseApp) this.f20893a.get();
        FirebaseSessionsComponent.MainModule.f20891a.getClass();
        m.f(firebaseApp, "firebaseApp");
        SessionEvents.f20943a.getClass();
        return SessionEvents.a(firebaseApp);
    }
}
