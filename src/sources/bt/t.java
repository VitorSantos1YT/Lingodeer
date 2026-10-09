package bt;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import com.lingo.story.ui.StoryActivity;
import com.lingodeer.data.model.AchievementLevel;
import com.lingodeer.data.model.DayStreakFinishedStatus;
import com.lingodeer.data.model.RecordingStatus;
import com.yalantis.ucrop.view.CropImageView;
import h1.ua;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6004b;

    public /* synthetic */ t(Object obj, int i11) {
        this.f6003a = i11;
        this.f6004b = obj;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11 = this.f6003a;
        int i12 = 3;
        int i13 = 1;
        l1.g gVar = l1.m.f39353a;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj5 = this.f6004b;
        switch (i11) {
            case 0:
                a0.r AnimatedContent = (a0.r) obj;
                RecordingStatus it = (RecordingStatus) obj2;
                int iIntValue = ((Integer) obj4).intValue();
                kotlin.jvm.internal.m.f(AnimatedContent, "$this$AnimatedContent");
                kotlin.jvm.internal.m.f(it, "it");
                i0.d(it, (bv.z) ((jt.g) obj5).f36943l.getValue(), (l1.n) obj3, (iIntValue >> 3) & 14);
                return b0Var;
            case 1:
                l1.a1 a1Var = (l1.a1) obj5;
                a0.r AnimatedContent2 = (a0.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.n nVar = (l1.n) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                kotlin.jvm.internal.m.f(AnimatedContent2, "$this$AnimatedContent");
                z1.o oVar = z1.o.f58481a;
                z1.r rVarG = j0.e2.g(j0.e2.e(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 32, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f), 200);
                w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                l1.s sVar = (l1.s) nVar;
                int iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL = sVar.l();
                z1.r rVarC = z1.a.c(nVar, rVarG);
                y2.k.J.getClass();
                y2.i iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD, nVar);
                l1.t.J(y2.j.f56916e, q1VarL, nVar);
                y2.h hVar = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC, nVar);
                if (((l1.h1) a1Var).l() > 0) {
                    sVar.d0(1019827133);
                    fu.a.n(6, 0, nVar, j0.c.y(j0.e2.s(oVar, 240), CropImageView.DEFAULT_ASPECT_RATIO, -135, 1));
                } else {
                    sVar.d0(1013857649);
                }
                sVar.p(false);
                fu.a.q(iIntValue2, d2.h.i(j0.r.f35391a.a(oVar, z1.c.H), 0.8f, 0.8f), nVar, (iIntValue3 >> 3) & 14, 0);
                sVar.p(true);
                return b0Var;
            case 2:
                a0.r AnimatedContent3 = (a0.r) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.n nVar2 = (l1.n) obj3;
                ((Integer) obj4).getClass();
                kotlin.jvm.internal.m.f(AnimatedContent3, "$this$AnimatedContent");
                String strE0 = ub.a.e0(nVar2, ((Integer[]) obj5)[iIntValue4].intValue());
                l1.s sVar2 = (l1.s) nVar2;
                ua.b(strE0, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar2.j(ua.f31167a), 0L, fr.j3.A(16), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar2, 0, 0, 65534);
                return b0Var;
            case 3:
                StoryActivity storyActivity = (StoryActivity) obj5;
                a0.r composable = (a0.r) obj;
                ((Integer) obj4).getClass();
                int i14 = StoryActivity.N;
                kotlin.jvm.internal.m.f(composable, "$this$composable");
                kotlin.jvm.internal.m.f((j9.e) obj2, "it");
                int iP = storyActivity.p();
                l1.s sVar3 = (l1.s) ((l1.n) obj3);
                boolean zH = sVar3.h(storyActivity);
                Object objQ = sVar3.Q();
                if (zH || objQ == gVar) {
                    objQ = new jr.b(storyActivity, i13);
                    sVar3.o0(objQ);
                }
                jr.a.e(iP, (fz.a) objQ, null, sVar3, 0);
                return b0Var;
            case 4:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                kotlin.jvm.internal.m.c(sQLiteQuery);
                ((ka.f) obj5).c(new la.i(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            case 5:
                r3.c cVar = (r3.c) obj5;
                n3.g0 g0VarB = ((n3.j) cVar.f48771e).b((n3.i) obj, (n3.s) obj2, ((n3.o) obj3).f43170a, ((n3.p) obj4).f43171a);
                if (g0VarB instanceof n3.f0) {
                    Object obj6 = ((n3.f0) g0VarB).f43151a;
                    kotlin.jvm.internal.m.d(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) obj6;
                }
                qp.m3 m3Var = new qp.m3(g0VarB, cVar.L);
                cVar.L = m3Var;
                Object obj7 = m3Var.f48058c;
                kotlin.jvm.internal.m.d(obj7, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) obj7;
            case 6:
                l1.b1 b1Var = (l1.b1) obj5;
                a0.r AnimatedContent4 = (a0.r) obj;
                String joinedChars = (String) obj2;
                l1.n nVar3 = (l1.n) obj3;
                ((Integer) obj4).getClass();
                kotlin.jvm.internal.m.f(AnimatedContent4, "$this$AnimatedContent");
                kotlin.jvm.internal.m.f(joinedChars, "joinedChars");
                List listW0 = oz.q.W0(joinedChars, new String[]{";"}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj8 : listW0) {
                    if (!oz.q.K0((String) obj8)) {
                        arrayList.add(obj8);
                    }
                }
                if (arrayList.isEmpty()) {
                    l1.s sVar4 = (l1.s) nVar3;
                    sVar4.d0(1534616537);
                    vr.b.c(sVar4, 0);
                    sVar4.p(false);
                } else {
                    l1.s sVar5 = (l1.s) nVar3;
                    sVar5.d0(1534708793);
                    Set set = (Set) b1Var.getValue();
                    boolean zF = sVar5.f(b1Var);
                    Object objQ2 = sVar5.Q();
                    if (zF || objQ2 == gVar) {
                        objQ2 = new mt.p(26, b1Var);
                        sVar5.o0(objQ2);
                    }
                    vr.b.f(arrayList, set, (fz.c) objQ2, sVar5, 0);
                    sVar5.p(false);
                }
                return b0Var;
            default:
                x1.p pVar = (x1.p) obj5;
                a0.r AnimatedContent5 = (a0.r) obj;
                xu.j dialogType = (xu.j) obj2;
                l1.n nVar4 = (l1.n) obj3;
                ((Integer) obj4).getClass();
                kotlin.jvm.internal.m.f(AnimatedContent5, "$this$AnimatedContent");
                kotlin.jvm.internal.m.f(dialogType, "dialogType");
                if (dialogType instanceof xu.h) {
                    l1.s sVar6 = (l1.s) nVar4;
                    sVar6.d0(1905908032);
                    DayStreakFinishedStatus dayStreakFinishedStatus = ((xu.h) dialogType).f56409a;
                    Object objQ3 = sVar6.Q();
                    if (objQ3 == gVar) {
                        objQ3 = new w4(pVar, i13);
                        sVar6.o0(objQ3);
                    }
                    fu.a.i(dayStreakFinishedStatus, (fz.a) objQ3, sVar6, 48);
                    sVar6.p(false);
                } else if (dialogType instanceof xu.i) {
                    l1.s sVar7 = (l1.s) nVar4;
                    sVar7.d0(1906484198);
                    int refillShieldCount = ((xu.i) dialogType).f56411a.getRefillShieldCount();
                    Object objQ4 = sVar7.Q();
                    if (objQ4 == gVar) {
                        objQ4 = new w4(pVar, 2);
                        sVar7.o0(objQ4);
                    }
                    fu.a.k(refillShieldCount, 48, (fz.a) objQ4, sVar7);
                    sVar7.p(false);
                } else {
                    if (!(dialogType instanceof xu.g)) {
                        throw nv.p.x((l1.s) nVar4, 2001142141, false);
                    }
                    l1.s sVar8 = (l1.s) nVar4;
                    sVar8.d0(1907077166);
                    AchievementLevel achievementLevel = ((xu.g) dialogType).f56401a;
                    Object objQ5 = sVar8.Q();
                    if (objQ5 == gVar) {
                        objQ5 = new w4(pVar, i12);
                        sVar8.o0(objQ5);
                    }
                    pr.f0.s(achievementLevel, (fz.a) objQ5, sVar8, 48);
                    sVar8.p(false);
                }
                return b0Var;
        }
    }
}
