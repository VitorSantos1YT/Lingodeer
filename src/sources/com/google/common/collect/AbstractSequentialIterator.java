package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractSequentialIterator<T> extends UnmodifiableIterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f16615a;

    public AbstractSequentialIterator(Object obj) {
        this.f16615a = obj;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16615a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f16615a;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        this.f16615a = a(obj);
        return obj;
    }
}
