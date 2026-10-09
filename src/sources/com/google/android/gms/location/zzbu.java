package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbu implements Parcelable.Creator<SleepClassifyEvent> {
    @Override // android.os.Parcelable.Creator
    public final SleepClassifyEvent createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        int iR4 = 0;
        int iR5 = 0;
        int iR6 = 0;
        int iR7 = 0;
        boolean zM = false;
        int iR8 = 0;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 1:
                    iR = SafeParcelReader.r(parcel, i11);
                    break;
                case 2:
                    iR2 = SafeParcelReader.r(parcel, i11);
                    break;
                case 3:
                    iR3 = SafeParcelReader.r(parcel, i11);
                    break;
                case 4:
                    iR4 = SafeParcelReader.r(parcel, i11);
                    break;
                case 5:
                    iR5 = SafeParcelReader.r(parcel, i11);
                    break;
                case 6:
                    iR6 = SafeParcelReader.r(parcel, i11);
                    break;
                case 7:
                    iR7 = SafeParcelReader.r(parcel, i11);
                    break;
                case '\b':
                    zM = SafeParcelReader.m(parcel, i11);
                    break;
                case '\t':
                    iR8 = SafeParcelReader.r(parcel, i11);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new SleepClassifyEvent(iR, iR2, iR3, iR4, iR5, iR6, iR7, zM, iR8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SleepClassifyEvent[] newArray(int i11) {
        return new SleepClassifyEvent[i11];
    }
}
