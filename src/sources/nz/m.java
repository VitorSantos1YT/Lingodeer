package nz;

import java.util.Iterator;
import java.util.NoSuchElementException;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements Iterator, vy.d, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f44335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f44336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public vy.d f44337d;

    public final RuntimeException b() {
        int i11 = this.f44334a;
        if (i11 == 4) {
            return new NoSuchElementException();
        }
        if (i11 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f44334a);
    }

    public final wy.a c(Object obj, vy.d frame) {
        this.f44335b = obj;
        this.f44334a = 3;
        this.f44337d = frame;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        kotlin.jvm.internal.m.f(frame, "frame");
        return aVar;
    }

    @Override // vy.d
    public final vy.i getContext() {
        return vy.j.f54321a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i11 = this.f44334a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2 || i11 == 3) {
                        return true;
                    }
                    if (i11 == 4) {
                        return false;
                    }
                    throw b();
                }
                Iterator it = this.f44336c;
                kotlin.jvm.internal.m.c(it);
                if (it.hasNext()) {
                    this.f44334a = 2;
                    return true;
                }
                this.f44336c = null;
            }
            this.f44334a = 5;
            vy.d dVar = this.f44337d;
            kotlin.jvm.internal.m.c(dVar);
            this.f44337d = null;
            dVar.resumeWith(b0.f48488a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i11 = this.f44334a;
        if (i11 == 0 || i11 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i11 == 2) {
            this.f44334a = 1;
            Iterator it = this.f44336c;
            kotlin.jvm.internal.m.c(it);
            return it.next();
        }
        if (i11 != 3) {
            throw b();
        }
        this.f44334a = 0;
        Object obj = this.f44335b;
        this.f44335b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // vy.d
    public final void resumeWith(Object obj) {
        com.bumptech.glide.e.F(obj);
        this.f44334a = 4;
    }
}
