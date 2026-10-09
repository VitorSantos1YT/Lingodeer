package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzkv implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzjl f13295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzlj f13298d;

    public zzkv(zzlj zzljVar, zzjl zzjlVar, long j11, boolean z11) {
        this.f13295a = zzjlVar;
        this.f13296b = j11;
        this.f13297c = z11;
        this.f13298d = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlj zzljVar = this.f13298d;
        zzjl zzjlVar = this.f13295a;
        zzljVar.M(zzjlVar);
        zzljVar.C(zzjlVar, this.f13296b, this.f13297c);
    }
}
