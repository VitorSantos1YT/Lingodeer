package mx;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends a {
    private static final long serialVersionUID = -2151279923272604993L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n20.b f42879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f42880b;

    public c(n20.b bVar) {
        this.f42879a = bVar;
    }

    @Override // bx.c
    public final int a(int i11) {
        lazySet(8);
        return 2;
    }

    @Override // bx.g
    public final void clear() {
        lazySet(32);
        this.f42880b = null;
    }

    public final void e(Object obj) {
        int i11 = get();
        do {
            n20.b bVar = this.f42879a;
            if (i11 == 8) {
                this.f42880b = obj;
                lazySet(16);
                bVar.onNext(obj);
                if (get() != 4) {
                    bVar.onComplete();
                    return;
                }
                return;
            }
            if ((i11 & (-3)) != 0) {
                return;
            }
            if (i11 == 2) {
                lazySet(3);
                bVar.onNext(obj);
                if (get() != 4) {
                    bVar.onComplete();
                    return;
                }
                return;
            }
            this.f42880b = obj;
            if (compareAndSet(0, 1)) {
                return;
            } else {
                i11 = get();
            }
        } while (i11 != 4);
        this.f42880b = null;
    }

    @Override // bx.g
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onSuccess(Object obj) {
        e(obj);
    }

    @Override // bx.g
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.f42880b;
        this.f42880b = null;
        return obj;
    }

    @Override // n20.c
    public final void request(long j11) {
        Object obj;
        if (g.c(j11)) {
            do {
                int i11 = get();
                if ((i11 & (-2)) != 0) {
                    return;
                }
                if (i11 == 1) {
                    if (!compareAndSet(1, 3) || (obj = this.f42880b) == null) {
                        return;
                    }
                    this.f42880b = null;
                    n20.b bVar = this.f42879a;
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
