package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzan implements Parcelable.Creator<zzao> {
    @Override // android.os.Parcelable.Creator
    public final zzao createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strG = null;
        String strG2 = null;
        ArrayList arrayListK = null;
        ArrayList arrayListK2 = null;
        zzad zzadVar = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                strG = SafeParcelReader.g(parcel, i11);
            } else if (c11 == 2) {
                strG2 = SafeParcelReader.g(parcel, i11);
            } else if (c11 == 3) {
                arrayListK = SafeParcelReader.k(parcel, i11, PhoneMultiFactorInfo.CREATOR);
            } else if (c11 == 4) {
                arrayListK2 = SafeParcelReader.k(parcel, i11, TotpMultiFactorInfo.CREATOR);
            } else if (c11 != 5) {
                SafeParcelReader.w(parcel, i11);
            } else {
                zzadVar = (zzad) SafeParcelReader.f(parcel, i11, zzad.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iX);
        zzao zzaoVar = new zzao();
        zzaoVar.f17949a = strG;
        zzaoVar.f17950b = strG2;
        zzaoVar.f17951c = arrayListK;
        zzaoVar.f17952d = arrayListK2;
        zzaoVar.f17953e = zzadVar;
        return zzaoVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzao[] newArray(int i11) {
        return new zzao[i11];
    }
}
