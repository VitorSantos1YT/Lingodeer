package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zaa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        int iR = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int iR2 = 0;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                iR = SafeParcelReader.r(parcel, i11);
            } else if (c11 == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.f(parcel, i11, ParcelFileDescriptor.CREATOR);
            } else if (c11 != 3) {
                SafeParcelReader.w(parcel, i11);
            } else {
                iR2 = SafeParcelReader.r(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new BitmapTeleporter(iR, parcelFileDescriptor, iR2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new BitmapTeleporter[i11];
    }
}
