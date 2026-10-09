package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zzaip implements zzael<zzaip> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f10033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f10034e;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final zzael zza(String str) throws zzabz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Strings.a(jSONObject.optString("localId", null));
            Strings.a(jSONObject.optString("email", null));
            Strings.a(jSONObject.optString("displayName", null));
            this.f10030a = Strings.a(jSONObject.optString("idToken", null));
            Strings.a(jSONObject.optString("photoUrl", null));
            this.f10031b = Strings.a(jSONObject.optString("refreshToken", null));
            this.f10032c = jSONObject.optLong("expiresIn", 0L);
            this.f10033d = zzahk.b(jSONObject.optJSONArray("mfaInfo"));
            this.f10034e = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e8) {
            throw zzaiv.a(e8, "zzaip", str);
        }
    }
}
