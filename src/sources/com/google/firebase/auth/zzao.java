package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.p002firebaseauthapi.zzaz;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new zzan();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18068c;

    public zzao(String str, String str2, String str3) {
        this.f18066a = str;
        this.f18067b = str2;
        this.f18068c = str3;
    }

    public static com.google.android.gms.internal.p002firebaseauthapi.zzah D1(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return com.google.android.gms.internal.p002firebaseauthapi.zzah.k();
        }
        zzaz zzazVar = com.google.android.gms.internal.p002firebaseauthapi.zzah.f9955b;
        com.google.android.gms.internal.p002firebaseauthapi.zzak zzakVar = new com.google.android.gms.internal.p002firebaseauthapi.zzak();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            zzakVar.b(new zzao(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName")));
        }
        return zzakVar.c();
    }

    public static final zzao E1(JSONObject jSONObject) {
        return new zzao(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, this.f18066a, false);
        SafeParcelWriter.k(parcel, 2, this.f18067b, false);
        SafeParcelWriter.k(parcel, 3, this.f18068c, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
