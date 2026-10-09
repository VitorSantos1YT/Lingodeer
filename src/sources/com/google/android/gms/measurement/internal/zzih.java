package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzih implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzah f13130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzr f13131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzjd f13132c;

    public zzih(zzjd zzjdVar, zzah zzahVar, zzr zzrVar) {
        this.f13130a = zzahVar;
        this.f13131b = zzrVar;
        this.f13132c = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpg zzpgVar = this.f13132c.f13199a;
        zzpgVar.W();
        zzah zzahVar = this.f13130a;
        Object objZza = zzahVar.f12622c.zza();
        zzr zzrVar = this.f13131b;
        if (objZza == null) {
            zzpgVar.b0(zzahVar, zzrVar);
        } else {
            zzpgVar.a0(zzahVar, zzrVar);
        }
    }
}
