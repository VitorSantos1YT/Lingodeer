package d1;

import android.graphics.drawable.Drawable;
import com.yalantis.ucrop.view.CropImageView;
import h1.ua;
import j0.e2;
import l1.b3;
import l1.k1;
import s0.n1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22896b;

    public /* synthetic */ e1(Object obj, int i11) {
        this.f22895a = i11;
        this.f22896b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:95:0x020d  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f22895a;
        z1.o oVar = z1.o.f58481a;
        l1.g gVar = l1.m.f39353a;
        int i12 = 2;
        qy.b0 b0Var = qy.b0.f48488a;
        boolean z11 = true;
        Object obj4 = this.f22896b;
        switch (i11) {
            case 0:
                z1.r rVar = (z1.r) obj;
                ((Number) obj3).intValue();
                z0 z0Var = (z0) obj4;
                l1.s sVar = (l1.s) ((l1.n) obj2);
                sVar.d0(1980580247);
                v3.c cVar = (v3.c) sVar.j(z2.g1.f58547h);
                Object objQ = sVar.Q();
                Object obj5 = objQ;
                if (objQ == gVar) {
                    k1 k1VarB = l1.t.B(new v3.l(0L));
                    sVar.o0(k1VarB);
                    obj5 = k1VarB;
                }
                l1.b1 b1Var = (l1.b1) obj5;
                boolean zH = sVar.h(z0Var);
                Object objQ2 = sVar.Q();
                Object obj6 = objQ2;
                if (zH || objQ2 == gVar) {
                    at.f fVar = new at.f(26, z0Var, b1Var);
                    sVar.o0(fVar);
                    obj6 = fVar;
                }
                fz.a aVar = (fz.a) obj6;
                boolean zF = sVar.f(cVar);
                Object objQ3 = sVar.Q();
                Object obj7 = objQ3;
                if (zF || objQ3 == gVar) {
                    d1 d1Var = new d1(cVar, b1Var, 1);
                    sVar.o0(d1Var);
                    obj7 = d1Var;
                }
                b0.p pVar = i0.f22922a;
                z1.r rVarA = z1.a.a(rVar, new d0.b1(z11 ? 1 : 0, aVar, (fz.c) obj7));
                sVar.p(false);
                return rVarA;
            case 1:
                j0.v Card = (j0.v) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Number) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ua.b(((et.n) ((et.o) obj4)).f25895b, j0.c.B(e2.e(oVar, 1.0f), 16, 8), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 48, 0, 131068);
                } else {
                    sVar2.W();
                }
                return b0Var;
            case 2:
                ((Number) obj3).intValue();
                l1.s sVar3 = (l1.s) ((l1.n) obj2);
                sVar3.d0(-1608161351);
                fz.c cVar2 = (fz.c) obj4;
                boolean zF2 = sVar3.f(cVar2);
                Object objQ4 = sVar3.Q();
                Object obj8 = objQ4;
                if (zF2 || objQ4 == gVar) {
                    j0.w wVar = new j0.w(cVar2);
                    sVar3.o0(wVar);
                    obj8 = wVar;
                }
                j0.w wVar2 = (j0.w) obj8;
                sVar3.p(false);
                return wVar2;
            case 3:
                j0.v Card2 = (j0.v) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                tu.k kVar = (tu.k) obj4;
                kotlin.jvm.internal.m.f(Card2, "$this$Card");
                l1.s sVar4 = (l1.s) nVar2;
                if (!sVar4.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    sVar4.W();
                } else if (kVar.f52597d != 0) {
                    sVar4.d0(2046811361);
                    tv.g.a(e2.d(oVar, 1.0f), kVar.f52597d, null, null, false, null, sVar4, 196614, 92);
                    sVar4.p(false);
                } else {
                    sVar4.d0(2047218453);
                    d0.n.c(se.k.y(kVar.f52595b, sVar4, 0), null, e2.d(oVar, 1.0f), null, w2.i.f54517d, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar4, 25008, 104);
                    sVar4.p(false);
                }
                return b0Var;
            case 4:
                sg.q it = (sg.q) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                kotlin.jvm.internal.m.f(it, "it");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((l1.s) nVar3).f(it) ? 4 : 2;
                }
                if ((iIntValue3 & 19) == 18) {
                    l1.s sVar5 = (l1.s) nVar3;
                    if (sVar5.F()) {
                        sVar5.W();
                    } else {
                        se.i.C((tg.i0) obj4, it, nVar3, (iIntValue3 << 3) & 112);
                    }
                } else {
                    se.i.C((tg.i0) obj4, it, nVar3, (iIntValue3 << 3) & 112);
                }
                return b0Var;
            case 5:
                ((Number) obj3).intValue();
                l1.s sVar6 = (l1.s) ((l1.n) obj2);
                sVar6.d0(1582736677);
                v3.c cVar3 = (v3.c) sVar6.j(z2.g1.f58547h);
                n3.h hVar = (n3.h) sVar6.j(z2.g1.f58550k);
                v3.m mVar = (v3.m) sVar6.j(z2.g1.f58552n);
                j3.y0 y0Var = (j3.y0) obj4;
                boolean zF3 = sVar6.f(y0Var) | sVar6.d(mVar.ordinal());
                Object objQ5 = sVar6.Q();
                Object obj9 = objQ5;
                if (zF3 || objQ5 == gVar) {
                    j3.y0 y0VarJ = j3.t.j(y0Var, mVar);
                    sVar6.o0(y0VarJ);
                    obj9 = y0VarJ;
                }
                j3.y0 y0Var2 = (j3.y0) obj9;
                boolean zF4 = sVar6.f(hVar) | sVar6.f(y0Var2);
                Object objQ6 = sVar6.Q();
                Object obj10 = objQ6;
                if (zF4 || objQ6 == gVar) {
                    j3.p0 p0Var = y0Var2.f35827a;
                    n3.i iVar = p0Var.f35759f;
                    n3.s sVar7 = p0Var.f35756c;
                    if (sVar7 == null) {
                        sVar7 = n3.s.f43178t;
                    }
                    n3.o oVar2 = p0Var.f35757d;
                    int i13 = oVar2 != null ? oVar2.f43170a : 0;
                    n3.p pVar2 = p0Var.f35758e;
                    n3.g0 g0VarB = ((n3.j) hVar).b(iVar, sVar7, i13, pVar2 != null ? pVar2.f43171a : 65535);
                    sVar6.o0(g0VarB);
                    obj10 = g0VarB;
                }
                b3 b3Var = (b3) obj10;
                Object objQ7 = sVar6.Q();
                Object obj11 = objQ7;
                if (objQ7 == gVar) {
                    Object value = b3Var.getValue();
                    n1 n1Var = new n1();
                    n1Var.f51113a = mVar;
                    n1Var.f51114b = cVar3;
                    n1Var.f51115c = hVar;
                    n1Var.f51116d = y0Var;
                    n1Var.f51117e = value;
                    n1Var.f51118f = s0.d1.a(y0Var, cVar3, hVar, s0.d1.f51015a, 1);
                    sVar6.o0(n1Var);
                    obj11 = n1Var;
                }
                n1 n1Var2 = (n1) obj11;
                Object value2 = b3Var.getValue();
                if (mVar != n1Var2.f51113a || !kotlin.jvm.internal.m.a(cVar3, n1Var2.f51114b) || !kotlin.jvm.internal.m.a(hVar, n1Var2.f51115c) || !kotlin.jvm.internal.m.a(y0Var2, n1Var2.f51116d) || !kotlin.jvm.internal.m.a(value2, n1Var2.f51117e)) {
                    n1Var2.f51113a = mVar;
                    n1Var2.f51114b = cVar3;
                    n1Var2.f51115c = hVar;
                    n1Var2.f51116d = y0Var2;
                    n1Var2.f51117e = value2;
                    n1Var2.f51118f = s0.d1.a(y0Var2, cVar3, hVar, s0.d1.f51015a, 1);
                }
                boolean zH2 = sVar6.h(n1Var2);
                Object objQ8 = sVar6.Q();
                Object obj12 = objQ8;
                if (zH2 || objQ8 == gVar) {
                    qu.s sVar8 = new qu.s(n1Var2, i12);
                    sVar6.o0(sVar8);
                    obj12 = sVar8;
                }
                z1.r rVarK = w2.a0.k(oVar, (fz.f) obj12);
                sVar6.p(false);
                return rVarK;
            case 6:
                tg.i0 CodeBlock = (tg.i0) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                kotlin.jvm.internal.m.f(CodeBlock, "$this$CodeBlock");
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((l1.s) nVar4).f(CodeBlock) ? 4 : 2;
                }
                if ((iIntValue4 & 19) == 18) {
                    l1.s sVar9 = (l1.s) nVar4;
                    if (sVar9.F()) {
                        sVar9.W();
                    } else {
                        tg.h0.b(CodeBlock, (String) obj4, null, null, 0, false, 0, nVar4, iIntValue4 & 14);
                    }
                } else {
                    tg.h0.b(CodeBlock, (String) obj4, null, null, 0, false, 0, nVar4, iIntValue4 & 14);
                }
                return b0Var;
            case 7:
                long j11 = ((g2.x) obj).f28624a;
                l1.n nVar5 = (l1.n) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((l1.s) nVar5).e(j11) ? 4 : 2;
                }
                l1.s sVar10 = (l1.s) nVar5;
                if (sVar10.T(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x0.l.b(((v0.d) obj4).f53455c, j11, sVar10, (iIntValue5 << 3) & 112);
                } else {
                    sVar10.W();
                }
                return b0Var;
            default:
                long j12 = ((g2.x) obj).f28624a;
                l1.n nVar6 = (l1.n) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                l1.s sVar11 = (l1.s) nVar6;
                if (sVar11.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x0.r.f55620a.b((Drawable) obj4, sVar11, 48);
                } else {
                    sVar11.W();
                }
                return b0Var;
        }
    }
}
