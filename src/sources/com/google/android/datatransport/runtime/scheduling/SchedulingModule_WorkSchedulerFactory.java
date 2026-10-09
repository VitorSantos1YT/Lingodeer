package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoScheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import oy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class SchedulingModule_WorkSchedulerFactory implements Factory<WorkScheduler> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f8113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f8114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SchedulingConfigModule_ConfigFactory f8115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f8116d;

    public SchedulingModule_WorkSchedulerFactory(a aVar, a aVar2, SchedulingConfigModule_ConfigFactory schedulingConfigModule_ConfigFactory, TimeModule_UptimeClockFactory timeModule_UptimeClockFactory) {
        this.f8113a = aVar;
        this.f8114b = aVar2;
        this.f8115c = schedulingConfigModule_ConfigFactory;
        this.f8116d = timeModule_UptimeClockFactory;
    }

    @Override // oy.a
    public final Object get() {
        Context context = (Context) this.f8113a.get();
        EventStore eventStore = (EventStore) this.f8114b.get();
        SchedulerConfig schedulerConfig = (SchedulerConfig) this.f8115c.get();
        return new JobInfoScheduler(context, eventStore, schedulerConfig);
    }
}
