package l1;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements Iterator, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2 f39365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39368d;

    public n0(m2 m2Var, int i11, int i12) {
        this.f39365a = m2Var;
        this.f39366b = i12;
        this.f39367c = i11;
        this.f39368d = m2Var.H;
        if (m2Var.f39364t) {
            o2.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39367c < this.f39366b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        m2 m2Var = this.f39365a;
        int i11 = m2Var.H;
        int i12 = this.f39368d;
        if (i11 != i12) {
            o2.f();
        }
        int i13 = this.f39367c;
        this.f39367c = o2.a(m2Var.f39358a, i13) + i13;
        return new n2(m2Var, i13, i12);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
