package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zbb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strG = BuildConfig.VERSION_NAME;
        GoogleSignInAccount googleSignInAccount = null;
        String strG2 = BuildConfig.VERSION_NAME;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 4) {
                strG = SafeParcelReader.g(parcel, i11);
            } else if (c11 == 7) {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.f(parcel, i11, GoogleSignInAccount.CREATOR);
            } else if (c11 != '\b') {
                SafeParcelReader.w(parcel, i11);
            } else {
                strG2 = SafeParcelReader.g(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new SignInAccount(strG, googleSignInAccount, strG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new SignInAccount[i11];
    }
}
