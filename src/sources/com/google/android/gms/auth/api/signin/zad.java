package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zad implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        ArrayList arrayListK = null;
        ArrayList arrayListK2 = null;
        Account account = null;
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        int iR = 0;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 1:
                    iR = SafeParcelReader.r(parcel, i11);
                    break;
                case 2:
                    arrayListK2 = SafeParcelReader.k(parcel, i11, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.f(parcel, i11, Account.CREATOR);
                    break;
                case 4:
                    zM = SafeParcelReader.m(parcel, i11);
                    break;
                case 5:
                    zM2 = SafeParcelReader.m(parcel, i11);
                    break;
                case 6:
                    zM3 = SafeParcelReader.m(parcel, i11);
                    break;
                case 7:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case '\b':
                    strG2 = SafeParcelReader.g(parcel, i11);
                    break;
                case '\t':
                    arrayListK = SafeParcelReader.k(parcel, i11, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case '\n':
                    strG3 = SafeParcelReader.g(parcel, i11);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new GoogleSignInOptions(iR, arrayListK2, account, zM, zM2, zM3, strG, strG2, GoogleSignInOptions.E1(arrayListK), strG3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new GoogleSignInOptions[i11];
    }
}
