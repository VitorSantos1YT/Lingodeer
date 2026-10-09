package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcd extends zzbx {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient zzbw f12280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient zzbt f12281d;

    public zzcd(zzbw zzbwVar, zzbt zzbtVar) {
        this.f12280c = zzbwVar;
        this.f12281d = zzbtVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final int b(Object[] objArr) {
        return this.f12281d.b(objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12280c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx, com.google.android.gms.internal.play_billing.zzbq
    public final zzbt f() {
        return this.f12281d;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    /* JADX INFO: renamed from: g */
    public final zzch iterator() {
        return this.f12281d.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx, com.google.android.gms.internal.play_billing.zzbq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.f12281d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12280c.size();
    }
}
