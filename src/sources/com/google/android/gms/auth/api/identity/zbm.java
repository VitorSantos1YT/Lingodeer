package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zbm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        ArrayList arrayListK = null;
        boolean zM = false;
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
                    iR = SafeParcelReader.r(parcel, i11);
                    break;
                case 7:
                    arrayListK = SafeParcelReader.k(parcel, i11, Claim.CREATOR);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new GetSignInIntentRequest(strG, strG2, strG3, strG4, zM, iR, arrayListK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new GetSignInIntentRequest[i11];
    }
}
