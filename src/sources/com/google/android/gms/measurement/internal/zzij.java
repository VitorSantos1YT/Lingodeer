package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzij implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzjd f13138d;

    public zzij(zzjd zzjdVar, String str, String str2, String str3) {
        this.f13135a = str;
        this.f13136b = str2;
        this.f13137c = str3;
        this.f13138d = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzjd zzjdVar = this.f13138d;
        zzjdVar.f13199a.W();
        zzaw zzawVar = zzjdVar.f13199a.f13597c;
        zzpg.U(zzawVar);
        return zzawVar.e0(this.f13135a, this.f13136b, this.f13137c);
    }
}
