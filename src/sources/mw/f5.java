package mw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f5 extends j5 {
    @Override // mw.j5
    public final boolean m(g5 g5Var) {
        synchronized (g5Var) {
            try {
                if (g5Var.f42436c != 0) {
                    return false;
                }
                g5Var.f42436c = -1;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // mw.j5
    public final void o(g5 g5Var) {
        synchronized (g5Var) {
            g5Var.f42436c = 0;
        }
    }
}
