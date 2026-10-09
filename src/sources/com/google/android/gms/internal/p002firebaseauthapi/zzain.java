package com.google.android.gms.internal.p002firebaseauthapi;

import a.ar.MFeWs;
import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zzain implements zzael<zzain> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10027d;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final zzael zza(String str) throws zzabz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f10024a = Strings.a(jSONObject.optString("idToken", null));
            this.f10025b = Strings.a(jSONObject.optString("refreshToken", null));
            this.f10026c = jSONObject.optLong(MFeWs.zSSMjvfPIMoV, 0L);
            this.f10027d = jSONObject.optBoolean("isNewUser", false);
            return this;
        } catch (NullPointerException | JSONException e8) {
            throw zzaiv.a(e8, "zzain", str);
        }
    }
}
