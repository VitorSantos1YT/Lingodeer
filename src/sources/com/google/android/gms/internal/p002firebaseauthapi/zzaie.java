package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaie implements zzaia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10005a;

    public zzaie(String str) {
        Preconditions.d(str);
        this.f10005a = str;
        Preconditions.d("phone");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaei
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f10005a);
        jSONObject.put("mfaProvider", 1);
        if (!TextUtils.isEmpty(null)) {
            jSONObject.put("tenantId", (Object) null);
        }
        return jSONObject.toString();
    }
}
