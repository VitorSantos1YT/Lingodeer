package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedMap<K, V> extends ForwardingMap<K, V> implements SortedMap<K, V> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class StandardKeySet extends Maps.SortedKeySet<K, V> {
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return o0().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return o0().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return o0().headMap(obj);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return o0().lastKey();
    }

    @Override // com.google.common.collect.ForwardingMap
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public abstract SortedMap o0();

    @Override // java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return o0().subMap(obj, obj2);
    }

    @Override // java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return o0().tailMap(obj);
    }
}
