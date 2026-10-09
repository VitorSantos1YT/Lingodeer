package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zziq implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f13157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzjd f13158b;

    public zziq(zzjd zzjdVar, zzr zzrVar) {
        this.f13157a = zzrVar;
        this.f13158b = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        zzjd zzjdVar = this.f13158b;
        zzjdVar.f13199a.W();
        return new zzao(zzjdVar.f13199a.q0(this.f13157a.f13655a));
    }
}
