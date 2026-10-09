package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzce extends zzbt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f12282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f12283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f12284e;

    public zzce(int i11, int i12, Object[] objArr) {
        this.f12282c = objArr;
        this.f12283d = i11;
        this.f12284e = i12;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzbg.a(i11, this.f12284e);
        Object obj = this.f12282c[i11 + i11 + this.f12283d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12284e;
    }
}
