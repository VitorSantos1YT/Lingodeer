package com.google.common.collect;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
class CompactLinkedHashSet<E> extends CompactHashSet<E> {
    public transient int H;
    public transient int K;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int[] f16666f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public transient int[] f16667t;

    @Override // com.google.common.collect.CompactHashSet
    public final int b(int i11, int i12) {
        return i11 >= size() ? i12 : i11;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (m()) {
            return;
        }
        this.H = -2;
        this.K = -2;
        int[] iArr = this.f16666f;
        if (iArr != null && this.f16667t != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.f16667t, 0, size(), 0);
        }
        super.clear();
    }

    @Override // com.google.common.collect.CompactHashSet
    public final int d() {
        int iD = super.d();
        this.f16666f = new int[iD];
        this.f16667t = new int[iD];
        return iD;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final LinkedHashSet e() {
        LinkedHashSet linkedHashSetE = super.e();
        this.f16666f = null;
        this.f16667t = null;
        return linkedHashSetE;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final int g() {
        return this.H;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final int h(int i11) {
        int[] iArr = this.f16667t;
        Objects.requireNonNull(iArr);
        return iArr[i11] - 1;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void j(int i11) {
        super.j(i11);
        this.H = -2;
        this.K = -2;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void k(Object obj, int i11, int i12, int i13) {
        super.k(obj, i11, i12, i13);
        t(this.K, i11);
        t(i11, -2);
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void l(int i11, int i12) {
        int size = size() - 1;
        super.l(i11, i12);
        int[] iArr = this.f16666f;
        Objects.requireNonNull(iArr);
        t(iArr[i11] - 1, h(i11));
        if (i11 < size) {
            int[] iArr2 = this.f16666f;
            Objects.requireNonNull(iArr2);
            t(iArr2[size] - 1, i11);
            t(i11, h(size));
        }
        int[] iArr3 = this.f16666f;
        Objects.requireNonNull(iArr3);
        iArr3[size] = 0;
        int[] iArr4 = this.f16667t;
        Objects.requireNonNull(iArr4);
        iArr4[size] = 0;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void r(int i11) {
        super.r(i11);
        int[] iArr = this.f16666f;
        Objects.requireNonNull(iArr);
        this.f16666f = Arrays.copyOf(iArr, i11);
        int[] iArr2 = this.f16667t;
        Objects.requireNonNull(iArr2);
        this.f16667t = Arrays.copyOf(iArr2, i11);
    }

    public final void t(int i11, int i12) {
        if (i11 == -2) {
            this.H = i12;
        } else {
            int[] iArr = this.f16667t;
            Objects.requireNonNull(iArr);
            iArr[i11] = i12 + 1;
        }
        if (i12 == -2) {
            this.K = i11;
            return;
        }
        int[] iArr2 = this.f16666f;
        Objects.requireNonNull(iArr2);
        iArr2[i12] = i11 + 1;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = new Object[size()];
        ObjectArrays.b(this, objArr);
        return objArr;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return ObjectArrays.c(this, objArr);
    }
}
