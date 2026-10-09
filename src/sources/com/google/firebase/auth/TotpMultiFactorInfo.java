package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.p002firebaseauthapi.zzaih;
import com.google.android.gms.internal.p002firebaseauthapi.zzzx;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class TotpMultiFactorInfo extends MultiFactorInfo {
    public static final Parcelable.Creator<TotpMultiFactorInfo> CREATOR = new zzau();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzaih f17919d;

    public TotpMultiFactorInfo(String str, String str2, long j11, zzaih zzaihVar) {
        Preconditions.d(str);
        this.f17916a = str;
        this.f17917b = str2;
        this.f17918c = j11;
        Preconditions.h(zzaihVar, "totpInfo cannot be null.");
        this.f17919d = zzaihVar;
    }

    public static TotpMultiFactorInfo F1(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
        }
        long jOptLong = jSONObject.optLong("enrollmentTimestamp");
        if (jSONObject.opt("totpInfo") == null) {
            throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        }
        return new TotpMultiFactorInfo(jSONObject.optString("uid"), jSONObject.optString("displayName"), jOptLong, new zzaih());
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final String D1() {
        return "totp";
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final JSONObject E1() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f17916a);
            jSONObject.putOpt("displayName", this.f17917b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f17918c));
            jSONObject.putOpt("totpInfo", this.f17919d);
            return jSONObject;
        } catch (JSONException e8) {
            throw new zzzx(e8);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, this.f17916a, false);
        SafeParcelWriter.k(parcel, 2, this.f17917b, false);
        SafeParcelWriter.p(parcel, 3, 8);
        parcel.writeLong(this.f17918c);
        SafeParcelWriter.j(parcel, 4, this.f17919d, i11, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
