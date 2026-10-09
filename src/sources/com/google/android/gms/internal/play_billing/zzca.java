package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzca extends zzbt {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zzbt f12273e = new zzca(0, new Object[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f12274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f12275d;

    public zzca(int i11, Object[] objArr) {
        this.f12274c = objArr;
        this.f12275d = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt, com.google.android.gms.internal.play_billing.zzbq
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f12274c;
        int i11 = this.f12275d;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final int d() {
        return this.f12275d;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final int e() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzbg.a(i11, this.f12275d);
        Object obj = this.f12274c[i11];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final boolean h() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final Object[] j() {
        return this.f12274c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12275d;
    }
}
