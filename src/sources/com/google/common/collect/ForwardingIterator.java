package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingIterator<T> extends ForwardingObject implements Iterator<T> {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return j0().hasNext();
    }

    public Object next() {
        return j0().next();
    }

    @Override // com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public abstract Iterator j0();

    public void remove() {
        j0().remove();
    }
}
