package dy;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends qx.o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f24587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f24588e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f24591h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f24592i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g f24593j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f24594c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final TimeUnit f24590g = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f24589f = Long.getLong("rx3.io-keep-alive-time", 60).longValue();

    static {
        i iVar = new i(new n("RxCachedThreadSchedulerShutdown"));
        f24591h = iVar;
        iVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
        n nVar = new n("RxCachedThreadScheduler", iMax, false);
        f24587d = nVar;
        f24588e = new n("RxCachedWorkerPoolEvictor", iMax, false);
        f24592i = Boolean.getBoolean("rx3.io-scheduled-release");
        g gVar = new g(0L, null, nVar);
        f24593j = gVar;
        gVar.f24578c.dispose();
        ScheduledFuture scheduledFuture = gVar.f24580e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = gVar.f24579d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public j() {
        g gVar = f24593j;
        AtomicReference atomicReference = new AtomicReference(gVar);
        this.f24594c = atomicReference;
        g gVar2 = new g(f24589f, f24590g, f24587d);
        while (!atomicReference.compareAndSet(gVar, gVar2)) {
            if (atomicReference.get() != gVar) {
                gVar2.f24578c.dispose();
                ScheduledFuture scheduledFuture = gVar2.f24580e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = gVar2.f24579d;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    return;
                }
                return;
            }
        }
    }

    @Override // qx.o
    public final qx.n a() {
        return new h((g) this.f24594c.get());
    }
}
