package ex;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v0 extends u0 {
    private static final long serialVersionUID = 644624475404284533L;
    public final bx.a O;
    public long P;

    public v0(bx.a aVar, uw.m mVar, int i11) {
        super(mVar, i11);
        this.O = aVar;
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
        bx.a aVar = this.O;
        bx.g gVar = this.f26078f;
        long j11 = this.M;
        long j12 = this.P;
        int iAddAndGet = 1;
        while (true) {
            long j13 = this.f26076d.get();
            while (j11 != j13) {
                boolean z11 = this.H;
                try {
                    Object objPoll = gVar.poll();
                    boolean z12 = objPoll == null;
                    if (e(z11, z12, aVar)) {
                        return;
                    }
                    if (z12) {
                        break;
                    }
                    if (aVar.d(objPoll)) {
                        j11++;
                    }
                    j12++;
                    if (j12 == this.f26075c) {
                        this.f26077e.request(j12);
                        j12 = 0;
                    }
                } catch (Throwable th2) {
                    fb.g0.D(th2);
                    this.f26079t = true;
                    this.f26077e.cancel();
                    gVar.clear();
                    aVar.onError(th2);
                    this.f26073a.dispose();
                    return;
                }
            }
            if (j11 == j13 && e(this.H, gVar.isEmpty(), aVar)) {
                return;
            }
            int i11 = get();
            if (iAddAndGet == i11) {
                this.M = j11;
                this.P = j12;
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
        bx.a aVar = this.O;
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
                        aVar.onComplete();
                        this.f26073a.dispose();
                        return;
                    } else if (aVar.d(objPoll)) {
                        j11++;
                    }
                } catch (Throwable th2) {
                    fb.g0.D(th2);
                    this.f26079t = true;
                    this.f26077e.cancel();
                    aVar.onError(th2);
                    this.f26073a.dispose();
                    return;
                }
            }
            if (this.f26079t) {
                return;
            }
            if (gVar.isEmpty()) {
                this.f26079t = true;
                aVar.onComplete();
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
            long j11 = this.P + 1;
            if (j11 == this.f26075c) {
                this.P = 0L;
                this.f26077e.request(j11);
                return objPoll;
            }
            this.P = j11;
        }
        return objPoll;
    }
}
