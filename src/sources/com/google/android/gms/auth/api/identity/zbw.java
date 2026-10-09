package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zbw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        Uri uri = null;
        String strG5 = null;
        String strG6 = null;
        String strG7 = null;
        PublicKeyCredential publicKeyCredential = null;
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
                    uri = (Uri) SafeParcelReader.f(parcel, i11, Uri.CREATOR);
                    break;
                case 6:
                    strG5 = SafeParcelReader.g(parcel, i11);
                    break;
                case 7:
                    strG6 = SafeParcelReader.g(parcel, i11);
                    break;
                case '\b':
                    strG7 = SafeParcelReader.g(parcel, i11);
                    break;
                case '\t':
                    publicKeyCredential = (PublicKeyCredential) SafeParcelReader.f(parcel, i11, PublicKeyCredential.CREATOR);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new SignInCredential(strG, strG2, strG3, strG4, uri, strG5, strG6, strG7, publicKeyCredential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new SignInCredential[i11];
    }
}
