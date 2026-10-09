package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbe implements Parcelable.Creator<LocationAvailability> {
    @Override // android.os.Parcelable.Creator
    public final LocationAvailability createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        int iR = 1000;
        long jT = 0;
        zzbo[] zzboVarArr = null;
        int iR2 = 1;
        int iR3 = 1;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                iR2 = SafeParcelReader.r(parcel, i11);
            } else if (c11 == 2) {
                iR3 = SafeParcelReader.r(parcel, i11);
            } else if (c11 == 3) {
                jT = SafeParcelReader.t(parcel, i11);
            } else if (c11 == 4) {
                iR = SafeParcelReader.r(parcel, i11);
            } else if (c11 != 5) {
                SafeParcelReader.w(parcel, i11);
            } else {
                zzboVarArr = (zzbo[]) SafeParcelReader.j(parcel, i11, zzbo.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iX);
        LocationAvailability locationAvailability = new LocationAvailability();
        locationAvailability.f12521d = iR;
        locationAvailability.f12518a = iR2;
        locationAvailability.f12519b = iR3;
        locationAvailability.f12520c = jT;
        locationAvailability.f12522e = zzboVarArr;
        return locationAvailability;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability[] newArray(int i11) {
        return new LocationAvailability[i11];
    }
}
