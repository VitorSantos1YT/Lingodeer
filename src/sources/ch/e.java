package ch;

import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import h1.k7;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.e2;
import j0.i1;
import j0.z1;
import l1.q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f7023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f7024c;

    public /* synthetic */ e(int i11, fz.a aVar, fz.a aVar2) {
        this.f7022a = i11;
        this.f7023b = aVar;
        this.f7024c = aVar2;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f7022a) {
            case 0:
                j0.v Card = (j0.v) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarC = z1.a.c(sVar, oVar);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    y2.h hVar = y2.j.f56917f;
                    l1.t.J(hVar, q0VarD, sVar);
                    y2.h hVar2 = y2.j.f56916e;
                    l1.t.J(hVar2, q1VarL, sVar);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
                    }
                    y2.h hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC, sVar);
                    z1.h hVar5 = z1.c.P;
                    z1.r rVarE = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 28, 7);
                    j0.u uVarA = j0.t.a(j0.i.f35305c, hVar5, sVar, 48);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    q1 q1VarL2 = sVar.l();
                    z1.r rVarC2 = z1.a.c(sVar, rVarE);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar, uVarA, sVar);
                    l1.t.J(hVar2, q1VarL2, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
                    }
                    l1.t.J(hVar4, rVarC2, sVar);
                    float f5 = 12;
                    float f11 = 32;
                    float f12 = 16;
                    d0.n.c(se.k.y(R.drawable.gp_review_heart, sVar, 0), null, j0.c.y(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, f11, CropImageView.DEFAULT_ASPECT_RATIO, 9), CropImageView.DEFAULT_ASPECT_RATIO, f12, 1), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 440, 120);
                    float f13 = 22;
                    ua.b(ub.a.e0(sVar, R.string.gp_review_title), j0.c.C(oVar, f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), ((s1) sVar.j(v1.f31180a)).f31034q, j3.A(28), null, n3.s.N, null, 0L, new u3.k(3), j3.A(31), 0, false, 0, 0, null, sVar, 199728, 6, 129488);
                    d0.n.c(se.k.y(R.drawable.gp_review_underline, sVar, 0), null, j0.c.y(e2.p(oVar, 220, f13), CropImageView.DEFAULT_ASPECT_RATIO, -8, 1), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 440, 120);
                    float f14 = 5;
                    h.c(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), sVar, 6);
                    h.d(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), sVar, 6);
                    iu.k.e(this.f7024c, e2.e(j0.c.E(oVar, f11, f12, f11, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f), false, 0L, null, a.f7000a, sVar, 196608, 28);
                    sVar.p(true);
                    k7.h(this.f7023b, e2.n(j0.c.E(j0.r.f35391a.a(oVar, z1.c.f58465c), CropImageView.DEFAULT_ASPECT_RATIO, f14, f14, CropImageView.DEFAULT_ASPECT_RATIO, 9), 40), false, null, a.f7001b, sVar, 196608, 28);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                j0.v Card2 = (j0.v) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card2, "$this$Card");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    z1.h hVar6 = z1.c.P;
                    float f15 = 12;
                    z1.o oVar2 = z1.o.f58481a;
                    z1.r rVarC3 = j0.c.C(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, f15, 1);
                    j0.u uVarA2 = j0.t.a(j0.i.f35305c, hVar6, sVar2, 48);
                    int iHashCode3 = Long.hashCode(sVar2.T);
                    q1 q1VarL3 = sVar2.l();
                    z1.r rVarC4 = z1.a.c(sVar2, rVarC3);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar2);
                    } else {
                        sVar2.r0();
                    }
                    y2.h hVar7 = y2.j.f56917f;
                    l1.t.J(hVar7, uVarA2, sVar2);
                    y2.h hVar8 = y2.j.f56916e;
                    l1.t.J(hVar8, q1VarL3, sVar2);
                    y2.h hVar9 = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar9);
                    }
                    y2.h hVar10 = y2.j.f56915d;
                    l1.t.J(hVar10, rVarC4, sVar2);
                    float f16 = 16;
                    ua.b(ub.a.e0(sVar2, R.string.lesson_start_over_or_continue_title), j0.c.E(oVar2, f16, f15, f16, CropImageView.DEFAULT_ASPECT_RATIO, 8), 0L, j3.A(16), null, n3.s.K, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar2, 199680, 0, 130516);
                    z1.r rVarE2 = j0.c.E(j0.c.C(oVar2, f16, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 22, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                    a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar2, 0);
                    int iHashCode4 = Long.hashCode(sVar2.T);
                    q1 q1VarL4 = sVar2.l();
                    z1.r rVarC5 = z1.a.c(sVar2, rVarE2);
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar2);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(hVar7, a2VarA, sVar2);
                    l1.t.J(hVar8, q1VarL4, sVar2);
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar2, iHashCode4, hVar9);
                    }
                    l1.t.J(hVar10, rVarC5, sVar2);
                    fz.a aVar = this.f7023b;
                    boolean zF = sVar2.f(aVar);
                    Object objQ = sVar2.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zF || objQ == gVar) {
                        objQ = new o0(0, aVar);
                        sVar2.o0(objQ);
                    }
                    fz.a aVar2 = (fz.a) objQ;
                    float f17 = 36;
                    z1.r rVarG = e2.g(oVar2, f17);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    iu.k.e(aVar2, rVarG.i(new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), false, 0L, null, a.f7003d, sVar2, 196608, 28);
                    j0.c.g(sVar2, e2.s(oVar2, f16));
                    fz.a aVar3 = this.f7024c;
                    boolean zF2 = sVar2.f(aVar3);
                    Object objQ2 = sVar2.Q();
                    if (zF2 || objQ2 == gVar) {
                        objQ2 = new o0(1, aVar3);
                        sVar2.o0(objQ2);
                    }
                    fz.a aVar4 = (fz.a) objQ2;
                    z1.r rVarG2 = e2.g(oVar2, f17);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    iu.k.e(aVar4, rVarG2.i(new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), false, 0L, null, a.f7004e, sVar2, 196608, 28);
                    sVar2.p(true);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                break;
            default:
                j0.v ModalBottomSheet = (j0.v) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(ModalBottomSheet, "$this$ModalBottomSheet");
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    mt.g.B(0, 0, this.f7023b, this.f7024c, sVar3);
                } else {
                    sVar3.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
