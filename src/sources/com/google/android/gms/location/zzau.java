package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzau implements Parcelable.Creator<GeofencingRequest> {
    @Override // android.os.Parcelable.Creator
    public final GeofencingRequest createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strG = BuildConfig.VERSION_NAME;
        ArrayList arrayListK = null;
        int iR = 0;
        String strG2 = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                arrayListK = SafeParcelReader.k(parcel, i11, com.google.android.gms.internal.location.zzbe.CREATOR);
            } else if (c11 == 2) {
                iR = SafeParcelReader.r(parcel, i11);
            } else if (c11 == 3) {
                strG = SafeParcelReader.g(parcel, i11);
            } else if (c11 != 4) {
                SafeParcelReader.w(parcel, i11);
            } else {
                strG2 = SafeParcelReader.g(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new GeofencingRequest(arrayListK, iR, strG, strG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GeofencingRequest[] newArray(int i11) {
        return new GeofencingRequest[i11];
    }
}
