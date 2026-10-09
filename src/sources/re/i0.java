package re;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.FacebookSdkNotInitializedException;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import lf.v0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f49169a = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f49170b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f49171c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j0.h0 f49172d = new j0.h0(true, "com.facebook.sdk.AutoInitEnabled");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j0.h0 f49173e = new j0.h0(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j0.h0 f49174f = new j0.h0(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j0.h0 f49175g = new j0.h0(false, "auto_event_setup_enabled");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j0.h0 f49176h = new j0.h0(true, "com.facebook.sdk.MonitorEnabled");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static SharedPreferences f49177i;

    public static final boolean b() {
        if (qf.a.b(i0.class)) {
            return false;
        }
        try {
            f49169a.e();
            return f49174f.a();
        } catch (Throwable th2) {
            qf.a.a(i0.class, th2);
            return false;
        }
    }

    public static final boolean c() {
        if (qf.a.b(i0.class)) {
            return false;
        }
        try {
            i0 i0Var = f49169a;
            i0Var.e();
            return i0Var.a();
        } catch (Throwable th2) {
            qf.a.a(i0.class, th2);
            return false;
        }
    }

    public static final Boolean i() {
        String str = BuildConfig.VERSION_NAME;
        if (qf.a.b(i0.class)) {
            return null;
        }
        try {
            f49169a.k();
            try {
                SharedPreferences sharedPreferences = f49177i;
                if (sharedPreferences == null) {
                    kotlin.jvm.internal.m.n("userSettingPref");
                    throw null;
                }
                String string = sharedPreferences.getString((String) f49173e.f35299c, BuildConfig.VERSION_NAME);
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    return Boolean.valueOf(new JSONObject(str).getBoolean("value"));
                }
                return null;
            } catch (JSONException unused) {
                s sVar = s.f49201a;
            }
        } catch (Throwable th2) {
            qf.a.a(i0.class, th2);
            return null;
        }
    }

    public final boolean a() {
        if (qf.a.b(this)) {
            return false;
        }
        try {
            HashMap mapC = lf.h0.c();
            if (mapC != null && !mapC.isEmpty()) {
                Boolean bool = (Boolean) mapC.get("auto_log_app_events_enabled");
                Boolean bool2 = (Boolean) mapC.get("auto_log_app_events_default");
                if (bool != null) {
                    return bool.booleanValue();
                }
                Boolean bool3 = null;
                if (!qf.a.b(this)) {
                    try {
                        Boolean boolI = i();
                        if (boolI != null || (boolI = f()) != null) {
                            bool3 = boolI;
                        }
                    } catch (Throwable th2) {
                        qf.a.a(this, th2);
                    }
                }
                if (bool3 != null) {
                    return bool3.booleanValue();
                }
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                return true;
            }
            return f49173e.a();
        } catch (Throwable th3) {
            qf.a.a(this, th3);
            return false;
        }
    }

    public final void d() {
        if (qf.a.b(this)) {
            return;
        }
        try {
            j0.h0 h0Var = f49175g;
            j(h0Var);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (((Boolean) h0Var.f35300d) == null || jCurrentTimeMillis - h0Var.f35298b >= 604800000) {
                h0Var.f35300d = null;
                h0Var.f35298b = 0L;
                if (f49171c.compareAndSet(false, true)) {
                    s.d().execute(new Runnable() { // from class: re.h0
                        @Override // java.lang.Runnable
                        public final void run() {
                            lf.e0 e0VarK;
                            long j11 = jCurrentTimeMillis;
                            if (qf.a.b(i0.class)) {
                                return;
                            }
                            try {
                                if (i0.f49174f.a() && (e0VarK = lf.h0.k(s.b(), false)) != null && e0VarK.f40006j) {
                                    lf.d dVarA = v0.a(s.a());
                                    String strA = (dVarA == null || dVarA.a() == null) ? null : dVarA.a();
                                    if (strA != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putString("advertiser_id", strA);
                                        bundle.putString("fields", "auto_event_setup_enabled");
                                        String str = y.f49225j;
                                        y yVarB = v.B(null, "app", null);
                                        yVarB.f49231d = bundle;
                                        JSONObject jSONObject = yVarB.c().f49124b;
                                        if (jSONObject != null) {
                                            j0.h0 h0Var2 = i0.f49175g;
                                            h0Var2.f35300d = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                                            h0Var2.f35298b = j11;
                                            i0.f49169a.l(h0Var2);
                                        }
                                    }
                                }
                                i0.f49171c.set(false);
                            } catch (Throwable th2) {
                                qf.a.a(i0.class, th2);
                            }
                        }
                    });
                }
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0090 A[Catch: all -> 0x0099, NameNotFoundException -> 0x009d, TRY_LEAVE, TryCatch #4 {NameNotFoundException -> 0x009d, all -> 0x0099, blocks: (B:32:0x0075, B:34:0x0090), top: B:48:0x0075, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void e() {
        Bundle bundle;
        if (qf.a.b(this)) {
            return;
        }
        try {
            if (s.f49215p.get()) {
                if (f49170b.compareAndSet(false, true)) {
                    SharedPreferences sharedPreferences = s.a().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                    kotlin.jvm.internal.m.e(sharedPreferences, "getApplicationContext()\n…GS, Context.MODE_PRIVATE)");
                    f49177i = sharedPreferences;
                    j0.h0[] h0VarArr = {f49173e, f49174f, f49172d};
                    if (!qf.a.b(this)) {
                        for (int i11 = 0; i11 < 3; i11++) {
                            try {
                                j0.h0 h0Var = h0VarArr[i11];
                                if (h0Var == f49175g) {
                                    d();
                                } else if (((Boolean) h0Var.f35300d) == null) {
                                    j(h0Var);
                                    if (((Boolean) h0Var.f35300d) == null) {
                                        g(h0Var);
                                    }
                                } else {
                                    l(h0Var);
                                }
                            } catch (Throwable th2) {
                                qf.a.a(this, th2);
                                d();
                                if (!qf.a.b(this)) {
                                    try {
                                        Context contextA = s.a();
                                        ApplicationInfo applicationInfo = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
                                        kotlin.jvm.internal.m.e(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                                        bundle = applicationInfo.metaData;
                                        if (bundle != null) {
                                            bundle.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled");
                                            b();
                                        }
                                    } catch (PackageManager.NameNotFoundException unused) {
                                    } catch (Throwable th3) {
                                        qf.a.a(this, th3);
                                    }
                                }
                                h();
                            }
                        }
                    }
                    d();
                    if (!qf.a.b(this)) {
                        Context contextA2 = s.a();
                        ApplicationInfo applicationInfo2 = contextA2.getPackageManager().getApplicationInfo(contextA2.getPackageName(), 128);
                        kotlin.jvm.internal.m.e(applicationInfo2, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                        bundle = applicationInfo2.metaData;
                        if (bundle != null) {
                            bundle.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled");
                            b();
                        }
                    }
                    h();
                }
            }
        } catch (Throwable th4) {
            qf.a.a(this, th4);
        }
    }

    public final Boolean f() {
        if (qf.a.b(this)) {
            return null;
        }
        try {
            k();
            try {
                Context contextA = s.a();
                ApplicationInfo applicationInfo = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
                kotlin.jvm.internal.m.e(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    j0.h0 h0Var = f49173e;
                    if (bundle.containsKey((String) h0Var.f35299c)) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean((String) h0Var.f35299c));
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                s sVar = s.f49201a;
            }
            return null;
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return null;
        }
    }

    public final void g(j0.h0 h0Var) {
        String str = (String) h0Var.f35299c;
        if (qf.a.b(this)) {
            return;
        }
        try {
            k();
            try {
                Context contextA = s.a();
                ApplicationInfo applicationInfo = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
                kotlin.jvm.internal.m.e(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null || !bundle.containsKey(str)) {
                    return;
                }
                h0Var.f35300d = Boolean.valueOf(applicationInfo.metaData.getBoolean(str, h0Var.f35297a));
                return;
            } catch (PackageManager.NameNotFoundException unused) {
                s sVar = s.f49201a;
                return;
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
        qf.a.a(this, th2);
    }

    public final void h() {
        int i11;
        int i12;
        if (qf.a.b(this)) {
            return;
        }
        try {
            if (f49170b.get() && s.f49215p.get()) {
                Context contextA = s.a();
                int i13 = (f49172d.a() ? 1 : 0) | ((f49173e.a() ? 1 : 0) << 1) | ((f49174f.a() ? 1 : 0) << 2) | ((f49176h.a() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = f49177i;
                if (sharedPreferences == null) {
                    kotlin.jvm.internal.m.n("userSettingPref");
                    throw null;
                }
                int i14 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i14 != i13) {
                    SharedPreferences sharedPreferences2 = f49177i;
                    if (sharedPreferences2 == null) {
                        kotlin.jvm.internal.m.n("userSettingPref");
                        throw null;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i13).apply();
                    try {
                        ApplicationInfo applicationInfo = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
                        kotlin.jvm.internal.m.e(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                        if (applicationInfo.metaData != null) {
                            String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                            boolean[] zArr = {true, true, true, true};
                            i11 = 0;
                            i12 = 0;
                            for (int i15 = 0; i15 < 4; i15++) {
                                try {
                                    i12 |= (applicationInfo.metaData.containsKey(strArr[i15]) ? 1 : 0) << i15;
                                    i11 |= (applicationInfo.metaData.getBoolean(strArr[i15], zArr[i15]) ? 1 : 0) << i15;
                                } catch (PackageManager.NameNotFoundException unused) {
                                }
                            }
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                    }
                    se.m mVar = new se.m(contextA, (String) null);
                    Bundle bundle = new Bundle();
                    bundle.putInt("usage", i12);
                    bundle.putInt("initial", i11);
                    bundle.putInt("previous", i14);
                    bundle.putInt("current", i13);
                    if (!((bundle.getInt("previous") & 2) != 0)) {
                        s sVar = s.f49201a;
                        if (!c()) {
                            return;
                        }
                    }
                    mVar.g("fb_sdk_settings_changed", bundle);
                }
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public final void j(j0.h0 h0Var) {
        String str = BuildConfig.VERSION_NAME;
        if (qf.a.b(this)) {
            return;
        }
        try {
            k();
            try {
                SharedPreferences sharedPreferences = f49177i;
                if (sharedPreferences == null) {
                    kotlin.jvm.internal.m.n("userSettingPref");
                    throw null;
                }
                String string = sharedPreferences.getString((String) h0Var.f35299c, BuildConfig.VERSION_NAME);
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    h0Var.f35300d = Boolean.valueOf(jSONObject.getBoolean("value"));
                    h0Var.f35298b = jSONObject.getLong("last_timestamp");
                }
            } catch (JSONException unused) {
                s sVar = s.f49201a;
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public final void k() {
        if (qf.a.b(this)) {
            return;
        }
        try {
            if (f49170b.get()) {
            } else {
                throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public final void l(j0.h0 h0Var) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            k();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", (Boolean) h0Var.f35300d);
                jSONObject.put("last_timestamp", h0Var.f35298b);
                SharedPreferences sharedPreferences = f49177i;
                if (sharedPreferences == null) {
                    kotlin.jvm.internal.m.n("userSettingPref");
                    throw null;
                }
                sharedPreferences.edit().putString((String) h0Var.f35299c, jSONObject.toString()).apply();
                h();
            } catch (Exception unused) {
                s sVar = s.f49201a;
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }
}
