package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        UvmEntries uvmEntries = null;
        zzf zzfVar = null;
        AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = null;
        zzh zzhVar = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                uvmEntries = (UvmEntries) SafeParcelReader.f(parcel, i11, UvmEntries.CREATOR);
            } else if (c11 == 2) {
                zzfVar = (zzf) SafeParcelReader.f(parcel, i11, zzf.CREATOR);
            } else if (c11 == 3) {
                authenticationExtensionsCredPropsOutputs = (AuthenticationExtensionsCredPropsOutputs) SafeParcelReader.f(parcel, i11, AuthenticationExtensionsCredPropsOutputs.CREATOR);
            } else if (c11 != 4) {
                SafeParcelReader.w(parcel, i11);
            } else {
                zzhVar = (zzh) SafeParcelReader.f(parcel, i11, zzh.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new AuthenticationExtensionsClientOutputs(uvmEntries, zzfVar, authenticationExtensionsCredPropsOutputs, zzhVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new AuthenticationExtensionsClientOutputs[i11];
    }
}
