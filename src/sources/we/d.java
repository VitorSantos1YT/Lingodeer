package we;

import java.util.ArrayList;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f55101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55102d;

    public d(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("name");
        m.e(string, "component.getString(PARAMETER_NAME_KEY)");
        this.f55099a = string;
        String strOptString = jSONObject.optString("value");
        m.e(strOptString, "component.optString(PARAMETER_VALUE_KEY)");
        this.f55100b = strOptString;
        String strOptString2 = jSONObject.optString("path_type", "absolute");
        m.e(strOptString2, "component.optString(Cons…tants.PATH_TYPE_ABSOLUTE)");
        this.f55102d = strOptString2;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("path");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i11);
                m.e(jSONObject2, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new f(jSONObject2));
            }
        }
        this.f55101c = arrayList;
    }
}
