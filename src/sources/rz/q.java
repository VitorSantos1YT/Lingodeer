package rz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends i1 implements p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f50944e;

    public q(r rVar) {
        this.f50944e = rVar;
    }

    @Override // rz.p
    public final boolean a(Throwable th2) {
        return h().u(th2);
    }

    @Override // rz.i1
    public final boolean i() {
        return true;
    }

    @Override // rz.i1
    public final void j(Throwable th2) {
        ((q1) this.f50944e).q(h());
    }
}
