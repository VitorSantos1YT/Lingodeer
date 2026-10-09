package com.google.firebase.sessions.settings;

import android.content.Context;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.InstanceFactory;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class LocalOverrideSettings_Factory implements Factory<LocalOverrideSettings> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstanceFactory f21052a;

    public LocalOverrideSettings_Factory(InstanceFactory instanceFactory) {
        this.f21052a = instanceFactory;
    }

    @Override // oy.a
    public final Object get() {
        return new LocalOverrideSettings((Context) this.f21052a.f21050a);
    }
}
