package rz;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends x0 implements Runnable {
    public static final f0 H;
    public static final long K;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l9;
        f0 f0Var = new f0();
        H = f0Var;
        f0Var.i(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l9 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l9 = 1000L;
        }
        K = timeUnit.toNanos(l9.longValue());
    }

    public final synchronized void F() {
        int i11 = debugStatus;
        if (i11 == 2 || i11 == 3) {
            debugStatus = 3;
            x0.f50970e.set(this, null);
            x0.f50971f.set(this, null);
            notifyAll();
        }
    }

    @Override // rz.x0, rz.j0
    public final q0 b(long j11, Runnable runnable, vy.i iVar) {
        long j12 = 0;
        if (j11 > 0) {
            j12 = j11 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j11;
        }
        if (j12 >= 4611686018427387903L) {
            return w1.f50967a;
        }
        long jNanoTime = System.nanoTime();
        u0 u0Var = new u0(runnable, j12 + jNanoTime);
        D(jNanoTime, u0Var);
        return u0Var;
    }

    @Override // rz.y0
    public final Thread h() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(H.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c2.f50875a.set(this);
        try {
            synchronized (this) {
                int i11 = debugStatus;
                if (i11 == 2 || i11 == 3) {
                    _thread = null;
                    F();
                    if (C()) {
                        return;
                    }
                    h();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j11 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jQ = q();
                    if (jQ == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j11 == Long.MAX_VALUE) {
                            j11 = K + jNanoTime;
                        }
                        long j12 = j11 - jNanoTime;
                        if (j12 <= 0) {
                            _thread = null;
                            F();
                            if (C()) {
                                return;
                            }
                            h();
                            return;
                        }
                        if (jQ > j12) {
                            jQ = j12;
                        }
                    } else {
                        j11 = Long.MAX_VALUE;
                    }
                    if (jQ > 0) {
                        int i12 = debugStatus;
                        if (i12 == 2 || i12 == 3) {
                            _thread = null;
                            F();
                            if (C()) {
                                return;
                            }
                            h();
                            return;
                        }
                        LockSupport.parkNanos(this, jQ);
                    }
                }
            }
        } catch (Throwable th2) {
            _thread = null;
            F();
            if (!C()) {
                h();
            }
            throw th2;
        }
    }

    @Override // rz.x0, rz.y0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // rz.y
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // rz.y0
    public final void x(long j11, v0 v0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // rz.x0
    public final void y(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.y(runnable);
    }
}
