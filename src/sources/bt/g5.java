package bt;

import android.os.Bundle;
import com.lingo.fluent.ui.base.PdFinishActivity;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.RecordingStatus;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryUiState;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g5 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5438b;

    public /* synthetic */ g5(int i11, l1.b1 b1Var) {
        this.f5437a = i11;
        this.f5438b = b1Var;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z11;
        int i11 = this.f5437a;
        z1.o oVar = z1.o.f58481a;
        l1.g gVar = l1.m.f39353a;
        qy.b0 b0Var = qy.b0.f48488a;
        l1.b1 b1Var = this.f5438b;
        switch (i11) {
            case 0:
                j0.q CourseTestModelScreen = (j0.q) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(CourseTestModelScreen, "$this$CourseTestModelScreen");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((l1.s) nVar).f(CourseTestModelScreen) ? 4 : 2;
                }
                l1.s sVar = (l1.s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    sVar.W();
                } else {
                    if (b1Var.getValue() instanceof RecordingStatus.RecognizeShowScore) {
                        sVar.d0(-933587723);
                        z1.r rVarD = z1.a.d(j0.c.E(CourseTestModelScreen.a(oVar, z1.c.f58465c), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, 11), 1.0f);
                        w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                        int iHashCode = Long.hashCode(sVar.T);
                        l1.q1 q1VarL = sVar.l();
                        z1.r rVarC = z1.a.c(sVar, rVarD);
                        y2.k.J.getClass();
                        y2.i iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL, sVar);
                        y2.h hVar = y2.j.f56918g;
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC, sVar);
                        a0.o.b(b1Var.getValue(), null, null, null, BuildConfig.VERSION_NAME, null, b.f5191p, sVar, 1597440, 46);
                        sVar.p(true);
                    } else {
                        sVar.d0(-950614938);
                    }
                    sVar.p(false);
                }
                break;
            case 1:
                j0.q CourseTestModelClickableBox = (j0.q) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(CourseTestModelClickableBox, "$this$CourseTestModelClickableBox");
                l1.s sVar2 = (l1.s) nVar2;
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    sVar2.W();
                } else {
                    h1.r4.b((k2.b) b1Var.getValue(), null, j0.e2.d(d2.h.i(oVar, iu.k.p(sVar2), 1.0f), 0.6f), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31033p, sVar2, 48, 0);
                }
                break;
            case 2:
                fz.a showNext = (fz.a) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i12 = PdFinishActivity.H;
                kotlin.jvm.internal.m.f(showNext, "showNext");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((l1.s) nVar3).h(showNext) ? 4 : 2;
                }
                l1.s sVar3 = (l1.s) nVar3;
                if (!sVar3.T(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    sVar3.W();
                } else {
                    z1.r rVarD2 = j0.e2.d(j0.c.v(j0.c.F(oVar)), 1.0f);
                    Bundle bundle = new Bundle();
                    bundle.putInt(INTENTS.EXTRA_INT, ((Number) b1Var.getValue()).intValue());
                    boolean z12 = (iIntValue3 & 14) == 4;
                    Object objQ = sVar3.Q();
                    if (z12 || objQ == gVar) {
                        objQ = new bp.r0(6, showNext);
                        sVar3.o0(objQ);
                    }
                    ub.a.H(km.f.class, rVarD2, null, bundle, (fz.c) objQ, sVar3, 0, 4);
                }
                break;
            case 3:
                fz.a showNext2 = (fz.a) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(showNext2, "showNext");
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((l1.s) nVar4).h(showNext2) ? 4 : 2;
                }
                l1.s sVar4 = (l1.s) nVar4;
                if (!sVar4.T(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    sVar4.W();
                } else {
                    int iIntValue5 = ((Number) b1Var.getValue()).intValue();
                    boolean z13 = (iIntValue4 & 14) == 4;
                    Object objQ2 = sVar4.Q();
                    if (z13 || objQ2 == gVar) {
                        objQ2 = new jr.m(2, showNext2);
                        sVar4.o0(objQ2);
                    }
                    jr.a.j(iIntValue5, 0, (fz.a) objQ2, sVar4);
                }
                break;
            case 4:
                j0.b2 AppTopAppBar = (j0.b2) obj;
                l1.n nVar5 = (l1.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppTopAppBar, "$this$AppTopAppBar");
                l1.s sVar5 = (l1.s) nVar5;
                if (!sVar5.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    sVar5.W();
                } else {
                    l1.c3 c3Var = h1.v1.f31180a;
                    long j11 = ((h1.s1) sVar5.j(c3Var)).f31021c;
                    l1.d0 d0Var = h1.h2.f30320a;
                    long j12 = ((g2.x) sVar5.j(d0Var)).f28624a;
                    long j13 = g2.x.f28622i;
                    long jC = g2.x.c(j12, 0.38f);
                    h1.s1 s1Var = (h1.s1) sVar5.j(c3Var);
                    long j14 = ((g2.x) sVar5.j(d0Var)).f28624a;
                    h1.o4 o4Var = s1Var.U;
                    if (o4Var == null) {
                        long j15 = g2.x.f28621h;
                        o4Var = new h1.o4(j15, j14, j15, g2.x.c(j14, 0.38f));
                        s1Var.U = o4Var;
                    }
                    h1.o4 o4VarA = o4Var.a(j11, j12, j13, jC);
                    z1.r rVarE = j0.c.E(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, 11);
                    Object objQ3 = sVar5.Q();
                    if (objQ3 == gVar) {
                        objQ3 = new mt.q(1, b1Var);
                        sVar5.o0(objQ3);
                    }
                    h1.k7.h((fz.a) objQ3, rVarE, false, o4VarA, mt.g.f41437k, sVar5, 196662, 20);
                }
                break;
            case 5:
                fz.a showNext3 = (fz.a) obj;
                l1.n nVar6 = (l1.n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(showNext3, "showNext");
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((l1.s) nVar6).h(showNext3) ? 4 : 2;
                }
                l1.s sVar6 = (l1.s) nVar6;
                if (!sVar6.T(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    sVar6.W();
                } else {
                    int iIntValue8 = ((Number) b1Var.getValue()).intValue();
                    z11 = (iIntValue7 & 14) == 4;
                    Object objQ4 = sVar6.Q();
                    if (z11 || objQ4 == gVar) {
                        objQ4 = new jr.m(27, showNext3);
                        sVar6.o0(objQ4);
                    }
                    mt.g.x(iIntValue8, 0, (fz.a) objQ4, sVar6);
                }
                break;
            case 6:
                j0.b2 AppTopAppBar2 = (j0.b2) obj;
                l1.n nVar7 = (l1.n) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppTopAppBar2, "$this$AppTopAppBar");
                l1.s sVar7 = (l1.s) nVar7;
                if (!sVar7.T(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    sVar7.W();
                } else {
                    Object objQ5 = sVar7.Q();
                    if (objQ5 == gVar) {
                        objQ5 = new mt.n4(17, b1Var);
                        sVar7.o0(objQ5);
                    }
                    h1.k7.h((fz.a) objQ5, null, false, null, nh.a.f43773a, sVar7, 196614, 30);
                }
                break;
            case 7:
                a0.k0 AnimatedVisibility = (a0.k0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                z1.r rVarG = j0.e2.g(j0.e2.e(oVar, 1.0f), 356);
                l1.s sVar8 = (l1.s) ((l1.n) obj2);
                Object objQ6 = sVar8.Q();
                if (objQ6 == gVar) {
                    objQ6 = new mt.p(16, b1Var);
                    sVar8.o0(objQ6);
                }
                d0.n.b(54, (fz.c) objQ6, sVar8, rVarG);
                break;
            case 8:
                j0.v AppModalBottomSheet = (j0.v) obj;
                l1.n nVar8 = (l1.n) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppModalBottomSheet, "$this$AppModalBottomSheet");
                l1.s sVar9 = (l1.s) nVar8;
                if (!sVar9.T(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    sVar9.W();
                } else {
                    Object objQ7 = sVar9.Q();
                    if (objQ7 == gVar) {
                        objQ7 = new pr.z(1, b1Var);
                        sVar9.o0(objQ7);
                    }
                    qu.b.a(null, null, (fz.a) objQ7, sVar9, 384);
                }
                break;
            case 9:
                j0.v AppModalBottomSheet2 = (j0.v) obj;
                l1.n nVar9 = (l1.n) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppModalBottomSheet2, "$this$AppModalBottomSheet");
                l1.s sVar10 = (l1.s) nVar9;
                if (!sVar10.T(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    sVar10.W();
                } else {
                    LeaderBoardUser leaderBoardUser = (LeaderBoardUser) b1Var.getValue();
                    if (leaderBoardUser == null) {
                        sVar10.d0(-269544204);
                    } else {
                        sVar10.d0(-269544203);
                        qu.b.i(leaderBoardUser, null, sVar10, 0);
                    }
                    sVar10.p(false);
                }
                break;
            case 10:
                j0.v AppModalBottomSheet3 = (j0.v) obj;
                l1.n nVar10 = (l1.n) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppModalBottomSheet3, "$this$AppModalBottomSheet");
                l1.s sVar11 = (l1.s) nVar10;
                if (!sVar11.T(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    sVar11.W();
                } else {
                    LeaderBoardUser leaderBoardUser2 = (LeaderBoardUser) b1Var.getValue();
                    if (leaderBoardUser2 == null) {
                        sVar11.d0(-1864563284);
                    } else {
                        sVar11.d0(-1864563283);
                        qu.b.i(leaderBoardUser2, null, sVar11, 0);
                    }
                    sVar11.p(false);
                }
                break;
            default:
                fz.a showNext4 = (fz.a) obj;
                l1.n nVar11 = (l1.n) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(showNext4, "showNext");
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= ((l1.s) nVar11).h(showNext4) ? 4 : 2;
                }
                l1.s sVar12 = (l1.s) nVar11;
                if (!sVar12.T(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    sVar12.W();
                } else {
                    CourseTestFinishSummaryUiState courseTestFinishSummaryUiState = (CourseTestFinishSummaryUiState) b1Var.getValue();
                    kotlin.jvm.internal.m.d(courseTestFinishSummaryUiState, "null cannot be cast to non-null type com.lingodeer.data.model.uistate.CourseTestFinishSummaryUiState.Success");
                    int xp2 = ((CourseTestFinishSummaryUiState.Success) courseTestFinishSummaryUiState).getXp();
                    z11 = (iIntValue13 & 14) == 4;
                    Object objQ8 = sVar12.Q();
                    if (z11 || objQ8 == gVar) {
                        objQ8 = new ys.k2(5, showNext4);
                        sVar12.o0(objQ8);
                    }
                    ys.a.s(xp2, 0, (fz.a) objQ8, sVar12);
                }
                break;
        }
        return b0Var;
    }
}
