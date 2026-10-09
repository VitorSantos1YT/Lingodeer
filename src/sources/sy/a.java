package sy;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;
import x1.p;
import x1.q;
import y.e0;
import y2.t;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements ListIterator, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f51926e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(t tVar, int i11, int i12) {
        this(tVar, (i12 & 1) != 0 ? 0 : i11, 0, tVar.f57003a.f56687b);
        this.f51922a = 3;
    }

    public void a() {
        if (((AbstractList) ((b) this.f51926e).f51931e).modCount != this.f51925d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f51922a) {
            case 0:
                a();
                b bVar = (b) this.f51926e;
                int i11 = this.f51923b;
                this.f51923b = i11 + 1;
                bVar.add(i11, obj);
                this.f51924c = -1;
                this.f51925d = ((AbstractList) bVar).modCount;
                return;
            case 1:
                b();
                c cVar = (c) this.f51926e;
                int i12 = this.f51923b;
                this.f51923b = i12 + 1;
                cVar.add(i12, obj);
                this.f51924c = -1;
                this.f51925d = ((AbstractList) cVar).modCount;
                return;
            case 2:
                c();
                p pVar = (p) this.f51926e;
                pVar.add(this.f51923b + 1, obj);
                this.f51924c = -1;
                this.f51923b++;
                this.f51925d = q.f(pVar);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public void b() {
        if (((AbstractList) ((c) this.f51926e)).modCount != this.f51925d) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (q.f((p) this.f51926e) != this.f51925d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f51922a) {
            case 0:
                return this.f51923b < ((b) this.f51926e).f51929c;
            case 1:
                return this.f51923b < ((c) this.f51926e).f51934b;
            case 2:
                return this.f51923b < ((p) this.f51926e).size() - 1;
            default:
                return this.f51923b < this.f51925d;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f51922a) {
            case 0:
                return this.f51923b > 0;
            case 1:
                return this.f51923b > 0;
            case 2:
                return this.f51923b >= 0;
            default:
                return this.f51923b > this.f51924c;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f51922a) {
            case 0:
                a();
                int i11 = this.f51923b;
                b bVar = (b) this.f51926e;
                if (i11 >= bVar.f51929c) {
                    throw new NoSuchElementException();
                }
                this.f51923b = i11 + 1;
                this.f51924c = i11;
                return bVar.f51927a[bVar.f51928b + i11];
            case 1:
                b();
                int i12 = this.f51923b;
                c cVar = (c) this.f51926e;
                if (i12 >= cVar.f51934b) {
                    throw new NoSuchElementException();
                }
                this.f51923b = i12 + 1;
                this.f51924c = i12;
                return cVar.f51933a[i12];
            case 2:
                c();
                int i13 = this.f51923b + 1;
                this.f51924c = i13;
                p pVar = (p) this.f51926e;
                q.a(i13, pVar.size());
                Object obj = pVar.get(i13);
                this.f51923b = i13;
                return obj;
            default:
                e0 e0Var = ((t) this.f51926e).f57003a;
                int i14 = this.f51923b;
                this.f51923b = i14 + 1;
                Object objF = e0Var.f(i14);
                m.d(objF, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (z1.q) objF;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f51922a) {
            case 0:
                return this.f51923b;
            case 1:
                return this.f51923b;
            case 2:
                return this.f51923b + 1;
            default:
                return this.f51923b - this.f51924c;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f51922a) {
            case 0:
                a();
                int i11 = this.f51923b;
                if (i11 <= 0) {
                    throw new NoSuchElementException();
                }
                int i12 = i11 - 1;
                this.f51923b = i12;
                this.f51924c = i12;
                b bVar = (b) this.f51926e;
                return bVar.f51927a[bVar.f51928b + i12];
            case 1:
                b();
                int i13 = this.f51923b;
                if (i13 <= 0) {
                    throw new NoSuchElementException();
                }
                int i14 = i13 - 1;
                this.f51923b = i14;
                this.f51924c = i14;
                return ((c) this.f51926e).f51933a[i14];
            case 2:
                c();
                int i15 = this.f51923b;
                p pVar = (p) this.f51926e;
                q.a(i15, pVar.size());
                int i16 = this.f51923b;
                this.f51924c = i16;
                Object obj = pVar.get(i16);
                this.f51923b--;
                return obj;
            default:
                e0 e0Var = ((t) this.f51926e).f57003a;
                int i17 = this.f51923b - 1;
                this.f51923b = i17;
                Object objF = e0Var.f(i17);
                m.d(objF, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (z1.q) objF;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i11;
        switch (this.f51922a) {
            case 0:
                i11 = this.f51923b;
                break;
            case 1:
                i11 = this.f51923b;
                break;
            case 2:
                return this.f51923b;
            default:
                i11 = this.f51923b - this.f51924c;
                break;
        }
        return i11 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f51922a) {
            case 0:
                b bVar = (b) this.f51926e;
                a();
                int i11 = this.f51924c;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                bVar.d(i11);
                this.f51923b = this.f51924c;
                this.f51924c = -1;
                this.f51925d = ((AbstractList) bVar).modCount;
                return;
            case 1:
                c cVar = (c) this.f51926e;
                b();
                int i12 = this.f51924c;
                if (i12 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                cVar.d(i12);
                this.f51923b = this.f51924c;
                this.f51924c = -1;
                this.f51925d = ((AbstractList) cVar).modCount;
                return;
            case 2:
                c();
                p pVar = (p) this.f51926e;
                pVar.remove(this.f51924c);
                this.f51923b--;
                this.f51924c = -1;
                this.f51925d = q.f(pVar);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f51922a) {
            case 0:
                a();
                int i11 = this.f51924c;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((b) this.f51926e).set(i11, obj);
                return;
            case 1:
                b();
                int i12 = this.f51924c;
                if (i12 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f51926e).set(i12, obj);
                return;
            case 2:
                p pVar = (p) this.f51926e;
                c();
                int i13 = this.f51924c;
                if (i13 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                pVar.set(i13, obj);
                this.f51925d = q.f(pVar);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(c cVar, int i11) {
        this.f51922a = 1;
        this.f51926e = cVar;
        this.f51923b = i11;
        this.f51924c = -1;
        this.f51925d = ((AbstractList) cVar).modCount;
    }

    public a(p pVar, int i11) {
        this.f51922a = 2;
        this.f51926e = pVar;
        this.f51923b = i11 - 1;
        this.f51924c = -1;
        this.f51925d = q.f(pVar);
    }

    public a(t tVar, int i11, int i12, int i13) {
        this.f51922a = 3;
        this.f51926e = tVar;
        this.f51923b = i11;
        this.f51924c = i12;
        this.f51925d = i13;
    }

    public a(b bVar, int i11) {
        this.f51922a = 0;
        this.f51926e = bVar;
        this.f51923b = i11;
        this.f51924c = -1;
        this.f51925d = ((AbstractList) bVar).modCount;
    }
}
