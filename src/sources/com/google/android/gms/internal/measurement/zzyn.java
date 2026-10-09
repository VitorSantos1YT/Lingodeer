package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzyn extends zzyq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzyq f12184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzyq f12185d;

    public zzyn(zzyq zzyqVar, zzyq zzyqVar2) {
        this.f12184c = zzyqVar;
        this.f12185d = zzyqVar2;
    }

    @Override // com.google.android.gms.internal.measurement.zzyq
    public final void a() {
        zzyq zzyqVar = this.f12185d;
        try {
            this.f12184c.a();
        } finally {
            zzyqVar.a();
        }
    }
}
