package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbl implements Parcelable.Creator<LocationSettingsRequest> {
    @Override // android.os.Parcelable.Creator
    public final LocationSettingsRequest createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        ArrayList arrayListK = null;
        boolean zM = false;
        boolean zM2 = false;
        zzbj zzbjVar = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                arrayListK = SafeParcelReader.k(parcel, i11, LocationRequest.CREATOR);
            } else if (c11 == 2) {
                zM = SafeParcelReader.m(parcel, i11);
            } else if (c11 == 3) {
                zM2 = SafeParcelReader.m(parcel, i11);
            } else if (c11 != 5) {
                SafeParcelReader.w(parcel, i11);
            } else {
                zzbjVar = (zzbj) SafeParcelReader.f(parcel, i11, zzbj.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new LocationSettingsRequest(arrayListK, zM, zM2, zzbjVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsRequest[] newArray(int i11) {
        return new LocationSettingsRequest[i11];
    }
}
