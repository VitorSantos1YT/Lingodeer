package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import oy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultScheduler_Factory implements Factory<DefaultScheduler> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f8107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f8108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SchedulingModule_WorkSchedulerFactory f8109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f8110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f8111e;

    public DefaultScheduler_Factory(a aVar, a aVar2, SchedulingModule_WorkSchedulerFactory schedulingModule_WorkSchedulerFactory, a aVar3, a aVar4) {
        this.f8107a = aVar;
        this.f8108b = aVar2;
        this.f8109c = schedulingModule_WorkSchedulerFactory;
        this.f8110d = aVar3;
        this.f8111e = aVar4;
    }

    @Override // oy.a
    public final Object get() {
        return new DefaultScheduler((Executor) this.f8107a.get(), (BackendRegistry) this.f8108b.get(), (WorkScheduler) this.f8109c.get(), (EventStore) this.f8110d.get(), (SynchronizationGuard) this.f8111e.get());
    }
}
