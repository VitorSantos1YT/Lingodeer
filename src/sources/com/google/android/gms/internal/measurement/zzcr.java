package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcr extends zzbm implements zzcs {
    public zzcr() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean g(int i11, Parcel parcel, Parcel parcel2) {
        if (i11 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
        zzbn.d(parcel);
        ((zzcm) this).A0(bundle);
        parcel2.writeNoException();
        return true;
    }
}
