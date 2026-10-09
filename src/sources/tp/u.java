package tp;

import android.content.res.Resources;
import android.os.Bundle;
import bp.r0;
import com.lingo.lingoskill.object.MergedBillingThemeBillingPage;
import com.lingo.lingoskill.ui.review.FlashCardFinishActivity;
import com.lingo.lingoskill.ukrskill.ui.learn.UKRSyllableIntroductionActivity;
import com.lingodeer.data.model.CourseUiState;
import com.lingodeer.data.model.INTENTS;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import h1.k7;
import j0.b2;
import j0.e2;
import j0.t1;
import l1.b1;
import l1.b3;
import l1.q1;
import rt.h9;
import w2.q0;
import ys.a3;
import ys.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f52500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52501c;

    public /* synthetic */ u(int i11, Object obj, Object obj2) {
        this.f52499a = i11;
        this.f52501c = obj;
        this.f52500b = obj2;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z11;
        int i11 = this.f52499a;
        l1.g gVar = l1.m.f39353a;
        z1.o oVar = z1.o.f58481a;
        int i12 = 4;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj4 = this.f52500b;
        Object obj5 = this.f52501c;
        switch (i11) {
            case 0:
                FlashCardFinishActivity flashCardFinishActivity = (FlashCardFinishActivity) obj5;
                b1 b1Var = (b1) obj4;
                fz.a showNext = (fz.a) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i13 = FlashCardFinishActivity.K;
                kotlin.jvm.internal.m.f(showNext, "showNext");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((l1.s) nVar).h(showNext) ? 4 : 2;
                }
                l1.s sVar = (l1.s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    sVar.W();
                } else {
                    z1.r rVarD = e2.d(j0.c.v(j0.c.F(oVar)), 1.0f);
                    Bundle bundle = new Bundle();
                    bundle.putInt(INTENTS.EXTRA_INT, ((Number) b1Var.getValue()).intValue());
                    bundle.putBoolean(INTENTS.EXTRA_BOOLEAN, ((Boolean) flashCardFinishActivity.H.getValue()).booleanValue());
                    bundle.putString(INTENTS.EXTRA_STRING, (String) flashCardFinishActivity.f22065t.getValue());
                    z11 = (iIntValue & 14) == 4;
                    Object objQ = sVar.Q();
                    if (z11 || objQ == gVar) {
                        objQ = new r0(14, showNext);
                        sVar.o0(objQ);
                    }
                    ub.a.H(x.class, rVarD, null, bundle, (fz.c) objQ, sVar, 0, 4);
                }
                break;
            case 1:
                b0 b0Var2 = (b0) obj5;
                b1 b1Var2 = (b1) obj4;
                fz.a showNext2 = (fz.a) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(showNext2, "showNext");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((l1.s) nVar2).h(showNext2) ? 4 : 2;
                }
                l1.s sVar2 = (l1.s) nVar2;
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    sVar2.W();
                } else {
                    z1.r rVarD2 = e2.d(j0.c.v(j0.c.F(oVar)), 1.0f);
                    Bundle arguments = b0Var2.getArguments();
                    if (arguments == null) {
                        arguments = Bundle.EMPTY;
                    }
                    arguments.putInt(INTENTS.EXTRA_INT, ((Number) b1Var2.getValue()).intValue());
                    z11 = (iIntValue2 & 14) == 4;
                    Object objQ2 = sVar2.Q();
                    if (z11 || objQ2 == gVar) {
                        objQ2 = new r0(15, showNext2);
                        sVar2.o0(objQ2);
                    }
                    ub.a.H(km.f.class, rVarD2, null, arguments, (fz.c) objQ2, sVar2, 0, 4);
                }
                break;
            case 2:
                fz.a aVar = (fz.a) obj5;
                Resources resources = (Resources) obj4;
                b2 AppTopAppBar = (b2) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppTopAppBar, "$this$AppTopAppBar");
                l1.s sVar3 = (l1.s) nVar3;
                if (!sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    sVar3.W();
                } else {
                    boolean zF = sVar3.f(aVar);
                    Object objQ3 = sVar3.Q();
                    if (zF || objQ3 == gVar) {
                        objQ3 = new okhttp3.b(23, aVar);
                        sVar3.o0(objQ3);
                    }
                    k7.m((fz.a) objQ3, null, false, null, null, null, t1.e.d(2051989492, new uu.c(resources, i12), sVar3), sVar3, 805306368, 510);
                }
                break;
            case 3:
                UKRSyllableIntroductionActivity uKRSyllableIntroductionActivity = (UKRSyllableIntroductionActivity) obj5;
                aq.b bVar = (aq.b) obj4;
                t1 contentPadding = (t1) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i14 = UKRSyllableIntroductionActivity.H;
                kotlin.jvm.internal.m.f(contentPadding, "contentPadding");
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((l1.s) nVar4).f(contentPadding) ? 4 : 2;
                }
                l1.s sVar4 = (l1.s) nVar4;
                if (!sVar4.T(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    sVar4.W();
                } else {
                    z1.r rVarZ = j0.c.z(oVar, contentPadding);
                    q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode = Long.hashCode(sVar4.T);
                    q1 q1VarL = sVar4.l();
                    z1.r rVarC = z1.a.c(sVar4, rVarZ);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD, sVar4);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar4);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar4, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar4);
                    uKRSyllableIntroductionActivity.p(bVar, sVar4, 0);
                    sVar4.p(true);
                }
                break;
            case 4:
                b3 b3Var = (b3) obj5;
                b3 b3Var2 = (b3) obj4;
                l0.c item = (l0.c) obj;
                l1.n nVar5 = (l1.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar5 = (l1.s) nVar5;
                if (!sVar5.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    sVar5.W();
                } else {
                    yg.o.j((String) b3Var.getValue(), j3.w(((MergedBillingThemeBillingPage) b3Var2.getValue()).getColorTitle()), sVar5, 0);
                }
                break;
            case 5:
                h9 h9Var = (h9) obj5;
                fz.a aVar2 = (fz.a) obj4;
                l0.c item2 = (l0.c) obj;
                l1.n nVar6 = (l1.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item2, "$this$item");
                l1.s sVar6 = (l1.s) nVar6;
                if (!sVar6.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    sVar6.W();
                } else {
                    p1.d(h9Var, aVar2, sVar6, 0);
                }
                break;
            default:
                CourseUiState.Success success = (CourseUiState.Success) obj5;
                fz.a aVar3 = (fz.a) obj4;
                l0.c item3 = (l0.c) obj;
                l1.n nVar7 = (l1.n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item3, "$this$item");
                l1.s sVar7 = (l1.s) nVar7;
                if (!sVar7.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    sVar7.W();
                } else {
                    z1.j jVar = z1.c.f58467e;
                    z1.o oVar2 = z1.o.f58481a;
                    z1.r rVarE = e2.e(oVar2, 1.0f);
                    q0 q0VarD2 = j0.o.d(jVar, false);
                    int iHashCode2 = Long.hashCode(sVar7.T);
                    q1 q1VarL2 = sVar7.l();
                    z1.r rVarC2 = z1.a.c(sVar7, rVarE);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar7.h0();
                    if (sVar7.S) {
                        sVar7.k(iVar2);
                    } else {
                        sVar7.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD2, sVar7);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar7);
                    y2.h hVar2 = y2.j.f56918g;
                    if (sVar7.S || !kotlin.jvm.internal.m.a(sVar7.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar7, iHashCode2, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar7);
                    if (success.getShowLevelUp()) {
                        sVar7.d0(-2087810895);
                        a3.d(6, aVar3, sVar7, j0.c.B(j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 120, 7), 52, 16));
                        sVar7.p(false);
                    } else {
                        sVar7.d0(-2087470143);
                        a3.c(48, sVar7, j0.c.C(j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 120, 7), CropImageView.DEFAULT_ASPECT_RATIO, 16, 1), success.getFinishedAll());
                        sVar7.p(false);
                    }
                    sVar7.p(true);
                }
                break;
        }
        return b0Var;
    }
}
