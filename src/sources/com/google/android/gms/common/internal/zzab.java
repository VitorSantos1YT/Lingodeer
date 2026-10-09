package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzab extends com.google.android.gms.internal.common.zza implements zzad {
    @Override // com.google.android.gms.common.internal.zzad
    public final boolean C(com.google.android.gms.common.zzt zztVar, ObjectWrapper objectWrapper) {
        Parcel parcelH = h();
        int i11 = com.google.android.gms.internal.common.zzc.f9622a;
        parcelH.writeInt(1);
        zztVar.writeToParcel(parcelH, 0);
        com.google.android.gms.internal.common.zzc.b(parcelH, objectWrapper);
        Parcel parcelG = g(parcelH, 5);
        boolean z11 = parcelG.readInt() != 0;
        parcelG.recycle();
        return z11;
    }

    @Override // com.google.android.gms.common.internal.zzad
    public final com.google.android.gms.common.zzr D0(com.google.android.gms.common.zzp zzpVar) {
        Parcel parcelH = h();
        int i11 = com.google.android.gms.internal.common.zzc.f9622a;
        parcelH.writeInt(1);
        zzpVar.writeToParcel(parcelH, 0);
        Parcel parcelG = g(parcelH, 6);
        com.google.android.gms.common.zzr zzrVar = (com.google.android.gms.common.zzr) com.google.android.gms.internal.common.zzc.a(parcelG, com.google.android.gms.common.zzr.CREATOR);
        parcelG.recycle();
        return zzrVar;
    }

    @Override // com.google.android.gms.common.internal.zzad
    public final boolean zzg() {
        Parcel parcelG = g(h(), 7);
        int i11 = com.google.android.gms.internal.common.zzc.f9622a;
        boolean z11 = parcelG.readInt() != 0;
        parcelG.recycle();
        return z11;
    }
}
