package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class WorkInitializer_Factory implements Factory<WorkInitializer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oy.a f8154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oy.a f8155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oy.a f8156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oy.a f8157d;

    public WorkInitializer_Factory(oy.a aVar, oy.a aVar2, oy.a aVar3, oy.a aVar4) {
        this.f8154a = aVar;
        this.f8155b = aVar2;
        this.f8156c = aVar3;
        this.f8157d = aVar4;
    }

    @Override // oy.a
    public final Object get() {
        return new WorkInitializer((Executor) this.f8154a.get(), (EventStore) this.f8155b.get(), (WorkScheduler) this.f8156c.get(), (SynchronizationGuard) this.f8157d.get());
    }
}
