package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.ActionCodeUrl;
import com.google.firebase.auth.EmailAuthCredential;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zzagf implements zzaei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EmailAuthCredential f9923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9925e;

    static {
        new Logger("zzagf", new String[0]);
    }

    public zzagf(EmailAuthCredential emailAuthCredential, String str, String str2) {
        Preconditions.g(emailAuthCredential);
        this.f9923c = emailAuthCredential;
        String str3 = emailAuthCredential.f17872a;
        Preconditions.d(str3);
        this.f9921a = str3;
        String str4 = emailAuthCredential.f17874c;
        Preconditions.d(str4);
        this.f9922b = str4;
        this.f9924d = str;
        this.f9925e = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaei
    public final String zza() throws JSONException {
        ActionCodeUrl actionCodeUrl;
        int i11 = ActionCodeUrl.f17869c;
        String str = this.f9922b;
        Preconditions.d(str);
        try {
            actionCodeUrl = new ActionCodeUrl(str);
        } catch (IllegalArgumentException unused) {
            actionCodeUrl = null;
        }
        String str2 = actionCodeUrl != null ? actionCodeUrl.f17870a : null;
        String str3 = actionCodeUrl != null ? actionCodeUrl.f17871b : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.f9921a);
        if (str2 != null) {
            jSONObject.put("oobCode", str2);
        }
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.f9924d;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        String str5 = this.f9925e;
        if (str5 != null) {
            zzaiv.c(jSONObject, "captchaResp", str5);
        } else {
            jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
        }
        return jSONObject.toString();
    }
}
