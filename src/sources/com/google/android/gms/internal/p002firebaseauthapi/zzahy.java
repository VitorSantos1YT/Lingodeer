package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzahy implements zzaei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10002e;

    public zzahy(String str, String str2, String str3, String str4, String str5) {
        Preconditions.d(str);
        this.f9998a = str;
        Preconditions.d(str2);
        this.f9999b = str2;
        this.f10000c = str3;
        this.f10001d = str4;
        this.f10002e = str5;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaei
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f9998a;
        if (str != null) {
            jSONObject.put("email", str);
        }
        String str2 = this.f9999b;
        if (str2 != null) {
            jSONObject.put("password", str2);
        }
        String str3 = this.f10000c;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.f10001d;
        if (str4 != null) {
            zzaiv.c(jSONObject, "captchaResponse", str4);
        } else {
            jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
        }
        String str5 = this.f10002e;
        if (str5 != null) {
            jSONObject.put("idToken", str5);
        }
        return jSONObject.toString();
    }
}
