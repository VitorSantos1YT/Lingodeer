package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.firebase.auth.FirebaseUserMetadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaf implements FirebaseUserMetadata {
    public static final Parcelable.Creator<zzaf> CREATOR = new zzai();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17941b;

    public zzaf(long j11, long j12) {
        this.f17940a = j11;
        this.f17941b = j12;
    }

    public static zzaf a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new zzaf(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 8);
        parcel.writeLong(this.f17940a);
        SafeParcelWriter.p(parcel, 2, 8);
        parcel.writeLong(this.f17941b);
        SafeParcelWriter.r(parcel, iQ);
    }
}
