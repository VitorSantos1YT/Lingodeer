package rz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h2 extends wz.q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ThreadLocal f50912e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public h2(vy.d dVar, vy.i iVar) {
        i2 i2Var = i2.f50914a;
        super(dVar, iVar.get(i2Var) == null ? iVar.plus(i2Var) : iVar);
        this.f50912e = new ThreadLocal();
        if (dVar.getContext().get(vy.e.f54320a) instanceof y) {
            return;
        }
        Object objN = wz.b.n(iVar, null);
        wz.b.g(iVar, objN);
        d0(iVar, objN);
    }

    @Override // wz.q
    public final void a0() {
        c0();
    }

    public final boolean b0() {
        boolean z11 = this.threadLocalIsSet && this.f50912e.get() == null;
        this.f50912e.remove();
        return !z11;
    }

    public final void c0() {
        if (this.threadLocalIsSet) {
            qy.l lVar = (qy.l) this.f50912e.get();
            if (lVar != null) {
                wz.b.g((vy.i) lVar.f48495a, lVar.f48496b);
            }
            this.f50912e.remove();
        }
    }

    public final void d0(vy.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f50912e.set(new qy.l(iVar, obj));
    }

    @Override // wz.q, rz.q1
    public final void n(Object obj) {
        c0();
        Object objD = e0.D(obj);
        vy.d dVar = this.f55541d;
        vy.i context = dVar.getContext();
        Object objN = wz.b.n(context, null);
        h2 h2VarL = objN != wz.b.f55504d ? e0.L(dVar, context, objN) : null;
        try {
            dVar.resumeWith(objD);
        } finally {
            if (h2VarL == null || h2VarL.b0()) {
                wz.b.g(context, objN);
            }
        }
    }
}
