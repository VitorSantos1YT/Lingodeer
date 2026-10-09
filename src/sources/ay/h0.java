package ay;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends xx.a implements qx.k, Runnable {
    private static final long serialVersionUID = 6576896619930983584L;
    public volatile boolean H;
    public int K;
    public boolean L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qx.k f3314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qx.n f3315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public iy.f f3317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public rx.b f3318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Throwable f3319f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f3320t;

    public h0(qx.k kVar, qx.n nVar, int i11) {
        this.f3314a = kVar;
        this.f3315b = nVar;
        this.f3316c = i11;
    }

    @Override // iy.b
    public final int a(int i11) {
        this.L = true;
        return 2;
    }

    @Override // rx.b
    public final boolean b() {
        return this.H;
    }

    @Override // qx.k
    public final void c(rx.b bVar) {
        if (ux.b.f(this.f3318e, bVar)) {
            this.f3318e = bVar;
            if (bVar instanceof iy.a) {
                iy.a aVar = (iy.a) bVar;
                int iA = aVar.a(7);
                if (iA == 1) {
                    this.K = iA;
                    this.f3317d = aVar;
                    this.f3320t = true;
                    this.f3314a.c(this);
                    if (getAndIncrement() == 0) {
                        this.f3315b.d(this);
                        return;
                    }
                    return;
                }
                if (iA == 2) {
                    this.K = iA;
                    this.f3317d = aVar;
                    this.f3314a.c(this);
                    return;
                }
            }
            this.f3317d = new iy.h(this.f3316c);
            this.f3314a.c(this);
        }
    }

    @Override // iy.f
    public final void clear() {
        this.f3317d.clear();
    }

    public final boolean d(boolean z11, boolean z12, qx.k kVar) {
        if (this.H) {
            this.f3317d.clear();
            return true;
        }
        if (!z11) {
            return false;
        }
        Throwable th2 = this.f3319f;
        if (th2 != null) {
            this.H = true;
            this.f3317d.clear();
            kVar.onError(th2);
            this.f3315b.dispose();
            return true;
        }
        if (!z12) {
            return false;
        }
        this.H = true;
        kVar.onComplete();
        this.f3315b.dispose();
        return true;
    }

    @Override // rx.b
    public final void dispose() {
        if (this.H) {
            return;
        }
        this.H = true;
        this.f3318e.dispose();
        this.f3315b.dispose();
        if (this.L || getAndIncrement() != 0) {
            return;
        }
        this.f3317d.clear();
    }

    @Override // iy.f
    public final boolean isEmpty() {
        return this.f3317d.isEmpty();
    }

    @Override // qx.k
    public final void onComplete() {
        if (this.f3320t) {
            return;
        }
        this.f3320t = true;
        if (getAndIncrement() == 0) {
            this.f3315b.d(this);
        }
    }

    @Override // qx.k
    public final void onError(Throwable th2) {
        if (this.f3320t) {
            qx.p.u(th2);
            return;
        }
        this.f3319f = th2;
        this.f3320t = true;
        if (getAndIncrement() == 0) {
            this.f3315b.d(this);
        }
    }

    @Override // qx.k
    public final void onNext(Object obj) {
        if (this.f3320t) {
            return;
        }
        if (this.K != 2) {
            this.f3317d.offer(obj);
        }
        if (getAndIncrement() == 0) {
            this.f3315b.d(this);
        }
    }

    @Override // iy.f
    public final Object poll() {
        return this.f3317d.poll();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.L) {
            int iAddAndGet = 1;
            while (!this.H) {
                boolean z11 = this.f3320t;
                Throwable th2 = this.f3319f;
                if (z11 && th2 != null) {
                    this.H = true;
                    this.f3314a.onError(this.f3319f);
                    this.f3315b.dispose();
                    return;
                }
                this.f3314a.onNext(null);
                if (z11) {
                    this.H = true;
                    Throwable th3 = this.f3319f;
                    if (th3 != null) {
                        this.f3314a.onError(th3);
                    } else {
                        this.f3314a.onComplete();
                    }
                    this.f3315b.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            return;
        }
        iy.f fVar = this.f3317d;
        qx.k kVar = this.f3314a;
        int iAddAndGet2 = 1;
        while (!d(this.f3320t, fVar.isEmpty(), kVar)) {
            while (true) {
                boolean z12 = this.f3320t;
                try {
                    Object objPoll = fVar.poll();
                    boolean z13 = objPoll == null;
                    if (d(z12, z13, kVar)) {
                        return;
                    }
                    if (z13) {
                        break;
                    } else {
                        kVar.onNext(objPoll);
                    }
                } catch (Throwable th4) {
                    ef.e.E(th4);
                    this.H = true;
                    this.f3318e.dispose();
                    fVar.clear();
                    kVar.onError(th4);
                    this.f3315b.dispose();
                    return;
                }
            }
            iAddAndGet2 = addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            }
        }
    }
}
