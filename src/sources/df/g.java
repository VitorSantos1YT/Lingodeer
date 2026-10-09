package df;

import java.util.HashMap;
import java.util.HashSet;
import lf.e0;
import lf.h0;
import lf.j1;
import org.json.JSONArray;
import org.json.JSONObject;
import re.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f23405b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f23404a = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static HashMap f23406c = new HashMap();

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
                f23406c = new HashMap();
                JSONArray jSONArray = e0VarK.f40014s;
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
                        if (string != null && (hashSetF = j1.f(jSONArray2)) != null) {
                            f23406c.put(string, hashSetF);
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
