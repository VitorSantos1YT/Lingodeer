package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SessionDataSerializer_Factory implements Factory<SessionDataSerializer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f20934a;

    public SessionDataSerializer_Factory(Provider provider) {
        this.f20934a = provider;
    }

    @Override // oy.a
    public final Object get() {
        return new SessionDataSerializer((SessionGenerator) this.f20934a.get());
    }
}
