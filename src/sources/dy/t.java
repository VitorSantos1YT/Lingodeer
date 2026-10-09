package dy;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends qx.o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f24613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ScheduledExecutorService f24614e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f24615c;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f24614e = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f24613d = new n("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.single-priority", 5).intValue())), true);
    }

    public t() {
        AtomicReference atomicReference = new AtomicReference();
        this.f24615c = atomicReference;
        boolean z11 = r.f24609a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, f24613d);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(r.f24609a);
        atomicReference.lazySet(scheduledThreadPoolExecutor);
    }

    @Override // qx.o
    public final qx.n a() {
        return new s((ScheduledExecutorService) this.f24615c.get());
    }

    @Override // qx.o
    public final rx.b c(Runnable runnable, long j11, TimeUnit timeUnit) {
        p pVar = new p(runnable);
        AtomicReference atomicReference = this.f24615c;
        try {
            pVar.a(j11 <= 0 ? ((ScheduledExecutorService) atomicReference.get()).submit(pVar) : ((ScheduledExecutorService) atomicReference.get()).schedule(pVar, j11, timeUnit));
            return pVar;
        } catch (RejectedExecutionException e8) {
            qx.p.u(e8);
            return ux.c.INSTANCE;
        }
    }

    @Override // qx.o
    public final rx.b d(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        AtomicReference atomicReference = this.f24615c;
        if (j12 > 0) {
            o oVar = new o(runnable);
            try {
                oVar.a(((ScheduledExecutorService) atomicReference.get()).scheduleAtFixedRate(oVar, j11, j12, timeUnit));
                return oVar;
            } catch (RejectedExecutionException e8) {
                qx.p.u(e8);
                return ux.c.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
        f fVar = new f(runnable, scheduledExecutorService);
        try {
            fVar.a(j11 <= 0 ? scheduledExecutorService.submit(fVar) : scheduledExecutorService.schedule(fVar, j11, timeUnit));
            return fVar;
        } catch (RejectedExecutionException e10) {
            qx.p.u(e10);
            return ux.c.INSTANCE;
        }
    }
}
