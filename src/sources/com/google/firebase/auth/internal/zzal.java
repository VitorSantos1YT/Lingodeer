package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzal implements Parcelable.Creator<zzaj> {
    @Override // android.os.Parcelable.Creator
    public final zzaj createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        ArrayList arrayListK = null;
        zzao zzaoVar = null;
        String strG = null;
        com.google.firebase.auth.zzc zzcVar = null;
        zzad zzadVar = null;
        ArrayList arrayListK2 = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 1:
                    arrayListK = SafeParcelReader.k(parcel, i11, PhoneMultiFactorInfo.CREATOR);
                    break;
                case 2:
                    zzaoVar = (zzao) SafeParcelReader.f(parcel, i11, zzao.CREATOR);
                    break;
                case 3:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case 4:
                    zzcVar = (com.google.firebase.auth.zzc) SafeParcelReader.f(parcel, i11, com.google.firebase.auth.zzc.CREATOR);
                    break;
                case 5:
                    zzadVar = (zzad) SafeParcelReader.f(parcel, i11, zzad.CREATOR);
                    break;
                case 6:
                    arrayListK2 = SafeParcelReader.k(parcel, i11, TotpMultiFactorInfo.CREATOR);
                    break;
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new zzaj(arrayListK, zzaoVar, strG, zzcVar, zzadVar, arrayListK2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaj[] newArray(int i11) {
        return new zzaj[i11];
    }
}
