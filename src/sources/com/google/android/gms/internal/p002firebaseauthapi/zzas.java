package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzas<E> extends zzah<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zzah f10242e = new zzas(0, new Object[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f10243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f10244d;

    public zzas(int i11, Object[] objArr) {
        this.f10243c = objArr;
        this.f10244d = i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int b() {
        return this.f10244d;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzah, com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int d(Object[] objArr) {
        Object[] objArr2 = this.f10243c;
        int i11 = this.f10244d;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final Object[] g() {
        return this.f10243c;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzu.a(i11, this.f10244d);
        Object obj = this.f10243c[i11];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10244d;
    }
}
