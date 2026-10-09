package ry;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y implements ListIterator, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50859a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f50860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f50861c;

    public y(oz.j jVar, int i11) {
        this.f50861c = jVar;
        this.f50860b = ((List) jVar.f46166b).listIterator(m.b0(i11, jVar));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f50859a) {
            case 0:
                ListIterator listIterator = (ListIterator) this.f50860b;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f50859a) {
            case 0:
                return ((ListIterator) this.f50860b).hasPrevious();
            case 1:
                return ((ListIterator) this.f50860b).hasPrevious();
            default:
                return ((kotlin.jvm.internal.w) this.f50860b).f38359a < ((x1.b0) this.f50861c).f55651d - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f50859a) {
            case 0:
                return ((ListIterator) this.f50860b).hasNext();
            case 1:
                return ((ListIterator) this.f50860b).hasNext();
            default:
                return ((kotlin.jvm.internal.w) this.f50860b).f38359a >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f50859a) {
            case 0:
                return ((ListIterator) this.f50860b).previous();
            case 1:
                return ((ListIterator) this.f50860b).previous();
            default:
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.f50860b;
                int i11 = wVar.f38359a + 1;
                x1.b0 b0Var = (x1.b0) this.f50861c;
                x1.q.a(i11, b0Var.f55651d);
                wVar.f38359a = i11;
                return b0Var.get(i11);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f50859a) {
            case 0:
                z zVar = (z) this.f50861c;
                return ns.o.A(zVar) - ((ListIterator) this.f50860b).previousIndex();
            case 1:
                oz.j jVar = (oz.j) this.f50861c;
                return ns.o.A(jVar) - ((ListIterator) this.f50860b).previousIndex();
            default:
                return ((kotlin.jvm.internal.w) this.f50860b).f38359a + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f50859a) {
            case 0:
                return ((ListIterator) this.f50860b).next();
            case 1:
                return ((ListIterator) this.f50860b).next();
            default:
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.f50860b;
                int i11 = wVar.f38359a;
                x1.b0 b0Var = (x1.b0) this.f50861c;
                x1.q.a(i11, b0Var.f55651d);
                wVar.f38359a = i11 - 1;
                return b0Var.get(i11);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f50859a) {
            case 0:
                z zVar = (z) this.f50861c;
                return ns.o.A(zVar) - ((ListIterator) this.f50860b).nextIndex();
            case 1:
                oz.j jVar = (oz.j) this.f50861c;
                return ns.o.A(jVar) - ((ListIterator) this.f50860b).nextIndex();
            default:
                return ((kotlin.jvm.internal.w) this.f50860b).f38359a;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f50859a) {
            case 0:
                ((ListIterator) this.f50860b).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f50859a) {
            case 0:
                ((ListIterator) this.f50860b).set(obj);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public y(z zVar, int i11) {
        this.f50861c = zVar;
        this.f50860b = zVar.f50862a.listIterator(m.b0(i11, zVar));
    }

    public y(kotlin.jvm.internal.w wVar, x1.b0 b0Var) {
        this.f50860b = wVar;
        this.f50861c = b0Var;
    }
}
