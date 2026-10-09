package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zzair implements zzael<zzair> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f10044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f10045f;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final zzael zza(String str) throws zzabz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f10040a = Strings.a(jSONObject.optString("idToken", null));
            this.f10041b = Strings.a(jSONObject.optString("refreshToken", null));
            this.f10042c = jSONObject.optLong("expiresIn", 0L);
            Strings.a(jSONObject.optString("localId", null));
            this.f10043d = jSONObject.optBoolean("isNewUser", false);
            this.f10044e = Strings.a(jSONObject.optString("temporaryProof", null));
            this.f10045f = Strings.a(jSONObject.optString("phoneNumber", null));
            return this;
        } catch (NullPointerException | JSONException e8) {
            throw zzaiv.a(e8, "zzair", str);
        }
    }
}
