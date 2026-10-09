package com.google.common.collect;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public interface SetMultimap<K, V> extends Multimap<K, V> {
    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    Set b(Object obj);

    @Override // com.google.common.collect.Multimap
    Set e();

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    Set get(Object obj);
}
