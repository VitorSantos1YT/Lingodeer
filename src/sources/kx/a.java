package kx;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends AtomicReference implements ww.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FutureTask f38873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FutureTask f38874d;
    private static final long serialVersionUID = 1811839108042568751L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f38875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Thread f38876b;

    static {
        ax.a aVar = ax.d.f3261b;
        f38873c = new FutureTask(aVar, null);
        f38874d = new FutureTask(aVar, null);
    }

    public a(Runnable runnable) {
        this.f38875a = runnable;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == f38873c) {
                return;
            }
            if (future2 == f38874d) {
                future.cancel(this.f38876b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // ww.b
    public final void dispose() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == f38873c || future == (futureTask = f38874d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f38876b != Thread.currentThread());
    }
}
