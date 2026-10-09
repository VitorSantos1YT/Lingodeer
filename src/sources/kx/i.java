package kx;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends uw.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f38901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f38902c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f38905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f38906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f38907h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f38908a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TimeUnit f38904e = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f38903d = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static {
        h hVar = new h(new l("RxCachedThreadSchedulerShutdown"));
        f38905f = hVar;
        hVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        l lVar = new l("RxCachedThreadScheduler", iMax, false);
        f38901b = lVar;
        f38902c = new l("RxCachedWorkerPoolEvictor", iMax, false);
        f38906g = Boolean.getBoolean("rx2.io-scheduled-release");
        f fVar = new f(0L, null, lVar);
        f38907h = fVar;
        fVar.f38892c.dispose();
        ScheduledFuture scheduledFuture = fVar.f38894e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = fVar.f38893d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public i() {
        f fVar = f38907h;
        AtomicReference atomicReference = new AtomicReference(fVar);
        this.f38908a = atomicReference;
        f fVar2 = new f(f38903d, f38904e, f38901b);
        while (!atomicReference.compareAndSet(fVar, fVar2)) {
            if (atomicReference.get() != fVar) {
                fVar2.f38892c.dispose();
                ScheduledFuture scheduledFuture = fVar2.f38894e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = fVar2.f38893d;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    return;
                }
                return;
            }
        }
    }

    @Override // uw.n
    public final uw.m a() {
        return new g((f) this.f38908a.get());
    }
}
