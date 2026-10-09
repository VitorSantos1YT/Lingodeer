package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
class ImmutableEntry<K, V> extends AbstractMapEntry<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16766b;

    public ImmutableEntry(Object obj, Object obj2) {
        this.f16765a = obj;
        this.f16766b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f16765a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f16766b;
    }

    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
