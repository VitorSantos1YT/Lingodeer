package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zab implements Parcelable.Creator {
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
        ArrayList arrayListK = null;
        String strG7 = null;
        String strG8 = null;
        long jT = 0;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 2:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case 3:
                    strG2 = SafeParcelReader.g(parcel, i11);
                    break;
                case 4:
                    strG3 = SafeParcelReader.g(parcel, i11);
                    break;
                case 5:
                    strG4 = SafeParcelReader.g(parcel, i11);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.f(parcel, i11, Uri.CREATOR);
                    break;
                case 7:
                    strG5 = SafeParcelReader.g(parcel, i11);
                    break;
                case '\b':
                    jT = SafeParcelReader.t(parcel, i11);
                    break;
                case '\t':
                    strG6 = SafeParcelReader.g(parcel, i11);
                    break;
                case '\n':
                    arrayListK = SafeParcelReader.k(parcel, i11, Scope.CREATOR);
                    break;
                case 11:
                    strG7 = SafeParcelReader.g(parcel, i11);
                    break;
                case '\f':
                    strG8 = SafeParcelReader.g(parcel, i11);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new GoogleSignInAccount(strG, strG2, strG3, strG4, uri, strG5, jT, strG6, arrayListK, strG7, strG8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new GoogleSignInAccount[i11];
    }
}
