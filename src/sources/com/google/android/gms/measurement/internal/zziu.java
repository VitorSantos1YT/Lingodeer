package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zziu implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzpl f13166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzr f13167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzjd f13168c;

    public zziu(zzjd zzjdVar, zzpl zzplVar, zzr zzrVar) {
        this.f13166a = zzplVar;
        this.f13167b = zzrVar;
        this.f13168c = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpg zzpgVar = this.f13168c.f13199a;
        zzpgVar.W();
        zzpl zzplVar = this.f13166a;
        Object objZza = zzplVar.zza();
        zzr zzrVar = this.f13167b;
        if (objZza == null) {
            zzpgVar.Y(zzplVar.f13634b, zzrVar);
        } else {
            zzpgVar.X(zzplVar, zzrVar);
        }
    }
}
