package com.google.android.gms.internal.play_billing;

import defpackage.e;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcj<V> extends zzck<V> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    final class zza {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zza f12289c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final zza f12290d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f12291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f12292b;

        static {
            if (zzck.f12304f) {
                f12290d = null;
                f12289c = null;
            } else {
                f12290d = new zza(null, false);
                f12289c = new zza(null, true);
            }
        }

        public zza(Throwable th2, boolean z11) {
            this.f12291a = z11;
            this.f12292b = th2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    final class zzb<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zzcj f12293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final zzcz f12294b;

        public zzb(zzcj zzcjVar, zzcz zzczVar) {
            this.f12293a = zzcjVar;
            this.f12294b = zzczVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f12293a.f12306a != this) {
                return;
            }
            zzcz zzczVar = this.f12294b;
            if (zzck.f12305t.f(this.f12293a, this, zzcj.g(zzczVar))) {
                zzcj.i(this.f12293a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    final class zzd {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final zzd f12298d = new zzd();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f12299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f12300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public zzd f12301c;

        public zzd() {
            this.f12299a = null;
            this.f12300b = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.f12299a = runnable;
            this.f12300b = executor;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    interface zze<V> extends zzcz<V> {
    }

    public static Object c(Object obj) throws ExecutionException {
        if (obj instanceof zza) {
            Throwable th2 = ((zza) obj).f12292b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (!(obj instanceof zzc)) {
            if (obj == zzck.f12302d) {
                return null;
            }
            return obj;
        }
        Throwable th3 = ((zzc) obj).f12297a;
        if (th3 != null) {
            throw new ExecutionException(th3);
        }
        zzck.f12303e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "getDoneValue", "Failure.exception is unexpectedly null.");
        throw new ExecutionException(zzc.f12296c.f12297a);
    }

    public static boolean f(Object obj) {
        return !(obj instanceof zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object g(zzcz zzczVar) {
        Object obj;
        Throwable thA;
        if (zzczVar instanceof zze) {
            Object zzaVar = ((zzcj) zzczVar).f12306a;
            if (zzaVar instanceof zza) {
                zza zzaVar2 = (zza) zzaVar;
                if (zzaVar2.f12291a) {
                    Throwable th2 = zzaVar2.f12292b;
                    zzaVar = th2 != null ? new zza(th2, false) : zza.f12290d;
                }
            }
            Objects.requireNonNull(zzaVar);
            return zzaVar;
        }
        if ((zzczVar instanceof zzdf) && (thA = ((zzdf) zzczVar).a()) != null) {
            return new zzc(thA);
        }
        boolean zIsCancelled = zzczVar.isCancelled();
        boolean z11 = true;
        if ((!zzck.f12304f) && zIsCancelled) {
            zza zzaVar3 = zza.f12290d;
            Objects.requireNonNull(zzaVar3);
            return zzaVar3;
        }
        boolean z12 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = zzczVar.get();
                        break;
                    } catch (Error e8) {
                        e = e8;
                        return new zzc(e);
                    }
                } catch (InterruptedException unused) {
                    z12 = z11;
                } catch (Throwable th3) {
                    if (z12) {
                        Thread.currentThread().interrupt();
                    }
                    throw th3;
                }
            } catch (Error | Exception e10) {
                e = e10;
                return new zzc(e);
            } catch (CancellationException e11) {
                return !zIsCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzczVar)), e11)) : new zza(e11, false);
            } catch (ExecutionException e12) {
                return zIsCancelled ? new zza(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzczVar)), e12), false) : new zzc(e12.getCause());
            }
        }
        if (z12) {
            Thread.currentThread().interrupt();
        }
        if (zIsCancelled) {
            return new zza(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzczVar))), false);
        }
        return obj == null ? zzck.f12302d : obj;
    }

    public static void i(zzcj zzcjVar) {
        zzd zzdVar = null;
        while (true) {
            zzcjVar.getClass();
            for (zzck.zze zzeVarB = zzck.f12305t.b(zzcjVar); zzeVarB != null; zzeVarB = zzeVarB.f12322b) {
                Thread thread = zzeVarB.f12321a;
                if (thread != null) {
                    zzeVarB.f12321a = null;
                    LockSupport.unpark(thread);
                }
            }
            zzcjVar.e();
            zzd zzdVar2 = zzdVar;
            zzd zzdVarA = zzck.f12305t.a(zzcjVar, zzd.f12298d);
            zzd zzdVar3 = zzdVar2;
            while (zzdVarA != null) {
                zzd zzdVar4 = zzdVarA.f12301c;
                zzdVarA.f12301c = zzdVar3;
                zzdVar3 = zzdVarA;
                zzdVarA = zzdVar4;
            }
            while (zzdVar3 != null) {
                Runnable runnable = zzdVar3.f12299a;
                zzd zzdVar5 = zzdVar3.f12301c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof zzb) {
                    zzb zzbVar = (zzb) runnable;
                    zzcjVar = zzbVar.f12293a;
                    if (zzcjVar.f12306a == zzbVar) {
                        if (zzck.f12305t.f(zzcjVar, zzbVar, g(zzbVar.f12294b))) {
                            zzdVar = zzdVar5;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzdVar3.f12300b;
                    Objects.requireNonNull(executor);
                    j(runnable, executor);
                }
                zzdVar3 = zzdVar5;
            }
            return;
        }
    }

    public static void j(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e8) {
            zzck.f12303e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", e.n("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzdf
    public final Throwable a() {
        if (!(this instanceof zze)) {
            return null;
        }
        Object obj = this.f12306a;
        if (obj instanceof zzc) {
            return ((zzc) obj).f12297a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        zza zzaVar;
        Object obj = this.f12306a;
        if (!(obj instanceof zzb) && !(obj == null)) {
            return false;
        }
        if (zzck.f12304f) {
            zzaVar = new zza(new CancellationException("Future.cancel() was called."), z11);
        } else {
            zzaVar = z11 ? zza.f12289c : zza.f12290d;
            Objects.requireNonNull(zzaVar);
        }
        zzcj<V> zzcjVar = this;
        boolean z12 = false;
        while (true) {
            if (zzck.f12305t.f(zzcjVar, obj, zzaVar)) {
                i(zzcjVar);
                if (obj instanceof zzb) {
                    zzcz zzczVar = ((zzb) obj).f12294b;
                    if (zzczVar instanceof zze) {
                        zzcjVar = (zzcj) zzczVar;
                        obj = zzcjVar.f12306a;
                        if ((obj == null) | (obj instanceof zzb)) {
                            z12 = true;
                        }
                    } else {
                        zzczVar.cancel(z11);
                    }
                }
                return true;
            }
            obj = zzcjVar.f12306a;
            if (f(obj)) {
                return z12;
            }
        }
    }

    public String d() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        zzck.zze zzeVar = zzck.zze.f12320c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f12306a;
        if ((obj2 != null) && f(obj2)) {
            return c(obj2);
        }
        zzck.zze zzeVar2 = this.f12308c;
        if (zzeVar2 != zzeVar) {
            zzck.zze zzeVar3 = new zzck.zze();
            do {
                zzck.zza zzaVar = zzck.f12305t;
                zzaVar.c(zzeVar3, zzeVar2);
                if (zzaVar.g(this, zzeVar2, zzeVar3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            b(zzeVar3);
                            throw new InterruptedException();
                        }
                        obj = this.f12306a;
                    } while (!((obj != null) & f(obj)));
                    return c(obj);
                }
                zzeVar2 = this.f12308c;
            } while (zzeVar2 != zzeVar);
        }
        Object obj3 = this.f12306a;
        Objects.requireNonNull(obj3);
        return c(obj3);
    }

    public final void h(StringBuilder sb2) {
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
            } catch (ExecutionException e8) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e8.getCause());
                sb2.append("]");
                return;
            } catch (Exception e10) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e10.getClass());
                sb2.append(" thrown from get()]");
                return;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        if (v11 == null) {
            sb2.append("null");
        } else if (v11 == this) {
            sb2.append("this future");
        } else {
            sb2.append(v11.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(v11)));
        }
        sb2.append("]");
    }

    @Override // com.google.android.gms.internal.play_billing.zzcz
    public final void h0(Runnable runnable, Executor executor) {
        zzd zzdVar;
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        if (!isDone() && (zzdVar = this.f12307b) != zzd.f12298d) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.f12301c = zzdVar;
                if (zzck.f12305t.e(this, zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.f12307b;
                }
            } while (zzdVar != zzd.f12298d);
        }
        j(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f12306a instanceof zza;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f12306a;
        return (obj != null) & f(obj);
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (this.f12306a instanceof zza) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            h(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.f12306a;
            if (obj instanceof zzb) {
                sb2.append(", setFuture=[");
                zzcz zzczVar = ((zzb) obj).f12294b;
                try {
                    if (zzczVar == this) {
                        sb2.append("this future");
                    } else {
                        sb2.append(zzczVar);
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(th2.getClass());
                }
                sb2.append("]");
            } else {
                try {
                    strConcat = d();
                    if (strConcat == null || strConcat.isEmpty()) {
                        strConcat = null;
                    }
                } catch (Throwable th3) {
                    if ((th3 instanceof Error) && !(th3 instanceof StackOverflowError)) {
                        throw th3;
                    }
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th3.getClass()));
                }
                if (strConcat != null) {
                    e.C(sb2, ", info=[", strConcat, "]");
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                h(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    final class zzc {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final zzc f12295b = new zzc(new AnonymousClass1("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zzc f12296c = new zzc(new AnonymousClass2("Failure.exception is unexpectedly null."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f12297a;

        public zzc(Throwable th2) {
            th2.getClass();
            this.f12297a = th2;
        }

        /* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.zzcj$zzc$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public class AnonymousClass1 extends Throwable {
            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                return this;
            }
        }

        /* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.zzcj$zzc$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public class AnonymousClass2 extends Throwable {
            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                return this;
            }
        }
    }

    public void e() {
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j11, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long j12;
        zzck.zze zzeVar = zzck.zze.f12320c;
        long nanos = timeUnit.toNanos(j11);
        if (!Thread.interrupted()) {
            Object obj = this.f12306a;
            if ((obj != null) & f(obj)) {
                return c(obj);
            }
            long j13 = 0;
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                zzck.zze zzeVar2 = this.f12308c;
                if (zzeVar2 != zzeVar) {
                    zzck.zze zzeVar3 = new zzck.zze();
                    while (true) {
                        zzck.zza zzaVar = zzck.f12305t;
                        zzaVar.c(zzeVar3, zzeVar2);
                        if (zzaVar.g(this, zzeVar2, zzeVar3)) {
                            j12 = j13;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f12306a;
                                    if ((obj2 != null) & f(obj2)) {
                                        return c(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    b(zzeVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            b(zzeVar3);
                            break;
                        }
                        long j14 = j13;
                        zzeVar2 = this.f12308c;
                        if (zzeVar2 != zzeVar) {
                            j13 = j14;
                        }
                    }
                }
                Object obj3 = this.f12306a;
                Objects.requireNonNull(obj3);
                return c(obj3);
            }
            j12 = 0;
            while (nanos > j12) {
                Object obj4 = this.f12306a;
                if ((obj4 != null) & f(obj4)) {
                    return c(obj4);
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
            String strConcat = "Waited " + j11 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < j12) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j15 = -nanos;
                long jConvert = timeUnit.convert(j15, TimeUnit.NANOSECONDS);
                long nanos2 = j15 - timeUnit.toNanos(jConvert);
                boolean z11 = jConvert == j12 || nanos2 > 1000;
                if (jConvert > j12) {
                    String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                    if (z11) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = strConcat3.concat(" ");
                }
                if (z11) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(ep.a.D(strConcat, " for ", string));
        }
        throw new InterruptedException();
    }
}
