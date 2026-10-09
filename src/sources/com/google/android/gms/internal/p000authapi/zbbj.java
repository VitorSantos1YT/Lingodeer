package com.google.android.gms.internal.p000authapi;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zbbj extends zbbi {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zbbi f9412e = new zbbj(0, new Object[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f9413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f9414d;

    public zbbj(int i11, Object[] objArr) {
        this.f9413c = objArr;
        this.f9414d = i11;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbf
    public final Object[] d() {
        return this.f9413c;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbf
    public final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbf
    public final int f() {
        return this.f9414d;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zbbc.a(i11, this.f9414d);
        Object obj = this.f9413c[i11];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbf
    public final boolean h() {
        return false;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbi, com.google.android.gms.internal.p000authapi.zbbf
    public final void j(Object[] objArr) {
        System.arraycopy(this.f9413c, 0, objArr, 0, this.f9414d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9414d;
    }
}
