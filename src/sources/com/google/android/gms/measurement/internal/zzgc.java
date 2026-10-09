package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgc extends com.google.android.gms.internal.measurement.zzbl implements zzge {
    @Override // com.google.android.gms.measurement.internal.zzge
    public final void Q0(List list) {
        Parcel parcelH = h();
        parcelH.writeTypedList(list);
        h1(parcelH);
    }
}
