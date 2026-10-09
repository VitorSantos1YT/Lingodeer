package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbp implements Parcelable.Creator<zzbo> {
    @Override // android.os.Parcelable.Creator
    public final zzbo createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        int iR = 1;
        int iR2 = 1;
        long jT = -1;
        long jT2 = -1;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                iR = SafeParcelReader.r(parcel, i11);
            } else if (c11 == 2) {
                iR2 = SafeParcelReader.r(parcel, i11);
            } else if (c11 == 3) {
                jT = SafeParcelReader.t(parcel, i11);
            } else if (c11 != 4) {
                SafeParcelReader.w(parcel, i11);
            } else {
                jT2 = SafeParcelReader.t(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzbo(iR, iR2, jT, jT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbo[] newArray(int i11) {
        return new zzbo[i11];
    }
}
