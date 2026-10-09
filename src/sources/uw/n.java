package uw;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n {
    static {
        Boolean.getBoolean("rx2.scheduler.use-nanotime");
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15L).longValue());
    }

    public abstract m a();

    public ww.b b(Runnable runnable) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        return c(runnable);
    }

    public ww.b c(Runnable runnable) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        m mVarA = a();
        l lVar = new l(runnable, mVarA);
        mVarA.a(lVar, timeUnit);
        return lVar;
    }
}
