package com.google.android.gms.internal.measurement;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzqg implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzqi f11854a;

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        if (((Boolean) ((zzqh) this.f11854a.f11859c).get()).booleanValue()) {
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
    }
}
