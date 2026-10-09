package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzil implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzjd f13146d;

    public zzil(zzjd zzjdVar, String str, String str2, String str3) {
        this.f13143a = str;
        this.f13144b = str2;
        this.f13145c = str3;
        this.f13146d = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzjd zzjdVar = this.f13146d;
        zzjdVar.f13199a.W();
        zzaw zzawVar = zzjdVar.f13199a.f13597c;
        zzpg.U(zzawVar);
        return zzawVar.i0(this.f13143a, this.f13144b, this.f13145c);
    }
}
