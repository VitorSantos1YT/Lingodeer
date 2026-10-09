package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zaz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        int iR = 0;
        boolean zM = false;
        boolean zM2 = false;
        IBinder iBinderQ = null;
        ConnectionResult connectionResult = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                iR = SafeParcelReader.r(parcel, i11);
            } else if (c11 == 2) {
                iBinderQ = SafeParcelReader.q(parcel, i11);
            } else if (c11 == 3) {
                connectionResult = (ConnectionResult) SafeParcelReader.f(parcel, i11, ConnectionResult.CREATOR);
            } else if (c11 == 4) {
                zM = SafeParcelReader.m(parcel, i11);
            } else if (c11 != 5) {
                SafeParcelReader.w(parcel, i11);
            } else {
                zM2 = SafeParcelReader.m(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zay(iR, iBinderQ, connectionResult, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zay[i11];
    }
}
