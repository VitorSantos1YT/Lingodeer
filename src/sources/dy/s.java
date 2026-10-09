package dy;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends qx.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f24610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rx.a f24611b = new rx.a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f24612c;

    public s(ScheduledExecutorService scheduledExecutorService) {
        this.f24610a = scheduledExecutorService;
    }

    @Override // rx.b
    public final boolean b() {
        return this.f24612c;
    }

    @Override // qx.n
    public final rx.b c(Runnable runnable, long j11, TimeUnit timeUnit) {
        if (this.f24612c) {
            return ux.c.INSTANCE;
        }
        q qVar = new q(runnable, this.f24611b);
        this.f24611b.a(qVar);
        try {
            qVar.a(j11 <= 0 ? this.f24610a.submit((Callable) qVar) : this.f24610a.schedule((Callable) qVar, j11, timeUnit));
            return qVar;
        } catch (RejectedExecutionException e8) {
            dispose();
            qx.p.u(e8);
            return ux.c.INSTANCE;
        }
    }

    @Override // rx.b
    public final void dispose() {
        if (this.f24612c) {
            return;
        }
        this.f24612c = true;
        this.f24611b.dispose();
    }
}
