package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class x extends t {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ae f16271t;

    public x(ae aeVar) {
        this.f16271t = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        synchronized (this.f16271t.f16232f) {
            try {
                if (this.f16271t.f16238l.get() > 0 && this.f16271t.f16238l.decrementAndGet() > 0) {
                    this.f16271t.f16228b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                ae aeVar = this.f16271t;
                if (aeVar.f16239n != null) {
                    aeVar.f16228b.b("Unbind from service.", new Object[0]);
                    ae aeVar2 = this.f16271t;
                    aeVar2.f16227a.unbindService(aeVar2.m);
                    ae aeVar3 = this.f16271t;
                    aeVar3.f16233g = false;
                    aeVar3.f16239n = null;
                    aeVar3.m = null;
                }
                this.f16271t.e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
