package com.google.android.gms.auth.account;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzc extends com.google.android.gms.internal.auth.zza implements zze {
    @Override // com.google.android.gms.auth.account.zze
    public final void V(zzb zzbVar) {
        Parcel parcelG = g();
        com.google.android.gms.internal.auth.zzc.c(parcelG, zzbVar);
        parcelG.writeInt(0);
        h(parcelG, 3);
    }

    @Override // com.google.android.gms.auth.account.zze
    public final void l0(zzb zzbVar) {
        Parcel parcelG = g();
        com.google.android.gms.internal.auth.zzc.c(parcelG, zzbVar);
        parcelG.writeString(null);
        h(parcelG, 2);
    }

    @Override // com.google.android.gms.auth.account.zze
    public final void zzf() {
        Parcel parcelG = g();
        int i11 = com.google.android.gms.internal.auth.zzc.f9456a;
        parcelG.writeInt(0);
        h(parcelG, 1);
    }
}
