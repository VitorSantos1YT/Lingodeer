package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        PendingIntent pendingIntent = null;
        Bundle bundleB = null;
        byte[] bArrC = null;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                iR2 = SafeParcelReader.r(parcel, i11);
            } else if (c11 == 2) {
                pendingIntent = (PendingIntent) SafeParcelReader.f(parcel, i11, PendingIntent.CREATOR);
            } else if (c11 == 3) {
                iR3 = SafeParcelReader.r(parcel, i11);
            } else if (c11 == 4) {
                bundleB = SafeParcelReader.b(parcel, i11);
            } else if (c11 == 5) {
                bArrC = SafeParcelReader.c(parcel, i11);
            } else if (c11 != 1000) {
                SafeParcelReader.w(parcel, i11);
            } else {
                iR = SafeParcelReader.r(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new ProxyResponse(iR, iR2, pendingIntent, iR3, bundleB, bArrC);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new ProxyResponse[i11];
    }
}
