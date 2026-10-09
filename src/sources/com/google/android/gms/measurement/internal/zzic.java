package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzic implements zzjg {
    public static volatile zzic F;
    public int A;
    public int B;
    public final long D;
    public final long E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzae f13096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzal f13097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzhh f13098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzgu f13099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzhz f13100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zzoc f13101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zzpp f13102i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zzgn f13103j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final DefaultClock f13104k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zzmb f13105l;
    public final zzlj m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zzd f13106n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final zzlo f13107o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f13108p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public zzgl f13109q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public zznl f13110r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public zzbb f13111s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public zzgi f13112t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public zzlq f13113u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Boolean f13115w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f13116x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile Boolean f13117y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile boolean f13118z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f13114v = false;
    public final AtomicInteger C = new AtomicInteger(0);

    public zzic(zzjs zzjsVar) {
        long jCurrentTimeMillis;
        long jElapsedRealtime;
        Context applicationContext;
        Context context = zzjsVar.f13221a;
        zzae zzaeVar = new zzae();
        this.f13096c = zzaeVar;
        zzfr.f12824a = zzaeVar;
        this.f13094a = context;
        this.f13095b = zzjsVar.f13225e;
        this.f13117y = zzjsVar.f13222b;
        this.f13108p = zzjsVar.f13228h;
        this.f13118z = true;
        com.google.android.gms.internal.measurement.zzlw.a(context);
        this.f13104k = DefaultClock.f9117a;
        Api api = com.google.android.gms.internal.measurement.zzjx.f11653a;
        new com.google.android.gms.internal.measurement.zzkk(context, null, com.google.android.gms.internal.measurement.zzjx.f11653a, Api.ApiOptions.f8664h, GoogleApi.Settings.f8687c).c("com.google.android.gms.measurement#".concat(String.valueOf(context.getPackageName())), new String[0]);
        AtomicReference atomicReference = com.google.android.gms.internal.measurement.zzlk.f11701k;
        if (atomicReference.get() == null) {
            try {
                applicationContext = context.getApplicationContext();
            } catch (NullPointerException unused) {
                com.google.android.gms.internal.measurement.zzlk.b();
                com.google.android.gms.internal.measurement.zzlz.a(Level.WARNING, (Executor) com.google.android.gms.internal.measurement.zzlk.m.get(), null, "context.getApplicationContext() yielded NullPointerException", new Object[0]);
                applicationContext = null;
            }
            if (applicationContext != null) {
                while (!atomicReference.compareAndSet(null, applicationContext) && atomicReference.get() == null) {
                }
            }
        }
        Long l9 = zzjsVar.f13226f;
        if (l9 != null) {
            jCurrentTimeMillis = l9.longValue();
        } else {
            this.f13104k.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.D = jCurrentTimeMillis;
        Long l11 = zzjsVar.f13227g;
        if (l11 != null) {
            jElapsedRealtime = l11.longValue();
        } else {
            this.f13104k.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.E = jElapsedRealtime;
        zzal zzalVar = new zzal(this);
        zzalVar.f12630d = new zzak() { // from class: com.google.android.gms.measurement.internal.zzaj
            @Override // com.google.android.gms.measurement.internal.zzak
            public final /* synthetic */ String d(String str, String str2) {
                return null;
            }
        };
        this.f13097d = zzalVar;
        zzhh zzhhVar = new zzhh(this);
        zzhhVar.j();
        this.f13098e = zzhhVar;
        zzgu zzguVar = new zzgu(this);
        zzguVar.j();
        this.f13099f = zzguVar;
        zzpp zzppVar = new zzpp(this);
        zzppVar.j();
        this.f13102i = zzppVar;
        this.f13103j = new zzgn(new zzjr(this, zzjsVar));
        this.f13106n = new zzd(this);
        zzmb zzmbVar = new zzmb(this);
        zzmbVar.i();
        this.f13105l = zzmbVar;
        zzlj zzljVar = new zzlj(this);
        zzljVar.i();
        this.m = zzljVar;
        zzoc zzocVar = new zzoc(this);
        zzocVar.i();
        this.f13101h = zzocVar;
        zzlo zzloVar = new zzlo(this);
        zzloVar.j();
        this.f13107o = zzloVar;
        zzhz zzhzVar = new zzhz(this);
        zzhzVar.j();
        this.f13100g = zzhzVar;
        com.google.android.gms.internal.measurement.zzdb zzdbVar = zzjsVar.f13224d;
        boolean z11 = zzdbVar == null || zzdbVar.f11498b == 0;
        if (this.f13094a.getApplicationContext() instanceof Application) {
            l(zzljVar);
            if (zzljVar.f13202a.f13094a.getApplicationContext() instanceof Application) {
                Application application = (Application) zzljVar.f13202a.f13094a.getApplicationContext();
                if (zzljVar.f13324c == null) {
                    zzljVar.f13324c = new zzky(zzljVar);
                }
                if (z11) {
                    application.unregisterActivityLifecycleCallbacks(zzljVar.f13324c);
                    application.registerActivityLifecycleCallbacks(zzljVar.f13324c);
                    zzgu zzguVar2 = zzljVar.f13202a.f13099f;
                    m(zzguVar2);
                    zzguVar2.f12949n.a("Registered activity lifecycle callback");
                }
            }
        } else {
            m(zzguVar);
            zzguVar.f12945i.a("Application context is not an Application");
        }
        zzhzVar.p(new zzia(this, zzjsVar));
    }

    public static final void j(zzf zzfVar) {
        if (zzfVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void k(zzje zzjeVar) {
        if (zzjeVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void l(zzg zzgVar) {
        if (zzgVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!zzgVar.f12895b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzgVar.getClass())));
        }
    }

    public static final void m(zzjf zzjfVar) {
        if (zzjfVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!zzjfVar.f13203b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzjfVar.getClass())));
        }
    }

    public static zzic s(Context context, com.google.android.gms.internal.measurement.zzdb zzdbVar, Long l9, Long l11) {
        Bundle bundle;
        if (zzdbVar != null) {
            Bundle bundle2 = zzdbVar.f11500d;
            zzdbVar = new com.google.android.gms.internal.measurement.zzdb(zzdbVar.f11497a, zzdbVar.f11498b, zzdbVar.f11499c, bundle2, null);
        }
        Preconditions.g(context);
        Preconditions.g(context.getApplicationContext());
        if (F == null) {
            synchronized (zzic.class) {
                try {
                    if (F == null) {
                        F = new zzic(new zzjs(context, zzdbVar, l9, l11));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (zzdbVar != null && (bundle = zzdbVar.f11500d) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.g(F);
            F.f13117y = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.g(F);
        return F;
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final zzae a() {
        return this.f13096c;
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final zzgu b() {
        zzgu zzguVar = this.f13099f;
        m(zzguVar);
        return zzguVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final Clock c() {
        return this.f13104k;
    }

    public final boolean d() {
        return g() == 0;
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final zzhz e() {
        zzhz zzhzVar = this.f13100g;
        m(zzhzVar);
        return zzhzVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final Context f() {
        return this.f13094a;
    }

    public final int g() {
        zzhz zzhzVar = this.f13100g;
        m(zzhzVar);
        zzhzVar.g();
        zzal zzalVar = this.f13097d;
        if (zzalVar.u()) {
            return 1;
        }
        m(zzhzVar);
        zzhzVar.g();
        if (!this.f13118z) {
            return 8;
        }
        zzhh zzhhVar = this.f13098e;
        k(zzhhVar);
        zzhhVar.g();
        Boolean boolValueOf = zzhhVar.k().contains("measurement_enabled") ? Boolean.valueOf(zzhhVar.k().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        zzae zzaeVar = zzalVar.f13202a.f13096c;
        Boolean boolT = zzalVar.t("firebase_analytics_collection_enabled");
        if (boolT != null) {
            return boolT.booleanValue() ? 0 : 4;
        }
        return (this.f13117y == null || this.f13117y.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    public final boolean h() {
        zzpp zzppVar;
        boolean z11;
        Context context;
        if (!this.f13114v) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        zzhz zzhzVar = this.f13100g;
        m(zzhzVar);
        zzhzVar.g();
        Boolean bool = this.f13115w;
        DefaultClock defaultClock = this.f13104k;
        if (bool == null || this.f13116x == 0) {
            defaultClock.getClass();
            this.f13116x = SystemClock.elapsedRealtime();
            zzppVar = this.f13102i;
            k(zzppVar);
            z11 = false;
            if (zzppVar.K("android.permission.INTERNET") && zzppVar.K("android.permission.ACCESS_NETWORK_STATE")) {
                context = this.f13094a;
                if (Wrappers.a(context).c() || this.f13097d.j() || (zzpp.c0(context) && zzpp.B(context))) {
                    z11 = true;
                }
            }
            this.f13115w = Boolean.valueOf(z11);
            if (z11) {
                this.f13115w = Boolean.valueOf(zzppVar.m(r().n()));
            }
        } else if (!bool.booleanValue()) {
            defaultClock.getClass();
            if (Math.abs(SystemClock.elapsedRealtime() - this.f13116x) > 1000) {
                defaultClock.getClass();
                this.f13116x = SystemClock.elapsedRealtime();
                zzppVar = this.f13102i;
                k(zzppVar);
                z11 = false;
                if (zzppVar.K("android.permission.INTERNET")) {
                    context = this.f13094a;
                    if (Wrappers.a(context).c()) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                }
                this.f13115w = Boolean.valueOf(z11);
                if (z11) {
                    this.f13115w = Boolean.valueOf(zzppVar.m(r().n()));
                }
            }
        }
        return this.f13115w.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public final void i(int i11, Throwable th2, byte[] bArr) {
        zzgu zzguVar;
        zzgu zzguVar2;
        int i12 = i11;
        zzgu zzguVar3 = this.f13099f;
        if (i12 == 200 || i12 == 204) {
            if (th2 == null) {
                zzhh zzhhVar = this.f13098e;
                k(zzhhVar);
                zzhhVar.f13036t.b(true);
                if (bArr != null || bArr.length == 0) {
                    m(zzguVar3);
                    zzguVar3.m.a("Deferred Deep Link response empty.");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String strOptString = jSONObject.optString(Constants.DEEPLINK, BuildConfig.VERSION_NAME);
                    if (TextUtils.isEmpty(strOptString)) {
                        m(zzguVar3);
                        zzguVar3.m.a("Deferred Deep Link is empty.");
                        return;
                    }
                    String strOptString2 = jSONObject.optString("gclid", BuildConfig.VERSION_NAME);
                    String strOptString3 = jSONObject.optString("gbraid", BuildConfig.VERSION_NAME);
                    String strOptString4 = jSONObject.optString("gad_source", BuildConfig.VERSION_NAME);
                    double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                    Bundle bundle = new Bundle();
                    zzpp zzppVar = this.f13102i;
                    k(zzppVar);
                    zzic zzicVar = zzppVar.f13202a;
                    if (TextUtils.isEmpty(strOptString)) {
                        zzguVar2 = zzguVar3;
                    } else {
                        Context context = zzicVar.f13094a;
                        zzguVar2 = zzguVar3;
                        try {
                            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                            if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    bundle.putString("gbraid", strOptString3);
                                }
                                if (!TextUtils.isEmpty(strOptString4)) {
                                    bundle.putString("gad_source", strOptString4);
                                }
                                bundle.putString("gclid", strOptString2);
                                bundle.putString("_cis", "ddp");
                                this.m.n("auto", "_cmp", bundle);
                                if (TextUtils.isEmpty(strOptString)) {
                                    return;
                                }
                                try {
                                    SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                    editorEdit.putString(Constants.DEEPLINK, strOptString);
                                    editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                    if (editorEdit.commit()) {
                                        Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                        Context context2 = zzicVar.f13094a;
                                        if (Build.VERSION.SDK_INT < 34) {
                                            context2.sendBroadcast(intent);
                                            return;
                                        } else {
                                            context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                            return;
                                        }
                                    }
                                    return;
                                } catch (RuntimeException e8) {
                                    zzgu zzguVar4 = zzppVar.f13202a.f13099f;
                                    m(zzguVar4);
                                    zzguVar4.f12942f.b(e8, "Failed to persist Deferred Deep Link. exception");
                                    return;
                                }
                                m(zzguVar);
                                zzguVar.f12942f.b(e, "Failed to parse the Deferred Deep Link response. exception");
                                return;
                            }
                        } catch (JSONException e10) {
                            e = e10;
                            zzguVar = zzguVar2;
                        }
                    }
                    m(zzguVar2);
                    zzguVar = zzguVar2;
                    try {
                        zzguVar.f12945i.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                        return;
                    } catch (JSONException e11) {
                        e = e11;
                    }
                } catch (JSONException e12) {
                    e = e12;
                    zzguVar = zzguVar3;
                }
            }
        } else if (i12 == 304) {
            i12 = 304;
            if (th2 == null) {
                zzhh zzhhVar2 = this.f13098e;
                k(zzhhVar2);
                zzhhVar2.f13036t.b(true);
                if (bArr != null) {
                }
                m(zzguVar3);
                zzguVar3.m.a("Deferred Deep Link response empty.");
                return;
            }
        }
        m(zzguVar3);
        zzguVar3.f12945i.c(Integer.valueOf(i12), th2, "Network Request for Deferred Deep Link failed. response, exception");
    }

    public final zzgn n() {
        return this.f13103j;
    }

    public final zzgl o() {
        l(this.f13109q);
        return this.f13109q;
    }

    public final zznl p() {
        l(this.f13110r);
        return this.f13110r;
    }

    public final zzbb q() {
        m(this.f13111s);
        return this.f13111s;
    }

    public final zzgi r() {
        l(this.f13112t);
        return this.f13112t;
    }
}
