package mt;

import com.google.api.Service;
import com.lingo.lingoskill.idnskill.ui.learn.IDNSyllableIntroductionActivity;
import com.lingo.lingoskill.turskill.ui.learn.TURSyllableIntroductionActivity;
import com.lingo.lingoskill.ukrskill.ui.learn.UKRSyllableIntroductionActivity;
import com.lingodeer.data.model.AchievementLanguage;
import com.lingodeer.data.model.AchievementLeaderBoard;
import com.lingodeer.data.model.AchievementRecord;
import com.lingodeer.data.model.CourseCharacterGroup;
import com.lingodeer.data.model.uistate.LeaderBoardClass;
import com.lingodeer.data.model.uistate.LeaderBoardRankState;
import com.lingodeer.data.model.uistate.LeaderBoardUiState;
import com.lingodeer.data.model.uistate.MainUiState;
import com.lingodeer.syllable_ko.model.KOSyllableLesson;
import com.yalantis.ucrop.view.CropImageView;
import h1.k7;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import rt.ud;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k6 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f41601d;

    public /* synthetic */ k6(int i11, int i12, fz.a aVar, fz.c cVar, Object obj) {
        this.f41598a = i12;
        this.f41599b = aVar;
        this.f41601d = cVar;
        this.f41600c = obj;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        long j11;
        int i11 = this.f41598a;
        l1.g gVar = l1.m.f39353a;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj3 = this.f41600c;
        Object obj4 = this.f41601d;
        Object obj5 = this.f41599b;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                y3.v((ud) obj3, (fz.a) obj5, (fz.c) obj4, (l1.n) obj, l1.t.M(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                nh.d.a((Exception) obj3, (fz.a) obj5, (z1.r) obj4, (l1.n) obj, l1.t.M(433));
                break;
            case 2:
                ((Integer) obj2).getClass();
                nh.d.b((Map) obj3, (fz.c) obj4, (z1.r) obj5, (l1.n) obj, l1.t.M(385));
                break;
            case 3:
                ((Integer) obj2).getClass();
                nq.c.a((fz.a) obj5, (z1.r) obj3, (tq.d) obj4, (l1.n) obj, l1.t.M(1));
                break;
            case 4:
                nu.e eVar = (nu.e) obj4;
                s2.t change = (s2.t) obj;
                kotlin.jvm.internal.m.f(change, "change");
                g2.p0 p0Var = (g2.p0) ((ou.c) obj3).f46074g.get(((pu.b) obj5).e());
                long j12 = change.f51345c;
                g2.m mVarI = g2.f0.i();
                mVarI.c(p0Var);
                float length = mVarI.f28582a.getLength();
                float fK = CropImageView.DEFAULT_ASPECT_RATIO;
                if (length != CropImageView.DEFAULT_ASPECT_RATIO) {
                    float f5 = Float.MAX_VALUE;
                    float f11 = 0.0f;
                    float f12 = 0.0f;
                    while (f11 <= length) {
                        float f13 = f5;
                        long jA = mVarI.a(f11);
                        float f14 = length;
                        if (f2.b.c(jA, 9205357640488583168L)) {
                            j11 = j12;
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32)) - Float.intBitsToFloat((int) (j12 >> 32));
                            j11 = j12;
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L));
                            float f15 = (fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat);
                            if (f15 < f13) {
                                f12 = f11 / f14;
                                f5 = f15;
                            }
                            f11 += 1.0f;
                            length = f14;
                            j12 = j11;
                            fK = CropImageView.DEFAULT_ASPECT_RATIO;
                        }
                        f5 = f13;
                        f11 += 1.0f;
                        length = f14;
                        j12 = j11;
                        fK = CropImageView.DEFAULT_ASPECT_RATIO;
                    }
                    fK = hz.b.k(f12, fK, 1.0f);
                }
                rz.e0.B(eVar.f44064c, null, null, new f3.c(fK, 4, eVar, null), 3);
                break;
            case 5:
                ((Integer) obj2).getClass();
                nv.a.d((sv.b) obj3, (fz.c) obj4, (fz.a) obj5, (l1.n) obj, l1.t.M(1));
                break;
            case 6:
                sv.e eVar2 = (sv.e) obj3;
                j9.v vVar = (j9.v) obj5;
                fz.c cVar = (fz.c) obj4;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else {
                    KOSyllableLesson kOSyllableLesson = eVar2.f51801a;
                    boolean z11 = eVar2.f51802b;
                    boolean zH = sVar.h(vVar);
                    Object objQ = sVar.Q();
                    if (zH || objQ == gVar) {
                        objQ = new j9.g(vVar, 19);
                        sVar.o0(objQ);
                    }
                    nv.r.v(kOSyllableLesson, z11, null, null, (fz.a) objQ, cVar, sVar, 0);
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                pr.f0.b((List) obj3, (fz.a) obj5, (fz.c) obj4, (l1.n) obj, l1.t.M(1));
                break;
            case 8:
                AchievementLanguage achievementLanguage = (AchievementLanguage) obj3;
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) obj5;
                kotlin.jvm.internal.y yVar2 = (kotlin.jvm.internal.y) obj4;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar2.W();
                } else {
                    pr.f0.g(achievementLanguage, new fu.g0(yVar, yVar2, 2), sVar2, 0);
                }
                break;
            case 9:
                AchievementLeaderBoard achievementLeaderBoard = (AchievementLeaderBoard) obj3;
                kotlin.jvm.internal.y yVar3 = (kotlin.jvm.internal.y) obj5;
                kotlin.jvm.internal.y yVar4 = (kotlin.jvm.internal.y) obj4;
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (!sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    sVar3.W();
                } else {
                    pr.f0.j(achievementLeaderBoard, new fu.g0(yVar3, yVar4, 3), sVar3, 0);
                }
                break;
            case 10:
                AchievementRecord achievementRecord = (AchievementRecord) obj3;
                kotlin.jvm.internal.y yVar5 = (kotlin.jvm.internal.y) obj5;
                kotlin.jvm.internal.y yVar6 = (kotlin.jvm.internal.y) obj4;
                l1.n nVar4 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar4;
                if (!sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    sVar4.W();
                } else {
                    pr.f0.o(achievementRecord, new fu.g0(yVar5, yVar6, 4), sVar4, 0);
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                pv.a.b((qv.c) obj3, (fz.a) obj5, (fz.c) obj4, (l1.n) obj, l1.t.M(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                qu.r.a((LeaderBoardClass) obj3, (LeaderBoardRankState) obj4, (fz.a) obj5, (l1.n) obj, l1.t.M(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                qu.b.a((tu.j) obj3, (mu.x) obj4, (fz.a) obj5, (l1.n) obj, l1.t.M(385));
                break;
            case 14:
                ((Integer) obj2).getClass();
                qu.b.j((tu.b0) obj3, (fz.c) obj4, (fz.c) obj5, (l1.n) obj, l1.t.M(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                rg.e.a((String) obj3, (String) obj5, (z1.r) obj4, (l1.n) obj, l1.t.M(3457));
                break;
            case 16:
                ((Integer) obj2).getClass();
                s0.o0.h((z1.r) obj3, (d1.z0) obj5, (t1.d) obj4, (l1.n) obj, l1.t.M(385));
                break;
            case 17:
                ((Integer) obj2).getClass();
                int i12 = IDNSyllableIntroductionActivity.P;
                ((IDNSyllableIntroductionActivity) obj3).r((String) obj5, (fz.c) obj4, (l1.n) obj, l1.t.M(1));
                break;
            case 18:
                fz.a aVar = (fz.a) obj5;
                l1.b1 b1Var = (l1.b1) obj3;
                fz.a aVar2 = (fz.a) obj4;
                l1.n nVar5 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.s sVar5 = (l1.s) nVar5;
                if (!sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    sVar5.W();
                } else {
                    j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.L, sVar5, 0);
                    int iHashCode = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL = sVar5.l();
                    z1.r rVarC = z1.a.c(sVar5, z1.o.f58481a);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA, sVar5);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar5);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar5, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar5);
                    k7.h(aVar, null, false, null, vr.c.f54128d, sVar5, 196608, 30);
                    if (((o3.w) b1Var.getValue()).f44704a.f35700b.length() > 0) {
                        sVar5.d0(641004770);
                        boolean zF = sVar5.f(b1Var) | sVar5.f(aVar2);
                        Object objQ2 = sVar5.Q();
                        if (zF || objQ2 == gVar) {
                            objQ2 = new fu.e(24, aVar2, b1Var);
                            sVar5.o0(objQ2);
                        }
                        k7.h((fz.a) objQ2, null, false, null, vr.c.f54129e, sVar5, 196608, 30);
                    } else {
                        sVar5.d0(627429002);
                    }
                    sVar5.p(false);
                    sVar5.p(true);
                }
                break;
            case 19:
                ((Integer) obj2).getClass();
                vr.b.f((ArrayList) obj3, (Set) obj5, (fz.c) obj4, (l1.n) obj, l1.t.M(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                vr.b.a((fz.a) obj5, (fz.c) obj4, (zr.b) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                vr.i.c((z1.r) obj3, (fz.c) obj4, (zr.m) obj5, (l1.n) obj, l1.t.M(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                vr.i.a((CourseCharacterGroup) obj3, (fz.a) obj5, (z1.r) obj4, (l1.n) obj, l1.t.M(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                int i13 = TURSyllableIntroductionActivity.H;
                ((TURSyllableIntroductionActivity) obj3).r((String) obj4, (fz.a) obj5, (l1.n) obj, l1.t.M(1));
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                ((Integer) obj2).getClass();
                int i14 = UKRSyllableIntroductionActivity.H;
                ((UKRSyllableIntroductionActivity) obj3).u(l1.t.M(1), (String) obj5, (l1.n) obj, (z1.r) obj4);
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((Integer) obj2).getClass();
                xu.c.f(l1.t.M(391), (fz.a) obj5, (fz.a) obj3, (fz.c) obj4, (l1.n) obj);
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                ((Integer) obj2).getClass();
                xu.u.b((hu.k) obj3, (mu.x) obj4, (fz.a) obj5, (l1.n) obj, l1.t.M(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                xu.c.j((LeaderBoardUiState) obj3, (fz.a) obj5, (fz.a) obj4, (l1.n) obj, l1.t.M(1));
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                ((Integer) obj2).getClass();
                xu.a1.c((MainUiState) obj3, (fz.c) obj4, (zu.s2) obj5, (l1.n) obj, l1.t.M(1));
                break;
            default:
                ((Integer) obj2).getClass();
                xu.h1.c((fz.a) obj5, (fz.c) obj4, (zu.i1) obj3, (l1.n) obj, l1.t.M(49));
                break;
        }
        return b0Var;
    }

    public /* synthetic */ k6(fz.a aVar, fz.a aVar2, l1.b1 b1Var) {
        this.f41598a = 18;
        this.f41599b = aVar;
        this.f41600c = b1Var;
        this.f41601d = aVar2;
    }

    public /* synthetic */ k6(fz.a aVar, z1.r rVar, tq.d dVar, int i11) {
        this.f41598a = 3;
        this.f41599b = aVar;
        this.f41600c = rVar;
        this.f41601d = dVar;
    }

    public /* synthetic */ k6(Object obj, Object obj2, Object obj3, int i11) {
        this.f41598a = i11;
        this.f41600c = obj;
        this.f41599b = obj2;
        this.f41601d = obj3;
    }

    public /* synthetic */ k6(Object obj, Object obj2, Object obj3, int i11, int i12) {
        this.f41598a = i12;
        this.f41600c = obj;
        this.f41599b = obj2;
        this.f41601d = obj3;
    }

    public /* synthetic */ k6(Object obj, Object obj2, boolean z11, Object obj3, int i11, int i12) {
        this.f41598a = i12;
        this.f41600c = obj;
        this.f41601d = obj2;
        this.f41599b = obj3;
    }
}
