package com.adjust.sdk.scheduler;

import com.adjust.sdk.AdjustFactory;
import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class SingleThreadFutureScheduler implements FutureScheduler {
    private ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;

    public SingleThreadFutureScheduler(final String str, boolean z11) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryWrapper(str), new RejectedExecutionHandler() { // from class: com.adjust.sdk.scheduler.SingleThreadFutureScheduler.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                AdjustFactory.getLogger().warn("Runnable [%s] rejected from [%s] ", runnable.toString(), str);
            }
        });
        this.scheduledThreadPoolExecutor = scheduledThreadPoolExecutor;
        if (z11) {
            return;
        }
        scheduledThreadPoolExecutor.setKeepAliveTime(10L, TimeUnit.MILLISECONDS);
        this.scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // com.adjust.sdk.scheduler.FutureScheduler
    public ScheduledFuture<?> scheduleFuture(Runnable runnable, long j11) {
        return this.scheduledThreadPoolExecutor.schedule(new RunnableWrapper(runnable), j11, TimeUnit.MILLISECONDS);
    }

    @Override // com.adjust.sdk.scheduler.FutureScheduler
    public ScheduledFuture<?> scheduleFutureWithFixedDelay(Runnable runnable, long j11, long j12) {
        return this.scheduledThreadPoolExecutor.scheduleWithFixedDelay(new RunnableWrapper(runnable), j11, j12, TimeUnit.MILLISECONDS);
    }

    @Override // com.adjust.sdk.scheduler.FutureScheduler
    public <V> ScheduledFuture<V> scheduleFutureWithReturn(final Callable<V> callable, long j11) {
        return this.scheduledThreadPoolExecutor.schedule(new Callable<V>() { // from class: com.adjust.sdk.scheduler.SingleThreadFutureScheduler.2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                try {
                    return callable.call();
                } catch (Throwable th2) {
                    AdjustFactory.getLogger().error(SemtNwfPgIhi.FPnZGWXN, th2.getMessage(), th2.getClass().getCanonicalName());
                    return null;
                }
            }
        }, j11, TimeUnit.MILLISECONDS);
    }

    @Override // com.adjust.sdk.scheduler.FutureScheduler
    public void teardown() {
        this.scheduledThreadPoolExecutor.shutdownNow();
    }
}
