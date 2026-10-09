package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;
import com.google.firebase.sessions.settings.SessionsSettings;
import vy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SessionFirelogPublisherImpl_Factory implements Factory<SessionFirelogPublisherImpl> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f20962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f20963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f20964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider f20965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider f20966e;

    public SessionFirelogPublisherImpl_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f20962a = provider;
        this.f20963b = provider2;
        this.f20964c = provider3;
        this.f20965d = provider4;
        this.f20966e = provider5;
    }

    @Override // oy.a
    public final Object get() {
        return new SessionFirelogPublisherImpl((FirebaseApp) this.f20962a.get(), (FirebaseInstallationsApi) this.f20963b.get(), (SessionsSettings) this.f20964c.get(), (EventGDTLoggerInterface) this.f20965d.get(), (i) this.f20966e.get());
    }
}
