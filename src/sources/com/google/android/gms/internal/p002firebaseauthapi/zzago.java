package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzago implements zzagj {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaei
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaProvider", 1);
        jSONObject.put("phoneVerificationInfo", new JSONObject());
        jSONObject.put("mfaPendingCredential", (Object) null);
        return jSONObject.toString();
    }
}
