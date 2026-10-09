package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzd implements Parcelable.Creator<PhoneAuthProvider.ForceResendingToken> {
    @Override // android.os.Parcelable.Creator
    public final PhoneAuthProvider.ForceResendingToken createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        while (parcel.dataPosition() < iX) {
            SafeParcelReader.w(parcel, parcel.readInt());
        }
        SafeParcelReader.l(parcel, iX);
        return new PhoneAuthProvider.ForceResendingToken();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PhoneAuthProvider.ForceResendingToken[] newArray(int i11) {
        return new PhoneAuthProvider.ForceResendingToken[i11];
    }
}
