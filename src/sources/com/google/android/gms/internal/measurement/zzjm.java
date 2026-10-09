package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strG = null;
        byte[] bArrC = null;
        byte[][] bArrD = null;
        byte[][] bArrD2 = null;
        byte[][] bArrD3 = null;
        byte[][] bArrD4 = null;
        int[] iArrE = null;
        byte[][] bArrD5 = null;
        int[] iArrE2 = null;
        byte[][] bArrD6 = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 2:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case 3:
                    bArrC = SafeParcelReader.c(parcel, i11);
                    break;
                case 4:
                    bArrD = SafeParcelReader.d(parcel, i11);
                    break;
                case 5:
                    bArrD2 = SafeParcelReader.d(parcel, i11);
                    break;
                case 6:
                    bArrD3 = SafeParcelReader.d(parcel, i11);
                    break;
                case 7:
                    bArrD4 = SafeParcelReader.d(parcel, i11);
                    break;
                case '\b':
                    iArrE = SafeParcelReader.e(parcel, i11);
                    break;
                case '\t':
                    bArrD5 = SafeParcelReader.d(parcel, i11);
                    break;
                case '\n':
                    iArrE2 = SafeParcelReader.e(parcel, i11);
                    break;
                case 11:
                    bArrD6 = SafeParcelReader.d(parcel, i11);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzjl(strG, bArrC, bArrD, bArrD2, bArrD3, bArrD4, iArrE, bArrD5, iArrE2, bArrD6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzjl[i11];
    }
}
