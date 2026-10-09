package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbr implements Parcelable.Creator<zzbq> {
    @Override // android.os.Parcelable.Creator
    public final zzbq createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strG = BuildConfig.VERSION_NAME;
        ArrayList arrayListI = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                arrayListI = SafeParcelReader.i(parcel, i11);
            } else if (c11 == 2) {
                pendingIntent = (PendingIntent) SafeParcelReader.f(parcel, i11, PendingIntent.CREATOR);
            } else if (c11 != 3) {
                SafeParcelReader.w(parcel, i11);
            } else {
                strG = SafeParcelReader.g(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzbq(arrayListI, pendingIntent, strG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbq[] newArray(int i11) {
        return new zzbq[i11];
    }
}
