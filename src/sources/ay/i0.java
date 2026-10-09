package ay;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i0 extends AtomicInteger implements iy.a, Runnable {
    private static final long serialVersionUID = 3880992722410194083L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qx.k f3327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3328b;

    public i0(qx.k kVar, Object obj) {
        this.f3327a = kVar;
        this.f3328b = obj;
    }

    @Override // iy.b
    public final int a(int i11) {
        lazySet(1);
        return 1;
    }

    @Override // rx.b
    public final boolean b() {
        return get() == 3;
    }

    @Override // iy.f
    public final void clear() {
        lazySet(3);
    }

    @Override // rx.b
    public final void dispose() {
        set(3);
    }

    @Override // iy.f
    public final boolean isEmpty() {
        return get() != 1;
    }

    @Override // iy.f
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // iy.f
    public final Object poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.f3328b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            Object obj = this.f3328b;
            qx.k kVar = this.f3327a;
            kVar.onNext(obj);
            if (get() == 2) {
                lazySet(3);
                kVar.onComplete();
            }
        }
    }
}
