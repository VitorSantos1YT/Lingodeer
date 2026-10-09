package cf;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;
import vf.eq.EHjhWcesDUIsIw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f6983a = new r();

    public static u d() {
        Class clsI = x.i("com.android.billingclient.api.SkuDetailsParams");
        Class clsI2 = x.i("com.android.billingclient.api.SkuDetailsParams$Builder");
        if (clsI == null || clsI2 == null) {
            return null;
        }
        Method methodP = x.p(clsI, "newBuilder", new Class[0]);
        Method methodP2 = x.p(clsI2, "setType", String.class);
        Method methodP3 = x.p(clsI2, "setSkusList", List.class);
        Method methodP4 = x.p(clsI2, "build", new Class[0]);
        if (methodP == null || methodP2 == null || methodP3 == null || methodP4 == null) {
            return null;
        }
        u uVar = new u(clsI, clsI2, methodP, methodP2, methodP3, methodP4);
        if (!qf.a.b(u.class)) {
            try {
                u.f6991h = uVar;
            } catch (Throwable th2) {
                qf.a.a(u.class, th2);
            }
        }
        if (qf.a.b(u.class)) {
            return null;
        }
        try {
            return u.f6991h;
        } catch (Throwable th3) {
            qf.a.a(u.class, th3);
            return null;
        }
    }

    public static final void e() {
        if (qf.a.b(r.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = re.s.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = re.s.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            sharedPreferences.edit().clear().apply();
            sharedPreferences2.edit().clear().apply();
            re.s.a().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0).edit().clear().apply();
        } catch (Throwable th2) {
            qf.a.a(r.class, th2);
        }
    }

    public static final void f(ConcurrentHashMap purchaseDetailsMap, ConcurrentHashMap skuDetailsMap, boolean z11, String str, v vVar, boolean z12) {
        if (qf.a.b(r.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.m.f(purchaseDetailsMap, "purchaseDetailsMap");
            kotlin.jvm.internal.m.f(skuDetailsMap, "skuDetailsMap");
            r rVar = f6983a;
            LinkedHashMap linkedHashMapB = rVar.b(rVar.a(purchaseDetailsMap, z11), skuDetailsMap, str);
            if (qf.a.b(rVar)) {
                return;
            }
            try {
                for (Map.Entry entry : linkedHashMapB.entrySet()) {
                    ef.k.d((String) entry.getKey(), (String) entry.getValue(), z11, vVar, z12);
                }
            } catch (Throwable th2) {
                qf.a.a(rVar, th2);
            }
        } catch (Throwable th3) {
            qf.a.a(r.class, th3);
        }
    }

    public static ConcurrentHashMap g() {
        if (qf.a.b(n.class)) {
            return null;
        }
        try {
            return n.f6934o;
        } catch (Throwable th2) {
            qf.a.a(n.class, th2);
            return null;
        }
    }

    public static ConcurrentHashMap h() {
        if (qf.a.b(n.class)) {
            return null;
        }
        try {
            return n.f6936q;
        } catch (Throwable th2) {
            qf.a.a(n.class, th2);
            return null;
        }
    }

    public static ConcurrentHashMap i() {
        if (qf.a.b(n.class)) {
            return null;
        }
        try {
            return n.f6935p;
        } catch (Throwable th2) {
            qf.a.a(n.class, th2);
            return null;
        }
    }

    public static final void j() {
        if (qf.a.b(r.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = re.s.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long jMax = Math.max(Math.max(sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 0L), sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 0L)), 1736528400000L);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            SharedPreferences sharedPreferences2 = re.s.a().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            if (sharedPreferences2.contains("PURCHASE_DETAILS_SET")) {
                Collection stringSet = sharedPreferences2.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
                copyOnWriteArraySet.addAll(stringSet == null ? new HashSet() : stringSet);
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    try {
                        long j11 = Long.parseLong((String) oz.q.W0((String) it.next(), new String[]{";"}, 2, 2).get(1)) * 1000;
                        if (Math.abs(String.valueOf(j11).length() - 13) < Math.log10(1000.0d)) {
                            jMax = Math.max(jMax, j11);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jMax).apply();
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jMax).apply();
            e();
        } catch (Throwable th2) {
            qf.a.a(r.class, th2);
        }
    }

    public static final void k() {
        if (qf.a.b(r.class)) {
            return;
        }
        try {
            try {
                re.s.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).edit().putBoolean("APP_HAS_BEEN_LAUNCHED_KEY", true).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            qf.a.a(r.class, th2);
        }
    }

    public static final void l() {
        if (qf.a.b(r.class)) {
            return;
        }
        try {
            k();
            try {
                SharedPreferences sharedPreferences = re.s.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
                long jCurrentTimeMillis = System.currentTimeMillis();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jCurrentTimeMillis).apply();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jCurrentTimeMillis).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            qf.a.a(r.class, th2);
        }
    }

    public HashMap a(Map purchaseDetailsMap, boolean z11) {
        if (qf.a.b(this)) {
            return null;
        }
        try {
            kotlin.jvm.internal.m.f(purchaseDetailsMap, "purchaseDetailsMap");
            SharedPreferences sharedPreferences = re.s.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long j11 = z11 ? sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 1736528400000L) : sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 1736528400000L);
            long jMax = 0;
            for (Map.Entry entry : ry.x.h0(purchaseDetailsMap).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken") && jSONObject.has("purchaseTime")) {
                        long j12 = jSONObject.getLong("purchaseTime");
                        if (j12 <= j11) {
                            purchaseDetailsMap.remove(str);
                        }
                        jMax = Math.max(jMax, j12);
                    }
                } catch (Exception unused) {
                }
            }
            if (jMax >= j11) {
                if (z11) {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jMax).apply();
                } else {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jMax).apply();
                }
            }
            return new HashMap(purchaseDetailsMap);
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return null;
        }
    }

    public LinkedHashMap b(HashMap purchaseDetailsMap, Map skuDetailsMap, String str) {
        if (qf.a.b(this)) {
            return null;
        }
        try {
            kotlin.jvm.internal.m.f(purchaseDetailsMap, "purchaseDetailsMap");
            kotlin.jvm.internal.m.f(skuDetailsMap, "skuDetailsMap");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : purchaseDetailsMap.entrySet()) {
                String str2 = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                JSONObject jSONObject2 = (JSONObject) skuDetailsMap.get(str2);
                try {
                    jSONObject.put("packageName", str);
                    if (jSONObject2 != null) {
                        String string = jSONObject.toString();
                        kotlin.jvm.internal.m.e(string, "purchaseDetail.toString()");
                        String string2 = jSONObject2.toString();
                        kotlin.jvm.internal.m.e(string2, "skuDetail.toString()");
                        linkedHashMap.put(string, string2);
                    }
                } catch (Exception unused) {
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0018 A[Catch: all -> 0x001e, TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:13:0x0018, B:11:0x0012, B:8:0x000e), top: B:99:0x0003, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0153  */
    /* JADX WARN: Code duplicated, block: B:71:0x0159  */
    /* JADX WARN: Code duplicated, block: B:91:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x017e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static n c(Context context) {
        u uVarD;
        u uVar;
        Class cls;
        Class cls2;
        Class cls3;
        Object objT;
        n nVar;
        Object objT2;
        Object objT3;
        synchronized (u.f6990g) {
            if (qf.a.b(u.class)) {
                uVarD = null;
                if (uVarD == null) {
                    uVarD = d();
                }
                uVar = uVarD;
            } else {
                try {
                    uVarD = u.f6991h;
                } catch (Throwable th2) {
                    qf.a.a(u.class, th2);
                    uVarD = null;
                }
                if (uVarD == null) {
                    uVarD = d();
                }
                uVar = uVarD;
            }
            throw th;
        }
        if (uVar == null) {
            return null;
        }
        Class clsI = x.i(EHjhWcesDUIsIw.HCrtJRwK);
        Class clsI2 = x.i("com.android.billingclient.api.Purchase");
        Class clsI3 = x.i("com.android.billingclient.api.Purchase$PurchasesResult");
        Class clsI4 = x.i("com.android.billingclient.api.SkuDetails");
        Class clsI5 = x.i("com.android.billingclient.api.PurchaseHistoryRecord");
        Class clsI6 = x.i("com.android.billingclient.api.SkuDetailsResponseListener");
        Class clsI7 = x.i("com.android.billingclient.api.PurchaseHistoryResponseListener");
        if (clsI == null || clsI3 == null || clsI2 == null || clsI4 == null || clsI6 == null || clsI5 == null || clsI7 == null) {
            qf.a.b(n.class);
            return null;
        }
        Method methodP = x.p(clsI, "queryPurchases", String.class);
        Method methodP2 = x.p(clsI3, "getPurchasesList", new Class[0]);
        Method methodP3 = x.p(clsI2, "getOriginalJson", new Class[0]);
        Method methodP4 = x.p(clsI4, "getOriginalJson", new Class[0]);
        Method methodP5 = x.p(clsI5, "getOriginalJson", new Class[0]);
        if (qf.a.b(uVar)) {
            cls = null;
        } else {
            try {
                cls = uVar.f6992a;
            } catch (Throwable th3) {
                qf.a.a(uVar, th3);
                cls = null;
            }
        }
        Method methodP6 = x.p(clsI, "querySkuDetailsAsync", cls, clsI6);
        Method methodP7 = x.p(clsI, "queryPurchaseHistoryAsync", String.class, clsI7);
        if (methodP == null || methodP2 == null || methodP3 == null || methodP4 == null || methodP5 == null || methodP6 == null || methodP7 == null) {
            qf.a.b(n.class);
            return null;
        }
        Class clsI8 = x.i("com.android.billingclient.api.BillingClient$Builder");
        Class clsI9 = x.i("com.android.billingclient.api.PurchasesUpdatedListener");
        if (clsI8 != null && clsI9 != null) {
            Method methodP8 = x.p(clsI, "newBuilder", Context.class);
            Method methodP9 = x.p(clsI8, "enablePendingPurchases", new Class[0]);
            Method methodP10 = x.p(clsI8, "setListener", clsI9);
            cls2 = clsI4;
            Method methodP11 = x.p(clsI8, "build", new Class[0]);
            if (methodP8 != null && methodP9 != null && methodP10 != null && methodP11 != null && (objT2 = x.t(clsI, null, methodP8, context)) != null) {
                clsI = clsI;
                cls3 = clsI5;
                Object objT4 = x.t(clsI8, objT2, methodP10, Proxy.newProxyInstance(clsI9.getClassLoader(), new Class[]{clsI9}, new l(0)));
                objT = (objT4 == null || (objT3 = x.t(clsI8, objT4, methodP9, new Object[0])) == null) ? null : x.t(clsI8, objT3, methodP11, new Object[0]);
            }
            if (objT == null) {
                qf.a.b(n.class);
                return null;
            }
            nVar = new n(objT, clsI, cls2, cls3, clsI6, clsI7, methodP4, methodP5, methodP6, methodP7, uVar);
            if (!qf.a.b(n.class)) {
                try {
                    n.m = nVar;
                } catch (Throwable th4) {
                    qf.a.a(n.class, th4);
                }
            }
            if (!qf.a.b(n.class)) {
                try {
                    return n.m;
                } catch (Throwable th5) {
                    qf.a.a(n.class, th5);
                }
            }
            return null;
        }
        cls2 = clsI4;
        cls3 = clsI5;
        if (objT == null) {
            qf.a.b(n.class);
            return null;
        }
        nVar = new n(objT, clsI, cls2, cls3, clsI6, clsI7, methodP4, methodP5, methodP6, methodP7, uVar);
        if (!qf.a.b(n.class)) {
            n.m = nVar;
        }
        if (!qf.a.b(n.class)) {
            return n.m;
        }
        return null;
    }
}
