package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzly implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f13373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzmb f13374b;

    public zzly(zzmb zzmbVar, long j11) {
        this.f13373a = j11;
        Objects.requireNonNull(zzmbVar);
        this.f13374b = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmb zzmbVar = this.f13374b;
        zzd zzdVar = zzmbVar.f13202a.f13106n;
        zzic.j(zzdVar);
        zzdVar.j(this.f13373a);
        zzmbVar.f13385e = null;
    }
}
