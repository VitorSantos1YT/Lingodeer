package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
abstract class InterruptibleTask<T> extends AtomicReference<Runnable> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Runnable f17656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Runnable f17657b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class DoNothingRunnable implements Runnable {
        private DoNothingRunnable() {
        }

        public /* synthetic */ DoNothingRunnable(int i11) {
            this();
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    static {
        int i11 = 0;
        f17656a = new DoNothingRunnable(i11);
        f17657b = new DoNothingRunnable(i11);
    }

    public abstract void a(Throwable th2);

    public abstract void b(Object obj);

    public final void c() {
        Runnable runnable = f17657b;
        Runnable runnable2 = f17656a;
        Runnable runnable3 = get();
        if (runnable3 instanceof Thread) {
            Blocker blocker = new Blocker(this);
            Blocker.a(blocker, Thread.currentThread());
            if (compareAndSet(runnable3, blocker)) {
                try {
                    ((Thread) runnable3).interrupt();
                } finally {
                    if (getAndSet(runnable2) == runnable) {
                        LockSupport.unpark((Thread) runnable3);
                    }
                }
            }
        }
    }

    public abstract boolean d();

    public abstract Object e();

    public abstract String f();

    public final void g(Thread thread) {
        Runnable runnable = get();
        Blocker blocker = null;
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            boolean z12 = runnable instanceof Blocker;
            Runnable runnable2 = f17657b;
            if (!z12 && runnable != runnable2) {
                break;
            }
            if (z12) {
                blocker = (Blocker) runnable;
            }
            i11++;
            if (i11 <= 1000) {
                Thread.yield();
            } else if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                z11 = Thread.interrupted() || z11;
                LockSupport.park(blocker);
            }
            runnable = get();
        }
        if (z11) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objE = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zD = d();
            Runnable runnable = f17656a;
            if (!zD) {
                try {
                    objE = e();
                } catch (Throwable th2) {
                    try {
                        Platform.a(th2);
                        if (!compareAndSet(threadCurrentThread, runnable)) {
                            g(threadCurrentThread);
                        }
                        if (zD) {
                            return;
                        }
                        a(th2);
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(threadCurrentThread, runnable)) {
                            g(threadCurrentThread);
                        }
                        if (!zD) {
                            b(null);
                        }
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, runnable)) {
                g(threadCurrentThread);
            }
            if (zD) {
                return;
            }
            b(objE);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == f17656a) {
            str = "running=[DONE]";
        } else if (runnable instanceof Blocker) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbR = defpackage.e.r(str, ", ");
        sbR.append(f());
        return sbR.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Blocker extends AbstractOwnableSynchronizer implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterruptibleTask f17658a;

        public Blocker(InterruptibleTask interruptibleTask) {
            this.f17658a = interruptibleTask;
        }

        public static void a(Blocker blocker, Thread thread) {
            blocker.setExclusiveOwnerThread(thread);
        }

        public final String toString() {
            return this.f17658a.toString();
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }
}
