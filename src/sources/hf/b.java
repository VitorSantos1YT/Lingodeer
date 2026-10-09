package hf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.m;
import lf.e0;
import lf.h0;
import lf.j1;
import org.json.JSONObject;
import re.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f32197b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f32196a = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f32198c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final CopyOnWriteArraySet f32199d = new CopyOnWriteArraySet();

    public final String a(String str, String str2) {
        if (!qf.a.b(this)) {
            try {
                ArrayList arrayList = new ArrayList(f32198c);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    a aVar = (a) obj;
                    if (aVar != null && m.a(str, aVar.f32194a)) {
                        for (String str3 : aVar.f32195b.keySet()) {
                            if (m.a(str2, str3)) {
                                return (String) aVar.f32195b.get(str3);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th2) {
                qf.a.a(this, th2);
            }
        }
        return null;
    }

    public final void b() {
        String str;
        CopyOnWriteArraySet copyOnWriteArraySet = f32199d;
        ArrayList arrayList = f32198c;
        if (qf.a.b(this)) {
            return;
        }
        try {
            e0 e0VarK = h0.k(s.b(), false);
            if (e0VarK != null && (str = e0VarK.f40010o) != null && str.length() != 0) {
                JSONObject jSONObject = new JSONObject(str);
                arrayList.clear();
                copyOnWriteArraySet.clear();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String key = itKeys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                    if (jSONObject2 != null) {
                        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("restrictive_param");
                        m.e(key, "key");
                        HashMap map = new HashMap();
                        a aVar = new a();
                        aVar.f32194a = key;
                        aVar.f32195b = map;
                        if (jSONObjectOptJSONObject != null) {
                            aVar.f32195b = j1.i(jSONObjectOptJSONObject);
                            arrayList.add(aVar);
                        }
                        if (jSONObject2.has("process_event_name")) {
                            copyOnWriteArraySet.add(key);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }
}
