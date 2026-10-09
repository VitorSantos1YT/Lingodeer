package com.google.common.graph;

import com.google.common.collect.ForwardingSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class InvalidatableSet<E> extends ForwardingSet<E> {
    @Override // com.google.common.collect.ForwardingSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        throw null;
    }

    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
    /* JADX INFO: renamed from: w0 */
    public final Set j0() {
        throw null;
    }
}
