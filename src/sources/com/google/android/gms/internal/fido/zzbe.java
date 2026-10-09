package com.google.android.gms.internal.fido;

import java.util.AbstractMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzbe extends zzaz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbf f9654c;

    public zzbe(zzbf zzbfVar) {
        this.f9654c = zzbfVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        zzbf zzbfVar = this.f9654c;
        return new AbstractMap.SimpleImmutableEntry(zzbfVar.f9655c.f9657b.f9674e.get(i11), zzbfVar.f9655c.f9658c.get(i11));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9654c.f9655c.f9658c.size();
    }
}
