package dy;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f24577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rx.a f24578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f24579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScheduledFuture f24580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ThreadFactory f24581f;

    public g(long j11, TimeUnit timeUnit, ThreadFactory threadFactory) {
        g gVar;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        long nanos = timeUnit != null ? timeUnit.toNanos(j11) : 0L;
        this.f24576a = nanos;
        this.f24577b = new ConcurrentLinkedQueue();
        this.f24578c = new rx.a(0);
        this.f24581f = threadFactory;
        if (timeUnit != null) {
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, j.f24588e);
            gVar = this;
            scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(gVar, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            gVar = this;
            scheduledExecutorServiceNewScheduledThreadPool = null;
            scheduledFutureScheduleWithFixedDelay = null;
        }
        gVar.f24579d = scheduledExecutorServiceNewScheduledThreadPool;
        gVar.f24580e = scheduledFutureScheduleWithFixedDelay;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue<i> concurrentLinkedQueue = this.f24577b;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        for (i iVar : concurrentLinkedQueue) {
            if (iVar.f24586c > jNanoTime) {
                return;
            }
            if (concurrentLinkedQueue.remove(iVar)) {
                this.f24578c.d(iVar);
            }
        }
    }
}
