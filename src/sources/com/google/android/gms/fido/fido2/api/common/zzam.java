package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzam implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strG = null;
        byte[] bArrC = null;
        ArrayList arrayListK = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 2) {
                strG = SafeParcelReader.g(parcel, i11);
            } else if (c11 == 3) {
                bArrC = SafeParcelReader.c(parcel, i11);
            } else if (c11 != 4) {
                SafeParcelReader.w(parcel, i11);
            } else {
                arrayListK = SafeParcelReader.k(parcel, i11, Transport.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new PublicKeyCredentialDescriptor(strG, bArrC, arrayListK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new PublicKeyCredentialDescriptor[i11];
    }
}
