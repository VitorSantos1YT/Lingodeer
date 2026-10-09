package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzlw implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzlu f13367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzlu f13368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f13369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f13370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzmb f13371e;

    public zzlw(zzmb zzmbVar, zzlu zzluVar, zzlu zzluVar2, long j11, boolean z11) {
        this.f13367a = zzluVar;
        this.f13368b = zzluVar2;
        this.f13369c = j11;
        this.f13370d = z11;
        this.f13371e = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13371e.m(this.f13367a, this.f13368b, this.f13369c, this.f13370d, null);
    }
}
