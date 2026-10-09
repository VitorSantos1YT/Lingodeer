package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SessionsActivityLifecycleCallbacks_Factory implements Factory<SessionsActivityLifecycleCallbacks> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f20979a;

    public SessionsActivityLifecycleCallbacks_Factory(Provider provider) {
        this.f20979a = provider;
    }

    @Override // oy.a
    public final Object get() {
        return new SessionsActivityLifecycleCallbacks((SharedSessionRepository) this.f20979a.get());
    }
}
