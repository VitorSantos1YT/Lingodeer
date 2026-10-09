package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import oy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class TransportRuntime_Factory implements Factory<TransportRuntime> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f8037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f8038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f8039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f8040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f8041e;

    public TransportRuntime_Factory(TimeModule_EventClockFactory timeModule_EventClockFactory, TimeModule_UptimeClockFactory timeModule_UptimeClockFactory, a aVar, a aVar2, a aVar3) {
        this.f8037a = timeModule_EventClockFactory;
        this.f8038b = timeModule_UptimeClockFactory;
        this.f8039c = aVar;
        this.f8040d = aVar2;
        this.f8041e = aVar3;
    }

    @Override // oy.a
    public final Object get() {
        return new TransportRuntime((Clock) this.f8037a.get(), (Clock) this.f8038b.get(), (Scheduler) this.f8039c.get(), (Uploader) this.f8040d.get(), (WorkInitializer) this.f8041e.get());
    }
}
