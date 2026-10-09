package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzalc<K> implements Iterator<Map.Entry<K, Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f10143a;

    public zzalc(Iterator it) {
        this.f10143a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10143a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f10143a.next();
        return entry.getValue() instanceof zzala ? new zzald(entry) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f10143a.remove();
    }
}
