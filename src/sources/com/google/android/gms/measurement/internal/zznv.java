package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zznv implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f13520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzoc f13521b;

    public zznv(zzoc zzocVar, long j11) {
        this.f13520a = j11;
        Objects.requireNonNull(zzocVar);
        this.f13521b = zzocVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzoc zzocVar = this.f13521b;
        zzocVar.g();
        zzocVar.k();
        zzic zzicVar = zzocVar.f13202a;
        zzgu zzguVar = zzicVar.f13099f;
        zzic.m(zzguVar);
        zzgs zzgsVar = zzguVar.f12949n;
        long j11 = this.f13520a;
        zzgsVar.b(Long.valueOf(j11), "Activity paused, time");
        zzny zznyVar = zzocVar.f13540g;
        zzoc zzocVar2 = zznyVar.f13527b;
        zzocVar2.f13202a.f13104k.getClass();
        zznx zznxVar = new zznx(zznyVar, System.currentTimeMillis(), j11);
        zznyVar.f13526a = zznxVar;
        zzocVar2.f13536c.postDelayed(zznxVar, 2000L);
        if (zzicVar.f13097d.v()) {
            zzocVar.f13539f.f13533c.c();
        }
    }
}
