package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingListenableFuture<V> extends ForwardingFuture<V> implements ListenableFuture<V> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class SimpleForwardingListenableFuture<V> extends ForwardingListenableFuture<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractFuture f17647a;

        public SimpleForwardingListenableFuture(AbstractFuture abstractFuture) {
            this.f17647a = abstractFuture;
        }

        @Override // com.google.common.util.concurrent.ForwardingListenableFuture, com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        public final Object j0() {
            return this.f17647a;
        }

        @Override // com.google.common.util.concurrent.ForwardingListenableFuture, com.google.common.util.concurrent.ForwardingFuture
        /* JADX INFO: renamed from: o0 */
        public final Future j0() {
            return this.f17647a;
        }

        @Override // com.google.common.util.concurrent.ForwardingListenableFuture
        /* JADX INFO: renamed from: p0 */
        public final ListenableFuture o0() {
            return this.f17647a;
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void N(Runnable runnable, Executor executor) {
        o0().N(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.ForwardingFuture
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract ListenableFuture j0();
}
