package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhz extends zzjf {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicLong f13080k = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zzhy f13081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zzhy f13082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PriorityBlockingQueue f13083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedBlockingQueue f13084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f13085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f13086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f13087i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Semaphore f13088j;

    public zzhz(zzic zzicVar) {
        super(zzicVar);
        this.f13087i = new Object();
        this.f13088j = new Semaphore(2);
        this.f13083e = new PriorityBlockingQueue();
        this.f13084f = new LinkedBlockingQueue();
        this.f13085g = new zzhw(this, "Thread death: Uncaught exception on worker thread");
        this.f13086h = new zzhw(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // com.google.android.gms.measurement.internal.zzje
    public final void g() {
        if (Thread.currentThread() != this.f13081c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final boolean h() {
        return false;
    }

    public final void k() {
        if (Thread.currentThread() != this.f13082d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void l() {
        if (Thread.currentThread() == this.f13081c) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean m() {
        return Thread.currentThread() == this.f13081c;
    }

    public final Future n(Callable callable) {
        i();
        zzhx zzhxVar = new zzhx(this, callable, false);
        if (Thread.currentThread() != this.f13081c) {
            t(zzhxVar);
            return zzhxVar;
        }
        if (!this.f13083e.isEmpty()) {
            zzgu zzguVar = this.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12945i.a("Callable skipped the worker queue.");
        }
        zzhxVar.run();
        return zzhxVar;
    }

    public final Future o(Callable callable) {
        i();
        zzhx zzhxVar = new zzhx(this, callable, true);
        if (Thread.currentThread() == this.f13081c) {
            zzhxVar.run();
            return zzhxVar;
        }
        t(zzhxVar);
        return zzhxVar;
    }

    public final void p(Runnable runnable) {
        i();
        Preconditions.g(runnable);
        t(new zzhx(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object q(AtomicReference atomicReference, long j11, String str, Runnable runnable) {
        synchronized (atomicReference) {
            zzhz zzhzVar = this.f13202a.f13100g;
            zzic.m(zzhzVar);
            zzhzVar.p(runnable);
            try {
                atomicReference.wait(j11);
            } catch (InterruptedException unused) {
                zzgu zzguVar = this.f13202a.f13099f;
                zzic.m(zzguVar);
                zzgs zzgsVar = zzguVar.f12945i;
                StringBuilder sb2 = new StringBuilder(str.length() + 24);
                sb2.append("Interrupted waiting for ");
                sb2.append(str);
                zzgsVar.a(sb2.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            zzgu zzguVar2 = this.f13202a.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12945i.a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void r(Runnable runnable) {
        i();
        t(new zzhx(this, runnable, true, "Task exception on worker thread"));
    }

    public final void s(Runnable runnable) {
        i();
        zzhx zzhxVar = new zzhx(this, runnable, false, "Task exception on network thread");
        synchronized (this.f13087i) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.f13084f;
                linkedBlockingQueue.add(zzhxVar);
                zzhy zzhyVar = this.f13082d;
                if (zzhyVar == null) {
                    zzhy zzhyVar2 = new zzhy(this, "Measurement Network", linkedBlockingQueue);
                    this.f13082d = zzhyVar2;
                    zzhyVar2.setUncaughtExceptionHandler(this.f13086h);
                    this.f13082d.start();
                } else {
                    Object obj = zzhyVar.f13076a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void t(zzhx zzhxVar) {
        synchronized (this.f13087i) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f13083e;
                priorityBlockingQueue.add(zzhxVar);
                zzhy zzhyVar = this.f13081c;
                if (zzhyVar == null) {
                    zzhy zzhyVar2 = new zzhy(this, "Measurement Worker", priorityBlockingQueue);
                    this.f13081c = zzhyVar2;
                    zzhyVar2.setUncaughtExceptionHandler(this.f13085g);
                    this.f13081c.start();
                } else {
                    Object obj = zzhyVar.f13076a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
