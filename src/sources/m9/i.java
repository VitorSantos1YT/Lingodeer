package m9;

import j9.q;
import java.util.Iterator;
import java.util.NoSuchElementException;
import y.s;
import y.u0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Iterator, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41097a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a.a f41099c;

    public i(a.a aVar) {
        this.f41099c = aVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41097a + 1 < ((u0) this.f41099c.f7d).h();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f41098b = true;
        u0 u0Var = (u0) this.f41099c.f7d;
        int i11 = this.f41097a + 1;
        this.f41097a = i11;
        return (q) u0Var.i(i11);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f41098b) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        u0 u0Var = (u0) this.f41099c.f7d;
        ((q) u0Var.i(this.f41097a)).f36243c = null;
        int i11 = this.f41097a;
        Object[] objArr = u0Var.f56772c;
        Object obj = objArr[i11];
        Object obj2 = s.f56759c;
        if (obj != obj2) {
            objArr[i11] = obj2;
            u0Var.f56770a = true;
        }
        this.f41097a = i11 - 1;
        this.f41098b = false;
    }
}
