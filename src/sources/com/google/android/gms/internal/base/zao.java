package com.google.android.gms.internal.base;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zao extends Handler {
    public zao() {
        Looper.getMainLooper();
    }

    public zao(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
