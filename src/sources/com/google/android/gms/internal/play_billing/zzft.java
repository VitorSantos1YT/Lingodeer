package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzft implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f12386a;

    public zzft(Iterator it) {
        this.f12386a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12386a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f12386a.next();
        return entry.getValue() instanceof zzfv ? new zzfs(entry) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f12386a.remove();
    }
}
