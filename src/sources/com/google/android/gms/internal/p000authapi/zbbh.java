package com.google.android.gms.internal.p000authapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zbbh extends zbbi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f9408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f9409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zbbi f9410e;

    public zbbh(zbbi zbbiVar, int i11, int i12) {
        this.f9410e = zbbiVar;
        this.f9408c = i11;
        this.f9409d = i12;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbf
    public final Object[] d() {
        return this.f9410e.d();
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbf
    public final int e() {
        return this.f9410e.e() + this.f9408c;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbf
    public final int f() {
        return this.f9410e.e() + this.f9408c + this.f9409d;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zbbc.a(i11, this.f9409d);
        return this.f9410e.get(i11 + this.f9408c);
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbf
    public final boolean h() {
        return true;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbi, java.util.List
    /* JADX INFO: renamed from: k */
    public final zbbi subList(int i11, int i12) {
        zbbc.b(i11, i12, this.f9409d);
        int i13 = this.f9408c;
        return this.f9410e.subList(i11 + i13, i12 + i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9409d;
    }
}
