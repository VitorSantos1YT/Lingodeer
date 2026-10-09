package com.google.android.gms.location;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzaz extends com.google.android.gms.internal.location.zzb implements zzba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f12566a = 0;

    public zzaz() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean g(Parcel parcel, int i11) {
        if (i11 == 1) {
            D((LocationResult) com.google.android.gms.internal.location.zzc.a(parcel, LocationResult.CREATOR));
            return true;
        }
        if (i11 != 2) {
            return false;
        }
        Y((LocationAvailability) com.google.android.gms.internal.location.zzc.a(parcel, LocationAvailability.CREATOR));
        return true;
    }
}
