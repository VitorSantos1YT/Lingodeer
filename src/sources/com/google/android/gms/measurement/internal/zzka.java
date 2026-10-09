package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzka implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f13243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzlj f13244b;

    public zzka(zzlj zzljVar, long j11) {
        this.f13243a = j11;
        Objects.requireNonNull(zzljVar);
        this.f13244b = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzic zzicVar = this.f13244b.f13202a;
        zzhh zzhhVar = zzicVar.f13098e;
        zzic.k(zzhhVar);
        zzhe zzheVar = zzhhVar.f13028k;
        long j11 = this.f13243a;
        zzheVar.b(j11);
        zzgu zzguVar = zzicVar.f13099f;
        zzic.m(zzguVar);
        zzguVar.m.b(Long.valueOf(j11), "Session timeout duration set");
    }
}
