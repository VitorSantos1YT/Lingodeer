package com.android.billingclient.api;

import a.ar.MFeWs;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzam;
import com.google.android.gms.internal.play_billing.zzaz;
import com.google.android.gms.internal.play_billing.zzbi;
import com.google.android.gms.internal.play_billing.zzbl;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzcu;
import com.google.android.gms.internal.play_billing.zzdj;
import com.google.android.gms.internal.play_billing.zzdk;
import com.google.android.gms.internal.play_billing.zzhv;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzhz;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzic;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzig;
import com.google.android.gms.internal.play_billing.zzil;
import com.google.android.gms.internal.play_billing.zziq;
import com.google.android.gms.internal.play_billing.zzis;
import com.google.android.gms.internal.play_billing.zzjt;
import com.google.android.gms.internal.play_billing.zzjv;
import hh.p0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ko.Zea.ealNNtLp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class d {
    public ExecutorService A;
    public final Long B;
    public final zzbl C;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7475d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile h f7477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f7478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ob.c f7479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile zzam f7480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile y f7481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7482k;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7484n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f7485o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7486p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f7487q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f7488r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f7489s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7490t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7491u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7492v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f7493w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f7494x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ay.k0 f7495y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f7496z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7472a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile int f7473b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f7476e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7483l = 0;

    public d(ay.k0 k0Var, Context context, c cVar) {
        long jNextLong = new Random().nextLong();
        this.B = Long.valueOf(jNextLong);
        this.C = zzaz.f12242a;
        this.f7474c = "8.0.0";
        String strY = y();
        this.f7475d = strY;
        this.f7478g = context.getApplicationContext();
        zziq zziqVarZ = zzis.z();
        zziqVarZ.h();
        zzis.x((zzis) zziqVarZ.f12378b);
        if (strY != null) {
            zziqVarZ.h();
            zzis.y((zzis) zziqVarZ.f12378b, strY);
        }
        String packageName = this.f7478g.getPackageName();
        zziqVarZ.h();
        zzis.v((zzis) zziqVarZ.f12378b, packageName);
        zziqVarZ.h();
        zzis.s((zzis) zziqVarZ.f12378b, jNextLong);
        zziqVarZ.h();
        zzis.w((zzis) zziqVarZ.f12378b);
        int i11 = Build.VERSION.SDK_INT;
        zziqVarZ.h();
        zzis.p((zzis) zziqVarZ.f12378b, i11);
        zziqVarZ.i();
        try {
            int i12 = this.f7478g.getPackageManager().getPackageInfo(this.f7478g.getPackageName(), 0).versionCode;
            zziqVarZ.h();
            zzis.q((zzis) zziqVarZ.f12378b, i12);
        } catch (Throwable unused) {
            int i13 = zzc.f12272a;
        }
        ob.c cVar2 = new ob.c(this.f7478g, (zzis) zziqVarZ.f());
        this.f7479h = cVar2;
        int i14 = zzc.f12272a;
        this.f7477f = new h(this.f7478g, null, cVar2);
        this.f7495y = k0Var;
        this.f7478g.getPackageName();
    }

    public static Future h(Callable callable, long j11, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new aw.t(futureSubmit, runnable, false, 4), (long) (j11 * 0.95d));
            return futureSubmit;
        } catch (Exception unused) {
            int i11 = zzc.f12272a;
            return null;
        }
    }

    public static void s(d dVar, int i11) {
        if (i11 != 0) {
            dVar.m(0);
            return;
        }
        synchronized (dVar.f7472a) {
            try {
                if (dVar.f7473b == 3) {
                    return;
                }
                dVar.m(2);
                h hVar = dVar.f7477f != null ? dVar.f7477f : null;
                if (hVar != null) {
                    boolean z11 = dVar.f7492v;
                    l0 l0Var = (l0) hVar.f7512e;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    hVar.f7508a = z11;
                    l0 l0Var2 = (l0) hVar.f7513f;
                    Context context = (Context) hVar.f7509b;
                    l0Var2.a(context, intentFilter2);
                    if (hVar.f7508a) {
                        l0Var.b(context, intentFilter);
                    } else {
                        l0Var.a(context, intentFilter);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String y() {
        try {
            return (String) md.a.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void A(zzie zzieVar, int i11, j jVar) {
        try {
            int i12 = h0.f7514a;
            j(h0.b(zzieVar, i11, jVar, null, zzil.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable unused) {
            int i13 = zzc.f12272a;
        }
    }

    public final void B(zzie zzieVar, j jVar, long j11) {
        try {
            int i11 = h0.f7514a;
            try {
                this.f7479h.x(h0.b(zzieVar, 2, jVar, null, zzil.BROADCAST_ACTION_UNSPECIFIED), this.f7483l, j11);
            } catch (Throwable unused) {
                int i12 = zzc.f12272a;
            }
        } catch (Throwable unused2) {
            int i13 = zzc.f12272a;
        }
    }

    public final void C(zzie zzieVar, int i11, j jVar, String str) {
        try {
            int i12 = h0.f7514a;
            j(h0.b(zzieVar, i11, jVar, str, zzil.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable unused) {
            int i13 = zzc.f12272a;
        }
    }

    public final void D(zzie zzieVar, j jVar, long j11, boolean z11) {
        try {
            int i11 = h0.f7514a;
            try {
                this.f7479h.z(h0.b(zzieVar, 2, jVar, null, zzil.BROADCAST_ACTION_UNSPECIFIED), this.f7483l, j11, z11);
            } catch (Throwable unused) {
                int i12 = zzc.f12272a;
            }
        } catch (Throwable unused2) {
            int i13 = zzc.f12272a;
        }
    }

    public final void E(zzie zzieVar, j jVar, String str, long j11, boolean z11) {
        try {
            int i11 = h0.f7514a;
            try {
                this.f7479h.z(h0.b(zzieVar, 2, jVar, str, zzil.BROADCAST_ACTION_UNSPECIFIED), this.f7483l, j11, z11);
            } catch (Throwable unused) {
                int i12 = zzc.f12272a;
            }
        } catch (Throwable unused2) {
            int i13 = zzc.f12272a;
        }
    }

    public final void F(j jVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.f7476e.post(new aw.t(this, jVar, false, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(b bVar, a5.j jVar) {
        if (h(new u(this, jVar, bVar, 0), 30000L, new aw.t(this, jVar, 0 == true ? 1 : 0, 2), t(), g()) == null) {
            j jVarW = w();
            A(zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC, 3, jVarW);
            jVar.n(jVarW);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041 A[Catch: all -> 0x0049, TRY_LEAVE, TryCatch #2 {, blocks: (B:17:0x003d, B:19:0x0041), top: B:41:0x003d, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void b() {
        ExecutorService executorService;
        try {
            int i11 = h0.f7514a;
            k(h0.c(12, zzil.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable unused) {
            int i12 = zzc.f12272a;
        }
        synchronized (this.f7472a) {
            try {
                if (this.f7477f != null) {
                    h hVar = this.f7477f;
                    l0 l0Var = (l0) hVar.f7512e;
                    Context context = (Context) hVar.f7509b;
                    l0Var.c(context);
                    ((l0) hVar.f7513f).c(context);
                    try {
                        zzc.h("BillingClient", "Unbinding from service.");
                        o();
                    } catch (Throwable unused2) {
                        int i13 = zzc.f12272a;
                    }
                    try {
                        try {
                            synchronized (this) {
                                executorService = this.A;
                                if (executorService != null) {
                                    executorService.shutdownNow();
                                    this.A = null;
                                }
                            }
                        } catch (Throwable unused3) {
                            int i14 = zzc.f12272a;
                        }
                        m(3);
                    } catch (Throwable th2) {
                        m(3);
                        throw th2;
                    }
                } else {
                    zzc.h("BillingClient", "Unbinding from service.");
                    o();
                    synchronized (this) {
                        executorService = this.A;
                        if (executorService != null) {
                            executorService.shutdownNow();
                            this.A = null;
                        }
                        m(3);
                    }
                }
            } catch (Throwable unused4) {
                int i15 = zzc.f12272a;
            }
            throw th;
        }
    }

    public void d(hd.b bVar, a5.f fVar) {
        if (h(new u(this, fVar, bVar, 1), 30000L, new aw.t(this, fVar, false, 5), t(), g()) == null) {
            j jVarW = w();
            A(zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC, 7, jVarW);
            zzbt zzbtVarN = zzbt.n();
            zzbt.n();
            rz.t tVar = (rz.t) fVar.f378b;
            kotlin.jvm.internal.m.c(jVarW);
            tVar.J(new p(jVarW, zzbtVarN));
        }
    }

    public final void e(c7.a aVar, q qVar) {
        if (h(new u(this, qVar, aVar.f6641a, 2), 30000L, new aw.t(this, qVar, false, 6), t(), g()) == null) {
            j jVarW = w();
            A(zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC, 9, jVarW);
            qVar.a(jVarW, zzbt.n());
        }
    }

    public void f(e eVar) {
        n(eVar);
    }

    public final synchronized ExecutorService g() {
        try {
            if (this.A == null) {
                this.A = Executors.newFixedThreadPool(zzc.f12272a, new w(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.A;
    }

    public final void i(int i11, zzie zzieVar, Exception exc) {
        zzhx zzhxVar;
        int i12 = zzc.f12272a;
        String strA = h0.a(exc);
        try {
            zzic zzicVarU = zzig.u();
            zzicVarU.h();
            zzig.t((zzig) zzicVarU.f12378b, i11);
            if (zzieVar != null) {
                zzicVarU.i(zzieVar);
            }
            if (strA != null) {
                zzicVarU.h();
                zzig.p((zzig) zzicVarU.f12378b, strA);
            }
            zzhv zzhvVarW = zzhx.w();
            zzhvVarW.i(zzicVarU);
            zzhvVarW.k(30);
            zzhxVar = (zzhx) zzhvVarW.f();
        } catch (Throwable unused) {
            int i13 = zzc.f12272a;
            zzhxVar = null;
        }
        this.f7479h.w(zzhxVar);
    }

    public final void j(zzhx zzhxVar) {
        try {
            ob.c cVar = this.f7479h;
            int i11 = this.f7483l;
            cVar.getClass();
            try {
                zziq zziqVar = (zziq) ((zzis) cVar.f44799b).h();
                zziqVar.h();
                zzis.r((zzis) zziqVar.f12378b, i11);
                cVar.f44799b = (zzis) zziqVar.f();
                cVar.w(zzhxVar);
            } catch (Throwable unused) {
                int i12 = zzc.f12272a;
            }
        } catch (Throwable unused2) {
            int i13 = zzc.f12272a;
        }
    }

    public final void k(zzib zzibVar) {
        try {
            ob.c cVar = this.f7479h;
            int i11 = this.f7483l;
            cVar.getClass();
            try {
                zziq zziqVar = (zziq) ((zzis) cVar.f44799b).h();
                zziqVar.h();
                zzis.r((zzis) zziqVar.f12378b, i11);
                zzis zzisVar = (zzis) zziqVar.f();
                cVar.f44799b = zzisVar;
                try {
                    cVar.D(zzibVar, zzisVar);
                } catch (Throwable unused) {
                    int i12 = zzc.f12272a;
                }
            } catch (Throwable unused2) {
                int i13 = zzc.f12272a;
            }
        } catch (Throwable unused3) {
            int i14 = zzc.f12272a;
        }
    }

    public final void l(j jVar, zzie zzieVar) {
        try {
            int i11 = h0.f7514a;
            zzhv zzhvVar = (zzhv) h0.b(zzieVar, 6, jVar, null, zzil.BROADCAST_ACTION_UNSPECIFIED).h();
            zzjt zzjtVarT = zzjv.t();
            zzjtVarT.i(false);
            zzjtVarT.j();
            zzhvVar.j(zzjtVarT);
            j((zzhx) zzhvVar.f());
        } catch (Throwable unused) {
            int i12 = zzc.f12272a;
        }
    }

    public final void m(int i11) {
        String str;
        String str2;
        synchronized (this.f7472a) {
            try {
                if (this.f7473b == 3) {
                    return;
                }
                int i12 = this.f7473b;
                if (i12 == 0) {
                    str = "DISCONNECTED";
                } else if (i12 != 1) {
                    str = i12 != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str = "CONNECTING";
                }
                if (i11 == 0) {
                    str2 = "DISCONNECTED";
                } else if (i11 != 1) {
                    str2 = i11 != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str2 = "CONNECTING";
                }
                zzc.h("BillingClient", "Setting clientState from " + str + " to " + str2);
                this.f7473b = i11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(e eVar) {
        zzie zzieVar;
        j jVarV;
        j jVar;
        synchronized (this.f7472a) {
            try {
                if (r()) {
                    jVarV = v();
                } else {
                    if (this.f7473b == 1) {
                        int i11 = zzc.f12272a;
                        zzie zzieVar2 = zzie.BILLING_CLIENT_CONNECTING;
                        jVar = j0.f7525d;
                        l(jVar, zzieVar2);
                    } else if (this.f7473b == 3) {
                        int i12 = zzc.f12272a;
                        zzie zzieVar3 = zzie.BILLING_CLIENT_CLOSED;
                        jVar = j0.f7531j;
                        l(jVar, zzieVar3);
                    } else {
                        m(1);
                        o();
                        zzc.h("BillingClient", "Starting in-app billing setup.");
                        this.f7481j = new y(this, eVar);
                        zzbi zzbiVar = this.f7481j.f7591b;
                        zzbiVar.f12251c = 0L;
                        zzbiVar.f12250b = false;
                        zzbiVar.a();
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> listQueryIntentServices = this.f7478g.getPackageManager().queryIntentServices(intent, 0);
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            zzieVar = zzie.INTENT_SERVICE_NOT_FOUND;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    zzieVar = zzie.INVALID_PHONESKY_PACKAGE;
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.f7474c);
                                    synchronized (this.f7472a) {
                                        try {
                                            if (this.f7473b == 2) {
                                                jVarV = v();
                                            } else if (this.f7473b != 1) {
                                                zzie zzieVar4 = zzie.BILLING_CLIENT_TRANSITIONED_OUT_OF_CONNECTING;
                                                jVar = j0.f7531j;
                                                l(jVar, zzieVar4);
                                            } else {
                                                y yVar = this.f7481j;
                                                if (this.f7478g.bindService(intent2, yVar, 1)) {
                                                    zzc.h("BillingClient", "Service was bonded successfully.");
                                                    jVarV = null;
                                                } else {
                                                    zzieVar = zzie.BILLING_SERVICE_BLOCKED;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                            } else {
                                zzieVar = zzie.INVALID_PHONESKY_PACKAGE;
                            }
                        }
                        m(0);
                        zzc.h("BillingClient", "Billing service unavailable on device.");
                        jVarV = j0.f7523b;
                        l(jVarV, zzieVar);
                    }
                    jVarV = jVar;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (jVarV != null) {
            eVar.b(jVarV);
        }
    }

    public final void o() {
        synchronized (this.f7472a) {
            if (this.f7481j != null) {
                try {
                    try {
                        this.f7478g.unbindService(this.f7481j);
                        this.f7480i = null;
                        this.f7481j = null;
                    } catch (Throwable unused) {
                        int i11 = zzc.f12272a;
                        this.f7480i = null;
                        this.f7481j = null;
                    }
                } catch (Throwable th2) {
                    this.f7480i = null;
                    this.f7481j = null;
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean p() {
        try {
            long j11 = Build.VERSION.SDK_INT < 29 ? 0L : 3000L;
            zzc.h("BillingClient", "Already connected or not opted into auto reconnection.");
            int i11 = ((j) zzcu.a(j0.f7530i).get(j11, TimeUnit.MILLISECONDS)).f7519a;
            if (i11 == 0) {
                zzc.h("BillingClient", "Reconnection succeeded with result: " + i11);
            }
        } catch (Exception e8) {
            if (e8 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            int i12 = zzc.f12272a;
        }
        return r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean q() {
        zzbi zzbiVar = new zzbi(this.C);
        zzbiVar.a();
        long j11 = 30000;
        int i11 = 1;
        long jConvert = 30000;
        while (i11 <= 3) {
            try {
                long jMax = Math.max(0L, jConvert);
                if (jMax <= 0) {
                    int i12 = zzc.f12272a;
                    return r();
                }
                zzc.h("BillingClient", "Already connected or not opted into auto reconnection.");
                int i13 = ((j) zzcu.a(j0.f7530i).get(jMax, TimeUnit.MILLISECONDS)).f7519a;
                if (i13 == 0) {
                    zzc.h("BillingClient", "Reconnection succeeded with result: " + i13);
                    return r();
                }
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                boolean z11 = zzbiVar.f12250b;
                zzbl zzblVar = zzbiVar.f12249a;
                long jA = z11 ? (zzblVar.a() - zzbiVar.f12252d) + zzbiVar.f12251c : zzbiVar.f12251c;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                long jConvert2 = j11 - timeUnit.convert(jA, timeUnit2);
                long j12 = j11;
                long jPow = ((long) Math.pow(2.0d, i11 - 1)) * 1000;
                if (jConvert2 < jPow) {
                    return r();
                }
                if (i11 >= 3 || jPow <= 0) {
                    jConvert = jConvert2;
                } else {
                    try {
                        Thread.sleep(jPow);
                        jConvert = j12 - timeUnit.convert(zzbiVar.f12250b ? (zzblVar.a() - zzbiVar.f12252d) + zzbiVar.f12251c : zzbiVar.f12251c, timeUnit2);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        int i14 = zzc.f12272a;
                    }
                }
                i11++;
                j11 = j12;
            } catch (Exception e8) {
                if (e8 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                int i15 = zzc.f12272a;
            }
        }
        int i16 = zzc.f12272a;
        return r();
    }

    public final boolean r() {
        boolean z11;
        synchronized (this.f7472a) {
            try {
                z11 = false;
                if (this.f7473b == 2 && this.f7480i != null && this.f7481j != null) {
                    z11 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public final Handler t() {
        return Looper.myLooper() == null ? this.f7476e : new Handler(Looper.myLooper());
    }

    public final ij.d u(j jVar, zzie zzieVar, Exception exc) {
        int i11 = zzc.f12272a;
        C(zzieVar, 7, jVar, h0.a(exc));
        return new ij.d(jVar.f7519a, jVar.f7521c, new ArrayList(), new ArrayList());
    }

    public final j v() {
        zzc.h("BillingClient", "Service connection is valid. No need to re-initialize.");
        zzhz zzhzVarU = zzib.u();
        zzhzVarU.h();
        zzib.t((zzib) zzhzVarU.f12378b, 6);
        zzjt zzjtVarT = zzjv.t();
        zzjtVarT.h();
        zzjv.s((zzjv) zzjtVarT.f12378b);
        zzjtVarT.i(false);
        zzjtVarT.j();
        zzhzVarU.h();
        zzib.s((zzib) zzhzVarU.f12378b, (zzjv) zzjtVarT.f());
        k((zzib) zzhzVarU.f());
        return j0.f7530i;
    }

    public final j w() {
        int[] iArr = {0, 3};
        synchronized (this.f7472a) {
            for (int i11 = 0; i11 < 2; i11++) {
                if (this.f7473b == iArr[i11]) {
                    return j0.f7531j;
                }
            }
            return j0.f7529h;
        }
    }

    public final void x() {
        if (TextUtils.isEmpty(null)) {
            this.f7478g.getPackageName();
        }
    }

    public final ob.e z(j jVar, zzie zzieVar, Exception exc) {
        C(zzieVar, 9, jVar, h0.a(exc));
        int i11 = zzc.f12272a;
        return new ob.e(jVar, (ArrayList) null);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0283 A[EDGE_INSN: B:117:0x0283->B:84:0x01c3 BREAK  A[LOOP:5: B:77:0x018f->B:97:0x0212]] */
    /* JADX WARN: Code duplicated, block: B:314:0x0708  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.android.billingclient.api.d] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r5v10, types: [long] */
    /* JADX WARN: Type inference failed for: r5v11, types: [long] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    public j c(Activity activity, final h hVar) {
        String str;
        String str2;
        j jVarA;
        k kVar;
        j jVarA2;
        long j11;
        long j12;
        boolean z11;
        String str3;
        Future futureH;
        String str4;
        ?? r9;
        ?? r11;
        ?? r12;
        ?? r13;
        zzie zzieVarA;
        String string;
        Object obj;
        String str5;
        boolean z12;
        String str6;
        boolean z13;
        int i11;
        long jNextLong = new Random().nextLong();
        if (this.f7477f == null || ((r) this.f7477f.f7510c) == null) {
            zzie zzieVar = zzie.MISSING_LISTENER;
            j jVar = j0.f7537q;
            B(zzieVar, jVar, jNextLong);
            return jVar;
        }
        if (!p()) {
            zzie zzieVar2 = zzie.SERVICE_CONNECTION_NOT_READY;
            j jVar2 = j0.f7531j;
            B(zzieVar2, jVar2, jNextLong);
            F(jVar2);
            return jVar2;
        }
        synchronized (this.f7472a) {
            try {
                if (this.f7481j != null) {
                    this.f7481j.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList) hVar.f7513f);
        zzbt zzbtVar = (zzbt) hVar.f7512e;
        Iterator it = arrayList.iterator();
        if ((it.hasNext() ? it.next() : null) != null) {
            throw new ClassCastException();
        }
        Iterator it2 = zzbtVar.iterator();
        f fVar = (f) (it2.hasNext() ? it2.next() : null);
        o oVar = fVar.f7502a;
        String str7 = oVar.f7564c;
        String str8 = oVar.f7565d;
        if (str8.equals("subs") && !this.f7482k) {
            int i12 = zzc.f12272a;
            zzie zzieVar3 = zzie.SUBSCRIPTIONS_NOT_SUPPORTED;
            j jVar3 = j0.f7533l;
            D(zzieVar3, jVar3, jNextLong, false);
            F(jVar3);
            return jVar3;
        }
        if (((String) hVar.f7509b) == null && ((String) hVar.f7510c) == null) {
            c0 c0Var = (c0) hVar.f7511d;
            c0Var.getClass();
            if (c0Var.f7470b == 0 && !hVar.f7508a) {
                zzbt zzbtVar2 = (zzbt) hVar.f7512e;
                if (zzbtVar2 != null) {
                    int size = zzbtVar2.size();
                    for (int i13 = 0; i13 < size; i13++) {
                    }
                }
            } else if (!this.m) {
                int i14 = zzc.f12272a;
                zzie zzieVar4 = zzie.EXTRA_PARAMS_NOT_SUPPORTED;
                j jVar4 = j0.f7527f;
                D(zzieVar4, jVar4, jNextLong, false);
                F(jVar4);
                return jVar4;
            }
        } else if (!this.m) {
            int i15 = zzc.f12272a;
            zzie zzieVar5 = zzie.EXTRA_PARAMS_NOT_SUPPORTED;
            j jVar5 = j0.f7527f;
            D(zzieVar5, jVar5, jNextLong, false);
            F(jVar5);
            return jVar5;
        }
        if (arrayList.size() > 1 && !this.f7488r) {
            int i16 = zzc.f12272a;
            zzie zzieVar6 = zzie.MULTI_ITEM_NOT_SUPPORTED;
            j jVar6 = j0.m;
            D(zzieVar6, jVar6, jNextLong, false);
            F(jVar6);
            return jVar6;
        }
        if (!zzbtVar.isEmpty() && !this.f7489s) {
            int i17 = zzc.f12272a;
            zzie zzieVar7 = zzie.PRODUCT_DETAILS_NOT_SUPPORTED;
            j jVar7 = j0.f7535o;
            D(zzieVar7, jVar7, jNextLong, false);
            F(jVar7);
            return jVar7;
        }
        if (!((zzbt) hVar.f7512e).isEmpty()) {
            f fVar2 = (f) ((zzbt) hVar.f7512e).get(0);
            int i18 = 1;
            str = null;
            while (true) {
                if (i18 >= ((zzbt) hVar.f7512e).size()) {
                    str2 = str7;
                    o oVar2 = fVar2.f7502a;
                    String strOptString = oVar2.f7563b.optString("packageName");
                    HashMap map = new HashMap();
                    HashSet hashSet = new HashSet();
                    zzbt zzbtVar3 = (zzbt) hVar.f7512e;
                    int size2 = zzbtVar3.size();
                    int i19 = 0;
                    while (true) {
                        if (i19 < size2) {
                            zzbt zzbtVar4 = zzbtVar3;
                            f fVar3 = (f) zzbtVar3.get(i19);
                            int i21 = size2;
                            o oVar3 = fVar3.f7502a;
                            int i22 = i19;
                            ArrayList arrayList2 = oVar3.f7569h;
                            String str9 = oVar3.f7564c;
                            if (arrayList2 != null && fVar3.f7503b == null) {
                                jVarA = j0.a(5, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: " + str9);
                                break;
                            }
                            if (map.containsKey(str9)) {
                                jVarA = j0.a(5, "ProductId can not be duplicated. Invalid product id: " + oVar3.f7564c + ".");
                                break;
                            }
                            map.put(oVar3.f7564c, fVar3);
                            if (!oVar2.f7565d.equals("play_pass_subs") && !oVar3.f7565d.equals("play_pass_subs") && !strOptString.equals(oVar3.f7563b.optString("packageName"))) {
                                jVarA = j0.a(5, ealNNtLp.vcNDCbVSkjfZnL);
                                break;
                            }
                            i19 = i22 + 1;
                            size2 = i21;
                            zzbtVar3 = zzbtVar4;
                            hashSet = hashSet;
                        } else {
                            Iterator it3 = hashSet.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    ArrayList arrayList3 = oVar2.f7570i;
                                    String str10 = fVar2.f7503b;
                                    if (str10 != null && arrayList3 != null) {
                                        int size3 = arrayList3.size();
                                        int i23 = 0;
                                        do {
                                            if (i23 >= size3) {
                                                kVar = null;
                                                break;
                                            }
                                            Object obj2 = arrayList3.get(i23);
                                            i23++;
                                            kVar = (k) obj2;
                                        } while (!str10.equals(kVar.f7542d));
                                        if (kVar != null && kVar.f7545g != null) {
                                            jVarA = j0.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                            break;
                                        }
                                        jVarA = j0.f7530i;
                                        break;
                                    }
                                    jVarA = j0.f7530i;
                                    break;
                                }
                                String str11 = (String) it3.next();
                                if (map.containsKey(str11)) {
                                    jVarA = j0.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str11 + ".");
                                    break;
                                }
                            }
                        }
                    }
                    jVarA2 = jVarA;
                    break;
                }
                f fVar4 = (f) ((zzbt) hVar.f7512e).get(i18);
                str2 = str7;
                if (!fVar4.f7502a.f7565d.equals(fVar2.f7502a.f7565d) && !fVar4.f7502a.f7565d.equals("play_pass_subs")) {
                    jVarA2 = j0.a(5, "All products should have same ProductType.");
                    break;
                }
                i18++;
                str7 = str2;
            }
        } else {
            str2 = str7;
            jVarA2 = j0.f7530i;
            str = null;
        }
        if (jVarA2 != j0.f7530i) {
            D(zzie.INVALID_BILLING_FLOW_PARAMS, jVarA2, jNextLong, false);
            F(jVarA2);
            return jVarA2;
        }
        Bundle bundle = null;
        if (this.m) {
            boolean z14 = this.f7484n;
            this.f7495y.getClass();
            this.f7495y.getClass();
            boolean z15 = this.f7496z;
            String str12 = this.f7474c;
            String str13 = this.f7475d;
            long jLongValue = this.B.longValue();
            this.f7478g.getPackageName();
            int i24 = zzc.f12272a;
            z11 = false;
            final Bundle bundle2 = new Bundle();
            zzc.b(jLongValue, bundle2, str12, str13);
            bundle2.putLong("billingClientTransactionId", j11);
            int i25 = ((c0) hVar.f7511d).f7470b;
            if (i25 != 0) {
                j11 = r4;
                bundle2.putInt("prorationMode", i25);
            }
            j11 = r4;
            if (!TextUtils.isEmpty((String) hVar.f7509b)) {
                bundle2.putString("accountId", (String) hVar.f7509b);
            }
            if (!TextUtils.isEmpty((String) hVar.f7510c)) {
                bundle2.putString("obfuscatedProfileId", (String) hVar.f7510c);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle2.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(str)));
            }
            if (!TextUtils.isEmpty((String) ((c0) hVar.f7511d).f7471c)) {
                bundle2.putString("oldSkuPurchaseToken", (String) ((c0) hVar.f7511d).f7471c);
            }
            if (TextUtils.isEmpty(str)) {
                str5 = str;
            } else {
                str5 = str;
                bundle2.putString("oldSkuPurchaseId", str5);
            }
            ((c0) hVar.f7511d).getClass();
            if (!TextUtils.isEmpty(str5)) {
                ((c0) hVar.f7511d).getClass();
                bundle2.putString("originalExternalTransactionId", str5);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle2.putString("paymentsPurchaseParams", str5);
            }
            if (z14) {
                z12 = true;
                bundle2.putBoolean("enablePendingPurchases", true);
            } else {
                z12 = true;
            }
            if (z15) {
                bundle2.putBoolean("enableAlternativeBilling", z12);
            }
            ArrayList arrayList4 = new ArrayList();
            for (f fVar5 : (zzbt) hVar.f7512e) {
            }
            if (!arrayList4.isEmpty()) {
                zzdj zzdjVarP = zzdk.p();
                zzdjVarP.h();
                zzdk.q((zzdk) zzdjVarP.f12378b, arrayList4);
                bundle2.putByteArray("subscriptionProductReplacementParamsList", ((zzdk) zzdjVarP.f()).b());
            }
            if (arrayList.isEmpty()) {
                ArrayList<String> arrayList5 = new ArrayList<>(zzbtVar.size() - 1);
                ArrayList<String> arrayList6 = new ArrayList<>(zzbtVar.size() - 1);
                ArrayList<String> arrayList7 = new ArrayList<>();
                ArrayList<String> arrayList8 = new ArrayList<>();
                ArrayList<String> arrayList9 = new ArrayList<>();
                ArrayList<Integer> arrayList10 = new ArrayList<>();
                int i26 = 0;
                while (i26 < zzbtVar.size()) {
                    f fVar6 = (f) zzbtVar.get(i26);
                    o oVar4 = fVar6.f7502a;
                    long j13 = j11;
                    if (!oVar4.f7567f.isEmpty()) {
                        arrayList7.add(oVar4.f7567f);
                    }
                    arrayList8.add(fVar6.f7503b);
                    String str14 = oVar4.f7568g;
                    ArrayList arrayList11 = oVar4.f7570i;
                    if (arrayList11 == null || arrayList11.isEmpty()) {
                        str6 = str14;
                        break;
                    }
                    ArrayList arrayList12 = oVar4.f7570i;
                    int size4 = arrayList12.size();
                    int i27 = 0;
                    while (true) {
                        if (i27 >= size4) {
                            str6 = str14;
                            break;
                        }
                        Object obj3 = arrayList12.get(i27);
                        i27++;
                        ArrayList arrayList13 = arrayList12;
                        k kVar2 = (k) obj3;
                        String str15 = str14;
                        if (!TextUtils.isEmpty(kVar2.f7544f)) {
                            str6 = kVar2.f7544f;
                            break;
                        }
                        str14 = str15;
                        arrayList12 = arrayList13;
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        arrayList9.add(str6);
                    }
                    if (i26 > 0) {
                        arrayList5.add(((f) zzbtVar.get(i26)).f7502a.f7564c);
                        arrayList6.add(((f) zzbtVar.get(i26)).f7502a.f7565d);
                    }
                    i26++;
                    j11 = j13;
                }
                j12 = j11;
                bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList8);
                if (!arrayList10.isEmpty()) {
                    bundle2.putIntegerArrayList("autoPayBalanceThresholdList", arrayList10);
                }
                if (!arrayList7.isEmpty()) {
                    bundle2.putStringArrayList("skuDetailsTokens", arrayList7);
                }
                if (!arrayList9.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList9);
                }
                if (!arrayList5.isEmpty()) {
                    bundle2.putStringArrayList("additionalSkus", arrayList5);
                    bundle2.putStringArrayList("additionalSkuTypes", arrayList6);
                }
            } else {
                ArrayList<String> arrayList14 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it4 = arrayList.iterator();
                if (it4.hasNext()) {
                    it4.next().getClass();
                    throw new ClassCastException();
                }
                if (!arrayList14.isEmpty()) {
                    bundle2.putStringArrayList("skuDetailsTokens", arrayList14);
                }
                if (arrayList.size() > 1) {
                    ArrayList<String> arrayList15 = new ArrayList<>(arrayList.size() - 1);
                    ArrayList<String> arrayList16 = new ArrayList<>(arrayList.size() - 1);
                    if (1 < arrayList.size()) {
                        throw p0.e(1, arrayList);
                    }
                    bundle2.putStringArrayList("additionalSkus", arrayList15);
                    bundle2.putStringArrayList(MFeWs.KMdQfb, arrayList16);
                }
                j12 = j11;
            }
            if (bundle2.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.f7486p) {
                zzie zzieVar8 = zzie.OFFER_ID_TOKEN_NOT_SUPPORTED;
                j jVar8 = j0.f7534n;
                D(zzieVar8, jVar8, j12, false);
                F(jVar8);
                return jVar8;
            }
            if (TextUtils.isEmpty(fVar.f7502a.f7563b.optString("packageName"))) {
                z13 = false;
            } else {
                bundle2.putString("skuPackageName", fVar.f7502a.f7563b.optString("packageName"));
                z13 = true;
            }
            str3 = null;
            if (!TextUtils.isEmpty(null)) {
                bundle2.putString("accountName", null);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                int i28 = zzc.f12272a;
            } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                bundle2.putString("proxyPackage", stringExtra);
                try {
                    bundle2.putString("proxyPackageVersion", this.f7478g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle2.putString("proxyPackageVersion", "package not found");
                }
            }
            if (this.f7489s && !zzbtVar.isEmpty()) {
                i11 = 17;
            } else if (this.f7487q && z13) {
                i11 = 15;
            } else {
                i11 = this.f7484n ? 9 : 6;
            }
            final int i29 = i11;
            final String str16 = str2;
            final String str17 = str8;
            futureH = h(new Callable(i29, str16, str17, hVar, bundle2) { // from class: com.android.billingclient.api.m0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f7556b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f7557c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f7558d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Bundle f7559e;

                {
                    this.f7559e = bundle2;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundleC;
                    zzam zzamVar;
                    d dVar = this.f7555a;
                    int i30 = this.f7556b;
                    String str18 = this.f7557c;
                    String str19 = this.f7558d;
                    Bundle bundle3 = this.f7559e;
                    try {
                        synchronized (dVar.f7472a) {
                            zzamVar = dVar.f7480i;
                        }
                        return zzamVar == null ? zzc.c(j0.f7531j, zzie.SERVICE_RESET_TO_NULL) : zzamVar.s(i30, dVar.f7478g.getPackageName(), str18, str19, bundle3);
                    } catch (DeadObjectException e8) {
                        j jVar9 = j0.f7531j;
                        zzie zzieVar9 = zzie.LAUNCH_BILLING_FLOW_EXCEPTION;
                        String strA = h0.a(e8);
                        bundleC = zzc.c(jVar9, zzieVar9);
                        if (strA != null) {
                            bundleC.putString("ADDITIONAL_LOG_DETAILS", strA);
                        }
                        return bundleC;
                    } catch (Exception e10) {
                        j jVar10 = j0.f7529h;
                        zzie zzieVar10 = zzie.LAUNCH_BILLING_FLOW_EXCEPTION;
                        String strA2 = h0.a(e10);
                        bundleC = zzc.c(jVar10, zzieVar10);
                        if (strA2 != null) {
                            bundleC.putString("ADDITIONAL_LOG_DETAILS", strA2);
                        }
                        return bundleC;
                    }
                }
            }, 5000L, null, this.f7476e, g());
            str4 = str17;
            bundle = bundle2;
        } else {
            j11 = r4;
            j12 = j11;
            z11 = false;
            str3 = str;
            String str18 = str8;
            futureH = h(new u(this, str2, str18, 3), 5000L, null, this.f7476e, g());
            str4 = str18;
        }
        try {
            if (futureH == null) {
                try {
                    zzie zzieVar9 = zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC;
                    j jVar9 = j0.f7524c;
                    D(zzieVar9, jVar9, j12, z11);
                    F(jVar9);
                    return jVar9;
                } catch (CancellationException e8) {
                    e = e8;
                    r12 = z11;
                    r13 = j12;
                    int i30 = zzc.f12272a;
                    zzie zzieVar10 = zzie.LAUNCH_BILLING_FLOW_TIMEOUT;
                    j jVar10 = j0.f7532k;
                    E(zzieVar10, jVar10, h0.a(e), r13, r12);
                    F(jVar10);
                    return jVar10;
                } catch (TimeoutException e10) {
                    e = e10;
                    r12 = z11;
                    r13 = j12;
                    int i31 = zzc.f12272a;
                    zzie zzieVar11 = zzie.LAUNCH_BILLING_FLOW_TIMEOUT;
                    j jVar11 = j0.f7532k;
                    E(zzieVar11, jVar11, h0.a(e), r13, r12);
                    F(jVar11);
                    return jVar11;
                } catch (Exception e11) {
                    e = e11;
                    r9 = z11;
                    r11 = j12;
                    int i32 = zzc.f12272a;
                    zzie zzieVar12 = zzie.LAUNCH_BILLING_FLOW_EXCEPTION;
                    j jVar12 = j0.f7531j;
                    E(zzieVar12, jVar12, h0.a(e), r11, r9);
                    F(jVar12);
                    return jVar12;
                }
            }
            boolean z16 = z11;
            long j14 = j12;
            Bundle bundle3 = (Bundle) futureH.get(5000L, TimeUnit.MILLISECONDS);
            int iA = zzc.a("BillingClient", bundle3);
            String strF = zzc.f("BillingClient", bundle3);
            if (iA == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                intent2.putExtra("BUY_INTENT", (PendingIntent) bundle3.getParcelable("BUY_INTENT"));
                intent2.putExtra("billingClientTransactionId", j14);
                intent2.putExtra("wasServiceAutoReconnected", z16);
                activity.startActivity(intent2);
                return j0.f7530i;
            }
            j jVarA3 = j0.a(iA, strF);
            try {
                zzieVarA = (bundle3 == null || (obj = bundle3.get("LOG_REASON")) == null || !(obj instanceof Integer)) ? zzie.REASON_UNSPECIFIED : zzie.a(((Integer) obj).intValue());
            } catch (Throwable th3) {
                "Failed to get log reason from bundle: ".concat(String.valueOf(th3.getMessage()));
                int i33 = zzc.f12272a;
                zzieVarA = zzie.REASON_UNSPECIFIED;
            }
            if (zzieVarA == zzie.REASON_UNSPECIFIED) {
                zzieVarA = zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            }
            zzie zzieVar13 = zzieVarA;
            if (bundle3 == null) {
                string = str3;
            } else {
                try {
                    string = bundle3.getString("ADDITIONAL_LOG_DETAILS");
                } catch (Throwable th4) {
                    "Failed to get additional log details from bundle: ".concat(String.valueOf(th4.getMessage()));
                    int i34 = zzc.f12272a;
                    string = str3;
                }
            }
            try {
                E(zzieVar13, jVarA3, string, j14, z16);
                F(jVarA3);
                return jVarA3;
            } catch (CancellationException e12) {
                e = e12;
                r13 = j14;
                r12 = z16;
                int i35 = zzc.f12272a;
                zzie zzieVar14 = zzie.LAUNCH_BILLING_FLOW_TIMEOUT;
                j jVar13 = j0.f7532k;
                E(zzieVar14, jVar13, h0.a(e), r13, r12);
                F(jVar13);
                return jVar13;
            } catch (TimeoutException e13) {
                e = e13;
                r13 = j14;
                r12 = z16;
                int i36 = zzc.f12272a;
                zzie zzieVar15 = zzie.LAUNCH_BILLING_FLOW_TIMEOUT;
                j jVar14 = j0.f7532k;
                E(zzieVar15, jVar14, h0.a(e), r13, r12);
                F(jVar14);
                return jVar14;
            } catch (Exception e14) {
                e = e14;
                r11 = j14;
                r9 = z16;
                int i37 = zzc.f12272a;
                zzie zzieVar16 = zzie.LAUNCH_BILLING_FLOW_EXCEPTION;
                j jVar15 = j0.f7531j;
                E(zzieVar16, jVar15, h0.a(e), r11, r9);
                F(jVar15);
                return jVar15;
            }
        } catch (CancellationException e15) {
            e = e15;
            r13 = str4;
            r12 = bundle;
        } catch (TimeoutException e16) {
            e = e16;
            r13 = str4;
            r12 = bundle;
        } catch (Exception e17) {
            e = e17;
            r11 = str4;
            r9 = bundle;
        }
    }

    public d(ay.k0 k0Var, Context context, r rVar, c cVar) {
        long jNextLong = new Random().nextLong();
        this.B = Long.valueOf(jNextLong);
        this.C = zzaz.f12242a;
        this.f7474c = "8.0.0";
        String strY = y();
        this.f7475d = strY;
        this.f7478g = context.getApplicationContext();
        zziq zziqVarZ = zzis.z();
        zziqVarZ.h();
        zzis.x((zzis) zziqVarZ.f12378b);
        if (strY != null) {
            zziqVarZ.h();
            zzis.y((zzis) zziqVarZ.f12378b, strY);
        }
        String packageName = this.f7478g.getPackageName();
        zziqVarZ.h();
        zzis.v((zzis) zziqVarZ.f12378b, packageName);
        zziqVarZ.h();
        zzis.s((zzis) zziqVarZ.f12378b, jNextLong);
        zziqVarZ.h();
        zzis.w((zzis) zziqVarZ.f12378b);
        int i11 = Build.VERSION.SDK_INT;
        zziqVarZ.h();
        zzis.p((zzis) zziqVarZ.f12378b, i11);
        zziqVarZ.i();
        try {
            int i12 = this.f7478g.getPackageManager().getPackageInfo(this.f7478g.getPackageName(), 0).versionCode;
            zziqVarZ.h();
            zzis.q((zzis) zziqVarZ.f12378b, i12);
        } catch (Throwable unused) {
            int i13 = zzc.f12272a;
        }
        ob.c cVar2 = new ob.c(this.f7478g, (zzis) zziqVarZ.f());
        this.f7479h = cVar2;
        if (rVar == null) {
            int i14 = zzc.f12272a;
        }
        this.f7477f = new h(this.f7478g, rVar, cVar2);
        this.f7495y = k0Var;
        this.f7496z = false;
        this.f7478g.getPackageName();
    }
}
