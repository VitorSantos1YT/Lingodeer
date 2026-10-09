package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zzahz implements zzael<zzahz> {
    public String a() {
        return null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public zzahz zza(String str) throws zzabz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optJSONObject("phoneSessionInfo") != null) {
                zzaid zzaidVar = new zzaid();
                zzaidVar.zza(str);
                return zzaidVar;
            }
            if (jSONObject.optJSONObject("totpSessionInfo") == null) {
                throw new IllegalArgumentException("Missing phoneSessionInfo or totpSessionInfo.");
            }
            zzaif zzaifVar = new zzaif();
            zzaifVar.zza(str);
            return zzaifVar;
        } catch (NullPointerException e8) {
            e = e8;
            throw zzaiv.a(e, "zzahz", str);
        } catch (JSONException e10) {
            e = e10;
            throw zzaiv.a(e, "zzahz", str);
        }
    }
}
