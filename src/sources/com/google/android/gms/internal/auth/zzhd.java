package com.google.android.gms.internal.auth;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzhd implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f9567a;

    public zzhd(zzhe zzheVar) {
        this.f9567a = zzheVar.f9568a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9567a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f9567a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
