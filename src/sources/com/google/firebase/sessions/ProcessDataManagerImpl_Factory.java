package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProcessDataManagerImpl_Factory implements Factory<ProcessDataManagerImpl> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f20921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f20922b;

    public ProcessDataManagerImpl_Factory(Provider provider, Provider provider2) {
        this.f20921a = provider;
        this.f20922b = provider2;
    }

    @Override // oy.a
    public final Object get() {
        return new ProcessDataManagerImpl((Context) this.f20921a.get(), (UuidGenerator) this.f20922b.get());
    }
}
