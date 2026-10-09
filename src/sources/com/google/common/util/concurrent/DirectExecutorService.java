package com.google.common.util.concurrent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class DirectExecutorService extends AbstractListeningExecutorService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17626a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17627b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17628c = false;

    public final void a() {
        synchronized (this.f17626a) {
            try {
                int i11 = this.f17627b - 1;
                this.f17627b = i11;
                if (i11 == 0) {
                    this.f17626a.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j11, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j11);
        synchronized (this.f17626a) {
            while (true) {
                try {
                    if (this.f17628c && this.f17627b == 0) {
                        return true;
                    }
                    if (nanos <= 0) {
                        return false;
                    }
                    long jNanoTime = System.nanoTime();
                    TimeUnit.NANOSECONDS.timedWait(this.f17626a, nanos);
                    nanos -= System.nanoTime() - jNanoTime;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f17626a) {
            if (this.f17628c) {
                throw new RejectedExecutionException("Executor already shutdown");
            }
            this.f17627b++;
        }
        try {
            runnable.run();
        } finally {
            a();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        boolean z11;
        synchronized (this.f17626a) {
            z11 = this.f17628c;
        }
        return z11;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        boolean z11;
        synchronized (this.f17626a) {
            try {
                z11 = this.f17628c && this.f17627b == 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        synchronized (this.f17626a) {
            try {
                this.f17628c = true;
                if (this.f17627b == 0) {
                    this.f17626a.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        shutdown();
        return Collections.EMPTY_LIST;
    }
}
