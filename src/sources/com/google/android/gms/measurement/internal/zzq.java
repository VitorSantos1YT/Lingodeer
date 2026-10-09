package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzq implements zzjq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.zzcy f13653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f13654b;

    public zzq(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcy zzcyVar) {
        this.f13654b = appMeasurementDynamiteService;
        this.f13653a = zzcyVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjq
    public final void a(long j11, Bundle bundle, String str, String str2) {
        try {
            this.f13653a.N(j11, bundle, str, str2);
        } catch (RemoteException e8) {
            zzic zzicVar = this.f13654b.f12597a;
            if (zzicVar != null) {
                zzgu zzguVar = zzicVar.f13099f;
                zzic.m(zzguVar);
                zzguVar.f12945i.b(e8, "Event listener threw exception");
            }
        }
    }
}
