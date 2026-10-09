package com.google.android.play.integrity.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class at extends ar {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ar f16250d = new at(new Object[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f16251c;

    public at(Object[] objArr) {
        this.f16251c = objArr;
    }

    @Override // com.google.android.play.integrity.internal.ar, com.google.android.play.integrity.internal.ao
    public final void b(Object[] objArr) {
        System.arraycopy(this.f16251c, 0, objArr, 0, 0);
    }

    @Override // com.google.android.play.integrity.internal.ao
    public final int d() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.ao
    public final int e() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.ao
    public final Object[] g() {
        return this.f16251c;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        al.a(i11, 0);
        Object obj = this.f16251c[i11];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
