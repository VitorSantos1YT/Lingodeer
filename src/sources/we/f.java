package we;

import kotlin.jvm.internal.m;
import l0.Eeqr.HOBXIlHxIkMBEA;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f55107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f55108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f55109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f55110h;

    public f(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("class_name");
        m.e(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.f55103a = string;
        this.f55104b = jSONObject.optInt("index", -1);
        this.f55105c = jSONObject.optInt("id");
        String strOptString = jSONObject.optString("text");
        m.e(strOptString, "component.optString(PATH_TEXT_KEY)");
        this.f55106d = strOptString;
        String strOptString2 = jSONObject.optString("tag");
        m.e(strOptString2, HOBXIlHxIkMBEA.aVhZTcp);
        this.f55107e = strOptString2;
        String strOptString3 = jSONObject.optString("description");
        m.e(strOptString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f55108f = strOptString3;
        String strOptString4 = jSONObject.optString("hint");
        m.e(strOptString4, "component.optString(PATH_HINT_KEY)");
        this.f55109g = strOptString4;
        this.f55110h = jSONObject.optInt("match_bitmask");
    }
}
