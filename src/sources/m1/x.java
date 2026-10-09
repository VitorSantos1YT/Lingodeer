package m1;

import java.util.Set;
import l1.g2;
import l1.p2;
import l1.x1;
import y.r0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f40818c = new x(0, 1, 1);

    @Override // m1.j0
    public final void a(d1.t tVar, l1.d dVar, p2 p2Var, t1.j jVar, k0 k0Var) {
        x1 x1Var = (x1) tVar.f(0);
        Set set = jVar.f51993a;
        if (set == null) {
            return;
        }
        t1.g gVar = new t1.g(set);
        y.i0 i0Var = jVar.f52001i;
        if (i0Var == null) {
            long[] jArr = r0.f56756a;
            i0Var = new y.i0();
            jVar.f52001i = i0Var;
        }
        i0Var.m(x1Var, gVar);
        jVar.f51997e.c(new g2(gVar, -1));
    }
}
