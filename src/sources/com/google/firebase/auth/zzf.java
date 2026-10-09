package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzf implements Parcelable.Creator<EmailAuthCredential> {
    @Override // android.os.Parcelable.Creator
    public final EmailAuthCredential createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        boolean zM = false;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                strG = SafeParcelReader.g(parcel, i11);
            } else if (c11 == 2) {
                strG2 = SafeParcelReader.g(parcel, i11);
            } else if (c11 == 3) {
                strG3 = SafeParcelReader.g(parcel, i11);
            } else if (c11 == 4) {
                strG4 = SafeParcelReader.g(parcel, i11);
            } else if (c11 != 5) {
                SafeParcelReader.w(parcel, i11);
            } else {
                zM = SafeParcelReader.m(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new EmailAuthCredential(strG, strG2, strG3, strG4, zM);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ EmailAuthCredential[] newArray(int i11) {
        return new EmailAuthCredential[i11];
    }
}
