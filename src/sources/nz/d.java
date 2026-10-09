package nz;

import java.util.Iterator;
import java.util.NoSuchElementException;
import ry.v;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements Iterator, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44312a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Iterator f44314c;

    public d(Iterator iterator) {
        kotlin.jvm.internal.m.f(iterator, "iterator");
        this.f44314c = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f44312a) {
            case 0:
                break;
            case 1:
                return this.f44313b > 0 && this.f44314c.hasNext();
            default:
                return this.f44314c.hasNext();
        }
        while (true) {
            int i11 = this.f44313b;
            it = this.f44314c;
            if (i11 > 0 && it.hasNext()) {
                it.next();
                this.f44313b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f44312a) {
            case 0:
                break;
            case 1:
                int i11 = this.f44313b;
                if (i11 == 0) {
                    throw new NoSuchElementException();
                }
                this.f44313b = i11 - 1;
                return this.f44314c.next();
            default:
                int i12 = this.f44313b;
                this.f44313b = i12 + 1;
                if (i12 >= 0) {
                    return new v(i12, this.f44314c.next());
                }
                ns.o.V();
                throw null;
        }
        while (true) {
            int i13 = this.f44313b;
            it = this.f44314c;
            if (i13 > 0 && it.hasNext()) {
                it.next();
                this.f44313b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f44312a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(e eVar, byte b3) {
        this.f44313b = eVar.f44317c;
        this.f44314c = eVar.f44316b.iterator();
    }

    public d(e eVar) {
        this.f44314c = eVar.f44316b.iterator();
        this.f44313b = eVar.f44317c;
    }
}
