package ry;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends e00.i implements ListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f50836d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, int i11) {
        super(eVar, 6);
        this.f50836d = eVar;
        int iB = eVar.b();
        if (i11 < 0 || i11 > iB) {
            throw new IndexOutOfBoundsException(nv.p.p("index: ", i11, iB, ", size: "));
        }
        this.f24694b = i11;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f24694b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f24694b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f24694b - 1;
        this.f24694b = i11;
        return this.f50836d.get(i11);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f24694b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
