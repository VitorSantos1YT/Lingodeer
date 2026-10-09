package ex;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w0 extends u0 {
    private static final long serialVersionUID = -4547113800637756442L;
    public final n20.b O;

    public w0(n20.b bVar, uw.m mVar, int i11) {
        super(mVar, i11);
        this.O = bVar;
    }

    @Override // n20.b
    public final void c(n20.c cVar) {
        if (mx.g.e(this.f26077e, cVar)) {
            this.f26077e = cVar;
            if (cVar instanceof bx.d) {
                bx.d dVar = (bx.d) cVar;
                int iA = dVar.a(7);
                if (iA == 1) {
                    this.L = 1;
                    this.f26078f = dVar;
                    this.H = true;
                    this.O.c(this);
                    return;
                }
                if (iA == 2) {
                    this.L = 2;
                    this.f26078f = dVar;
                    this.O.c(this);
                    cVar.request(this.f26074b);
                    return;
                }
            }
            this.f26078f = new jx.a(this.f26074b);
            this.O.c(this);
            cVar.request(this.f26074b);
        }
    }

    @Override // ex.u0
    public final void f() {
        n20.b bVar = this.O;
        bx.g gVar = this.f26078f;
        long j11 = this.M;
        int iAddAndGet = 1;
        while (true) {
            long jAddAndGet = this.f26076d.get();
            while (j11 != jAddAndGet) {
                boolean z11 = this.H;
                try {
                    Object objPoll = gVar.poll();
                    boolean z12 = objPoll == null;
                    if (e(z11, z12, bVar)) {
                        return;
                    }
                    if (z12) {
                        break;
                    }
                    bVar.onNext(objPoll);
                    j11++;
                    if (j11 == this.f26075c) {
                        if (jAddAndGet != Long.MAX_VALUE) {
                            jAddAndGet = this.f26076d.addAndGet(-j11);
                        }
                        this.f26077e.request(j11);
                        j11 = 0;
                    }
                } catch (Throwable th2) {
                    fb.g0.D(th2);
                    this.f26079t = true;
                    this.f26077e.cancel();
                    gVar.clear();
                    bVar.onError(th2);
                    this.f26073a.dispose();
                    return;
                }
            }
            if (j11 == jAddAndGet && e(this.H, gVar.isEmpty(), bVar)) {
                return;
            }
            int i11 = get();
            if (iAddAndGet == i11) {
                this.M = j11;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                iAddAndGet = i11;
            }
        }
    }

    @Override // ex.u0
    public final void g() {
        int iAddAndGet = 1;
        while (!this.f26079t) {
            boolean z11 = this.H;
            this.O.onNext(null);
            if (z11) {
                this.f26079t = true;
                Throwable th2 = this.K;
                if (th2 != null) {
                    this.O.onError(th2);
                } else {
                    this.O.onComplete();
                }
                this.f26073a.dispose();
                return;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // ex.u0
    public final void h() {
        n20.b bVar = this.O;
        bx.g gVar = this.f26078f;
        long j11 = this.M;
        int iAddAndGet = 1;
        while (true) {
            long j12 = this.f26076d.get();
            while (j11 != j12) {
                try {
                    Object objPoll = gVar.poll();
                    if (this.f26079t) {
                        return;
                    }
                    if (objPoll == null) {
                        this.f26079t = true;
                        bVar.onComplete();
                        this.f26073a.dispose();
                        return;
                    }
                    bVar.onNext(objPoll);
                    j11++;
                } catch (Throwable th2) {
                    fb.g0.D(th2);
                    this.f26079t = true;
                    this.f26077e.cancel();
                    bVar.onError(th2);
                    this.f26073a.dispose();
                    return;
                }
            }
            if (this.f26079t) {
                return;
            }
            if (gVar.isEmpty()) {
                this.f26079t = true;
                bVar.onComplete();
                this.f26073a.dispose();
                return;
            } else {
                int i11 = get();
                if (iAddAndGet == i11) {
                    this.M = j11;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i11;
                }
            }
        }
    }

    @Override // bx.g
    public final Object poll() {
        Object objPoll = this.f26078f.poll();
        if (objPoll != null && this.L != 1) {
            long j11 = this.M + 1;
            if (j11 == this.f26075c) {
                this.M = 0L;
                this.f26077e.request(j11);
                return objPoll;
            }
            this.M = j11;
        }
        return objPoll;
    }
}
