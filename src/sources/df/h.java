package df;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.m;
import lf.e0;
import lf.h0;
import lf.j1;
import org.json.JSONArray;
import org.json.JSONObject;
import re.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f23408b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f23407a = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static HashSet f23409c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static HashMap f23410d = new HashMap();

    public static final void b(String eventName, Bundle bundle) {
        if (qf.a.b(h.class)) {
            return;
        }
        try {
            m.f(eventName, "eventName");
            if (f23408b && bundle != null) {
                if (!f23409c.isEmpty() || f23410d.containsKey(eventName)) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        HashSet hashSet = (HashSet) f23410d.get(eventName);
                        ArrayList arrayList = new ArrayList(bundle.keySet());
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            String key = (String) obj;
                            h hVar = f23407a;
                            m.e(key, "key");
                            if (!qf.a.b(hVar)) {
                                try {
                                    if (f23409c.contains(key) || (hashSet != null && !hashSet.isEmpty() && hashSet.contains(key))) {
                                        bundle.remove(key);
                                        jSONArray.put(key);
                                    }
                                } catch (Throwable th2) {
                                    qf.a.a(hVar, th2);
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                    if (jSONArray.length() > 0) {
                        bundle.putString("_filteredKey", jSONArray.toString());
                    }
                }
            }
        } catch (Throwable th3) {
            qf.a.a(h.class, th3);
        }
    }

    public final void a() {
        HashSet hashSetF;
        if (qf.a.b(this)) {
            return;
        }
        try {
            e0 e0VarK = h0.k(s.b(), false);
            if (e0VarK == null) {
                return;
            }
            try {
                f23409c = new HashSet();
                f23410d = new HashMap();
                JSONArray jSONArray = e0VarK.f40015t;
                if (jSONArray == null || jSONArray.length() == 0) {
                    return;
                }
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                    boolean zHas = jSONObject.has("key");
                    boolean zHas2 = jSONObject.has("value");
                    if (zHas && zHas2) {
                        String string = jSONObject.getString("key");
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        if (jSONArray2 != null && (hashSetF = j1.f(jSONArray2)) != null) {
                            if (string.equals("_MTSDK_Default_")) {
                                f23409c = hashSetF;
                            } else {
                                f23410d.put(string, hashSetF);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }
}
