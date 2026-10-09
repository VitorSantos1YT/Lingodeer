package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzbr extends zzbs {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f11102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f11103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzbs f11104e;

    public zzbr(zzbs zzbsVar, int i11, int i12) {
        this.f11104e = zzbsVar;
        this.f11102c = i11;
        this.f11103d = i12;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final Object[] d() {
        return this.f11104e.d();
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final int e() {
        return this.f11104e.e() + this.f11102c;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final int f() {
        return this.f11104e.e() + this.f11102c + this.f11103d;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzbm.a(i11, this.f11103d);
        return this.f11104e.get(i11 + this.f11102c);
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final boolean h() {
        return true;
    }

    @Override // com.google.android.gms.internal.location.zzbs, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final zzbs subList(int i11, int i12) {
        zzbm.b(i11, i12, this.f11103d);
        int i13 = this.f11102c;
        return this.f11104e.subList(i11 + i13, i12 + i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11103d;
    }
}
