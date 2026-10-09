package rg;

import g3.r;
import kotlin.jvm.internal.m;
import l1.n;
import l1.s;
import ot.f2;
import qy.b0;
import se.p;
import sg.q;
import tg.i0;
import z1.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f49257b;

    public /* synthetic */ d(q qVar, int i11) {
        this.f49256a = i11;
        this.f49257b = qVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:33:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00be  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cf  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        s sVar;
        Object objQ;
        switch (this.f49256a) {
            case 0:
                i0 Heading = (i0) obj;
                n nVar = (n) obj2;
                int iIntValue = ((Number) obj3).intValue();
                m.f(Heading, "$this$Heading");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((s) nVar).f(Heading) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18) {
                    s sVar2 = (s) nVar;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else {
                        sVar = (s) nVar;
                        sVar.d0(516710153);
                        objQ = sVar.Q();
                        if (objQ == l1.m.f39353a) {
                            objQ = new f2(22);
                            sVar.o0(objQ);
                        }
                        sVar.p(false);
                        p.H(Heading, this.f49257b, r.b(o.f58481a, false, (fz.c) objQ), sVar, iIntValue & 14, 0);
                    }
                } else {
                    sVar = (s) nVar;
                    sVar.d0(516710153);
                    objQ = sVar.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = new f2(22);
                        sVar.o0(objQ);
                    }
                    sVar.p(false);
                    p.H(Heading, this.f49257b, r.b(o.f58481a, false, (fz.c) objQ), sVar, iIntValue & 14, 0);
                }
                break;
            case 1:
                i0 cell = (i0) obj;
                n nVar2 = (n) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                m.f(cell, "$this$cell");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((s) nVar2).f(cell) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18) {
                    s sVar3 = (s) nVar2;
                    if (sVar3.F()) {
                        sVar3.W();
                    } else {
                        p.H(cell, this.f49257b, null, nVar2, iIntValue2 & 14, 2);
                    }
                } else {
                    p.H(cell, this.f49257b, null, nVar2, iIntValue2 & 14, 2);
                }
                break;
            default:
                i0 cell2 = (i0) obj;
                n nVar3 = (n) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                m.f(cell2, "$this$cell");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((s) nVar3).f(cell2) ? 4 : 2;
                }
                if ((iIntValue3 & 19) == 18) {
                    s sVar4 = (s) nVar3;
                    if (sVar4.F()) {
                        sVar4.W();
                    } else {
                        p.H(cell2, this.f49257b, null, nVar3, iIntValue3 & 14, 2);
                    }
                } else {
                    p.H(cell2, this.f49257b, null, nVar3, iIntValue3 & 14, 2);
                }
                break;
        }
        return b0.f48488a;
    }
}
