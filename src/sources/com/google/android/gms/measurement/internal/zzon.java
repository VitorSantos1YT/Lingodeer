package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzon implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        byte[] bArrC = null;
        String strG = null;
        Bundle bundleB = null;
        String strG2 = null;
        long jT = 0;
        long jT2 = 0;
        int iR = 0;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 1:
                    jT = SafeParcelReader.t(parcel, i11);
                    break;
                case 2:
                    bArrC = SafeParcelReader.c(parcel, i11);
                    break;
                case 3:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case 4:
                    bundleB = SafeParcelReader.b(parcel, i11);
                    break;
                case 5:
                    iR = SafeParcelReader.r(parcel, i11);
                    break;
                case 6:
                    jT2 = SafeParcelReader.t(parcel, i11);
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
        return new zzom(jT, bArrC, strG, bundleB, iR, jT2, strG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzom[i11];
    }
}
