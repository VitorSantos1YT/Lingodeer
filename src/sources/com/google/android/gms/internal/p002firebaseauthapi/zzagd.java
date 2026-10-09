package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zzagd implements zzael<zzagd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f9919a;

    public zzagd() {
        new zzaii(0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final zzael zza(String str) throws zzabz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("authUri", null);
            jSONObject.optBoolean("registered", false);
            jSONObject.optString("providerId", null);
            jSONObject.optBoolean("forExistingProvider", false);
            if (jSONObject.has("allProviders")) {
                new zzaii(zzaiv.b(jSONObject.optJSONArray("allProviders")));
            } else {
                new zzaii(0);
            }
            this.f9919a = zzaiv.b(jSONObject.optJSONArray("signinMethods"));
            return this;
        } catch (NullPointerException | JSONException e8) {
            throw zzaiv.a(e8, "zzagd", str);
        }
    }
}
