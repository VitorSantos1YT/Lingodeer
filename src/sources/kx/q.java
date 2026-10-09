package kx;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends uw.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f38928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ScheduledExecutorService f38929c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f38930a;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f38929c = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f38928b = new l("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public q() {
        AtomicReference atomicReference = new AtomicReference();
        this.f38930a = atomicReference;
        boolean z11 = o.f38921a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, f38928b);
        if (o.f38921a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            o.f38924d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        atomicReference.lazySet(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // uw.n
    public final uw.m a() {
        return new p((ScheduledExecutorService) this.f38930a.get());
    }

    @Override // uw.n
    public final ww.b c(Runnable runnable) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        AtomicReference atomicReference = this.f38930a;
        m mVar = new m(runnable);
        try {
            mVar.a(((ScheduledExecutorService) atomicReference.get()).submit(mVar));
            return mVar;
        } catch (RejectedExecutionException e8) {
            qx.b.B(e8);
            return zw.b.INSTANCE;
        }
    }
}
