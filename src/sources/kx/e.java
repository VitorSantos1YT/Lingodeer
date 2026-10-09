package kx;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends uw.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f38885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f38886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f38887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f38888e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f38889a;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        f38887d = iAvailableProcessors;
        d dVar = new d(new l("RxComputationShutdown"));
        f38888e = dVar;
        dVar.dispose();
        l lVar = new l("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f38886c = lVar;
        c cVar = new c(0, lVar);
        f38885b = cVar;
        for (d dVar2 : cVar.f38883b) {
            dVar2.dispose();
        }
    }

    public e() {
        c cVar = f38885b;
        AtomicReference atomicReference = new AtomicReference(cVar);
        this.f38889a = atomicReference;
        c cVar2 = new c(f38887d, f38886c);
        while (!atomicReference.compareAndSet(cVar, cVar2)) {
            if (atomicReference.get() != cVar) {
                d[] dVarArr = cVar2.f38883b;
                for (d dVar : dVarArr) {
                    dVar.dispose();
                }
                return;
            }
        }
    }

    @Override // uw.n
    public final uw.m a() {
        d dVar;
        c cVar = (c) this.f38889a.get();
        int i11 = cVar.f38882a;
        if (i11 == 0) {
            dVar = f38888e;
        } else {
            d[] dVarArr = cVar.f38883b;
            long j11 = cVar.f38884c;
            cVar.f38884c = 1 + j11;
            dVar = dVarArr[(int) (j11 % ((long) i11))];
        }
        return new b(dVar);
    }

    @Override // uw.n
    public final ww.b c(Runnable runnable) {
        d dVar;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        c cVar = (c) this.f38889a.get();
        int i11 = cVar.f38882a;
        if (i11 == 0) {
            dVar = f38888e;
        } else {
            d[] dVarArr = cVar.f38883b;
            long j11 = cVar.f38884c;
            cVar.f38884c = 1 + j11;
            dVar = dVarArr[(int) (j11 % ((long) i11))];
        }
        ScheduledExecutorService scheduledExecutorService = dVar.f38911a;
        m mVar = new m(runnable);
        try {
            mVar.a(scheduledExecutorService.submit(mVar));
            return mVar;
        } catch (RejectedExecutionException e8) {
            qx.b.B(e8);
            return zw.b.INSTANCE;
        }
    }
}
