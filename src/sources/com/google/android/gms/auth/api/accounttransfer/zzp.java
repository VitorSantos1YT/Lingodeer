package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.HashSet;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        HashSet hashSet = new HashSet();
        int iR = 0;
        ArrayList arrayListK = null;
        zzs zzsVar = null;
        int iR2 = 0;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                iR = SafeParcelReader.r(parcel, i11);
                hashSet.add(1);
            } else if (c11 == 2) {
                arrayListK = SafeParcelReader.k(parcel, i11, zzu.CREATOR);
                hashSet.add(2);
            } else if (c11 == 3) {
                iR2 = SafeParcelReader.r(parcel, i11);
                hashSet.add(3);
            } else if (c11 != 4) {
                SafeParcelReader.w(parcel, i11);
            } else {
                zzsVar = (zzs) SafeParcelReader.f(parcel, i11, zzs.CREATOR);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == iX) {
            return new zzo(hashSet, iR, arrayListK, iR2, zzsVar);
        }
        throw new SafeParcelReader.ParseException(p.j(iX, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzo[i11];
    }
}
