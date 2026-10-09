package m1;

import java.util.List;
import l1.p2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f40786c = new g(0, 2, 1);

    @Override // m1.j0
    public final void a(d1.t tVar, l1.d dVar, p2 p2Var, t1.j jVar, k0 k0Var) {
        int i11 = ((t1.f) tVar.f(0)).f51988a;
        List list = (List) tVar.f(1);
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            int i13 = i11 + i12;
            dVar.b(i13, obj);
            dVar.v(i13, obj);
        }
    }
}
