package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzais implements zzaei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f10049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f10050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10051f;

    private zzais() {
    }

    public static zzais a(String str, String str2, boolean z11) {
        zzais zzaisVar = new zzais();
        Preconditions.d(str);
        zzaisVar.f10047b = str;
        Preconditions.d(str2);
        zzaisVar.f10048c = str2;
        zzaisVar.f10051f = z11;
        return zzaisVar;
    }

    public static zzais b(String str, String str2, boolean z11) {
        zzais zzaisVar = new zzais();
        Preconditions.d(str);
        zzaisVar.f10046a = str;
        Preconditions.d(str2);
        zzaisVar.f10049d = str2;
        zzaisVar.f10051f = z11;
        return zzaisVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaei
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(this.f10049d)) {
            jSONObject.put("sessionInfo", this.f10047b);
            jSONObject.put("code", this.f10048c);
        } else {
            jSONObject.put("phoneNumber", this.f10046a);
            jSONObject.put("temporaryProof", this.f10049d);
        }
        String str = this.f10050e;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.f10051f) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }
}
