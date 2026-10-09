package com.google.common.collect;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
class RegularImmutableAsList<E> extends ImmutableAsList<E> {
    @Override // com.google.common.collect.ImmutableAsList
    public final ImmutableCollection D() {
        return null;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public final int d(int i11, Object[] objArr) {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] e() {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int f() {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int g() {
        throw null;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableList, java.util.List
    public final ListIterator listIterator(int i11) {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableList
    /* JADX INFO: renamed from: r */
    public final UnmodifiableListIterator listIterator(int i11) {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableAsList, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
