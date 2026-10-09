package com.google.android.gms.internal.fido;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzar extends zzcc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9643b;

    public zzar(int i11, int i12) {
        if (i12 < 0 || i12 > i11) {
            throw new IndexOutOfBoundsException(zzap.c(i12, i11, "index"));
        }
        this.f9642a = i11;
        this.f9643b = i12;
    }

    public abstract Object a(int i11);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f9643b < this.f9642a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9643b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f9643b;
        this.f9643b = i11 + 1;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9643b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f9643b - 1;
        this.f9643b = i11;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9643b - 1;
    }
}
