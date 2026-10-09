package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zaab implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        Scope[] scopeArr = null;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                iR = SafeParcelReader.r(parcel, i11);
            } else if (c11 == 2) {
                iR2 = SafeParcelReader.r(parcel, i11);
            } else if (c11 == 3) {
                iR3 = SafeParcelReader.r(parcel, i11);
            } else if (c11 != 4) {
                SafeParcelReader.w(parcel, i11);
            } else {
                scopeArr = (Scope[]) SafeParcelReader.j(parcel, i11, Scope.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zaaa(iR, iR2, iR3, scopeArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zaaa[i11];
    }
}
