package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaiq implements zzaei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10039e;

    public zzaiq(String str, String str2, String str3, String str4) {
        Preconditions.d(str);
        this.f10035a = str;
        Preconditions.d(str2);
        this.f10036b = str2;
        this.f10037c = str3;
        this.f10038d = str4;
        this.f10039e = true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaei
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(anrPHlQ.PiKenbqNkiAME, this.f10035a);
        jSONObject.put("password", this.f10036b);
        jSONObject.put("returnSecureToken", this.f10039e);
        String str = this.f10037c;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.f10038d;
        if (str2 != null) {
            zzaiv.c(jSONObject, "captchaResponse", str2);
        } else {
            jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
        }
        return jSONObject.toString();
    }
}
