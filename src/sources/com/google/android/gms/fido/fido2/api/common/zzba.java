package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzba implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        int iR = 0;
        short s3 = 0;
        short s11 = 0;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                iR = SafeParcelReader.r(parcel, i11);
            } else if (c11 == 2) {
                SafeParcelReader.y(parcel, i11, 4);
                s3 = (short) parcel.readInt();
            } else if (c11 != 3) {
                SafeParcelReader.w(parcel, i11);
            } else {
                SafeParcelReader.y(parcel, i11, 4);
                s11 = (short) parcel.readInt();
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new UvmEntry(iR, s3, s11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new UvmEntry[i11];
    }
}
