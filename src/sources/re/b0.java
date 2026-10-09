package re;

import hh.p0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f49122e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f49123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f49124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f49125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f49126d;

    public b0(y request, HttpURLConnection httpURLConnection, JSONObject jSONObject, JSONArray jSONArray, r rVar) {
        kotlin.jvm.internal.m.f(request, "request");
        this.f49123a = httpURLConnection;
        this.f49124b = jSONObject;
        this.f49125c = rVar;
        this.f49126d = jSONObject;
    }

    public final String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = this.f49123a;
            str = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200)}, 1));
        } catch (IOException unused) {
            str = "unknown";
        }
        StringBuilder sbQ = p0.q("{Response:  responseCode: ", str, ", graphObject: ");
        sbQ.append(this.f49124b);
        sbQ.append(", error: ");
        sbQ.append(this.f49125c);
        sbQ.append("}");
        String string = sbQ.toString();
        kotlin.jvm.internal.m.e(string, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return string;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(y request, HttpURLConnection httpURLConnection, String rawResponse, JSONObject jSONObject) {
        this(request, httpURLConnection, jSONObject, null, null);
        kotlin.jvm.internal.m.f(request, "request");
        kotlin.jvm.internal.m.f(rawResponse, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(y request, HttpURLConnection httpURLConnection, r rVar) {
        this(request, httpURLConnection, null, null, rVar);
        kotlin.jvm.internal.m.f(request, "request");
    }
}
