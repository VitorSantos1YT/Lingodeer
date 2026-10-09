package dy;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements Callable, rx.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final FutureTask f24570f = new FutureTask(vx.b.f54313b, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24571a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExecutorService f24574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Thread f24575e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f24573c = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f24572b = new AtomicReference();

    public f(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        this.f24571a = runnable;
        this.f24574d = scheduledExecutorService;
    }

    public final void a(Future future) {
        while (true) {
            AtomicReference atomicReference = this.f24573c;
            Future future2 = (Future) atomicReference.get();
            if (future2 == f24570f) {
                future.cancel(this.f24575e != Thread.currentThread());
                return;
            } else {
                while (!atomicReference.compareAndSet(future2, future)) {
                    if (atomicReference.get() != future2) {
                    }
                }
                return;
            }
        }
    }

    @Override // rx.b
    public final boolean b() {
        return this.f24573c.get() == f24570f;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.f24575e = Thread.currentThread();
        try {
            this.f24571a.run();
            this.f24575e = null;
            Future futureSubmit = this.f24574d.submit(this);
            AtomicReference atomicReference = this.f24572b;
            while (true) {
                Future future = (Future) atomicReference.get();
                if (future == f24570f) {
                    futureSubmit.cancel(this.f24575e != Thread.currentThread());
                    return null;
                }
                while (!atomicReference.compareAndSet(future, futureSubmit)) {
                    if (atomicReference.get() != future) {
                    }
                }
                return null;
            }
        } catch (Throwable th2) {
            this.f24575e = null;
            qx.p.u(th2);
            throw th2;
        }
    }

    @Override // rx.b
    public final void dispose() {
        AtomicReference atomicReference = this.f24573c;
        FutureTask futureTask = f24570f;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        if (future != null && future != futureTask) {
            future.cancel(this.f24575e != Thread.currentThread());
        }
        Future future2 = (Future) this.f24572b.getAndSet(futureTask);
        if (future2 == null || future2 == futureTask) {
            return;
        }
        future2.cancel(this.f24575e != Thread.currentThread());
    }
}
