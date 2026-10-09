package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zzahx implements zzael<zzahx> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f9997c;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final zzael zza(String str) throws zzabz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f9995a = Strings.a(jSONObject.optString("idToken", null));
            Strings.a(jSONObject.optString("displayName", null));
            Strings.a(jSONObject.optString("email", null));
            this.f9996b = Strings.a(jSONObject.optString("refreshToken", null));
            this.f9997c = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e8) {
            throw zzaiv.a(e8, "zzahx", str);
        }
    }
}
