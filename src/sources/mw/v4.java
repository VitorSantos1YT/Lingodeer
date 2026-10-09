package mw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r5 f42750b;

    public /* synthetic */ v4(r5 r5Var, int i11) {
        this.f42749a = i11;
        this.f42750b = r5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42749a) {
            case 0:
                n2 n2Var = (n2) this.f42750b.f42668b;
                n2Var.f42574b0 = true;
                y yVar = n2Var.W;
                xq.c cVar = n2Var.U;
                yVar.f((lw.q1) cVar.f56174b, (x) cVar.f56175c, (lw.c1) cVar.f56176d);
                break;
            default:
                n2 n2Var2 = (n2) this.f42750b.f42668b;
                if (!n2Var2.f42574b0) {
                    n2Var2.W.h();
                }
                break;
        }
    }
}
