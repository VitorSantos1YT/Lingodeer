package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbn implements Parcelable.Creator<LocationSettingsStates> {
    @Override // android.os.Parcelable.Creator
    public final LocationSettingsStates createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        boolean zM5 = false;
        boolean zM6 = false;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 1:
                    zM = SafeParcelReader.m(parcel, i11);
                    break;
                case 2:
                    zM2 = SafeParcelReader.m(parcel, i11);
                    break;
                case 3:
                    zM3 = SafeParcelReader.m(parcel, i11);
                    break;
                case 4:
                    zM4 = SafeParcelReader.m(parcel, i11);
                    break;
                case 5:
                    zM5 = SafeParcelReader.m(parcel, i11);
                    break;
                case 6:
                    zM6 = SafeParcelReader.m(parcel, i11);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new LocationSettingsStates(zM, zM2, zM3, zM4, zM5, zM6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsStates[] newArray(int i11) {
        return new LocationSettingsStates[i11];
    }
}
