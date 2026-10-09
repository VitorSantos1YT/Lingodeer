package mw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42617a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g2 f42618b;

    public p1(g2 g2Var, long j11) {
        this.f42618b = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42617a) {
            case 0:
                this.f42618b.getClass();
                break;
            default:
                ((nw.p) this.f42618b.f42425a.f378b).q(lw.q1.m.h("Keepalive failed. The connection is likely gone"));
                break;
        }
    }

    public p1(g2 g2Var, Throwable th2) {
        this.f42618b = g2Var;
    }
}
