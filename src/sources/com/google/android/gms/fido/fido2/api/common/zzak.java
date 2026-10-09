package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzak implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
        byte[] bArrC = null;
        ArrayList arrayListK = null;
        Double dO = null;
        ArrayList arrayListK2 = null;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
        Integer numS = null;
        TokenBinding tokenBinding = null;
        String strG = null;
        AuthenticationExtensions authenticationExtensions = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 2:
                    publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) SafeParcelReader.f(parcel, i11, PublicKeyCredentialRpEntity.CREATOR);
                    break;
                case 3:
                    publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) SafeParcelReader.f(parcel, i11, PublicKeyCredentialUserEntity.CREATOR);
                    break;
                case 4:
                    bArrC = SafeParcelReader.c(parcel, i11);
                    break;
                case 5:
                    arrayListK = SafeParcelReader.k(parcel, i11, PublicKeyCredentialParameters.CREATOR);
                    break;
                case 6:
                    dO = SafeParcelReader.o(parcel, i11);
                    break;
                case 7:
                    arrayListK2 = SafeParcelReader.k(parcel, i11, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case '\b':
                    authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) SafeParcelReader.f(parcel, i11, AuthenticatorSelectionCriteria.CREATOR);
                    break;
                case '\t':
                    numS = SafeParcelReader.s(parcel, i11);
                    break;
                case '\n':
                    tokenBinding = (TokenBinding) SafeParcelReader.f(parcel, i11, TokenBinding.CREATOR);
                    break;
                case 11:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case '\f':
                    authenticationExtensions = (AuthenticationExtensions) SafeParcelReader.f(parcel, i11, AuthenticationExtensions.CREATOR);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArrC, arrayListK, dO, arrayListK2, authenticatorSelectionCriteria, numS, tokenBinding, strG, authenticationExtensions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new PublicKeyCredentialCreationOptions[i11];
    }
}
