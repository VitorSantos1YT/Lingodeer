package com.google.android.datatransport.runtime.scheduling;

import cf.i;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class DefaultScheduler implements Scheduler {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f8101f = Logger.getLogger(TransportRuntime.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkScheduler f8102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f8103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BackendRegistry f8104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EventStore f8105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SynchronizationGuard f8106e;

    public DefaultScheduler(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        this.f8103b = executor;
        this.f8104c = backendRegistry;
        this.f8102a = workScheduler;
        this.f8105d = eventStore;
        this.f8106e = synchronizationGuard;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.Scheduler
    public final void a(TransportContext transportContext, EventInternal eventInternal, TransportScheduleCallback transportScheduleCallback) {
        this.f8103b.execute(new i(this, transportContext, transportScheduleCallback, eventInternal, 4));
    }
}
