package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class ab extends t {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ad f16224t;

    public ab(ad adVar) {
        this.f16224t = adVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        ae aeVar = this.f16224t.f16225a;
        aeVar.f16228b.b("unlinkToDeath", new Object[0]);
        aeVar.f16239n.asBinder().unlinkToDeath(aeVar.f16237k, 0);
        aeVar.f16239n = null;
        aeVar.f16233g = false;
    }
}
