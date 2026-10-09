package dy;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class l extends qx.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f24597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f24598b;

    public l(ThreadFactory threadFactory) {
        boolean z11 = r.f24609a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, threadFactory);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(r.f24609a);
        this.f24597a = scheduledThreadPoolExecutor;
    }

    @Override // rx.b
    public final boolean b() {
        return this.f24598b;
    }

    @Override // qx.n
    public final rx.b c(Runnable runnable, long j11, TimeUnit timeUnit) {
        return this.f24598b ? ux.c.INSTANCE : f(runnable, j11, timeUnit, null);
    }

    @Override // qx.n
    public final void d(Runnable runnable) {
        c(runnable, 0L, null);
    }

    @Override // rx.b
    public final void dispose() {
        if (this.f24598b) {
            return;
        }
        this.f24598b = true;
        this.f24597a.shutdownNow();
    }

    public final q f(Runnable runnable, long j11, TimeUnit timeUnit, rx.a aVar) {
        q qVar = new q(runnable, aVar);
        if (aVar != null && !aVar.a(qVar)) {
            return qVar;
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f24597a;
        try {
            qVar.a(j11 <= 0 ? scheduledThreadPoolExecutor.submit((Callable) qVar) : scheduledThreadPoolExecutor.schedule((Callable) qVar, j11, timeUnit));
            return qVar;
        } catch (RejectedExecutionException e8) {
            if (aVar != null) {
                aVar.d(qVar);
            }
            qx.p.u(e8);
            return qVar;
        }
    }
}
