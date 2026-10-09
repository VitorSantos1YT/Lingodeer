package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzac implements Parcelable.Creator<zzz> {
    @Override // android.os.Parcelable.Creator
    public final zzz createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        String strG5 = null;
        String strG6 = null;
        String strG7 = null;
        boolean zM = false;
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
                    strG5 = SafeParcelReader.g(parcel, i11);
                    break;
                case 4:
                    strG4 = SafeParcelReader.g(parcel, i11);
                    break;
                case 5:
                    strG3 = SafeParcelReader.g(parcel, i11);
                    break;
                case 6:
                    strG6 = SafeParcelReader.g(parcel, i11);
                    break;
                case 7:
                    zM = SafeParcelReader.m(parcel, i11);
                    break;
                case '\b':
                    strG7 = SafeParcelReader.g(parcel, i11);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzz(strG, strG2, strG3, strG4, strG5, strG6, zM, strG7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzz[] newArray(int i11) {
        return new zzz[i11];
    }
}
