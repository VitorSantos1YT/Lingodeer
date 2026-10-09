package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzoj extends zzaz {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzok f13548e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzoj(zzok zzokVar, zzjg zzjgVar) {
        super(zzjgVar);
        this.f13548e = zzokVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaz
    public final void a() {
        zzok zzokVar = this.f13548e;
        zzokVar.l();
        zzgu zzguVar = zzokVar.f13202a.f13099f;
        zzic.m(zzguVar);
        zzguVar.f12949n.a("Starting upload from DelayedRunnable");
        zzokVar.f13552b.q();
    }
}
