package o9;

import kotlin.jvm.internal.m;
import l1.g;
import l1.n;
import l1.s;
import n9.t;
import n9.u;
import n9.x;
import uz.i;
import vy.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f44754a;

    static {
        u uVar = new u(false);
        f44754a = new x(t.f43692b, uVar, uVar);
    }

    public static final b a(i iVar, n nVar) {
        m.f(iVar, "<this>");
        s sVar = (s) nVar;
        sVar.e0(388053246);
        sVar.e0(1046463091);
        boolean zF = sVar.f(iVar);
        Object objQ = sVar.Q();
        g gVar = l1.m.f39353a;
        if (zF || objQ == gVar) {
            objQ = new b(iVar);
            sVar.o0(objQ);
        }
        b bVar = (b) objQ;
        sVar.p(false);
        sVar.e0(1046463169);
        j jVar = j.f54321a;
        boolean zH = sVar.h(jVar) | sVar.h(bVar);
        Object objQ2 = sVar.Q();
        if (zH || objQ2 == gVar) {
            objQ2 = new c(bVar, null, 1);
            sVar.o0(objQ2);
        }
        sVar.p(false);
        l1.t.f((fz.e) objQ2, bVar, sVar);
        sVar.e0(1046463438);
        boolean zH2 = sVar.h(jVar) | sVar.h(bVar);
        Object objQ3 = sVar.Q();
        if (zH2 || objQ3 == gVar) {
            objQ3 = new c(bVar, null, 3);
            sVar.o0(objQ3);
        }
        sVar.p(false);
        l1.t.f((fz.e) objQ3, bVar, sVar);
        sVar.p(false);
        return bVar;
    }
}
