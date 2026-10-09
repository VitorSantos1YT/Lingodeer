package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zay;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zal implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        ConnectionResult connectionResult = null;
        int iR = 0;
        zay zayVar = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                iR = SafeParcelReader.r(parcel, i11);
            } else if (c11 == 2) {
                connectionResult = (ConnectionResult) SafeParcelReader.f(parcel, i11, ConnectionResult.CREATOR);
            } else if (c11 != 3) {
                SafeParcelReader.w(parcel, i11);
            } else {
                zayVar = (zay) SafeParcelReader.f(parcel, i11, zay.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zak(iR, connectionResult, zayVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zak[i11];
    }
}
