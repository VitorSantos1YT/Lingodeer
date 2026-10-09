package com.google.android.play.integrity.internal;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class an extends aw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16242b;

    public an(int i11, int i12) {
        if (i12 < 0 || i12 > i11) {
            throw new IndexOutOfBoundsException(al.c(i12, i11, "index"));
        }
        this.f16241a = i11;
        this.f16242b = i12;
    }

    public abstract Object a(int i11);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f16242b < this.f16241a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f16242b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f16242b;
        this.f16242b = i11 + 1;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f16242b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f16242b - 1;
        this.f16242b = i11;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f16242b - 1;
    }
}
