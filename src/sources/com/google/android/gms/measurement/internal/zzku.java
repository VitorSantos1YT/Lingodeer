package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzku implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzjl f13291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzlj f13294d;

    public zzku(zzlj zzljVar, zzjl zzjlVar, long j11, boolean z11) {
        this.f13291a = zzjlVar;
        this.f13292b = j11;
        this.f13293c = z11;
        this.f13294d = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlj zzljVar = this.f13294d;
        zzjl zzjlVar = this.f13291a;
        zzljVar.M(zzjlVar);
        zzljVar.C(zzjlVar, this.f13292b, this.f13293c);
    }
}
