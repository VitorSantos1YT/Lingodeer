package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class WorkInitializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f8150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EventStore f8151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkScheduler f8152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SynchronizationGuard f8153d;

    public WorkInitializer(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        this.f8150a = executor;
        this.f8151b = eventStore;
        this.f8152c = workScheduler;
        this.f8153d = synchronizationGuard;
    }
}
