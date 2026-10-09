package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzav extends zzah<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f10249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f10250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f10251e;

    public zzav(int i11, int i12, Object[] objArr) {
        this.f10249c = objArr;
        this.f10250d = i11;
        this.f10251e = i12;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzu.a(i11, this.f10251e);
        Object obj = this.f10249c[(i11 * 2) + this.f10250d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10251e;
    }
}
