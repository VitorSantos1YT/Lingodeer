package y2;

import bw.ORXQ.ADSb;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import mf.sOm.txBUGYhC;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements List, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y.e0 f57003a = new y.e0(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y.z f57004b = new y.z(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f57005c = -1;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i11, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i11, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final long b() {
        long jA = f.a(Float.POSITIVE_INFINITY, false, false);
        int i11 = this.f57005c + 1;
        int iA = ns.o.A(this);
        if (i11 > iA) {
            return jA;
        }
        while (true) {
            y.z zVar = this.f57004b;
            if (i11 < 0) {
                zVar.getClass();
                break;
            }
            if (i11 >= zVar.f56791b) {
                break;
            }
            long j11 = zVar.f56790a[i11];
            if (f.h(j11, jA) < 0) {
                jA = j11;
            }
            if ((f.l(jA) < CropImageView.DEFAULT_ASPECT_RATIO && f.q(jA)) || i11 == iA) {
                return jA;
            }
            i11++;
        }
        z.a.d("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f57005c = -1;
        this.f57003a.d();
        this.f57004b.f56791b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof z1.q) && indexOf((z1.q) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((z1.q) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        Object objF = this.f57003a.f(i11);
        kotlin.jvm.internal.m.d(objF, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (z1.q) objF;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof z1.q)) {
            return -1;
        }
        z1.q qVar = (z1.q) obj;
        int iA = ns.o.A(this);
        if (iA >= 0) {
            int i11 = 0;
            while (!kotlin.jvm.internal.m.a(this.f57003a.f(i11), qVar)) {
                if (i11 != iA) {
                    i11++;
                }
            }
            return i11;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f57003a.h();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new sy.a(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof z1.q)) {
            return -1;
        }
        z1.q qVar = (z1.q) obj;
        for (int iA = ns.o.A(this); -1 < iA; iA--) {
            if (kotlin.jvm.internal.m.a(this.f57003a.f(iA), qVar)) {
                return iA;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new sy.a(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        throw new UnsupportedOperationException(ADSb.HMQYEKmjLejpH);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f57003a.f56687b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i11, int i12) {
        return new s(this, i11, i12);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void d(int i11, int i12) {
        if (i11 >= i12) {
            return;
        }
        this.f57003a.l(i11, i12);
        y.z zVar = this.f57004b;
        if (i11 >= 0) {
            int i13 = zVar.f56791b;
            if (i11 <= i13 && i12 >= 0 && i12 <= i13) {
                if (i12 < i11) {
                    z.a.c(txBUGYhC.VkRPvakpnin);
                    throw null;
                }
                if (i12 != i11) {
                    if (i12 < i13) {
                        long[] jArr = zVar.f56790a;
                        ry.l.J(jArr, jArr, i11, i12, i13);
                    }
                    zVar.f56791b -= i12 - i11;
                    return;
                }
                return;
            }
        } else {
            zVar.getClass();
        }
        z.a.d("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i11) {
        return new sy.a(this, i11, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.k.b(this, objArr);
    }
}
