package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzik implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzjd f13142d;

    public zzik(zzjd zzjdVar, String str, String str2, String str3) {
        this.f13139a = str;
        this.f13140b = str2;
        this.f13141c = str3;
        this.f13142d = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzjd zzjdVar = this.f13142d;
        zzjdVar.f13199a.W();
        zzaw zzawVar = zzjdVar.f13199a.f13597c;
        zzpg.U(zzawVar);
        return zzawVar.e0(this.f13139a, this.f13140b, this.f13141c);
    }
}
