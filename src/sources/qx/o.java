package qx;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f48480a = Boolean.getBoolean("rx3.scheduler.use-nanotime");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f48481b;

    static {
        long nanos;
        long jLongValue = Long.getLong("rx3.scheduler.drift-tolerance", 15L).longValue();
        String property = System.getProperty("rx3.scheduler.drift-tolerance-unit", "minutes");
        if ("seconds".equalsIgnoreCase(property)) {
            nanos = TimeUnit.SECONDS.toNanos(jLongValue);
        } else {
            nanos = "milliseconds".equalsIgnoreCase(property) ? TimeUnit.MILLISECONDS.toNanos(jLongValue) : TimeUnit.MINUTES.toNanos(jLongValue);
        }
        f48481b = nanos;
    }

    public abstract n a();

    public rx.b b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public rx.b c(Runnable runnable, long j11, TimeUnit timeUnit) {
        n nVarA = a();
        l lVar = new l(runnable, nVarA);
        nVarA.c(lVar, j11, timeUnit);
        return lVar;
    }

    public rx.b d(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        n nVarA = a();
        px.d dVar = new px.d(1, runnable, nVarA);
        rx.b bVarE = nVarA.e(dVar, j11, j12, timeUnit);
        return bVarE == ux.c.INSTANCE ? bVarE : dVar;
    }
}
