package lw;

import com.google.common.base.Preconditions;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t1 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f40470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f40471b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f40472c = new AtomicReference();

    public t1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f40470a = uncaughtExceptionHandler;
    }

    public final void a() {
        AtomicReference atomicReference;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f40471b;
        do {
            Thread threadCurrentThread = Thread.currentThread();
            do {
                atomicReference = this.f40472c;
                if (atomicReference.compareAndSet(null, threadCurrentThread)) {
                    while (true) {
                        try {
                            Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                            if (runnable == null) {
                                break;
                            }
                            try {
                                runnable.run();
                            } catch (Throwable th2) {
                                this.f40470a.uncaughtException(Thread.currentThread(), th2);
                            }
                        } catch (Throwable th3) {
                            atomicReference.set(null);
                            throw th3;
                        }
                    }
                    atomicReference.set(null);
                }
            } while (atomicReference.get() == null);
            return;
        } while (!concurrentLinkedQueue.isEmpty());
    }

    public final void b(Runnable runnable) {
        Preconditions.k(runnable, "runnable is null");
        this.f40471b.add(runnable);
    }

    public final b1.p c(Runnable runnable, long j11, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        s1 s1Var = new s1(runnable);
        return new b1.p(s1Var, scheduledExecutorService.schedule(new com.android.billingclient.api.b0(3, this, s1Var, runnable, false), j11, timeUnit));
    }

    public final void d() {
        Preconditions.p("Not called from the SynchronizationContext", Thread.currentThread() == this.f40472c.get());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable);
        a();
    }
}
