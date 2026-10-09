package es;

import a0.r;
import am.rVFB.LwKl;
import j0.o;
import j9.q;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import l1.b3;
import l1.n;
import l1.s;
import m0.t;
import mt.j5;
import n0.a0;
import n0.l;
import n0.x;
import n0.x0;
import n0.y;
import qy.b0;
import tg.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25789c;

    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        this.f25787a = i11;
        this.f25788b = obj;
        this.f25789c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0173  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d2  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25787a) {
            case 0:
                return new m0.d(((m0.d) ((dt.g) this.f25788b).invoke((t) obj, ((ArrayList) this.f25789c).get(((Number) obj2).intValue()))).f40543a);
            case 1:
                n nVar = (n) obj;
                int iIntValue = ((Number) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((t1.d) this.f25788b).invoke((j0.s) this.f25789c, sVar, 0);
                } else {
                    sVar.W();
                }
                return b0.f48488a;
            case 2:
                n nVar2 = (n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    s sVar2 = (s) nVar2;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else {
                        ((k9.n) this.f25788b).f37999t.invoke((j9.e) this.f25789c, nVar2, 0);
                    }
                } else {
                    ((k9.n) this.f25788b).f37999t.invoke((j9.e) this.f25789c, nVar2, 0);
                }
                return b0.f48488a;
            case 3:
                n nVar3 = (n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    s sVar3 = (s) nVar3;
                    if (sVar3.F()) {
                        sVar3.W();
                    } else {
                        android.support.v4.media.session.a.d((w1.b) this.f25788b, (t1.d) this.f25789c, nVar3, 0);
                    }
                } else {
                    android.support.v4.media.session.a.d((w1.b) this.f25788b, (t1.d) this.f25789c, nVar3, 0);
                }
                return b0.f48488a;
            case 4:
                n nVar4 = (n) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                j9.e eVar = (j9.e) this.f25788b;
                if ((iIntValue2 & 3) == 2) {
                    s sVar4 = (s) nVar4;
                    if (sVar4.F()) {
                        sVar4.W();
                    } else {
                        q qVar = eVar.f36188b;
                        m.d(qVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                        ((k9.h) qVar).f37980f.f((r) this.f25789c, eVar, nVar4, 0);
                    }
                } else {
                    q qVar2 = eVar.f36188b;
                    m.d(qVar2, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                    ((k9.h) qVar2).f37980f.f((r) this.f25789c, eVar, nVar4, 0);
                }
                return b0.f48488a;
            case 5:
                n nVar5 = (n) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                y yVar = (y) this.f25788b;
                x xVar = (x) this.f25789c;
                s sVar5 = (s) nVar5;
                if (sVar5.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    a0 a0Var = (a0) yVar.f43030b.invoke();
                    int iD = xVar.f43023c;
                    Object obj3 = xVar.f43021a;
                    if ((iD >= a0Var.getItemCount() || !a0Var.a(iD).equals(obj3)) && (iD = a0Var.d(obj3)) != -1) {
                        xVar.f43023c = iD;
                    }
                    int i11 = iD;
                    if (i11 != -1) {
                        sVar5.d0(-1664741271);
                        l.d(a0Var, yVar.f43029a, i11, xVar.f43021a, sVar5, 0);
                        sVar5.p(false);
                    } else {
                        sVar5.d0(-1664505826);
                        sVar5.p(false);
                    }
                    boolean zH = sVar5.h(xVar);
                    Object objQ = sVar5.Q();
                    if (zH || objQ == l1.m.f39353a) {
                        objQ = new kp.j(xVar, 17);
                        sVar5.o0(objQ);
                    }
                    l1.t.c(obj3, (fz.c) objQ, sVar5);
                } else {
                    sVar5.W();
                }
                return b0.f48488a;
            case 6:
                n nVar6 = (n) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                s sVar6 = (s) nVar6;
                if (sVar6.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ((t1.d) this.f25788b).invoke((x0) this.f25789c, sVar6, 0);
                } else {
                    sVar6.W();
                }
                return b0.f48488a;
            case 7:
                n nVar7 = (n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    s sVar7 = (s) nVar7;
                    if (sVar7.F()) {
                        sVar7.W();
                    } else {
                        o.a((z1.r) ((fz.c) this.f25788b).invoke((w0) this.f25789c), nVar7, 0);
                    }
                } else {
                    o.a((z1.r) ((fz.c) this.f25788b).invoke((w0) this.f25789c), nVar7, 0);
                }
                return b0.f48488a;
            default:
                n nVar8 = (n) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                s sVar8 = (s) nVar8;
                if (sVar8.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zF = sVar8.f((z0.d) this.f25788b);
                    z0.d dVar = (z0.d) this.f25788b;
                    Object objQ2 = sVar8.Q();
                    if (zF || objQ2 == l1.m.f39353a) {
                        objQ2 = l1.t.s(new j5(0, dVar, z0.d.class, LwKl.gLYUqGGaRNior, "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 9));
                        sVar8.o0(objQ2);
                    }
                    x0.l.a((v0.g) this.f25789c, (v0.c) ((b3) objQ2).getValue(), sVar8, 0);
                } else {
                    sVar8.W();
                }
                return b0.f48488a;
        }
    }
}
