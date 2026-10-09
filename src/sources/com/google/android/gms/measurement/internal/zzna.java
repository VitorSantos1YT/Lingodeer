package com.google.android.gms.measurement.internal;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzna implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzgb f13465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zznf f13466b;

    public zzna(zznf zznfVar, zzgb zzgbVar) {
        this.f13465a = zzgbVar;
        this.f13466b = zznfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznf zznfVar = this.f13466b;
        synchronized (zznfVar) {
            try {
                zznfVar.f13472a = false;
                zznl zznlVar = zznfVar.f13474c;
                if (!zznlVar.x()) {
                    zzgu zzguVar = zznlVar.f13202a.f13099f;
                    zzic.m(zzguVar);
                    zzguVar.m.a("Connected to remote service");
                    zzgb zzgbVar = this.f13465a;
                    zznlVar.g();
                    zznlVar.f13489d = zzgbVar;
                    zznlVar.t();
                    zznlVar.v();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zznl zznlVar2 = this.f13466b.f13474c;
        ScheduledExecutorService scheduledExecutorService = zznlVar2.f13492g;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            zznlVar2.f13492g = null;
        }
    }
}
