package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strG = null;
        Long lU = null;
        ArrayList arrayListI = null;
        String strG2 = null;
        int iR = 0;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 1:
                    iR = SafeParcelReader.r(parcel, i11);
                    break;
                case 2:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case 3:
                    lU = SafeParcelReader.u(parcel, i11);
                    break;
                case 4:
                    zM = SafeParcelReader.m(parcel, i11);
                    break;
                case 5:
                    zM2 = SafeParcelReader.m(parcel, i11);
                    break;
                case 6:
                    arrayListI = SafeParcelReader.i(parcel, i11);
                    break;
                case 7:
                    strG2 = SafeParcelReader.g(parcel, i11);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new TokenData(iR, strG, lU, zM, zM2, arrayListI, strG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new TokenData[i11];
    }
}
