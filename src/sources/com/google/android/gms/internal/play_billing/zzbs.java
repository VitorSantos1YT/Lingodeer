package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbs extends zzbt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f12258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f12259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzbt f12260e;

    public zzbs(zzbt zzbtVar, int i11, int i12) {
        this.f12260e = zzbtVar;
        this.f12258c = i11;
        this.f12259d = i12;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final int d() {
        return this.f12260e.e() + this.f12258c + this.f12259d;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final int e() {
        return this.f12260e.e() + this.f12258c;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzbg.a(i11, this.f12259d);
        return this.f12260e.get(i11 + this.f12258c);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final boolean h() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final Object[] j() {
        return this.f12260e.j();
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final zzbt subList(int i11, int i12) {
        zzbg.c(i11, i12, this.f12259d);
        int i13 = this.f12258c;
        return this.f12260e.subList(i11 + i13, i12 + i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12259d;
    }
}
