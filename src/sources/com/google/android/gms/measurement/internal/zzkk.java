package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzkk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f13267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzlj f13270d;

    public zzkk(zzlj zzljVar, AtomicReference atomicReference, String str, String str2) {
        this.f13267a = atomicReference;
        this.f13268b = str;
        this.f13269c = str2;
        this.f13270d = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVarP = this.f13270d.f13202a.p();
        zznlVarP.g();
        zznlVarP.h();
        zznlVarP.u(new zzmv(zznlVarP, this.f13267a, this.f13268b, this.f13269c, zznlVarP.w(false)));
    }
}
