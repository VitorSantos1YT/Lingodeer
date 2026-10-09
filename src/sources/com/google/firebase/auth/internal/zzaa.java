package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaa implements Parcelable.Creator<zzx> {
    @Override // android.os.Parcelable.Creator
    public final zzx createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        zzad zzadVar = null;
        zzv zzvVar = null;
        com.google.firebase.auth.zzc zzcVar = null;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            char c11 = (char) i11;
            if (c11 == 1) {
                zzadVar = (zzad) SafeParcelReader.f(parcel, i11, zzad.CREATOR);
            } else if (c11 == 2) {
                zzvVar = (zzv) SafeParcelReader.f(parcel, i11, zzv.CREATOR);
            } else if (c11 != 3) {
                SafeParcelReader.w(parcel, i11);
            } else {
                zzcVar = (com.google.firebase.auth.zzc) SafeParcelReader.f(parcel, i11, com.google.firebase.auth.zzc.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iX);
        zzx zzxVar = new zzx();
        zzxVar.f18032a = zzadVar;
        zzxVar.f18033b = zzvVar;
        zzxVar.f18034c = zzcVar;
        return zzxVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzx[] newArray(int i11) {
        return new zzx[i11];
    }
}
