package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmy implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzgb f13459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zznf f13460b;

    public zzmy(zznf zznfVar, zzgb zzgbVar) {
        this.f13459a = zzgbVar;
        this.f13460b = zznfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznf zznfVar = this.f13460b;
        synchronized (zznfVar) {
            try {
                zznfVar.f13472a = false;
                zznl zznlVar = zznfVar.f13474c;
                if (!zznlVar.x()) {
                    zzgu zzguVar = zznlVar.f13202a.f13099f;
                    zzic.m(zzguVar);
                    zzguVar.f12949n.a("Connected to service");
                    zzgb zzgbVar = this.f13459a;
                    zznlVar.g();
                    zznlVar.f13489d = zzgbVar;
                    zznlVar.t();
                    zznlVar.v();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
