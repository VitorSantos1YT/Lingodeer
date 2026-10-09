package ug;

import br.m;
import d1.k0;
import j0.l0;
import l1.d0;
import l1.n;
import l1.s;
import l1.x1;
import rt.m9;
import t1.e;
import tg.v;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f52966a = new d0(new m9(23));

    public static final void a(r rVar, t1.d dVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-1671508753);
        if (((i11 | 54) & 147) == 146 && sVar.F()) {
            sVar.W();
        } else {
            b(e.d(-195697503, new l0(dVar), sVar), sVar, 6);
            rVar = o.f58481a;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k0(rVar, dVar, i11, 1);
        }
    }

    public static final void b(t1.d dVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(716390213);
        if ((i11 & 3) == 2 && sVar.F()) {
            sVar.W();
        } else if (((Boolean) sVar.j(f52966a)).booleanValue()) {
            sVar.d0(760467856);
            dVar.invoke(sVar, 6);
            sVar.p(false);
        } else {
            sVar.d0(759953969);
            v.e(c.f52963b, b.f52961a, c.f52964c, b.f52962b, e.d(-1491968376, new l0(dVar, 6), sVar), sVar, 27696);
            sVar.p(false);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m(dVar, i11, 13);
        }
    }
}
