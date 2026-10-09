package hx;

import java.util.concurrent.atomic.AtomicInteger;
import uw.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends AtomicInteger implements bx.b, Runnable {
    private static final long serialVersionUID = 3880992722410194083L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f33856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f33857b;

    public j(k kVar, Object obj) {
        this.f33856a = kVar;
        this.f33857b = obj;
    }

    @Override // bx.g
    public final void clear() {
        lazySet(3);
    }

    @Override // ww.b
    public final void dispose() {
        set(3);
    }

    @Override // bx.g
    public final boolean isEmpty() {
        return get() != 1;
    }

    @Override // bx.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // bx.g
    public final Object poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.f33857b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            Object obj = this.f33857b;
            k kVar = this.f33856a;
            kVar.onNext(obj);
            if (get() == 2) {
                lazySet(3);
                kVar.onComplete();
            }
        }
    }
}
