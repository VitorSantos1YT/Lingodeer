package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzpl<P> implements Iterator<P> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f10833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f10834b;

    public zzpl(Iterator it, Iterator it2) {
        this.f10833a = it;
        this.f10834b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10833a.hasNext() || this.f10834b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it = this.f10833a;
        return it.hasNext() ? it.next() : this.f10834b.next();
    }
}
