package l2;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Iterator, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39602a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f39603b;

    public f0(q1.e eVar) {
        q1.m[] mVarArr = new q1.m[8];
        for (int i11 = 0; i11 < 8; i11++) {
            mVarArr[i11] = new q1.o(this);
        }
        this.f39603b = new q1.f(eVar, mVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f39602a) {
            case 0:
                return this.f39603b.hasNext();
            default:
                return ((q1.f) this.f39603b).f47365c;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f39602a) {
            case 0:
                return (i0) this.f39603b.next();
            default:
                return (Map.Entry) ((q1.f) this.f39603b).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f39602a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((q1.f) this.f39603b).remove();
                return;
        }
    }

    public f0(g0 g0Var) {
        this.f39603b = g0Var.L.iterator();
    }
}
