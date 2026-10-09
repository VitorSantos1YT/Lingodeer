package com.google.common.cache;

import com.google.common.collect.ForwardingObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingCache<K, V> extends ForwardingObject implements Cache<K, V> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class SimpleForwardingCache<K, V> extends ForwardingCache<K, V> {
        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public final /* bridge */ /* synthetic */ Object j0() {
            return null;
        }

        @Override // com.google.common.cache.ForwardingCache
        /* JADX INFO: renamed from: o0 */
        public final Cache j0() {
            return null;
        }
    }

    @Override // com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public abstract Cache j0();
}
