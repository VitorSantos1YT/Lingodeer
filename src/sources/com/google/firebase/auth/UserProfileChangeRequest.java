package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class UserProfileChangeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UserProfileChangeRequest> CREATOR = new zzaw();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f17922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17925d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 2, this.f17922a, false);
        SafeParcelWriter.k(parcel, 3, this.f17923b, false);
        boolean z11 = this.f17924c;
        SafeParcelWriter.p(parcel, 4, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.f17925d;
        SafeParcelWriter.p(parcel, 5, 4);
        parcel.writeInt(z12 ? 1 : 0);
        SafeParcelWriter.r(parcel, iQ);
    }
}
