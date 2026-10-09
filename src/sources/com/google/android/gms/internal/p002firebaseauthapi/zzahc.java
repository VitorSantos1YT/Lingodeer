package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zzahc implements zzael<zzahc> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f9957a;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final zzael zza(String str) throws zzabz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f9957a = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (jSONArrayOptJSONArray != null) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                    this.f9957a.add(jSONArrayOptJSONArray.getString(i11));
                }
            }
            return this;
        } catch (JSONException e8) {
            throw zzaiv.a(e8, "zzahc", str);
        }
    }
}
