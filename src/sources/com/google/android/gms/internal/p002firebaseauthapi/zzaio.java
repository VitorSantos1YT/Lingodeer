package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaio implements zzaei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10029b;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaei
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", this.f10028a);
        jSONObject.put("returnSecureToken", true);
        String str = this.f10029b;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
