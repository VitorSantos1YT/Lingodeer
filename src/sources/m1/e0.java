package m1;

import l1.g2;
import l1.p2;
import l1.x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f40783c = new e0(1, 0, 2);

    @Override // m1.j0
    public final void a(d1.t tVar, l1.d dVar, p2 p2Var, t1.j jVar, k0 k0Var) {
        int iE = tVar.e(0);
        int i11 = p2Var.f39416v;
        int iN = p2Var.N(p2Var.f39397b, p2Var.r(i11));
        int iG = p2Var.g(p2Var.f39397b, p2Var.r(i11 + 1));
        for (int iMax = Math.max(iN, iG - iE); iMax < iG; iMax++) {
            Object obj = p2Var.f39398c[p2Var.h(iMax)];
            if (obj instanceof g2) {
                jVar.e((g2) obj);
            } else if (obj instanceof x1) {
                ((x1) obj).d();
            }
        }
        if (iE <= 0) {
            l1.u.a("Check failed");
        }
        int i12 = p2Var.f39416v;
        int iN2 = p2Var.N(p2Var.f39397b, p2Var.r(i12));
        int iG2 = p2Var.g(p2Var.f39397b, p2Var.r(i12 + 1)) - iE;
        if (iG2 < iN2) {
            l1.u.a("Check failed");
        }
        p2Var.J(iG2, iE, i12);
        int i13 = p2Var.f39404i;
        if (i13 >= iN2) {
            p2Var.f39404i = i13 - iE;
        }
    }
}
