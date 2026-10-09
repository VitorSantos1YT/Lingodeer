package w2;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements Collection, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54575a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f54576b;

    public r1() {
        int i11 = y.q0.f56751a;
        this.f54576b = new y.f0(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f54575a) {
            case 0:
                return ((y.f0) this.f54576b).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f54575a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f54575a) {
            case 0:
                ((y.f0) this.f54576b).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f54575a) {
            case 0:
                return ((y.f0) this.f54576b).c(obj);
            default:
                return ((y.i0) this.f54576b).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        switch (this.f54575a) {
            case 0:
                Iterator it = elements.iterator();
                while (it.hasNext()) {
                    if (!((y.f0) this.f54576b).c(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                kotlin.jvm.internal.m.f(elements, "elements");
                Collection collection = elements;
                if (collection.isEmpty()) {
                    return true;
                }
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!((y.i0) this.f54576b).d(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f54575a) {
            case 0:
                return ((y.f0) this.f54576b).f56698g == 0;
            default:
                return ((y.i0) this.f54576b).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f54575a) {
            case 0:
                y.f0 f0Var = (y.f0) this.f54576b;
                f0Var.getClass();
                return new nz.k(new y.h0(f0Var));
            default:
                return v10.c.B(new n1.g(this, null, 3));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f54575a) {
            case 0:
                return ((y.f0) this.f54576b).g(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f54575a) {
            case 0:
                return ((y.f0) this.f54576b).g(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f54575a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f54575a) {
            case 0:
                return ((y.f0) this.f54576b).i(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.f54575a) {
            case 0:
                return ((y.f0) this.f54576b).f56698g;
            default:
                return ((y.i0) this.f54576b).f56717e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f54575a) {
            case 0:
                break;
        }
        return kotlin.jvm.internal.k.a(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        switch (this.f54575a) {
            case 0:
                break;
            default:
                kotlin.jvm.internal.m.f(array, "array");
                break;
        }
        return kotlin.jvm.internal.k.b(this, array);
    }

    public r1(y.i0 parent) {
        kotlin.jvm.internal.m.f(parent, "parent");
        this.f54576b = parent;
    }
}
