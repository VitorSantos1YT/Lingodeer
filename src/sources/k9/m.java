package k9;

import ad.y;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import bt.n1;
import ch.b0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import l1.b1;
import l1.x1;
import z2.t1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final void a(o oVar, l1.n nVar, int i11) {
        x1.p pVar;
        o oVar2 = oVar;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(294589392);
        if ((((sVar.h(oVar2) ? 4 : 2) | i11) & 3) == 2 && sVar.F()) {
            sVar.W();
        } else {
            w1.c cVarF = w1.j.f(sVar);
            b1 b1VarO = l1.t.o(oVar2.b().f36206e, sVar);
            List list = (List) b1VarO.getValue();
            boolean zBooleanValue = ((Boolean) sVar.j(t1.f58672a)).booleanValue();
            boolean zF = sVar.f(list);
            Object objQ = sVar.Q();
            Object obj = l1.m.f39353a;
            Object obj2 = objQ;
            if (zF || objQ == obj) {
                x1.p pVar2 = new x1.p();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (zBooleanValue ? true : ((j9.e) obj3).H.f41060j.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                        arrayList.add(obj3);
                    }
                }
                pVar2.addAll(arrayList);
                sVar.o0(pVar2);
                obj2 = pVar2;
            }
            x1.p pVar3 = (x1.p) obj2;
            b(pVar3, (List) b1VarO.getValue(), sVar, 0);
            b1 b1VarO2 = l1.t.o(oVar2.b().f36207f, sVar);
            Object objQ2 = sVar.Q();
            if (objQ2 == obj) {
                objQ2 = new x1.p();
                sVar.o0(objQ2);
            }
            x1.p pVar4 = (x1.p) objQ2;
            sVar.d0(-367418626);
            ListIterator listIterator = pVar3.listIterator();
            while (true) {
                sy.a aVar = (sy.a) listIterator;
                if (!aVar.hasNext()) {
                    break;
                }
                j9.e eVar = (j9.e) aVar.next();
                j9.q qVar = eVar.f36188b;
                kotlin.jvm.internal.m.d(qVar, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                n nVar2 = (n) qVar;
                boolean zH = sVar.h(oVar2) | sVar.h(eVar);
                Object objQ3 = sVar.Q();
                if (zH || objQ3 == obj) {
                    objQ3 = new fp.f(25, oVar2, eVar);
                    sVar.o0(objQ3);
                }
                androidx.compose.ui.window.a.a((fz.a) objQ3, nVar2.f37998f, t1.e.d(1129586364, new l(eVar, oVar2, cVarF, pVar4, nVar2, 0), sVar), sVar, 384, 0);
                oVar2 = oVar2;
                cVarF = cVarF;
                pVar4 = pVar4;
            }
            o oVar3 = oVar2;
            x1.p pVar5 = pVar4;
            sVar.p(false);
            Set set = (Set) b1VarO2.getValue();
            boolean zF2 = sVar.f(b1VarO2) | sVar.h(oVar3);
            Object objQ4 = sVar.Q();
            if (zF2 || objQ4 == obj) {
                oVar2 = oVar3;
                pVar = pVar5;
                Object yVar = new y(b1VarO2, oVar2, pVar, (vy.d) null, 15);
                sVar.o0(yVar);
                objQ4 = yVar;
            } else {
                oVar2 = oVar3;
                pVar = pVar5;
            }
            l1.t.g(set, pVar, (fz.e) objQ4, sVar);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0(oVar2, i11, 21);
        }
    }

    public static final void b(List list, Collection collection, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1537894851);
        if ((((sVar.h(list) ? 4 : 2) | i11 | (sVar.h(collection) ? 32 : 16)) & 19) == 18 && sVar.F()) {
            sVar.W();
        } else {
            boolean zBooleanValue = ((Boolean) sVar.j(t1.f58672a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                j9.e eVar = (j9.e) it.next();
                LifecycleRegistry lifecycleRegistry = eVar.H.f41060j;
                boolean zG = sVar.g(zBooleanValue) | sVar.h(list) | sVar.h(eVar);
                Object objQ = sVar.Q();
                if (zG || objQ == l1.m.f39353a) {
                    objQ = new n1(eVar, zBooleanValue, list, 5);
                    sVar.o0(objQ);
                }
                l1.t.c(lifecycleRegistry, (fz.c) objQ, sVar);
            }
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fu.n(list, i11, 29, collection);
        }
    }
}
