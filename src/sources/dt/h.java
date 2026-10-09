package dt;

import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import h1.ua;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23843b;

    public /* synthetic */ h(boolean z11, int i11) {
        this.f23842a = i11;
        this.f23843b = z11;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jE;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        k2.b bVarY;
        switch (this.f23842a) {
            case 0:
                j0.q CourseTestModelClickableBox = (j0.q) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(CourseTestModelClickableBox, "$this$CourseTestModelClickableBox");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    k2.b bVarY2 = se.k.y(R.drawable.ai_dialogue_record_icon, sVar, 0);
                    z1.r rVarD = j0.e2.d(z1.o.f58481a, 1.0f);
                    if (this.f23843b) {
                        sVar.d0(623212565);
                        jE = ((h1.s1) sVar.j(h1.v1.f31180a)).f31033p;
                        sVar.p(false);
                    } else {
                        sVar.d0(623290437);
                        sVar.p(false);
                        jE = g2.f0.e(4289835441L);
                    }
                    h1.r4.b(bVarY2, null, rVarD, jE, sVar, 432, 0);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                j0.b2 TextButton = (j0.b2) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton, "$this$TextButton");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    if (this.f23843b) {
                        i11 = -1022953910;
                        i12 = R.string.i_have_an_account;
                    } else {
                        i11 = -1022874891;
                        i12 = R.string.logout;
                    }
                    iu.k.d(ep.a.m(sVar2, i11, i12, sVar2, false), null, null, sVar2, 0, 6);
                } else {
                    sVar2.W();
                }
                break;
            case 2:
                j0.b2 TextButton2 = (j0.b2) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton2, "$this$TextButton");
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ua.b(ub.a.e0(sVar3, this.f23843b ? R.string.offline_deselect_all : R.string.offline_select_all), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131070);
                } else {
                    sVar3.W();
                }
                break;
            case 3:
                j0.b2 TextButton3 = (j0.b2) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton3, "$this$TextButton");
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    ua.b(ub.a.e0(sVar4, this.f23843b ? R.string.offline_deselect_all : R.string.offline_select_all), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 0, 0, 131070);
                } else {
                    sVar4.W();
                }
                break;
            case 4:
                j0.b2 AppGradientButton = (j0.b2) obj;
                l1.n nVar5 = (l1.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton, "$this$AppGradientButton");
                l1.s sVar5 = (l1.s) nVar5;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    if (this.f23843b) {
                        i13 = -482308667;
                        i14 = R.string.review_quit_cancel;
                    } else {
                        i13 = -482220379;
                        i14 = R.string.lesson_quit_cancel;
                    }
                    iu.k.d(ep.a.m(sVar5, i13, i14, sVar5, false), null, null, sVar5, 0, 6);
                } else {
                    sVar5.W();
                }
                break;
            case 5:
                j0.b2 TextButton4 = (j0.b2) obj;
                l1.n nVar6 = (l1.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton4, "$this$TextButton");
                l1.s sVar6 = (l1.s) nVar6;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    if (this.f23843b) {
                        i15 = -640402314;
                        i16 = R.string.review_quit_confirm;
                    } else {
                        i15 = -640313034;
                        i16 = R.string.lesson_quit_confirm;
                    }
                    iu.k.d(ep.a.m(sVar6, i15, i16, sVar6, false), null, null, sVar6, 0, 6);
                } else {
                    sVar6.W();
                }
                break;
            case 6:
                String it = (String) obj;
                l1.n nVar7 = (l1.n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(it, "it");
                l1.s sVar7 = (l1.s) nVar7;
                if (sVar7.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    if (this.f23843b) {
                        sVar7.d0(-412610831);
                        bVarY = se.k.y(R.drawable.privacy_box_checked, sVar7, 0);
                        sVar7.p(false);
                    } else {
                        sVar7.d0(-412529363);
                        bVarY = se.k.y(R.drawable.privacy_box_not_checked, sVar7, 0);
                        sVar7.p(false);
                    }
                    d0.n.c(bVarY, null, j0.c.E(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar7, 432, 120);
                } else {
                    sVar7.W();
                }
                break;
            default:
                j0.v Card = (j0.v) obj;
                l1.n nVar8 = (l1.n) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar8 = (l1.s) nVar8;
                if (sVar8.T(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode = Long.hashCode(sVar8.T);
                    l1.q1 q1VarL = sVar8.l();
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarC = z1.a.c(sVar8, oVar);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar8.h0();
                    if (sVar8.S) {
                        sVar8.k(iVar);
                    } else {
                        sVar8.r0();
                    }
                    y2.h hVar = y2.j.f56917f;
                    l1.t.J(hVar, q0VarD, sVar8);
                    y2.h hVar2 = y2.j.f56916e;
                    l1.t.J(hVar2, q1VarL, sVar8);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar8, iHashCode, hVar3);
                    }
                    y2.h hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC, sVar8);
                    d0.n.c(se.k.y(R.drawable.ic_lesson_redo_bg, sVar8, 0), null, j0.e2.c(oVar, 1.0f), null, w2.i.f54516c, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar8, 25008, 104);
                    z1.r rVarD2 = j0.e2.d(oVar, 1.0f);
                    j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar8, 48);
                    int iHashCode2 = Long.hashCode(sVar8.T);
                    l1.q1 q1VarL2 = sVar8.l();
                    z1.r rVarC2 = z1.a.c(sVar8, rVarD2);
                    sVar8.h0();
                    if (sVar8.S) {
                        sVar8.k(iVar);
                    } else {
                        sVar8.r0();
                    }
                    l1.t.J(hVar, a2VarA, sVar8);
                    l1.t.J(hVar2, q1VarL2, sVar8);
                    if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar8, iHashCode2, hVar3);
                    }
                    l1.t.J(hVar4, rVarC2, sVar8);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.c.g(sVar8, new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    String strE0 = ub.a.e0(sVar8, R.string.redo);
                    j3.y0 y0Var = (j3.y0) sVar8.j(ua.f31167a);
                    long j11 = g2.x.f28618e;
                    float f5 = 12;
                    ua.b(strE0, j0.c.E(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(y0Var, j11, fr.j3.A(18), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar8, 48, 0, 65532);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.c.g(sVar8, new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    if (this.f23843b) {
                        sVar8.d0(1207535334);
                        d0.n.c(se.k.y(R.drawable.ic_dialogue_speaking_right_arrow, sVar8, 0), null, d2.h.i(j0.c.A(j0.e2.n(oVar, 20), 2), iu.k.p(sVar8), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(j11, 5), sVar8, 1572912, 56);
                        sVar8.p(false);
                    } else {
                        sVar8.d0(1207209710);
                        d0.n.c(se.k.y(R.drawable.ic_lesson_index_pro, sVar8, 0), null, j0.e2.n(oVar, 26), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar8, 432, 120);
                        sVar8.p(false);
                    }
                    j0.c.g(sVar8, j0.e2.s(oVar, f5));
                    sVar8.p(true);
                    sVar8.p(true);
                } else {
                    sVar8.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
