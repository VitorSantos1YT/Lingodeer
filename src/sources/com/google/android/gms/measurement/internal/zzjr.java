package com.google.android.gms.measurement.internal;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzjr implements zzgm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzic f13220a;

    public zzjr(zzic zzicVar, zzjs zzjsVar) {
        this.f13220a = zzicVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    public final boolean zza() {
        zzgu zzguVar = this.f13220a.f13099f;
        zzic.m(zzguVar);
        return Log.isLoggable(zzguVar.q(), 3);
    }
}
