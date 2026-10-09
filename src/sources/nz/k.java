package nz;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import y.g0;
import y.h0;
import y.k0;
import y.l0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements Iterator, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f44332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f44333d;

    public k(Object obj, Map map) {
        this.f44330a = 2;
        this.f44332c = obj;
        this.f44333d = map;
    }

    public void a() {
        Object objInvoke;
        cz.i iVar = (cz.i) this.f44333d;
        if (this.f44331b == -2) {
            objInvoke = ((fz.a) iVar.f22619b).invoke();
        } else {
            fz.c cVar = (fz.c) iVar.f22620c;
            Object obj = this.f44332c;
            kotlin.jvm.internal.m.c(obj);
            objInvoke = cVar.invoke(obj);
        }
        this.f44332c = objInvoke;
        this.f44331b = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f44330a) {
            case 0:
                if (this.f44331b < 0) {
                    a();
                }
                return this.f44331b == 1;
            case 1:
                r rVar = (r) this.f44333d;
                Iterator it = (Iterator) this.f44332c;
                while (this.f44331b < rVar.f44343b && it.hasNext()) {
                    it.next();
                    this.f44331b++;
                }
                return this.f44331b < rVar.f44344c && it.hasNext();
            case 2:
                return this.f44331b < ((Map) this.f44333d).size();
            case 3:
                return ((m) this.f44332c).hasNext();
            default:
                return ((m) this.f44332c).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f44330a) {
            case 0:
                if (this.f44331b < 0) {
                    a();
                }
                if (this.f44331b == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f44332c;
                kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f44331b = -1;
                return obj;
            case 1:
                r rVar = (r) this.f44333d;
                Iterator it = (Iterator) this.f44332c;
                while (this.f44331b < rVar.f44343b && it.hasNext()) {
                    it.next();
                    this.f44331b++;
                }
                int i11 = this.f44331b;
                if (i11 >= rVar.f44344c) {
                    throw new NoSuchElementException();
                }
                this.f44331b = i11 + 1;
                return it.next();
            case 2:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f44332c;
                this.f44331b++;
                Object obj3 = ((Map) this.f44333d).get(obj2);
                if (obj3 != null) {
                    this.f44332c = ((r1.a) obj3).f48736b;
                    return obj2;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
            case 3:
                return ((m) this.f44332c).next();
            default:
                return ((m) this.f44332c).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f44330a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                int i11 = this.f44331b;
                if (i11 != -1) {
                    ((h0) this.f44333d).f56711b.h(i11);
                    this.f44331b = -1;
                    return;
                }
                return;
            default:
                int i12 = this.f44331b;
                if (i12 != -1) {
                    ((l0) this.f44333d).f56735b.m(i12);
                    this.f44331b = -1;
                    return;
                }
                return;
        }
    }

    public k(r rVar) {
        this.f44330a = 1;
        this.f44333d = rVar;
        this.f44332c = rVar.f44342a.iterator();
    }

    public k(cz.i iVar) {
        this.f44330a = 0;
        this.f44333d = iVar;
        this.f44331b = -2;
    }

    public k(l0 l0Var) {
        this.f44330a = 4;
        this.f44333d = l0Var;
        this.f44331b = -1;
        this.f44332c = v10.c.B(new k0(l0Var, this, null));
    }

    public k(h0 h0Var) {
        this.f44330a = 3;
        this.f44333d = h0Var;
        this.f44331b = -1;
        this.f44332c = v10.c.B(new g0(h0Var, this, null));
    }
}
