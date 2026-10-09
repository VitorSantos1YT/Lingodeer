package n1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.m;
import ns.o;
import ry.l;
import y.e0;
import y.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements List, gz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f43104b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f43103a = i11;
        this.f43104b = obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f43103a) {
            case 0:
                ((e) this.f43104b).c(obj);
                break;
            default:
                ((e0) this.f43104b).a(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i11, Collection elements) {
        switch (this.f43103a) {
            case 0:
                return ((e) this.f43104b).f(i11, elements);
            default:
                m.f(elements, "elements");
                e0 e0Var = (e0) this.f43104b;
                if (i11 < 0 || i11 > e0Var.f56687b) {
                    StringBuilder sbI = w4.c.i(i11, "Index ", " must be in 0..");
                    sbI.append(e0Var.f56687b);
                    z.a.d(sbI.toString());
                    throw null;
                }
                int i12 = 0;
                if (elements.isEmpty()) {
                    return false;
                }
                int size = elements.size() + e0Var.f56687b;
                Object[] objArr = e0Var.f56686a;
                if (objArr.length < size) {
                    e0Var.m(size, objArr);
                }
                Object[] objArr2 = e0Var.f56686a;
                if (i11 != e0Var.f56687b) {
                    l.G(elements.size() + i11, i11, e0Var.f56687b, objArr2, objArr2);
                }
                for (Object obj : elements) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        o.V();
                        throw null;
                    }
                    objArr2[i12 + i11] = obj;
                    i12 = i13;
                }
                e0Var.f56687b = elements.size() + e0Var.f56687b;
                return true;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.f43103a) {
            case 0:
                ((e) this.f43104b).h();
                break;
            default:
                ((e0) this.f43104b).d();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f43103a) {
            case 0:
                return ((e) this.f43104b).i(obj);
            default:
                return ((e0) this.f43104b).g(obj) >= 0;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection elements) {
        switch (this.f43103a) {
            case 0:
                e eVar = (e) this.f43104b;
                eVar.getClass();
                Iterator it = elements.iterator();
                while (it.hasNext()) {
                    if (!eVar.i(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                m.f(elements, "elements");
                e0 e0Var = (e0) this.f43104b;
                Iterator it2 = elements.iterator();
                while (it2.hasNext()) {
                    if (e0Var.g(it2.next()) < 0) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i11) {
        switch (this.f43103a) {
            case 0:
                f.a(i11, this);
                return ((e) this.f43104b).f43112a[i11];
            default:
                o0.a(i11, this);
                return ((e0) this.f43104b).f(i11);
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f43103a) {
            case 0:
                return ((e) this.f43104b).j(obj);
            default:
                return ((e0) this.f43104b).g(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f43103a) {
            case 0:
                return ((e) this.f43104b).f43114c == 0;
            default:
                return ((e0) this.f43104b).h();
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f43103a) {
            case 0:
                return new d(0, 0, this);
            default:
                return new d(0, 1, this);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i11;
        switch (this.f43103a) {
            case 0:
                e eVar = (e) this.f43104b;
                Object[] objArr = eVar.f43112a;
                for (int i12 = eVar.f43114c - 1; i12 >= 0; i12--) {
                    if (m.a(obj, objArr[i12])) {
                        return i12;
                    }
                }
                return -1;
            default:
                e0 e0Var = (e0) this.f43104b;
                if (obj == null) {
                    Object[] objArr2 = e0Var.f56686a;
                    i11 = e0Var.f56687b - 1;
                    while (-1 < i11) {
                        if (objArr2[i11] != null) {
                            i11--;
                        }
                    }
                    return -1;
                }
                Object[] objArr3 = e0Var.f56686a;
                i11 = e0Var.f56687b - 1;
                while (-1 < i11) {
                    if (!obj.equals(objArr3[i11])) {
                        i11--;
                    }
                }
                return -1;
                return i11;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f43103a) {
            case 0:
                return new d(0, 0, this);
            default:
                return new d(0, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f43103a) {
            case 0:
                return ((e) this.f43104b).k(obj);
            default:
                return ((e0) this.f43104b).j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection elements) {
        switch (this.f43103a) {
            case 0:
                e eVar = (e) this.f43104b;
                eVar.getClass();
                if (!elements.isEmpty()) {
                    int i11 = eVar.f43114c;
                    Iterator it = elements.iterator();
                    while (it.hasNext()) {
                        eVar.k(it.next());
                    }
                    if (i11 != eVar.f43114c) {
                        return true;
                    }
                }
                return false;
            default:
                m.f(elements, "elements");
                e0 e0Var = (e0) this.f43104b;
                e0Var.getClass();
                int i12 = e0Var.f56687b;
                Iterator it2 = elements.iterator();
                while (it2.hasNext()) {
                    e0Var.j(it2.next());
                }
                return i12 != e0Var.f56687b;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection elements) {
        switch (this.f43103a) {
            case 0:
                e eVar = (e) this.f43104b;
                int i11 = eVar.f43114c;
                for (int i12 = i11 - 1; -1 < i12; i12--) {
                    if (!elements.contains(eVar.f43112a[i12])) {
                        eVar.l(i12);
                    }
                }
                return i11 != eVar.f43114c;
            default:
                m.f(elements, "elements");
                e0 e0Var = (e0) this.f43104b;
                e0Var.getClass();
                int i13 = e0Var.f56687b;
                Object[] objArr = e0Var.f56686a;
                for (int i14 = i13 - 1; -1 < i14; i14--) {
                    if (!elements.contains(objArr[i14])) {
                        e0Var.k(i14);
                    }
                }
                return i13 != e0Var.f56687b;
        }
    }

    @Override // java.util.List
    public final Object set(int i11, Object obj) {
        switch (this.f43103a) {
            case 0:
                f.a(i11, this);
                Object[] objArr = ((e) this.f43104b).f43112a;
                Object obj2 = objArr[i11];
                objArr[i11] = obj;
                return obj2;
            default:
                o0.a(i11, this);
                e0 e0Var = (e0) this.f43104b;
                if (i11 < 0 || i11 >= e0Var.f56687b) {
                    e0Var.n(i11);
                    throw null;
                }
                Object[] objArr2 = e0Var.f56686a;
                Object obj3 = objArr2[i11];
                objArr2[i11] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        switch (this.f43103a) {
            case 0:
                return ((e) this.f43104b).f43114c;
            default:
                return ((e0) this.f43104b).f56687b;
        }
    }

    @Override // java.util.List
    public final List subList(int i11, int i12) {
        switch (this.f43103a) {
            case 0:
                f.b(i11, i12, this);
                return new c(this, i11, i12, 0);
            default:
                o0.b(i11, i12, this);
                return new c(this, i11, i12, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f43103a) {
            case 0:
                break;
        }
        return k.a(this);
    }

    @Override // java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        switch (this.f43103a) {
            case 0:
                ((e) this.f43104b).b(i11, obj);
                return;
            default:
                e0 e0Var = (e0) this.f43104b;
                if (i11 >= 0 && i11 <= (i12 = e0Var.f56687b)) {
                    int i13 = i12 + 1;
                    Object[] objArr = e0Var.f56686a;
                    if (objArr.length < i13) {
                        e0Var.m(i13, objArr);
                    }
                    Object[] objArr2 = e0Var.f56686a;
                    int i14 = e0Var.f56687b;
                    if (i11 != i14) {
                        l.G(i11 + 1, i11, i14, objArr2, objArr2);
                    }
                    objArr2[i11] = obj;
                    e0Var.f56687b++;
                    return;
                }
                StringBuilder sbI = w4.c.i(i11, "Index ", " must be in 0..");
                sbI.append(e0Var.f56687b);
                z.a.d(sbI.toString());
                throw null;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i11) {
        switch (this.f43103a) {
            case 0:
                return new d(i11, 0, this);
            default:
                return new d(i11, 1, this);
        }
    }

    @Override // java.util.List
    public final Object remove(int i11) {
        switch (this.f43103a) {
            case 0:
                f.a(i11, this);
                return ((e) this.f43104b).l(i11);
            default:
                o0.a(i11, this);
                return ((e0) this.f43104b).k(i11);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] array) {
        switch (this.f43103a) {
            case 0:
                break;
            default:
                m.f(array, "array");
                break;
        }
        return k.b(this, array);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection elements) {
        switch (this.f43103a) {
            case 0:
                e eVar = (e) this.f43104b;
                return eVar.f(eVar.f43114c, elements);
            default:
                m.f(elements, "elements");
                e0 e0Var = (e0) this.f43104b;
                int i11 = e0Var.f56687b;
                Iterator it = elements.iterator();
                while (it.hasNext()) {
                    e0Var.a(it.next());
                }
                return i11 != e0Var.f56687b;
        }
    }
}
