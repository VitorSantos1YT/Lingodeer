package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzag extends zzah {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f9615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f9616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzah f9617e;

    public zzag(zzah zzahVar, int i11, int i12) {
        this.f9617e = zzahVar;
        this.f9615c = i11;
        this.f9616d = i12;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final Object[] d() {
        return this.f9617e.d();
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int e() {
        return this.f9617e.e() + this.f9615c;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int f() {
        return this.f9617e.e() + this.f9615c + this.f9616d;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzr.a(i11, this.f9616d);
        return this.f9617e.get(i11 + this.f9615c);
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean h() {
        return true;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    /* JADX INFO: renamed from: l */
    public final zzah subList(int i11, int i12) {
        zzr.c(i11, i12, this.f9616d);
        int i13 = this.f9615c;
        return this.f9617e.subList(i11 + i13, i12 + i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9616d;
    }
}
