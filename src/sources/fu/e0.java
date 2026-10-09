package fu;

import a0.f1;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import bt.w6;
import com.lingodeer.R;
import com.lingodeer.data.model.DayStreakWeeklyItem;
import com.lingodeer.data.model.DayStreakWeeklyItemStatus;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import dt.b2;
import fr.j3;
import fr.n2;
import h1.k7;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.e2;
import j0.i1;
import j0.z1;
import j3.y0;
import java.util.List;
import l1.a1;
import l1.b1;
import l1.h1;
import l1.q1;
import l1.x1;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e0 {
    public static final void a(String text, z1.r rVar, DayStreakWeeklyItemStatus dayStreakFinishedFireItemStatus, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(text, "text");
        kotlin.jvm.internal.m.f(dayStreakFinishedFireItemStatus, "dayStreakFinishedFireItemStatus");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1992737611);
        int i12 = i11 | (sVar.f(text) ? 4 : 2) | (sVar.f(rVar) ? 32 : 16) | (sVar.d(dayStreakFinishedFireItemStatus.ordinal()) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            j0.u uVarA = j0.t.a(j0.i.f35309g, z1.c.P, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, uVarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            ua.b(text, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), g2.f0.e(4288453788L), j3.A(16), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, i12 & 14, 0, 65534);
            sVar = sVar;
            z1.j jVar = z1.c.H;
            float f5 = 50;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarG = e2.g(oVar, f5);
            q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarG);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, q0VarD, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            int i13 = d0.f28084a[dayStreakFinishedFireItemStatus.ordinal()];
            l1.g gVar = l1.m.f39353a;
            if (i13 == 1) {
                sVar.d0(-1887001484);
                z1.r rVarN = e2.n(oVar, 30);
                d0.v vVarA = d0.n.a(g2.f0.e(4292401368L), (float) 1.5d);
                z1.r rVarK = d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.f48733a, rVarN);
                Object objQ = sVar.Q();
                if (objQ == gVar) {
                    objQ = new n2(14);
                    sVar.o0(objQ);
                }
                j0.o.a(j0.r.f35391a.a(g2.f0.q(rVarK, (fz.c) objQ), jVar), sVar, 0);
                sVar.p(false);
            } else if (i13 == 2) {
                sVar.d0(-1886473151);
                d0.n.c(se.k.y(R.drawable.day_streak_finished_item_reset, sVar, 0), null, e2.n(oVar, 30), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
                sVar.p(false);
            } else if (i13 == 3 || i13 == 4) {
                sVar.d0(-1886077839);
                ad.p pVarL = gb.r.L(new ad.r(R.raw.day_streak_finished_fire_checked), sVar);
                Object objQ2 = sVar.Q();
                if (objQ2 == gVar) {
                    objQ2 = l1.t.B(Boolean.FALSE);
                    sVar.o0(objQ2);
                }
                b1 b1Var = (b1) objQ2;
                ad.i iVarE = ff.h.e((wc.h) pVarL.getValue(), ((Boolean) b1Var.getValue()).booleanValue(), CropImageView.DEFAULT_ASPECT_RATIO, sVar, 1020);
                Object objQ3 = sVar.Q();
                if (objQ3 == gVar) {
                    objQ3 = new b2(b1Var, (vy.d) null, 4);
                    sVar.o0(objQ3);
                }
                l1.t.f((fz.e) objQ3, qy.b0.f48488a, sVar);
                wc.h hVar5 = (wc.h) pVarL.getValue();
                boolean zF = sVar.f(iVarE);
                Object objQ4 = sVar.Q();
                if (zF || objQ4 == gVar) {
                    objQ4 = new w6(iVarE, 4);
                    sVar.o0(objQ4);
                }
                j3.a(hVar5, (fz.a) objQ4, j0.c.y(e2.s(oVar, f5), CropImageView.DEFAULT_ASPECT_RATIO, -10, 1), null, null, w2.i.f54517d, sVar, 384, 48, 129016);
                sVar = sVar;
                sVar.p(false);
            } else {
                if (i13 != 5) {
                    throw nv.p.x(sVar, 1740242968, false);
                }
                sVar.d0(-1885146258);
                d0.n.c(se.k.y(R.drawable.day_streak_shield, sVar, 0), null, e2.n(oVar, 34), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
                sVar.p(false);
            }
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fp.e(text, rVar, dayStreakFinishedFireItemStatus, i11, 2);
        }
    }

    public static final void b(hu.o oVar, fz.a aVar, l1.n nVar, final int i11) {
        final hu.o oVar2;
        x1 x1VarT;
        fz.e eVar;
        int i12;
        final hu.o oVar3;
        int i13;
        long jE;
        int i14;
        int i15;
        hu.o oVar4;
        boolean z11;
        int i16;
        int i17;
        final fz.a onClickClose = aVar;
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-773191733);
        int i18 = i11 | 2;
        if ((i11 & 48) == 0) {
            i18 |= sVar.h(onClickClose) ? 32 : 16;
        }
        if (sVar.T(i18 & 1, (i18 & 19) != 18)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                i12 = 6;
                oVar3 = (hu.o) ViewModelKt.viewModel(kotlin.jvm.internal.z.a(hu.o.class), current, (String) null, (ViewModelProvider.Factory) null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, sVar, 0, 0);
                i13 = i18 & (-15);
            } else {
                sVar.W();
                i13 = i18 & (-15);
                i12 = 6;
                oVar3 = oVar;
            }
            sVar.q();
            b1 b1VarO = l1.t.o(oVar3.f33813c, sVar);
            if (((List) b1VarO.getValue()).isEmpty()) {
                x1VarT = sVar.t();
                if (x1VarT == null) {
                    return;
                }
                final int i19 = 0;
                eVar = new fz.e() { // from class: fu.a0
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        int i21 = i19;
                        l1.n nVar2 = (l1.n) obj;
                        ((Integer) obj2).getClass();
                        switch (i21) {
                            case 0:
                                e0.b(oVar3, onClickClose, nVar2, l1.t.M(i11 | 1));
                                break;
                            default:
                                e0.b(oVar3, onClickClose, nVar2, l1.t.M(i11 | 1));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
            } else {
                Object objQ = sVar.Q();
                l1.g gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    objQ = l1.t.q(sVar);
                    sVar.o0(objQ);
                }
                rz.b0 b0Var = (rz.b0) objQ;
                Object objQ2 = sVar.Q();
                if (objQ2 == gVar) {
                    objQ2 = defpackage.e.v(0, sVar);
                }
                a1 a1Var = (a1) objQ2;
                Object objQ3 = sVar.Q();
                if (objQ3 == gVar) {
                    objQ3 = l1.t.B(Boolean.FALSE);
                    sVar.o0(objQ3);
                }
                b1 b1Var = (b1) objQ3;
                h1 h1Var = (h1) a1Var;
                if (h1Var.l() > 0) {
                    sVar.d0(-244815802);
                    jE = ((s1) sVar.j(v1.f31180a)).f31017a;
                    sVar.p(false);
                } else {
                    sVar.d0(-244761738);
                    sVar.p(false);
                    jE = g2.f0.e(4289180880L);
                }
                long j11 = jE;
                DayStreakWeeklyItemStatus status = ((DayStreakWeeklyItem) ((List) b1VarO.getValue()).get(i12)).getStatus();
                DayStreakWeeklyItemStatus dayStreakWeeklyItemStatus = DayStreakWeeklyItemStatus.STREAK;
                int i21 = status == dayStreakWeeklyItemStatus ? R.string.test_finish : R.string.test_continue;
                if (((DayStreakWeeklyItem) ((List) b1VarO.getValue()).get(i12)).getStatus() == dayStreakWeeklyItemStatus) {
                    i14 = -244417948;
                    i15 = R.string.complete_one_lesson_to_restart_your_streak;
                } else if (((DayStreakWeeklyItem) ((List) b1VarO.getValue()).get(5)).getStatus() == DayStreakWeeklyItemStatus.STREAK_RESET) {
                    i14 = -244252780;
                    i15 = R.string.miss_a_day_lose_the_streak;
                } else {
                    i14 = -244179558;
                    i15 = R.string.your_streak_is_the_number_of_days_you_learn_in_a_row;
                }
                String strM = ep.a.m(sVar, i14, i15, sVar, false);
                boolean zH = sVar.h(oVar3);
                Object objQ4 = sVar.Q();
                vy.d dVar = null;
                if (zH || objQ4 == gVar) {
                    hu.o oVar5 = oVar3;
                    c0 c0Var = new c0(oVar5, a1Var, b1Var, dVar, 0);
                    oVar4 = oVar5;
                    sVar.o0(c0Var);
                    objQ4 = c0Var;
                } else {
                    oVar4 = oVar3;
                }
                l1.t.f((fz.e) objQ4, qy.b0.f48488a, sVar);
                z1.o oVar6 = z1.o.f58481a;
                z1.r rVarD = e2.d(j0.c.F(oVar6), 1.0f);
                j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
                int iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL = sVar.l();
                z1.r rVarC = z1.a.c(sVar, rVarD);
                y2.k.J.getClass();
                y2.i iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                y2.h hVar = y2.j.f56917f;
                l1.t.J(hVar, uVarA, sVar);
                y2.h hVar2 = y2.j.f56916e;
                l1.t.J(hVar2, q1VarL, sVar);
                y2.h hVar3 = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
                }
                y2.h hVar4 = y2.j.f56915d;
                l1.t.J(hVar4, rVarC, sVar);
                j0.b bVar = j0.i.f35303a;
                z1.i iVar2 = z1.c.L;
                a2 a2VarA = z1.a(bVar, iVar2, sVar, 0);
                int iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                int i22 = i13;
                z1.r rVarC2 = z1.a.c(sVar, oVar6);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar, a2VarA, sVar);
                l1.t.J(hVar2, q1VarL2, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
                }
                l1.t.J(hVar4, rVarC2, sVar);
                boolean z12 = (i22 & 112) == 32;
                Object objQ5 = sVar.Q();
                if (z12 || objQ5 == gVar) {
                    objQ5 = new et.p(7, onClickClose);
                    sVar.o0(objQ5);
                }
                k7.h((fz.a) objQ5, null, false, null, a.f28050g, sVar, 196608, 30);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                j0.c.g(sVar, new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                sVar.p(true);
                Integer numValueOf = Integer.valueOf(h1Var.l());
                Object objQ6 = sVar.Q();
                if (objQ6 == gVar) {
                    objQ6 = new n2(13);
                    sVar.o0(objQ6);
                }
                a0.o.b(numValueOf, null, (fz.c) objQ6, null, BuildConfig.VERSION_NAME, null, t1.e.d(1047210123, new bt.t(a1Var, 1), sVar), sVar, 1597824, 42);
                float f5 = 25;
                ua.b(oz.x.q0(ub.a.e0(sVar, R.string.s_day_streak), "%s", BuildConfig.VERSION_NAME), j0.c.E(oVar6, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), j11, j3.A(26), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 48, 0, 65532);
                j0.c.g(sVar, j0.v.a(oVar6, 1.0f));
                z1.r rVarG = e2.g(e2.e(j0.c.C(oVar6, 20, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 114);
                d0.v vVarA = d0.n.a(g2.f0.e(4292203989L), (float) 1.5d);
                z1.r rVarE = j0.c.E(d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.d(12), rVarG), CropImageView.DEFAULT_ASPECT_RATIO, 24, CropImageView.DEFAULT_ASPECT_RATIO, 18, 5);
                a2 a2VarA2 = z1.a(bVar, iVar2, sVar, 0);
                int iHashCode3 = Long.hashCode(sVar.T);
                q1 q1VarL3 = sVar.l();
                z1.r rVarC3 = z1.a.c(sVar, rVarE);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar, a2VarA2, sVar);
                l1.t.J(hVar2, q1VarL3, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                }
                l1.t.J(hVar4, rVarC3, sVar);
                sVar.d0(1039643355);
                for (DayStreakWeeklyItem dayStreakWeeklyItem : (List) b1VarO.getValue()) {
                    switch (dayStreakWeeklyItem.getWeekDay()) {
                        case 1:
                            z11 = false;
                            i16 = 1039647180;
                            i17 = R.string.sun;
                            break;
                        case 2:
                            z11 = false;
                            i16 = 1039649612;
                            i17 = R.string.mon;
                            break;
                        case 3:
                            z11 = false;
                            i16 = 1039652044;
                            i17 = R.string.tue;
                            break;
                        case 4:
                            z11 = false;
                            i16 = 1039654476;
                            i17 = R.string.wed;
                            break;
                        case 5:
                            z11 = false;
                            i16 = 1039656908;
                            i17 = R.string.thu;
                            break;
                        case 6:
                            z11 = false;
                            i16 = 1039659340;
                            i17 = R.string.fri;
                            break;
                        default:
                            i16 = 1039661868;
                            i17 = R.string.sat;
                            z11 = false;
                            break;
                    }
                    String strM2 = ep.a.m(sVar, i16, i17, sVar, z11);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    a(strM2, new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), dayStreakWeeklyItem.getStatus(), sVar, 0);
                }
                sVar.p(false);
                sVar.p(true);
                z1.r rVarA = j0.v.a(oVar6, 3.0f);
                z1.j jVar = z1.c.f58463a;
                q0 q0VarD = j0.o.d(jVar, false);
                int iHashCode4 = Long.hashCode(sVar.T);
                q1 q1VarL4 = sVar.l();
                z1.r rVarC4 = z1.a.c(sVar, rVarA);
                y2.k.J.getClass();
                y2.i iVar3 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                y2.h hVar5 = y2.j.f56917f;
                l1.t.J(hVar5, q0VarD, sVar);
                y2.h hVar6 = y2.j.f56916e;
                l1.t.J(hVar6, q1VarL4, sVar);
                y2.h hVar7 = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                    defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar7);
                }
                y2.h hVar8 = y2.j.f56915d;
                l1.t.J(hVar8, rVarC4, sVar);
                float f11 = 52;
                ua.b(strM, j0.r.f35391a.a(j0.c.E(oVar6, f11, f5, f11, CropImageView.DEFAULT_ASPECT_RATIO, 8), z1.c.f58464b), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), 0L, j3.A(16), n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744441), sVar, 0, 0, 65532);
                sVar.p(true);
                j0.c.g(sVar, j0.v.a(oVar6, 1.0f));
                z1.r rVarG2 = e2.g(oVar6, 81);
                q0 q0VarD2 = j0.o.d(jVar, false);
                int iHashCode5 = Long.hashCode(sVar.T);
                q1 q1VarL5 = sVar.l();
                z1.r rVarC5 = z1.a.c(sVar, rVarG2);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar5, q0VarD2, sVar);
                l1.t.J(hVar6, q1VarL5, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode5))) {
                    defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar7);
                }
                l1.t.J(hVar8, rVarC5, sVar);
                onClickClose = aVar;
                oVar2 = oVar4;
                a0.j0.c(((Boolean) b1Var.getValue()).booleanValue(), null, f1.e(null, 3), f1.f(null, 3), null, t1.e.d(1333180576, new w(b1VarO, b0Var, oVar2, onClickClose, a1Var, b1Var, i21), sVar), sVar, 1600518, 18);
                sVar = sVar;
                sVar.p(true);
                sVar.p(true);
            }
            x1VarT.f39502d = eVar;
        }
        sVar.W();
        oVar2 = oVar;
        x1VarT = sVar.t();
        if (x1VarT != null) {
            final int i23 = 1;
            eVar = new fz.e() { // from class: fu.a0
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    int i24 = i23;
                    l1.n nVar2 = (l1.n) obj;
                    ((Integer) obj2).getClass();
                    switch (i24) {
                        case 0:
                            e0.b(oVar2, onClickClose, nVar2, l1.t.M(i11 | 1));
                            break;
                        default:
                            e0.b(oVar2, onClickClose, nVar2, l1.t.M(i11 | 1));
                            break;
                    }
                    return qy.b0.f48488a;
                }
            };
            x1VarT.f39502d = eVar;
        }
    }

    public static final void c(a1 a1Var, int i11) {
        ((h1) a1Var).m(i11);
    }
}
