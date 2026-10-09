package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.p002firebaseauthapi.zzzx;
import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PhoneMultiFactorInfo extends MultiFactorInfo {
    public static final Parcelable.Creator<PhoneMultiFactorInfo> CREATOR = new zzar();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17914d;

    public PhoneMultiFactorInfo(long j11, String str, String str2, String str3) {
        Preconditions.d(str);
        this.f17911a = str;
        this.f17912b = str2;
        this.f17913c = j11;
        Preconditions.d(str3);
        this.f17914d = str3;
    }

    public static PhoneMultiFactorInfo F1(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
        }
        return new PhoneMultiFactorInfo(jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optString("phoneNumber"));
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final String D1() {
        return "phone";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, this.f17911a, false);
        SafeParcelWriter.k(parcel, 2, this.f17912b, false);
        SafeParcelWriter.p(parcel, 3, 8);
        parcel.writeLong(this.f17913c);
        SafeParcelWriter.k(parcel, 4, this.f17914d, false);
        SafeParcelWriter.r(parcel, iQ);
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final JSONObject E1() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(ualZoVVCQs.wGCejDsJi, "phone");
            jSONObject.putOpt("uid", this.f17911a);
            jSONObject.putOpt("displayName", this.f17912b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f17913c));
            jSONObject.putOpt("phoneNumber", this.f17914d);
            return jSONObject;
        } catch (JSONException e8) {
            throw new zzzx(e8);
        }
    }
}
