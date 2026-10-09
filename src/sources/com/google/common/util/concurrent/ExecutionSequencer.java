package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class ExecutionSequencer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f17635a = new AtomicReference(ImmediateFuture.f17653b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ThreadConfinedTaskQueue f17636b = new ThreadConfinedTaskQueue(0);

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ExecutionSequencer$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 implements AsyncCallable<Object> {
        @Override // com.google.common.util.concurrent.AsyncCallable
        public final ListenableFuture call() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class RunningState {
        private static final /* synthetic */ RunningState[] $VALUES;
        public static final RunningState CANCELLED;
        public static final RunningState NOT_RUN;
        public static final RunningState STARTED;

        static {
            RunningState runningState = new RunningState("NOT_RUN", 0);
            NOT_RUN = runningState;
            RunningState runningState2 = new RunningState("CANCELLED", 1);
            CANCELLED = runningState2;
            RunningState runningState3 = new RunningState("STARTED", 2);
            STARTED = runningState3;
            $VALUES = new RunningState[]{runningState, runningState2, runningState3};
        }

        public static RunningState valueOf(String str) {
            return (RunningState) Enum.valueOf(RunningState.class, str);
        }

        public static RunningState[] values() {
            return (RunningState[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class TaskNonReentrantExecutor extends AtomicReference<RunningState> implements Executor, Runnable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int f17639e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ExecutionSequencer f17640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Executor f17641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Runnable f17642c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Thread f17643d;

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            if (get() == RunningState.CANCELLED) {
                this.f17641b = null;
                this.f17640a = null;
                return;
            }
            this.f17643d = Thread.currentThread();
            try {
                ExecutionSequencer executionSequencer = this.f17640a;
                Objects.requireNonNull(executionSequencer);
                ThreadConfinedTaskQueue threadConfinedTaskQueue = executionSequencer.f17636b;
                if (threadConfinedTaskQueue.f17644a == this.f17643d) {
                    this.f17640a = null;
                    Preconditions.r(threadConfinedTaskQueue.f17645b == null);
                    threadConfinedTaskQueue.f17645b = runnable;
                    Executor executor = this.f17641b;
                    Objects.requireNonNull(executor);
                    threadConfinedTaskQueue.f17646c = executor;
                    this.f17641b = null;
                } else {
                    Executor executor2 = this.f17641b;
                    Objects.requireNonNull(executor2);
                    this.f17641b = null;
                    this.f17642c = runnable;
                    executor2.execute(this);
                }
            } finally {
                this.f17643d = null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Executor executor;
            Thread threadCurrentThread = Thread.currentThread();
            if (threadCurrentThread != this.f17643d) {
                Runnable runnable = this.f17642c;
                Objects.requireNonNull(runnable);
                this.f17642c = null;
                runnable.run();
                return;
            }
            ThreadConfinedTaskQueue threadConfinedTaskQueue = new ThreadConfinedTaskQueue(0);
            threadConfinedTaskQueue.f17644a = threadCurrentThread;
            ExecutionSequencer executionSequencer = this.f17640a;
            Objects.requireNonNull(executionSequencer);
            executionSequencer.f17636b = threadConfinedTaskQueue;
            this.f17640a = null;
            try {
                Runnable runnable2 = this.f17642c;
                Objects.requireNonNull(runnable2);
                this.f17642c = null;
                runnable2.run();
                while (true) {
                    Runnable runnable3 = threadConfinedTaskQueue.f17645b;
                    if (runnable3 == null || (executor = threadConfinedTaskQueue.f17646c) == null) {
                        break;
                    }
                    threadConfinedTaskQueue.f17645b = null;
                    threadConfinedTaskQueue.f17646c = null;
                    executor.execute(runnable3);
                }
                threadConfinedTaskQueue.f17644a = null;
            } catch (Throwable th2) {
                threadConfinedTaskQueue.f17644a = null;
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ThreadConfinedTaskQueue {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Thread f17644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Runnable f17645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Executor f17646c;

        private ThreadConfinedTaskQueue() {
        }

        public /* synthetic */ ThreadConfinedTaskQueue(int i11) {
            this();
        }
    }

    private ExecutionSequencer() {
    }

    public static ExecutionSequencer a() {
        return new ExecutionSequencer();
    }

    public final ListenableFuture b(final AsyncCallable asyncCallable, Executor executor) {
        executor.getClass();
        final TaskNonReentrantExecutor taskNonReentrantExecutor = new TaskNonReentrantExecutor(RunningState.NOT_RUN);
        taskNonReentrantExecutor.f17641b = executor;
        taskNonReentrantExecutor.f17640a = this;
        AsyncCallable<Object> asyncCallable2 = new AsyncCallable<Object>() { // from class: com.google.common.util.concurrent.ExecutionSequencer.2
            @Override // com.google.common.util.concurrent.AsyncCallable
            public final ListenableFuture call() {
                int i11 = TaskNonReentrantExecutor.f17639e;
                return !taskNonReentrantExecutor.compareAndSet(RunningState.NOT_RUN, RunningState.STARTED) ? Futures.e() : asyncCallable.call();
            }

            public final String toString() {
                return asyncCallable.toString();
            }
        };
        final SettableFuture settableFutureQ = SettableFuture.q();
        final ListenableFuture listenableFuture = (ListenableFuture) this.f17635a.getAndSet(settableFutureQ);
        final TrustedListenableFutureTask trustedListenableFutureTask = new TrustedListenableFutureTask();
        trustedListenableFutureTask.H = new TrustedListenableFutureTask.TrustedFutureInterruptibleAsyncTask(asyncCallable2);
        listenableFuture.N(trustedListenableFutureTask, taskNonReentrantExecutor);
        final ListenableFuture listenableFutureI = Futures.i(trustedListenableFutureTask);
        Runnable runnable = new Runnable() { // from class: com.google.common.util.concurrent.f
            @Override // java.lang.Runnable
            public final void run() {
                TrustedListenableFutureTask trustedListenableFutureTask2 = trustedListenableFutureTask;
                if (trustedListenableFutureTask2.isDone()) {
                    settableFutureQ.o(listenableFuture);
                    return;
                }
                if (listenableFutureI.isCancelled()) {
                    int i11 = ExecutionSequencer.TaskNonReentrantExecutor.f17639e;
                    if (taskNonReentrantExecutor.compareAndSet(ExecutionSequencer.RunningState.NOT_RUN, ExecutionSequencer.RunningState.CANCELLED)) {
                        trustedListenableFutureTask2.cancel(false);
                    }
                }
            }
        };
        DirectExecutor directExecutor = DirectExecutor.INSTANCE;
        listenableFutureI.N(runnable, directExecutor);
        trustedListenableFutureTask.N(runnable, directExecutor);
        return listenableFutureI;
    }
}
