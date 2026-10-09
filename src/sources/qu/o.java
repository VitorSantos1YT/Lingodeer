package qu;

import b0.k0;
import bt.a2;
import bt.a3;
import bt.g5;
import bt.h7;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLeaderBoardType;
import com.lingodeer.data.model.AchievementLevelType;
import com.lingodeer.data.model.uistate.LeaderBoardClass;
import com.lingodeer.data.model.uistate.LeaderBoardRankState;
import com.lingodeer.data.model.uistate.LeaderBoardUiState;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import fr.o0;
import g2.f0;
import g2.j0;
import h1.a8;
import h1.k7;
import h1.s1;
import h1.t0;
import h1.ua;
import h1.v1;
import hh.p0;
import j0.e2;
import j0.i1;
import j0.z1;
import j3.y0;
import java.util.ArrayList;
import java.util.List;
import l0.y;
import l1.a1;
import l1.b1;
import l1.c0;
import l1.c3;
import l1.d0;
import l1.h1;
import l1.q1;
import l1.x1;
import mt.r3;
import pr.z;
import rz.b0;
import vt.n0;
import w2.a0;
import w2.q0;
import z2.g0;
import z2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o {
    public static final void a(b1 showBottomSheet, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(showBottomSheet, "showBottomSheet");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1384314966);
        if (sVar.T(i11 & 1, (i11 & 3) != 2)) {
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = l1.t.q(sVar);
                sVar.o0(objQ);
            }
            iu.k.f(showBottomSheet, null, null, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, b.f48343c, sVar, 805306374, 510);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.s(i11, showBottomSheet);
        }
    }

    public static final void b(final String str, final List topUserList, final List keepUserList, final List dropUserList, final LeaderBoardUiState.Success leaderBoardUiState, final fz.a pullToRefreshing, fz.e eVar, l1.n nVar, final int i11) {
        int i12;
        l1.s sVar;
        final fz.e eVar2;
        x1 x1VarT;
        fz.e eVar3;
        l1.g gVar;
        l0.w wVar;
        a1 a1Var;
        List list;
        List list2;
        Object iVar;
        Object r3Var;
        final fz.e quickReviewEntrance = eVar;
        kotlin.jvm.internal.m.f(topUserList, "topUserList");
        kotlin.jvm.internal.m.f(keepUserList, "keepUserList");
        kotlin.jvm.internal.m.f(dropUserList, "dropUserList");
        kotlin.jvm.internal.m.f(leaderBoardUiState, "leaderBoardUiState");
        kotlin.jvm.internal.m.f(pullToRefreshing, "pullToRefreshing");
        kotlin.jvm.internal.m.f(quickReviewEntrance, "quickReviewEntrance");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1164454092);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.f("leaderboard_detail") ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.f(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.h(topUserList) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(keepUserList) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.h(dropUserList) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.h(leaderBoardUiState) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar2.h(pullToRefreshing) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar2.h(quickReviewEntrance) ? 8388608 : 4194304;
        }
        int i13 = i12;
        if (sVar2.T(i13 & 1, (i13 & 4793491) != 4793490)) {
            e20.a aVarC = w4.c.c(sVar2, -1168520582, sVar2, -1633490746);
            boolean zF = sVar2.f(null) | sVar2.f(aVarC);
            Object objQ = sVar2.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (zF || objQ == gVar2) {
                objQ = w4.c.e(ur.a.class, aVarC, null, null, sVar2);
            }
            sVar2.p(false);
            sVar2.p(false);
            ur.a aVar = (ur.a) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar2) {
                objQ2 = l1.t.q(sVar2);
                sVar2.o0(objQ2);
            }
            b0 b0Var = (b0) objQ2;
            if (leaderBoardUiState.getLeaderBoardClass() == null) {
                x1VarT = sVar2.t();
                if (x1VarT == null) {
                    return;
                }
                final int i14 = 1;
                eVar3 = new fz.e() { // from class: qu.e
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i14) {
                            case 0:
                                ((Integer) obj2).getClass();
                                o.b(str, topUserList, keepUserList, dropUserList, leaderBoardUiState, pullToRefreshing, quickReviewEntrance, (l1.n) obj, l1.t.M(i11 | 1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                o.b(str, topUserList, keepUserList, dropUserList, leaderBoardUiState, pullToRefreshing, quickReviewEntrance, (l1.n) obj, l1.t.M(i11 | 1));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
            } else {
                boolean zF2 = sVar2.f(leaderBoardUiState.getLeaderBoardRankState());
                Object objQ3 = sVar2.Q();
                if (zF2 || objQ3 == gVar2) {
                    LeaderBoardRankState leaderBoardRankState = leaderBoardUiState.getLeaderBoardRankState();
                    objQ3 = Integer.valueOf(leaderBoardRankState instanceof LeaderBoardRankState.RankIncrease ? ((LeaderBoardRankState.RankIncrease) leaderBoardRankState).getIncrease() : 0);
                    sVar2.o0(objQ3);
                }
                int iIntValue = ((Number) objQ3).intValue();
                c3 c3Var = g1.f58547h;
                v3.c cVar = (v3.c) sVar2.j(c3Var);
                boolean zIsRefreshing = leaderBoardUiState.isRefreshing();
                boolean z11 = (i13 & 3670016) == 1048576;
                Object objQ4 = sVar2.Q();
                if (z11 || objQ4 == gVar2) {
                    objQ4 = new okhttp3.b(5, pullToRefreshing);
                    sVar2.o0(objQ4);
                }
                fz.a onRefresh = (fz.a) objQ4;
                kotlin.jvm.internal.m.f(onRefresh, "onRefresh");
                sVar2.e0(1368473950);
                float f5 = kw.a.f38843a;
                float f11 = kw.a.f38844b;
                if (v3.f.a(f5, 0) <= 0) {
                    throw new IllegalArgumentException("The refresh trigger must be greater than zero!");
                }
                sVar2.e0(773894976);
                sVar2.e0(-492369756);
                Object objQ5 = sVar2.Q();
                if (objQ5 == gVar2) {
                    c0 c0Var = new c0(l1.t.q(sVar2));
                    sVar2.o0(c0Var);
                    objQ5 = c0Var;
                }
                sVar2.p(false);
                b0 b0Var2 = ((c0) objQ5).f39245a;
                sVar2.p(false);
                b1 b1VarH = l1.t.H(onRefresh, sVar2);
                kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
                kotlin.jvm.internal.v vVar2 = new kotlin.jvm.internal.v();
                v3.c cVar2 = (v3.c) sVar2.j(c3Var);
                vVar.f38358a = cVar2.e0(f5);
                vVar2.f38358a = cVar2.e0(f11);
                sVar2.e0(-2105888595);
                boolean zF3 = sVar2.f(b0Var2);
                Object objQ6 = sVar2.Q();
                if (zF3 || objQ6 == gVar2) {
                    objQ6 = new kw.h(b0Var2, b1VarH, vVar2.f38358a, vVar.f38358a);
                    sVar2.o0(objQ6);
                }
                kw.h state = (kw.h) objQ6;
                sVar2.p(false);
                l1.t.j(new a8(state, zIsRefreshing, vVar, vVar2), sVar2);
                sVar2.p(false);
                Object objQ7 = sVar2.Q();
                if (objQ7 == gVar2) {
                    objQ7 = defpackage.e.v(0, sVar2);
                }
                a1 a1Var2 = (a1) objQ7;
                Object objQ8 = sVar2.Q();
                if (objQ8 == gVar2) {
                    objQ8 = l1.t.B(Boolean.FALSE);
                    sVar2.o0(objQ8);
                }
                b1 b1Var = (b1) objQ8;
                Object objQ9 = sVar2.Q();
                if (objQ9 == gVar2) {
                    objQ9 = l1.t.B(Boolean.FALSE);
                    sVar2.o0(objQ9);
                }
                b1 b1Var2 = (b1) objQ9;
                Object objQ10 = sVar2.Q();
                if (objQ10 == gVar2) {
                    objQ10 = l1.t.B(0);
                    sVar2.o0(objQ10);
                }
                b1 b1Var3 = (b1) objQ10;
                iu.k.f(b1Var, null, null, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, t1.e.d(1787044976, new g5(8, b1Var), sVar2), sVar2, 805306374, 510);
                iu.k.f(b1Var2, null, null, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, t1.e.d(1916586407, new g5(9, b1Var3), sVar2), sVar2, 805306374, 510);
                kotlin.jvm.internal.m.f(state, "state");
                kw.g gVar3 = new kw.g(new a3(1, state, kw.h.class, "onPull", "onPull$compose_material3_pullrefresh_release(F)F", 0, 18), new f0.x1(2, state, kw.h.class, "onRelease", "onRelease$compose_material3_pullrefresh_release(F)F", 4, 1));
                z1.o oVar = z1.o.f58481a;
                z1.r rVarX = g0.x(oVar, g0.x(oVar, r2.f.a(oVar, gVar3, null)));
                z1.j jVar = z1.c.f58463a;
                q0 q0VarD = j0.o.d(jVar, false);
                int iHashCode = Long.hashCode(sVar2.T);
                q1 q1VarL = sVar2.l();
                z1.r rVarC = z1.a.c(sVar2, rVarX);
                y2.k.J.getClass();
                y2.i iVar2 = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar2);
                } else {
                    sVar2.r0();
                }
                y2.h hVar = y2.j.f56917f;
                l1.t.J(hVar, q0VarD, sVar2);
                y2.h hVar2 = y2.j.f56916e;
                l1.t.J(hVar2, q1VarL, sVar2);
                y2.h hVar3 = y2.j.f56918g;
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
                }
                y2.h hVar4 = y2.j.f56915d;
                l1.t.J(hVar4, rVarC, sVar2);
                l0.w wVarA = y.a(0, sVar2, 3);
                Boolean boolValueOf = Boolean.valueOf(leaderBoardUiState.getScrollToUserPos());
                boolean zH = ((i13 & 112) == 32) | sVar2.h(leaderBoardUiState) | sVar2.f(cVar) | sVar2.h(topUserList) | sVar2.h(dropUserList) | sVar2.f(wVarA);
                Object objQ11 = sVar2.Q();
                if (zH || objQ11 == gVar2) {
                    l1.g gVar4 = gVar2;
                    a1Var = a1Var2;
                    gVar = gVar4;
                    list = dropUserList;
                    iVar = new i(leaderBoardUiState, cVar, topUserList, list, wVarA, a1Var, str, null);
                    list2 = topUserList;
                    wVar = wVarA;
                    sVar2.o0(iVar);
                } else {
                    gVar = gVar2;
                    wVar = wVarA;
                    iVar = objQ11;
                    list = dropUserList;
                    a1Var = a1Var2;
                    list2 = topUserList;
                }
                l1.t.f((fz.e) iVar, boolValueOf, sVar2);
                z1.r rVarD = e2.d(oVar, 1.0f);
                j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                int iHashCode2 = Long.hashCode(sVar2.T);
                q1 q1VarL2 = sVar2.l();
                z1.r rVarC2 = z1.a.c(sVar2, rVarD);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar2);
                } else {
                    sVar2.r0();
                }
                l1.t.J(hVar, uVarA, sVar2);
                l1.t.J(hVar2, q1VarL2, sVar2);
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
                }
                l1.t.J(hVar4, rVarC2, sVar2);
                z1.r rVarH = d0.n.h(oVar, ((s1) sVar2.j(v1.f31180a)).f31033p, f0.f28556b);
                Object objQ12 = sVar2.Q();
                l1.g gVar5 = gVar;
                if (objQ12 == gVar5) {
                    objQ12 = new a2(a1Var, 15);
                    sVar2.o0(objQ12);
                }
                z1.r rVarM = a0.m(rVarH, (fz.c) objQ12);
                z1.h hVar5 = z1.c.P;
                j0.v1 v1VarD = j0.c.d(CropImageView.DEFAULT_ASPECT_RATIO, 16, 1);
                boolean zH2 = sVar2.h(list2) | sVar2.h(keepUserList) | sVar2.h(list) | sVar2.d(iIntValue) | sVar2.h(b0Var) | sVar2.h(aVar) | ((i13 & 14) == 4);
                Object objQ13 = sVar2.Q();
                if (zH2 || objQ13 == gVar5) {
                    r3Var = new r3(list2, keepUserList, list, iIntValue, b1Var3, b1Var2, b0Var, aVar, b1Var);
                    sVar2.o0(r3Var);
                } else {
                    r3Var = objQ13;
                }
                l1.s sVar3 = sVar2;
                ue.f.a(rVarM, wVar, v1VarD, null, hVar5, null, false, null, (fz.c) r3Var, sVar3, 196992, 472);
                sVar3.p(true);
                boolean zIsRefreshing2 = leaderBoardUiState.isRefreshing();
                z1.j jVar2 = z1.c.f58464b;
                j0.r rVar = j0.r.f35391a;
                se.p.I(zIsRefreshing2, state, rVar.a(oVar, jVar2), sVar3, 64);
                z1.r rVarE = j0.c.E(rVar.a(j0.c.v(oVar), z1.c.K), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12, 32, 3);
                q0 q0VarD2 = j0.o.d(jVar, false);
                int iHashCode3 = Long.hashCode(sVar3.T);
                q1 q1VarL3 = sVar3.l();
                z1.r rVarC3 = z1.a.c(sVar3, rVarE);
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar2);
                } else {
                    sVar3.r0();
                }
                l1.t.J(hVar, q0VarD2, sVar3);
                l1.t.J(hVar2, q1VarL3, sVar3);
                if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar3);
                }
                l1.t.J(hVar4, rVarC3, sVar3);
                fz.e eVar4 = eVar;
                eVar4.invoke(sVar3, Integer.valueOf((i13 >> 21) & 14));
                sVar3.p(true);
                sVar3.p(true);
                eVar2 = eVar4;
                sVar = sVar3;
            }
            x1VarT.f39502d = eVar3;
        }
        l1.s sVar4 = sVar2;
        sVar4.W();
        eVar2 = quickReviewEntrance;
        sVar = sVar4;
        x1VarT = sVar.t();
        if (x1VarT != null) {
            final int i15 = 0;
            eVar3 = new fz.e() { // from class: qu.e
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    switch (i15) {
                        case 0:
                            ((Integer) obj2).getClass();
                            o.b(str, topUserList, keepUserList, dropUserList, leaderBoardUiState, pullToRefreshing, eVar2, (l1.n) obj, l1.t.M(i11 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            o.b(str, topUserList, keepUserList, dropUserList, leaderBoardUiState, pullToRefreshing, eVar2, (l1.n) obj, l1.t.M(i11 | 1));
                            break;
                    }
                    return qy.b0.f48488a;
                }
            };
            x1VarT.f39502d = eVar3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:150:0x03db  */
    /* JADX WARN: Code duplicated, block: B:151:0x03df  */
    /* JADX WARN: Code duplicated, block: B:156:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:159:0x041f  */
    /* JADX WARN: Code duplicated, block: B:160:0x0423  */
    /* JADX WARN: Code duplicated, block: B:165:0x043e  */
    /* JADX WARN: Code duplicated, block: B:168:0x0467  */
    /* JADX WARN: Code duplicated, block: B:169:0x046b  */
    /* JADX WARN: Code duplicated, block: B:174:0x0486  */
    /* JADX WARN: Code duplicated, block: B:177:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:178:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:183:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:189:0x0525  */
    /* JADX WARN: Code duplicated, block: B:192:0x0586  */
    /* JADX WARN: Code duplicated, block: B:194:0x0599  */
    /* JADX WARN: Code duplicated, block: B:197:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:200:0x060a  */
    /* JADX WARN: Code duplicated, block: B:202:0x0612  */
    /* JADX WARN: Code duplicated, block: B:207:0x062e  */
    /* JADX WARN: Code duplicated, block: B:211:0x0649  */
    /* JADX WARN: Code duplicated, block: B:213:0x0651  */
    /* JADX WARN: Code duplicated, block: B:216:0x065f  */
    /* JADX WARN: Code duplicated, block: B:218:0x0665  */
    /* JADX WARN: Code duplicated, block: B:219:0x066a  */
    /* JADX WARN: Code duplicated, block: B:221:0x0670  */
    /* JADX WARN: Code duplicated, block: B:222:0x0675  */
    /* JADX WARN: Code duplicated, block: B:226:0x0690  */
    /* JADX WARN: Code duplicated, block: B:228:0x0694  */
    /* JADX WARN: Code duplicated, block: B:234:0x0708  */
    /* JADX WARN: Code duplicated, block: B:235:0x070c  */
    /* JADX WARN: Code duplicated, block: B:240:0x072d  */
    /* JADX WARN: Code duplicated, block: B:243:0x073b  */
    /* JADX WARN: Code duplicated, block: B:244:0x076c  */
    /* JADX WARN: Code duplicated, block: B:246:0x077a  */
    /* JADX WARN: Code duplicated, block: B:247:0x077c  */
    /* JADX WARN: Code duplicated, block: B:253:0x0789  */
    /* JADX WARN: Code duplicated, block: B:262:0x06b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x01ec  */
    public static final void c(final LeaderBoardUiState.Success leaderBoardUiState, final qy.l leaderBoardTime, final fz.a pullToRefreshing, final fz.a onClickClose, final fz.e quickReviewEntrance, l1.n nVar, final int i11) {
        fz.a aVar;
        x1 x1VarT;
        fz.e eVar;
        String strQ0;
        int i12;
        List<LeaderBoardUser> leaderBoardUserList;
        Object lVar;
        l1.g gVar;
        String str;
        ArrayList arrayList;
        String str2;
        l1.g gVar2;
        int iHashCode;
        ArrayList arrayList2;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        y2.h hVar;
        int i13;
        Object objQ;
        int iHashCode5;
        int i14;
        int iHashCode6;
        y2.i iVar;
        y2.h hVar2;
        boolean z11;
        Object objQ2;
        int i15;
        LeaderBoardClass leaderBoardClass;
        boolean zF;
        Object objQ3;
        int greyIconRes;
        int i16;
        z1.j jVar = z1.c.f58463a;
        kotlin.jvm.internal.m.f(leaderBoardUiState, "leaderBoardUiState");
        kotlin.jvm.internal.m.f(leaderBoardTime, "leaderBoardTime");
        Object obj = leaderBoardTime.f48496b;
        Object obj2 = leaderBoardTime.f48495a;
        kotlin.jvm.internal.m.f(pullToRefreshing, "pullToRefreshing");
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        kotlin.jvm.internal.m.f(quickReviewEntrance, "quickReviewEntrance");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(162719856);
        int i17 = (i11 & 6) == 0 ? (sVar.f("bottom_nav") ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i17 |= sVar.h(leaderBoardUiState) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i17 |= sVar.f(leaderBoardTime) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i17 |= sVar.h(pullToRefreshing) ? 2048 : 1024;
        }
        if ((196608 & i11) == 0) {
            i17 |= sVar.h(quickReviewEntrance) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        int i18 = i17;
        if (sVar.T(i18 & 1, (66707 & i18) != 66706)) {
            e20.a aVarC = w4.c.c(sVar, -1168520582, sVar, -1633490746);
            boolean zF2 = sVar.f(null) | sVar.f(aVarC);
            Object objQ4 = sVar.Q();
            l1.g gVar3 = l1.m.f39353a;
            if (zF2 || objQ4 == gVar3) {
                objQ4 = w4.c.e(n0.class, aVarC, null, null, sVar);
            }
            sVar.p(false);
            sVar.p(false);
            String strW = ((o0) ((n0) objQ4)).w();
            if (leaderBoardUiState.getLeaderBoardClass() == null) {
                x1VarT = sVar.t();
                if (x1VarT == null) {
                    return;
                }
                final int i19 = 0;
                eVar = new fz.e() { // from class: qu.d
                    @Override // fz.e
                    public final Object invoke(Object obj3, Object obj4) {
                        switch (i19) {
                            case 0:
                                ((Integer) obj4).getClass();
                                o.c(leaderBoardUiState, leaderBoardTime, pullToRefreshing, onClickClose, quickReviewEntrance, (l1.n) obj3, l1.t.M(i11 | 1));
                                break;
                            default:
                                ((Integer) obj4).getClass();
                                o.c(leaderBoardUiState, leaderBoardTime, pullToRefreshing, onClickClose, quickReviewEntrance, (l1.n) obj3, l1.t.M(i11 | 1));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
            } else {
                if (((Number) obj2).longValue() >= 2) {
                    sVar.d0(-1430331432);
                    strQ0 = oz.x.q0(ub.a.e0(sVar, R.string.s_day_s_left), "%d", String.valueOf(((Number) obj2).longValue()));
                    sVar.p(false);
                } else if (((Number) obj2).longValue() >= 1) {
                    sVar.d0(-1430171100);
                    strQ0 = oz.x.q0(oz.x.q0(ub.a.e0(sVar, R.string.s_day_s_h_hour_s_left), "%d", String.valueOf(((Number) obj2).longValue())), "%h", String.valueOf(((Number) obj).longValue()));
                    sVar.p(false);
                } else {
                    sVar.d0(-1429992788);
                    strQ0 = oz.x.q0(oz.x.q0(ub.a.e0(sVar, R.string.h_hour_s_left), "%s", String.valueOf(((Number) obj2).longValue())), "%h", String.valueOf(((Number) obj).longValue()));
                    sVar.p(false);
                }
                String str3 = strQ0;
                boolean zF3 = sVar.f(leaderBoardUiState.getLeaderBoardClass());
                Object objQ5 = sVar.Q();
                if (zF3 || objQ5 == gVar3) {
                    LeaderBoardClass leaderBoardClass2 = leaderBoardUiState.getLeaderBoardClass();
                    String className = leaderBoardClass2 != null ? leaderBoardClass2.getClassName() : null;
                    if (className != null) {
                        switch (className) {
                            case "ClassB":
                                i12 = R.string.class_b;
                                break;
                            case "ClassC":
                                i12 = R.string.class_c;
                                break;
                            case "ClassD":
                                i12 = R.string.class_d;
                                break;
                            case "ClassE":
                                i12 = R.string.class_e;
                                break;
                            case "ClassF":
                                i12 = R.string.class_f;
                                break;
                            default:
                                i12 = R.string.class_a;
                                break;
                        }
                    } else {
                        i12 = R.string.class_a;
                    }
                    objQ5 = Integer.valueOf(i12);
                    sVar.o0(objQ5);
                }
                int iIntValue = ((Number) objQ5).intValue();
                LeaderBoardClass leaderBoardClass3 = leaderBoardUiState.getLeaderBoardClass();
                boolean zF4 = sVar.f(leaderBoardClass3 != null ? leaderBoardClass3.getLeaderBoardUserList() : null);
                Object objQ6 = sVar.Q();
                if (zF4 || objQ6 == gVar3) {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    LeaderBoardClass leaderBoardClass4 = leaderBoardUiState.getLeaderBoardClass();
                    if (leaderBoardClass4 != null && (leaderBoardUserList = leaderBoardClass4.getLeaderBoardUserList()) != null) {
                        if (leaderBoardUserList.size() < 3) {
                            arrayList3.addAll(leaderBoardUserList);
                        } else {
                            LeaderBoardClass leaderBoardClass5 = leaderBoardUiState.getLeaderBoardClass();
                            if (kotlin.jvm.internal.m.a(leaderBoardClass5 != null ? leaderBoardClass5.getClassName() : null, AchievementLeaderBoardType.LEADERBOARD_CLASS_A)) {
                                int size = leaderBoardUserList.size() / 2;
                                arrayList3.addAll(leaderBoardUserList.subList(0, size));
                                arrayList4.addAll(leaderBoardUserList.subList(size, leaderBoardUserList.size()));
                            } else {
                                int size2 = leaderBoardUserList.size() / 3;
                                arrayList3.addAll(leaderBoardUserList.subList(0, size2));
                                arrayList4.addAll(leaderBoardUserList.subList(size2, leaderBoardUserList.size() - size2));
                                arrayList5.addAll(leaderBoardUserList.subList(leaderBoardUserList.size() - size2, leaderBoardUserList.size()));
                            }
                        }
                    }
                    qy.r rVar = new qy.r(arrayList3, arrayList4, arrayList5);
                    sVar.o0(rVar);
                    objQ6 = rVar;
                }
                qy.r rVar2 = (qy.r) objQ6;
                ArrayList arrayList6 = (ArrayList) rVar2.f48505a;
                ArrayList arrayList7 = (ArrayList) rVar2.f48506b;
                ArrayList arrayList8 = (ArrayList) rVar2.f48507c;
                e20.a aVarC2 = w4.c.c(sVar, -1168520582, sVar, -1633490746);
                boolean zF5 = sVar.f(null) | sVar.f(aVarC2);
                Object objQ7 = sVar.Q();
                if (zF5 || objQ7 == gVar3) {
                    objQ7 = w4.c.e(ur.a.class, aVarC2, null, null, sVar);
                }
                sVar.p(false);
                sVar.p(false);
                ur.a aVar2 = (ur.a) objQ7;
                sVar.d0(1755050880);
                leaderBoardUiState.getLeaderBoardClass();
                boolean zH = sVar.h(aVar2) | ((i18 & 14) == 4) | sVar.f(strW) | sVar.h(leaderBoardUiState) | sVar.h(arrayList6) | sVar.h(arrayList7) | sVar.h(arrayList8);
                Object objQ8 = sVar.Q();
                if (zH || objQ8 == gVar3) {
                    gVar = gVar3;
                    str = strW;
                    lVar = new l(aVar2, str, leaderBoardUiState, arrayList6, arrayList7, arrayList8, null);
                    arrayList8 = arrayList8;
                    sVar.o0(lVar);
                } else {
                    lVar = objQ8;
                    str = strW;
                    gVar = gVar3;
                }
                l1.t.f((fz.e) lVar, qy.b0.f48488a, sVar);
                sVar.p(false);
                Object objQ9 = sVar.Q();
                if (objQ9 == gVar) {
                    objQ9 = l1.t.B(Boolean.FALSE);
                    sVar.o0(objQ9);
                }
                b1 b1Var = (b1) objQ9;
                a(b1Var, sVar, 6);
                z1.o oVar = z1.o.f58481a;
                z1.r rVarH = d0.n.h(e2.e(oVar, 1.0f), ((s1) sVar.j(v1.f31180a)).f31033p, f0.f28556b);
                q0 q0VarD = j0.o.d(jVar, false);
                int iHashCode7 = Long.hashCode(sVar.T);
                q1 q1VarL = sVar.l();
                z1.r rVarC = z1.a.c(sVar, rVarH);
                y2.k.J.getClass();
                y2.i iVar2 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                y2.h hVar3 = y2.j.f56917f;
                l1.t.J(hVar3, q0VarD, sVar);
                y2.h hVar4 = y2.j.f56916e;
                l1.t.J(hVar4, q1VarL, sVar);
                y2.h hVar5 = y2.j.f56918g;
                if (sVar.S) {
                    arrayList = arrayList6;
                } else {
                    arrayList = arrayList6;
                    if (!kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode7))) {
                    }
                    y2.h hVar6 = y2.j.f56915d;
                    l1.t.J(hVar6, rVarC, sVar);
                    z1.h hVar7 = z1.c.P;
                    j0.d dVar = j0.i.f35305c;
                    str2 = str;
                    j0.u uVarA = j0.t.a(dVar, hVar7, sVar, 48);
                    gVar2 = gVar;
                    iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL2 = sVar.l();
                    z1.r rVarC2 = z1.a.c(sVar, oVar);
                    sVar.h0();
                    arrayList2 = arrayList8;
                    if (sVar.S) {
                        sVar.k(iVar2);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar3, uVarA, sVar);
                    l1.t.J(hVar4, q1VarL2, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar5);
                    }
                    l1.t.J(hVar6, rVarC2, sVar);
                    q0 q0VarD2 = j0.o.d(jVar, false);
                    iHashCode2 = Long.hashCode(sVar.T);
                    q1 q1VarL3 = sVar.l();
                    z1.r rVarC3 = z1.a.c(sVar, oVar);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar2);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar3, q0VarD2, sVar);
                    l1.t.J(hVar4, q1VarL3, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar5);
                    }
                    l1.t.J(hVar6, rVarC3, sVar);
                    z1.r rVarE = e2.e(oVar, 1.0f);
                    j0.u uVarA2 = j0.t.a(dVar, hVar7, sVar, 48);
                    iHashCode3 = Long.hashCode(sVar.T);
                    q1 q1VarL4 = sVar.l();
                    z1.r rVarC4 = z1.a.c(sVar, rVarE);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar2);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar3, uVarA2, sVar);
                    l1.t.J(hVar4, q1VarL4, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar5);
                    }
                    l1.t.J(hVar6, rVarC4, sVar);
                    z1.i iVar3 = z1.c.M;
                    float f5 = 16;
                    z1.r rVarC5 = j0.c.C(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, 1);
                    j0.a2 a2VarA = z1.a(j0.i.f35303a, iVar3, sVar, 48);
                    iHashCode4 = Long.hashCode(sVar.T);
                    q1 q1VarL5 = sVar.l();
                    z1.r rVarC6 = z1.a.c(sVar, rVarC5);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar2);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar3, a2VarA, sVar);
                    l1.t.J(hVar4, q1VarL5, sVar);
                    if (sVar.S && kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                        hVar = hVar5;
                    } else {
                        hVar = hVar5;
                        defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar);
                    }
                    l1.t.J(hVar6, rVarC6, sVar);
                    j0.c.g(sVar, e2.s(oVar, f5));
                    String strE0 = ub.a.e0(sVar, iIntValue);
                    y0 y0VarA = y0.a((y0) sVar.j(ua.f31167a), 0L, j3.A(14), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777209);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    ua.b(strE0, new i1(1.0f, true), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar, 0, 0, 65532);
                    sVar = sVar;
                    if (oz.q.K0(str3)) {
                        sVar.d0(-2030522706);
                    } else {
                        sVar.d0(-2021682064);
                        b.f(leaderBoardUiState.getTodayRankChange(), 0, str3, sVar, null);
                    }
                    sVar.p(false);
                    i13 = 12;
                    float f11 = 12;
                    j0.c.g(sVar, e2.s(oVar, f11));
                    z1.r rVarN = e2.n(oVar, 18);
                    objQ = sVar.Q();
                    if (objQ == gVar2) {
                        objQ = new z(2, b1Var);
                        sVar.o0(objQ);
                    }
                    tv.a.a(390, (fz.a) objQ, sVar, rVarN);
                    j0.c.g(sVar, e2.s(oVar, f11));
                    sVar.p(true);
                    j0.e eVar2 = j0.i.f35310h;
                    z1.i iVar4 = z1.c.N;
                    z1.r rVarE2 = j0.c.E(j0.c.C(e2.e(oVar, 1.0f), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f11, 7);
                    j0.a2 a2VarA2 = z1.a(eVar2, iVar4, sVar, 54);
                    iHashCode5 = Long.hashCode(sVar.T);
                    q1 q1VarL6 = sVar.l();
                    z1.r rVarC7 = z1.a.c(sVar, rVarE2);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar2);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar3, a2VarA2, sVar);
                    l1.t.J(hVar4, q1VarL6, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode5))) {
                        defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar);
                    }
                    l1.t.J(hVar6, rVarC7, sVar);
                    sVar.d0(1899274663);
                    i14 = 0;
                    for (Object obj3 : leaderBoardUiState.getLeaderBoardClassList()) {
                        i15 = i14 + 1;
                        if (i14 >= 0) {
                            ns.o.V();
                            throw null;
                        }
                        leaderBoardClass = (LeaderBoardClass) obj3;
                        zF = sVar.f(leaderBoardClass);
                        objQ3 = sVar.Q();
                        if (zF || objQ3 == gVar2) {
                            if (leaderBoardClass.isCurClass()) {
                                greyIconRes = leaderBoardClass.getMediumIconRes();
                            } else if (leaderBoardClass.isActiveClass()) {
                                greyIconRes = leaderBoardClass.getSmallIconRes();
                            } else {
                                greyIconRes = leaderBoardClass.getGreyIconRes();
                            }
                            objQ3 = Integer.valueOf(greyIconRes);
                            sVar.o0(objQ3);
                        }
                        k2.b bVarY = se.k.y(((Number) objQ3).intValue(), sVar, 0);
                        if (leaderBoardClass.isCurClass()) {
                            i16 = 52;
                        } else {
                            i16 = 42;
                        }
                        l1.s sVar2 = sVar;
                        d0.n.c(bVarY, null, e2.s(oVar, i16), null, w2.i.f54517d, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 24624, 104);
                        i13 = i13;
                        i14 = i15;
                        sVar = sVar2;
                    }
                    sVar.p(false);
                    sVar.p(true);
                    sVar.p(true);
                    sVar.p(true);
                    k7.g(null, 6, ((s1) sVar.j(v1.f31180a)).f31031n, sVar, 48, 1);
                    float f12 = 24;
                    z1.r rVarH2 = d0.n.h(oVar, g2.x.f28622i, r0.f.f(f12, f12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, i13));
                    q0 q0VarD3 = j0.o.d(jVar, false);
                    iHashCode6 = Long.hashCode(sVar.T);
                    q1 q1VarL7 = sVar.l();
                    z1.r rVarC8 = z1.a.c(sVar, rVarH2);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD3, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL7, sVar);
                    hVar2 = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode6))) {
                        defpackage.e.A(iHashCode6, sVar, iHashCode6, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC8, sVar);
                    if (leaderBoardUiState.isWeeklyXPEmpty()) {
                        sVar.d0(1336397222);
                        l1.s sVar3 = sVar;
                        k7.d(e2.d(oVar, 1.0f), r0.f.d(4), null, k7.q(62, 0), null, b.f48341a, sVar3, 196614, 20);
                        sVar = sVar3;
                        sVar.p(false);
                        aVar = pullToRefreshing;
                    } else {
                        sVar.d0(1336733634);
                        if ((i18 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objQ2 = sVar.Q();
                        if (!z11 || objQ2 == gVar2) {
                            aVar = pullToRefreshing;
                            objQ2 = new okhttp3.b(4, aVar);
                            sVar.o0(objQ2);
                        } else {
                            aVar = pullToRefreshing;
                        }
                        b(str2, arrayList, arrayList7, arrayList2, leaderBoardUiState, (fz.a) objQ2, quickReviewEntrance, sVar, ((i18 << 6) & 29360128) | ((i18 << 12) & 458752) | 6);
                        sVar.p(false);
                    }
                    com.google.android.material.datepicker.d.B(sVar, true, r0, r0);
                }
                defpackage.e.A(iHashCode7, sVar, iHashCode7, hVar5);
                y2.h hVar8 = y2.j.f56915d;
                l1.t.J(hVar8, rVarC, sVar);
                z1.h hVar9 = z1.c.P;
                j0.d dVar2 = j0.i.f35305c;
                str2 = str;
                j0.u uVarA3 = j0.t.a(dVar2, hVar9, sVar, 48);
                gVar2 = gVar;
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL8 = sVar.l();
                z1.r rVarC9 = z1.a.c(sVar, oVar);
                sVar.h0();
                arrayList2 = arrayList8;
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar3, uVarA3, sVar);
                l1.t.J(hVar4, q1VarL8, sVar);
                if (sVar.S) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar5);
                } else {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar5);
                }
                l1.t.J(hVar8, rVarC9, sVar);
                q0 q0VarD4 = j0.o.d(jVar, false);
                iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL9 = sVar.l();
                z1.r rVarC10 = z1.a.c(sVar, oVar);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar3, q0VarD4, sVar);
                l1.t.J(hVar4, q1VarL9, sVar);
                if (sVar.S) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar5);
                } else {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar5);
                }
                l1.t.J(hVar8, rVarC10, sVar);
                z1.r rVarE3 = e2.e(oVar, 1.0f);
                j0.u uVarA4 = j0.t.a(dVar2, hVar9, sVar, 48);
                iHashCode3 = Long.hashCode(sVar.T);
                q1 q1VarL10 = sVar.l();
                z1.r rVarC11 = z1.a.c(sVar, rVarE3);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar3, uVarA4, sVar);
                l1.t.J(hVar4, q1VarL10, sVar);
                if (sVar.S) {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar5);
                } else {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar5);
                }
                l1.t.J(hVar8, rVarC11, sVar);
                z1.i iVar5 = z1.c.M;
                float f13 = 16;
                z1.r rVarC12 = j0.c.C(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f13, 1);
                j0.a2 a2VarA3 = z1.a(j0.i.f35303a, iVar5, sVar, 48);
                iHashCode4 = Long.hashCode(sVar.T);
                q1 q1VarL11 = sVar.l();
                z1.r rVarC13 = z1.a.c(sVar, rVarC12);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar3, a2VarA3, sVar);
                l1.t.J(hVar4, q1VarL11, sVar);
                if (sVar.S) {
                    hVar = hVar5;
                    defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar);
                } else {
                    hVar = hVar5;
                    defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar);
                }
                l1.t.J(hVar8, rVarC13, sVar);
                j0.c.g(sVar, e2.s(oVar, f13));
                String strE1 = ub.a.e0(sVar, iIntValue);
                y0 y0VarA2 = y0.a((y0) sVar.j(ua.f31167a), 0L, j3.A(14), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777209);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                ua.b(strE1, new i1(1.0f, true), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA2, sVar, 0, 0, 65532);
                sVar = sVar;
                if (oz.q.K0(str3)) {
                    sVar.d0(-2021682064);
                    b.f(leaderBoardUiState.getTodayRankChange(), 0, str3, sVar, null);
                } else {
                    sVar.d0(-2030522706);
                }
                sVar.p(false);
                i13 = 12;
                float f14 = 12;
                j0.c.g(sVar, e2.s(oVar, f14));
                z1.r rVarN2 = e2.n(oVar, 18);
                objQ = sVar.Q();
                if (objQ == gVar2) {
                    objQ = new z(2, b1Var);
                    sVar.o0(objQ);
                }
                tv.a.a(390, (fz.a) objQ, sVar, rVarN2);
                j0.c.g(sVar, e2.s(oVar, f14));
                sVar.p(true);
                j0.e eVar3 = j0.i.f35310h;
                z1.i iVar6 = z1.c.N;
                z1.r rVarE4 = j0.c.E(j0.c.C(e2.e(oVar, 1.0f), f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f14, 7);
                j0.a2 a2VarA4 = z1.a(eVar3, iVar6, sVar, 54);
                iHashCode5 = Long.hashCode(sVar.T);
                q1 q1VarL12 = sVar.l();
                z1.r rVarC14 = z1.a.c(sVar, rVarE4);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar3, a2VarA4, sVar);
                l1.t.J(hVar4, q1VarL12, sVar);
                if (sVar.S) {
                    defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar);
                } else {
                    defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar);
                }
                l1.t.J(hVar8, rVarC14, sVar);
                sVar.d0(1899274663);
                i14 = 0;
                while (r0.hasNext()) {
                    i15 = i14 + 1;
                    if (i14 >= 0) {
                        ns.o.V();
                        throw null;
                    }
                    leaderBoardClass = (LeaderBoardClass) obj3;
                    zF = sVar.f(leaderBoardClass);
                    objQ3 = sVar.Q();
                    if (zF) {
                        if (leaderBoardClass.isCurClass()) {
                            greyIconRes = leaderBoardClass.getMediumIconRes();
                        } else if (leaderBoardClass.isActiveClass()) {
                            greyIconRes = leaderBoardClass.getSmallIconRes();
                        } else {
                            greyIconRes = leaderBoardClass.getGreyIconRes();
                        }
                        objQ3 = Integer.valueOf(greyIconRes);
                        sVar.o0(objQ3);
                    } else {
                        if (leaderBoardClass.isCurClass()) {
                            greyIconRes = leaderBoardClass.getMediumIconRes();
                        } else if (leaderBoardClass.isActiveClass()) {
                            greyIconRes = leaderBoardClass.getSmallIconRes();
                        } else {
                            greyIconRes = leaderBoardClass.getGreyIconRes();
                        }
                        objQ3 = Integer.valueOf(greyIconRes);
                        sVar.o0(objQ3);
                    }
                    k2.b bVarY2 = se.k.y(((Number) objQ3).intValue(), sVar, 0);
                    if (leaderBoardClass.isCurClass()) {
                        i16 = 52;
                    } else {
                        i16 = 42;
                    }
                    l1.s sVar4 = sVar;
                    d0.n.c(bVarY2, null, e2.s(oVar, i16), null, w2.i.f54517d, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar4, 24624, 104);
                    i13 = i13;
                    i14 = i15;
                    sVar = sVar4;
                }
                sVar.p(false);
                sVar.p(true);
                sVar.p(true);
                sVar.p(true);
                k7.g(null, 6, ((s1) sVar.j(v1.f31180a)).f31031n, sVar, 48, 1);
                float f15 = 24;
                z1.r rVarH3 = d0.n.h(oVar, g2.x.f28622i, r0.f.f(f15, f15, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, i13));
                q0 q0VarD5 = j0.o.d(jVar, false);
                iHashCode6 = Long.hashCode(sVar.T);
                q1 q1VarL13 = sVar.l();
                z1.r rVarC15 = z1.a.c(sVar, rVarH3);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD5, sVar);
                l1.t.J(y2.j.f56916e, q1VarL13, sVar);
                hVar2 = y2.j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode6, sVar, iHashCode6, hVar2);
                } else {
                    defpackage.e.A(iHashCode6, sVar, iHashCode6, hVar2);
                }
                l1.t.J(y2.j.f56915d, rVarC15, sVar);
                if (leaderBoardUiState.isWeeklyXPEmpty()) {
                    sVar.d0(1336397222);
                    l1.s sVar5 = sVar;
                    k7.d(e2.d(oVar, 1.0f), r0.f.d(4), null, k7.q(62, 0), null, b.f48341a, sVar5, 196614, 20);
                    sVar = sVar5;
                    sVar.p(false);
                    aVar = pullToRefreshing;
                } else {
                    sVar.d0(1336733634);
                    if ((i18 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objQ2 = sVar.Q();
                    if (z11) {
                        aVar = pullToRefreshing;
                        objQ2 = new okhttp3.b(4, aVar);
                        sVar.o0(objQ2);
                    } else {
                        aVar = pullToRefreshing;
                        objQ2 = new okhttp3.b(4, aVar);
                        sVar.o0(objQ2);
                    }
                    b(str2, arrayList, arrayList7, arrayList2, leaderBoardUiState, (fz.a) objQ2, quickReviewEntrance, sVar, ((i18 << 6) & 29360128) | ((i18 << 12) & 458752) | 6);
                    sVar.p(false);
                }
                com.google.android.material.datepicker.d.B(sVar, true, r0, r0);
            }
            x1VarT.f39502d = eVar;
        }
        aVar = pullToRefreshing;
        sVar.W();
        x1VarT = sVar.t();
        if (x1VarT != null) {
            final int i21 = 1;
            final fz.a aVar3 = aVar;
            eVar = new fz.e() { // from class: qu.d
                @Override // fz.e
                public final Object invoke(Object obj4, Object obj5) {
                    switch (i21) {
                        case 0:
                            ((Integer) obj5).getClass();
                            o.c(leaderBoardUiState, leaderBoardTime, aVar3, onClickClose, quickReviewEntrance, (l1.n) obj4, l1.t.M(i11 | 1));
                            break;
                        default:
                            ((Integer) obj5).getClass();
                            o.c(leaderBoardUiState, leaderBoardTime, aVar3, onClickClose, quickReviewEntrance, (l1.n) obj4, l1.t.M(i11 | 1));
                            break;
                    }
                    return qy.b0.f48488a;
                }
            };
            x1VarT.f39502d = eVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v26 */
    public static final void d(final int i11, final LeaderBoardUser leaderBoardUser, long j11, final long j12, final List list, final r0.e eVar, final int i12, final boolean z11, final boolean z12, final fz.c cVar, final fz.c cVar2, l1.n nVar, final int i13) {
        long j13;
        l1.s sVar;
        String nickName;
        Object obj;
        j0.b bVar;
        Object obj2;
        int i14;
        fz.a aVar;
        l1.s sVar2;
        int i15;
        int i16;
        Object obj3;
        fz.a aVar2;
        Object h7Var;
        z1.i iVar;
        int i17;
        a1 a1Var;
        ?? r9;
        l1.s sVar3;
        z1.o oVar;
        int i18;
        float f5;
        boolean z13;
        l1.s sVar4;
        l1.s sVar5;
        String strQ0;
        l1.s sVar6 = (l1.s) nVar;
        sVar6.f0(-320763963);
        int i19 = i13 | (sVar6.d(i11) ? 4 : 2) | (sVar6.h(leaderBoardUser) ? 32 : 16) | (sVar6.f(eVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar6.d(i12) ? 1048576 : 524288) | (sVar6.g(z11) ? 8388608 : 4194304) | (sVar6.h(cVar) ? 536870912 : 268435456);
        char c11 = sVar6.h(cVar2) ? (char) 4 : (char) 2;
        if (sVar6.T(i19 & 1, ((306782355 & i19) == 306782354 && (c11 & 3) == 2) ? false : true)) {
            e20.a aVarC = w4.c.c(sVar6, -1168520582, sVar6, -1633490746);
            boolean zF = sVar6.f(null) | sVar6.f(aVarC);
            Object objQ = sVar6.Q();
            Object obj4 = l1.m.f39353a;
            if (zF || objQ == obj4) {
                objQ = w4.c.e(n0.class, aVarC, null, null, sVar6);
            }
            sVar6.p(false);
            sVar6.p(false);
            Object objW = ((o0) ((n0) objQ)).w();
            if (kotlin.jvm.internal.m.a(leaderBoardUser.getNickName(), "Hidden user")) {
                nickName = ep.a.m(sVar6, 423518564, R.string.hidden_user, sVar6, false);
            } else {
                sVar6.d0(423580192);
                sVar6.p(false);
                nickName = leaderBoardUser.getNickName();
            }
            String str = nickName;
            z1.o oVar2 = z1.o.f58481a;
            z1.r rVarB = d2.h.b(d0.n.f(objW.equals(leaderBoardUser.getUid()) ? 0.24f : CropImageView.DEFAULT_ASPECT_RATIO, new j0(0L, 9187343241974906880L, list), eVar, e2.e(e2.g(oVar2, 65), 1.0f)), eVar);
            boolean z14 = z11 && leaderBoardUser.getShareMe();
            int i21 = i19 & 1879048192;
            boolean zH = (i21 == 536870912) | sVar6.h(leaderBoardUser);
            Object objQ2 = sVar6.Q();
            if (zH || objQ2 == obj4) {
                objQ2 = new f(cVar, leaderBoardUser, 0);
                sVar6.o0(objQ2);
            }
            z1.r rVarO = d0.n.o(rVarB, z14, null, (fz.a) objQ2, 14);
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar6.T);
            q1 q1VarL = sVar6.l();
            z1.r rVarC = z1.a.c(sVar6, rVarO);
            y2.k.J.getClass();
            fz.a aVar3 = y2.j.f56913b;
            sVar6.h0();
            if (sVar6.S) {
                sVar6.k(aVar3);
            } else {
                sVar6.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, q0VarD, sVar6);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar6);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar6, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar6);
            z1.i iVar2 = z1.c.M;
            z1.r rVarD = e2.d(oVar2, 1.0f);
            j0.b bVar2 = j0.i.f35303a;
            j0.a2 a2VarA = z1.a(bVar2, iVar2, sVar6, 48);
            int iHashCode2 = Long.hashCode(sVar6.T);
            q1 q1VarL2 = sVar6.l();
            z1.r rVarC2 = z1.a.c(sVar6, rVarD);
            sVar6.h0();
            if (sVar6.S) {
                sVar6.k(aVar3);
            } else {
                sVar6.r0();
            }
            l1.t.J(hVar, a2VarA, sVar6);
            l1.t.J(hVar2, q1VarL2, sVar6);
            if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar6, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar6);
            if (i11 == 1) {
                obj = objW;
                bVar = bVar2;
                obj2 = obj4;
                i14 = 16;
                sVar6.d0(-972060376);
                aVar = aVar3;
                d0.n.c(se.k.y(R.drawable.lb_top_user_medal_1, sVar6, 0), null, e2.s(j0.c.E(oVar2, 11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 29), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar6, 432, 120);
                sVar2 = sVar6;
                i15 = 0;
                sVar2.p(false);
            } else if (i11 == 2) {
                obj = objW;
                bVar = bVar2;
                obj2 = obj4;
                i14 = 16;
                sVar6.d0(-972050648);
                aVar = aVar3;
                d0.n.c(se.k.y(R.drawable.lb_top_user_medal_2, sVar6, 0), null, e2.s(j0.c.E(oVar2, 11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 29), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar6, 432, 120);
                sVar2 = sVar6;
                i15 = 0;
                sVar2.p(false);
            } else if (i11 != 3) {
                sVar6.d0(-68188655);
                String strValueOf = String.valueOf(i11);
                y0 y0VarA = y0.a((y0) sVar6.j(ua.f31167a), j11, j3.A(14), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744440);
                aVar = aVar3;
                bVar = bVar2;
                obj2 = obj4;
                obj = objW;
                i14 = 16;
                ua.b(strValueOf, e2.s(j0.c.E(oVar2, 11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 29), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar6, 48, 0, 65532);
                sVar2 = sVar6;
                i15 = 0;
                sVar2.p(false);
            } else {
                obj = objW;
                bVar = bVar2;
                obj2 = obj4;
                i14 = 16;
                sVar6.d0(-972040920);
                aVar = aVar3;
                d0.n.c(se.k.y(R.drawable.lb_top_user_medal_3, sVar6, 0), null, e2.s(j0.c.E(oVar2, 11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 29), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar6, 432, 120);
                sVar2 = sVar6;
                i15 = 0;
                sVar2.p(false);
            }
            int emojiStatus = leaderBoardUser.getEmojiStatus();
            Integer numValueOf = Integer.valueOf(emojiStatus);
            if (emojiStatus == -1) {
                numValueOf = null;
            }
            c cVar3 = numValueOf != null ? new c(numValueOf.intValue(), i15, i15) : null;
            String imageName = leaderBoardUser.getImageName();
            int i22 = i15;
            String nickName2 = leaderBoardUser.getNickName();
            boolean zEquals = obj.equals(leaderBoardUser.getUid());
            z1.r rVarE = j0.c.E(oVar2, i14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            int i23 = (leaderBoardUser.getShareMe() || obj.equals(leaderBoardUser.getUid())) ? 1 : i22;
            int i24 = (i21 == 536870912 ? 1 : i22) | (sVar2.f(obj) ? 1 : 0) | (sVar2.h(leaderBoardUser) ? 1 : 0) | ((c11 & 14) == 4 ? 1 : i22);
            Object objQ3 = sVar2.Q();
            if (i24 != 0 || objQ3 == obj2) {
                Object obj5 = obj;
                i16 = 16;
                Object k0Var = new k0(obj5, leaderBoardUser, cVar2, cVar, 18);
                obj3 = obj5;
                sVar2.o0(k0Var);
                objQ3 = k0Var;
            } else {
                obj3 = obj;
                i16 = 16;
            }
            l1.s sVar7 = sVar2;
            b.g(imageName, nickName2, cVar3, zEquals, 40, iu.k.q(6, 6, (fz.a) objQ3, sVar7, rVarE, i23), sVar7, 24576);
            z1.r rVarE2 = j0.c.E(oVar2, 19, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            z1.r rVarP = w4.c.p(1.0f, true, rVarE2);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar7, 0);
            int iHashCode3 = Long.hashCode(sVar7.T);
            q1 q1VarL3 = sVar7.l();
            z1.r rVarC3 = z1.a.c(sVar7, rVarP);
            sVar7.h0();
            if (sVar7.S) {
                aVar2 = aVar;
                sVar7.k(aVar2);
            } else {
                aVar2 = aVar;
                sVar7.r0();
            }
            l1.t.J(hVar, uVarA, sVar7);
            l1.t.J(hVar2, q1VarL3, sVar7);
            if (sVar7.S || !kotlin.jvm.internal.m.a(sVar7.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar7, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar7);
            d0 d0Var = ua.f31167a;
            y0 y0Var = (y0) sVar7.j(d0Var);
            long jA = j3.A(i16);
            n3.s sVar8 = n3.s.H;
            fz.a aVar4 = aVar2;
            ua.b(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(y0Var, 0L, jA, sVar8, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar7, 0, 0, 65534);
            l1.s sVar9 = sVar7;
            j0.a2 a2VarA2 = z1.a(j0.i.g(8), iVar2, sVar9, 54);
            int iHashCode4 = Long.hashCode(sVar9.T);
            q1 q1VarL4 = sVar9.l();
            z1.r rVarC4 = z1.a.c(sVar9, oVar2);
            sVar9.h0();
            if (sVar9.S) {
                sVar9.k(aVar4);
            } else {
                sVar9.r0();
            }
            l1.t.J(hVar, a2VarA2, sVar9);
            l1.t.J(hVar2, q1VarL4, sVar9);
            if (sVar9.S || !kotlin.jvm.internal.m.a(sVar9.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar9, iHashCode4, hVar3);
            }
            l1.t.J(hVar4, rVarC4, sVar9);
            sVar9.d0(-1168520582);
            e20.a aVarA = q10.b.a(sVar9);
            sVar9.d0(-1633490746);
            boolean zF2 = sVar9.f(null) | sVar9.f(aVarA);
            Object objQ4 = sVar9.Q();
            if (zF2 || objQ4 == obj2) {
                objQ4 = w4.c.e(xt.u.class, aVarA, null, null, sVar9);
            }
            sVar9.p(false);
            sVar9.p(false);
            Object obj6 = (xt.u) objQ4;
            Object objQ5 = sVar9.Q();
            if (objQ5 == obj2) {
                objQ5 = defpackage.e.v(0, sVar9);
            }
            a1 a1Var2 = (a1) objQ5;
            Object objQ6 = sVar9.Q();
            if (objQ6 == obj2) {
                objQ6 = p0.s(-1.0f, sVar9);
            }
            l1.g1 g1Var = (l1.g1) objQ6;
            String curLan = leaderBoardUser.getCurLan();
            boolean zH2 = sVar9.h(leaderBoardUser) | sVar9.h(obj6);
            Object objQ7 = sVar9.Q();
            if (zH2 || objQ7 == obj2) {
                iVar = iVar2;
                i17 = 0;
                a1Var = a1Var2;
                h7Var = new h7(leaderBoardUser, g1Var, obj6, a1Var, null, 4);
                sVar9.o0(h7Var);
            } else {
                h7Var = objQ7;
                i17 = 0;
                a1Var = a1Var2;
                iVar = iVar2;
            }
            l1.t.f((fz.e) h7Var, curLan, sVar9);
            if (((h1) a1Var).l() != 0) {
                sVar9.d0(-887846074);
                t0 t0VarP = k7.p(((s1) sVar9.j(v1.f31180a)).f31031n, sVar9, i17);
                r0.e eVarD = r0.f.d(4);
                t1.d dVarD = t1.e.d(-84714282, new ch.w(a1Var, 2), sVar9);
                r9 = i17;
                k7.d(null, eVarD, t0VarP, null, null, dVarD, sVar9, 196608, 25);
                sVar3 = sVar9;
            } else {
                r9 = i17;
                sVar9.d0(-915103847);
                sVar3 = sVar9;
            }
            sVar3.p(r9);
            if (leaderBoardUser.getDayStreak() >= 30) {
                sVar3.d0(-887030557);
                f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                z1.r rVarY = j0.c.y(oVar2, -2, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                j0.a2 a2VarA3 = z1.a(bVar, iVar, sVar3, 48);
                int iHashCode5 = Long.hashCode(sVar3.T);
                q1 q1VarL5 = sVar3.l();
                z1.r rVarC5 = z1.a.c(sVar3, rVarY);
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(aVar4);
                } else {
                    sVar3.r0();
                }
                l1.t.J(hVar, a2VarA3, sVar3);
                l1.t.J(hVar2, q1VarL5, sVar3);
                if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode5))) {
                    defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar3);
                }
                l1.t.J(hVar4, rVarC5, sVar3);
                oVar = oVar2;
                l1.s sVar10 = sVar3;
                i18 = 2;
                d0.n.c(se.k.y(R.drawable.ep_me_daystreak, sVar3, r9), null, e2.n(oVar2, 20), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar10, 432, 120);
                if (leaderBoardUser.getDayStreak() < 365) {
                    sVar10.d0(-1130737389);
                    strQ0 = oz.x.q0(ub.a.e0(sVar10, R.string.m_month_s), "%m", String.valueOf(leaderBoardUser.getDayStreak() / 30));
                    sVar10.p(r9);
                } else {
                    sVar10.d0(-1130525101);
                    strQ0 = oz.x.q0(ub.a.e0(sVar10, R.string.y_year_s), "%y", String.valueOf(leaderBoardUser.getDayStreak() / AchievementLevelType.DAY_STREAK_LV_10));
                    sVar10.p(r9);
                }
                ua.b(strQ0, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar10.j(d0Var), f0.e(4294939136L), j3.A(12), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar10, 0, 0, 65534);
                l1.s sVar11 = sVar10;
                z13 = true;
                sVar11.p(true);
                sVar4 = sVar11;
            } else {
                oVar = r5;
                i18 = 2;
                f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                z13 = true;
                sVar3.d0(-915103847);
                sVar4 = sVar3;
            }
            sVar4.p(r9);
            sVar4.p(z13);
            sVar4.p(z13);
            if (i12 <= 0 || !obj3.equals(leaderBoardUser.getUid())) {
                j13 = j11;
                sVar4.d0(-92438157);
                sVar5 = sVar4;
            } else {
                sVar4.d0(-62912517);
                j13 = j11;
                l1.s sVar12 = sVar4;
                d0.n.c(se.k.y(R.drawable.lb_arrow_up, sVar4, r9), null, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 11, CropImageView.DEFAULT_ASPECT_RATIO, 11), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(j13, 5), sVar12, 432, 56);
                sVar5 = sVar12;
            }
            sVar5.p(r9);
            z1.o oVar3 = oVar;
            l1.s sVar13 = sVar5;
            ua.b(w4.c.f(leaderBoardUser.getWeekEarnedXP(), " XP"), e2.s(j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14, CropImageView.DEFAULT_ASPECT_RATIO, 11), 72), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar5.j(d0Var), f0.e(4284969350L), j3.A(r27), sVar8, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar13, 48, 0, 65532);
            l1.s sVar14 = sVar13;
            sVar14.p(true);
            if (z12) {
                sVar14.d0(-1159292472);
                j0.c.g(sVar14, j0.r.f35391a.a(d0.n.h(d2.h.a(e2.e(j0.c.C(e2.g(oVar3, 1), 9, f5, i18), 1.0f), 0.18f), f0.e(4286995603L), f0.f28556b), z1.c.H));
            } else {
                sVar14.d0(-1189493385);
            }
            sVar14.p(r9);
            sVar14.p(true);
            sVar = sVar14;
        } else {
            j13 = j11;
            l1.s sVar15 = sVar6;
            sVar15.W();
            sVar = sVar15;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            final long j14 = j13;
            x1VarT.f39502d = new fz.e(i11, leaderBoardUser, j14, j12, list, eVar, i12, z11, z12, cVar, cVar2, i13) { // from class: qu.g
                public final /* synthetic */ boolean H;
                public final /* synthetic */ boolean K;
                public final /* synthetic */ fz.c L;
                public final /* synthetic */ fz.c M;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f48369a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ LeaderBoardUser f48370b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f48371c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f48372d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ List f48373e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ r0.e f48374f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ int f48375t;

                @Override // fz.e
                public final Object invoke(Object obj7, Object obj8) {
                    ((Integer) obj8).getClass();
                    int iM = l1.t.M(100691329);
                    o.d(this.f48369a, this.f48370b, this.f48371c, this.f48372d, this.f48373e, this.f48374f, this.f48375t, this.H, this.K, this.L, this.M, (l1.n) obj7, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void e(final String str, final long j11, final int i11, final int i12, l1.n nVar, final int i13) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-164029301);
        int i14 = i13 | (sVar.f(str) ? 4 : 2) | (sVar.d(i11) ? 256 : 128) | (sVar.d(i12) ? 2048 : 1024);
        if (sVar.T(i14 & 1, (i14 & 1171) != 1170)) {
            float f5 = 16;
            z1.r rVarE = j0.c.E(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, f5, 5);
            j0.a2 a2VarA = z1.a(j0.i.h(10), z1.c.M, sVar, 54);
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
            l1.t.J(y2.j.f56917f, a2VarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            d0.n.c(se.k.y(i11, sVar, (i14 >> 6) & 14), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 124);
            ua.b(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), j11, j3.A(18), n3.s.N, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, i14 & 14, 0, 65534);
            sVar = sVar;
            d0.n.c(se.k.y(i12, sVar, (i14 >> 9) & 14), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 124);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(i11, i12, i13, j11, str) { // from class: qu.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f48376a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f48377b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f48378c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f48379d;

                {
                    this.f48376a = str;
                    this.f48377b = j11;
                }

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(49);
                    o.e(this.f48376a, this.f48377b, this.f48378c, this.f48379d, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }
}
