package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.Preconditions;
import defpackage.e;
import java.util.NoSuchElementException;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f8879c;

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            int i11 = this.f8870b;
            throw new NoSuchElementException(e.g(i11, "Cannot advance the iterator beyond ", new StringBuilder(String.valueOf(i11).length() + 35)));
        }
        int i12 = this.f8870b + 1;
        this.f8870b = i12;
        if (i12 != 0) {
            DataBufferRef dataBufferRef = (DataBufferRef) this.f8879c;
            if (i12 >= 0) {
                throw null;
            }
            Preconditions.j(false);
            dataBufferRef.f8871a = i12;
            throw null;
        }
        Object obj = this.f8869a.get(0);
        Preconditions.g(obj);
        this.f8879c = obj;
        if (obj instanceof DataBufferRef) {
            return obj;
        }
        String strValueOf = String.valueOf(obj.getClass());
        throw new IllegalStateException(p.u(new StringBuilder(strValueOf.length() + 44), "DataBuffer reference of type ", strValueOf, " is not movable"));
    }
}
