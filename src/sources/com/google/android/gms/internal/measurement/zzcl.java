package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcl extends Handler {
    public zzcl() {
        Looper.getMainLooper();
    }

    public zzcl(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
