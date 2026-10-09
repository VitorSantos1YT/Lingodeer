package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzlz implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzlu f13375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzmb f13377c;

    public zzlz(zzmb zzmbVar, zzlu zzluVar, long j11) {
        this.f13375a = zzluVar;
        this.f13376b = j11;
        Objects.requireNonNull(zzmbVar);
        this.f13377c = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j11 = this.f13376b;
        zzmb zzmbVar = this.f13377c;
        zzmbVar.p(this.f13375a, false, j11);
        zzmbVar.f13385e = null;
        zznl zznlVarP = zzmbVar.f13202a.p();
        zznlVarP.g();
        zznlVarP.h();
        zznlVarP.u(new zzmn(zznlVarP, null));
    }
}
