package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zaq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        int iR = 0;
        Parcel parcel2 = null;
        zan zanVar = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                iR = SafeParcelReader.r(parcel, i11);
            } else if (c11 == 2) {
                int iV = SafeParcelReader.v(parcel, i11);
                int iDataPosition = parcel.dataPosition();
                if (iV == 0) {
                    parcel2 = null;
                } else {
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.appendFrom(parcel, iDataPosition, iV);
                    parcel.setDataPosition(iDataPosition + iV);
                    parcel2 = parcelObtain;
                }
            } else if (c11 != 3) {
                SafeParcelReader.w(parcel, i11);
            } else {
                zanVar = (zan) SafeParcelReader.f(parcel, i11, zan.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new SafeParcelResponse(iR, parcel2, zanVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new SafeParcelResponse[i11];
    }
}
