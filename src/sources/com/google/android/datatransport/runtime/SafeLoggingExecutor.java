package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.logging.Logging;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
class SafeLoggingExecutor implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f8022a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SafeLoggingRunnable implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f8023a;

        public SafeLoggingRunnable(Runnable runnable) {
            this.f8023a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f8023a.run();
            } catch (Exception unused) {
                Logging.b("Executor");
            }
        }
    }

    public SafeLoggingExecutor(ExecutorService executorService) {
        this.f8022a = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f8022a.execute(new SafeLoggingRunnable(runnable));
    }
}
