package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.p002firebaseauthapi.zzzx;
import com.google.firebase.auth.UserInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzz extends AbstractSafeParcelable implements UserInfo {
    public static final Parcelable.Creator<zzz> CREATOR = new zzac();
    public String H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f18037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f18038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f18039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f18040f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f18041t;

    public zzz(String str, String str2, String str3, String str4, String str5, String str6, boolean z11, String str7) {
        this.f18035a = str;
        this.f18036b = str2;
        this.f18039e = str3;
        this.f18040f = str4;
        this.f18037c = str5;
        this.f18038d = str6;
        if (!TextUtils.isEmpty(str6)) {
            Uri.parse(str6);
        }
        this.f18041t = z11;
        this.H = str7;
    }

    public static zzz D1(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new zzz(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e8) {
            throw new zzzx(e8);
        }
    }

    public final String E1() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f18035a);
            jSONObject.putOpt("providerId", this.f18036b);
            jSONObject.putOpt("displayName", this.f18037c);
            jSONObject.putOpt("photoUrl", this.f18038d);
            jSONObject.putOpt("email", this.f18039e);
            jSONObject.putOpt("phoneNumber", this.f18040f);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f18041t));
            jSONObject.putOpt("rawUserInfo", this.H);
            return jSONObject.toString();
        } catch (JSONException e8) {
            throw new zzzx(e8);
        }
    }

    @Override // com.google.firebase.auth.UserInfo
    public final String p0() {
        return this.f18036b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, this.f18035a, false);
        SafeParcelWriter.k(parcel, 2, this.f18036b, false);
        SafeParcelWriter.k(parcel, 3, this.f18037c, false);
        SafeParcelWriter.k(parcel, 4, this.f18038d, false);
        SafeParcelWriter.k(parcel, 5, this.f18039e, false);
        SafeParcelWriter.k(parcel, 6, this.f18040f, false);
        boolean z11 = this.f18041t;
        SafeParcelWriter.p(parcel, 7, 4);
        parcel.writeInt(z11 ? 1 : 0);
        SafeParcelWriter.k(parcel, 8, this.H, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
