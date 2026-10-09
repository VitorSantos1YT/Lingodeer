package com.google.common.collect;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingListIterator<E> extends ForwardingIterator<E> implements ListIterator<E> {
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        o0().add(obj);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return o0().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return o0().nextIndex();
    }

    @Override // com.google.common.collect.ForwardingIterator
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract ListIterator j0();

    @Override // java.util.ListIterator
    public final Object previous() {
        return o0().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return o0().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        o0().set(obj);
    }
}
