package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class Uploader_Factory implements Factory<Uploader> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oy.a f8141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oy.a f8142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oy.a f8143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SchedulingModule_WorkSchedulerFactory f8144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final oy.a f8145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final oy.a f8146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final oy.a f8147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final oy.a f8148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final oy.a f8149i;

    public Uploader_Factory(oy.a aVar, oy.a aVar2, oy.a aVar3, SchedulingModule_WorkSchedulerFactory schedulingModule_WorkSchedulerFactory, oy.a aVar4, oy.a aVar5, TimeModule_EventClockFactory timeModule_EventClockFactory, TimeModule_UptimeClockFactory timeModule_UptimeClockFactory, oy.a aVar6) {
        this.f8141a = aVar;
        this.f8142b = aVar2;
        this.f8143c = aVar3;
        this.f8144d = schedulingModule_WorkSchedulerFactory;
        this.f8145e = aVar4;
        this.f8146f = aVar5;
        this.f8147g = timeModule_EventClockFactory;
        this.f8148h = timeModule_UptimeClockFactory;
        this.f8149i = aVar6;
    }

    @Override // oy.a
    public final Object get() {
        return new Uploader((Context) this.f8141a.get(), (BackendRegistry) this.f8142b.get(), (EventStore) this.f8143c.get(), (WorkScheduler) this.f8144d.get(), (Executor) this.f8145e.get(), (SynchronizationGuard) this.f8146f.get(), (Clock) this.f8147g.get(), (Clock) this.f8148h.get(), (ClientHealthMetricsStore) this.f8149i.get());
    }
}
