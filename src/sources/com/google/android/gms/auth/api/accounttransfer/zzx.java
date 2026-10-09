package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.HashSet;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        HashSet hashSet = new HashSet();
        int iR = 0;
        String strG = null;
        byte[] bArrC = null;
        PendingIntent pendingIntent = null;
        DeviceMetaData deviceMetaData = null;
        int iR2 = 0;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 1:
                    iR = SafeParcelReader.r(parcel, i11);
                    hashSet.add(1);
                    break;
                case 2:
                    strG = SafeParcelReader.g(parcel, i11);
                    hashSet.add(2);
                    break;
                case 3:
                    iR2 = SafeParcelReader.r(parcel, i11);
                    hashSet.add(3);
                    break;
                case 4:
                    bArrC = SafeParcelReader.c(parcel, i11);
                    hashSet.add(4);
                    break;
                case 5:
                    pendingIntent = (PendingIntent) SafeParcelReader.f(parcel, i11, PendingIntent.CREATOR);
                    hashSet.add(5);
                    break;
                case 6:
                    deviceMetaData = (DeviceMetaData) SafeParcelReader.f(parcel, i11, DeviceMetaData.CREATOR);
                    hashSet.add(6);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        if (parcel.dataPosition() == iX) {
            return new zzw(hashSet, iR, strG, iR2, bArrC, pendingIntent, deviceMetaData);
        }
        throw new SafeParcelReader.ParseException(p.j(iX, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzw[i11];
    }
}
