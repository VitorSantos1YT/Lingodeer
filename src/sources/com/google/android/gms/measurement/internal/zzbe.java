package com.google.android.gms.measurement.internal;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbe implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f12700a;

    public zzbe(zzbf zzbfVar) {
        Objects.requireNonNull(zzbfVar);
        this.f12700a = zzbfVar.f12701a.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12700a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f12700a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
