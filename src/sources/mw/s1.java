package mw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2 f42676b;

    public /* synthetic */ s1(a2 a2Var, int i11) {
        this.f42675a = i11;
        this.f42676b = a2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42675a) {
            case 0:
                a2 a2Var = this.f42676b;
                a2Var.f42323p = null;
                a2Var.f42317i.h(lw.e.INFO, "CONNECTING after backoff");
                a2.e(a2Var, lw.n.CONNECTING);
                a2.f(a2Var);
                break;
            case 1:
                if (this.f42676b.f42330w.f40425a == lw.n.IDLE) {
                    this.f42676b.f42317i.h(lw.e.INFO, "CONNECTING as requested");
                    a2.e(this.f42676b, lw.n.CONNECTING);
                    a2.f(this.f42676b);
                }
                break;
            default:
                a2 a2Var2 = this.f42676b;
                a2Var2.f42317i.h(lw.e.INFO, "Terminated");
                y2 y2Var = ((x2) a2Var2.f42312d.f42668b).f42794j;
                y2Var.A.remove(a2Var2);
                y2.g(y2Var);
                break;
        }
    }
}
