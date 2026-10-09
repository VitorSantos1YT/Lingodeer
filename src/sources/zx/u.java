package zx;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends qx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qx.o f59640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f59641c;

    public u(long j11, qx.o oVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f59641c = j11;
        this.f59640b = oVar;
    }

    @Override // qx.d
    public final void e(n20.b bVar) {
        t tVar = new t(bVar);
        bVar.c(tVar);
        rx.b bVarC = this.f59640b.c(tVar, this.f59641c, TimeUnit.MILLISECONDS);
        while (!tVar.compareAndSet(null, bVarC)) {
            if (tVar.get() != null) {
                if (tVar.get() == ux.b.DISPOSED) {
                    bVarC.dispose();
                    return;
                }
                return;
            }
        }
    }
}
