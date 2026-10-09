package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaw implements Parcelable.Creator<UserProfileChangeRequest> {
    @Override // android.os.Parcelable.Creator
    public final UserProfileChangeRequest createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strG = null;
        boolean zM = false;
        boolean zM2 = false;
        String strG2 = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 2) {
                strG = SafeParcelReader.g(parcel, i11);
            } else if (c11 == 3) {
                strG2 = SafeParcelReader.g(parcel, i11);
            } else if (c11 == 4) {
                zM = SafeParcelReader.m(parcel, i11);
            } else if (c11 != 5) {
                SafeParcelReader.w(parcel, i11);
            } else {
                zM2 = SafeParcelReader.m(parcel, i11);
            }
        }
        SafeParcelReader.l(parcel, iX);
        UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest();
        userProfileChangeRequest.f17922a = strG;
        userProfileChangeRequest.f17923b = strG2;
        userProfileChangeRequest.f17924c = zM;
        userProfileChangeRequest.f17925d = zM2;
        if (TextUtils.isEmpty(strG2)) {
            return userProfileChangeRequest;
        }
        Uri.parse(strG2);
        return userProfileChangeRequest;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ UserProfileChangeRequest[] newArray(int i11) {
        return new UserProfileChangeRequest[i11];
    }
}
