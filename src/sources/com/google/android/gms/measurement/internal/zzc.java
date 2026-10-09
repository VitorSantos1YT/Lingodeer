package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f12723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzd f12724b;

    public zzc(zzd zzdVar, long j11) {
        this.f12723a = j11;
        Objects.requireNonNull(zzdVar);
        this.f12724b = zzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12724b.m(this.f12723a);
    }
}
