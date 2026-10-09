package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbd implements Parcelable.Creator<zzbc> {
    @Override // android.os.Parcelable.Creator
    public final zzbc createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        int iR = 1;
        zzba zzbaVar = null;
        IBinder iBinderQ = null;
        PendingIntent pendingIntent = null;
        IBinder iBinderQ2 = null;
        IBinder iBinderQ3 = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 1:
                    iR = SafeParcelReader.r(parcel, i11);
                    break;
                case 2:
                    zzbaVar = (zzba) SafeParcelReader.f(parcel, i11, zzba.CREATOR);
                    break;
                case 3:
                    iBinderQ = SafeParcelReader.q(parcel, i11);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) SafeParcelReader.f(parcel, i11, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinderQ2 = SafeParcelReader.q(parcel, i11);
                    break;
                case 6:
                    iBinderQ3 = SafeParcelReader.q(parcel, i11);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzbc(iR, zzbaVar, iBinderQ, pendingIntent, iBinderQ2, iBinderQ3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbc[] newArray(int i11) {
        return new zzbc[i11];
    }
}
