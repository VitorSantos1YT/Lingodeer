package m1;

import l1.p2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f40792c = new j(0, 2, 1);

    @Override // m1.j0
    public final void a(d1.t tVar, l1.d dVar, p2 p2Var, t1.j jVar, k0 k0Var) {
        int i11;
        t1.f fVar = (t1.f) tVar.f(0);
        int iC = p2Var.c((l1.b) tVar.f(1));
        if (p2Var.f39414t >= iC) {
            l1.u.a("Check failed");
        }
        qx.b.F(p2Var, dVar, iC);
        int i12 = p2Var.f39414t;
        int iE = p2Var.f39416v;
        while (iE >= 0 && !p2Var.y(iE)) {
            iE = p2Var.E(p2Var.f39397b, iE);
        }
        int iU = iE + 1;
        int iL = 0;
        while (iU < i12) {
            if (p2Var.v(i12, iU)) {
                if (p2Var.y(iU)) {
                    iL = 0;
                }
                iU++;
            } else {
                iL += p2Var.y(iU) ? 1 : p2Var.f39397b[(p2Var.r(iU) * 5) + 1] & 67108863;
                iU += p2Var.u(iU);
            }
        }
        while (true) {
            i11 = p2Var.f39414t;
            if (i11 >= iC) {
                break;
            }
            if (p2Var.v(iC, i11)) {
                int i13 = p2Var.f39414t;
                if (i13 < p2Var.f39415u && (p2Var.f39397b[(p2Var.r(i13) * 5) + 1] & 1073741824) != 0) {
                    dVar.d(p2Var.D(p2Var.f39414t));
                    iL = 0;
                }
                p2Var.P();
            } else {
                iL += p2Var.L();
            }
        }
        if (i11 != iC) {
            l1.u.a("Check failed");
        }
        fVar.f51988a = iL;
    }
}
