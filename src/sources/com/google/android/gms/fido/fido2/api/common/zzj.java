package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        byte[] bArrC = null;
        byte[] bArrC2 = null;
        byte[] bArrC3 = null;
        byte[] bArrC4 = null;
        byte[] bArrC5 = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 2) {
                bArrC = SafeParcelReader.c(parcel, i11);
            } else if (c11 == 3) {
                bArrC2 = SafeParcelReader.c(parcel, i11);
            } else if (c11 == 4) {
                bArrC3 = SafeParcelReader.c(parcel, i11);
            } else if (c11 == 5) {
                bArrC4 = SafeParcelReader.c(parcel, i11);
            } else if (c11 != 6) {
                SafeParcelReader.w(parcel, i11);
            } else {
                bArrC5 = SafeParcelReader.c(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new AuthenticatorAssertionResponse(bArrC, bArrC2, bArrC3, bArrC4, bArrC5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new AuthenticatorAssertionResponse[i11];
    }
}
