package pr;

import bp.b1;
import com.lingodeer.data.model.AchievementLanguage;
import com.lingodeer.data.model.AchievementLeaderBoard;
import com.lingodeer.data.model.AchievementLevel;
import com.lingodeer.data.model.CourseCharacterGroup;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import h1.g7;
import h1.ua;
import hh.p0;
import j0.e2;
import j3.y0;
import java.util.List;
import l1.q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f47020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f47021c;

    public /* synthetic */ e(int i11, fz.c cVar, List list) {
        this.f47019a = i11;
        this.f47020b = list;
        this.f47021c = cVar;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        switch (this.f47019a) {
            case 0:
                m0.l lVar = (m0.l) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.n nVar = (l1.n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i11 = (((l1.s) nVar).f(lVar) ? 4 : 2) | iIntValue2;
                } else {
                    i11 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i11 |= ((l1.s) nVar).d(iIntValue) ? 32 : 16;
                }
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(i11 & 1, (i11 & 147) != 146)) {
                    AchievementLanguage achievementLanguage = (AchievementLanguage) this.f47020b.get(iIntValue);
                    sVar.d0(1442707434);
                    z1.h hVar = z1.c.P;
                    fz.c cVar = this.f47021c;
                    boolean zF = sVar.f(cVar) | sVar.h(achievementLanguage);
                    Object objQ = sVar.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zF || objQ == gVar) {
                        objQ = new b(cVar, achievementLanguage, 0);
                        sVar.o0(objQ);
                    }
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarQ = iu.k.q(6, 7, (fz.a) objQ, sVar, oVar, false);
                    j0.u uVarA = j0.t.a(j0.i.f35305c, hVar, sVar, 48);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarQ);
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
                    y2.h hVar2 = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                    f0.e(achievementLanguage, qr.a.SMALL, sVar, 48);
                    float f5 = 0;
                    float f11 = 8;
                    z1.r rVarE = j0.c.E(e2.s(oVar, 60), CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                    float progress = achievementLanguage.getProgress();
                    float f12 = CropImageView.DEFAULT_ASPECT_RATIO;
                    if (progress != CropImageView.DEFAULT_ASPECT_RATIO) {
                        f12 = 1.0f;
                    }
                    z1.r rVarA = d2.h.a(rVarE, f12);
                    boolean zH = sVar.h(achievementLanguage);
                    Object objQ2 = sVar.Q();
                    if (zH || objQ2 == gVar) {
                        objQ2 = new c(achievementLanguage, 0);
                        sVar.o0(objQ2);
                    }
                    fz.a aVar = (fz.a) objQ2;
                    Object objQ3 = sVar.Q();
                    if (objQ3 == gVar) {
                        objQ3 = d.f47014b;
                        sVar.o0(objQ3);
                    }
                    g7.c(aVar, rVarA, 0L, 0L, 0, f5, (fz.c) objQ3, sVar, 1769472, 28);
                    ua.b(tv.a.m(achievementLanguage.getLanguage(), sVar), j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), 0L, j3.A(14), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744441), sVar, 48, 0, 65532);
                    sVar.p(true);
                    sVar.p(false);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                m0.l lVar2 = (m0.l) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l1.n nVar2 = (l1.n) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i12 = (((l1.s) nVar2).f(lVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i12 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i12 |= ((l1.s) nVar2).d(iIntValue3) ? 32 : 16;
                }
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
                    AchievementLanguage achievementLanguage2 = (AchievementLanguage) this.f47020b.get(iIntValue3);
                    sVar2.d0(-1411456587);
                    z1.h hVar3 = z1.c.P;
                    fz.c cVar2 = this.f47021c;
                    boolean zF2 = sVar2.f(cVar2) | sVar2.h(achievementLanguage2);
                    Object objQ4 = sVar2.Q();
                    l1.g gVar2 = l1.m.f39353a;
                    if (zF2 || objQ4 == gVar2) {
                        objQ4 = new b(cVar2, achievementLanguage2, 1);
                        sVar2.o0(objQ4);
                    }
                    z1.o oVar2 = z1.o.f58481a;
                    z1.r rVarQ2 = iu.k.q(6, 7, (fz.a) objQ4, sVar2, oVar2, false);
                    j0.u uVarA2 = j0.t.a(j0.i.f35305c, hVar3, sVar2, 48);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    q1 q1VarL2 = sVar2.l();
                    z1.r rVarC2 = z1.a.c(sVar2, rVarQ2);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar2);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA2, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
                    y2.h hVar4 = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar4);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                    f0.e(achievementLanguage2, qr.a.SMALL, sVar2, 48);
                    float f13 = -4;
                    z1.r rVarA2 = d2.h.a(j0.c.E(e2.s(oVar2, 60), CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), ((double) achievementLanguage2.getProgress()) <= 0.0d ? CropImageView.DEFAULT_ASPECT_RATIO : 1.0f);
                    boolean zH2 = sVar2.h(achievementLanguage2);
                    Object objQ5 = sVar2.Q();
                    if (zH2 || objQ5 == gVar2) {
                        objQ5 = new c(achievementLanguage2, 1);
                        sVar2.o0(objQ5);
                    }
                    fz.a aVar2 = (fz.a) objQ5;
                    Object objQ6 = sVar2.Q();
                    if (objQ6 == gVar2) {
                        objQ6 = d.f47015c;
                        sVar2.o0(objQ6);
                    }
                    g7.c(aVar2, rVarA2, 0L, 0L, 0, f13, (fz.c) objQ6, sVar2, 1769472, 28);
                    ua.b(tv.a.m(achievementLanguage2.getLanguage(), sVar2), j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), 0L, j3.A(14), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744441), sVar2, 48, 0, 65532);
                    sVar2.p(true);
                    sVar2.p(false);
                } else {
                    sVar2.W();
                }
                break;
            case 2:
                m0.l lVar3 = (m0.l) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                l1.n nVar3 = (l1.n) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i13 = (((l1.s) nVar3).f(lVar3) ? 4 : 2) | iIntValue6;
                } else {
                    i13 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i13 |= ((l1.s) nVar3).d(iIntValue5) ? 32 : 16;
                }
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(i13 & 1, (i13 & 147) != 146)) {
                    AchievementLeaderBoard achievementLeaderBoard = (AchievementLeaderBoard) this.f47020b.get(iIntValue5);
                    sVar3.d0(-1184302693);
                    z1.h hVar5 = z1.c.P;
                    fz.c cVar3 = this.f47021c;
                    boolean zF3 = sVar3.f(cVar3) | sVar3.h(achievementLeaderBoard);
                    Object objQ7 = sVar3.Q();
                    if (zF3 || objQ7 == l1.m.f39353a) {
                        objQ7 = new b1(24, cVar3, achievementLeaderBoard);
                        sVar3.o0(objQ7);
                    }
                    z1.o oVar3 = z1.o.f58481a;
                    z1.r rVarQ3 = iu.k.q(6, 7, (fz.a) objQ7, sVar3, oVar3, false);
                    j0.u uVarA3 = j0.t.a(j0.i.f35305c, hVar5, sVar3, 48);
                    int iHashCode3 = Long.hashCode(sVar3.T);
                    q1 q1VarL3 = sVar3.l();
                    z1.r rVarC3 = z1.a.c(sVar3, rVarQ3);
                    y2.k.J.getClass();
                    y2.i iVar3 = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar3);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA3, sVar3);
                    l1.t.J(y2.j.f56916e, q1VarL3, sVar3);
                    y2.h hVar6 = y2.j.f56918g;
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar6);
                    }
                    l1.t.J(y2.j.f56915d, rVarC3, sVar3);
                    f0.h(achievementLeaderBoard, qr.a.SMALL, sVar3, 48);
                    String strP = vc.a.p(achievementLeaderBoard, sVar3);
                    l1.d0 d0Var = ua.f31167a;
                    ua.b(strP, j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 15, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar3.j(d0Var), 0L, j3.A(14), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744441), sVar3, 48, 0, 65532);
                    ua.b(achievementLeaderBoard.getEarnDate(), j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar3.j(d0Var), g2.f0.e(4287601834L), j3.A(12), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar3, 48, 0, 65532);
                    sVar3.p(true);
                    sVar3.p(false);
                } else {
                    sVar3.W();
                }
                break;
            case 3:
                m0.l lVar4 = (m0.l) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                l1.n nVar4 = (l1.n) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i14 = (((l1.s) nVar4).f(lVar4) ? 4 : 2) | iIntValue8;
                } else {
                    i14 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i14 |= ((l1.s) nVar4).d(iIntValue7) ? 32 : 16;
                }
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(i14 & 1, (i14 & 147) != 146)) {
                    AchievementLevel achievementLevel = (AchievementLevel) this.f47020b.get(iIntValue7);
                    sVar4.d0(-1850512135);
                    z1.h hVar7 = z1.c.P;
                    fz.c cVar4 = this.f47021c;
                    boolean zF4 = sVar4.f(cVar4) | sVar4.h(achievementLevel);
                    Object objQ8 = sVar4.Q();
                    if (zF4 || objQ8 == l1.m.f39353a) {
                        objQ8 = new b1(23, cVar4, achievementLevel);
                        sVar4.o0(objQ8);
                    }
                    z1.o oVar4 = z1.o.f58481a;
                    z1.r rVarQ4 = iu.k.q(6, 7, (fz.a) objQ8, sVar4, oVar4, false);
                    j0.u uVarA4 = j0.t.a(j0.i.f35305c, hVar7, sVar4, 48);
                    int iHashCode4 = Long.hashCode(sVar4.T);
                    q1 q1VarL4 = sVar4.l();
                    z1.r rVarC4 = z1.a.c(sVar4, rVarQ4);
                    y2.k.J.getClass();
                    y2.i iVar4 = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar4);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA4, sVar4);
                    l1.t.J(y2.j.f56916e, q1VarL4, sVar4);
                    y2.h hVar8 = y2.j.f56918g;
                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar8);
                    }
                    l1.t.J(y2.j.f56915d, rVarC4, sVar4);
                    f0.a(achievementLevel, qr.a.SMALL, sVar4, 48);
                    String strV = ve.i.v(achievementLevel, sVar4);
                    l1.d0 d0Var2 = ua.f31167a;
                    ua.b(strV, j0.c.E(oVar4, CropImageView.DEFAULT_ASPECT_RATIO, 15, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar4.j(d0Var2), 0L, j3.A(14), n3.s.L, null, null, 0L, null, null, 3, 4, 0L, null, 16678905), sVar4, 48, 0, 65532);
                    achievementLevel.getId();
                    ua.b(p0.h(achievementLevel.getLevel(), "(", "/10)"), j0.c.E(oVar4, CropImageView.DEFAULT_ASPECT_RATIO, 5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar4.j(d0Var2), g2.f0.e(4287601834L), j3.A(12), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar4, 48, 0, 65532);
                    sVar4.p(true);
                    sVar4.p(false);
                } else {
                    sVar4.W();
                }
                break;
            case 4:
                l0.c cVar5 = (l0.c) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                l1.n nVar5 = (l1.n) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i15 = (((l1.s) nVar5).f(cVar5) ? 4 : 2) | iIntValue10;
                } else {
                    i15 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i15 |= ((l1.s) nVar5).d(iIntValue9) ? 32 : 16;
                }
                l1.s sVar5 = (l1.s) nVar5;
                if (sVar5.T(i15 & 1, (i15 & 147) != 146)) {
                    CourseCharacterGroup courseCharacterGroup = (CourseCharacterGroup) this.f47020b.get(iIntValue9);
                    sVar5.d0(-255312561);
                    fz.c cVar6 = this.f47021c;
                    boolean zF5 = sVar5.f(cVar6) | sVar5.h(courseCharacterGroup);
                    Object objQ9 = sVar5.Q();
                    if (zF5 || objQ9 == l1.m.f39353a) {
                        objQ9 = new vr.h(0, cVar6, courseCharacterGroup);
                        sVar5.o0(objQ9);
                    }
                    vr.i.a(courseCharacterGroup, (fz.a) objQ9, null, sVar5, 0);
                    sVar5.p(false);
                } else {
                    sVar5.W();
                }
                break;
            case 5:
                m0.l lVar5 = (m0.l) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                l1.n nVar6 = (l1.n) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                if ((iIntValue12 & 6) == 0) {
                    i16 = (((l1.s) nVar6).f(lVar5) ? 4 : 2) | iIntValue12;
                } else {
                    i16 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i16 |= ((l1.s) nVar6).d(iIntValue11) ? 32 : 16;
                }
                l1.s sVar6 = (l1.s) nVar6;
                if (sVar6.T(i16 & 1, (i16 & 147) != 146)) {
                    String str = (String) this.f47020b.get(iIntValue11);
                    sVar6.d0(2074985962);
                    xn.a.j(str, this.f47021c, sVar6, 0);
                    sVar6.p(false);
                } else {
                    sVar6.W();
                }
                break;
            default:
                l0.c cVar7 = (l0.c) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                l1.n nVar7 = (l1.n) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    i17 = (((l1.s) nVar7).f(cVar7) ? 4 : 2) | iIntValue14;
                } else {
                    i17 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i17 |= ((l1.s) nVar7).d(iIntValue13) ? 32 : 16;
                }
                l1.s sVar7 = (l1.s) nVar7;
                if (sVar7.T(i17 & 1, (i17 & 147) != 146)) {
                    LeaderBoardUser leaderBoardUser = (LeaderBoardUser) this.f47020b.get(iIntValue13);
                    sVar7.d0(-1776940764);
                    xu.a0.f(leaderBoardUser, iIntValue13, this.f47021c, sVar7, i17 & 112);
                    sVar7.p(false);
                } else {
                    sVar7.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
