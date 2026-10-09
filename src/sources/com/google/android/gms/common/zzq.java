package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        boolean zM5 = false;
        String strG = null;
        IBinder iBinderQ = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 1:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case 2:
                    zM = SafeParcelReader.m(parcel, i11);
                    break;
                case 3:
                    zM2 = SafeParcelReader.m(parcel, i11);
                    break;
                case 4:
                    iBinderQ = SafeParcelReader.q(parcel, i11);
                    break;
                case 5:
                    zM3 = SafeParcelReader.m(parcel, i11);
                    break;
                case 6:
                    zM4 = SafeParcelReader.m(parcel, i11);
                    break;
                case 7:
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
                case '\b':
                    zM5 = SafeParcelReader.m(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzp(strG, zM, zM2, iBinderQ, zM3, zM4, zM5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzp[i11];
    }
}
