package tf;

import android.content.Context;
import android.os.Bundle;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qp.m3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f52149a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static y f52150b;

    public static final m3 a(JSONObject jSONObject) throws JSONException {
        String strOptString;
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
            String permission = jSONObjectOptJSONObject.optString("permission");
            kotlin.jvm.internal.m.e(permission, "permission");
            if (permission.length() != 0 && !permission.equals("installed") && (strOptString = jSONObjectOptJSONObject.optString("status")) != null) {
                int iHashCode = strOptString.hashCode();
                if (iHashCode != -1309235419) {
                    if (iHashCode != 280295099) {
                        if (iHashCode == 568196142 && strOptString.equals("declined")) {
                            arrayList2.add(permission);
                        }
                    } else if (strOptString.equals("granted")) {
                        arrayList.add(permission);
                    }
                } else if (strOptString.equals("expired")) {
                    arrayList3.add(permission);
                }
            }
        }
        m3 m3Var = new m3();
        m3Var.f48058c = arrayList;
        m3Var.f48056a = arrayList2;
        m3Var.f48057b = arrayList3;
        return m3Var;
    }

    public static final Bundle b(String str) {
        ScheduledExecutorService scheduledExecutorService = y.f52240d;
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", str);
        bundle.putString("3_method", BuildConfig.VERSION_NAME);
        bundle.putString("2_result", BuildConfig.VERSION_NAME);
        bundle.putString("5_error_message", BuildConfig.VERSION_NAME);
        bundle.putString("4_error_code", BuildConfig.VERSION_NAME);
        bundle.putString("6_extras", BuildConfig.VERSION_NAME);
        return bundle;
    }

    public d0 c() {
        if (d0.f52156k == null) {
            synchronized (this) {
                d0.f52156k = new d0();
            }
        }
        d0 d0Var = d0.f52156k;
        if (d0Var != null) {
            return d0Var;
        }
        kotlin.jvm.internal.m.n("instance");
        throw null;
    }

    public synchronized y d(Context context) {
        if (context == null) {
            try {
                context = re.s.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (f52150b == null) {
            f52150b = new y(context, re.s.b());
        }
        return f52150b;
    }
}
