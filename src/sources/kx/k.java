package kx;

import ex.u0;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class k extends uw.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f38911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f38912b;

    public k(ThreadFactory threadFactory) {
        boolean z11 = o.f38921a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (o.f38921a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            o.f38924d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.f38911a = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // uw.m
    public final ww.b a(Runnable runnable, TimeUnit timeUnit) {
        return this.f38912b ? zw.b.INSTANCE : c(runnable, timeUnit, null);
    }

    @Override // uw.m
    public final void b(u0 u0Var) {
        a(u0Var, null);
    }

    public final n c(Runnable runnable, TimeUnit timeUnit, ww.a aVar) {
        ScheduledExecutorService scheduledExecutorService = this.f38911a;
        n nVar = new n(runnable, aVar);
        if (aVar != null && !aVar.a(nVar)) {
            return nVar;
        }
        try {
            nVar.a(scheduledExecutorService.submit((Callable) nVar));
            return nVar;
        } catch (RejectedExecutionException e8) {
            if (aVar != null) {
                aVar.c(nVar);
            }
            qx.b.B(e8);
            return nVar;
        }
    }

    @Override // ww.b
    public final void dispose() {
        if (this.f38912b) {
            return;
        }
        this.f38912b = true;
        this.f38911a.shutdownNow();
    }
}
