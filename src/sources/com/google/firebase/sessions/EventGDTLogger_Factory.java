package com.google.firebase.sessions;

import com.google.firebase.inject.Provider;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.InstanceFactory;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class EventGDTLogger_Factory implements Factory<EventGDTLogger> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstanceFactory f20885a;

    public EventGDTLogger_Factory(InstanceFactory instanceFactory) {
        this.f20885a = instanceFactory;
    }

    @Override // oy.a
    public final Object get() {
        return new EventGDTLogger((Provider) this.f20885a.f21050a);
    }
}
