package com.google.common.util.concurrent;

import com.google.common.collect.ForwardingObject;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingFuture<V> extends ForwardingObject implements Future<V> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class SimpleForwardingFuture<V> extends ForwardingFuture<V> {
        @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        public final /* bridge */ /* synthetic */ Object j0() {
            return null;
        }

        @Override // com.google.common.util.concurrent.ForwardingFuture
        /* JADX INFO: renamed from: o0 */
        public final Future j0() {
            return null;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        return j0().cancel(z11);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return j0().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return j0().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return j0().isDone();
    }

    @Override // com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public abstract Future j0();

    @Override // java.util.concurrent.Future
    public final Object get(long j11, TimeUnit timeUnit) {
        return j0().get(j11, timeUnit);
    }
}
