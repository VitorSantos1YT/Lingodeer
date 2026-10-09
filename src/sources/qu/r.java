package qu;

import aj.uZCn.evRpcb;
import b0.t1;
import bp.z;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLeaderBoardType;
import com.lingodeer.data.model.uistate.LeaderBoardClass;
import com.lingodeer.data.model.uistate.LeaderBoardRankState;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import g2.f0;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.e2;
import j0.z1;
import j3.y0;
import l1.d0;
import l1.q1;
import l1.x1;
import mt.k6;
import qy.b0;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r {
    public static final void a(LeaderBoardClass leaderBoardClass, LeaderBoardRankState leaderBoardRankState, fz.a aVar, l1.n nVar, int i11) {
        LeaderBoardClass leaderBoardClass2;
        int i12;
        fz.a onDismiss = aVar;
        kotlin.jvm.internal.m.f(leaderBoardRankState, "leaderBoardRankState");
        kotlin.jvm.internal.m.f(onDismiss, "onDismiss");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(698169334);
        int i13 = i11 | (sVar.h(leaderBoardClass) ? 4 : 2) | (sVar.h(leaderBoardRankState) ? 32 : 16) | (sVar.h(onDismiss) ? 256 : 128);
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            e20.a aVarC = w4.c.c(sVar, -1168520582, sVar, -1633490746);
            boolean zF = sVar.f(null) | sVar.f(aVarC);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = w4.c.e(ur.a.class, aVarC, null, null, sVar);
            }
            sVar.p(false);
            sVar.p(false);
            ur.a aVar2 = (ur.a) objQ;
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
            z1.r rVarH = d0.n.h(e2.d(oVar, 1.0f), ((s1) sVar.j(v1.f31180a)).f31033p, f0.f28556b);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarH);
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
            boolean z11 = leaderBoardRankState instanceof LeaderBoardRankState.Top3UpgradeStatus;
            b0 b0Var = b0.f48488a;
            if (z11) {
                sVar.d0(1112349673);
                String strE0 = ub.a.e0(sVar, R.string.congratulations);
                Object objQ2 = sVar.Q();
                if (objQ2 == gVar) {
                    int preRank = leaderBoardClass.getPreRank();
                    if (preRank != 1) {
                        i12 = preRank != 2 ? R.string.you_won_3nd_place_in_s_league : R.string.you_won_2nd_place_in_s_league;
                    } else {
                        i12 = R.string.you_won_1st_place_in_s_league;
                    }
                    objQ2 = Integer.valueOf(i12);
                    sVar.o0(objQ2);
                }
                b(d(leaderBoardClass.getClassName(), sVar), strE0, oz.x.q0(ub.a.e0(sVar, ((Number) objQ2).intValue()), "%lv", ub.a.e0(sVar, e(((LeaderBoardRankState.Top3UpgradeStatus) leaderBoardRankState).getPreviousClass(), sVar))), null, onDismiss, sVar, (i13 << 6) & 57344);
                leaderBoardClass2 = leaderBoardClass;
                boolean zH = sVar.h(aVar2) | sVar.h(leaderBoardClass2);
                Object objQ3 = sVar.Q();
                if (zH || objQ3 == gVar) {
                    objQ3 = new q(aVar2, leaderBoardClass2, null, 0);
                    sVar.o0(objQ3);
                }
                l1.t.f((fz.e) objQ3, b0Var, sVar);
                sVar.p(false);
            } else {
                leaderBoardClass2 = leaderBoardClass;
                if (leaderBoardRankState instanceof LeaderBoardRankState.UpgradeStatus) {
                    sVar.d0(1113704683);
                    b(d(leaderBoardClass2.getClassName(), sVar), ub.a.e0(sVar, R.string.congratulations), oz.x.q0(oz.x.q0(ub.a.e0(sVar, R.string.you_finished_no_s_and_advanced_to_lv_league), "%s", String.valueOf(leaderBoardClass2.getPreRank())), "%lv", ub.a.e0(sVar, e(leaderBoardClass2.getClassName(), sVar))), null, aVar, sVar, (i13 << 6) & 57344);
                    boolean zH2 = sVar.h(aVar2) | sVar.h(leaderBoardClass2);
                    Object objQ4 = sVar.Q();
                    if (zH2 || objQ4 == gVar) {
                        objQ4 = new q(aVar2, leaderBoardClass2, null, 1);
                        sVar.o0(objQ4);
                    }
                    l1.t.f((fz.e) objQ4, b0Var, sVar);
                    sVar.p(false);
                } else {
                    if (leaderBoardRankState instanceof LeaderBoardRankState.KeepStatus) {
                        sVar.d0(1114931229);
                        b(d(leaderBoardClass2.getClassName(), sVar), BuildConfig.VERSION_NAME, oz.x.q0(oz.x.q0(ub.a.e0(sVar, R.string.you_finished_no_s_and_remained_to_lv_league), "%s", String.valueOf(leaderBoardClass2.getPreRank())), "%lv", ub.a.e0(sVar, e(leaderBoardClass2.getClassName(), sVar))), null, aVar, sVar, (57344 & (i13 << 6)) | 48);
                        boolean zH3 = sVar.h(aVar2) | sVar.h(leaderBoardClass2);
                        Object objQ5 = sVar.Q();
                        if (zH3 || objQ5 == gVar) {
                            objQ5 = new q(aVar2, leaderBoardClass2, null, 2);
                            sVar.o0(objQ5);
                        }
                        l1.t.f((fz.e) objQ5, b0Var, sVar);
                        sVar.p(false);
                    } else if (leaderBoardRankState instanceof LeaderBoardRankState.DowngradeStatus) {
                        sVar.d0(1116146212);
                        onDismiss = aVar;
                        b(d(leaderBoardClass2.getClassName(), sVar), ub.a.e0(sVar, R.string.better_luck_next_time), oz.x.q0(oz.x.q0(ub.a.e0(sVar, R.string.you_finished_no_s_and_moved_down_to_lv_league), "%s", String.valueOf(leaderBoardClass2.getPreRank())), "%lv", ub.a.e0(sVar, e(leaderBoardClass2.getClassName(), sVar))), null, onDismiss, sVar, (i13 << 6) & 57344);
                        boolean zH4 = sVar.h(aVar2) | sVar.h(leaderBoardClass2);
                        Object objQ6 = sVar.Q();
                        if (zH4 || objQ6 == gVar) {
                            objQ6 = new q(aVar2, leaderBoardClass2, null, 3);
                            sVar.o0(objQ6);
                        }
                        l1.t.f((fz.e) objQ6, b0Var, sVar);
                        sVar.p(false);
                    } else {
                        onDismiss = aVar;
                        if (leaderBoardRankState instanceof LeaderBoardRankState.NewCircleStatus) {
                            sVar.d0(1117365380);
                            c(leaderBoardClass2, onDismiss, sVar, ((i13 << 3) & 112) | 6 | (i13 & 896));
                            boolean zH5 = sVar.h(aVar2) | sVar.h(leaderBoardClass2);
                            Object objQ7 = sVar.Q();
                            if (zH5 || objQ7 == gVar) {
                                objQ7 = new q(aVar2, leaderBoardClass2, null, 4);
                                sVar.o0(objQ7);
                            }
                            l1.t.f((fz.e) objQ7, b0Var, sVar);
                            sVar.p(false);
                        } else {
                            sVar.d0(1117918420);
                            sVar.p(false);
                        }
                    }
                    sVar.p(true);
                    sVar.p(true);
                }
            }
            onDismiss = aVar;
            sVar.p(true);
            sVar.p(true);
        } else {
            leaderBoardClass2 = leaderBoardClass;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k6(leaderBoardClass2, leaderBoardRankState, false, onDismiss, i11, 12);
        }
    }

    public static final void b(int i11, String str, String str2, z1.r rVar, fz.a aVar, l1.n nVar, int i12) {
        int i13;
        z1.r rVar2;
        int i14;
        boolean z11;
        float f5;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1684341971);
        if ((i12 & 6) == 0) {
            i13 = (sVar.d(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.f(str) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= sVar.f(str2) ? 256 : 128;
        }
        int i15 = i13 | 3072;
        if ((i12 & 24576) == 0) {
            i15 |= sVar.h(aVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if (sVar.T(i15 & 1, (i15 & 9363) != 9362)) {
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
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
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            j0.c.g(sVar, j0.v.a(oVar, 0.5f));
            tv.g.a(e2.n(oVar, 220), i11, null, null, false, null, sVar, ((i15 << 3) & 112) | 6, 124);
            if (str.length() > 0) {
                sVar.d0(349167037);
                i14 = 340482635;
                ua.b(str, j0.c.C(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 19, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 58, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), f0.e(4280953386L), j3.A(20), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, ((i15 >> 3) & 14) | 48, 0, 65532);
                sVar = sVar;
                z11 = false;
            } else {
                i14 = 340482635;
                z11 = false;
                sVar.d0(340482635);
            }
            sVar.p(z11);
            if (str2.length() > 0) {
                sVar.d0(349538014);
                l1.s sVar2 = sVar;
                boolean z12 = z11;
                ua.b(str2, j0.c.C(j0.c.E(r16, CropImageView.DEFAULT_ASPECT_RATIO, 12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 58, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), f0.e(4280953386L), j3.A(18), n3.s.f43178t, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar2, ((i15 >> 6) & 14) | 48, 0, 65532);
                sVar = sVar2;
                sVar.p(z12);
                z11 = z12;
                f5 = 0.0f;
            } else {
                f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                sVar.d0(i14);
                sVar.p(z11);
            }
            j0.c.g(sVar, j0.v.a(r16, 2.0f));
            boolean z13 = (i15 & 57344) == 16384 ? true : z11;
            Object objQ = sVar.Q();
            if (z13 || objQ == l1.m.f39353a) {
                objQ = new okhttp3.b(7, aVar);
                sVar.o0(objQ);
            }
            l1.s sVar3 = sVar;
            iu.k.e((fz.a) objQ, e2.e(j0.c.C(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 26, 7), 38, f5, 2), 1.0f), false, 0L, null, b.f48344d, sVar3, 196656, 28);
            sVar = sVar3;
            sVar.p(true);
            rVar2 = oVar;
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new z(i11, i12, aVar, str, str2, rVar2);
        }
    }

    public static final void c(LeaderBoardClass leaderBoardClass, fz.a aVar, l1.n nVar, int i11) {
        int i12;
        fz.a aVar2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1958823345);
        if ((i11 & 48) == 0) {
            i12 = i11 | (sVar.h(leaderBoardClass) ? 32 : 16);
        } else {
            i12 = i11;
        }
        int i13 = i12 | (sVar.h(aVar) ? 256 : 128);
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarA = j0.v.a(e2.e(j0.c.v(oVar), 1.0f), 1.0f);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarA);
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
            j0.c.g(sVar, j0.v.a(oVar, 1.0f));
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
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
            d0.n.c(se.k.y(leaderBoardClass.getMediumIconRes(), sVar, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 124);
            d0.n.c(se.k.y(R.drawable.lb_class_status_downgrade_arrow, sVar, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 124);
            d0.n.c(se.k.y(R.drawable.lb_group_e_medium, sVar, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 124);
            sVar.p(true);
            String strE0 = ub.a.e0(sVar, R.string.new_beginning);
            d0 d0Var = ua.f31167a;
            float f5 = 58;
            ua.b(strE0, j0.c.C(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 19, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), f0.e(4280953386L), j3.A(20), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 48, 0, 65532);
            ua.b(oz.x.q0(ub.a.e0(sVar, R.string.well_done_you_finished_no_s_in_diamond_league_let_s_start_again_from_bronze_league), "%s", String.valueOf(leaderBoardClass.getPreRank())), j0.c.C(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), f0.e(4280953386L), j3.A(18), n3.s.f43178t, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar, 48, 0, 65532);
            sVar = sVar;
            j0.c.g(sVar, j0.v.a(oVar, 2.0f));
            boolean z11 = (i13 & 896) == 256;
            Object objQ = sVar.Q();
            if (z11 || objQ == l1.m.f39353a) {
                aVar2 = aVar;
                objQ = new okhttp3.b(6, aVar2);
                sVar.o0(objQ);
            } else {
                aVar2 = aVar;
            }
            iu.k.e((fz.a) objQ, e2.e(j0.c.C(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 26, 7), 38, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), false, 0L, null, b.f48345e, sVar, 196656, 28);
            sVar.p(true);
        } else {
            aVar2 = aVar;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t1(leaderBoardClass, i11, 20, aVar2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    public static final int d(String className, l1.n nVar) {
        int i11;
        kotlin.jvm.internal.m.f(className, "className");
        l1.s sVar = (l1.s) nVar;
        Object objQ = sVar.Q();
        if (objQ == l1.m.f39353a) {
            switch (className) {
                case "ClassB":
                    i11 = R.raw.achievement_leaderboard_level_b;
                    break;
                case "ClassC":
                    i11 = R.raw.achievement_leaderboard_level_c;
                    break;
                case "ClassD":
                    i11 = R.raw.achievement_leaderboard_level_d;
                    break;
                case "ClassE":
                    i11 = R.raw.achievement_leaderboard_level_e;
                    break;
                case "ClassF":
                    i11 = R.raw.achievement_leaderboard_level_f;
                    break;
                default:
                    i11 = R.raw.achievement_leaderboard_level_a;
                    break;
            }
            objQ = Integer.valueOf(i11);
            sVar.o0(objQ);
        }
        return ((Number) objQ).intValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    public static final int e(String className, l1.n nVar) {
        int i11;
        kotlin.jvm.internal.m.f(className, "className");
        l1.s sVar = (l1.s) nVar;
        Object objQ = sVar.Q();
        if (objQ == l1.m.f39353a) {
            switch (className.hashCode()) {
                case 2020897258:
                    if (!className.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_B)) {
                        i11 = R.string.class_a;
                    } else {
                        i11 = R.string.class_b;
                    }
                    break;
                case 2020897259:
                    if (!className.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_C)) {
                        i11 = R.string.class_a;
                    } else {
                        i11 = R.string.class_c;
                    }
                    break;
                case 2020897260:
                    if (!className.equals(evRpcb.czBrMpeQUveHopT)) {
                        i11 = R.string.class_a;
                    } else {
                        i11 = R.string.class_d;
                    }
                    break;
                case 2020897261:
                    if (!className.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_E)) {
                        i11 = R.string.class_a;
                    } else {
                        i11 = R.string.class_e;
                    }
                    break;
                case 2020897262:
                    if (!className.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_F)) {
                        i11 = R.string.class_a;
                    } else {
                        i11 = R.string.class_f;
                    }
                    break;
                default:
                    i11 = R.string.class_a;
                    break;
            }
            objQ = Integer.valueOf(i11);
            sVar.o0(objQ);
        }
        return ((Number) objQ).intValue();
    }
}
