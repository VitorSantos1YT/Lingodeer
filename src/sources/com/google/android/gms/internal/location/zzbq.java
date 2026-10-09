package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzbq<E> extends zzbo<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzbs f11101c;

    public zzbq(zzbs zzbsVar, int i11) {
        super(zzbsVar.size(), i11);
        this.f11101c = zzbsVar;
    }

    @Override // com.google.android.gms.internal.location.zzbo
    public final Object a(int i11) {
        return this.f11101c.get(i11);
    }
}
