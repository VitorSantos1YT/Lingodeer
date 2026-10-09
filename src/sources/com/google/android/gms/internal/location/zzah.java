package com.google.android.gms.internal.location;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzah extends zzb implements zzai {
    public zzah() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean g(Parcel parcel, int i11) {
        if (i11 == 1) {
            b1((zzaa) zzc.a(parcel, zzaa.CREATOR));
            return true;
        }
        if (i11 != 2) {
            return false;
        }
        zzc();
        return true;
    }
}
