package com.google.common.util.concurrent;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class JdkFutureAdapters {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ListenableFutureAdapter<V> extends ForwardingFuture<V> implements ListenableFuture<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExecutorService f17659a;

        static {
            ThreadFactoryBuilder threadFactoryBuilder = new ThreadFactoryBuilder();
            threadFactoryBuilder.f17685b = Boolean.TRUE;
            Locale locale = Locale.ROOT;
            threadFactoryBuilder.f17684a = "ListenableFutureAdapter-thread-%d";
            f17659a = Executors.newCachedThreadPool(threadFactoryBuilder.a());
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public final void N(Runnable runnable, Executor executor) {
            throw null;
        }

        @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: j0 */
        public final /* bridge */ /* synthetic */ Object o0() {
            return null;
        }

        @Override // com.google.common.util.concurrent.ForwardingFuture
        /* JADX INFO: renamed from: o0 */
        public final Future j0() {
            return null;
        }
    }

    private JdkFutureAdapters() {
    }
}
