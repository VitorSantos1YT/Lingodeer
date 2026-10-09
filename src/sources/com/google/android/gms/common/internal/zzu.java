package com.google.android.gms.common.internal;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzu extends com.google.android.gms.internal.common.zza implements ICancelToken {
    @Override // com.google.android.gms.common.internal.ICancelToken
    public final void cancel() {
        Parcel parcelH = h();
        try {
            this.f9607a.transact(2, parcelH, null, 1);
        } finally {
            parcelH.recycle();
        }
    }
}
