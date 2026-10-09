package com.google.firebase.crashlytics.internal.concurrency;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class CrashlyticsTasks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s.a f18371a = new s.a(1);

    private CrashlyticsTasks() {
    }

    public static Task a(Task task, Task task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        a aVar = new a(taskCompletionSource, new AtomicBoolean(false), cancellationTokenSource, 0);
        s.a aVar2 = f18371a;
        task.continueWithTask(aVar2, aVar);
        task2.continueWithTask(aVar2, aVar);
        return taskCompletionSource.getTask();
    }
}
