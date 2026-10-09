package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzt implements Parcelable.Creator<zzs> {
    @Override // android.os.Parcelable.Creator
    public final zzs createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        boolean zM = true;
        long jT = 50;
        float fP = 0.0f;
        long jT2 = Long.MAX_VALUE;
        int iR = Integer.MAX_VALUE;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                zM = SafeParcelReader.m(parcel, i11);
            } else if (c11 == 2) {
                jT = SafeParcelReader.t(parcel, i11);
            } else if (c11 == 3) {
                fP = SafeParcelReader.p(parcel, i11);
            } else if (c11 == 4) {
                jT2 = SafeParcelReader.t(parcel, i11);
            } else if (c11 != 5) {
                SafeParcelReader.w(parcel, i11);
            } else {
                iR = SafeParcelReader.r(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzs(fP, iR, jT, jT2, zM);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzs[] newArray(int i11) {
        return new zzs[i11];
    }
}
