package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmq extends zzaz {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zznl f13430e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmq(zznl zznlVar, zzic zzicVar) {
        super(zzicVar);
        this.f13430e = zznlVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaz
    public final void a() {
        zzgu zzguVar = this.f13430e.f13202a.f13099f;
        zzic.m(zzguVar);
        zzguVar.f12945i.a("Tasks have been queued for a long time");
    }
}
