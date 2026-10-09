package dy;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends AtomicReference implements rx.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FutureTask f24552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final FutureTask f24553e;
    private static final long serialVersionUID = 1811839108042568751L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f24554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24555b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Thread f24556c;

    static {
        ax.a aVar = vx.b.f54313b;
        f24552d = new FutureTask(aVar, null);
        f24553e = new FutureTask(aVar, null);
    }

    public a(Runnable runnable) {
        this.f24554a = runnable;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == f24552d) {
                return;
            }
            if (future2 == f24553e) {
                if (this.f24556c == Thread.currentThread()) {
                    future.cancel(false);
                    return;
                } else {
                    future.cancel(this.f24555b);
                    return;
                }
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // rx.b
    public final boolean b() {
        Future future = (Future) get();
        return future == f24552d || future == f24553e;
    }

    @Override // rx.b
    public final void dispose() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == f24552d || future == (futureTask = f24553e) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        if (this.f24556c == Thread.currentThread()) {
            future.cancel(false);
        } else {
            future.cancel(this.f24555b);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Future future = (Future) get();
        if (future == f24552d) {
            str = "Finished";
        } else if (future == f24553e) {
            str = "Disposed";
        } else if (this.f24556c != null) {
            str = "Running on " + this.f24556c;
        } else {
            str = "Waiting";
        }
        return getClass().getSimpleName() + "[" + str + "]";
    }
}
