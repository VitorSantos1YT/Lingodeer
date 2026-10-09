package com.adjust.sdk.scheduler;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface FutureScheduler {
    ScheduledFuture<?> scheduleFuture(Runnable runnable, long j11);

    ScheduledFuture<?> scheduleFutureWithFixedDelay(Runnable runnable, long j11, long j12);

    <V> ScheduledFuture<V> scheduleFutureWithReturn(Callable<V> callable, long j11);

    void teardown();
}
