package lf;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l0.Eeqr.HOBXIlHxIkMBEA;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f40052a = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0 f40053b = new j0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j0 f40054c = new j0(1);

    public static final boolean a(l feature) {
        kotlin.jvm.internal.m.f(feature, "feature");
        return f(feature).f7470b != -1;
    }

    public static final String b() {
        if (!qf.a.b(k.class)) {
            try {
                Context contextA = re.s.a();
                List<ResolveInfo> listQueryIntentServices = contextA.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                kotlin.jvm.internal.m.e(listQueryIntentServices, "context.packageManager.q…ervices(serviceIntent, 0)");
                String[] strArr = f40052a;
                HashSet hashSet = new HashSet(ry.x.W(3));
                ry.l.h0(strArr, hashSet);
                Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
                while (it.hasNext()) {
                    ServiceInfo serviceInfo = it.next().serviceInfo;
                    if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                        return serviceInfo.packageName;
                    }
                }
            } catch (Throwable th2) {
                qf.a.a(k.class, th2);
                return null;
            }
        }
        return null;
    }

    public static final String c() {
        if (qf.a.b(k.class)) {
            return null;
        }
        try {
            return "fbconnect://cct." + re.s.a().getPackageName();
        } catch (Throwable th2) {
            qf.a.a(k.class, th2);
            return null;
        }
    }

    public static final String d() {
        return String.format("m.%s", Arrays.copyOf(new Object[]{re.s.f49217r}, 1));
    }

    public static final String e() {
        return String.format("m.%s", Arrays.copyOf(new Object[]{re.s.f49216q}, 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    public static final com.android.billingclient.api.c0 f(l feature) {
        d0 d0Var;
        int[] iArr;
        kotlin.jvm.internal.m.f(feature, "feature");
        String strB = re.s.b();
        String strB2 = feature.b();
        String featureName = feature.name();
        kotlin.jvm.internal.m.f(featureName, "featureName");
        if (strB2.length() == 0 || featureName.length() == 0) {
            d0Var = null;
        } else {
            e0 e0VarB = h0.b(strB);
            Map map = e0VarB != null ? (Map) e0VarB.f40002f.get(strB2) : null;
            if (map != null) {
                d0Var = (d0) map.get(featureName);
            } else {
                d0Var = null;
            }
        }
        if (d0Var == null || (iArr = d0Var.f39992c) == null) {
            iArr = new int[]{feature.a()};
        }
        c1 c1Var = c1.f39979a;
        if (qf.a.b(c1.class)) {
            return null;
        }
        try {
            List list = (List) c1.f39981c.get(strB2);
            if (list == null) {
                list = ry.r.f50854a;
            }
            return c1.f39979a.k(list, iArr);
        } catch (Throwable th2) {
            qf.a.a(c1.class, th2);
            return null;
        }
    }

    public static final String g(String developerDefinedRedirectURI) {
        if (qf.a.b(k.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.m.f(developerDefinedRedirectURI, "developerDefinedRedirectURI");
            if (v0.d(re.s.a(), developerDefinedRedirectURI)) {
                return developerDefinedRedirectURI;
            }
            return v0.d(re.s.a(), c()) ? c() : BuildConfig.VERSION_NAME;
        } catch (Throwable th2) {
            qf.a.a(k.class, th2);
            return null;
        }
    }

    public static final void h(a appCall, m mVar, l feature) {
        Intent intentR;
        kotlin.jvm.internal.m.f(appCall, "appCall");
        kotlin.jvm.internal.m.f(feature, "feature");
        Context contextA = re.s.a();
        String strB = feature.b();
        com.android.billingclient.api.c0 c0VarF = f(feature);
        int i11 = c0VarF.f7470b;
        if (i11 == -1) {
            throw new FacebookException("Cannot present this dialog. This likely means that the Facebook app is not installed.");
        }
        Bundle parameters = c1.o(i11) ? mVar.getParameters() : mVar.l();
        if (parameters == null) {
            parameters = new Bundle();
        }
        String string = appCall.a().toString();
        Intent intent = null;
        if (!qf.a.b(c1.class)) {
            try {
                b1 b1Var = (b1) c0VarF.f7471c;
                if (b1Var != null && (intentR = c1.r(contextA, new Intent().setAction("com.facebook.platform.PLATFORM_ACTIVITY").setPackage(b1Var.b()).addCategory("android.intent.category.DEFAULT"))) != null) {
                    c1.p(intentR, string, strB, c0VarF.f7470b, parameters);
                    intent = intentR;
                }
            } catch (Throwable th2) {
                qf.a.a(c1.class, th2);
            }
        }
        if (intent == null) {
            throw new FacebookException("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        if (qf.a.b(appCall)) {
            return;
        }
        try {
            appCall.f39961c = intent;
        } catch (Throwable th3) {
            qf.a.a(appCall, th3);
        }
    }

    public static final void i(a appCall, FacebookException facebookException) {
        kotlin.jvm.internal.m.f(appCall, "appCall");
        v0.e(re.s.a(), true);
        Intent intent = new Intent();
        intent.setClass(re.s.a(), FacebookActivity.class);
        intent.setAction("PassThrough");
        c1.p(intent, appCall.a().toString(), null, c1.l(), c1.c(facebookException));
        if (qf.a.b(appCall)) {
            return;
        }
        try {
            appCall.f39961c = intent;
        } catch (Throwable th2) {
            qf.a.a(appCall, th2);
        }
    }

    public static final void j(a appCall, String str, Bundle bundle) {
        kotlin.jvm.internal.m.f(appCall, "appCall");
        v0.e(re.s.a(), true);
        if (re.s.a().checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            throw new IllegalStateException(ypOOxsaJG.PuYCXIPOdQusEOR);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString(HOBXIlHxIkMBEA.OMiLqMGsmAx, str);
        bundle2.putBundle("params", bundle);
        Intent intent = new Intent();
        c1.p(intent, appCall.a().toString(), str, c1.l(), bundle2);
        intent.setClass(re.s.a(), FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        if (qf.a.b(appCall)) {
            return;
        }
        try {
            appCall.f39961c = intent;
        } catch (Throwable th2) {
            qf.a.a(appCall, th2);
        }
    }
}
