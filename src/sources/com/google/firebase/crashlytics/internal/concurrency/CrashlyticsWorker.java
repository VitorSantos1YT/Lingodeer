package com.google.firebase.crashlytics.internal.concurrency;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CrashlyticsWorker implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f18372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18373b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Task f18374c = Tasks.forResult(null);

    public CrashlyticsWorker(ExecutorService executorService) {
        this.f18372a = executorService;
    }

    public final Task a(Runnable runnable) {
        Task taskContinueWithTask;
        synchronized (this.f18373b) {
            taskContinueWithTask = this.f18374c.continueWithTask(this.f18372a, new app.rive.runtime.kotlin.core.a(runnable, 28));
            this.f18374c = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    public final Task b(Callable callable) {
        Task taskContinueWithTask;
        synchronized (this.f18373b) {
            taskContinueWithTask = this.f18374c.continueWithTask(this.f18372a, new app.rive.runtime.kotlin.core.a(callable, 27));
            this.f18374c = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f18372a.execute(runnable);
    }
}
