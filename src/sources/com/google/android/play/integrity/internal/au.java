package com.google.android.play.integrity.internal;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class au extends as {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object[] f16252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final au f16253f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f16254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f16255d;

    static {
        Object[] objArr = new Object[0];
        f16252e = objArr;
        f16253f = new au(objArr, objArr);
    }

    public au(Object[] objArr, Object[] objArr2) {
        this.f16254c = objArr;
        this.f16255d = objArr2;
    }

    @Override // com.google.android.play.integrity.internal.ao
    public final void b(Object[] objArr) {
        System.arraycopy(this.f16254c, 0, objArr, 0, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f16255d.length;
        return false;
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
    /* JADX INFO: renamed from: f */
    public final av iterator() {
        ar arVar = this.f16249b;
        if (arVar == null) {
            aw awVar = ar.f16248b;
            arVar = at.f16250d;
            this.f16249b = arVar;
        }
        return arVar.listIterator(0);
    }

    @Override // com.google.android.play.integrity.internal.ao
    public final Object[] g() {
        return this.f16254c;
    }

    @Override // com.google.android.play.integrity.internal.as, java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.as, com.google.android.play.integrity.internal.ao, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ar arVar = this.f16249b;
        if (arVar == null) {
            aw awVar = ar.f16248b;
            arVar = at.f16250d;
            this.f16249b = arVar;
        }
        return arVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.as
    public final void j() {
    }
}
