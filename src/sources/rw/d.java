package rw;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends ConcurrentLinkedQueue implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f50812b = Logger.getLogger(d.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f50813c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f50814a;

    public final void b() throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Runnable runnable = (Runnable) poll();
        if (runnable == null) {
            this.f50814a = Thread.currentThread();
            while (true) {
                try {
                    Runnable runnable2 = (Runnable) poll();
                    if (runnable2 != null) {
                        this.f50814a = null;
                        runnable = runnable2;
                        break;
                    } else {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            throw new InterruptedException();
                        }
                    }
                } catch (Throwable th2) {
                    this.f50814a = null;
                    throw th2;
                }
            }
        }
        do {
            try {
                runnable.run();
            } catch (Throwable th3) {
                f50812b.log(Level.WARNING, "Runnable threw exception", th3);
            }
            runnable = (Runnable) poll();
        } while (runnable != null);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        add(runnable);
        Object obj = this.f50814a;
        if (obj != f50813c) {
            LockSupport.unpark((Thread) obj);
        } else if (remove(runnable) && f.f50819b) {
            throw new RejectedExecutionException();
        }
    }

    public final void shutdown() {
        this.f50814a = f50813c;
        while (true) {
            Runnable runnable = (Runnable) poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th2) {
                f50812b.log(Level.WARNING, "Runnable threw exception", th2);
            }
        }
    }
}
