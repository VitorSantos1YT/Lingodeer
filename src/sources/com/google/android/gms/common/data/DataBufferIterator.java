package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.Preconditions;
import defpackage.e;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class DataBufferIterator<T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataBuffer f8869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8870b;

    public DataBufferIterator(DataBuffer dataBuffer) {
        Preconditions.g(dataBuffer);
        this.f8869a = dataBuffer;
        this.f8870b = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8870b < this.f8869a.getCount() + (-1);
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            int i11 = this.f8870b;
            throw new NoSuchElementException(e.g(i11, "Cannot advance the iterator beyond ", new StringBuilder(String.valueOf(i11).length() + 35)));
        }
        int i12 = this.f8870b + 1;
        this.f8870b = i12;
        return this.f8869a.get(i12);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
