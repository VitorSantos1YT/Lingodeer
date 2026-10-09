package rz;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a1 extends z0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f50866a;

    public a1(Executor executor) {
        Method method;
        this.f50866a = executor;
        Method method2 = wz.a.f55500a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = wz.a.f55500a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // rz.j0
    public final void a(long j11, m mVar) {
        Executor executor = this.f50866a;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            aw.t tVar = new aw.t(this, mVar, false, 21);
            vy.i iVar = mVar.f50931e;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(tVar, j11, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e8) {
                e0.j(iVar, e0.a("The task was rejected", e8));
            }
        }
        if (scheduledFutureSchedule != null) {
            mVar.v(new j(scheduledFutureSchedule, 0));
        } else {
            f0.H.a(j11, mVar);
        }
    }

    @Override // rz.j0
    public final q0 b(long j11, Runnable runnable, vy.i iVar) {
        Executor executor = this.f50866a;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j11, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e8) {
                e0.j(iVar, e0.a("The task was rejected", e8));
            }
        }
        return scheduledFutureSchedule != null ? new p0(scheduledFutureSchedule) : f0.H.b(j11, runnable, iVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f50866a;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // rz.y
    public final void dispatch(vy.i iVar, Runnable runnable) {
        try {
            this.f50866a.execute(runnable);
        } catch (RejectedExecutionException e8) {
            e0.j(iVar, e0.a("The task was rejected", e8));
            yz.f fVar = o0.f50940a;
            yz.e.f58387a.dispatch(iVar, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a1) && ((a1) obj).f50866a == this.f50866a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f50866a);
    }

    @Override // rz.y
    public final String toString() {
        return this.f50866a.toString();
    }
}
