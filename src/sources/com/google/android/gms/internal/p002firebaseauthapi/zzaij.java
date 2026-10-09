package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import defpackage.e;
import ep.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaij extends AbstractSafeParcelable implements zzaei {
    public static final Parcelable.Creator<zzaij> CREATOR = new zzaim();
    public String H;
    public boolean K;
    public boolean L;
    public String M;
    public String N;
    public String O;
    public String P;
    public boolean Q;
    public String R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f10013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f10014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f10015f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f10016t;

    public zzaij() {
        this.K = true;
        this.L = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 2, this.f10010a, false);
        SafeParcelWriter.k(parcel, 3, this.f10011b, false);
        SafeParcelWriter.k(parcel, 4, this.f10012c, false);
        SafeParcelWriter.k(parcel, 5, this.f10013d, false);
        SafeParcelWriter.k(parcel, 6, this.f10014e, false);
        SafeParcelWriter.k(parcel, 7, this.f10015f, false);
        SafeParcelWriter.k(parcel, 8, this.f10016t, false);
        SafeParcelWriter.k(parcel, 9, this.H, false);
        boolean z11 = this.K;
        SafeParcelWriter.p(parcel, 10, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.L;
        SafeParcelWriter.p(parcel, 11, 4);
        parcel.writeInt(z12 ? 1 : 0);
        SafeParcelWriter.k(parcel, 12, this.M, false);
        SafeParcelWriter.k(parcel, 13, this.N, false);
        SafeParcelWriter.k(parcel, 14, this.O, false);
        SafeParcelWriter.k(parcel, 15, this.P, false);
        boolean z13 = this.Q;
        SafeParcelWriter.p(parcel, 16, 4);
        parcel.writeInt(z13 ? 1 : 0);
        SafeParcelWriter.k(parcel, 17, this.R, false);
        SafeParcelWriter.r(parcel, iQ);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaei
    public final String zza() throws JSONException {
        String str = this.O;
        String str2 = this.N;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoCreate", this.L);
        jSONObject.put("returnSecureToken", this.K);
        String str3 = this.f10011b;
        if (str3 != null) {
            jSONObject.put("idToken", str3);
        }
        String str4 = this.f10016t;
        if (str4 != null) {
            jSONObject.put("postBody", str4);
        }
        String str5 = this.P;
        if (str5 != null) {
            jSONObject.put("tenantId", str5);
        }
        String str6 = this.R;
        if (str6 != null) {
            jSONObject.put("pendingToken", str6);
        }
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("sessionId", str2);
        }
        if (TextUtils.isEmpty(str)) {
            String str7 = this.f10010a;
            if (str7 != null) {
                jSONObject.put("requestUri", str7);
            }
        } else {
            jSONObject.put("requestUri", str);
        }
        jSONObject.put("returnIdpCredential", this.Q);
        return jSONObject.toString();
    }

    public zzaij(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f10010a = "http://localhost";
        this.f10012c = str;
        this.f10013d = str2;
        this.H = str4;
        this.M = str5;
        this.P = str6;
        this.R = str7;
        this.K = true;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str5)) {
            throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        }
        Preconditions.d(str3);
        this.f10014e = str3;
        this.f10015f = null;
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            e.C(sb2, "id_token=", str, "&");
        }
        if (!TextUtils.isEmpty(str2)) {
            e.C(sb2, "access_token=", str2, "&");
        }
        if (!TextUtils.isEmpty(null)) {
            sb2.append("identifier=null&");
        }
        if (!TextUtils.isEmpty(str4)) {
            e.C(sb2, "oauth_token_secret=", str4, "&");
        }
        if (!TextUtils.isEmpty(str5)) {
            e.C(sb2, "code=", str5, "&");
        }
        if (!TextUtils.isEmpty(str8)) {
            e.C(sb2, "nonce=", str8, "&");
        }
        this.f10016t = a.k(sb2, "providerId=", str3);
        this.L = true;
    }
}
