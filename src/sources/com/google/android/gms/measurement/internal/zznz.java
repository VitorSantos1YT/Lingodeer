package com.google.android.gms.measurement.internal;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zznz extends zzaz {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzoa f13528e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zznz(zzoa zzoaVar, zzjg zzjgVar) {
        super(zzjgVar);
        this.f13528e = zzoaVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaz
    public final void a() {
        zzoa zzoaVar = this.f13528e;
        zzoc zzocVar = zzoaVar.f13534d;
        zzocVar.g();
        zzic zzicVar = zzocVar.f13202a;
        zzicVar.f13104k.getClass();
        zzoaVar.a(SystemClock.elapsedRealtime(), false, false);
        zzd zzdVar = zzicVar.f13106n;
        zzic.j(zzdVar);
        zzicVar.f13104k.getClass();
        zzdVar.j(SystemClock.elapsedRealtime());
    }
}
