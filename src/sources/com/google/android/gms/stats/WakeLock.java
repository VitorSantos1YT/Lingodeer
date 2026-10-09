package com.google.android.gms.stats;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.stats.zzi;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import o4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class WakeLock {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f13711n = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f13712o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f13713p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile zzd f13714q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f13716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScheduledFuture f13718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f13720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.google.android.gms.internal.stats.zzb f13722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DefaultClock f13723i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f13724j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f13725k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f13726l;
    public final ScheduledExecutorService m;

    static {
        new zzb();
    }

    public WakeLock(Context context) {
        boolean zBooleanValue;
        String packageName = context.getPackageName();
        this.f13715a = new Object();
        this.f13717c = 0;
        this.f13720f = new HashSet();
        this.f13721g = true;
        this.f13723i = DefaultClock.f9117a;
        this.f13725k = new HashMap();
        this.f13726l = new AtomicInteger(0);
        Preconditions.e("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f13722h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f13724j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f13724j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb2.toString());
        }
        this.f13716b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = WorkSourceUtil.f9129a;
        synchronized (WorkSourceUtil.class) {
            Boolean bool = WorkSourceUtil.f9131c;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = c.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                WorkSourceUtil.f9131c = Boolean.valueOf(zBooleanValue);
            }
        }
        if (zBooleanValue) {
            int i11 = Strings.f9128a;
            packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoA = Wrappers.a(context).a(0, packageName);
                    if (applicationInfoA == null) {
                        "Could not get applicationInfo from package: ".concat(packageName);
                    } else {
                        int i12 = applicationInfoA.uid;
                        workSource = new WorkSource();
                        Method method2 = WorkSourceUtil.f9130b;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource, Integer.valueOf(i12), packageName);
                            } catch (Exception e8) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e8);
                            }
                        } else {
                            Method method3 = WorkSourceUtil.f9129a;
                            if (method3 != null) {
                                try {
                                    method3.invoke(workSource, Integer.valueOf(i12));
                                } catch (Exception e10) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    "Could not find package: ".concat(packageName);
                }
            }
            if (workSource != null) {
                try {
                    this.f13716b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e11) {
                    Log.wtf("WakeLock", e11.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f13712o;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f13713p) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f13712o;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f13712o = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public final void a(long j11) {
        this.f13726l.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f13711n), 1L);
        if (j11 > 0) {
            jMax = Math.min(j11, jMax);
        }
        synchronized (this.f13715a) {
            try {
                if (!b()) {
                    this.f13722h = com.google.android.gms.internal.stats.zzb.f12492a;
                    this.f13716b.acquire();
                    this.f13723i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f13717c++;
                if (this.f13721g) {
                    TextUtils.isEmpty(null);
                }
                zzc zzcVar = (zzc) this.f13725k.get(null);
                if (zzcVar == null) {
                    zzcVar = new zzc();
                    this.f13725k.put(null, zzcVar);
                }
                zzcVar.f13728a++;
                this.f13723i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j12 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j12 > this.f13719e) {
                    this.f13719e = j12;
                    ScheduledFuture scheduledFuture = this.f13718d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f13718d = this.m.schedule(new Runnable() { // from class: com.google.android.gms.stats.zza
                        @Override // java.lang.Runnable
                        public final void run() {
                            WakeLock wakeLock = this.f13727a;
                            synchronized (wakeLock.f13715a) {
                                try {
                                    if (wakeLock.b()) {
                                        String.valueOf(wakeLock.f13724j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                                        wakeLock.d();
                                        if (wakeLock.b()) {
                                            wakeLock.f13717c = 1;
                                            wakeLock.e();
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    }, jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z11;
        synchronized (this.f13715a) {
            z11 = this.f13717c > 0;
        }
        return z11;
    }

    public final void c() {
        if (this.f13726l.decrementAndGet() < 0) {
            String.valueOf(this.f13724j).concat(" release without a matched acquire!");
        }
        synchronized (this.f13715a) {
            try {
                if (this.f13721g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f13725k.containsKey(null)) {
                    zzc zzcVar = (zzc) this.f13725k.get(null);
                    if (zzcVar != null) {
                        int i11 = zzcVar.f13728a - 1;
                        zzcVar.f13728a = i11;
                        if (i11 == 0) {
                            this.f13725k.remove(null);
                        }
                    }
                } else {
                    String.valueOf(this.f13724j).concat(" counter does not exist");
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f13720f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    public final void e() {
        synchronized (this.f13715a) {
            try {
                if (b()) {
                    if (this.f13721g) {
                        int i11 = this.f13717c - 1;
                        this.f13717c = i11;
                        if (i11 > 0) {
                            return;
                        }
                    } else {
                        this.f13717c = 0;
                    }
                    d();
                    Iterator it = this.f13725k.values().iterator();
                    while (it.hasNext()) {
                        ((zzc) it.next()).f13728a = 0;
                    }
                    this.f13725k.clear();
                    ScheduledFuture scheduledFuture = this.f13718d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f13718d = null;
                        this.f13719e = 0L;
                    }
                    if (this.f13716b.isHeld()) {
                        try {
                            try {
                                this.f13716b.release();
                                if (this.f13722h != null) {
                                    this.f13722h = null;
                                }
                            } catch (RuntimeException e8) {
                                if (!e8.getClass().equals(RuntimeException.class)) {
                                    throw e8;
                                }
                                String.valueOf(this.f13724j).concat(" failed to release!");
                                if (this.f13722h != null) {
                                    this.f13722h = null;
                                }
                            }
                        } catch (Throwable th2) {
                            if (this.f13722h != null) {
                                this.f13722h = null;
                            }
                            throw th2;
                        }
                    } else {
                        String.valueOf(this.f13724j).concat(" should be held!");
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
