package com.google.android.gms.common.util.concurrent;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zza implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f9138a;

    public zza(Runnable runnable) {
        this.f9138a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f9138a.run();
    }
}
