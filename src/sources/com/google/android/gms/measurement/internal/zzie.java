package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzie implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f13121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzjd f13122b;

    public zzie(zzjd zzjdVar, zzr zzrVar) {
        this.f13121a = zzrVar;
        this.f13122b = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjd zzjdVar = this.f13122b;
        zzjdVar.f13199a.W();
        zzjdVar.f13199a.Z(this.f13121a);
    }
}
