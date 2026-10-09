package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzm implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcs f13378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f13381d;

    public zzm(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcs zzcsVar, String str, String str2) {
        this.f13378a = zzcsVar;
        this.f13379b = str;
        this.f13380c = str2;
        this.f13381d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVarP = this.f13381d.f12597a.p();
        zznlVarP.g();
        zznlVarP.h();
        zznlVarP.u(new zzmw(zznlVarP, this.f13379b, this.f13380c, zznlVarP.w(false), this.f13378a));
    }
}
