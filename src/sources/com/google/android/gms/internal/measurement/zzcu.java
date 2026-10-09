package com.google.android.gms.internal.measurement;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcu extends zzbm implements zzcv {
    public zzcu() {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean g(int i11, Parcel parcel, Parcel parcel2) {
        if (i11 != 2) {
            return false;
        }
        ((zzds) this).zze();
        return true;
    }
}
