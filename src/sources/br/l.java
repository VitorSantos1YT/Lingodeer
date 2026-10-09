package br;

import a0.k0;
import com.yalantis.ucrop.view.CropImageView;
import h1.k7;
import hh.p0;
import j0.b2;
import j0.e2;
import j0.t1;
import l1.q1;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1.d f5063b;

    public /* synthetic */ l(t1.d dVar, int i11) {
        this.f5062a = i11;
        this.f5063b = dVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f5062a) {
            case 0:
                b2 BaseLearnScreen = (b2) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(BaseLearnScreen, "$this$BaseLearnScreen");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((l1.s) nVar).f(BaseLearnScreen) ? 4 : 2;
                }
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    this.f5063b.invoke(BaseLearnScreen, sVar, Integer.valueOf(iIntValue & 14));
                } else {
                    sVar.W();
                }
                break;
            case 1:
                j0.v Card = (j0.v) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    z1.r rVarB = j0.c.B(e2.d(z1.o.f58481a, 1.0f), 8, 4);
                    q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                    int iHashCode = Long.hashCode(sVar2.T);
                    q1 q1VarL = sVar2.l();
                    z1.r rVarC = z1.a.c(sVar2, rVarB);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar2);
                    p0.x(0, this.f5063b, sVar2, true);
                } else {
                    sVar2.W();
                }
                break;
            case 2:
                j0.v Card2 = (j0.v) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card2, "$this$Card");
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    this.f5063b.invoke(sVar3, 0);
                } else {
                    sVar3.W();
                }
                break;
            case 3:
                t1 paddingValues = (t1) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(paddingValues, "paddingValues");
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((l1.s) nVar4).f(paddingValues) ? 4 : 2;
                }
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    float f5 = 16;
                    z1.r rVarC2 = j0.c.C(j0.c.z(e2.d(z1.o.f58481a, 1.0f), paddingValues), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    j0.u uVarA = j0.t.a(j0.i.g(f5), z1.c.O, sVar4, 6);
                    int iHashCode2 = Long.hashCode(sVar4.T);
                    q1 q1VarL2 = sVar4.l();
                    z1.r rVarC3 = z1.a.c(sVar4, rVarC2);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar2);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar4);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar4);
                    y2.h hVar2 = y2.j.f56918g;
                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC3, sVar4);
                    this.f5063b.invoke(j0.v.f35424a, sVar4, 6);
                    sVar4.p(true);
                } else {
                    sVar4.W();
                }
                break;
            case 4:
                j0.v JPSyllableIntroNoteContainer = (j0.v) obj;
                l1.n nVar5 = (l1.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(JPSyllableIntroNoteContainer, "$this$JPSyllableIntroNoteContainer");
                l1.s sVar5 = (l1.s) nVar5;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    this.f5063b.invoke(sVar5, 0);
                } else {
                    sVar5.W();
                }
                break;
            case 5:
                j0.v JPSyllableIntroSectionColumn = (j0.v) obj;
                l1.n nVar6 = (l1.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(JPSyllableIntroSectionColumn, "$this$JPSyllableIntroSectionColumn");
                l1.s sVar6 = (l1.s) nVar6;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    this.f5063b.invoke(sVar6, 0);
                } else {
                    sVar6.W();
                }
                break;
            case 6:
                k0 AnimatedVisibility = (k0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                r0.e eVarD = r0.f.d(13);
                l1.s sVar7 = (l1.s) ((l1.n) obj2);
                Object objQ = sVar7.Q();
                if (objQ == l1.m.f39353a) {
                    objQ = new ju.d(25);
                    sVar7.o0(objQ);
                }
                k7.d(iu.k.q(24582, 7, (fz.a) objQ, sVar7, z1.o.f58481a, false), eVarD, null, null, null, t1.e.d(-1899061161, new l(this.f5063b, 7), sVar7), sVar7, 196608, 28);
                break;
            default:
                j0.v Card3 = (j0.v) obj;
                l1.n nVar7 = (l1.n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card3, "$this$Card");
                l1.s sVar8 = (l1.s) nVar7;
                if (sVar8.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    this.f5063b.invoke(sVar8, 0);
                } else {
                    sVar8.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
