package zx;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends h {
    private static final long serialVersionUID = -4547113800637756442L;
    public final n20.b O;

    public i(n20.b bVar, qx.n nVar, int i11) {
        super(nVar, i11);
        this.O = bVar;
    }

    @Override // n20.b
    public final void c(n20.c cVar) {
        if (fy.c.e(this.f59605e, cVar)) {
            this.f59605e = cVar;
            if (cVar instanceof iy.c) {
                iy.c cVar2 = (iy.c) cVar;
                int iA = cVar2.a(7);
                if (iA == 1) {
                    this.L = 1;
                    this.f59606f = cVar2;
                    this.H = true;
                    this.O.c(this);
                    return;
                }
                if (iA == 2) {
                    this.L = 2;
                    this.f59606f = cVar2;
                    this.O.c(this);
                    cVar.request(this.f59602b);
                    return;
                }
            }
            this.f59606f = new iy.g(this.f59602b);
            this.O.c(this);
            cVar.request(this.f59602b);
        }
    }

    @Override // iy.f
    public final Object poll() {
        Object objPoll = this.f59606f.poll();
        if (objPoll != null && this.L != 1) {
            long j11 = this.M + 1;
            if (j11 == this.f59603c) {
                this.M = 0L;
                this.f59605e.request(j11);
                return objPoll;
            }
            this.M = j11;
        }
        return objPoll;
    }
}
