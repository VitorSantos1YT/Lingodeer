package y;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements gz.f, Set, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f56710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f56711b;

    public h0(f0 parent) {
        kotlin.jvm.internal.m.f(parent, "parent");
        this.f56710a = parent;
        this.f56711b = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f56711b.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.m.f(elements, "elements");
        f0 f0Var = this.f56711b;
        f0Var.getClass();
        int i11 = f0Var.f56698g;
        for (Object obj : elements) {
            int iD = f0Var.d(obj);
            f0Var.f56693b[iD] = obj;
            long[] jArr = f0Var.f56694c;
            int i12 = f0Var.f56695d;
            jArr[iD] = (((long) i12) & 2147483647L) | 4611686016279904256L;
            if (i12 != Integer.MAX_VALUE) {
                jArr[i12] = ((((long) iD) & 2147483647L) << 31) | (jArr[i12] & (-4611686016279904257L));
            }
            f0Var.f56695d = iD;
            if (f0Var.f56696e == Integer.MAX_VALUE) {
                f0Var.f56696e = iD;
            }
        }
        return i11 != f0Var.f56698g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f56711b.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f56710a.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.m.f(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!this.f56710a.c(it.next())) {
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
        if (obj == null || h0.class != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.f56710a, ((h0) obj).f56710a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f56710a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f56710a.f56698g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new nz.k(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f56711b.g(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection elements) {
        int iNumberOfTrailingZeros;
        kotlin.jvm.internal.m.f(elements, "elements");
        f0 f0Var = this.f56711b;
        f0Var.getClass();
        int i11 = f0Var.f56698g;
        Iterator it = elements.iterator();
        while (true) {
            int i12 = 1;
            int i13 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i14 = iHashCode ^ (iHashCode << 16);
            int i15 = i14 & 127;
            int i16 = f0Var.f56697f;
            int i17 = (i14 >>> 7) & i16;
            while (true) {
                long[] jArr = f0Var.f56692a;
                int i18 = i17 >> 3;
                int i19 = (i17 & 7) << 3;
                int i21 = i12;
                int i22 = i13;
                long j11 = (((-i19) >> 63) & (jArr[i18 + i12] << (64 - i19))) | (jArr[i18] >>> i19);
                long j12 = (((long) i15) * 72340172838076673L) ^ j11;
                long j13 = -9187201950435737472L;
                long j14 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
                while (j14 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i17) & i16;
                    long j15 = j13;
                    if (kotlin.jvm.internal.m.a(f0Var.f56693b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j14 &= j14 - 1;
                    j13 = j15;
                }
                if ((j11 & ((~j11) << 6) & j13) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i13 = i22 + 8;
                i17 = (i17 + i13) & i16;
                i12 = i21;
            }
            if (iNumberOfTrailingZeros >= 0) {
                f0Var.h(iNumberOfTrailingZeros);
            }
        }
        return i11 != f0Var.f56698g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.m.f(elements, "elements");
        return this.f56711b.i(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f56710a.f56698g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.a(this);
    }

    public final String toString() {
        return this.f56710a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.m.f(array, "array");
        return kotlin.jvm.internal.k.b(this, array);
    }
}
