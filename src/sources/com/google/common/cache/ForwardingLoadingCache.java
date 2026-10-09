package com.google.common.cache;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingLoadingCache<K, V> extends ForwardingCache<K, V> implements LoadingCache<K, V> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class SimpleForwardingLoadingCache<K, V> extends ForwardingLoadingCache<K, V> {
        @Override // com.google.common.cache.ForwardingLoadingCache, com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: j0 */
        public final /* bridge */ /* synthetic */ Object o0() {
            return null;
        }

        @Override // com.google.common.cache.ForwardingLoadingCache, com.google.common.cache.ForwardingCache
        /* JADX INFO: renamed from: o0 */
        public final /* bridge */ /* synthetic */ Cache j0() {
            return null;
        }
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        throw null;
    }

    @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: j0 */
    public /* bridge */ /* synthetic */ Object o0() {
        return null;
    }

    @Override // com.google.common.cache.ForwardingCache
    /* JADX INFO: renamed from: o0 */
    public /* bridge */ /* synthetic */ Cache j0() {
        return null;
    }
}
