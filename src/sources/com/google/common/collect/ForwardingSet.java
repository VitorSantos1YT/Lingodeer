package com.google.common.collect;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingSet<E> extends ForwardingCollection<E> implements Set<E> {
    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return obj == this || j0().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return j0().hashCode();
    }

    @Override // com.google.common.collect.ForwardingCollection
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public abstract Set j0();
}
