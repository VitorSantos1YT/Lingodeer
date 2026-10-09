package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strG = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                SafeParcelReader.r(parcel, i11);
            } else if (c11 == 2) {
                strG = SafeParcelReader.g(parcel, i11);
            } else if (c11 != 3) {
                SafeParcelReader.w(parcel, i11);
            } else {
                pendingIntent = (PendingIntent) SafeParcelReader.f(parcel, i11, PendingIntent.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzbb(strG, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzbb[i11];
    }
}
