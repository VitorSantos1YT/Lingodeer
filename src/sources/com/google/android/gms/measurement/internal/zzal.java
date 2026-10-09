package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dt.Xk.wuoM;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzal extends zzje {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f12628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f12629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zzak f12630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f12631e;

    public final boolean h(String str) {
        zzic.k(this.f13202a.f13102i);
        if (zzpp.J((String) zzfy.f12854g1.a(null), str) || zzpp.J((String) zzfy.f12857h1.a(null), str) || zzpp.J((String) zzfy.f12860i1.a(null), str)) {
            return true;
        }
        return "1".equals(this.f12630d.d(str, "gaia_collection_enabled"));
    }

    public final boolean i(String str) {
        return "1".equals(this.f12630d.d(str, "measurement.event_sampling_enabled"));
    }

    public final boolean j() {
        if (this.f12628b == null) {
            Boolean boolT = t("app_measurement_lite");
            this.f12628b = boolT;
            if (boolT == null) {
                this.f12628b = Boolean.FALSE;
            }
        }
        return this.f12628b.booleanValue() || !this.f13202a.f13095b;
    }

    public final String k(String str) {
        zzic zzicVar = this.f13202a;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, BuildConfig.VERSION_NAME);
            Preconditions.g(str2);
            return str2;
        } catch (ClassNotFoundException e8) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.b(e8, "Could not find SystemProperties class");
            return BuildConfig.VERSION_NAME;
        } catch (IllegalAccessException e10) {
            zzgu zzguVar2 = zzicVar.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12942f.b(e10, "Could not access SystemProperties.get()");
            return BuildConfig.VERSION_NAME;
        } catch (NoSuchMethodException e11) {
            zzgu zzguVar3 = zzicVar.f13099f;
            zzic.m(zzguVar3);
            zzguVar3.f12942f.b(e11, "Could not find SystemProperties.get() method");
            return BuildConfig.VERSION_NAME;
        } catch (InvocationTargetException e12) {
            zzgu zzguVar4 = zzicVar.f13099f;
            zzic.m(zzguVar4);
            zzguVar4.f12942f.b(e12, "SystemProperties.get() threw an exception");
            return BuildConfig.VERSION_NAME;
        }
    }

    public final int l(String str, boolean z11) {
        return Math.max(z11 ? Math.max(Math.min(p(str, zzfy.f12853g0), 500), 100) : 500, 256);
    }

    public final void m() {
        this.f13202a.getClass();
    }

    public final String n(String str, zzfx zzfxVar) {
        return TextUtils.isEmpty(str) ? (String) zzfxVar.a(null) : (String) zzfxVar.a(this.f12630d.d(str, zzfxVar.f12831a));
    }

    public final long o(String str, zzfx zzfxVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) zzfxVar.a(null)).longValue();
        }
        String strD = this.f12630d.d(str, zzfxVar.f12831a);
        if (TextUtils.isEmpty(strD)) {
            return ((Long) zzfxVar.a(null)).longValue();
        }
        try {
            return ((Long) zzfxVar.a(Long.valueOf(Long.parseLong(strD)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzfxVar.a(null)).longValue();
        }
    }

    public final int p(String str, zzfx zzfxVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) zzfxVar.a(null)).intValue();
        }
        String strD = this.f12630d.d(str, zzfxVar.f12831a);
        if (TextUtils.isEmpty(strD)) {
            return ((Integer) zzfxVar.a(null)).intValue();
        }
        try {
            return ((Integer) zzfxVar.a(Integer.valueOf(Integer.parseInt(strD)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzfxVar.a(null)).intValue();
        }
    }

    public final double q(String str, zzfx zzfxVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) zzfxVar.a(null)).doubleValue();
        }
        String strD = this.f12630d.d(str, zzfxVar.f12831a);
        if (TextUtils.isEmpty(strD)) {
            return ((Double) zzfxVar.a(null)).doubleValue();
        }
        try {
            return ((Double) zzfxVar.a(Double.valueOf(Double.parseDouble(strD)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzfxVar.a(null)).doubleValue();
        }
    }

    public final boolean r(String str, zzfx zzfxVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) zzfxVar.a(null)).booleanValue();
        }
        String strD = this.f12630d.d(str, zzfxVar.f12831a);
        return TextUtils.isEmpty(strD) ? ((Boolean) zzfxVar.a(null)).booleanValue() : ((Boolean) zzfxVar.a(Boolean.valueOf("1".equals(strD)))).booleanValue();
    }

    public final Bundle s() {
        zzic zzicVar = this.f13202a;
        try {
            Context context = zzicVar.f13094a;
            Context context2 = zzicVar.f13094a;
            zzgu zzguVar = zzicVar.f13099f;
            if (context.getPackageManager() == null) {
                zzic.m(zzguVar);
                zzguVar.f12942f.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoA = Wrappers.a(context2).a(128, context2.getPackageName());
            if (applicationInfoA != null) {
                return applicationInfoA.metaData;
            }
            zzic.m(zzguVar);
            zzguVar.f12942f.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e8) {
            zzgu zzguVar2 = zzicVar.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12942f.b(e8, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean t(String str) {
        Preconditions.d(str);
        Bundle bundleS = s();
        if (bundleS != null) {
            if (bundleS.containsKey(str)) {
                return Boolean.valueOf(bundleS.getBoolean(str));
            }
            return null;
        }
        zzgu zzguVar = this.f13202a.f13099f;
        zzic.m(zzguVar);
        zzguVar.f12942f.a("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean u() {
        this.f13202a.getClass();
        Boolean boolT = t("firebase_analytics_collection_deactivated");
        return boolT != null && boolT.booleanValue();
    }

    public final boolean v() {
        Boolean boolT = t("google_analytics_automatic_screen_reporting_enabled");
        return boolT == null || boolT.booleanValue();
    }

    public final zzji w(String str, boolean z11) {
        Object obj;
        Preconditions.d(str);
        Bundle bundleS = s();
        zzic zzicVar = this.f13202a;
        if (bundleS == null) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.a(wuoM.HYRkeAgNMtLVx);
            obj = null;
        } else {
            obj = bundleS.get(str);
        }
        if (obj == null) {
            return zzji.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return zzji.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return zzji.DENIED;
        }
        if (z11 && "eu_consent_policy".equals(obj)) {
            return zzji.POLICY;
        }
        zzgu zzguVar2 = zzicVar.f13099f;
        zzic.m(zzguVar2);
        zzguVar2.f12945i.b(str, "Invalid manifest metadata for");
        return zzji.UNINITIALIZED;
    }
}
