package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzbt<E> extends zzbs<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zzbs f11106e = new zzbt(0, new Object[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f11107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f11108d;

    public zzbt(int i11, Object[] objArr) {
        this.f11107c = objArr;
        this.f11108d = i11;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final Object[] d() {
        return this.f11107c;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final int f() {
        return this.f11108d;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzbm.a(i11, this.f11108d);
        return this.f11107c[i11];
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final boolean h() {
        return false;
    }

    @Override // com.google.android.gms.internal.location.zzbs, com.google.android.gms.internal.location.zzbp
    public final void j(Object[] objArr) {
        System.arraycopy(this.f11107c, 0, objArr, 0, this.f11108d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11108d;
    }
}
