package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzn implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcs f13463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f13464b;

    public zzn(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        this.f13463a = zzcsVar;
        this.f13464b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.f13464b;
        zzpp zzppVar = appMeasurementDynamiteService.f12597a.f13102i;
        zzic.k(zzppVar);
        zzic zzicVar = appMeasurementDynamiteService.f12597a;
        zzppVar.Y(this.f13463a, zzicVar.f13117y != null && zzicVar.f13117y.booleanValue());
    }
}
