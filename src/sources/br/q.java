package br;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.p1;
import bp.g1;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingo.lingoskill.object.NewBillingTheme;
import com.lingo.lingoskill.object.NewBillingThemeBillingPage;
import com.lingo.lingoskill.object.NewBillingThemeIntroPage;
import com.lingo.lingoskill.object.NewBillingThemeLearnPage;
import com.lingo.main.ui.MainComposeActivity;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.o0;
import gp.l1;
import h1.s1;
import h1.v1;
import j0.e2;
import kotlin.NoWhenBranchMatchedException;
import l1.a1;
import l1.b1;
import l1.h1;
import l1.q1;
import l1.x1;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class q {
    public static final void a(int i11, int i12, l1 remoteConfigViewModel, fz.e onSwitchLanguage, fz.a onClickBillingBar, t1.d dVar, t1.d dVar2, l1.n nVar, int i13) {
        t1.d dVar3;
        l1.s sVar;
        int iA;
        boolean z11;
        NewBillingTheme newBillingTheme;
        kotlin.jvm.internal.m.f(remoteConfigViewModel, "remoteConfigViewModel");
        kotlin.jvm.internal.m.f(onSwitchLanguage, "onSwitchLanguage");
        kotlin.jvm.internal.m.f(onClickBillingBar, "onClickBillingBar");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1707697659);
        int i14 = i13 | (sVar2.d(i11) ? 32 : 16) | (sVar2.d(i12) ? 256 : 128) | (sVar2.h(remoteConfigViewModel) ? 2048 : 1024) | (sVar2.h(onSwitchLanguage) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(onClickBillingBar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        if (sVar2.T(i14 & 1, (4793491 & i14) != 4793490)) {
            e20.a aVarC = w4.c.c(sVar2, -1168520582, sVar2, -1633490746);
            boolean zF = sVar2.f(null) | sVar2.f(aVarC);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = w4.c.e(xt.u.class, aVarC, null, null, sVar2);
            }
            sVar2.p(false);
            sVar2.p(false);
            xt.u uVar = (xt.u) objQ;
            e20.a aVarC2 = w4.c.c(sVar2, -1168520582, sVar2, -1633490746);
            boolean zF2 = sVar2.f(null) | sVar2.f(aVarC2);
            Object objQ2 = sVar2.Q();
            if (zF2 || objQ2 == gVar) {
                objQ2 = w4.c.e(ur.a.class, aVarC2, null, null, sVar2);
            }
            sVar2.p(false);
            sVar2.p(false);
            ur.a aVar = (ur.a) objQ2;
            b1 b1VarO = l1.t.o(remoteConfigViewModel.W, sVar2);
            b1 b1VarO2 = l1.t.o(remoteConfigViewModel.X, sVar2);
            b1 b1VarO3 = l1.t.o(remoteConfigViewModel.f29438d, sVar2);
            b1 b1VarO4 = l1.t.o(remoteConfigViewModel.f29437c0, sVar2);
            b1 b1VarO5 = l1.t.o(remoteConfigViewModel.V, sVar2);
            boolean zH = sVar2.h(remoteConfigViewModel);
            Object objQ3 = sVar2.Q();
            if (zH || objQ3 == gVar) {
                objQ3 = new o(remoteConfigViewModel, null, 0);
                sVar2.o0(objQ3);
            }
            qy.b0 b0Var = qy.b0.f48488a;
            l1.t.f((fz.e) objQ3, b0Var, sVar2);
            boolean z12 = (i14 & 112) == 32;
            Object objQ4 = sVar2.Q();
            if (z12 || objQ4 == gVar) {
                try {
                    iA = uVar.a("ic_lingodeer_top_".concat(xt.d.l(i11 == 5 ? 53 : i11)));
                } catch (Exception unused) {
                    iA = R.drawable.ic_lingodeer_top_cn;
                }
                objQ4 = defpackage.e.v(iA, sVar2);
            }
            a1 a1Var = (a1) objQ4;
            Object objQ5 = sVar2.Q();
            if (objQ5 == gVar) {
                objQ5 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ5);
            }
            b1 b1Var = (b1) objQ5;
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar2.d0(-131699828);
                boolean zH2 = sVar2.h(aVar);
                Object objQ6 = sVar2.Q();
                if (zH2 || objQ6 == gVar) {
                    objQ6 = new p(aVar, null, 0);
                    sVar2.o0(objQ6);
                }
                l1.t.f((fz.e) objQ6, b0Var, sVar2);
                boolean z13 = (i14 & 57344) == 16384;
                Object objQ7 = sVar2.Q();
                if (z13 || objQ7 == gVar) {
                    objQ7 = new p1(1, onSwitchLanguage);
                    sVar2.o0(objQ7);
                }
                fz.c cVar = (fz.c) objQ7;
                Object objQ8 = sVar2.Q();
                if (objQ8 == gVar) {
                    objQ8 = new bp.p(10, b1Var);
                    sVar2.o0(objQ8);
                }
                g1.i(cVar, (fz.a) objQ8, null, sVar2, 48);
                z11 = false;
            } else {
                z11 = false;
                sVar2.d0(-145030851);
            }
            sVar2.p(z11);
            gp.b0 b0Var2 = (gp.b0) b1VarO4.getValue();
            if (kotlin.jvm.internal.m.a(b0Var2, gp.z.f29558a)) {
                newBillingTheme = new NewBillingTheme((NewBillingThemeLearnPage) null, (NewBillingThemeIntroPage) null, (NewBillingThemeBillingPage) null, 7, (kotlin.jvm.internal.f) null);
            } else {
                if (!(b0Var2 instanceof gp.a0)) {
                    throw new NoWhenBranchMatchedException();
                }
                gp.b0 b0Var3 = (gp.b0) b1VarO4.getValue();
                kotlin.jvm.internal.m.d(b0Var3, "null cannot be cast to non-null type com.lingo.lingoskill.ui.base.viewmodels.NormalSaleUiState.Success");
                newBillingTheme = ((gp.a0) b0Var3).f29332b;
            }
            int iL = ((h1) a1Var).l();
            boolean zBooleanValue = ((Boolean) b1VarO5.getValue()).booleanValue();
            String str = (String) b1VarO.getValue();
            String str2 = (String) b1VarO2.getValue();
            String str3 = (String) b1VarO3.getValue();
            if ((i14 & 458752) == 131072) {
                z11 = true;
            }
            Object objQ9 = sVar2.Q();
            if (z11 || objQ9 == gVar) {
                objQ9 = new at.r(14, onClickBillingBar);
                sVar2.o0(objQ9);
            }
            fz.a aVar2 = (fz.a) objQ9;
            Object objQ10 = sVar2.Q();
            if (objQ10 == gVar) {
                objQ10 = new bp.p(11, b1Var);
                sVar2.o0(objQ10);
            }
            dVar3 = dVar2;
            sVar = sVar2;
            e.b(i12, iL, zBooleanValue, str, str2, str3, newBillingTheme, aVar2, (fz.a) objQ10, t1.e.d(-431531446, new l(dVar, 0), sVar2), t1.e.d(-293132351, new m(dVar3, 0), sVar2), sVar, ((i14 >> 6) & 14) | 805306752);
        } else {
            dVar3 = dVar2;
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(i11, i12, remoteConfigViewModel, onSwitchLanguage, onClickBillingBar, dVar, dVar3, i13);
        }
    }

    public static final void b(MainComposeActivity mainComposeActivity, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(922010199);
        int i12 = (sVar.h(mainComposeActivity) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            b1 b1VarO = l1.t.o(mainComposeActivity.s().f29433a0, sVar);
            b1 b1VarO2 = l1.t.o(mainComposeActivity.s().f29435b0, sVar);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = defpackage.e.v(R.drawable.new_learn_banner_bg_1, sVar);
            }
            a1 a1Var = (a1) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(ry.r.f50854a);
                sVar.o0(objQ2);
            }
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = l1.t.B(null);
                sVar.o0(objQ3);
            }
            int i13 = ((o0) mainComposeActivity.l()).f27733a.keyLanguage;
            int iL = ((h1) a1Var).l();
            l1 l1VarS = mainComposeActivity.s();
            boolean zH = sVar.h(mainComposeActivity) | sVar.h(context);
            Object objQ4 = sVar.Q();
            if (zH || objQ4 == gVar) {
                objQ4 = new at.h(12, mainComposeActivity, context);
                sVar.o0(objQ4);
            }
            fz.e eVar = (fz.e) objQ4;
            boolean zH2 = sVar.h(mainComposeActivity) | sVar.h(context);
            Object objQ5 = sVar.Q();
            if (zH2 || objQ5 == gVar) {
                objQ5 = new at.f(8, mainComposeActivity, context);
                sVar.o0(objQ5);
            }
            a(i13, iL, l1VarS, eVar, (fz.a) objQ5, t1.e.d(596664718, new j(mainComposeActivity, context, b1VarO2, b1VarO, 0), sVar), t1.e.d(869652693, new at.i(mainComposeActivity, context, a1Var, 4), sVar), sVar, 14155782);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k(mainComposeActivity, i11, 0);
        }
    }

    public static final void c(boolean z11, fz.a onClick, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(843256184);
        int i12 = (sVar.g(z11) ? 4 : 2) | i11 | (sVar.h(onClick) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
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
            l1.t.J(y2.j.f56917f, q0VarD, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            k2.b bVarY = se.k.y(R.drawable.ic_news_feed, sVar, 0);
            z1.r rVarN = e2.n(oVar, 24);
            boolean z12 = (i12 & 112) == 32;
            Object objQ = sVar.Q();
            if (z12 || objQ == l1.m.f39353a) {
                objQ = new at.r(13, onClick);
                sVar.o0(objQ);
            }
            d0.n.c(bVarY, null, iu.k.q(6, 7, (fz.a) objQ, sVar, rVarN, false), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 56, 120);
            sVar = sVar;
            if (z11) {
                sVar.d0(-1231509189);
                j0.c.g(sVar, d0.n.h(e2.n(j0.c.y(j0.r.f35391a.a(oVar, z1.c.f58465c), 2, CropImageView.DEFAULT_ASPECT_RATIO, 2), 10), ob.f.y((s1) sVar.j(v1.f31180a), sVar), r0.f.f48733a));
            } else {
                sVar.d0(-1242863280);
            }
            sVar.p(false);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new i(z11, onClick, i11, 0);
        }
    }
}
