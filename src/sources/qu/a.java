package qu;

import a0.k0;
import com.google.api.Service;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import g2.f0;
import h1.dc;
import h1.fc;
import h1.k7;
import h1.ua;
import j0.b2;
import j0.e2;
import j3.y0;
import l1.d0;
import l1.q1;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48340a;

    public /* synthetic */ a(int i11) {
        this.f48340a = i11;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f48340a) {
            case 0:
                j0.v AppModalBottomSheet = (j0.v) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppModalBottomSheet, "$this$AppModalBottomSheet");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarE = j0.c.E(j0.c.v(oVar), CropImageView.DEFAULT_ASPECT_RATIO, 12, CropImageView.DEFAULT_ASPECT_RATIO, 22, 5);
                    j0.d dVar = j0.i.f35305c;
                    z1.h hVar = z1.c.O;
                    j0.u uVarA = j0.t.a(dVar, hVar, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarE);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    y2.h hVar2 = y2.j.f56917f;
                    l1.t.J(hVar2, uVarA, sVar);
                    y2.h hVar3 = y2.j.f56916e;
                    l1.t.J(hVar3, q1VarL, sVar);
                    y2.h hVar4 = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                    }
                    y2.h hVar5 = y2.j.f56915d;
                    l1.t.J(hVar5, rVarC, sVar);
                    float f5 = 16;
                    z1.r rVarC2 = j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    j0.u uVarA2 = j0.t.a(dVar, hVar, sVar, 0);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    q1 q1VarL2 = sVar.l();
                    z1.r rVarC3 = z1.a.c(sVar, rVarC2);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar2, uVarA2, sVar);
                    l1.t.J(hVar3, q1VarL2, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
                    }
                    l1.t.J(hVar5, rVarC3, sVar);
                    String strE0 = ub.a.e0(sVar, R.string.explain_point_1_title);
                    d0 d0Var = ua.f31167a;
                    y0 y0Var = (y0) sVar.j(d0Var);
                    long jA = j3.A(18);
                    n3.s sVar2 = n3.s.H;
                    ua.b(strE0, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(y0Var, 0L, jA, sVar2, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar, 0, 0, 65534);
                    float f11 = 9;
                    ua.b(ub.a.e0(sVar, R.string.explain_point_1_desc), j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), 0L, j3.A(14), sVar2, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar, 48, 0, 65532);
                    String strE1 = ub.a.e0(sVar, R.string.explain_point_same_xp_desc);
                    y0 y0Var2 = (y0) sVar.j(d0Var);
                    long jA2 = j3.A(14);
                    n3.s sVar3 = n3.s.f43178t;
                    ua.b(strE1, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(y0Var2, f0.e(4285427310L), jA2, sVar3, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 48, 0, 65532);
                    ua.b(ub.a.e0(sVar, R.string.explain_point_2_title), j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), 0L, j3.A(18), sVar2, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar, 48, 0, 65532);
                    ua.b(ub.a.e0(sVar, R.string.explain_point_2_desc_1), j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), 0L, j3.A(14), sVar2, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar, 48, 0, 65532);
                    ua.b(ub.a.e0(sVar, R.string.explain_point_2_desc_2), j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), f0.e(4285427310L), j3.A(14), sVar3, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 48, 0, 65532);
                    sVar.p(true);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                return b0.f48488a;
            case 1:
                b2 AppGradientButton = (b2) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton, "$this$AppGradientButton");
                l1.s sVar4 = (l1.s) nVar2;
                if (sVar4.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar4, R.string.test_continue), null, null, sVar4, 0, 6);
                } else {
                    sVar4.W();
                }
                return b0.f48488a;
            case 2:
                b2 AppGradientButton2 = (b2) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton2, "$this$AppGradientButton");
                l1.s sVar5 = (l1.s) nVar3;
                if (sVar5.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar5, R.string.test_continue), null, null, sVar5, 0, 6);
                } else {
                    sVar5.W();
                }
                return b0.f48488a;
            case 3:
                b2 TextButton = (b2) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton, "$this$TextButton");
                l1.s sVar6 = (l1.s) nVar4;
                if (sVar6.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar6, R.string.clear_status), null, null, sVar6, 0, 6);
                } else {
                    sVar6.W();
                }
                return b0.f48488a;
            case 4:
                b2 AppGradientButton3 = (b2) obj;
                l1.n nVar5 = (l1.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton3, "$this$AppGradientButton");
                l1.s sVar7 = (l1.s) nVar5;
                if (sVar7.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar7, R.string.join_leaderboard), null, null, sVar7, 0, 6);
                } else {
                    sVar7.W();
                }
                return b0.f48488a;
            case 5:
                m0.l item = (m0.l) obj;
                l1.n nVar6 = (l1.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar8 = (l1.s) nVar6;
                if (sVar8.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    j0.c.g(sVar8, j0.c.v(z1.o.f58481a));
                } else {
                    sVar8.W();
                }
                return b0.f48488a;
            case 6:
                l0.c item2 = (l0.c) obj;
                l1.n nVar7 = (l1.n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item2, "$this$item");
                l1.s sVar9 = (l1.s) nVar7;
                if (sVar9.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    j0.c.g(sVar9, e2.g(z1.o.f58481a, 16));
                } else {
                    sVar9.W();
                }
                return b0.f48488a;
            case 7:
                b2 AppGradientButton4 = (b2) obj;
                l1.n nVar8 = (l1.n) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton4, "$this$AppGradientButton");
                l1.s sVar10 = (l1.s) nVar8;
                if (sVar10.T(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    iu.k.d("查看结果并开始练习", null, null, sVar10, 6, 6);
                } else {
                    sVar10.W();
                }
                return b0.f48488a;
            case 8:
                b2 AppGradientButton5 = (b2) obj;
                l1.n nVar9 = (l1.n) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton5, "$this$AppGradientButton");
                l1.s sVar11 = (l1.s) nVar9;
                if (sVar11.T(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar11, R.string.practice), null, null, sVar11, 0, 6);
                } else {
                    sVar11.W();
                }
                return b0.f48488a;
            case 9:
                m0.l item3 = (m0.l) obj;
                l1.n nVar10 = (l1.n) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item3, "$this$item");
                l1.s sVar12 = (l1.s) nVar10;
                if (sVar12.T(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    j0.u uVarA3 = j0.t.a(j0.i.f35305c, z1.c.O, sVar12, 0);
                    int iHashCode3 = Long.hashCode(sVar12.T);
                    q1 q1VarL3 = sVar12.l();
                    z1.o oVar2 = z1.o.f58481a;
                    z1.r rVarC4 = z1.a.c(sVar12, oVar2);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar12.h0();
                    if (sVar12.S) {
                        sVar12.k(iVar2);
                    } else {
                        sVar12.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA3, sVar12);
                    l1.t.J(y2.j.f56916e, q1VarL3, sVar12);
                    y2.h hVar6 = y2.j.f56918g;
                    if (sVar12.S || !kotlin.jvm.internal.m.a(sVar12.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar12, iHashCode3, hVar6);
                    }
                    l1.t.J(y2.j.f56915d, rVarC4, sVar12);
                    xn.a.q(ub.a.e0(sVar12, R.string.pt_alp_new_section_content_1), sVar12, 0);
                    xn.a.d(ub.a.e0(sVar12, R.string.pt_alp_new_section_content_2), sVar12, 0);
                    ep.a.C(oVar2, 8, sVar12, true);
                } else {
                    sVar12.W();
                }
                return b0.f48488a;
            case 10:
                m0.l item4 = (m0.l) obj;
                l1.n nVar11 = (l1.n) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item4, "$this$item");
                l1.s sVar13 = (l1.s) nVar11;
                if (sVar13.T(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    xn.a.d(ub.a.e0(sVar13, R.string.pt_alp_new_section_content_3), sVar13, 0);
                } else {
                    sVar13.W();
                }
                return b0.f48488a;
            case 11:
                m0.l item5 = (m0.l) obj;
                l1.n nVar12 = (l1.n) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item5, "$this$item");
                l1.s sVar14 = (l1.s) nVar12;
                if (sVar14.T(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    k7.e(null, CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar14, 0, 7);
                } else {
                    sVar14.W();
                }
                return b0.f48488a;
            case 12:
                b2 TextButton2 = (b2) obj;
                l1.n nVar13 = (l1.n) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton2, "$this$TextButton");
                l1.s sVar15 = (l1.s) nVar13;
                if (sVar15.T(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    iu.k.n(ub.a.e0(sVar15, R.string.confirm), null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, sVar15, 0, 0, 131070);
                } else {
                    sVar15.W();
                }
                return b0.f48488a;
            case 13:
                b2 TextButton3 = (b2) obj;
                l1.n nVar14 = (l1.n) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton3, "$this$TextButton");
                l1.s sVar16 = (l1.s) nVar14;
                if (sVar16.T(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    iu.k.n(ub.a.e0(sVar16, R.string.cancel), null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, sVar16, 0, 0, 131070);
                } else {
                    sVar16.W();
                }
                return b0.f48488a;
            case 14:
                b2 TextButton4 = (b2) obj;
                l1.n nVar15 = (l1.n) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton4, "$this$TextButton");
                l1.s sVar17 = (l1.s) nVar15;
                if (sVar17.T(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    iu.k.n(ub.a.e0(sVar17, R.string.cancel), null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, sVar17, 0, 0, 131070);
                } else {
                    sVar17.W();
                }
                return b0.f48488a;
            case 15:
                b2 TextButton5 = (b2) obj;
                l1.n nVar16 = (l1.n) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton5, "$this$TextButton");
                l1.s sVar18 = (l1.s) nVar16;
                if (sVar18.T(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    iu.k.n(ub.a.e0(sVar18, R.string.confirm), null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, sVar18, 0, 0, 131070);
                } else {
                    sVar18.W();
                }
                return b0.f48488a;
            case 16:
                b2 TextButton6 = (b2) obj;
                l1.n nVar17 = (l1.n) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton6, "$this$TextButton");
                l1.s sVar19 = (l1.s) nVar17;
                if (sVar19.T(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    iu.k.n(ub.a.e0(sVar19, R.string.cancel), null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, sVar19, 0, 0, 131070);
                } else {
                    sVar19.W();
                }
                return b0.f48488a;
            case 17:
                b2 Button = (b2) obj;
                l1.n nVar18 = (l1.n) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Button, "$this$Button");
                l1.s sVar20 = (l1.s) nVar18;
                if (sVar20.T(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    iu.k.n(ub.a.e0(sVar20, R.string.keep_account), null, 0L, j3.A(13), null, 0L, 0L, 0, false, 0, 0, null, sVar20, 3072, 0, 131062);
                } else {
                    sVar20.W();
                }
                return b0.f48488a;
            case 18:
                b2 TextButton7 = (b2) obj;
                l1.n nVar19 = (l1.n) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton7, "$this$TextButton");
                l1.s sVar21 = (l1.s) nVar19;
                if (sVar21.T(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    iu.k.n(ub.a.e0(sVar21, R.string.delete_account), null, 0L, j3.A(13), null, 0L, 0L, 0, false, 0, 0, null, sVar21, 3072, 0, 131062);
                } else {
                    sVar21.W();
                }
                return b0.f48488a;
            case 19:
                b2 TextButton8 = (b2) obj;
                l1.n nVar20 = (l1.n) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton8, "$this$TextButton");
                l1.s sVar22 = (l1.s) nVar20;
                if (sVar22.T(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    iu.k.n(ub.a.e0(sVar22, R.string.confirm), null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, sVar22, 0, 0, 131070);
                } else {
                    sVar22.W();
                }
                return b0.f48488a;
            case 20:
                b2 TextButton9 = (b2) obj;
                l1.n nVar21 = (l1.n) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton9, "$this$TextButton");
                l1.s sVar23 = (l1.s) nVar21;
                if (sVar23.T(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    iu.k.n(ub.a.e0(sVar23, R.string.cancel), null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, sVar23, 0, 0, 131070);
                } else {
                    sVar23.W();
                }
                return b0.f48488a;
            case 21:
                b2 AppGradientButton6 = (b2) obj;
                l1.n nVar22 = (l1.n) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton6, "$this$AppGradientButton");
                l1.s sVar24 = (l1.s) nVar22;
                if (sVar24.T(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar24, R.string.logout), null, null, sVar24, 0, 6);
                } else {
                    sVar24.W();
                }
                return b0.f48488a;
            case 22:
                b2 AppGradientButton7 = (b2) obj;
                l1.n nVar23 = (l1.n) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton7, "$this$AppGradientButton");
                l1.s sVar25 = (l1.s) nVar23;
                if (sVar25.T(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar25, R.string.confirm), null, null, sVar25, 0, 6);
                } else {
                    sVar25.W();
                }
                return b0.f48488a;
            case 23:
                b2 TextButton10 = (b2) obj;
                l1.n nVar24 = (l1.n) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton10, "$this$TextButton");
                l1.s sVar26 = (l1.s) nVar24;
                if (sVar26.T(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    iu.k.n(ub.a.e0(sVar26, R.string.confirm), null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, sVar26, 0, 0, 131070);
                } else {
                    sVar26.W();
                }
                return b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                b2 TextButton11 = (b2) obj;
                l1.n nVar25 = (l1.n) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton11, "$this$TextButton");
                l1.s sVar27 = (l1.s) nVar25;
                if (sVar27.T(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    iu.k.n(ub.a.e0(sVar27, R.string.cancel), null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, sVar27, 0, 0, 131070);
                } else {
                    sVar27.W();
                }
                return b0.f48488a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                b2 AppGradientButton8 = (b2) obj;
                l1.n nVar26 = (l1.n) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton8, "$this$AppGradientButton");
                l1.s sVar28 = (l1.s) nVar26;
                if (sVar28.T(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar28, R.string.take_photo), null, null, sVar28, 0, 6);
                } else {
                    sVar28.W();
                }
                return b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                b2 AppGradientButton9 = (b2) obj;
                l1.n nVar27 = (l1.n) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton9, "$this$AppGradientButton");
                l1.s sVar29 = (l1.s) nVar27;
                if (sVar29.T(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    iu.k.d(ub.a.e0(sVar29, R.string.choose_photo), null, null, sVar29, 0, 6);
                } else {
                    sVar29.W();
                }
                return b0.f48488a;
            case 27:
                k0 AnimatedVisibility = (k0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                j0.c.g((l1.n) obj2, e2.g(z1.o.f58481a, 64));
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                k0 AnimatedVisibility2 = (k0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility2, "$this$AnimatedVisibility");
                j0.c.g((l1.n) obj2, e2.g(z1.o.f58481a, 64));
                break;
            default:
                l0.c item6 = (l0.c) obj;
                l1.n nVar28 = (l1.n) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item6, "$this$item");
                l1.s sVar30 = (l1.s) nVar28;
                if (sVar30.T(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    ua.b(ub.a.e0(sVar30, R.string.recommend_friends), j0.c.B(z1.o.f58481a, 25, 16), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar30.j(fc.f30256a)).f30175h, sVar30, 48, 0, 65532);
                } else {
                    sVar30.W();
                }
                return b0.f48488a;
        }
        return b0.f48488a;
    }
}
