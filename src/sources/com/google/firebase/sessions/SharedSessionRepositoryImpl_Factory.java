package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;
import com.google.firebase.sessions.settings.SessionsSettings;
import n5.f;
import vy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SharedSessionRepositoryImpl_Factory implements Factory<SharedSessionRepositoryImpl> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f21015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f21016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f21017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider f21018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider f21019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider f21020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Provider f21021g;

    public SharedSessionRepositoryImpl_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f21015a = provider;
        this.f21016b = provider2;
        this.f21017c = provider3;
        this.f21018d = provider4;
        this.f21019e = provider5;
        this.f21020f = provider6;
        this.f21021g = provider7;
    }

    @Override // oy.a
    public final Object get() {
        return new SharedSessionRepositoryImpl((SessionsSettings) this.f21015a.get(), (SessionGenerator) this.f21016b.get(), (SessionFirelogPublisher) this.f21017c.get(), (TimeProvider) this.f21018d.get(), (f) this.f21019e.get(), (ProcessDataManager) this.f21020f.get(), (i) this.f21021g.get());
    }
}
