package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SessionGenerator_Factory implements Factory<SessionGenerator> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f20969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f20970b;

    public SessionGenerator_Factory(Provider provider, Provider provider2) {
        this.f20969a = provider;
        this.f20970b = provider2;
    }

    @Override // oy.a
    public final Object get() {
        return new SessionGenerator((TimeProvider) this.f20969a.get(), (UuidGenerator) this.f20970b.get());
    }
}
