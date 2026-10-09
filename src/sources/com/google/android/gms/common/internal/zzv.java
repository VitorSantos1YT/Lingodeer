package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzv extends com.google.android.gms.internal.common.zza implements zzx {
    @Override // com.google.android.gms.common.internal.zzx
    public final IObjectWrapper zzd() {
        Parcel parcelG = g(h(), 1);
        IObjectWrapper iObjectWrapperH = IObjectWrapper.Stub.h(parcelG.readStrongBinder());
        parcelG.recycle();
        return iObjectWrapperH;
    }

    @Override // com.google.android.gms.common.internal.zzx
    public final int zze() {
        Parcel parcelG = g(h(), 2);
        int i11 = parcelG.readInt();
        parcelG.recycle();
        return i11;
    }
}
