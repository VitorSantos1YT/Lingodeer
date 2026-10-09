package xe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import lf.e0;
import lf.h0;
import lf.j1;
import org.json.JSONArray;
import org.json.JSONObject;
import re.s;
import se.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f56019b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f56018a = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f56020c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet f56021d = new HashSet();

    public static final void b(ArrayList events) {
        if (qf.a.b(b.class)) {
            return;
        }
        try {
            m.f(events, "events");
            if (f56019b) {
                Iterator it = events.iterator();
                while (it.hasNext()) {
                    if (f56021d.contains(((f) it.next()).f51596e)) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th2) {
            qf.a.a(b.class, th2);
        }
    }

    public final synchronized void a() {
        if (qf.a.b(this)) {
            return;
        }
        try {
            e0 e0VarK = h0.k(s.b(), false);
            if (e0VarK == null) {
                return;
            }
            String str = e0VarK.f40010o;
            if (str != null && str.length() > 0) {
                JSONObject jSONObject = new JSONObject(str);
                f56020c.clear();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String key = itKeys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                    if (jSONObject2 != null) {
                        if (jSONObject2.optBoolean("is_deprecated_event")) {
                            HashSet hashSet = f56021d;
                            m.e(key, "key");
                            hashSet.add(key);
                        } else {
                            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("deprecated_param");
                            m.e(key, "key");
                            ArrayList arrayList = new ArrayList();
                            a aVar = new a();
                            aVar.f56016a = key;
                            aVar.f56017b = arrayList;
                            if (jSONArrayOptJSONArray != null) {
                                aVar.f56017b = j1.g(jSONArrayOptJSONArray);
                            }
                            f56020c.add(aVar);
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
