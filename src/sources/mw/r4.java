package mw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r4 extends lw.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4 f42663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f42664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n2 f42665d;

    public r4(n2 n2Var, w4 w4Var) {
        this.f42665d = n2Var;
        this.f42663b = w4Var;
    }

    @Override // lw.j
    public final void l(long j11) {
        if (this.f42665d.Q.f42705f != null) {
            return;
        }
        synchronized (this.f42665d.K) {
            try {
                if (this.f42665d.Q.f42705f == null) {
                    w4 w4Var = this.f42663b;
                    if (!w4Var.f42778b) {
                        long j12 = this.f42664c + j11;
                        this.f42664c = j12;
                        n2 n2Var = this.f42665d;
                        long j13 = n2Var.V;
                        if (j12 <= j13) {
                            return;
                        }
                        if (j12 > n2Var.M) {
                            w4Var.f42779c = true;
                        } else {
                            long jAddAndGet = n2Var.L.f42418a.addAndGet(j12 - j13);
                            n2 n2Var2 = this.f42665d;
                            n2Var2.V = this.f42664c;
                            if (jAddAndGet > n2Var2.N) {
                                this.f42663b.f42779c = true;
                            }
                        }
                        w4 w4Var2 = this.f42663b;
                        k4 k4VarB = w4Var2.f42779c ? this.f42665d.b(w4Var2) : null;
                        if (k4VarB != null) {
                            k4VarB.run();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
