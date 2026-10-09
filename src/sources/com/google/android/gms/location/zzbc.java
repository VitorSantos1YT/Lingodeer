package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbc extends com.google.android.gms.internal.location.zzb implements zzbd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f12567a = 0;

    public zzbc() {
        super("com.google.android.gms.location.ILocationListener");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean g(Parcel parcel, int i11) {
        if (i11 != 1) {
            return false;
        }
        v((Location) com.google.android.gms.internal.location.zzc.a(parcel, Location.CREATOR));
        return true;
    }
}
