package mw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw.y f42696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public lw.n f42697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q3 f42698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f42699d = false;

    public t3(lw.y yVar, lw.n nVar, q3 q3Var) {
        this.f42696a = yVar;
        this.f42697b = nVar;
        this.f42698c = q3Var;
    }

    public static void a(t3 t3Var, lw.n nVar) {
        t3Var.f42697b = nVar;
        if (nVar == lw.n.READY || nVar == lw.n.TRANSIENT_FAILURE) {
            t3Var.f42699d = true;
        } else if (nVar == lw.n.IDLE) {
            t3Var.f42699d = false;
        }
    }
}
