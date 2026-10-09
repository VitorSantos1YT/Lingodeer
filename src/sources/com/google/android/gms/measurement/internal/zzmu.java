package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmu implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f13439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzah f13441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zznl f13442d;

    public zzmu(zznl zznlVar, zzr zzrVar, boolean z11, zzah zzahVar) {
        this.f13439a = zzrVar;
        this.f13440b = z11;
        this.f13441c = zzahVar;
        Objects.requireNonNull(zznlVar);
        this.f13442d = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zznl zznlVar = this.f13442d;
        zzgb zzgbVar = zznlVar.f13489d;
        if (zzgbVar != null) {
            zznlVar.y(zzgbVar, this.f13440b ? null : this.f13441c, this.f13439a);
            zznlVar.t();
        } else {
            zzgu zzguVar = zznlVar.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.a("Discarding data. Failed to send conditional user property to service");
        }
    }
}
