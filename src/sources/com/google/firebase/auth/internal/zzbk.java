package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbk implements Parcelable.Creator<zzbl> {
    @Override // android.os.Parcelable.Creator
    public final zzbl createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        ArrayList arrayListK = null;
        ArrayList arrayListK2 = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                arrayListK = SafeParcelReader.k(parcel, i11, PhoneMultiFactorInfo.CREATOR);
            } else if (c11 != 2) {
                SafeParcelReader.w(parcel, i11);
            } else {
                arrayListK2 = SafeParcelReader.k(parcel, i11, TotpMultiFactorInfo.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzbl(arrayListK, arrayListK2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbl[] newArray(int i11) {
        return new zzbl[i11];
    }
}
