package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zbb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        ArrayList arrayListK = null;
        String strG = null;
        Account account = null;
        String strG2 = null;
        String strG3 = null;
        Bundle bundleB = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 1:
                    arrayListK = SafeParcelReader.k(parcel, i11, Scope.CREATOR);
                    break;
                case 2:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case 3:
                    zM = SafeParcelReader.m(parcel, i11);
                    break;
                case 4:
                    zM2 = SafeParcelReader.m(parcel, i11);
                    break;
                case 5:
                    account = (Account) SafeParcelReader.f(parcel, i11, Account.CREATOR);
                    break;
                case 6:
                    strG2 = SafeParcelReader.g(parcel, i11);
                    break;
                case 7:
                    strG3 = SafeParcelReader.g(parcel, i11);
                    break;
                case '\b':
                    zM3 = SafeParcelReader.m(parcel, i11);
                    break;
                case '\t':
                    bundleB = SafeParcelReader.b(parcel, i11);
                    break;
                case '\n':
                    zM4 = SafeParcelReader.m(parcel, i11);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new AuthorizationRequest(arrayListK, strG, zM, zM2, account, strG2, strG3, zM3, bundleB, zM4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new AuthorizationRequest[i11];
    }
}
