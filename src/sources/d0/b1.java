package d0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import l1.b3;
import qp.n2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22643c;

    public /* synthetic */ b1(int i11, Object obj, Object obj2) {
        this.f22641a = i11;
        this.f22642b = obj;
        this.f22643c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:33:0x0087  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b7  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        l1.s sVar;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        switch (this.f22641a) {
            case 0:
                ((Number) obj3).intValue();
                l1.s sVar2 = (l1.s) ((l1.n) obj2);
                sVar2.d0(-353972293);
                a1 a1VarA = ((z0) this.f22642b).a((h0.i) this.f22643c, sVar2);
                boolean zF = sVar2.f(a1VarA);
                Object objQ = sVar2.Q();
                if (zF || objQ == l1.m.f39353a) {
                    objQ = new d1(a1VarA);
                    sVar2.o0(objQ);
                }
                d1 d1Var = (d1) objQ;
                sVar2.p(false);
                return d1Var;
            case 1:
                ((Number) obj3).intValue();
                l1.s sVar3 = (l1.s) ((l1.n) obj2);
                sVar3.d0(759876635);
                fz.a aVar = (fz.a) this.f22642b;
                Object objQ2 = sVar3.Q();
                l1.g gVar = l1.m.f39353a;
                if (objQ2 == gVar) {
                    objQ2 = l1.t.s(aVar);
                    sVar3.o0(objQ2);
                }
                b3 b3Var = (b3) objQ2;
                Object objQ3 = sVar3.Q();
                if (objQ3 == gVar) {
                    objQ3 = new b0.d(new f2.b(((f2.b) b3Var.getValue()).f26570a), d1.i0.f22923b, new f2.b(d1.i0.f22924c), 8);
                    sVar3.o0(objQ3);
                }
                b0.d dVar = (b0.d) objQ3;
                boolean zH = sVar3.h(dVar);
                Object objQ4 = sVar3.Q();
                if (zH || objQ4 == gVar) {
                    objQ4 = new a0.e0(16, b3Var, dVar, (vy.d) null);
                    sVar3.o0(objQ4);
                }
                l1.t.f((fz.e) objQ4, qy.b0.f48488a, sVar3);
                b0.n nVar = dVar.f3472c;
                fz.c cVar = (fz.c) this.f22643c;
                boolean zF2 = sVar3.f(nVar);
                Object objQ5 = sVar3.Q();
                if (zF2 || objQ5 == gVar) {
                    objQ5 = new d1.h0(nVar, 0);
                    sVar3.o0(objQ5);
                }
                z1.r rVar = (z1.r) cVar.invoke((fz.a) objQ5);
                sVar3.p(false);
                return rVar;
            case 2:
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue = ((Number) obj3).intValue();
                l1.s sVar4 = (l1.s) nVar2;
                if (sVar4.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    Object objQ6 = sVar4.Q();
                    if (objQ6 == l1.m.f39353a) {
                        objQ6 = new e0.e();
                        sVar4.o0(objQ6);
                    }
                    e0.e eVar = (e0.e) objQ6;
                    fz.c cVar2 = (fz.c) this.f22642b;
                    e0.c cVar3 = (e0.c) this.f22643c;
                    eVar.f24645a.clear();
                    cVar2.invoke(eVar);
                    eVar.a(cVar3, sVar4, 0);
                } else {
                    sVar4.W();
                }
                return qy.b0.f48488a;
            case 3:
                tg.i0 BlockQuote = (tg.i0) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                kotlin.jvm.internal.m.f(BlockQuote, "$this$BlockQuote");
                if ((iIntValue2 & 17) == 16) {
                    l1.s sVar5 = (l1.s) nVar3;
                    if (sVar5.F()) {
                        sVar5.W();
                    } else {
                        ((t1.d) this.f22642b).invoke((sg.q) this.f22643c, nVar3, 0);
                    }
                } else {
                    ((t1.d) this.f22642b).invoke((sg.q) this.f22643c, nVar3, 0);
                }
                return qy.b0.f48488a;
            case 4:
                ((Number) obj3).intValue();
                h0.i iVar2 = (h0.i) this.f22643c;
                l1.s sVar6 = (l1.s) ((l1.n) obj2);
                sVar6.d0(-102778667);
                Object objQ7 = sVar6.Q();
                l1.g gVar2 = l1.m.f39353a;
                if (objQ7 == gVar2) {
                    objQ7 = l1.t.q(sVar6);
                    sVar6.o0(objQ7);
                }
                rz.b0 b0Var = (rz.b0) objQ7;
                Object objQ8 = sVar6.Q();
                if (objQ8 == gVar2) {
                    objQ8 = l1.t.B(null);
                    sVar6.o0(objQ8);
                }
                l1.b1 b1Var = (l1.b1) objQ8;
                l1.b1 b1VarH = l1.t.H((fz.c) this.f22642b, sVar6);
                boolean zF3 = sVar6.f(iVar2);
                Object objQ9 = sVar6.Q();
                if (zF3 || objQ9 == gVar2) {
                    objQ9 = new n2(14, b1Var, iVar2);
                    sVar6.o0(objQ9);
                }
                l1.t.c(iVar2, (fz.c) objQ9, sVar6);
                boolean zH2 = sVar6.h(b0Var) | sVar6.f(iVar2) | sVar6.f(b1VarH);
                Object objQ10 = sVar6.Q();
                if (zH2 || objQ10 == gVar2) {
                    objQ10 = new fu.j(b0Var, b1Var, iVar2, b1VarH);
                    sVar6.o0(objQ10);
                }
                z1.r rVarA = s2.g0.a(z1.o.f58481a, iVar2, (PointerInputEventHandler) objQ10);
                sVar6.p(false);
                return rVarA;
            case 5:
                tg.i0 WithStyle = (tg.i0) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                kotlin.jvm.internal.m.f(WithStyle, "$this$WithStyle");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((l1.s) nVar4).f(WithStyle) ? 4 : 2;
                }
                if ((iIntValue3 & 19) == 18) {
                    l1.s sVar7 = (l1.s) nVar4;
                    if (sVar7.F()) {
                        sVar7.W();
                    } else {
                        int i11 = iIntValue3 & 14;
                        tg.j0 j0VarC = tg.k0.c(tg.k0.b(WithStyle, nVar4));
                        sVar = (l1.s) nVar4;
                        v3.c cVar4 = (v3.c) sVar.j(z2.g1.f58547h);
                        v3.o oVar = j0VarC.f52299a;
                        kotlin.jvm.internal.m.c(oVar);
                        float fW = cVar4.w(oVar.f53502a);
                        z1.r rVar2 = (z1.r) this.f22642b;
                        j0.g gVarG = j0.i.g(fW);
                        fz.f fVar = (fz.f) this.f22643c;
                        j0.u uVarA = j0.t.a(gVarG, z1.c.O, sVar, 0);
                        iHashCode = Long.hashCode(sVar.T);
                        l1.q1 q1VarL = sVar.l();
                        z1.r rVarC = z1.a.c(sVar, rVar2);
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, uVarA, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC, sVar);
                        fVar.invoke(WithStyle, sVar, Integer.valueOf(i11));
                        sVar.p(true);
                    }
                } else {
                    int i12 = iIntValue3 & 14;
                    tg.j0 j0VarC2 = tg.k0.c(tg.k0.b(WithStyle, nVar4));
                    sVar = (l1.s) nVar4;
                    v3.c cVar5 = (v3.c) sVar.j(z2.g1.f58547h);
                    v3.o oVar2 = j0VarC2.f52299a;
                    kotlin.jvm.internal.m.c(oVar2);
                    float fW2 = cVar5.w(oVar2.f53502a);
                    z1.r rVar3 = (z1.r) this.f22642b;
                    j0.g gVarG2 = j0.i.g(fW2);
                    fz.f fVar2 = (fz.f) this.f22643c;
                    j0.u uVarA2 = j0.t.a(gVarG2, z1.c.O, sVar, 0);
                    iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL2 = sVar.l();
                    z1.r rVarC2 = z1.a.c(sVar, rVar3);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA2, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar);
                    fVar2.invoke(WithStyle, sVar, Integer.valueOf(i12));
                    sVar.p(true);
                }
                return qy.b0.f48488a;
            default:
                int iIntValue4 = ((Number) obj).intValue();
                l1.n nVar5 = (l1.n) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((l1.s) nVar5).d(iIntValue4) ? 4 : 2;
                }
                if ((iIntValue5 & 19) == 18) {
                    l1.s sVar8 = (l1.s) nVar5;
                    if (sVar8.F()) {
                        sVar8.W();
                    } else {
                        tg.i0 i0Var = (tg.i0) this.f22642b;
                        String[] strArr = (String[]) this.f22643c;
                        tg.h0.b(i0Var, strArr[iIntValue4 % strArr.length], null, null, 0, false, 0, nVar5, 0);
                    }
                } else {
                    tg.i0 i0Var2 = (tg.i0) this.f22642b;
                    String[] strArr2 = (String[]) this.f22643c;
                    tg.h0.b(i0Var2, strArr2[iIntValue4 % strArr2.length], null, null, 0, false, 0, nVar5, 0);
                }
                return qy.b0.f48488a;
        }
    }
}
