package cf;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f6905a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f6906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f6907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static b f6908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static d f6909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Intent f6910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Object f6911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static v f6912h;

    public static final void a(Context context, ArrayList arrayList, boolean z11) {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            String purchase = (String) obj;
            try {
                String sku = new JSONObject(purchase).getString("productId");
                kotlin.jvm.internal.m.e(sku, "sku");
                kotlin.jvm.internal.m.e(purchase, "purchase");
                map.put(sku, purchase);
                arrayList2.add(sku);
            } catch (JSONException unused) {
            }
        }
        Object obj2 = f6911g;
        q qVar = q.f6977a;
        LinkedHashMap linkedHashMap = null;
        if (!qf.a.b(q.class)) {
            try {
                LinkedHashMap linkedHashMapJ = qVar.j(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj3 = arrayList2.get(i12);
                    i12++;
                    String str = (String) obj3;
                    if (!linkedHashMapJ.containsKey(str)) {
                        arrayList3.add(str);
                    }
                }
                linkedHashMapJ.putAll(qVar.g(context, arrayList3, obj2, z11));
                linkedHashMap = linkedHashMapJ;
            } catch (Throwable th2) {
                qf.a.a(q.class, th2);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            String str4 = (String) map.get(str2);
            if (str4 != null) {
                ef.k.d(str4, str3, z11, f6912h, false);
            }
        }
    }

    public static final void b(v billingClientVersion) {
        kotlin.jvm.internal.m.f(billingClientVersion, "billingClientVersion");
        if (f6906b == null) {
            Boolean boolValueOf = Boolean.valueOf(x.i("com.android.vending.billing.IInAppBillingService$Stub") != null);
            f6906b = boolValueOf;
            if (!boolValueOf.equals(Boolean.FALSE)) {
                f6907c = Boolean.valueOf(x.i("com.android.billingclient.api.ProxyBillingActivity") != null);
                q qVar = q.f6977a;
                if (!qf.a.b(q.class)) {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        SharedPreferences sharedPreferences = q.f6981e;
                        long j11 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
                        if (j11 == 0) {
                            sharedPreferences.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
                        } else if (jCurrentTimeMillis - j11 > 604800) {
                            sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
                        }
                    } catch (Throwable th2) {
                        qf.a.a(q.class, th2);
                    }
                }
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                kotlin.jvm.internal.m.e(intent, "Intent(\"com.android.vend…ge(\"com.android.vending\")");
                f6910f = intent;
                f6908d = new b();
                f6909e = new d();
            }
        }
        if (!kotlin.jvm.internal.m.a(f6906b, Boolean.FALSE) && ef.k.c()) {
            f6912h = billingClientVersion;
            if (f6905a.compareAndSet(false, true)) {
                Context contextA = re.s.a();
                if (contextA instanceof Application) {
                    Application application = (Application) contextA;
                    d dVar = f6909e;
                    if (dVar == null) {
                        kotlin.jvm.internal.m.n("callbacks");
                        throw null;
                    }
                    application.registerActivityLifecycleCallbacks(dVar);
                    Intent intent2 = f6910f;
                    if (intent2 == null) {
                        kotlin.jvm.internal.m.n("intent");
                        throw null;
                    }
                    b bVar = f6908d;
                    if (bVar != null) {
                        contextA.bindService(intent2, bVar, 1);
                    } else {
                        kotlin.jvm.internal.m.n("serviceConnection");
                        throw null;
                    }
                }
            }
        }
    }
}
