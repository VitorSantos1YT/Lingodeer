package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        byte[] bArrC = null;
        byte[] bArrC2 = null;
        byte[] bArrC3 = null;
        String[] strArrH = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 2) {
                bArrC = SafeParcelReader.c(parcel, i11);
            } else if (c11 == 3) {
                bArrC2 = SafeParcelReader.c(parcel, i11);
            } else if (c11 == 4) {
                bArrC3 = SafeParcelReader.c(parcel, i11);
            } else if (c11 != 5) {
                SafeParcelReader.w(parcel, i11);
            } else {
                strArrH = SafeParcelReader.h(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new AuthenticatorAttestationResponse(bArrC, bArrC2, bArrC3, strArrH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new AuthenticatorAttestationResponse[i11];
    }
}
