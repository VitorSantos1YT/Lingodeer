package m1;

import hh.p0;
import java.util.ArrayList;
import l1.p2;
import l1.x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f40805c = new o(0, 1, 1);

    @Override // m1.j0
    public final void a(d1.t tVar, l1.d dVar, p2 p2Var, t1.j jVar, k0 k0Var) {
        n1.e eVar;
        x1 x1Var = (x1) tVar.f(0);
        y.i0 i0Var = jVar.f52001i;
        if (i0Var == null || ((t1.g) i0Var.g(x1Var)) == null) {
            return;
        }
        ArrayList arrayList = jVar.f52002j;
        if (arrayList != null && (eVar = (n1.e) p0.f(1, arrayList)) != null) {
            jVar.f51997e = eVar;
        }
        i0Var.k(x1Var);
    }
}
