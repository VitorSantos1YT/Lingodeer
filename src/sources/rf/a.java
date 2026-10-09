package rf;

import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f49239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f49240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f49241c;

    public a(String str) {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f49241c = lValueOf;
        this.f49240b = str;
        StringBuffer stringBuffer = new StringBuffer("error_log_");
        stringBuffer.append(lValueOf.longValue());
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        m.e(string, "StringBuffer()\n         …)\n            .toString()");
        this.f49239a = string;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l9 = this.f49241c;
            if (l9 != null) {
                jSONObject.put("timestamp", l9);
            }
            jSONObject.put("error_message", this.f49240b);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return super.toString();
        }
        String string = jSONObject.toString();
        m.e(string, "params.toString()");
        return string;
    }
}
