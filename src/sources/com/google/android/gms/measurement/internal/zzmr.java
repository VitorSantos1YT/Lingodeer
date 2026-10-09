package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmr implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f13431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zznl f13432b;

    public zzmr(zznl zznlVar, zzr zzrVar) {
        this.f13431a = zzrVar;
        this.f13432b = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.f13432b;
        zzgb zzgbVar = zznlVar.f13489d;
        zzic zzicVar = zznlVar.f13202a;
        if (zzgbVar == null) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            zzgbVar.p0(this.f13431a);
            zznlVar.t();
        } catch (RemoteException e8) {
            zzgu zzguVar2 = zzicVar.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12942f.b(e8, "Failed to send measurementEnabled to the service");
        }
    }
}
