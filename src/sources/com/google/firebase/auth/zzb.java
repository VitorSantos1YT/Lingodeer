package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzb implements Parcelable.Creator<ActionCodeSettings> {
    @Override // android.os.Parcelable.Creator
    public final ActionCodeSettings createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        String strG5 = null;
        String strG6 = null;
        String strG7 = null;
        String strG8 = null;
        boolean zM = false;
        boolean zM2 = false;
        int iR = 0;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 1:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case 2:
                    strG2 = SafeParcelReader.g(parcel, i11);
                    break;
                case 3:
                    strG3 = SafeParcelReader.g(parcel, i11);
                    break;
                case 4:
                    strG4 = SafeParcelReader.g(parcel, i11);
                    break;
                case 5:
                    zM = SafeParcelReader.m(parcel, i11);
                    break;
                case 6:
                    strG5 = SafeParcelReader.g(parcel, i11);
                    break;
                case 7:
                    zM2 = SafeParcelReader.m(parcel, i11);
                    break;
                case '\b':
                    strG6 = SafeParcelReader.g(parcel, i11);
                    break;
                case '\t':
                    iR = SafeParcelReader.r(parcel, i11);
                    break;
                case '\n':
                    strG7 = SafeParcelReader.g(parcel, i11);
                    break;
                case 11:
                    strG8 = SafeParcelReader.g(parcel, i11);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new ActionCodeSettings(strG, strG2, strG3, strG4, zM, strG5, zM2, strG6, iR, strG7, strG8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ActionCodeSettings[] newArray(int i11) {
        return new ActionCodeSettings[i11];
    }
}
