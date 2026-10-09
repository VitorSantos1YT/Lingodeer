package com.google.firebase.crashlytics.internal.concurrency;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class CrashlyticsWorkers {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Companion f18375d = new Companion(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrashlyticsWorker f18376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CrashlyticsWorker f18377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CrashlyticsWorker f18378c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        public static String a() {
            return Thread.currentThread().getName();
        }

        private Companion() {
        }
    }

    public CrashlyticsWorkers(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        m.f(backgroundExecutorService, "backgroundExecutorService");
        m.f(blockingExecutorService, "blockingExecutorService");
        this.f18376a = new CrashlyticsWorker(backgroundExecutorService);
        this.f18377b = new CrashlyticsWorker(backgroundExecutorService);
        new CrashlyticsWorker(backgroundExecutorService);
        this.f18378c = new CrashlyticsWorker(blockingExecutorService);
    }

    public static final void a() {
        Companion companion = f18375d;
        companion.getClass();
        if (((Boolean) new CrashlyticsWorkers$Companion$checkBackgroundThread$1(0, 0, Companion.class, companion, "isBackgroundThread", "isBackgroundThread()Z").invoke()).booleanValue()) {
            return;
        }
        Companion.a();
    }

    public static final void b() {
        Companion companion = f18375d;
        companion.getClass();
        if (((Boolean) new CrashlyticsWorkers$Companion$checkBlockingThread$1(0, 0, Companion.class, companion, "isBlockingThread", "isBlockingThread()Z").invoke()).booleanValue()) {
            return;
        }
        Companion.a();
    }

    public static final void c() {
        Companion companion = f18375d;
        companion.getClass();
        if (((Boolean) new CrashlyticsWorkers$Companion$checkNotMainThread$1(0, 0, Companion.class, companion, "isNotMainThread", "isNotMainThread()Z").invoke()).booleanValue()) {
            return;
        }
        Companion.a();
    }
}
