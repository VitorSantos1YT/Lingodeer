package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzez {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile zzez f11582i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultClock f11583a = DefaultClock.f9117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f11584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppMeasurementSdk f11585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f11586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile zzcp f11589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile long f11590h;

    public zzez(Context context, Bundle bundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzeb(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f11584b = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f11585c = new AppMeasurementSdk(this);
        this.f11586d = new ArrayList();
        try {
            if (com.google.android.gms.measurement.internal.zzlt.a(context, com.google.android.gms.measurement.internal.zzhu.a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, zzez.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f11588f = true;
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        f(new zzdp(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new zzey(this));
    }

    public static zzez i(Context context, Bundle bundle) {
        Preconditions.g(context);
        if (f11582i == null) {
            synchronized (zzez.class) {
                try {
                    if (f11582i == null) {
                        f11582i = new zzez(context, bundle == null ? new Bundle() : new Bundle(bundle));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f11582i;
    }

    public final String a() {
        zzcm zzcmVar = new zzcm();
        f(new zzdx(this, zzcmVar));
        return zzcmVar.h(500L);
    }

    public final String b() {
        zzcm zzcmVar = new zzcm();
        f(new zzdy(this, zzcmVar));
        return zzcmVar.h(500L);
    }

    public final Map c(String str, String str2, boolean z11) {
        zzcm zzcmVar = new zzcm();
        f(new zzdz(this, str, str2, z11, zzcmVar));
        Bundle bundleJ = zzcmVar.j(5000L);
        if (bundleJ == null || bundleJ.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleJ.size());
        for (String str3 : bundleJ.keySet()) {
            Object obj = bundleJ.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final int d(String str) {
        zzcm zzcmVar = new zzcm();
        f(new zzed(this, str, zzcmVar));
        Integer num = (Integer) zzcm.h1(zzcmVar.j(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final void e(Bundle bundle) {
        f(new zzei(this, bundle));
    }

    public final void f(zzeo zzeoVar) {
        this.f11584b.execute(zzeoVar);
    }

    public final void g(Exception exc, boolean z11, boolean z12) {
        this.f11588f |= z11;
        if (!z11 && z12) {
            f(new zzea(this, exc));
        }
    }

    public final void h(String str, String str2, Bundle bundle, boolean z11) {
        f(new zzen(this, str, str2, bundle, z11));
    }

    public final void j(Intent intent) {
        f(new zzek(this, intent));
    }

    public final void k(AppMeasurementSdk.OnEventListener onEventListener) {
        ArrayList arrayList = this.f11586d;
        synchronized (arrayList) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                try {
                    if (onEventListener.equals(((Pair) arrayList.get(i11)).first)) {
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            zzeq zzeqVar = new zzeq(onEventListener);
            arrayList.add(new Pair(onEventListener, zzeqVar));
            if (this.f11589g != null) {
                try {
                    this.f11589g.registerOnMeasurementEventListener(zzeqVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            f(new zzel(this, zzeqVar));
        }
    }

    public final void l(String str, String str2, Object obj, boolean z11) {
        f(new zzdf(this, str, str2, obj, z11));
    }

    public final void m(Bundle bundle) {
        f(new zzdg(this, bundle));
    }

    public final void n(String str, String str2, Bundle bundle) {
        f(new zzdh(this, str, str2, bundle));
    }

    public final List o(String str, String str2) {
        zzcm zzcmVar = new zzcm();
        f(new zzdi(this, str, str2, zzcmVar));
        List list = (List) zzcm.h1(zzcmVar.j(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final void p(String str) {
        f(new zzdj(this, str));
    }

    public final void q(zzdd zzddVar, String str, String str2) {
        f(new zzdk(this, zzddVar, str, str2));
    }

    public final void r(String str) {
        f(new zzdq(this, str));
    }

    public final void s(String str) {
        f(new zzdr(this, str));
    }

    public final void t(Runnable runnable) {
        f(new zzdt(this, runnable));
    }

    public final String u() {
        zzcm zzcmVar = new zzcm();
        f(new zzdu(this, zzcmVar));
        return zzcmVar.h(500L);
    }

    public final String v() {
        zzcm zzcmVar = new zzcm();
        f(new zzdv(this, zzcmVar));
        return zzcmVar.h(50L);
    }

    public final long w() {
        zzcm zzcmVar = new zzcm();
        f(new zzdw(this, zzcmVar));
        Long l9 = (Long) zzcm.h1(zzcmVar.j(500L), Long.class);
        if (l9 != null) {
            return l9.longValue();
        }
        long jNanoTime = System.nanoTime();
        this.f11583a.getClass();
        long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
        int i11 = this.f11587e + 1;
        this.f11587e = i11;
        return jNextLong + ((long) i11);
    }
}
