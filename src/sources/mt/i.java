package mt;

import com.google.api.Service;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import h1.dc;
import h1.fc;
import h1.ua;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41535a;

    public /* synthetic */ i(int i11) {
        this.f41535a = i11;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f41535a) {
            case 0:
                j0.b2 TextButton = (j0.b2) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton, "$this$TextButton");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ua.b(ub.a.e0(sVar, R.string.srs_future_reviews_action_show), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131070);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 1:
                j0.b2 TextButton2 = (j0.b2) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton2, "$this$TextButton");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ua.b(ub.a.e0(sVar2, R.string.srs_future_reviews_action_adjust), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 0, 0, 131070);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
            case 2:
                j0.b2 TextButton3 = (j0.b2) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton3, "$this$TextButton");
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ua.b(ub.a.e0(sVar3, R.string.srs_future_reviews_action_hide), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131070);
                } else {
                    sVar3.W();
                }
                return qy.b0.f48488a;
            case 3:
                j0.b2 TextButton4 = (j0.b2) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton4, "$this$TextButton");
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    ua.b(ub.a.e0(sVar4, R.string.cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 0, 0, 131070);
                } else {
                    sVar4.W();
                }
                return qy.b0.f48488a;
            case 4:
                j0.b2 AppGradientButton = (j0.b2) obj;
                l1.n nVar5 = (l1.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton, "$this$AppGradientButton");
                l1.s sVar5 = (l1.s) nVar5;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar5, R.string.retry), null, null, sVar5, 0, 6);
                } else {
                    sVar5.W();
                }
                return qy.b0.f48488a;
            case 5:
                j0.b2 AppGradientButton2 = (j0.b2) obj;
                l1.n nVar6 = (l1.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton2, "$this$AppGradientButton");
                l1.s sVar6 = (l1.s) nVar6;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar6, R.string.srs_start), null, null, sVar6, 0, 6);
                } else {
                    sVar6.W();
                }
                return qy.b0.f48488a;
            case 6:
                j0.b2 OutlinedButton = (j0.b2) obj;
                l1.n nVar7 = (l1.n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedButton, "$this$OutlinedButton");
                l1.s sVar7 = (l1.s) nVar7;
                if (sVar7.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar7, R.string.srs_customize), null, null, sVar7, 0, 6);
                } else {
                    sVar7.W();
                }
                return qy.b0.f48488a;
            case 7:
                j0.b2 AppGradientButton3 = (j0.b2) obj;
                l1.n nVar8 = (l1.n) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton3, "$this$AppGradientButton");
                l1.s sVar8 = (l1.s) nVar8;
                if (sVar8.T(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar8, R.string.start), null, null, sVar8, 0, 6);
                } else {
                    sVar8.W();
                }
                return qy.b0.f48488a;
            case 8:
                j0.b2 AppGradientButton4 = (j0.b2) obj;
                l1.n nVar9 = (l1.n) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton4, "$this$AppGradientButton");
                l1.s sVar9 = (l1.s) nVar9;
                if (sVar9.T(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar9, R.string.confirm), null, null, sVar9, 0, 6);
                } else {
                    sVar9.W();
                }
                return qy.b0.f48488a;
            case 9:
                j0.b2 TextButton5 = (j0.b2) obj;
                l1.n nVar10 = (l1.n) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton5, "$this$TextButton");
                l1.s sVar10 = (l1.s) nVar10;
                if (sVar10.T(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar10, R.string.cancel), null, null, sVar10, 0, 6);
                } else {
                    sVar10.W();
                }
                return qy.b0.f48488a;
            case 10:
                j0.b2 TextButton6 = (j0.b2) obj;
                l1.n nVar11 = (l1.n) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton6, "$this$TextButton");
                l1.s sVar11 = (l1.s) nVar11;
                if (sVar11.T(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    ua.b(ub.a.e0(sVar11, R.string.confirm), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar11, 0, 0, 131070);
                } else {
                    sVar11.W();
                }
                return qy.b0.f48488a;
            case 11:
                j0.b2 TextButton7 = (j0.b2) obj;
                l1.n nVar12 = (l1.n) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton7, "$this$TextButton");
                l1.s sVar12 = (l1.s) nVar12;
                if (sVar12.T(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    ua.b(ub.a.e0(sVar12, R.string.cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar12, 0, 0, 131070);
                } else {
                    sVar12.W();
                }
                return qy.b0.f48488a;
            case 12:
                a0.k0 AnimatedVisibility = (a0.k0) obj;
                l1.n nVar13 = (l1.n) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                k2.b bVarY = se.k.y(R.drawable.course_srs_flashcard_answer_placehold, nVar13, 0);
                l1.s sVar13 = (l1.s) nVar13;
                g2.p pVar = new g2.p(((h1.s1) sVar13.j(h1.v1.f31180a)).A, 5);
                Object objQ = sVar13.Q();
                if (objQ == l1.m.f39353a) {
                    objQ = new lt.d(15);
                    sVar13.o0(objQ);
                }
                d0.n.c(bVarY, null, g2.f0.q(z1.o.f58481a, (fz.c) objQ), null, null, CropImageView.DEFAULT_ASPECT_RATIO, pVar, sVar13, 432, 56);
                break;
            case 13:
                j0.b2 AppGradientButton5 = (j0.b2) obj;
                l1.n nVar14 = (l1.n) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton5, "$this$AppGradientButton");
                l1.s sVar14 = (l1.s) nVar14;
                if (sVar14.T(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar14, R.string.show_answer), null, null, sVar14, 0, 6);
                } else {
                    sVar14.W();
                }
                return qy.b0.f48488a;
            case 14:
                j0.b2 AppGradientButton6 = (j0.b2) obj;
                l1.n nVar15 = (l1.n) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton6, "$this$AppGradientButton");
                l1.s sVar15 = (l1.s) nVar15;
                if (sVar15.T(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar15, R.string.confirm), null, null, sVar15, 0, 6);
                } else {
                    sVar15.W();
                }
                return qy.b0.f48488a;
            case 15:
                l0.c item = (l0.c) obj;
                l1.n nVar16 = (l1.n) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar16 = (l1.s) nVar16;
                if (sVar16.T(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    j0.c.g(sVar16, j0.e2.g(z1.o.f58481a, 4));
                } else {
                    sVar16.W();
                }
                return qy.b0.f48488a;
            case 16:
                l0.c item2 = (l0.c) obj;
                l1.n nVar17 = (l1.n) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item2, "$this$item");
                l1.s sVar17 = (l1.s) nVar17;
                if (sVar17.T(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    j0.c.g(sVar17, j0.e2.g(z1.o.f58481a, 32));
                } else {
                    sVar17.W();
                }
                return qy.b0.f48488a;
            case 17:
                j0.b2 AppGradientButton7 = (j0.b2) obj;
                l1.n nVar18 = (l1.n) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton7, "$this$AppGradientButton");
                l1.s sVar18 = (l1.s) nVar18;
                if (sVar18.T(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar18, R.string.srs_customize_suggestion_prompt_review), null, null, sVar18, 0, 6);
                } else {
                    sVar18.W();
                }
                return qy.b0.f48488a;
            case 18:
                j0.b2 TextButton8 = (j0.b2) obj;
                l1.n nVar19 = (l1.n) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton8, "$this$TextButton");
                l1.s sVar19 = (l1.s) nVar19;
                if (sVar19.T(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar19, R.string.srs_customize_suggestion_skip), null, null, sVar19, 0, 6);
                } else {
                    sVar19.W();
                }
                return qy.b0.f48488a;
            case 19:
                j0.b2 TextButton9 = (j0.b2) obj;
                l1.n nVar20 = (l1.n) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton9, "$this$TextButton");
                l1.s sVar20 = (l1.s) nVar20;
                if (sVar20.T(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    ua.b(ub.a.e0(sVar20, R.string.srs_customize_suggestion_skip), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar20, 0, 0, 131070);
                } else {
                    sVar20.W();
                }
                return qy.b0.f48488a;
            case 20:
                l0.c item3 = (l0.c) obj;
                l1.n nVar21 = (l1.n) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item3, "$this$item");
                l1.s sVar21 = (l1.s) nVar21;
                if (sVar21.T(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    ua.b(ub.a.e0(sVar21, R.string.srs_customize_suggestion_description), null, ((h1.s1) sVar21.j(h1.v1.f31180a)).f31036s, 0L, new n3.o(1), null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar21.j(fc.f30256a)).f30178k, sVar21, 0, 0, 65514);
                } else {
                    sVar21.W();
                }
                return qy.b0.f48488a;
            case 21:
                l0.c item4 = (l0.c) obj;
                l1.n nVar22 = (l1.n) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item4, "$this$item");
                l1.s sVar22 = (l1.s) nVar22;
                if (sVar22.T(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    j0.c.g(sVar22, j0.e2.g(z1.o.f58481a, 8));
                } else {
                    sVar22.W();
                }
                return qy.b0.f48488a;
            case 22:
                j0.b2 TextButton10 = (j0.b2) obj;
                l1.n nVar23 = (l1.n) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton10, "$this$TextButton");
                l1.s sVar23 = (l1.s) nVar23;
                if (sVar23.T(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    ua.b(ub.a.e0(sVar23, R.string.confirm), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar23, 0, 0, 131070);
                } else {
                    sVar23.W();
                }
                return qy.b0.f48488a;
            case 23:
                j0.b2 TextButton11 = (j0.b2) obj;
                l1.n nVar24 = (l1.n) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton11, "$this$TextButton");
                l1.s sVar24 = (l1.s) nVar24;
                if (sVar24.T(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    ua.b(ub.a.e0(sVar24, R.string.cancel), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar24, 0, 0, 131070);
                } else {
                    sVar24.W();
                }
                return qy.b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                ((Integer) obj).getClass();
                ((Boolean) obj2).getClass();
                ((Integer) obj3).getClass();
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                j0.b2 OutlinedButton2 = (j0.b2) obj;
                l1.n nVar25 = (l1.n) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedButton2, "$this$OutlinedButton");
                l1.s sVar25 = (l1.s) nVar25;
                if (sVar25.T(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    h1.r4.b(se.k.y(R.drawable.check_24px, sVar25, 0), null, null, 0L, sVar25, 56, 12);
                } else {
                    sVar25.W();
                }
                return qy.b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                l0.c item5 = (l0.c) obj;
                l1.n nVar26 = (l1.n) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item5, "$this$item");
                l1.s sVar26 = (l1.s) nVar26;
                if (sVar26.T(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    nn.c.m("Overview", sVar26, 6);
                    nn.c.b("Polish is a West Slavic language with over 40 million native speakers worldwide. It ranks as the sixth most-spoken language in the European Union. ", sVar26, 6);
                } else {
                    sVar26.W();
                }
                return qy.b0.f48488a;
            case 27:
                l0.c item6 = (l0.c) obj;
                l1.n nVar27 = (l1.n) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item6, "$this$item");
                l1.s sVar27 = (l1.s) nVar27;
                if (sVar27.T(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    j0.c.g(sVar27, j0.c.v(z1.o.f58481a));
                } else {
                    sVar27.W();
                }
                return qy.b0.f48488a;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                j0.b2 AppGradientButton8 = (j0.b2) obj;
                l1.n nVar28 = (l1.n) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton8, "$this$AppGradientButton");
                l1.s sVar28 = (l1.s) nVar28;
                if (sVar28.T(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar28, R.string.start_learning), null, null, sVar28, 0, 6);
                } else {
                    sVar28.W();
                }
                return qy.b0.f48488a;
            default:
                j0.b2 AppGradientButton9 = (j0.b2) obj;
                l1.n nVar29 = (l1.n) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton9, "$this$AppGradientButton");
                l1.s sVar29 = (l1.s) nVar29;
                if (sVar29.T(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarC = j0.c.C(oVar, 26, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.L, sVar29, 0);
                    int iHashCode = Long.hashCode(sVar29.T);
                    l1.q1 q1VarL = sVar29.l();
                    z1.r rVarC2 = z1.a.c(sVar29, rVarC);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar29.h0();
                    if (sVar29.S) {
                        sVar29.k(iVar);
                    } else {
                        sVar29.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA, sVar29);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar29);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar29.S || !kotlin.jvm.internal.m.a(sVar29.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar29, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar29);
                    h1.r4.b(se.k.y(R.drawable.syllable_test_icon, sVar29, 0), null, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, 11), 0L, sVar29, 432, 8);
                    ua.b(ub.a.e0(sVar29, R.string.placement_test), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar29, 0, 0, 131070);
                    sVar29.p(true);
                } else {
                    sVar29.W();
                }
                return qy.b0.f48488a;
        }
        return qy.b0.f48488a;
    }
}
