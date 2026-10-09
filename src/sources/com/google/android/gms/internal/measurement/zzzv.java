package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzzv implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12225a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzzw f12226b;

    public zzzv(zzzw zzzwVar) {
        this.f12226b = zzzwVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12225a < this.f12226b.f12227a.f12235e;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i11 = this.f12225a;
        this.f12225a = i11 + 1;
        zzzy zzzyVar = this.f12226b.f12227a;
        return zzzyVar.d(zzzyVar.f12234d[i11] & 31);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
