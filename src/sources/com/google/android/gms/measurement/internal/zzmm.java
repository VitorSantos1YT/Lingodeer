package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmm extends zzaz {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zznl f13418e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmm(zznl zznlVar, zzic zzicVar) {
        super(zzicVar);
        this.f13418e = zznlVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaz
    public final void a() {
        zznl zznlVar = this.f13418e;
        zznlVar.g();
        if (zznlVar.x()) {
            zzgu zzguVar = zznlVar.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12949n.a("Inactivity, disconnecting from the service");
            zznlVar.o();
        }
    }
}
