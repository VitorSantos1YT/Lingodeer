package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmp implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzbh f13426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcs f13428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zznl f13429d;

    public zzmp(zznl zznlVar, zzbh zzbhVar, String str, com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        this.f13426a = zzbhVar;
        this.f13427b = str;
        this.f13428c = zzcsVar;
        this.f13429d = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpp zzppVar;
        com.google.android.gms.internal.measurement.zzcs zzcsVar = this.f13428c;
        zznl zznlVar = this.f13429d;
        byte[] bArrD0 = null;
        try {
            try {
                zzgb zzgbVar = zznlVar.f13489d;
                if (zzgbVar == null) {
                    zzic zzicVar = zznlVar.f13202a;
                    zzgu zzguVar = zzicVar.f13099f;
                    zzic.m(zzguVar);
                    zzguVar.f12942f.a("Discarding data. Failed to send event to service to bundle");
                    zzppVar = zzicVar.f13102i;
                } else {
                    bArrD0 = zzgbVar.d0(this.f13426a, this.f13427b);
                    zznlVar.t();
                    zzppVar = zznlVar.f13202a.f13102i;
                }
            } catch (RemoteException e8) {
                zzgu zzguVar2 = zznlVar.f13202a.f13099f;
                zzic.m(zzguVar2);
                zzguVar2.f12942f.b(e8, "Failed to send event to the service to bundle");
            }
            zzic.k(zzppVar);
            zzppVar.X(zzcsVar, bArrD0);
        } catch (Throwable th2) {
            zzpp zzppVar2 = zznlVar.f13202a.f13102i;
            zzic.k(zzppVar2);
            zzppVar2.X(zzcsVar, null);
            throw th2;
        }
    }
}
