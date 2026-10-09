package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.GoogleApiAvailabilityLight;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcs f13186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzbh f13187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f13189d;

    public zzj(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcs zzcsVar, zzbh zzbhVar, String str) {
        this.f13186a = zzcsVar;
        this.f13187b = zzbhVar;
        this.f13188c = str;
        this.f13189d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVarP = this.f13189d.f12597a.p();
        zznlVarP.g();
        zznlVarP.h();
        zzic zzicVar = zznlVarP.f13202a;
        zzpp zzppVar = zzicVar.f13102i;
        zzic.k(zzppVar);
        int iC = GoogleApiAvailabilityLight.f8646b.c(zzppVar.f13202a.f13094a, 12451000);
        com.google.android.gms.internal.measurement.zzcs zzcsVar = this.f13186a;
        if (iC == 0) {
            zznlVarP.u(new zzmp(zznlVarP, this.f13187b, this.f13188c, zzcsVar));
            return;
        }
        zzgu zzguVar = zzicVar.f13099f;
        zzic.m(zzguVar);
        zzguVar.f12945i.a("Not bundling data. Service unavailable or out of date");
        zzpp zzppVar2 = zzicVar.f13102i;
        zzic.k(zzppVar2);
        zzppVar2.X(zzcsVar, new byte[0]);
    }
}
