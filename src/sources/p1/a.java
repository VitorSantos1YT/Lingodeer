package p1;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements ListIterator, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46248b;

    public a(int i11, int i12) {
        this.f46247a = i11;
        this.f46248b = i12;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f46247a < this.f46248b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f46247a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f46247a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f46247a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
