package com.google.firebase.database.core.utilities;

import com.google.firebase.database.core.RunLoop;
import com.google.firebase.database.core.ThreadInitializer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DefaultRunLoop implements RunLoop {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f19411a;

    /* JADX INFO: renamed from: com.google.firebase.database.core.utilities.DefaultRunLoop$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class AnonymousClass1 extends ScheduledThreadPoolExecutor implements AutoCloseable {
        public AnonymousClass1(ThreadFactory threadFactory) {
            super(1, threadFactory);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public final void afterExecute(Runnable runnable, Throwable th2) {
            super.afterExecute(runnable, th2);
            if (th2 == null && (runnable instanceof Future)) {
                Future future = (Future) runnable;
                try {
                    if (future.isDone()) {
                        future.get();
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (CancellationException unused2) {
                } catch (ExecutionException e8) {
                    th2 = e8.getCause();
                }
            }
            if (th2 != null) {
                DefaultRunLoop.this.c(th2);
            }
        }

        @Override // java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            boolean zIsTerminated;
            if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
                return;
            }
            shutdown();
            boolean z11 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z11) {
                        shutdownNow();
                        z11 = true;
                    }
                }
            }
            if (z11) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class FirebaseThreadFactory implements ThreadFactory {
        public FirebaseThreadFactory() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            ThreadInitializer threadInitializer = ThreadInitializer.f19356a;
            threadInitializer.a(threadNewThread);
            threadInitializer.b(threadNewThread);
            threadInitializer.c(threadNewThread, new Thread.UncaughtExceptionHandler() { // from class: com.google.firebase.database.core.utilities.DefaultRunLoop.FirebaseThreadFactory.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th2) {
                    DefaultRunLoop.this.c(th2);
                }
            });
            return threadNewThread;
        }
    }

    public DefaultRunLoop() {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(new FirebaseThreadFactory());
        this.f19411a = anonymousClass1;
        anonymousClass1.setKeepAliveTime(3L, TimeUnit.SECONDS);
    }

    @Override // com.google.firebase.database.core.RunLoop
    public final void a() {
        this.f19411a.setCorePoolSize(1);
    }

    @Override // com.google.firebase.database.core.RunLoop
    public final void b(Runnable runnable) {
        this.f19411a.execute(runnable);
    }

    public abstract void c(Throwable th2);
}
