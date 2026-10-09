package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f13414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zznl f13415b;

    public zzmk(zznl zznlVar, zzr zzrVar) {
        this.f13414a = zzrVar;
        this.f13415b = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zznl zznlVar = this.f13415b;
        zzgb zzgbVar = zznlVar.f13489d;
        zzic zzicVar = zznlVar.f13202a;
        if (zzgbVar == null) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            zzr zzrVar = this.f13414a;
            zzal zzalVar = zzicVar.f13097d;
            zzfx zzfxVar = zzfy.W0;
            if (zzalVar.r(null, zzfxVar)) {
                zznlVar.y(zzgbVar, null, zzrVar);
            }
            zzgbVar.F0(zzrVar);
            zzicVar.o().l();
            zzicVar.f13097d.r(null, zzfxVar);
            zznlVar.y(zzgbVar, null, zzrVar);
            zznlVar.t();
        } catch (RemoteException e8) {
            zzgu zzguVar2 = zzicVar.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12942f.b(e8, "Failed to send app launch to the service");
        }
    }
}
