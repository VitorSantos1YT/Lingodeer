package nz;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements Iterator, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f44319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f44321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f44322e;

    public g(i iVar) {
        this.f44318a = 1;
        this.f44322e = iVar;
        this.f44319b = iVar.f44324a.iterator();
        this.f44320c = -1;
    }

    public void a() {
        Object next;
        i iVar = (i) this.f44322e;
        do {
            Iterator it = this.f44319b;
            if (!it.hasNext()) {
                this.f44320c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) iVar.f44326c.invoke(next)).booleanValue() != iVar.f44325b);
        this.f44321d = next;
        this.f44320c = 1;
    }

    public void b() {
        Iterator it = this.f44319b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((c) this.f44322e).f44311c.invoke(next)).booleanValue()) {
                this.f44320c = 1;
                this.f44321d = next;
                return;
            }
        }
        this.f44320c = 0;
    }

    public void c() {
        Object next;
        do {
            Iterator it = this.f44319b;
            if (!it.hasNext()) {
                this.f44320c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((c) this.f44322e).f44311c.invoke(next)).booleanValue());
        this.f44321d = next;
        this.f44320c = 1;
    }

    public boolean d() {
        Iterator it;
        Iterator it2 = (Iterator) this.f44321d;
        if (it2 != null && it2.hasNext()) {
            this.f44320c = 1;
            return true;
        }
        do {
            Iterator it3 = this.f44319b;
            if (!it3.hasNext()) {
                this.f44320c = 2;
                this.f44321d = null;
                return false;
            }
            Object next = it3.next();
            j jVar = (j) this.f44322e;
            it = (Iterator) jVar.f44329c.invoke(jVar.f44328b.invoke(next));
        } while (!it.hasNext());
        this.f44321d = it;
        this.f44320c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f44318a) {
            case 0:
                if (this.f44320c == -1) {
                    c();
                }
                return this.f44320c == 1 || this.f44319b.hasNext();
            case 1:
                if (this.f44320c == -1) {
                    a();
                }
                return this.f44320c == 1;
            case 2:
                int i11 = this.f44320c;
                if (i11 == 1) {
                    return true;
                }
                if (i11 == 2) {
                    return false;
                }
                return d();
            default:
                if (this.f44320c == -1) {
                    b();
                }
                return this.f44320c == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f44318a) {
            case 0:
                if (this.f44320c == -1) {
                    c();
                }
                if (this.f44320c != 1) {
                    return this.f44319b.next();
                }
                Object obj = this.f44321d;
                this.f44321d = null;
                this.f44320c = 0;
                return obj;
            case 1:
                if (this.f44320c == -1) {
                    a();
                }
                if (this.f44320c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f44321d;
                this.f44321d = null;
                this.f44320c = -1;
                return obj2;
            case 2:
                int i11 = this.f44320c;
                if (i11 == 2) {
                    throw new NoSuchElementException();
                }
                if (i11 == 0 && !d()) {
                    throw new NoSuchElementException();
                }
                this.f44320c = 0;
                Iterator it = (Iterator) this.f44321d;
                kotlin.jvm.internal.m.c(it);
                return it.next();
            default:
                if (this.f44320c == -1) {
                    b();
                }
                if (this.f44320c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.f44321d;
                this.f44321d = null;
                this.f44320c = -1;
                return obj3;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f44318a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(j jVar) {
        this.f44318a = 2;
        this.f44322e = jVar;
        this.f44319b = jVar.f44327a.iterator();
    }

    public g(c cVar, byte b3) {
        this.f44318a = 3;
        this.f44322e = cVar;
        this.f44319b = cVar.f44310b.iterator();
        this.f44320c = -1;
    }

    public g(c cVar) {
        this.f44318a = 0;
        this.f44322e = cVar;
        this.f44319b = cVar.f44310b.iterator();
        this.f44320c = -1;
    }
}
