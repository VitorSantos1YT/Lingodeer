package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p002firebaseauthapi.zzaih;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzau implements Parcelable.Creator<TotpMultiFactorInfo> {
    @Override // android.os.Parcelable.Creator
    public final TotpMultiFactorInfo createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strG = null;
        String strG2 = null;
        zzaih zzaihVar = null;
        long jT = 0;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                strG = SafeParcelReader.g(parcel, i11);
            } else if (c11 == 2) {
                strG2 = SafeParcelReader.g(parcel, i11);
            } else if (c11 == 3) {
                jT = SafeParcelReader.t(parcel, i11);
            } else if (c11 != 4) {
                SafeParcelReader.w(parcel, i11);
            } else {
                zzaihVar = (zzaih) SafeParcelReader.f(parcel, i11, zzaih.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new TotpMultiFactorInfo(strG, strG2, jT, zzaihVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TotpMultiFactorInfo[] newArray(int i11) {
        return new TotpMultiFactorInfo[i11];
    }
}
