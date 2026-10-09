package com.google.common.cache;

import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class CacheLoader<K, V> {

    /* JADX INFO: renamed from: com.google.common.cache.CacheLoader$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends CacheLoader<Object, Object> {
        @Override // com.google.common.cache.CacheLoader
        public final Object a(Object obj) {
            throw null;
        }

        @Override // com.google.common.cache.CacheLoader
        public final ListenableFuture b(Object obj, Object obj2) {
            new ListenableFutureTask(new a(0, obj, obj2));
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class FunctionToCacheLoader<K, V> extends CacheLoader<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.cache.CacheLoader
        public final Object a(Object obj) {
            obj.getClass();
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class InvalidCacheLoadException extends RuntimeException {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SupplierToCacheLoader<V> extends CacheLoader<Object, V> implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.cache.CacheLoader
        public final Object a(Object obj) {
            obj.getClass();
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class UnsupportedLoadingOperationException extends UnsupportedOperationException {
    }

    public abstract Object a(Object obj);

    public ListenableFuture b(Object obj, Object obj2) {
        obj.getClass();
        return Futures.g(a(obj));
    }
}
