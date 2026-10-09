package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzagn implements zzagh {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaei
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", (Object) null);
        if (!TextUtils.isEmpty(null)) {
            jSONObject.put("displayName", (Object) null);
        }
        JSONObject jSONObject2 = new JSONObject();
        if (!TextUtils.isEmpty(null)) {
            jSONObject2.put("sessionInfo", (Object) null);
        }
        if (!TextUtils.isEmpty(null)) {
            jSONObject2.put("verificationCode", (Object) null);
        }
        jSONObject.put("totpVerificationInfo", jSONObject2);
        if (!TextUtils.isEmpty(null)) {
            jSONObject.put("tenantId", (Object) null);
        }
        return jSONObject.toString();
    }
}
