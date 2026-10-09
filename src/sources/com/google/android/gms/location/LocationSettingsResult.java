package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class LocationSettingsResult extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new zzbm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f12536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationSettingsStates f12537b;

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.f12536a = status;
        this.f12537b = locationSettingsStates;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f12536a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.j(parcel, 1, this.f12536a, i11, false);
        SafeParcelWriter.j(parcel, 2, this.f12537b, i11, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
