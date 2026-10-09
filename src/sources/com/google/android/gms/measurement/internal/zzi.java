package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcs f13089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f13090b;

    public zzi(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        this.f13089a = zzcsVar;
        this.f13090b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVarP = this.f13090b.f12597a.p();
        zznlVarP.g();
        zznlVarP.h();
        zznlVarP.u(new zzmj(zznlVarP, zznlVarP.w(false), this.f13089a));
    }
}
