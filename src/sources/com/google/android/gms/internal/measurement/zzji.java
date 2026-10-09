package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzji implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        long jT = 0;
        String strG = null;
        String strG2 = null;
        zzjf[] zzjfVarArr = null;
        byte[] bArrC = null;
        boolean zM = false;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 2:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case 3:
                    strG2 = SafeParcelReader.g(parcel, i11);
                    break;
                case 4:
                    zzjfVarArr = (zzjf[]) SafeParcelReader.j(parcel, i11, zzjf.CREATOR);
                    break;
                case 5:
                    zM = SafeParcelReader.m(parcel, i11);
                    break;
                case 6:
                    bArrC = SafeParcelReader.c(parcel, i11);
                    break;
                case 7:
                    jT = SafeParcelReader.t(parcel, i11);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzjh(strG, strG2, zzjfVarArr, zM, bArrC, jT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzjh[i11];
    }
}
