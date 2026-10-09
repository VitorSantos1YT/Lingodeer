package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzm implements Parcelable.Creator<zzl> {
    @Override // android.os.Parcelable.Creator
    public final zzl createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        zzj zzjVar = null;
        int iR = 1;
        IBinder iBinderQ = null;
        IBinder iBinderQ2 = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                iR = SafeParcelReader.r(parcel, i11);
            } else if (c11 == 2) {
                zzjVar = (zzj) SafeParcelReader.f(parcel, i11, zzj.CREATOR);
            } else if (c11 == 3) {
                iBinderQ = SafeParcelReader.q(parcel, i11);
            } else if (c11 != 4) {
                SafeParcelReader.w(parcel, i11);
            } else {
                iBinderQ2 = SafeParcelReader.q(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzl(iR, zzjVar, iBinderQ, iBinderQ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzl[] newArray(int i11) {
        return new zzl[i11];
    }
}
