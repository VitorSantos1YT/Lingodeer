package kx;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f38891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ww.a f38892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f38893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScheduledFuture f38894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ThreadFactory f38895f;

    public f(long j11, TimeUnit timeUnit, ThreadFactory threadFactory) {
        f fVar;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        long nanos = timeUnit != null ? timeUnit.toNanos(j11) : 0L;
        this.f38890a = nanos;
        this.f38891b = new ConcurrentLinkedQueue();
        this.f38892c = new ww.a(0);
        this.f38895f = threadFactory;
        if (timeUnit != null) {
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, i.f38902c);
            fVar = this;
            scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(fVar, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            fVar = this;
            scheduledExecutorServiceNewScheduledThreadPool = null;
            scheduledFutureScheduleWithFixedDelay = null;
        }
        fVar.f38893d = scheduledExecutorServiceNewScheduledThreadPool;
        fVar.f38894e = scheduledFutureScheduleWithFixedDelay;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue<h> concurrentLinkedQueue = this.f38891b;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        for (h hVar : concurrentLinkedQueue) {
            if (hVar.f38900c > jNanoTime) {
                return;
            }
            if (concurrentLinkedQueue.remove(hVar)) {
                this.f38892c.c(hVar);
            }
        }
    }
}
