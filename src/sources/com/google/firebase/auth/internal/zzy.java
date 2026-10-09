package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzy implements Parcelable.Creator<zzv> {
    @Override // android.os.Parcelable.Creator
    public final zzv createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strG = null;
        boolean zM = false;
        String strG2 = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                strG = SafeParcelReader.g(parcel, i11);
            } else if (c11 == 2) {
                strG2 = SafeParcelReader.g(parcel, i11);
            } else if (c11 != 3) {
                SafeParcelReader.w(parcel, i11);
            } else {
                zM = SafeParcelReader.m(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzv(strG, strG2, zM);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzv[] newArray(int i11) {
        return new zzv[i11];
    }
}
