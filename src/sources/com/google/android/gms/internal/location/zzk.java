package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzk implements Parcelable.Creator<zzj> {
    @Override // android.os.Parcelable.Creator
    public final zzj createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        com.google.android.gms.location.zzs zzsVar = zzj.f11114e;
        List listK = zzj.f11113d;
        String strG = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                zzsVar = (com.google.android.gms.location.zzs) SafeParcelReader.f(parcel, i11, com.google.android.gms.location.zzs.CREATOR);
            } else if (c11 == 2) {
                listK = SafeParcelReader.k(parcel, i11, ClientIdentity.CREATOR);
            } else if (c11 != 3) {
                SafeParcelReader.w(parcel, i11);
            } else {
                strG = SafeParcelReader.g(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzj(zzsVar, listK, strG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzj[] newArray(int i11) {
        return new zzj[i11];
    }
}
