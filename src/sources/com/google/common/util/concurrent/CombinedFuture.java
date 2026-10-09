package com.google.common.util.concurrent;

import com.google.android.gms.internal.measurement.zzwx;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class CombinedFuture<V> extends AggregateFuture<Object, V> {
    public CombinedFutureInterruptibleTask Q;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class AsyncCallableInterruptibleTask extends CombinedFuture<V>.CombinedFutureInterruptibleTask<ListenableFuture<V>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final zzwx f17619e;

        public AsyncCallableInterruptibleTask(zzwx zzwxVar, Executor executor) {
            super(executor);
            this.f17619e = zzwxVar;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final Object e() {
            return this.f17619e.call();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final String f() {
            return this.f17619e.toString();
        }

        @Override // com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask
        public final void h(Object obj) {
            CombinedFuture.this.o((ListenableFuture) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class CallableInterruptibleTask extends CombinedFuture<V>.CombinedFutureInterruptibleTask<V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Callable f17621e;

        public CallableInterruptibleTask(Callable callable, Executor executor) {
            super(executor);
            this.f17621e = callable;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final Object e() {
            return this.f17621e.call();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final String f() {
            return this.f17621e.toString();
        }

        @Override // com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask
        public final void h(Object obj) {
            CombinedFuture.this.m(obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public abstract class CombinedFutureInterruptibleTask<T> extends InterruptibleTask<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Executor f17623c;

        public CombinedFutureInterruptibleTask(Executor executor) {
            executor.getClass();
            this.f17623c = executor;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void a(Throwable th2) {
            CombinedFuture combinedFuture = CombinedFuture.this;
            combinedFuture.Q = null;
            if (th2 instanceof ExecutionException) {
                combinedFuture.n(((ExecutionException) th2).getCause());
            } else if (th2 instanceof CancellationException) {
                combinedFuture.cancel(false);
            } else {
                combinedFuture.n(th2);
            }
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void b(Object obj) {
            CombinedFuture.this.Q = null;
            h(obj);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final boolean d() {
            return CombinedFuture.this.isDone();
        }

        public abstract void h(Object obj);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void i() {
        CombinedFutureInterruptibleTask combinedFutureInterruptibleTask = this.Q;
        if (combinedFutureInterruptibleTask != null) {
            combinedFutureInterruptibleTask.c();
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    public final void r() {
        CombinedFutureInterruptibleTask combinedFutureInterruptibleTask = this.Q;
        if (combinedFutureInterruptibleTask != null) {
            try {
                combinedFutureInterruptibleTask.f17623c.execute(combinedFutureInterruptibleTask);
            } catch (RejectedExecutionException e8) {
                CombinedFuture.this.n(e8);
            }
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    public final void v(AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        super.v(releaseResourcesReason);
        if (releaseResourcesReason == AggregateFuture.ReleaseResourcesReason.OUTPUT_FUTURE_DONE) {
            this.Q = null;
        }
    }
}
