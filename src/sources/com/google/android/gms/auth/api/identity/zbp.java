package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zbp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        byte[] bArrC = null;
        boolean zM = false;
        String strG = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                zM = SafeParcelReader.m(parcel, i11);
            } else if (c11 == 2) {
                bArrC = SafeParcelReader.c(parcel, i11);
            } else if (c11 != 3) {
                SafeParcelReader.w(parcel, i11);
            } else {
                strG = SafeParcelReader.g(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new BeginSignInRequest.PasskeysRequestOptions(zM, bArrC, strG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new BeginSignInRequest.PasskeysRequestOptions[i11];
    }
}
