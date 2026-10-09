package nf;

import android.os.Build;
import i0.pKy.shrCcjmOhAmRC;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f43765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f43766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONArray f43767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f43768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f43769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f43770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f43771g;

    public final boolean a() {
        String str = this.f43770f;
        Long l9 = this.f43771g;
        c cVar = this.f43766b;
        int i11 = cVar == null ? -1 : d.f43764a[cVar.ordinal()];
        if (i11 == 1) {
            return (this.f43767c == null || l9 == null) ? false : true;
        }
        if (i11 != 2) {
            return ((i11 != 3 && i11 != 4 && i11 != 5) || str == null || l9 == null) ? false : true;
        }
        return (str == null || this.f43769e == null || l9 == null) ? false : true;
    }

    public final void b() {
        if (a()) {
            ob.f.R(this.f43765a, toString());
        }
    }

    public final String toString() {
        Long l9 = this.f43771g;
        c cVar = this.f43766b;
        int i11 = cVar == null ? -1 : d.f43764a[cVar.ordinal()];
        JSONObject jSONObject = null;
        try {
            if (i11 == 1) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray = this.f43767c;
                if (jSONArray != null) {
                    jSONObject2.put("feature_names", jSONArray);
                }
                if (l9 != null) {
                    jSONObject2.put("timestamp", l9);
                }
                jSONObject = jSONObject2;
            } else if (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("device_os_version", Build.VERSION.RELEASE);
                jSONObject3.put("device_model", Build.MODEL);
                String str = this.f43768d;
                if (str != null) {
                    jSONObject3.put("app_version", str);
                }
                if (l9 != null) {
                    jSONObject3.put("timestamp", l9);
                }
                String str2 = this.f43769e;
                if (str2 != null) {
                    jSONObject3.put("reason", str2);
                }
                String str3 = this.f43770f;
                if (str3 != null) {
                    jSONObject3.put("callstack", str3);
                }
                if (cVar != null) {
                    jSONObject3.put("type", cVar);
                }
                jSONObject = jSONObject3;
            }
        } catch (JSONException unused) {
        }
        if (jSONObject == null) {
            String string = new JSONObject().toString();
            m.e(string, "JSONObject().toString()");
            return string;
        }
        String string2 = jSONObject.toString();
        m.e(string2, shrCcjmOhAmRC.BJrAuqXkS);
        return string2;
    }
}
