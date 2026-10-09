package com.google.android.gms.internal.common;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaj extends zzah {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zzah f9619e = new zzaj(0, new Object[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f9620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f9621d;

    public zzaj(int i11, Object[] objArr) {
        this.f9620c = objArr;
        this.f9621d = i11;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final Object[] d() {
        return this.f9620c;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int f() {
        return this.f9621d;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzr.a(i11, this.f9621d);
        Object obj = this.f9620c[i11];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean h() {
        return false;
    }

    @Override // com.google.android.gms.internal.common.zzah, com.google.android.gms.internal.common.zzac
    public final void j(Object[] objArr) {
        System.arraycopy(this.f9620c, 0, objArr, 0, this.f9621d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9621d;
    }
}
