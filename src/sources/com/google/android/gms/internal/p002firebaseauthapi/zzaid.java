package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaid extends zzahz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10004a;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahz
    public final String a() {
        return this.f10004a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahz
    /* JADX INFO: renamed from: b */
    public final zzahz zza(String str) throws zzabz {
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (jSONObjectOptJSONObject == null) {
                return this;
            }
            String strOptString = jSONObjectOptJSONObject.optString("sessionInfo");
            if (zzp.a(strOptString)) {
                strOptString = null;
            }
            this.f10004a = strOptString;
            return this;
        } catch (NullPointerException | JSONException e8) {
            throw zzaiv.a(e8, "zzaid", str);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahz, com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ zzael zza(String str) throws zzabz {
        zza(str);
        return this;
    }
}
