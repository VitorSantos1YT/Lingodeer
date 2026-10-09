package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzak implements Parcelable.Creator<GithubAuthCredential> {
    @Override // android.os.Parcelable.Creator
    public final GithubAuthCredential createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strG = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            if (((char) i11) != 1) {
                SafeParcelReader.w(parcel, i11);
            } else {
                strG = SafeParcelReader.g(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new GithubAuthCredential(strG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GithubAuthCredential[] newArray(int i11) {
        return new GithubAuthCredential[i11];
    }
}
