package com.google.android.gms.internal.location;

import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsResult;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzan extends zzb implements zzao {
    public zzan() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean g(Parcel parcel, int i11) {
        if (i11 != 1) {
            return false;
        }
        zzay zzayVar = (zzay) this;
        zzayVar.f11076a.a((LocationSettingsResult) zzc.a(parcel, LocationSettingsResult.CREATOR));
        zzayVar.f11076a = null;
        return true;
    }
}
