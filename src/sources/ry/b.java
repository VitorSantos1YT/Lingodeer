package ry;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements Iterator, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f50830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f50831b;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i11 = this.f50830a;
        if (i11 == 0) {
            this.f50830a = 3;
            a();
            return this.f50830a == 1;
        }
        if (i11 == 1) {
            return true;
        }
        if (i11 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i11 = this.f50830a;
        if (i11 == 1) {
            this.f50830a = 0;
            return this.f50831b;
        }
        if (i11 != 2) {
            this.f50830a = 3;
            a();
            if (this.f50830a == 1) {
                this.f50830a = 0;
                return this.f50831b;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
