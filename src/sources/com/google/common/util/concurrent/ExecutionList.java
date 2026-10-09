package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class ExecutionList {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LazyLogger f17629c = new LazyLogger(ExecutionList.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RunnableExecutorPair f17630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17631b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class RunnableExecutorPair {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f17632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f17633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public RunnableExecutorPair f17634c;

        public RunnableExecutorPair(Runnable runnable, Executor executor, RunnableExecutorPair runnableExecutorPair) {
            this.f17632a = runnable;
            this.f17633b = executor;
            this.f17634c = runnableExecutorPair;
        }
    }

    public static void a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e8) {
            f17629c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e8);
        }
    }
}
