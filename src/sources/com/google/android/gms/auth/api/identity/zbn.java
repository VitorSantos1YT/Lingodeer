package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zbn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        ArrayList arrayListI = null;
        ArrayList arrayListK = null;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 1:
                    zM = SafeParcelReader.m(parcel, i11);
                    break;
                case 2:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case 3:
                    strG2 = SafeParcelReader.g(parcel, i11);
                    break;
                case 4:
                    zM2 = SafeParcelReader.m(parcel, i11);
                    break;
                case 5:
                    strG3 = SafeParcelReader.g(parcel, i11);
                    break;
                case 6:
                    arrayListI = SafeParcelReader.i(parcel, i11);
                    break;
                case 7:
                    zM3 = SafeParcelReader.m(parcel, i11);
                    break;
                case '\b':
                    arrayListK = SafeParcelReader.k(parcel, i11, Claim.CREATOR);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new BeginSignInRequest.GoogleIdTokenRequestOptions(zM, strG, strG2, zM2, strG3, arrayListI, zM3, arrayListK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new BeginSignInRequest.GoogleIdTokenRequestOptions[i11];
    }
}
