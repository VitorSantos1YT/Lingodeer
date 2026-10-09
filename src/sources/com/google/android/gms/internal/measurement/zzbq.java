package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbq extends zzbl implements zzbs {
    @Override // com.google.android.gms.internal.measurement.zzbs
    public final Bundle Z(Bundle bundle) {
        Parcel parcelH = h();
        zzbn.b(parcelH, bundle);
        Parcel parcelG = g(parcelH, 1);
        Bundle bundle2 = (Bundle) zzbn.a(parcelG, Bundle.CREATOR);
        parcelG.recycle();
        return bundle2;
    }
}
