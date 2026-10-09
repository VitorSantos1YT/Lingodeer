package com.google.common.collect;

import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingQueue<E> extends ForwardingCollection<E> implements Queue<E> {
    @Override // java.util.Queue
    public final Object element() {
        return o0().element();
    }

    public boolean offer(Object obj) {
        return o0().offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return o0().peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return o0().poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return o0().remove();
    }

    @Override // com.google.common.collect.ForwardingCollection
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract Queue o0();
}
