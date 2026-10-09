package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1.e f3569a = new n1.e(new h0[16]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1.k1 f3570b = l1.t.B(Boolean.FALSE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3571c = Long.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1.k1 f3572d = l1.t.B(Boolean.TRUE);

    public final void a(l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-318043801);
        int i12 = (sVar.h(this) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            Object objQ = sVar.Q();
            vy.d dVar = null;
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(null);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            if (((Boolean) this.f3572d.getValue()).booleanValue() || ((Boolean) this.f3570b.getValue()).booleanValue()) {
                sVar.d0(-144783432);
                boolean zH = sVar.h(this);
                Object objQ2 = sVar.Q();
                if (zH || objQ2 == gVar) {
                    objQ2 = new f(1, b1Var, this, dVar);
                    sVar.o0(objQ2);
                }
                l1.t.f((fz.e) objQ2, this, sVar);
                sVar.p(false);
            } else {
                sVar.d0(-143396709);
                sVar.p(false);
            }
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.viewmodel.compose.a(this, i11, 2);
        }
    }
}
