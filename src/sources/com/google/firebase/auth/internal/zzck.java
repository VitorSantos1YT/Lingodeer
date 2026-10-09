package com.google.firebase.auth.internal;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzck {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f18012a;

    static {
        HashMap map = new HashMap();
        f18012a = map;
        map.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        map.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        map.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        map.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        map.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static Status a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("message");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                HashMap map = f18012a;
                if (map.containsKey(string)) {
                    return zzaq.a(((String) map.get(string)) + ":" + string2);
                }
            }
            return zzaq.a("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e8) {
            return zzaq.a("WEB_INTERNAL_ERROR:" + str + "[ " + e8.getLocalizedMessage() + " ]");
        }
    }
}
