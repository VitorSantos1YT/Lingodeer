package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zznb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zznf f13467a;

    public zznb(zznf zznfVar) {
        this.f13467a = zznfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.f13467a.f13474c;
        zznlVar.r(new ComponentName(zznlVar.f13202a.f13094a, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
