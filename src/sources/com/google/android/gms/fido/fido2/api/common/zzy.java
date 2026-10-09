package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        long jT = 0;
        boolean zM = false;
        boolean zM2 = false;
        String strG = null;
        String strG2 = null;
        byte[] bArrC = null;
        byte[] bArrC2 = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 1:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case 2:
                    strG2 = SafeParcelReader.g(parcel, i11);
                    break;
                case 3:
                    bArrC = SafeParcelReader.c(parcel, i11);
                    break;
                case 4:
                    bArrC2 = SafeParcelReader.c(parcel, i11);
                    break;
                case 5:
                    zM = SafeParcelReader.m(parcel, i11);
                    break;
                case 6:
                    zM2 = SafeParcelReader.m(parcel, i11);
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
        return new FidoCredentialDetails(strG, strG2, bArrC, bArrC2, zM, zM2, jT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new FidoCredentialDetails[i11];
    }
}
