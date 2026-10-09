package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
abstract class TransformedIterator<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f17265a;

    public TransformedIterator(Iterator it) {
        it.getClass();
        this.f17265a = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17265a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f17265a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f17265a.remove();
    }
}
