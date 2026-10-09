package com.google.common.util.concurrent;

import com.google.android.gms.internal.measurement.zzwx;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Futures extends GwtFuturesCatchingSpecialization {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.Futures$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 implements Future<Object> {
        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z11) {
            throw null;
        }

        @Override // java.util.concurrent.Future
        public final Object get() {
            throw null;
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            throw null;
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            throw null;
        }

        @Override // java.util.concurrent.Future
        public final Object get(long j11, TimeUnit timeUnit) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CallbackListener<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ListenableFuture f17648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FutureCallback f17649b;

        public CallbackListener(ListenableFuture listenableFuture, FutureCallback futureCallback) {
            this.f17648a = listenableFuture;
            this.f17649b = futureCallback;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Throwable thA;
            ListenableFuture listenableFuture = this.f17648a;
            boolean z11 = listenableFuture instanceof InternalFutureFailureAccess;
            FutureCallback futureCallback = this.f17649b;
            if (z11 && (thA = ((InternalFutureFailureAccess) listenableFuture).a()) != null) {
                futureCallback.a(thA);
                return;
            }
            try {
                futureCallback.onSuccess(Futures.d(listenableFuture));
            } catch (ExecutionException e8) {
                futureCallback.a(e8.getCause());
            } catch (Throwable th2) {
                futureCallback.a(th2);
            }
        }

        public final String toString() {
            MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
            toStringHelperB.f(this.f17649b);
            return toStringHelperB.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class FutureCombiner<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f17650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImmutableList f17651b;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.Futures$FutureCombiner$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 implements Callable<Void> {
            @Override // java.util.concurrent.Callable
            public final Void call() {
                throw null;
            }
        }

        public FutureCombiner(boolean z11, ImmutableList immutableList) {
            this.f17650a = z11;
            this.f17651b = immutableList;
        }

        public final ListenableFuture a(Executor executor, Callable callable) {
            CombinedFuture combinedFuture = new CombinedFuture(this.f17651b, this.f17650a);
            combinedFuture.Q = new CombinedFuture.CallableInterruptibleTask(callable, executor);
            combinedFuture.t();
            return combinedFuture;
        }

        public final ListenableFuture b(zzwx zzwxVar, Executor executor) {
            CombinedFuture combinedFuture = new CombinedFuture(this.f17651b, this.f17650a);
            combinedFuture.Q = new CombinedFuture.AsyncCallableInterruptibleTask(zzwxVar, executor);
            combinedFuture.t();
            return combinedFuture;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class InCompletionOrderState<T> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class NonCancellationPropagatingFuture<V> extends AbstractFuture.TrustedFuture<V> implements Runnable {
        public ListenableFuture H;

        @Override // com.google.common.util.concurrent.AbstractFuture
        public final void c() {
            this.H = null;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public final String k() {
            ListenableFuture listenableFuture = this.H;
            if (listenableFuture == null) {
                return null;
            }
            return "delegate=[" + listenableFuture + "]";
        }

        @Override // java.lang.Runnable
        public final void run() {
            ListenableFuture listenableFuture = this.H;
            if (listenableFuture != null) {
                o(listenableFuture);
            }
        }
    }

    private Futures() {
    }

    public static void a(ListenableFuture listenableFuture, FutureCallback futureCallback, Executor executor) {
        listenableFuture.N(new CallbackListener(listenableFuture, futureCallback), executor);
    }

    public static ListenableFuture b(ListenableFuture listenableFuture, Class cls, Function function, ListeningScheduledExecutorService listeningScheduledExecutorService) {
        int i11 = AbstractCatchingFuture.M;
        AbstractCatchingFuture.CatchingFuture catchingFuture = new AbstractCatchingFuture.CatchingFuture(listenableFuture, cls, function);
        listenableFuture.N(catchingFuture, MoreExecutors.d(listeningScheduledExecutorService, catchingFuture));
        return catchingFuture;
    }

    public static ListenableFuture c(ListenableFuture listenableFuture, Class cls, AsyncFunction asyncFunction, Executor executor) {
        int i11 = AbstractCatchingFuture.M;
        AbstractCatchingFuture.AsyncCatchingFuture asyncCatchingFuture = new AbstractCatchingFuture.AsyncCatchingFuture(listenableFuture, cls, asyncFunction);
        listenableFuture.N(asyncCatchingFuture, MoreExecutors.d(executor, asyncCatchingFuture));
        return asyncCatchingFuture;
    }

    public static Object d(Future future) {
        Preconditions.q("Future was expected to be done: %s", future.isDone(), future);
        return Uninterruptibles.a(future);
    }

    public static ListenableFuture e() {
        ImmediateFuture.ImmediateCancelledFuture immediateCancelledFuture = ImmediateFuture.ImmediateCancelledFuture.H;
        return immediateCancelledFuture != null ? immediateCancelledFuture : new ImmediateFuture.ImmediateCancelledFuture();
    }

    public static ListenableFuture f(Throwable th2) {
        ImmediateFuture.ImmediateFailedFuture immediateFailedFuture = new ImmediateFuture.ImmediateFailedFuture();
        immediateFailedFuture.n(th2);
        return immediateFailedFuture;
    }

    public static ListenableFuture g(Object obj) {
        return obj == null ? ImmediateFuture.f17653b : new ImmediateFuture(obj);
    }

    public static ListenableFuture h() {
        return ImmediateFuture.f17653b;
    }

    public static ListenableFuture i(ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        NonCancellationPropagatingFuture nonCancellationPropagatingFuture = new NonCancellationPropagatingFuture();
        nonCancellationPropagatingFuture.H = listenableFuture;
        listenableFuture.N(nonCancellationPropagatingFuture, DirectExecutor.INSTANCE);
        return nonCancellationPropagatingFuture;
    }

    public static ListenableFuture j(Executor executor, Callable callable) {
        TrustedListenableFutureTask trustedListenableFutureTask = new TrustedListenableFutureTask(callable);
        executor.execute(trustedListenableFutureTask);
        return trustedListenableFutureTask;
    }

    public static ListenableFuture k(AsyncCallable asyncCallable, Executor executor) {
        TrustedListenableFutureTask trustedListenableFutureTask = new TrustedListenableFutureTask();
        trustedListenableFutureTask.H = new TrustedListenableFutureTask.TrustedFutureInterruptibleAsyncTask(asyncCallable);
        executor.execute(trustedListenableFutureTask);
        return trustedListenableFutureTask;
    }

    public static ListenableFuture l(ListenableFuture listenableFuture, Function function, Executor executor) {
        int i11 = AbstractTransformFuture.L;
        function.getClass();
        AbstractTransformFuture.TransformFuture transformFuture = new AbstractTransformFuture.TransformFuture(listenableFuture, function);
        listenableFuture.N(transformFuture, MoreExecutors.d(executor, transformFuture));
        return transformFuture;
    }

    public static ListenableFuture m(ListenableFuture listenableFuture, AsyncFunction asyncFunction, Executor executor) {
        int i11 = AbstractTransformFuture.L;
        executor.getClass();
        AbstractTransformFuture.AsyncTransformFuture asyncTransformFuture = new AbstractTransformFuture.AsyncTransformFuture(listenableFuture, asyncFunction);
        listenableFuture.N(asyncTransformFuture, MoreExecutors.d(executor, asyncTransformFuture));
        return asyncTransformFuture;
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class InCompletionOrderFuture<T> extends AbstractFuture<T> {
        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z11) {
            if (super.cancel(z11)) {
                throw null;
            }
            return false;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public final String k() {
            return null;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public final void c() {
        }
    }
}
