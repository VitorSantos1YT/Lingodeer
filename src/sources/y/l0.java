package y;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements gz.f, Set, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f56734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f56735b;

    public l0(j0 j0Var) {
        this.f56734a = j0Var;
        this.f56735b = j0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f56735b.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.m.f(elements, "elements");
        j0 j0Var = this.f56735b;
        int i11 = j0Var.f56723d;
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            j0Var.j(it.next());
        }
        return i11 != j0Var.f56723d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f56735b.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f56734a.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.m.f(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!this.f56734a.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l0.class != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.f56734a, ((l0) obj).f56734a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f56734a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f56734a.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new nz.k(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f56735b.l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.m.f(elements, "elements");
        j0 j0Var = this.f56735b;
        j0Var.getClass();
        int i11 = j0Var.f56723d;
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            j0Var.i(it.next());
        }
        return i11 != j0Var.f56723d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        boolean z11;
        kotlin.jvm.internal.m.f(elements, "elements");
        j0 j0Var = this.f56735b;
        j0Var.getClass();
        Object[] objArr = j0Var.f56721b;
        int i11 = j0Var.f56723d;
        long[] jArr = j0Var.f56720a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j11 = jArr[i12];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j11) < 128) {
                            int i15 = (i12 << 3) + i14;
                            if (!ry.m.i0(elements, objArr[i15])) {
                                j0Var.m(i15);
                            }
                        }
                        j11 >>= 8;
                    }
                    z11 = false;
                    if (i13 != 8) {
                        break;
                    }
                } else {
                    z11 = false;
                }
                if (i12 == length) {
                    break;
                }
                i12++;
            }
        } else {
            z11 = false;
        }
        if (i11 != j0Var.f56723d) {
            return true;
        }
        return z11;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f56734a.f56723d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.a(this);
    }

    public final String toString() {
        return this.f56734a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.m.f(array, "array");
        return kotlin.jvm.internal.k.b(this, array);
    }
}
