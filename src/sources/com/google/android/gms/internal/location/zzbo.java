package com.google.android.gms.internal.location;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzbo<E> extends zzbv<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11099b;

    public zzbo(int i11, int i12) {
        if (i12 < 0 || i12 > i11) {
            throw new IndexOutOfBoundsException(zzbm.c(i12, i11, "index"));
        }
        this.f11098a = i11;
        this.f11099b = i12;
    }

    public abstract Object a(int i11);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f11099b < this.f11098a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f11099b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f11099b;
        this.f11099b = i11 + 1;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f11099b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f11099b - 1;
        this.f11099b = i11;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f11099b - 1;
    }
}
