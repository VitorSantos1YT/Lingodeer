package com.google.android.gms.internal.location;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzaj extends zzb implements zzak {
    public zzaj() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean g(Parcel parcel, int i11) {
        if (i11 == 1) {
            int i12 = parcel.readInt();
            parcel.createStringArray();
            f(i12);
            return true;
        }
        if (i11 == 2) {
            int i13 = parcel.readInt();
            parcel.createStringArray();
            p(i13);
            return true;
        }
        if (i11 != 3) {
            return false;
        }
        int i14 = parcel.readInt();
        zzd(i14);
        return true;
    }
}
