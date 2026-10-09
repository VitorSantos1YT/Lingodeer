package mw;

import com.google.common.base.Preconditions;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g5 implements Executor, Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f42432d = Logger.getLogger(g5.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j5 f42433e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f42434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f42435b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f42436c = 0;

    static {
        j5 f5Var;
        try {
            f5Var = new e5(AtomicIntegerFieldUpdater.newUpdater(g5.class, "c"));
        } catch (Throwable th2) {
            f42432d.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th2);
            f5Var = new f5();
        }
        f42433e = f5Var;
    }

    public g5(Executor executor) {
        Preconditions.k(executor, "'executor' must not be null.");
        this.f42434a = executor;
    }

    public final void a(Runnable runnable) {
        j5 j5Var = f42433e;
        if (j5Var.m(this)) {
            try {
                this.f42434a.execute(this);
            } catch (Throwable th2) {
                if (runnable != null) {
                    this.f42435b.remove(runnable);
                }
                j5Var.o(this);
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Preconditions.k(runnable, "'r' must not be null.");
        this.f42435b.add(runnable);
        a(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        j5 j5Var = f42433e;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f42435b;
        while (true) {
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e8) {
                    f42432d.log(Level.SEVERE, "Exception while executing runnable " + runnable, (Throwable) e8);
                }
            } catch (Throwable th2) {
                j5Var.o(this);
                throw th2;
            }
        }
        j5Var.o(this);
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        a(null);
    }
}
