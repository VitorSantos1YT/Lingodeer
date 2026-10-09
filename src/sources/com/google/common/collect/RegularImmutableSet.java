package com.google.common.collect;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class RegularImmutableSet<E> extends ImmutableSet<E> {
    public static final Object[] K;
    public static final RegularImmutableSet L;
    public final transient int H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f17170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f17171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f17172f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final transient int f17173t;

    static {
        Object[] objArr = new Object[0];
        K = objArr;
        L = new RegularImmutableSet(0, 0, 0, objArr, objArr);
    }

    public RegularImmutableSet(int i11, int i12, int i13, Object[] objArr, Object[] objArr2) {
        this.f17170d = objArr;
        this.f17171e = i11;
        this.f17172f = objArr2;
        this.f17173t = i12;
        this.H = i13;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f17172f;
            if (objArr.length != 0) {
                int iC = Hashing.c(obj);
                while (true) {
                    int i11 = iC & this.f17173t;
                    Object obj2 = objArr[i11];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iC = i11 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int d(int i11, Object[] objArr) {
        Object[] objArr2 = this.f17170d;
        int i12 = this.H;
        System.arraycopy(objArr2, 0, objArr, i11, i12);
        return i11 + i12;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] e() {
        return this.f17170d;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int f() {
        return this.H;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int g() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean h() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f17171e;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: j */
    public final UnmodifiableIterator iterator() {
        return b().listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableSet
    public final ImmutableList o() {
        return ImmutableList.k(this.H, this.f17170d);
    }

    @Override // com.google.common.collect.ImmutableSet
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.H;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
