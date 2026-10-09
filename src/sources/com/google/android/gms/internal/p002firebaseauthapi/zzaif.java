package com.google.android.gms.internal.p002firebaseauthapi;

import java.text.ParseException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaif extends zzahz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10008c;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahz
    public final String a() {
        return this.f10006a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahz
    /* JADX INFO: renamed from: b */
    public final zzahz zza(String str) throws zzabz {
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("totpSessionInfo");
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("sharedSecretKey");
                String str2 = null;
                if (zzp.a(strOptString)) {
                    strOptString = null;
                }
                this.f10007b = strOptString;
                jSONObjectOptJSONObject.optInt("verificationCodeLength");
                String strOptString2 = jSONObjectOptJSONObject.optString("hashingAlgorithm");
                if (zzp.a(strOptString2)) {
                    strOptString2 = null;
                }
                this.f10008c = strOptString2;
                jSONObjectOptJSONObject.optInt("periodSec");
                String strOptString3 = jSONObjectOptJSONObject.optString("sessionInfo");
                if (!zzp.a(strOptString3)) {
                    str2 = strOptString3;
                }
                this.f10006a = str2;
                try {
                    zzanz.b(zzanz.a(jSONObjectOptJSONObject.optString("finalizeEnrollmentTime")));
                    return this;
                } catch (ParseException unused) {
                }
            }
            return this;
        } catch (NullPointerException | JSONException e8) {
            throw zzaiv.a(e8, "zzaif", str);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahz, com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ zzael zza(String str) throws zzabz {
        zza(str);
        return this;
    }
}
