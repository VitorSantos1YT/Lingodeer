package ay;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q0 extends qx.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qx.o f3375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f3377c;

    public q0(long j11, TimeUnit timeUnit, qx.o oVar) {
        this.f3376b = j11;
        this.f3377c = timeUnit;
        this.f3375a = oVar;
    }

    @Override // qx.h
    public final void j(qx.k kVar) {
        p0 p0Var = new p0(kVar);
        kVar.c(p0Var);
        rx.b bVarC = this.f3375a.c(p0Var, this.f3376b, this.f3377c);
        while (!p0Var.compareAndSet(null, bVarC)) {
            if (p0Var.get() != null) {
                if (p0Var.get() == ux.b.DISPOSED) {
                    bVarC.dispose();
                    return;
                }
                return;
            }
        }
    }
}
