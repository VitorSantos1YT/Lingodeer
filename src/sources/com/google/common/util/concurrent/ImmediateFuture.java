package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
class ImmediateFuture<V> implements ListenableFuture<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ListenableFuture f17653b = new ImmediateFuture(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LazyLogger f17654c = new LazyLogger(ImmediateFuture.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17655a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ImmediateCancelledFuture<V> extends AbstractFuture.TrustedFuture<V> {
        public static final ImmediateCancelledFuture H;

        static {
            H = AbstractFuture.f17572d ? null : new ImmediateCancelledFuture();
        }

        public ImmediateCancelledFuture() {
            cancel(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ImmediateFailedFuture<V> extends AbstractFuture.TrustedFuture<V> {
    }

    public ImmediateFuture(Object obj) {
        this.f17655a = obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void N(Runnable runnable, Executor executor) {
        Preconditions.k(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e8) {
            f17654c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e8);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f17655a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f17655a + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j11, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f17655a;
    }
}
