package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
class TrustedListenableFutureTask<V> extends FluentFuture.TrustedFuture<V> implements RunnableFuture<V> {
    public volatile InterruptibleTask H;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class TrustedFutureInterruptibleAsyncTask extends InterruptibleTask<ListenableFuture<V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AsyncCallable f17690c;

        public TrustedFutureInterruptibleAsyncTask(AsyncCallable asyncCallable) {
            this.f17690c = asyncCallable;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void a(Throwable th2) {
            TrustedListenableFutureTask.this.n(th2);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void b(Object obj) {
            TrustedListenableFutureTask.this.o((ListenableFuture) obj);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final boolean d() {
            return TrustedListenableFutureTask.this.isDone();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final Object e() {
            AsyncCallable asyncCallable = this.f17690c;
            ListenableFuture listenableFutureCall = asyncCallable.call();
            Preconditions.j(listenableFutureCall, asyncCallable, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s");
            return listenableFutureCall;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final String f() {
            return this.f17690c.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class TrustedFutureInterruptibleTask extends InterruptibleTask<V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Callable f17692c;

        public TrustedFutureInterruptibleTask(Callable callable) {
            callable.getClass();
            this.f17692c = callable;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void a(Throwable th2) {
            TrustedListenableFutureTask.this.n(th2);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void b(Object obj) {
            TrustedListenableFutureTask.this.m(obj);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final boolean d() {
            return TrustedListenableFutureTask.this.isDone();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final Object e() {
            return this.f17692c.call();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final String f() {
            return this.f17692c.toString();
        }
    }

    public TrustedListenableFutureTask(Callable callable) {
        this.H = new TrustedFutureInterruptibleTask(callable);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void c() {
        InterruptibleTask interruptibleTask;
        if (p() && (interruptibleTask = this.H) != null) {
            interruptibleTask.c();
        }
        this.H = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String k() {
        InterruptibleTask interruptibleTask = this.H;
        if (interruptibleTask == null) {
            return super.k();
        }
        return "task=[" + interruptibleTask + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        InterruptibleTask interruptibleTask = this.H;
        if (interruptibleTask != null) {
            interruptibleTask.run();
        }
        this.H = null;
    }
}
