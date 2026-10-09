package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zah implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        int iR = 0;
        int iR2 = 0;
        Uri uri = null;
        int iR3 = 0;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                iR = SafeParcelReader.r(parcel, i11);
            } else if (c11 == 2) {
                uri = (Uri) SafeParcelReader.f(parcel, i11, Uri.CREATOR);
            } else if (c11 == 3) {
                iR3 = SafeParcelReader.r(parcel, i11);
            } else if (c11 != 4) {
                SafeParcelReader.w(parcel, i11);
            } else {
                iR2 = SafeParcelReader.r(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new WebImage(iR, uri, iR3, iR2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new WebImage[i11];
    }
}
