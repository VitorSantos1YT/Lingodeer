package at;

import a0.k0;
import com.google.api.Service;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import dt.a0;
import fr.j3;
import g2.f0;
import g2.x;
import h1.k7;
import h1.r4;
import h1.s1;
import h1.ua;
import h1.v1;
import i0.pKy.shrCcjmOhAmRC;
import j0.a2;
import j0.b2;
import j0.e2;
import j0.v;
import j0.z1;
import l1.c3;
import l1.q1;
import l1.t;
import qy.b0;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2854a;

    public /* synthetic */ a(int i11) {
        this.f2854a = i11;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f2854a) {
            case 0:
                k0 AnimatedVisibility = (k0) obj;
                l1.n nVar = (l1.n) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                d0.n.c(se.k.y(R.drawable.ic_learn_lesson_open_tag, nVar, 0), null, d2.h.i(j0.c.E(z1.o.f58481a, 20, 12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12), iu.k.p(nVar), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, nVar, 48, 120);
                break;
            case 1:
                b2 SwipeToDismissBox = (b2) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(SwipeToDismissBox, "$this$SwipeToDismissBox");
                l1.s sVar = (l1.s) nVar2;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    c3 c3Var = v1.f31180a;
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarH = d0.n.h(e2.g(e2.e(j0.c.B(oVar, 18, 8), 1.0f), 84), ((s1) sVar.j(c3Var)).f31040w, f0.f28556b);
                    q0 q0VarD = j0.o.d(z1.c.f58468f, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarH);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    t.J(y2.j.f56917f, q0VarD, sVar);
                    t.J(y2.j.f56916e, q1VarL, sVar);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    t.J(y2.j.f56915d, rVarC, sVar);
                    ua.b(ub.a.e0(sVar, R.string.delete_course), j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 24, CropImageView.DEFAULT_ASPECT_RATIO, 11), ((s1) sVar.j(c3Var)).f31041x, 0L, null, n3.s.L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 196656, 0, 131032);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                return b0.f48488a;
            case 2:
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f((b2) obj, shrCcjmOhAmRC.VvDqgDq);
                l1.s sVar2 = (l1.s) nVar3;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    iu.k.n(ub.a.e0(sVar2, R.string.remove), null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, sVar2, 0, 0, 131070);
                } else {
                    sVar2.W();
                }
                return b0.f48488a;
            case 3:
                b2 TextButton = (b2) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton, "$this$TextButton");
                l1.s sVar3 = (l1.s) nVar4;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    iu.k.n(ub.a.e0(sVar3, R.string.cancel), null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131070);
                } else {
                    sVar3.W();
                }
                return b0.f48488a;
            case 4:
                v OutlinedCard = (v) obj;
                l1.n nVar5 = (l1.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedCard, "$this$OutlinedCard");
                l1.s sVar4 = (l1.s) nVar5;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    z1.r rVarD = e2.d(z1.o.f58481a, 1.0f);
                    a2 a2VarA = z1.a(j0.i.h(16), z1.c.M, sVar4, 54);
                    int iHashCode2 = Long.hashCode(sVar4.T);
                    q1 q1VarL2 = sVar4.l();
                    z1.r rVarC2 = z1.a.c(sVar4, rVarD);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar2);
                    } else {
                        sVar4.r0();
                    }
                    t.J(y2.j.f56917f, a2VarA, sVar4);
                    t.J(y2.j.f56916e, q1VarL2, sVar4);
                    y2.h hVar2 = y2.j.f56918g;
                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar2);
                    }
                    t.J(y2.j.f56915d, rVarC2, sVar4);
                    k2.b bVarY = se.k.y(R.drawable.ic_add_a_course, sVar4, 0);
                    c3 c3Var2 = v1.f31180a;
                    d0.n.c(bVarY, null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(x.c(((s1) sVar4.j(c3Var2)).f31034q, 0.15f), 5), sVar4, 56, 60);
                    ua.b(ub.a.e0(sVar4, R.string.add_a_course), null, x.c(((s1) sVar4.j(c3Var2)).f31034q, 0.15f), 0L, null, n3.s.L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 196608, 0, 131034);
                    sVar4.p(true);
                } else {
                    sVar4.W();
                }
                return b0.f48488a;
            case 5:
                b2 AppGradientButton = (b2) obj;
                l1.n nVar6 = (l1.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton, "$this$AppGradientButton");
                l1.s sVar5 = (l1.s) nVar6;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar5, R.string.confirm), null, null, sVar5, 0, 6);
                } else {
                    sVar5.W();
                }
                return b0.f48488a;
            case 6:
                v Card = (v) obj;
                l1.n nVar7 = (l1.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar6 = (l1.s) nVar7;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    ua.b(ub.a.e0(sVar6, R.string.lingodeer_is_required_to_verify_your_age_in_order_to_meet_new_data_protection_policies), j0.c.A(z1.o.f58481a, 16), 0L, j3.A(18), null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar6, 3120, 0, 130548);
                } else {
                    sVar6.W();
                }
                return b0.f48488a;
            case 7:
                b2 AppGradientButton2 = (b2) obj;
                l1.n nVar8 = (l1.n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton2, "$this$AppGradientButton");
                l1.s sVar7 = (l1.s) nVar8;
                if (sVar7.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar7, R.string.next), null, null, sVar7, 0, 6);
                } else {
                    sVar7.W();
                }
                return b0.f48488a;
            case 8:
                b2 AppGradientButton3 = (b2) obj;
                l1.n nVar9 = (l1.n) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton3, "$this$AppGradientButton");
                l1.s sVar8 = (l1.s) nVar9;
                if (sVar8.T(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar8, R.string.next), null, null, sVar8, 0, 6);
                } else {
                    sVar8.W();
                }
                return b0.f48488a;
            case 9:
                v Card2 = (v) obj;
                l1.n nVar10 = (l1.n) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card2, "$this$Card");
                l1.s sVar9 = (l1.s) nVar10;
                if (sVar9.T(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    r4.b(se.k.y(R.drawable.close_24px, sVar9, 0), null, e2.d(j0.c.A(z1.o.f58481a, 4), 1.0f), ((s1) sVar9.j(v1.f31180a)).f31034q, sVar9, 440, 0);
                } else {
                    sVar9.W();
                }
                return b0.f48488a;
            case 10:
                k0 AnimatedVisibility2 = (k0) obj;
                l1.n nVar11 = (l1.n) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility2, "$this$AnimatedVisibility");
                k7.g(null, (float) 0.5d, x.c(((s1) ((l1.s) nVar11).j(v1.f31180a)).B, 0.2f), nVar11, 48, 1);
                break;
            case 11:
                v CourseTestChallengeBaseSentenceTitle = (v) obj;
                l1.n nVar12 = (l1.n) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(CourseTestChallengeBaseSentenceTitle, "$this$CourseTestChallengeBaseSentenceTitle");
                l1.s sVar10 = (l1.s) nVar12;
                if (!sVar10.T(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    sVar10.W();
                }
                return b0.f48488a;
            case 12:
                j0.q CourseTestModelClickableBox = (j0.q) obj;
                l1.n nVar13 = (l1.n) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(CourseTestModelClickableBox, "$this$CourseTestModelClickableBox");
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= ((l1.s) nVar13).f(CourseTestModelClickableBox) ? 4 : 2;
                }
                l1.s sVar11 = (l1.s) nVar13;
                if (sVar11.T(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    a0.m(CourseTestModelClickableBox.a(z1.o.f58481a, z1.c.H), x.f28618e, false, sVar11, 48, 4);
                } else {
                    sVar11.W();
                }
                return b0.f48488a;
            case 13:
                v Card3 = (v) obj;
                l1.n nVar14 = (l1.n) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card3, "$this$Card");
                l1.s sVar12 = (l1.s) nVar14;
                if (!sVar12.T(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    sVar12.W();
                }
                return b0.f48488a;
            case 14:
                v Card4 = (v) obj;
                l1.n nVar15 = (l1.n) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card4, "$this$Card");
                l1.s sVar13 = (l1.s) nVar15;
                if (!sVar13.T(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    sVar13.W();
                }
                return b0.f48488a;
            case 15:
                l0.c item = (l0.c) obj;
                l1.n nVar16 = (l1.n) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar14 = (l1.s) nVar16;
                if (sVar14.T(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    j0.c.g(sVar14, e2.g(z1.o.f58481a, 7));
                } else {
                    sVar14.W();
                }
                return b0.f48488a;
            case 16:
                l0.c item2 = (l0.c) obj;
                l1.n nVar17 = (l1.n) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item2, "$this$item");
                l1.s sVar15 = (l1.s) nVar17;
                if (sVar15.T(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    j0.c.g(sVar15, e2.g(z1.o.f58481a, 7));
                } else {
                    sVar15.W();
                }
                return b0.f48488a;
            case 17:
                v CourseTestChallengeBaseSentenceTitle2 = (v) obj;
                l1.n nVar18 = (l1.n) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(CourseTestChallengeBaseSentenceTitle2, "$this$CourseTestChallengeBaseSentenceTitle");
                l1.s sVar16 = (l1.s) nVar18;
                if (!sVar16.T(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    sVar16.W();
                }
                return b0.f48488a;
            case 18:
                j0.q CourseTestModelClickableBox2 = (j0.q) obj;
                l1.n nVar19 = (l1.n) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(CourseTestModelClickableBox2, "$this$CourseTestModelClickableBox");
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= ((l1.s) nVar19).f(CourseTestModelClickableBox2) ? 4 : 2;
                }
                l1.s sVar17 = (l1.s) nVar19;
                if (sVar17.T(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                    a0.m(CourseTestModelClickableBox2.a(z1.o.f58481a, z1.c.H), x.f28618e, false, sVar17, 48, 4);
                } else {
                    sVar17.W();
                }
                return b0.f48488a;
            case 19:
                v OutlinedCard2 = (v) obj;
                l1.n nVar20 = (l1.n) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedCard2, "$this$OutlinedCard");
                l1.s sVar18 = (l1.s) nVar20;
                if (sVar18.T(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    z1.o oVar2 = z1.o.f58481a;
                    z1.r rVarD2 = e2.d(oVar2, 1.0f);
                    q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
                    int iHashCode3 = Long.hashCode(sVar18.T);
                    q1 q1VarL3 = sVar18.l();
                    z1.r rVarC3 = z1.a.c(sVar18, rVarD2);
                    y2.k.J.getClass();
                    y2.i iVar3 = y2.j.f56913b;
                    sVar18.h0();
                    if (sVar18.S) {
                        sVar18.k(iVar3);
                    } else {
                        sVar18.r0();
                    }
                    t.J(y2.j.f56917f, q0VarD2, sVar18);
                    t.J(y2.j.f56916e, q1VarL3, sVar18);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar18.S || !kotlin.jvm.internal.m.a(sVar18.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar18, iHashCode3, hVar3);
                    }
                    t.J(y2.j.f56915d, rVarC3, sVar18);
                    r4.b(se.k.y(R.drawable.close_24px, sVar18, 0), null, e2.n(oVar2, 32), ob.f.y((s1) sVar18.j(v1.f31180a), sVar18), sVar18, 432, 0);
                    sVar18.p(true);
                } else {
                    sVar18.W();
                }
                return b0.f48488a;
            case 20:
                v OutlinedCard3 = (v) obj;
                l1.n nVar21 = (l1.n) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedCard3, "$this$OutlinedCard");
                l1.s sVar19 = (l1.s) nVar21;
                if (sVar19.T(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    z1.o oVar3 = z1.o.f58481a;
                    z1.r rVarD3 = e2.d(oVar3, 1.0f);
                    q0 q0VarD3 = j0.o.d(z1.c.f58467e, false);
                    int iHashCode4 = Long.hashCode(sVar19.T);
                    q1 q1VarL4 = sVar19.l();
                    z1.r rVarC4 = z1.a.c(sVar19, rVarD3);
                    y2.k.J.getClass();
                    y2.i iVar4 = y2.j.f56913b;
                    sVar19.h0();
                    if (sVar19.S) {
                        sVar19.k(iVar4);
                    } else {
                        sVar19.r0();
                    }
                    t.J(y2.j.f56917f, q0VarD3, sVar19);
                    t.J(y2.j.f56916e, q1VarL4, sVar19);
                    y2.h hVar4 = y2.j.f56918g;
                    if (sVar19.S || !kotlin.jvm.internal.m.a(sVar19.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar19, iHashCode4, hVar4);
                    }
                    t.J(y2.j.f56915d, rVarC4, sVar19);
                    r4.b(se.k.y(R.drawable.check_24px, sVar19, 0), null, e2.n(oVar3, 32), ob.f.w((s1) sVar19.j(v1.f31180a), sVar19), sVar19, 432, 0);
                    sVar19.p(true);
                } else {
                    sVar19.W();
                }
                return b0.f48488a;
            case 21:
                k0 AnimatedVisibility3 = (k0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility3, "$this$AnimatedVisibility");
                z1.r rVarA = j0.r.f35391a.a(e2.n(z1.o.f58481a, 16), z1.c.f58465c);
                l1.s sVar20 = (l1.s) ((l1.n) obj2);
                Object objQ = sVar20.Q();
                if (objQ == l1.m.f39353a) {
                    objQ = new br.b(11);
                    sVar20.o0(objQ);
                }
                d0.n.b(48, (fz.c) objQ, sVar20, rVarA);
                break;
            case 22:
                b2 AppGradientButton4 = (b2) obj;
                l1.n nVar22 = (l1.n) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton4, "$this$AppGradientButton");
                l1.s sVar21 = (l1.s) nVar22;
                if (sVar21.T(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    ua.b(ub.a.e0(sVar21, R.string.gp_review_confirm), null, 0L, j3.A(18), null, n3.s.M, null, 0L, null, 0L, 0, false, 0, 0, null, sVar21, 199680, 0, 131030);
                } else {
                    sVar21.W();
                }
                return b0.f48488a;
            case 23:
                b2 AppGradientButton5 = (b2) obj;
                l1.n nVar23 = (l1.n) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton5, "$this$AppGradientButton");
                l1.s sVar22 = (l1.s) nVar23;
                if (sVar22.T(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    iu.k.d("Claim XP", null, null, sVar22, 6, 6);
                } else {
                    sVar22.W();
                }
                return b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                b2 AppGradientButton6 = (b2) obj;
                l1.n nVar24 = (l1.n) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton6, "$this$AppGradientButton");
                l1.s sVar23 = (l1.s) nVar24;
                if (sVar23.T(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    a2 a2VarA2 = z1.a(j0.i.g(4), z1.c.M, sVar23, 54);
                    int iHashCode5 = Long.hashCode(sVar23.T);
                    q1 q1VarL5 = sVar23.l();
                    z1.o oVar4 = z1.o.f58481a;
                    z1.r rVarC5 = z1.a.c(sVar23, oVar4);
                    y2.k.J.getClass();
                    y2.i iVar5 = y2.j.f56913b;
                    sVar23.h0();
                    if (sVar23.S) {
                        sVar23.k(iVar5);
                    } else {
                        sVar23.r0();
                    }
                    t.J(y2.j.f56917f, a2VarA2, sVar23);
                    t.J(y2.j.f56916e, q1VarL5, sVar23);
                    y2.h hVar5 = y2.j.f56918g;
                    if (sVar23.S || !kotlin.jvm.internal.m.a(sVar23.Q(), Integer.valueOf(iHashCode5))) {
                        defpackage.e.A(iHashCode5, sVar23, iHashCode5, hVar5);
                    }
                    t.J(y2.j.f56915d, rVarC5, sVar23);
                    r4.b(se.k.y(R.drawable.refresh_24px, sVar23, 0), null, e2.n(oVar4, 20), ((s1) sVar23.j(v1.f31180a)).f31019b, sVar23, 440, 0);
                    iu.k.n(ub.a.e0(sVar23, R.string.lesson_start_over), null, 0L, 0L, n3.s.K, 0L, 0L, 0, false, 0, 0, null, sVar23, 196608, 0, 131038);
                    sVar23.p(true);
                } else {
                    sVar23.W();
                }
                return b0.f48488a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                b2 AppGradientButton7 = (b2) obj;
                l1.n nVar25 = (l1.n) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton7, "$this$AppGradientButton");
                l1.s sVar24 = (l1.s) nVar25;
                if (sVar24.T(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    a2 a2VarA3 = z1.a(j0.i.g(4), z1.c.M, sVar24, 54);
                    int iHashCode6 = Long.hashCode(sVar24.T);
                    q1 q1VarL6 = sVar24.l();
                    z1.o oVar5 = z1.o.f58481a;
                    z1.r rVarC6 = z1.a.c(sVar24, oVar5);
                    y2.k.J.getClass();
                    y2.i iVar6 = y2.j.f56913b;
                    sVar24.h0();
                    if (sVar24.S) {
                        sVar24.k(iVar6);
                    } else {
                        sVar24.r0();
                    }
                    t.J(y2.j.f56917f, a2VarA3, sVar24);
                    t.J(y2.j.f56916e, q1VarL6, sVar24);
                    y2.h hVar6 = y2.j.f56918g;
                    if (sVar24.S || !kotlin.jvm.internal.m.a(sVar24.Q(), Integer.valueOf(iHashCode6))) {
                        defpackage.e.A(iHashCode6, sVar24, iHashCode6, hVar6);
                    }
                    t.J(y2.j.f56915d, rVarC6, sVar24);
                    r4.b(se.k.y(R.drawable.arrow_forward_24px, sVar24, 0), null, e2.n(oVar5, 20), ((s1) sVar24.j(v1.f31180a)).f31019b, sVar24, 440, 0);
                    iu.k.n(ub.a.e0(sVar24, R.string.lesson_continue), null, 0L, 0L, n3.s.K, 0L, 0L, 0, false, 0, 0, null, sVar24, 196608, 0, 131038);
                    sVar24.p(true);
                } else {
                    sVar24.W();
                }
                return b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                b2 TextButton2 = (b2) obj;
                l1.n nVar26 = (l1.n) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton2, "$this$TextButton");
                l1.s sVar25 = (l1.s) nVar26;
                if (sVar25.T(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    ua.b(ub.a.e0(sVar25, R.string.f22251ok), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar25, 0, 0, 131070);
                } else {
                    sVar25.W();
                }
                return b0.f48488a;
            case 27:
                j0.q CourseTestModelClickableBox3 = (j0.q) obj;
                l1.n nVar27 = (l1.n) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(CourseTestModelClickableBox3, "$this$CourseTestModelClickableBox");
                if ((iIntValue25 & 6) == 0) {
                    iIntValue25 |= ((l1.s) nVar27).f(CourseTestModelClickableBox3) ? 4 : 2;
                }
                l1.s sVar26 = (l1.s) nVar27;
                if (sVar26.T(iIntValue25 & 1, (iIntValue25 & 19) != 18)) {
                    j0.o.a(CourseTestModelClickableBox3.a(d0.n.h(e2.n(z1.o.f58481a, 25), ((s1) sVar26.j(v1.f31180a)).f31033p, r0.f.d(6)), z1.c.f58467e), sVar26, 0);
                } else {
                    sVar26.W();
                }
                return b0.f48488a;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                b2 TextButton3 = (b2) obj;
                l1.n nVar28 = (l1.n) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton3, "$this$TextButton");
                l1.s sVar27 = (l1.s) nVar28;
                if (sVar27.T(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    ua.b(ub.a.e0(sVar27, R.string.tell_me_why_feedback_regen_ok), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar27, 0, 0, 131070);
                } else {
                    sVar27.W();
                }
                return b0.f48488a;
            default:
                b2 TextButton4 = (b2) obj;
                l1.n nVar29 = (l1.n) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton4, "$this$TextButton");
                l1.s sVar28 = (l1.s) nVar29;
                if (sVar28.T(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    ua.b(ub.a.e0(sVar28, R.string.tell_me_why_feedback_regen_cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar28, 0, 0, 131070);
                } else {
                    sVar28.W();
                }
                return b0.f48488a;
        }
        return b0.f48488a;
    }
}
