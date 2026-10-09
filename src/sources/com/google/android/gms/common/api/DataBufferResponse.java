package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataBufferIterator;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class DataBufferResponse<T, R extends AbstractDataBuffer<T> & Result> extends Response<R> implements DataBuffer<T> {
    @Override // com.google.android.gms.common.data.DataBuffer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((AbstractDataBuffer) this.f8700a).getClass();
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final Object get(int i11) {
        return ((AbstractDataBuffer) this.f8700a).get(i11);
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final int getCount() {
        return ((AbstractDataBuffer) this.f8700a).getCount();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        AbstractDataBuffer abstractDataBuffer = (AbstractDataBuffer) this.f8700a;
        abstractDataBuffer.getClass();
        return new DataBufferIterator(abstractDataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBuffer, com.google.android.gms.common.api.Releasable
    public final void release() {
        ((AbstractDataBuffer) this.f8700a).getClass();
    }
}
