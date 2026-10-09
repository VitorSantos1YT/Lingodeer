package com.google.common.collect;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public interface BiMap<K, V> extends Map<K, V> {
    BiMap Z();

    @Override // com.google.common.collect.BiMap
    Set values();
}
