package com.google.common.collect;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingTable<R, C, V> extends ForwardingObject implements Table<R, C, V> {
    @Override // com.google.common.collect.Table
    public Set A() {
        throw null;
    }

    @Override // com.google.common.collect.Table
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        throw null;
    }

    @Override // com.google.common.collect.Table
    public Map f() {
        throw null;
    }

    @Override // com.google.common.collect.Table
    public final int hashCode() {
        throw null;
    }

    @Override // com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object j0() {
        return null;
    }

    @Override // com.google.common.collect.Table
    public final int size() {
        throw null;
    }
}
