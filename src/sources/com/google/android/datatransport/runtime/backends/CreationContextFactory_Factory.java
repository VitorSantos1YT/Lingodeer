package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import oy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class CreationContextFactory_Factory implements Factory<CreationContextFactory> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstanceFactory f8055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f8056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f8057c;

    public CreationContextFactory_Factory(InstanceFactory instanceFactory, TimeModule_EventClockFactory timeModule_EventClockFactory, TimeModule_UptimeClockFactory timeModule_UptimeClockFactory) {
        this.f8055a = instanceFactory;
        this.f8056b = timeModule_EventClockFactory;
        this.f8057c = timeModule_UptimeClockFactory;
    }

    @Override // oy.a
    public final Object get() {
        return new CreationContextFactory((Context) this.f8055a.f8068a, (Clock) this.f8056b.get(), (Clock) this.f8057c.get());
    }
}
