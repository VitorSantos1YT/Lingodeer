package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzkl implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f13271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f13274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzlj f13275e;

    public zzkl(zzlj zzljVar, AtomicReference atomicReference, String str, String str2, boolean z11) {
        this.f13271a = atomicReference;
        this.f13272b = str;
        this.f13273c = str2;
        this.f13274d = z11;
        this.f13275e = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVarP = this.f13275e.f13202a.p();
        zznlVarP.g();
        zznlVarP.h();
        zznlVarP.u(new zzmx(zznlVarP, this.f13271a, this.f13272b, this.f13273c, zznlVarP.w(false), this.f13274d));
    }
}
