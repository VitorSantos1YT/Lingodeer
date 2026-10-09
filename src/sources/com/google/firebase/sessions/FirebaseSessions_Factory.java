package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;
import com.google.firebase.sessions.settings.SessionsSettings;
import vy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseSessions_Factory implements Factory<FirebaseSessions> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f20901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f20902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f20903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider f20904d;

    public FirebaseSessions_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f20901a = provider;
        this.f20902b = provider2;
        this.f20903c = provider3;
        this.f20904d = provider4;
    }

    @Override // oy.a
    public final Object get() {
        return new FirebaseSessions((FirebaseApp) this.f20901a.get(), (SessionsSettings) this.f20902b.get(), (i) this.f20903c.get(), (SessionsActivityLifecycleCallbacks) this.f20904d.get());
    }
}
