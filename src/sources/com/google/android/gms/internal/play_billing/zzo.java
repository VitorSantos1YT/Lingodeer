package com.google.android.gms.internal.play_billing;

import defpackage.e;
import i0.pKy.shrCcjmOhAmRC;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import nv.p;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;
import pt.ImS.aYZzTH;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class zzo implements zzcz {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f12479d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f12480e = Logger.getLogger(zzo.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zzd f12481f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f12482t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f12483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile zzh f12484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile zzm f12485c;

    static {
        zzd zzlVar;
        try {
            zzlVar = new zzj(AtomicReferenceFieldUpdater.newUpdater(zzm.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(zzm.class, zzm.class, "b"), AtomicReferenceFieldUpdater.newUpdater(zzo.class, zzm.class, "c"), AtomicReferenceFieldUpdater.newUpdater(zzo.class, zzh.class, "b"), AtomicReferenceFieldUpdater.newUpdater(zzo.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zzlVar = new zzl();
        }
        Throwable th3 = th;
        f12481f = zzlVar;
        if (th3 != null) {
            f12480e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        f12482t = new Object();
    }

    public static void b(zzo zzoVar) {
        zzm zzmVar;
        zzd zzdVar;
        zzh zzhVar;
        do {
            zzmVar = zzoVar.f12485c;
            zzdVar = f12481f;
        } while (!zzdVar.e(zzoVar, zzmVar, zzm.f12476c));
        while (zzmVar != null) {
            Thread thread = zzmVar.f12477a;
            if (thread != null) {
                zzmVar.f12477a = null;
                LockSupport.unpark(thread);
            }
            zzmVar = zzmVar.f12478b;
        }
        do {
            zzhVar = zzoVar.f12484b;
        } while (!zzdVar.c(zzoVar, zzhVar, zzh.f12433d));
        zzh zzhVar2 = null;
        while (zzhVar != null) {
            zzh zzhVar3 = zzhVar.f12436c;
            zzhVar.f12436c = zzhVar2;
            zzhVar2 = zzhVar;
            zzhVar = zzhVar3;
        }
        while (zzhVar2 != null) {
            Runnable runnable = zzhVar2.f12434a;
            zzh zzhVar4 = zzhVar2.f12436c;
            if (runnable instanceof zzk) {
                throw null;
            }
            d(runnable, zzhVar2.f12435b);
            zzhVar2 = zzhVar4;
        }
    }

    public static final Object f(Object obj) throws ExecutionException {
        if (obj instanceof zze) {
            Throwable th2 = ((zze) obj).f12344a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof zzg) {
            throw new ExecutionException(((zzg) obj).f12390a);
        }
        if (obj == f12482t) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String a() {
        if (this.f12483a instanceof zzk) {
            return "setFuture=[null]";
        }
        if (this instanceof ScheduledFuture) {
            return p.m(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    public final void c(StringBuilder sb2) {
        V v11;
        boolean z11 = false;
        while (true) {
            try {
                try {
                    v11 = get();
                    break;
                } catch (InterruptedException unused) {
                    z11 = true;
                } catch (Throwable th2) {
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (RuntimeException e8) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e8.getClass());
                sb2.append(" thrown from get()]");
                return;
            } catch (ExecutionException e10) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e10.getCause());
                sb2.append("]");
                return;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        sb2.append(v11 == this ? "this future" : String.valueOf(v11));
        sb2.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        zze zzeVar;
        Object obj = this.f12483a;
        if ((obj instanceof zzk) | (obj == null)) {
            if (f12479d) {
                zzeVar = new zze(new CancellationException("Future.cancel() was called."));
            } else {
                zzeVar = z11 ? zze.f12342b : zze.f12343c;
            }
            while (!f12481f.d(this, obj, zzeVar)) {
                obj = this.f12483a;
                if (!(obj instanceof zzk)) {
                }
            }
            b(this);
            if (obj instanceof zzk) {
                throw null;
            }
            return true;
        }
        return false;
    }

    public final void e(zzm zzmVar) {
        zzmVar.f12477a = null;
        while (true) {
            zzm zzmVar2 = this.f12485c;
            if (zzmVar2 != zzm.f12476c) {
                zzm zzmVar3 = null;
                while (zzmVar2 != null) {
                    zzm zzmVar4 = zzmVar2.f12478b;
                    if (zzmVar2.f12477a != null) {
                        zzmVar3 = zzmVar2;
                    } else if (zzmVar3 != null) {
                        zzmVar3.f12478b = zzmVar4;
                        if (zzmVar3.f12477a == null) {
                        }
                    } else if (!f12481f.e(this, zzmVar2, zzmVar4)) {
                    }
                    zzmVar2 = zzmVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f12483a;
        if ((obj2 != null) && (!(obj2 instanceof zzk))) {
            return f(obj2);
        }
        zzm zzmVar = this.f12485c;
        zzm zzmVar2 = zzm.f12476c;
        if (zzmVar != zzmVar2) {
            zzm zzmVar3 = new zzm();
            do {
                zzd zzdVar = f12481f;
                zzdVar.a(zzmVar3, zzmVar);
                if (zzdVar.e(this, zzmVar, zzmVar3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            e(zzmVar3);
                            throw new InterruptedException();
                        }
                        obj = this.f12483a;
                    } while (!((obj != null) & (!(obj instanceof zzk))));
                    return f(obj);
                }
                zzmVar = this.f12485c;
            } while (zzmVar != zzmVar2);
        }
        return f(this.f12483a);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcz
    public final void h0(Runnable runnable, Executor executor) {
        executor.getClass();
        zzh zzhVar = this.f12484b;
        zzh zzhVar2 = zzh.f12433d;
        if (zzhVar != zzhVar2) {
            zzh zzhVar3 = new zzh(runnable, executor);
            do {
                zzhVar3.f12436c = zzhVar;
                if (f12481f.c(this, zzhVar, zzhVar3)) {
                    return;
                } else {
                    zzhVar = this.f12484b;
                }
            } while (zzhVar != zzhVar2);
        }
        d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f12483a instanceof zze;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f12483a;
        return (obj != null) & (!(obj instanceof zzk));
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f12483a instanceof zze) {
            sb2.append(OYAvlbfUyD.nLWT);
        } else if (isDone()) {
            c(sb2);
        } else {
            try {
                strConcat = a();
            } catch (RuntimeException e8) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e8.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                e.C(sb2, "PENDING, info=[", strConcat, "]");
            } else if (isDone()) {
                c(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e8) {
            Level level = Level.SEVERE;
            String strN = e.n("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor));
            f12480e.logp(level, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", shrCcjmOhAmRC.fUmTSZJ, strN, (Throwable) e8);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j11, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z11;
        long nanos = timeUnit.toNanos(j11);
        if (!Thread.interrupted()) {
            Object obj = this.f12483a;
            if ((obj != null) & (!(obj instanceof zzk))) {
                return f(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                zzm zzmVar = this.f12485c;
                zzm zzmVar2 = zzm.f12476c;
                if (zzmVar != zzmVar2) {
                    zzm zzmVar3 = new zzm();
                    z11 = true;
                    while (true) {
                        zzd zzdVar = f12481f;
                        zzdVar.a(zzmVar3, zzmVar);
                        if (zzdVar.e(this, zzmVar, zzmVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f12483a;
                                    if ((obj2 != null) & (!(obj2 instanceof zzk))) {
                                        return f(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    e(zzmVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            e(zzmVar3);
                            break;
                        }
                        zzmVar = this.f12485c;
                        if (zzmVar == zzmVar2) {
                        }
                    }
                }
                return f(this.f12483a);
            }
            z11 = true;
            while (nanos > 0) {
                Object obj3 = this.f12483a;
                if ((obj3 != null ? z11 : false) & (!(obj3 instanceof zzk))) {
                    return f(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb2 = new StringBuilder("Waited ");
            sb2.append(j11);
            String str = aYZzTH.KtpKBsqSWXn;
            sb2.append(str);
            sb2.append(lowerCase2);
            String string3 = sb2.toString();
            if (nanos + 1000 < 0) {
                String strConcat = string3.concat(" (plus ");
                long j12 = -nanos;
                long jConvert = timeUnit.convert(j12, TimeUnit.NANOSECONDS);
                long nanos2 = j12 - timeUnit.toNanos(jConvert);
                if (jConvert != 0 && nanos2 <= 1000) {
                    z11 = false;
                }
                if (jConvert > 0) {
                    String strConcat2 = strConcat + jConvert + str + lowerCase;
                    if (z11) {
                        strConcat2 = strConcat2.concat(",");
                    }
                    strConcat = strConcat2.concat(str);
                }
                if (z11) {
                    strConcat = strConcat + nanos2 + " nanoseconds ";
                }
                string3 = strConcat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(ep.a.D(string3, " for ", string));
        }
        throw new InterruptedException();
    }
}
