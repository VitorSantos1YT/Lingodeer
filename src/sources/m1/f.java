package m1;

import java.lang.reflect.InvocationTargetException;
import l1.p2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f40784c = new f(0, 2, 1);

    @Override // m1.j0
    public final void a(d1.t tVar, l1.d dVar, p2 p2Var, t1.j jVar, k0 k0Var) throws IllegalAccessException, InvocationTargetException {
        t1.f fVar = (t1.f) tVar.f(1);
        int i11 = fVar != null ? fVar.f51988a : 0;
        a aVar = (a) tVar.f(0);
        if (i11 > 0) {
            b.a aVar2 = new b.a();
            aVar2.f3415c = dVar;
            aVar2.f3413a = i11;
            dVar = aVar2;
        }
        aVar.G(dVar, p2Var, jVar, k0Var != null ? new ob.e(21, k0Var, p2Var) : null);
    }
}
