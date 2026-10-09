package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmt implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f13435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbh f13437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zznl f13438d;

    public zzmt(zznl zznlVar, zzr zzrVar, boolean z11, zzbh zzbhVar) {
        this.f13435a = zzrVar;
        this.f13436b = z11;
        this.f13437c = zzbhVar;
        this.f13438d = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zznl zznlVar = this.f13438d;
        zzgb zzgbVar = zznlVar.f13489d;
        if (zzgbVar != null) {
            zznlVar.y(zzgbVar, this.f13436b ? null : this.f13437c, this.f13435a);
            zznlVar.t();
        } else {
            zzgu zzguVar = zznlVar.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.a("Discarding data. Failed to send event to service");
        }
    }
}
