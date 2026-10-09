package com.google.android.gms.internal.play_billing;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzck<V> extends zzdf implements zzcz<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f12302d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zzcy f12303e = new zzcy(zzcj.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f12304f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final zza f12305t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f12306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile zzcj.zzd f12307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile zze f12308c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    abstract class zza {
        public abstract zzcj.zzd a(zzcj zzcjVar, zzcj.zzd zzdVar);

        public abstract zze b(zzcj zzcjVar);

        public abstract void c(zze zzeVar, zze zzeVar2);

        public abstract void d(zze zzeVar, Thread thread);

        public abstract boolean e(zzcj zzcjVar, zzcj.zzd zzdVar, zzcj.zzd zzdVar2);

        public abstract boolean f(zzck zzckVar, Object obj, Object obj2);

        public abstract boolean g(zzck zzckVar, zze zzeVar, zze zzeVar2);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    final class zzb extends zza {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AtomicReferenceFieldUpdater f12309a = AtomicReferenceFieldUpdater.newUpdater(zze.class, Thread.class, "a");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AtomicReferenceFieldUpdater f12310b = AtomicReferenceFieldUpdater.newUpdater(zze.class, zze.class, "b");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AtomicReferenceFieldUpdater f12311c = AtomicReferenceFieldUpdater.newUpdater(zzck.class, zze.class, "c");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final AtomicReferenceFieldUpdater f12312d = AtomicReferenceFieldUpdater.newUpdater(zzck.class, zzcj.zzd.class, "b");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final AtomicReferenceFieldUpdater f12313e = AtomicReferenceFieldUpdater.newUpdater(zzck.class, Object.class, "a");

        private zzb() {
            throw null;
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        public final zzcj.zzd a(zzcj zzcjVar, zzcj.zzd zzdVar) {
            return (zzcj.zzd) f12312d.getAndSet(zzcjVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        public final zze b(zzcj zzcjVar) {
            return (zze) f12311c.getAndSet(zzcjVar, zze.f12320c);
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        public final void c(zze zzeVar, zze zzeVar2) {
            f12310b.lazySet(zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        public final void d(zze zzeVar, Thread thread) {
            f12309a.lazySet(zzeVar, thread);
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        public final boolean e(zzcj zzcjVar, zzcj.zzd zzdVar, zzcj.zzd zzdVar2) {
            return zzcl.a(f12312d, zzcjVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        public final boolean f(zzck zzckVar, Object obj, Object obj2) {
            return zzcl.a(f12313e, zzckVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        public final boolean g(zzck zzckVar, zze zzeVar, zze zzeVar2) {
            return zzcl.a(f12311c, zzckVar, zzeVar, zzeVar2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    final class zzc extends zza {
        private zzc() {
            throw null;
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        public final zzcj.zzd a(zzcj zzcjVar, zzcj.zzd zzdVar) {
            zzcj.zzd zzdVar2;
            synchronized (zzcjVar) {
                try {
                    zzdVar2 = zzcjVar.f12307b;
                    if (zzdVar2 != zzdVar) {
                        zzcjVar.f12307b = zzdVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        public final zze b(zzcj zzcjVar) {
            zze zzeVar;
            zze zzeVar2 = zze.f12320c;
            synchronized (zzcjVar) {
                try {
                    zzeVar = zzcjVar.f12308c;
                    if (zzeVar != zzeVar2) {
                        zzcjVar.f12308c = zzeVar2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zzeVar;
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        public final void c(zze zzeVar, zze zzeVar2) {
            zzeVar.f12322b = zzeVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        public final void d(zze zzeVar, Thread thread) {
            zzeVar.f12321a = thread;
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        public final boolean e(zzcj zzcjVar, zzcj.zzd zzdVar, zzcj.zzd zzdVar2) {
            synchronized (zzcjVar) {
                try {
                    if (zzcjVar.f12307b != zzdVar) {
                        return false;
                    }
                    zzcjVar.f12307b = zzdVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        public final boolean f(zzck zzckVar, Object obj, Object obj2) {
            synchronized (zzckVar) {
                try {
                    if (zzckVar.f12306a != obj) {
                        return false;
                    }
                    zzckVar.f12306a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        public final boolean g(zzck zzckVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzckVar) {
                try {
                    if (zzckVar.f12308c != zzeVar) {
                        return false;
                    }
                    zzckVar.f12308c = zzeVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    final class zzd extends zza {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unsafe f12314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final long f12315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final long f12316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f12317d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f12318e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final long f12319f;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e8) {
                    throw new RuntimeException("Could not initialize intrinsics", e8.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: com.google.android.gms.internal.play_billing.zzcn
                    @Override // java.security.PrivilegedExceptionAction
                    public final Object run() throws IllegalAccessException {
                        Unsafe unsafe2 = zzck.zzd.f12314a;
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                f12316c = unsafe.objectFieldOffset(zzck.class.getDeclaredField("c"));
                f12315b = unsafe.objectFieldOffset(zzck.class.getDeclaredField("b"));
                f12317d = unsafe.objectFieldOffset(zzck.class.getDeclaredField("a"));
                f12318e = unsafe.objectFieldOffset(zze.class.getDeclaredField("a"));
                f12319f = unsafe.objectFieldOffset(zze.class.getDeclaredField("b"));
                f12314a = unsafe;
            } catch (NoSuchFieldException e10) {
                throw new RuntimeException(e10);
            }
        }

        private zzd() {
            throw null;
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        public final zzcj.zzd a(zzcj zzcjVar, zzcj.zzd zzdVar) {
            zzcj.zzd zzdVar2;
            do {
                zzdVar2 = zzcjVar.f12307b;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!e(zzcjVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        public final zze b(zzcj zzcjVar) {
            zze zzeVar;
            zze zzeVar2 = zze.f12320c;
            do {
                zzeVar = zzcjVar.f12308c;
                if (zzeVar2 == zzeVar) {
                    break;
                }
            } while (!g(zzcjVar, zzeVar, zzeVar2));
            return zzeVar;
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        public final void c(zze zzeVar, zze zzeVar2) {
            f12314a.putObject(zzeVar, f12319f, zzeVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        public final void d(zze zzeVar, Thread thread) {
            f12314a.putObject(zzeVar, f12318e, thread);
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        public final boolean e(zzcj zzcjVar, zzcj.zzd zzdVar, zzcj.zzd zzdVar2) {
            return zzcm.a(f12314a, zzcjVar, f12315b, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        public final boolean f(zzck zzckVar, Object obj, Object obj2) {
            return zzcm.a(f12314a, zzckVar, f12317d, obj, obj2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzck.zza
        public final boolean g(zzck zzckVar, zze zzeVar, zze zzeVar2) {
            return zzcm.a(f12314a, zzckVar, f12316c, zzeVar, zzeVar2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    final class zze {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zze f12320c = new zze();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Thread f12321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile zze f12322b;

        public zze() {
            zzck.f12305t.d(this, Thread.currentThread());
        }
    }

    static {
        boolean z11;
        zza zzcVar;
        Throwable th2;
        Throwable th3;
        try {
            z11 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z11 = false;
        }
        f12304f = z11;
        String property = System.getProperty("java.runtime.name", BuildConfig.VERSION_NAME);
        Throwable th4 = null;
        if (property == null || property.contains("Android")) {
            try {
                zzcVar = new zzd();
            } catch (Error | Exception e8) {
                try {
                    zzcVar = new zzb();
                } catch (Error | Exception e10) {
                    th4 = e10;
                    zzcVar = new zzc();
                }
                th2 = th4;
                th3 = e8;
            }
        } else {
            try {
                zzcVar = new zzb();
            } catch (NoClassDefFoundError unused2) {
                zzcVar = new zzc();
            }
        }
        th2 = null;
        th3 = null;
        f12305t = zzcVar;
        if (th2 != null) {
            zzcy zzcyVar = f12303e;
            Logger loggerA = zzcyVar.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th3);
            zzcyVar.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }

    public final void b(zze zzeVar) {
        zzeVar.f12321a = null;
        while (true) {
            zze zzeVar2 = this.f12308c;
            if (zzeVar2 != zze.f12320c) {
                zze zzeVar3 = null;
                while (zzeVar2 != null) {
                    zze zzeVar4 = zzeVar2.f12322b;
                    if (zzeVar2.f12321a != null) {
                        zzeVar3 = zzeVar2;
                    } else if (zzeVar3 != null) {
                        zzeVar3.f12322b = zzeVar4;
                        if (zzeVar3.f12321a == null) {
                        }
                    } else if (!f12305t.g(this, zzeVar2, zzeVar4)) {
                    }
                    zzeVar2 = zzeVar4;
                }
                return;
            }
            return;
        }
    }
}
