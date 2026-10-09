package rt;

import com.lingodeer.data.model.AchievementLanguage;
import com.lingodeer.data.model.AchievementLeaderBoard;
import com.lingodeer.data.model.AchievementLevel;
import com.lingodeer.data.model.AchievementLevelType;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l3 extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f50008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f50009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f50010d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3(Object obj, vy.d dVar, int i11) {
        super(3, dVar);
        this.f50007a = i11;
        this.f50010d = obj;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f50007a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                l3 l3Var = new l3((m0) this.f50010d, (vy.d) obj3, 0);
                l3Var.f50008b = zBooleanValue;
                l3Var.f50009c = (Map) obj2;
                return l3Var.invokeSuspend(qy.b0.f48488a);
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                l3 l3Var2 = new l3((vt.n0) this.f50010d, (vy.d) obj3, 1);
                l3Var2.f50009c = (List) obj;
                l3Var2.f50008b = zBooleanValue2;
                return l3Var2.invokeSuspend(qy.b0.f48488a);
            default:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                l3 l3Var3 = new l3((tu.e0) this.f50010d, (vy.d) obj3, 2);
                l3Var3.f50008b = zBooleanValue3;
                l3Var3.f50009c = (LeaderBoardUser) obj2;
                return l3Var3.invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f50007a;
        Object obj2 = this.f50010d;
        boolean zBooleanValue = false;
        int i12 = 0;
        int i13 = 0;
        switch (i11) {
            case 0:
                boolean z11 = this.f50008b;
                Map map = (Map) this.f50009c;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Boolean bool = (Boolean) map.get(((m0) obj2).f50042a);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else if (z11) {
                    zBooleanValue = true;
                }
                return new ka(true, zBooleanValue);
            case 1:
                List list = (List) this.f50009c;
                boolean z12 = this.f50008b;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                vt.n0 n0Var = (vt.n0) obj2;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (fb.g0.g(((fr.o0) n0Var).f27733a.keyLanguage, ((CourseUnit) obj3).getSortIndex(), z12)) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
                int size = arrayList.size();
                while (i13 < size) {
                    Object obj4 = arrayList.get(i13);
                    i13++;
                    b7.e0.x(((CourseUnit) obj4).getUnitId(), arrayList2);
                }
                return arrayList2;
            default:
                boolean z13 = this.f50008b;
                LeaderBoardUser leaderBoardUser = (LeaderBoardUser) this.f50009c;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (leaderBoardUser == null) {
                    return tu.z.f52631a;
                }
                tu.e0 e0Var = (tu.e0) obj2;
                String achievementXPExpert = leaderBoardUser.getAchievementXPExpert();
                kotlin.jvm.internal.m.f(achievementXPExpert, "achievementXPExpert");
                AchievementLevel achievementLevelN = com.bumptech.glide.e.n(achievementXPExpert, "xp");
                achievementLevelN.setCurrentValue(0);
                String achievementTopStudent = leaderBoardUser.getAchievementTopStudent();
                kotlin.jvm.internal.m.f(achievementTopStudent, "achievementTopStudent");
                AchievementLevel achievementLevelN2 = com.bumptech.glide.e.n(achievementTopStudent, AchievementLevelType.KNOWLEDGE_POINT);
                achievementLevelN2.setCurrentValue(0);
                String achievementStreakHero = leaderBoardUser.getAchievementStreakHero();
                kotlin.jvm.internal.m.f(achievementStreakHero, "achievementStreakHero");
                AchievementLevel achievementLevelN3 = com.bumptech.glide.e.n(achievementStreakHero, AchievementLevelType.DAY_STREAK);
                achievementLevelN3.setCurrentValue(0);
                List listL = ns.o.L(achievementLevelN, achievementLevelN2, achievementLevelN3);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : listL) {
                    if (((AchievementLevel) obj5).isActive()) {
                        arrayList3.add(obj5);
                    }
                }
                List listW0 = oz.q.W0(leaderBoardUser.getAchievementLanguages(), new String[]{";"}, 0, 6);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj6 : listW0) {
                    if (((String) obj6).length() > 0) {
                        arrayList4.add(obj6);
                    }
                }
                int iW = ry.x.W(ry.n.W(arrayList4, 10));
                if (iW < 16) {
                    iW = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
                int size2 = arrayList4.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj7 = arrayList4.get(i14);
                    i14++;
                    List listW1 = oz.q.W0((String) obj7, new String[]{":"}, 0, 6);
                    linkedHashMap.put((String) listW1.get(0), new Float(Float.parseFloat((String) listW1.get(1))));
                }
                LinkedHashMap linkedHashMapK0 = ry.x.k0(linkedHashMap);
                yy.a<ks.d> aVarB = ks.d.b();
                ArrayList arrayList5 = new ArrayList(ry.n.W(aVarB, 10));
                for (ks.d dVar : aVarB) {
                    float fFloatValue = ((Number) linkedHashMapK0.getOrDefault(dVar.a(), new Float(CropImageView.DEFAULT_ASPECT_RATIO))).floatValue();
                    arrayList5.add(new AchievementLanguage(dVar.a(), dVar, fFloatValue > CropImageView.DEFAULT_ASPECT_RATIO, fFloatValue));
                }
                ArrayList arrayList6 = new ArrayList();
                int size3 = arrayList5.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj8 = arrayList5.get(i15);
                    i15++;
                    if (((AchievementLanguage) obj8).isActive()) {
                        arrayList6.add(obj8);
                    }
                }
                ArrayList arrayListY = com.bumptech.glide.e.y(leaderBoardUser.getAchievementLeaderboard());
                ArrayList arrayList7 = new ArrayList();
                int size4 = arrayListY.size();
                while (i12 < size4) {
                    Object obj9 = arrayListY.get(i12);
                    i12++;
                    if (((AchievementLeaderBoard) obj9).isActive()) {
                        arrayList7.add(obj9);
                    }
                }
                return new tu.a0(LeaderBoardUser.copy$default(leaderBoardUser, null, 0, 0, null, null, null, null, null, null, false, z13, ((fr.o0) e0Var.f52558c).w().equals(leaderBoardUser.getUid()), 0, leaderBoardUser.getDayStreak(), leaderBoardUser.getTotalXP(), leaderBoardUser.getTotalTime(), null, null, null, null, null, 2036735, null), arrayList3, arrayList6, arrayList7);
        }
    }
}
