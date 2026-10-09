package qx;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n implements rx.b {
    public final long a(TimeUnit timeUnit) {
        return !o.f48480a ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public abstract rx.b c(Runnable runnable, long j11, TimeUnit timeUnit);

    public void d(Runnable runnable) {
        c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public final rx.b e(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        ux.d dVar = new ux.d();
        ux.d dVar2 = new ux.d();
        dVar2.lazySet(dVar);
        long nanos = timeUnit.toNanos(j12);
        long jA = a(TimeUnit.NANOSECONDS);
        rx.b bVarC = c(new m(this, timeUnit.toNanos(j11) + jA, runnable, jA, dVar2, nanos), j11, timeUnit);
        if (bVarC == ux.c.INSTANCE) {
            return bVarC;
        }
        ux.b.c(dVar, bVarC);
        return dVar2;
    }
}
