package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcs f13238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f13241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f13242e;

    public zzk(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcs zzcsVar, String str, String str2, boolean z11) {
        this.f13238a = zzcsVar;
        this.f13239b = str;
        this.f13240c = str2;
        this.f13241d = z11;
        this.f13242e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVarP = this.f13242e.f12597a.p();
        zznlVarP.g();
        zznlVarP.h();
        zznlVarP.u(new zzmc(zznlVarP, this.f13239b, this.f13240c, zznlVarP.w(false), this.f13241d, this.f13238a));
    }
}
