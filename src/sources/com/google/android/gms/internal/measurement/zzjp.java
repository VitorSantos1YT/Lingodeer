package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        boolean zM = false;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        String strG = null;
        String strG2 = null;
        byte[] bArrC = null;
        double d5 = 0.0d;
        long jT = 0;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 2:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case 3:
                    jT = SafeParcelReader.t(parcel, i11);
                    break;
                case 4:
                    zM = SafeParcelReader.m(parcel, i11);
                    break;
                case 5:
                    SafeParcelReader.y(parcel, i11, 8);
                    d5 = parcel.readDouble();
                    break;
                case 6:
                    strG2 = SafeParcelReader.g(parcel, i11);
                    break;
                case 7:
                    bArrC = SafeParcelReader.c(parcel, i11);
                    break;
                case '\b':
                    iR = SafeParcelReader.r(parcel, i11);
                    break;
                case '\t':
                    iR2 = SafeParcelReader.r(parcel, i11);
                    break;
                case '\n':
                    iR3 = SafeParcelReader.r(parcel, i11);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzjo(strG, jT, zM, d5, strG2, bArrC, iR, iR2, iR3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzjo[i11];
    }
}
