package com.google.firebase.crashlytics.internal.common;

import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.type.bACG.scNRoQgKSYX;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class Utils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExecutorService f18348a;

    static {
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.google.firebase.crashlytics.internal.common.ExecutorUtils.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AtomicLong f18325a;

            /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.ExecutorUtils$1$1 */
            /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
            class C00331 extends BackgroundPriorityRunnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Runnable f18326a;

                public C00331() {
                    runnable = runnable;
                }

                @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
                public final void a() {
                    runnable.run();
                }
            }

            public AnonymousClass1() {
                atomicLong = atomicLong;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(new BackgroundPriorityRunnable() { // from class: com.google.firebase.crashlytics.internal.common.ExecutorUtils.1.1

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ Runnable f18326a;

                    public C00331() {
                        runnable = runnable;
                    }

                    @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
                    public final void a() {
                        runnable.run();
                    }
                });
                threadNewThread.setName(scNRoQgKSYX.dxxGUTHTla + atomicLong.getAndIncrement());
                return threadNewThread;
            }
        }, new ThreadPoolExecutor.DiscardPolicy()));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Runtime.getRuntime().addShutdownHook(new Thread(new BackgroundPriorityRunnable() { // from class: com.google.firebase.crashlytics.internal.common.ExecutorUtils.2

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ExecutorService f18327a;

            public AnonymousClass2() {
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                executorService = executorServiceUnconfigurableExecutorService;
            }

            @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
            public final void a() {
                ExecutorService executorService = executorService;
                try {
                    executorService.shutdown();
                    if (executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                        return;
                    }
                    executorService.shutdownNow();
                } catch (InterruptedException unused) {
                    Locale locale = Locale.US;
                    executorService.shutdownNow();
                }
            }
        }, "Crashlytics Shutdown Hook for awaitEvenIfOnMainThread task continuation executor"));
        f18348a = executorServiceUnconfigurableExecutorService;
    }

    private Utils() {
    }

    public static void a(Task task) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(f18348a, new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.k
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                ExecutorService executorService = Utils.f18348a;
                countDownLatch.countDown();
                return null;
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
        }
        if (task.isSuccessful()) {
            task.getResult();
        } else {
            if (task.isCanceled()) {
                throw new CancellationException("Task is already canceled");
            }
            if (!task.isComplete()) {
                throw new TimeoutException();
            }
            throw new IllegalStateException(task.getException());
        }
    }
}
