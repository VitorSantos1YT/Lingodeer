package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmg implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f13402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzpl f13404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zznl f13405d;

    public zzmg(zznl zznlVar, zzr zzrVar, boolean z11, zzpl zzplVar) {
        this.f13402a = zzrVar;
        this.f13403b = z11;
        this.f13404c = zzplVar;
        this.f13405d = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zznl zznlVar = this.f13405d;
        zzgb zzgbVar = zznlVar.f13489d;
        if (zzgbVar != null) {
            zznlVar.y(zzgbVar, this.f13403b ? null : this.f13404c, this.f13402a);
            zznlVar.t();
        } else {
            zzgu zzguVar = zznlVar.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.a("Discarding data. Failed to set user property");
        }
    }
}
