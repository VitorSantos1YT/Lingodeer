package com.google.common.collect;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public interface SortedMultiset<E> extends SortedMultisetBridge<E>, SortedIterable<E> {
    SortedMultiset E0(Object obj, BoundType boundType);

    SortedMultiset G();

    @Override // com.google.common.collect.SortedMultisetBridge, com.google.common.collect.Multiset
    NavigableSet c();

    Comparator comparator();

    @Override // com.google.common.collect.Multiset
    Set entrySet();

    Multiset.Entry firstEntry();

    SortedMultiset k0(Object obj, BoundType boundType);

    Multiset.Entry lastEntry();

    Multiset.Entry pollFirstEntry();

    Multiset.Entry pollLastEntry();

    SortedMultiset t1(Object obj, BoundType boundType, Object obj2, BoundType boundType2);
}
