package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzagr implements zzaei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9937a = zzagp.REFRESH_TOKEN.toString();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9938b;

    public zzagr(String str) {
        Preconditions.d(str);
        this.f9938b = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaei
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", this.f9937a);
        jSONObject.put("refreshToken", this.f9938b);
        return jSONObject.toString();
    }
}
