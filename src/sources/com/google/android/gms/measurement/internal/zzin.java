package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzin implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f13151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzjd f13152b;

    public zzin(zzjd zzjdVar, zzr zzrVar) {
        this.f13151a = zzrVar;
        this.f13152b = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjd zzjdVar = this.f13152b;
        zzjdVar.f13199a.W();
        zzpg zzpgVar = zzjdVar.f13199a;
        zzpgVar.e().g();
        zzpgVar.m0();
        zzr zzrVar = this.f13151a;
        Preconditions.d(zzrVar.f13655a);
        zzpgVar.d0(zzrVar);
    }
}
