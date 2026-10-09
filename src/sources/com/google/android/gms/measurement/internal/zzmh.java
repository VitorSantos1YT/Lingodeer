package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f13406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zznl f13407b;

    public zzmh(zznl zznlVar, zzr zzrVar) {
        this.f13406a = zzrVar;
        this.f13407b = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.f13407b;
        zzgb zzgbVar = zznlVar.f13489d;
        zzic zzicVar = zznlVar.f13202a;
        if (zzgbVar == null) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.a("Failed to reset data on the service: not connected to service");
        } else {
            try {
                zzgbVar.O(this.f13406a);
            } catch (RemoteException e8) {
                zzgu zzguVar2 = zzicVar.f13099f;
                zzic.m(zzguVar2);
                zzguVar2.f12942f.b(e8, "Failed to reset data on the service: remote exception");
            }
            zznlVar.t();
        }
    }
}
