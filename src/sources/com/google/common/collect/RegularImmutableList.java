package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
class RegularImmutableList<E> extends ImmutableList<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ImmutableList f17147e = new RegularImmutableList(0, new Object[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f17148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f17149d;

    public RegularImmutableList(int i11, Object[] objArr) {
        this.f17148c = objArr;
        this.f17149d = i11;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public final int d(int i11, Object[] objArr) {
        Object[] objArr2 = this.f17148c;
        int i12 = this.f17149d;
        System.arraycopy(objArr2, 0, objArr, i11, i12);
        return i11 + i12;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] e() {
        return this.f17148c;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int f() {
        return this.f17149d;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        Preconditions.i(i11, this.f17149d);
        Object obj = this.f17148c[i11];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean h() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17149d;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
