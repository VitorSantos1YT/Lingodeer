package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaiu implements zzaei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10054a;

    public zzaiu(String str) {
        Preconditions.d(str);
        this.f10054a = str;
        Preconditions.d(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaei
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f10054a);
        jSONObject.put("mfaEnrollmentId", (Object) null);
        return jSONObject.toString();
    }
}
