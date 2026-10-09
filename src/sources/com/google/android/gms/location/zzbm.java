package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbm implements Parcelable.Creator<LocationSettingsResult> {
    @Override // android.os.Parcelable.Creator
    public final LocationSettingsResult createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        Status status = null;
        LocationSettingsStates locationSettingsStates = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                status = (Status) SafeParcelReader.f(parcel, i11, Status.CREATOR);
            } else if (c11 != 2) {
                SafeParcelReader.w(parcel, i11);
            } else {
                locationSettingsStates = (LocationSettingsStates) SafeParcelReader.f(parcel, i11, LocationSettingsStates.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new LocationSettingsResult(status, locationSettingsStates);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsResult[] newArray(int i11) {
        return new LocationSettingsResult[i11];
    }
}
