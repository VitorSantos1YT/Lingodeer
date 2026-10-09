package lf;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f39974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f39975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f39976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Long f39977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static a5.f f39978e;

    static {
        kotlin.jvm.internal.z.a(c0.class).g();
        f39974a = new AtomicBoolean(false);
        f39975b = new ConcurrentLinkedQueue();
        f39976c = new ConcurrentHashMap();
    }

    public static JSONObject a() {
        Bundle bundleE = b7.e0.e("platform", "android");
        re.s sVar = re.s.f49201a;
        bundleE.putString("sdk_version", "18.1.3");
        bundleE.putString("fields", "gatekeepers");
        String str = re.y.f49225j;
        re.y yVarB = re.v.B(null, String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1)), null);
        yVarB.f49231d = bundleE;
        JSONObject jSONObject = yVarB.c().f49126d;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static final boolean b(String name, String str, boolean z11) {
        HashMap map;
        ConcurrentHashMap concurrentHashMap;
        Boolean bool;
        kotlin.jvm.internal.m.f(name, "name");
        ArrayList arrayList = null;
        c(null);
        ConcurrentHashMap concurrentHashMap2 = f39976c;
        if (concurrentHashMap2.containsKey(str)) {
            a5.f fVar = f39978e;
            if (fVar != null && (concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) fVar.f378b).get(str)) != null) {
                arrayList = new ArrayList(concurrentHashMap.size());
                Iterator it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((mf.a) ((Map.Entry) it.next()).getValue());
                }
            }
            int i11 = 0;
            if (arrayList != null) {
                map = new HashMap();
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    mf.a aVar = (mf.a) obj;
                    map.put(aVar.f41131a, Boolean.valueOf(aVar.f41132b));
                }
            } else {
                HashMap map2 = new HashMap();
                JSONObject jSONObject = (JSONObject) concurrentHashMap2.get(str);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String key = itKeys.next();
                    kotlin.jvm.internal.m.e(key, "key");
                    map2.put(key, Boolean.valueOf(jSONObject.optBoolean(key)));
                }
                a5.f fVar2 = f39978e;
                if (fVar2 == null) {
                    fVar2 = new a5.f(26);
                }
                ArrayList arrayList2 = new ArrayList(map2.size());
                for (Map.Entry entry : map2.entrySet()) {
                    arrayList2.add(new mf.a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
                int size2 = arrayList2.size();
                while (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    mf.a aVar2 = (mf.a) obj2;
                    concurrentHashMap3.put(aVar2.f41131a, aVar2);
                }
                ((ConcurrentHashMap) fVar2.f378b).put(str, concurrentHashMap3);
                f39978e = fVar2;
                map = map2;
            }
        } else {
            map = new HashMap();
        }
        return (map.containsKey(name) && (bool = (Boolean) map.get(name)) != null) ? bool.booleanValue() : z11;
    }

    public static final synchronized void c(z zVar) {
        if (zVar != null) {
            try {
                f39975b.add(zVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        String strB = re.s.b();
        Long l9 = f39977d;
        if (l9 != null && System.currentTimeMillis() - l9.longValue() < 3600000 && f39976c.containsKey(strB)) {
            e();
            return;
        }
        Context contextA = re.s.a();
        String str = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{strB}, 1));
        JSONObject jSONObject = null;
        String string = contextA.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(str, null);
        if (!j1.y(string)) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException unused) {
                re.s sVar = re.s.f49201a;
            }
            if (jSONObject != null) {
                d(jSONObject, strB);
            }
        }
        Executor executorD = re.s.d();
        if (f39974a.compareAndSet(false, true)) {
            executorD.execute(new b0(strB, contextA, str));
        }
    }

    public static final synchronized JSONObject d(JSONObject jSONObject, String applicationId) {
        JSONObject jSONObject2;
        try {
            kotlin.jvm.internal.m.f(applicationId, "applicationId");
            jSONObject2 = (JSONObject) f39976c.get(applicationId);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.optJSONObject(0) : null;
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("gatekeepers");
            if (jSONArrayOptJSONArray2 == null) {
                jSONArrayOptJSONArray2 = new JSONArray();
            }
            int length = jSONArrayOptJSONArray2.length();
            for (int i11 = 0; i11 < length; i11++) {
                try {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i11);
                    jSONObject2.put(jSONObject3.getString("key"), jSONObject3.getBoolean("value"));
                } catch (JSONException unused) {
                    re.s sVar = re.s.f49201a;
                }
            }
            f39976c.put(applicationId, jSONObject2);
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject2;
    }

    public static void e() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = f39975b;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            z zVar = (z) concurrentLinkedQueue.poll();
            if (zVar != null) {
                handler.post(new b2.a(zVar, 29));
            }
        }
    }
}
