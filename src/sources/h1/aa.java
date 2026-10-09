package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aa f30000a = new aa();

    public final void a(float f5, int i11, long j11, l1.n nVar, z1.r rVar) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1498258020);
        if ((((sVar.f(rVar) ? 4 : 2) | i11 | 176) & 147) == 146 && sVar.F()) {
            sVar.W();
        } else {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                f5 = k1.y.f37829b;
                j11 = v1.d(k1.y.f37828a, sVar);
            } else {
                sVar.W();
            }
            sVar.q();
            j0.o.a(d0.n.h(j0.e2.g(j0.e2.e(rVar, 1.0f), f5), j11, g2.f0.f28556b), sVar, 0);
        }
        float f11 = f5;
        long j12 = j11;
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new z9(this, rVar, f11, j12, i11);
        }
    }
}
