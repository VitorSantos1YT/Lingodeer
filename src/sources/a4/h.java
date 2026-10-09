package a4;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements ListenableFuture {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f340d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f341e = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.bumptech.glide.f f342f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f343t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile d f345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile g f346c;

    static {
        com.bumptech.glide.f fVar;
        try {
            fVar = new e(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(h.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            fVar = new f();
        }
        f342f = fVar;
        if (th != null) {
            f341e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f343t = new Object();
    }

    public static void c(h hVar) {
        g gVar;
        d dVar;
        d dVar2;
        d dVar3;
        do {
            gVar = hVar.f346c;
        } while (!f342f.k(hVar, gVar, g.f337c));
        while (true) {
            dVar = null;
            if (gVar == null) {
                break;
            }
            Thread thread = gVar.f338a;
            if (thread != null) {
                gVar.f338a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f339b;
        }
        hVar.b();
        do {
            dVar2 = hVar.f345b;
        } while (!f342f.i(hVar, dVar2, d.f328d));
        while (true) {
            dVar3 = dVar;
            dVar = dVar2;
            if (dVar == null) {
                break;
            }
            dVar2 = dVar.f331c;
            dVar.f331c = dVar3;
        }
        while (dVar3 != null) {
            d dVar4 = dVar3.f331c;
            e(dVar3.f329a, dVar3.f330b);
            dVar3 = dVar4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e8) {
            f341e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e8);
        }
    }

    public static Object f(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th2 = ((a) obj).f325b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f327a);
        }
        if (obj == f343t) {
            return null;
        }
        return obj;
    }

    public static Object g(Future future) {
        Object obj;
        boolean z11 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void N(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f345b;
        d dVar2 = d.f328d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f331c = dVar;
                if (f342f.i(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f345b;
                }
            } while (dVar != dVar2);
        }
        e(runnable, executor);
    }

    public final void a(StringBuilder sb2) {
        try {
            Object objG = g(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(objG == this ? "this future" : String.valueOf(objG));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e8) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e8.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        a aVar;
        Object obj = this.f344a;
        if (obj == null) {
            if (f340d) {
                aVar = new a(new CancellationException("Future.cancel() was called."), z11);
            } else {
                aVar = z11 ? a.f322c : a.f323d;
            }
            if (f342f.j(this, obj, aVar)) {
                c(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j11, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        g gVar = g.f337c;
        long nanos = timeUnit.toNanos(j11);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f344a;
        if (obj != null) {
            return f(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar2 = this.f346c;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                while (true) {
                    com.bumptech.glide.f fVar = f342f;
                    fVar.D(gVar3, gVar2);
                    if (fVar.k(this, gVar2, gVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                j(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f344a;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        j(gVar3);
                        break;
                    }
                    gVar2 = this.f346c;
                    if (gVar2 == gVar) {
                    }
                }
            }
            return f(this.f344a);
        }
        while (nanos > 0) {
            Object obj3 = this.f344a;
            if (obj3 != null) {
                return f(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbJ = w4.c.j(j11, "Waited ", " ");
        sbJ.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbJ.toString();
        if (nanos + 1000 < 0) {
            String strM = defpackage.e.m(string3, " (plus ");
            long j12 = -nanos;
            long jConvert = timeUnit.convert(j12, TimeUnit.NANOSECONDS);
            long nanos2 = j12 - timeUnit.toNanos(jConvert);
            boolean z11 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strM2 = strM + jConvert + " " + lowerCase;
                if (z11) {
                    strM2 = defpackage.e.m(strM2, ",");
                }
                strM = defpackage.e.m(strM2, " ");
            }
            if (z11) {
                strM = strM + nanos2 + " nanoseconds ";
            }
            string3 = defpackage.e.m(strM, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(defpackage.e.m(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(ep.a.D(string3, " for ", string));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f344a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f344a != null;
    }

    public final void j(g gVar) {
        gVar.f338a = null;
        while (true) {
            g gVar2 = this.f346c;
            if (gVar2 == g.f337c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f339b;
                if (gVar2.f338a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f339b = gVar4;
                    if (gVar3.f338a == null) {
                    }
                } else if (!f342f.k(this, gVar2, gVar4)) {
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    public boolean k(Object obj) {
        if (obj == null) {
            obj = f343t;
        }
        if (!f342f.j(this, null, obj)) {
            return false;
        }
        c(this);
        return true;
    }

    public boolean l(Throwable th2) {
        th2.getClass();
        if (!f342f.j(this, null, new c(th2))) {
            return false;
        }
        c(this);
        return true;
    }

    public final String toString() {
        String strH;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f344a instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                strH = h();
            } catch (RuntimeException e8) {
                strH = "Exception thrown from implementation: " + e8.getClass();
            }
            if (strH != null && !strH.isEmpty()) {
                defpackage.e.C(sb2, "PENDING, info=[", strH, "]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        g gVar = g.f337c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f344a;
            if (obj2 != null) {
                return f(obj2);
            }
            g gVar2 = this.f346c;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    com.bumptech.glide.f fVar = f342f;
                    fVar.D(gVar3, gVar2);
                    if (fVar.k(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f344a;
                            } else {
                                j(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    gVar2 = this.f346c;
                } while (gVar2 != gVar);
            }
            return f(this.f344a);
        }
        throw new InterruptedException();
    }
}
