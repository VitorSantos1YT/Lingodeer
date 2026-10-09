package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzit implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzjd f13165a;

    public zzit(zzjd zzjdVar, zzbh zzbhVar, String str) {
        this.f13165a = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzjd zzjdVar = this.f13165a;
        zzjdVar.f13199a.W();
        zzlp zzlpVar = zzjdVar.f13199a.f13602h;
        zzpg.U(zzlpVar);
        zzlpVar.g();
        throw new IllegalStateException("Unexpected call on client side");
    }
}
