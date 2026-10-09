package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbg implements Parcelable.Creator<LocationResult> {
    @Override // android.os.Parcelable.Creator
    public final LocationResult createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        List listK = LocationResult.f12530b;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            if (((char) i11) != 1) {
                SafeParcelReader.w(parcel, i11);
            } else {
                listK = SafeParcelReader.k(parcel, i11, Location.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new LocationResult(listK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationResult[] newArray(int i11) {
        return new LocationResult[i11];
    }
}
