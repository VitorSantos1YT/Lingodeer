package com.google.common.util.concurrent;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class SequentialExecutor implements Executor {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final LazyLogger f17672f = new LazyLogger(SequentialExecutor.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f17673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f17674b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WorkerRunningState f17675c = WorkerRunningState.IDLE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17676d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final QueueWorker f17677e = new QueueWorker();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class QueueWorker implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Runnable f17679a;

        public QueueWorker() {
        }

        /* JADX WARN: Code duplicated, block: B:46:0x0036 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        
            if (r1 == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        
            r9.f17679a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
        
            com.google.common.util.concurrent.SequentialExecutor.f17672f.a().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r9.f17679a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0074, code lost:
        
            r9.f17679a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                r9 = this;
                r0 = 0
                r1 = r0
            L2:
                com.google.common.util.concurrent.SequentialExecutor r2 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L50
                java.util.ArrayDeque r2 = r2.f17674b     // Catch: java.lang.Throwable -> L50
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L50
                if (r0 != 0) goto L28
                com.google.common.util.concurrent.SequentialExecutor r0 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L1c
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = r0.f17675c     // Catch: java.lang.Throwable -> L1c
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r4 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L1c
                if (r3 != r4) goto L1e
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L40
            L14:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
                goto L40
            L1c:
                r0 = move-exception
                goto L77
            L1e:
                long r5 = r0.f17676d     // Catch: java.lang.Throwable -> L1c
                r7 = 1
                long r5 = r5 + r7
                r0.f17676d = r5     // Catch: java.lang.Throwable -> L1c
                r0.f17675c = r4     // Catch: java.lang.Throwable -> L1c
                r0 = 1
            L28:
                com.google.common.util.concurrent.SequentialExecutor r3 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L1c
                java.util.ArrayDeque r3 = r3.f17674b     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1c
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L1c
                r9.f17679a = r3     // Catch: java.lang.Throwable -> L1c
                if (r3 != 0) goto L41
                com.google.common.util.concurrent.SequentialExecutor r0 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L1c
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L1c
                r0.f17675c = r3     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L40
                goto L14
            L40:
                return
            L41:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L50
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r9.f17679a     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
                r3.run()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            L4d:
                r9.f17679a = r2     // Catch: java.lang.Throwable -> L50
                goto L2
            L50:
                r0 = move-exception
                goto L79
            L52:
                r0 = move-exception
                goto L74
            L54:
                r3 = move-exception
                com.google.common.util.concurrent.LazyLogger r4 = com.google.common.util.concurrent.SequentialExecutor.f17672f     // Catch: java.lang.Throwable -> L52
                java.util.logging.Logger r4 = r4.a()     // Catch: java.lang.Throwable -> L52
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L52
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
                r6.<init>()     // Catch: java.lang.Throwable -> L52
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L52
                java.lang.Runnable r7 = r9.f17679a     // Catch: java.lang.Throwable -> L52
                r6.append(r7)     // Catch: java.lang.Throwable -> L52
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L52
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L52
                goto L4d
            L74:
                r9.f17679a = r2     // Catch: java.lang.Throwable -> L50
                throw r0     // Catch: java.lang.Throwable -> L50
            L77:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                throw r0     // Catch: java.lang.Throwable -> L50
            L79:
                if (r1 == 0) goto L82
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L82:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.SequentialExecutor.QueueWorker.a():void");
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a();
            } catch (Error e8) {
                synchronized (SequentialExecutor.this.f17674b) {
                    SequentialExecutor.this.f17675c = WorkerRunningState.IDLE;
                    throw e8;
                }
            }
        }

        public final String toString() {
            Runnable runnable = this.f17679a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + SequentialExecutor.this.f17675c + "}";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class WorkerRunningState {
        private static final /* synthetic */ WorkerRunningState[] $VALUES;
        public static final WorkerRunningState IDLE;
        public static final WorkerRunningState QUEUED;
        public static final WorkerRunningState QUEUING;
        public static final WorkerRunningState RUNNING;

        static {
            WorkerRunningState workerRunningState = new WorkerRunningState("IDLE", 0);
            IDLE = workerRunningState;
            WorkerRunningState workerRunningState2 = new WorkerRunningState("QUEUING", 1);
            QUEUING = workerRunningState2;
            WorkerRunningState workerRunningState3 = new WorkerRunningState("QUEUED", 2);
            QUEUED = workerRunningState3;
            WorkerRunningState workerRunningState4 = new WorkerRunningState("RUNNING", 3);
            RUNNING = workerRunningState4;
            $VALUES = new WorkerRunningState[]{workerRunningState, workerRunningState2, workerRunningState3, workerRunningState4};
        }

        public static WorkerRunningState valueOf(String str) {
            return (WorkerRunningState) Enum.valueOf(WorkerRunningState.class, str);
        }

        public static WorkerRunningState[] values() {
            return (WorkerRunningState[]) $VALUES.clone();
        }
    }

    public SequentialExecutor(Executor executor) {
        executor.getClass();
        this.f17673a = executor;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x005f  */
    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        WorkerRunningState workerRunningState;
        boolean z11;
        runnable.getClass();
        synchronized (this.f17674b) {
            WorkerRunningState workerRunningState2 = this.f17675c;
            if (workerRunningState2 != WorkerRunningState.RUNNING && workerRunningState2 != (workerRunningState = WorkerRunningState.QUEUED)) {
                long j11 = this.f17676d;
                Runnable runnable2 = new Runnable() { // from class: com.google.common.util.concurrent.SequentialExecutor.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        runnable.run();
                    }

                    public final String toString() {
                        return runnable.toString();
                    }
                };
                this.f17674b.add(runnable2);
                WorkerRunningState workerRunningState3 = WorkerRunningState.QUEUING;
                this.f17675c = workerRunningState3;
                try {
                    this.f17673a.execute(this.f17677e);
                    if (this.f17675c != workerRunningState3) {
                        return;
                    }
                    synchronized (this.f17674b) {
                        try {
                            if (this.f17676d == j11 && this.f17675c == workerRunningState3) {
                                this.f17675c = workerRunningState;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    synchronized (this.f17674b) {
                        try {
                            WorkerRunningState workerRunningState4 = this.f17675c;
                            if (workerRunningState4 != WorkerRunningState.IDLE && workerRunningState4 != WorkerRunningState.QUEUING) {
                                z11 = false;
                            } else if (this.f17674b.removeLastOccurrence(runnable2)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!(th3 instanceof RejectedExecutionException) || z11) {
                                throw th3;
                            }
                            return;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            }
            this.f17674b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f17673a + "}";
    }
}
