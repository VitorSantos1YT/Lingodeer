package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcw extends zzbl implements zzcy {
    public zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final void N(long j11, Bundle bundle, String str, String str2) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        zzbn.b(parcelH, bundle);
        parcelH.writeLong(j11);
        j(parcelH, 1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final int zzf() {
        Parcel parcelG = g(h(), 2);
        int i11 = parcelG.readInt();
        parcelG.recycle();
        return i11;
    }
}
