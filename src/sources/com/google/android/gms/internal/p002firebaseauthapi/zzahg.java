package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzahg implements Parcelable.Creator<zzahd> {
    @Override // android.os.Parcelable.Creator
    public final zzahd createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strG = null;
        String strG2 = null;
        Long lU = null;
        String strG3 = null;
        Long lU2 = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 2) {
                strG = SafeParcelReader.g(parcel, i11);
            } else if (c11 == 3) {
                strG2 = SafeParcelReader.g(parcel, i11);
            } else if (c11 == 4) {
                lU = SafeParcelReader.u(parcel, i11);
            } else if (c11 == 5) {
                strG3 = SafeParcelReader.g(parcel, i11);
            } else if (c11 != 6) {
                SafeParcelReader.w(parcel, i11);
            } else {
                lU2 = SafeParcelReader.u(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzahd(strG, strG2, lU, strG3, lU2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzahd[] newArray(int i11) {
        return new zzahd[i11];
    }
}
