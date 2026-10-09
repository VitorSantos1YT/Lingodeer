package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingMultimap<K, V> extends ForwardingObject implements Multimap<K, V> {
    @Override // com.google.common.collect.Multimap
    public Multiset T() {
        return o0().T();
    }

    @Override // com.google.common.collect.Multimap
    public Map Y() {
        return o0().Y();
    }

    public Collection b(Object obj) {
        return o0().b(obj);
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        o0().clear();
    }

    @Override // com.google.common.collect.Multimap
    public final boolean containsKey(Object obj) {
        return o0().containsKey(obj);
    }

    @Override // com.google.common.collect.Multimap
    public Collection e() {
        return o0().e();
    }

    @Override // com.google.common.collect.Multimap
    public final boolean equals(Object obj) {
        return obj == this || o0().equals(obj);
    }

    @Override // com.google.common.collect.Multimap
    public final boolean g0(Object obj, Object obj2) {
        return o0().g0(obj, obj2);
    }

    public Collection get(Object obj) {
        return o0().get(obj);
    }

    @Override // com.google.common.collect.Multimap
    public final int hashCode() {
        return o0().hashCode();
    }

    @Override // com.google.common.collect.Multimap
    public final boolean isEmpty() {
        return o0().isEmpty();
    }

    @Override // com.google.common.collect.Multimap
    public Set keySet() {
        return o0().keySet();
    }

    @Override // com.google.common.collect.ForwardingObject
    public abstract Multimap o0();

    @Override // com.google.common.collect.Multimap
    public boolean put(Object obj, Object obj2) {
        return o0().put(obj, obj2);
    }

    @Override // com.google.common.collect.Multimap
    public boolean remove(Object obj, Object obj2) {
        return o0().remove(obj, obj2);
    }

    @Override // com.google.common.collect.Multimap
    public final int size() {
        return o0().size();
    }

    @Override // com.google.common.collect.Multimap
    public Collection values() {
        return o0().values();
    }
}
