package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzl implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzp f13308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f13309b;

    public zzl(AppMeasurementDynamiteService appMeasurementDynamiteService, zzp zzpVar) {
        this.f13308a = zzpVar;
        this.f13309b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlj zzljVar = this.f13309b.f12597a.m;
        zzic.l(zzljVar);
        zzljVar.g();
        zzljVar.h();
        zzjp zzjpVar = zzljVar.f13325d;
        zzp zzpVar = this.f13308a;
        if (zzpVar != zzjpVar) {
            Preconditions.i("EventInterceptor already set.", zzjpVar == null);
        }
        zzljVar.f13325d = zzpVar;
    }
}
