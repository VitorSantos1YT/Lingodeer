package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingMap<K, V> extends ForwardingObject implements Map<K, V> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public abstract class StandardEntrySet extends Maps.EntrySet<K, V> {
        @Override // com.google.common.collect.Maps.EntrySet
        public final Map f() {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class StandardKeySet extends Maps.KeySet<K, V> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class StandardValues extends Maps.Values<K, V> {
    }

    public void clear() {
        j0().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return j0().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return j0().containsValue(obj);
    }

    public Set entrySet() {
        return j0().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || j0().equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return j0().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return j0().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return j0().isEmpty();
    }

    public Set keySet() {
        return j0().keySet();
    }

    @Override // com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public abstract Map j0();

    public final boolean p0(Object obj) {
        return Iterators.d(new Maps.AnonymousClass2(entrySet().iterator()), obj);
    }

    public Object put(Object obj, Object obj2) {
        return j0().put(obj, obj2);
    }

    public void putAll(Map map) {
        j0().putAll(map);
    }

    public Object remove(Object obj) {
        return j0().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return j0().size();
    }

    public Collection values() {
        return j0().values();
    }
}
