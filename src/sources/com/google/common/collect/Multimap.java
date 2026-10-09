package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@DoNotMock
@ElementTypesAreNonnullByDefault
public interface Multimap<K, V> {
    Multiset T();

    Map Y();

    Collection b(Object obj);

    void clear();

    boolean containsKey(Object obj);

    boolean containsValue(Object obj);

    Collection e();

    boolean equals(Object obj);

    boolean g0(Object obj, Object obj2);

    Collection get(Object obj);

    int hashCode();

    boolean isEmpty();

    Set keySet();

    boolean put(Object obj, Object obj2);

    boolean remove(Object obj, Object obj2);

    int size();

    Collection values();
}
