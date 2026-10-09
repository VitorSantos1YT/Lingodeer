package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public class ListenableFutureTask<V> extends FutureTask<V> implements ListenableFuture<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutionList f17663a;

    public ListenableFutureTask(com.google.common.cache.a aVar) {
        super(aVar);
        this.f17663a = new ExecutionList();
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void N(Runnable runnable, Executor executor) {
        ExecutionList executionList = this.f17663a;
        executionList.getClass();
        Preconditions.k(executor, "Executor was null.");
        synchronized (executionList) {
            try {
                if (executionList.f17631b) {
                    ExecutionList.a(runnable, executor);
                } else {
                    executionList.f17630a = new ExecutionList.RunnableExecutorPair(runnable, executor, executionList.f17630a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        ExecutionList executionList = this.f17663a;
        synchronized (executionList) {
            try {
                if (executionList.f17631b) {
                    return;
                }
                executionList.f17631b = true;
                ExecutionList.RunnableExecutorPair runnableExecutorPair = executionList.f17630a;
                ExecutionList.RunnableExecutorPair runnableExecutorPair2 = null;
                executionList.f17630a = null;
                while (runnableExecutorPair != null) {
                    ExecutionList.RunnableExecutorPair runnableExecutorPair3 = runnableExecutorPair.f17634c;
                    runnableExecutorPair.f17634c = runnableExecutorPair2;
                    runnableExecutorPair2 = runnableExecutorPair;
                    runnableExecutorPair = runnableExecutorPair3;
                }
                while (runnableExecutorPair2 != null) {
                    ExecutionList.a(runnableExecutorPair2.f17632a, runnableExecutorPair2.f17633b);
                    runnableExecutorPair2 = runnableExecutorPair2.f17634c;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get(long j11, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j11);
        return nanos <= 2147483647999999999L ? super.get(j11, timeUnit) : super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }
}
