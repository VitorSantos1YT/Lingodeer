package com.google.android.gms.common.images;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zaa implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            new CountDownLatch(1);
            throw null;
        }
        String strValueOf = String.valueOf(Thread.currentThread());
        String strValueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        new StringBuilder(strValueOf2.length() + strValueOf.length() + 55 + 1);
        throw new IllegalStateException("LoadBitmapFromDiskRunnable can't be executed in the main thread");
    }
}
