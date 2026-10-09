package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        long jT = -1;
        int iR = 0;
        int iR2 = 0;
        boolean zM = false;
        String strG = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                zM = SafeParcelReader.m(parcel, i11);
            } else if (c11 == 2) {
                strG = SafeParcelReader.g(parcel, i11);
            } else if (c11 == 3) {
                iR = SafeParcelReader.r(parcel, i11);
            } else if (c11 == 4) {
                iR2 = SafeParcelReader.r(parcel, i11);
            } else if (c11 != 5) {
                SafeParcelReader.w(parcel, i11);
            } else {
                jT = SafeParcelReader.t(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzr(iR, iR2, jT, strG, zM);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzr[i11];
    }
}
