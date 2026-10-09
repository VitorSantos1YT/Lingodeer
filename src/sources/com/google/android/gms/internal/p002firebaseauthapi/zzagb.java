package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zzagb implements zzael<zzagb> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9918a;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final zzael zza(String str) throws zzabz {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt("code");
            this.f9918a = jSONObject.getString("message");
            return this;
        } catch (NullPointerException | JSONException e8) {
            e8.getMessage();
            throw new zzabz(a.g("Failed to parse error for string [", str, "]"), e8);
        }
    }
}
