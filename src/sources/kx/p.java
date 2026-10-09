package kx;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends uw.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f38925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ww.a f38926b = new ww.a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f38927c;

    public p(ScheduledExecutorService scheduledExecutorService) {
        this.f38925a = scheduledExecutorService;
    }

    @Override // uw.m
    public final ww.b a(Runnable runnable, TimeUnit timeUnit) {
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (this.f38927c) {
            return zw.b.INSTANCE;
        }
        n nVar = new n(runnable, this.f38926b);
        this.f38926b.a(nVar);
        try {
            nVar.a(this.f38925a.submit((Callable) nVar));
            return nVar;
        } catch (RejectedExecutionException e8) {
            dispose();
            qx.b.B(e8);
            return zw.b.INSTANCE;
        }
    }

    @Override // ww.b
    public final void dispose() {
        if (this.f38927c) {
            return;
        }
        this.f38927c = true;
        this.f38926b.dispose();
    }
}
