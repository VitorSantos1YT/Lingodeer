package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzay implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzjg f12665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzaz f12666b;

    public zzay(zzaz zzazVar, zzjg zzjgVar) {
        this.f12665a = zzjgVar;
        this.f12666b = zzazVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjg zzjgVar = this.f12665a;
        zzjgVar.a();
        if (zzae.a()) {
            zzjgVar.e().p(this);
            return;
        }
        zzaz zzazVar = this.f12666b;
        boolean z11 = zzazVar.f12670c != 0;
        zzazVar.f12670c = 0L;
        if (z11) {
            zzazVar.a();
        }
    }
}
