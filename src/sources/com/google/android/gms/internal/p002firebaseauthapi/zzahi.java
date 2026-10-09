package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzahi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f9967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f9968b;

    public static zzahi a(String str) throws UnsupportedEncodingException {
        try {
            zzahi zzahiVar = new zzahi();
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("iss");
            jSONObject.optString("aud");
            jSONObject.optString("sub");
            zzahiVar.f9967a = Long.valueOf(jSONObject.optLong("iat"));
            zzahiVar.f9968b = Long.valueOf(jSONObject.optLong("exp"));
            jSONObject.optBoolean("is_anonymous");
            return zzahiVar;
        } catch (JSONException e8) {
            if (Log.isLoggable("JwtToken", 3)) {
                String.valueOf(e8);
            }
            throw new UnsupportedEncodingException("Failed to read JwtToken from JSONObject. ".concat(String.valueOf(e8)));
        }
    }
}
