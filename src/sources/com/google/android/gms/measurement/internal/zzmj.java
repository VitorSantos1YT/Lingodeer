package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f13411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcs f13412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zznl f13413c;

    public zzmj(zznl zznlVar, zzr zzrVar, com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        this.f13411a = zzrVar;
        this.f13412b = zzcsVar;
        this.f13413c = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpp zzppVar;
        com.google.android.gms.internal.measurement.zzcs zzcsVar = this.f13412b;
        zznl zznlVar = this.f13413c;
        String strY0 = null;
        try {
            try {
                zzic zzicVar = zznlVar.f13202a;
                zzhh zzhhVar = zzicVar.f13098e;
                zzgu zzguVar = zzicVar.f13099f;
                zzic.k(zzhhVar);
                if (zzhhVar.n().i(zzjk.ANALYTICS_STORAGE)) {
                    zzgb zzgbVar = zznlVar.f13489d;
                    if (zzgbVar != null) {
                        strY0 = zzgbVar.Y0(this.f13411a);
                        if (strY0 != null) {
                            zzlj zzljVar = zzicVar.m;
                            zzic.l(zzljVar);
                            zzljVar.f13328g.set(strY0);
                            zzic.k(zzhhVar);
                            zzhhVar.f13024g.b(strY0);
                        }
                        zznlVar.t();
                        zzppVar = zznlVar.f13202a.f13102i;
                        zzic.k(zzppVar);
                        zzppVar.U(strY0, zzcsVar);
                    }
                    zzic.m(zzguVar);
                    zzguVar.f12942f.a("Failed to get app instance id");
                } else {
                    zzic.m(zzguVar);
                    zzguVar.f12947k.a("Analytics storage consent denied; will not get app instance id");
                    zzlj zzljVar2 = zzicVar.m;
                    zzic.l(zzljVar2);
                    zzljVar2.f13328g.set(null);
                    zzic.k(zzhhVar);
                    zzhhVar.f13024g.b(null);
                }
                zzppVar = zzicVar.f13102i;
            } catch (RemoteException e8) {
                zzgu zzguVar2 = zznlVar.f13202a.f13099f;
                zzic.m(zzguVar2);
                zzguVar2.f12942f.b(e8, "Failed to get app instance id");
            }
            zzic.k(zzppVar);
            zzppVar.U(strY0, zzcsVar);
        } catch (Throwable th2) {
            zzpp zzppVar2 = zznlVar.f13202a.f13102i;
            zzic.k(zzppVar2);
            zzppVar2.U(null, zzcsVar);
            throw th2;
        }
    }
}
