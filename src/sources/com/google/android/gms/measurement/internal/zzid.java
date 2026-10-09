package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzid implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzjd f13120b;

    public zzid(zzjd zzjdVar, String str) {
        this.f13119a = str;
        this.f13120b = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzjd zzjdVar = this.f13120b;
        zzjdVar.f13199a.W();
        zzaw zzawVar = zzjdVar.f13199a.f13597c;
        zzpg.U(zzawVar);
        return zzawVar.d0(this.f13119a);
    }
}
