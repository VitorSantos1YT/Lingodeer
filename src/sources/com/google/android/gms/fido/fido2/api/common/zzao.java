package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzao implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        byte[] bArrC = null;
        Double dO = null;
        String strG = null;
        ArrayList arrayListK = null;
        Integer numS = null;
        TokenBinding tokenBinding = null;
        String strG2 = null;
        AuthenticationExtensions authenticationExtensions = null;
        Long lU = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 2:
                    bArrC = SafeParcelReader.c(parcel, i11);
                    break;
                case 3:
                    dO = SafeParcelReader.o(parcel, i11);
                    break;
                case 4:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case 5:
                    arrayListK = SafeParcelReader.k(parcel, i11, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 6:
                    numS = SafeParcelReader.s(parcel, i11);
                    break;
                case 7:
                    tokenBinding = (TokenBinding) SafeParcelReader.f(parcel, i11, TokenBinding.CREATOR);
                    break;
                case '\b':
                    strG2 = SafeParcelReader.g(parcel, i11);
                    break;
                case '\t':
                    authenticationExtensions = (AuthenticationExtensions) SafeParcelReader.f(parcel, i11, AuthenticationExtensions.CREATOR);
                    break;
                case '\n':
                    lU = SafeParcelReader.u(parcel, i11);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new PublicKeyCredentialRequestOptions(bArrC, dO, strG, arrayListK, numS, tokenBinding, strG2, authenticationExtensions, lU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new PublicKeyCredentialRequestOptions[i11];
    }
}
