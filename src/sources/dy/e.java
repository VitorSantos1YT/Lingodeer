package dy;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends qx.o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f24565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f24566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f24567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f24568g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f24569c;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx3.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        f24567f = iAvailableProcessors;
        d dVar = new d(new n("RxComputationShutdown"));
        f24568g = dVar;
        dVar.dispose();
        n nVar = new n("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx3.computation-priority", 5).intValue())), true);
        f24566e = nVar;
        c cVar = new c(0, nVar);
        f24565d = cVar;
        for (d dVar2 : cVar.f24563b) {
            dVar2.dispose();
        }
    }

    public e() {
        c cVar = f24565d;
        AtomicReference atomicReference = new AtomicReference(cVar);
        this.f24569c = atomicReference;
        c cVar2 = new c(f24567f, f24566e);
        while (!atomicReference.compareAndSet(cVar, cVar2)) {
            if (atomicReference.get() != cVar) {
                d[] dVarArr = cVar2.f24563b;
                for (d dVar : dVarArr) {
                    dVar.dispose();
                }
                return;
            }
        }
    }

    @Override // qx.o
    public final qx.n a() {
        return new b(((c) this.f24569c.get()).a());
    }

    @Override // qx.o
    public final rx.b c(Runnable runnable, long j11, TimeUnit timeUnit) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = ((c) this.f24569c.get()).a().f24597a;
        p pVar = new p(runnable);
        try {
            pVar.a(j11 <= 0 ? scheduledThreadPoolExecutor.submit(pVar) : scheduledThreadPoolExecutor.schedule(pVar, j11, timeUnit));
            return pVar;
        } catch (RejectedExecutionException e8) {
            qx.p.u(e8);
            return ux.c.INSTANCE;
        }
    }

    @Override // qx.o
    public final rx.b d(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = ((c) this.f24569c.get()).a().f24597a;
        if (j12 <= 0) {
            f fVar = new f(runnable, scheduledThreadPoolExecutor);
            try {
                fVar.a(j11 <= 0 ? scheduledThreadPoolExecutor.submit(fVar) : scheduledThreadPoolExecutor.schedule(fVar, j11, timeUnit));
                return fVar;
            } catch (RejectedExecutionException e8) {
                qx.p.u(e8);
                return ux.c.INSTANCE;
            }
        }
        o oVar = new o(runnable);
        try {
            oVar.a(scheduledThreadPoolExecutor.scheduleAtFixedRate(oVar, j11, j12, timeUnit));
            return oVar;
        } catch (RejectedExecutionException e10) {
            qx.p.u(e10);
            return ux.c.INSTANCE;
        }
    }
}
