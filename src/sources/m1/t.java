package m1;

import l1.m2;
import l1.p2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f40814c = new t(0, 3, 1);

    @Override // m1.j0
    public final void a(d1.t tVar, l1.d dVar, p2 p2Var, t1.j jVar, k0 k0Var) {
        ob.e eVar;
        m2 m2Var = (m2) tVar.f(1);
        l1.b bVar = (l1.b) tVar.f(0);
        c cVar = (c) tVar.f(2);
        p2 p2VarF = m2Var.f();
        if (k0Var != null) {
            try {
                eVar = new ob.e(21, k0Var, p2Var);
            } catch (Throwable th2) {
                p2VarF.e(false);
                throw th2;
            }
        } else {
            eVar = null;
        }
        if (!cVar.f40778e.I()) {
            l1.u.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        cVar.f40777d.H(dVar, p2VarF, jVar, eVar);
        p2VarF.e(true);
        p2Var.d();
        bVar.getClass();
        p2Var.A(m2Var, m2Var.b(bVar));
        p2Var.k();
    }
}
