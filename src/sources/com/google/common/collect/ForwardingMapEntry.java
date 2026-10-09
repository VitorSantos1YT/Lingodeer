package com.google.common.collect;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingMapEntry<K, V> extends ForwardingObject implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        return j0().equals(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return j0().getKey();
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return j0().getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return j0().hashCode();
    }

    @Override // com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public abstract Map.Entry j0();

    public Object setValue(Object obj) {
        return j0().setValue(obj);
    }
}
