package fy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends a {
    private static final long serialVersionUID = -2151279923272604993L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n20.b f28278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f28279b;

    public b(n20.b bVar) {
        this.f28278a = bVar;
    }

    @Override // iy.b
    public final int a(int i11) {
        lazySet(8);
        return 2;
    }

    @Override // n20.c
    public final void cancel() {
        set(4);
        this.f28279b = null;
    }

    @Override // iy.f
    public final void clear() {
        lazySet(32);
        this.f28279b = null;
    }

    @Override // iy.f
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // iy.f
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.f28279b;
        this.f28279b = null;
        return obj;
    }

    @Override // n20.c
    public final void request(long j11) {
        Object obj;
        if (c.c(j11)) {
            do {
                int i11 = get();
                if ((i11 & (-2)) != 0) {
                    return;
                }
                if (i11 == 1) {
                    if (!compareAndSet(1, 3) || (obj = this.f28279b) == null) {
                        return;
                    }
                    this.f28279b = null;
                    n20.b bVar = this.f28278a;
                    bVar.onNext(obj);
                    if (get() != 4) {
                        bVar.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }
}
