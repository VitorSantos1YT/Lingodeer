package e0;

import ch.z;
import l1.n;
import l1.s;
import l1.x1;
import x1.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f24645a = new p();

    public static void b(e eVar, fz.e eVar2, t1.d dVar, fz.a aVar, int i11) {
        if ((i11 & 8) != 0) {
            dVar = null;
        }
        eVar.f24645a.add(new t1.d(new d(eVar2, dVar, aVar), true, 424163756));
    }

    public final void a(c cVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(1320309496);
        int i12 = (sVar.f(cVar) ? 4 : 2) | i11 | (sVar.f(this) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            p pVar = this.f24645a;
            int size = pVar.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((fz.f) pVar.get(i13)).invoke(cVar, sVar, Integer.valueOf(i12 & 14));
            }
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new z(this, i11, 23, cVar);
        }
    }
}
