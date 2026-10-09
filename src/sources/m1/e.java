package m1;

import l1.g2;
import l1.p2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f40782c = new e(0, 2, 1);

    @Override // m1.j0
    public final void a(d1.t tVar, l1.d dVar, p2 p2Var, t1.j jVar, k0 k0Var) {
        l1.b bVar = (l1.b) tVar.f(0);
        Object objF = tVar.f(1);
        if (objF instanceof g2) {
            g2 g2Var = (g2) objF;
            jVar.f51997e.c(g2Var);
            jVar.f51996d.a(g2Var);
        }
        if (p2Var.f39408n != 0) {
            l1.u.a("Can only append a slot if not current inserting");
        }
        int i11 = p2Var.f39404i;
        int i12 = p2Var.f39405j;
        int iC = p2Var.c(bVar);
        int iG = p2Var.g(p2Var.f39397b, p2Var.r(iC + 1));
        p2Var.f39404i = iG;
        p2Var.f39405j = iG;
        p2Var.x(1, iC);
        if (i11 >= iG) {
            i11++;
            i12++;
        }
        p2Var.f39398c[iG] = objF;
        p2Var.f39404i = i11;
        p2Var.f39405j = i12;
    }
}
