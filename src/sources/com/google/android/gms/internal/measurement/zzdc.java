package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        Bundle bundleB = null;
        String strG = null;
        boolean zM = false;
        long jT = 0;
        long jT2 = 0;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                jT = SafeParcelReader.t(parcel, i11);
            } else if (c11 == 2) {
                jT2 = SafeParcelReader.t(parcel, i11);
            } else if (c11 == 3) {
                zM = SafeParcelReader.m(parcel, i11);
            } else if (c11 == 7) {
                bundleB = SafeParcelReader.b(parcel, i11);
            } else if (c11 != '\b') {
                SafeParcelReader.w(parcel, i11);
            } else {
                strG = SafeParcelReader.g(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzdb(jT, jT2, zM, bundleB, strG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzdb[i11];
    }
}
