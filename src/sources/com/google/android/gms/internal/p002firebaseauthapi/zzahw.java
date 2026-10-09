package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zzahw implements zzael<zzahw> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzahm f9991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f9993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f9994e;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final zzael zza(String str) throws zzabz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f9990a = Strings.a(jSONObject.optString("email"));
            Strings.a(jSONObject.optString("passwordHash"));
            jSONObject.optBoolean("emailVerified", false);
            Strings.a(jSONObject.optString("displayName"));
            Strings.a(jSONObject.optString("photoUrl"));
            this.f9991b = zzahm.a(jSONObject.optJSONArray("providerUserInfo"));
            this.f9992c = Strings.a(jSONObject.optString("idToken"));
            this.f9993d = Strings.a(jSONObject.optString("refreshToken"));
            this.f9994e = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e8) {
            throw zzaiv.a(e8, "zzahw", str);
        }
    }
}
