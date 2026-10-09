package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzab<E> extends zzaz<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9780b;

    public zzab(int i11, int i12) {
        zzu.d(i12, i11);
        this.f9779a = i11;
        this.f9780b = i12;
    }

    public abstract Object a(int i11);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f9780b < this.f9779a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9780b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f9780b;
        this.f9780b = i11 + 1;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9780b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f9780b - 1;
        this.f9780b = i11;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9780b - 1;
    }
}
