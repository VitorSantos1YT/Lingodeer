package xt;

import com.lingodeer.data.model.MeUserData;
import com.lingodeer.data.model.ProgressCollectionItem;
import com.lingodeer.data.model.UserInfo;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ry.x;
import rz.e0;
import rz.o0;
import vt.a1;
import vt.t0;
import vt.v0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oz.o f56322a = new oz.o("\\d+");

    public static final String a(String serverValue, String localValue) {
        kotlin.jvm.internal.m.f(serverValue, "serverValue");
        kotlin.jvm.internal.m.f(localValue, "localValue");
        HashMap map = new HashMap();
        int i11 = 0;
        List listW0 = oz.q.W0(serverValue, new String[]{";"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listW0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj2 = arrayList.get(i12);
            i12++;
            String str = (String) obj2;
            map.put(Integer.valueOf(Integer.parseInt((String) oz.q.W0(str, new String[]{":"}, 0, 6).get(0))), Long.valueOf(Long.parseLong((String) oz.q.W0(str, new String[]{":"}, 0, 6).get(1))));
        }
        HashMap map2 = new HashMap();
        List listW1 = oz.q.W0(localValue, new String[]{";"}, 0, 6);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : listW1) {
            if (((String) obj3).length() > 0) {
                arrayList2.add(obj3);
            }
        }
        int size2 = arrayList2.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj4 = arrayList2.get(i13);
            i13++;
            String str2 = (String) obj4;
            map2.put(Integer.valueOf(Integer.parseInt((String) oz.q.W0(str2, new String[]{":"}, 0, 6).get(0))), Long.valueOf(Long.parseLong((String) oz.q.W0(str2, new String[]{":"}, 0, 6).get(1))));
        }
        for (Object obj5 : map.keySet()) {
            kotlin.jvm.internal.m.e(obj5, "next(...)");
            int iIntValue = ((Number) obj5).intValue();
            if (map2.containsKey(Integer.valueOf(iIntValue))) {
                map2.remove(Integer.valueOf(iIntValue));
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        Set setKeySet = map.keySet();
        kotlin.jvm.internal.m.e(setKeySet, "<get-keys>(...)");
        String str3 = BuildConfig.VERSION_NAME;
        for (Object obj6 : ry.m.S0(setKeySet, new ua.e(9))) {
            int i14 = i11 + 1;
            if (i11 < 0) {
                ns.o.V();
                throw null;
            }
            Integer num = (Integer) obj6;
            str3 = ((Object) str3) + num + ":" + map.get(num);
            if (i11 < map.size() - 1) {
                str3 = ((Object) str3) + ";";
            }
            i11 = i14;
        }
        return str3;
    }

    public static final String b(String str, String str2) {
        if (str == null) {
            return str2 == null ? BuildConfig.VERSION_NAME : str2;
        }
        if (str.equals(str2)) {
            return str2;
        }
        HashMap mapL = ks.b.l(str);
        HashMap mapL2 = str2 != null ? ks.b.l(str2) : new HashMap();
        Iterator it = mapL.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            long jLongValue = ((Number) it.next()).longValue();
            Integer num = (Integer) mapL.get(Long.valueOf(jLongValue));
            int iIntValue = num != null ? num.intValue() : 0;
            if (mapL2.containsKey(Long.valueOf(jLongValue))) {
                Integer num2 = (Integer) mapL2.get(Long.valueOf(jLongValue));
                mapL.put(Long.valueOf(jLongValue), Integer.valueOf(Math.max(iIntValue, num2 != null ? num2.intValue() : 0)));
                mapL2.remove(Long.valueOf(jLongValue));
            }
        }
        if (!mapL2.isEmpty()) {
            Iterator it2 = mapL2.keySet().iterator();
            while (it2.hasNext()) {
                long jLongValue2 = ((Number) it2.next()).longValue();
                Long lValueOf = Long.valueOf(jLongValue2);
                Integer num3 = (Integer) mapL2.get(Long.valueOf(jLongValue2));
                mapL.put(lValueOf, Integer.valueOf(num3 != null ? num3.intValue() : 0));
            }
        }
        return ry.m.y0(x.f0(mapL), ";", null, null, new r(1), 30);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    public static final ProgressCollectionItem c(ProgressCollectionItem progressCollectionItem, ProgressCollectionItem serverProgress, boolean z11) {
        int i11;
        int i12;
        int i13;
        int i14;
        kotlin.jvm.internal.m.f(serverProgress, "serverProgress");
        if (z11 && serverProgress.getRestartTimestamp() > progressCollectionItem.getRestartTimestamp()) {
            return serverProgress;
        }
        String lan = progressCollectionItem.getLan();
        String main = progressCollectionItem.getMain();
        String main2 = serverProgress.getMain();
        if (kotlin.jvm.internal.m.a(main, main2)) {
            main2 = main;
        } else {
            int[] iArrG = {1, 1, 1};
            if (!oz.q.K0(main2)) {
                iArrG = g(main2);
            }
            int[] iArrG2 = {1, 1, 1};
            if (!oz.q.K0(main)) {
                iArrG2 = g(main);
            }
            int i15 = iArrG[0];
            int i16 = iArrG2[0];
            if (i15 == i16 ? (i11 = iArrG[1]) == (i12 = iArrG2[1]) ? (i13 = iArrG[2]) == (i14 = iArrG2[2]) || i13 <= i14 : i11 <= i12 : i15 <= i16 || iArrG[1] == 1 || iArrG[2] == 1) {
                main2 = main;
            }
        }
        return new ProgressCollectionItem(lan, main2, b(progressCollectionItem.getMainTT(), serverProgress.getMainTT()), b(progressCollectionItem.getLessonStars(), serverProgress.getLessonStars()), b(progressCollectionItem.getLessonExam(), serverProgress.getLessonExam()), Math.max(progressCollectionItem.getPronun(), serverProgress.getPronun()), Math.max(progressCollectionItem.getRestartTimestamp(), serverProgress.getRestartTimestamp()));
    }

    public static final String d(String localValue, String serverValue) {
        kotlin.jvm.internal.m.f(localValue, "localValue");
        kotlin.jvm.internal.m.f(serverValue, "serverValue");
        List listW0 = oz.q.W0(serverValue, new String[]{";"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listW0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        int iW = x.W(ry.n.W(arrayList, 10));
        if (iW < 16) {
            iW = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            List listW1 = oz.q.W0((String) obj2, new String[]{":"}, 0, 6);
            linkedHashMap.put((String) listW1.get(0), (String) listW1.get(1));
        }
        List listW2 = oz.q.W0(localValue, new String[]{";"}, 0, 6);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : listW2) {
            if (((String) obj3).length() > 0) {
                arrayList2.add(obj3);
            }
        }
        int iW2 = x.W(ry.n.W(arrayList2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iW2 >= 16 ? iW2 : 16);
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList2.get(i12);
            i12++;
            List listW3 = oz.q.W0((String) obj4, new String[]{":"}, 0, 6);
            linkedHashMap2.put((String) listW3.get(0), (String) listW3.get(1));
        }
        LinkedHashMap linkedHashMapK0 = x.k0(linkedHashMap);
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = (String) linkedHashMapK0.get(str);
            if (str3 == null) {
                linkedHashMapK0.put(str, str2);
            } else if (str2.compareTo(str3) > 0) {
                linkedHashMapK0.put(str, str2);
            }
        }
        return ry.m.y0(linkedHashMapK0.entrySet(), ";", null, null, new r(3), 30);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(String str, v0 v0Var, xy.c cVar) {
        s sVar;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i11 = sVar.f56321b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sVar.f56321b = i11 - Integer.MIN_VALUE;
            } else {
                sVar = new s(cVar);
            }
        } else {
            sVar = new s(cVar);
        }
        Object objM = sVar.f56320a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = sVar.f56321b;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objM);
            yz.f fVar = o0.f50940a;
            yz.e eVar = yz.e.f58387a;
            av.e eVar2 = new av.e(v0Var, str, null);
            sVar.f56321b = 1;
            objM = e0.M(eVar, eVar2, sVar);
            if (objM == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objM);
        }
        kotlin.jvm.internal.m.e(objM, "withContext(...)");
        return objM;
    }

    public static final UserInfo f(UserInfo userInfo, MeUserData serverData) {
        int i11;
        String str;
        kotlin.jvm.internal.m.f(userInfo, "userInfo");
        kotlin.jvm.internal.m.f(serverData, "serverData");
        String localValue = userInfo.getSkillMastery();
        String serverValue = serverData.getMeSkillsMastery();
        kotlin.jvm.internal.m.f(localValue, "localValue");
        kotlin.jvm.internal.m.f(serverValue, "serverValue");
        int i12 = 0;
        int i13 = 6;
        List listW0 = oz.q.W0(localValue, new String[]{";"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listW0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
        int size = arrayList.size();
        int i14 = 0;
        while (true) {
            i11 = 1;
            if (i14 >= size) {
                break;
            }
            Object obj2 = arrayList.get(i14);
            i14++;
            List listW1 = oz.q.W0((String) obj2, new String[]{":"}, i12, 6);
            arrayList2.add(new a1((String) listW1.get(i12), Float.parseFloat((String) listW1.get(1)), Integer.parseInt((String) listW1.get(2)), Integer.parseInt((String) listW1.get(3))));
            i12 = 0;
        }
        List listW2 = oz.q.W0(serverValue, new String[]{";"}, 0, 6);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listW2) {
            if (((String) obj3).length() > 0) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList(ry.n.W(arrayList3, 10));
        int size2 = arrayList3.size();
        int i15 = 0;
        while (i15 < size2) {
            Object obj4 = arrayList3.get(i15);
            i15++;
            List listW3 = oz.q.W0((String) obj4, new String[]{":"}, 0, i13);
            arrayList4.add(new a1((String) listW3.get(0), Float.parseFloat((String) listW3.get(i11)), Integer.parseInt((String) listW3.get(2)), Integer.parseInt((String) listW3.get(3))));
            i13 = 6;
            i11 = 1;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size3 = arrayList2.size();
        int i16 = 0;
        while (i16 < size3) {
            Object obj5 = arrayList2.get(i16);
            i16++;
            a1 a1Var = (a1) obj5;
            linkedHashMap.put(a1Var.f54175a, a1Var);
        }
        int i17 = 0;
        for (int size4 = arrayList4.size(); i17 < size4; size4 = size4) {
            Object obj6 = arrayList4.get(i17);
            i17++;
            a1 a1Var2 = (a1) obj6;
            String str2 = a1Var2.f54175a;
            a1 a1Var3 = (a1) linkedHashMap.get(str2);
            if (a1Var3 == null) {
                linkedHashMap.put(str2, a1Var2);
            } else {
                linkedHashMap.put(str2, new a1(str2, Math.max(a1Var3.f54176b, a1Var2.f54176b), Math.max(a1Var3.f54177c, a1Var2.f54177c), Math.max(a1Var3.f54178d, a1Var2.f54178d)));
            }
        }
        String strY0 = ry.m.y0(linkedHashMap.values(), ";", null, null, new r(0), 30);
        String strA = a(userInfo.getAchievementXPExpert(), serverData.getMeAchievementXPExpert());
        String strA2 = a(userInfo.getAchievementTopStudent(), serverData.getMeAchievementTopStudent());
        String strA3 = a(userInfo.getAchievementStreakHero(), serverData.getMeAchievementStreakHero());
        String serverValue2 = userInfo.getAchievementLeaderboard();
        String localValue2 = serverData.getMeAchievementLeaderboard();
        kotlin.jvm.internal.m.f(serverValue2, "serverValue");
        kotlin.jvm.internal.m.f(localValue2, "localValue");
        List listW4 = oz.q.W0(serverValue2, new String[]{";"}, 0, 6);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj7 : listW4) {
            if (((String) obj7).length() > 0) {
                arrayList5.add(obj7);
            }
        }
        ArrayList arrayList6 = new ArrayList(ry.n.W(arrayList5, 10));
        int size5 = arrayList5.size();
        int i18 = 0;
        while (true) {
            str = "_";
            if (i18 >= size5) {
                break;
            }
            Object obj8 = arrayList5.get(i18);
            i18++;
            List listW5 = oz.q.W0((String) obj8, new String[]{":"}, 0, 6);
            arrayList6.add(new t0((String) listW5.get(0), oz.q.W0((String) listW5.get(1), new String[]{"_"}, 0, 6), Long.parseLong((String) listW5.get(2))));
            strA = strA;
            strA3 = strA3;
        }
        String str3 = strA;
        String str4 = strA3;
        List listW6 = oz.q.W0(localValue2, new String[]{";"}, 0, 6);
        ArrayList arrayList7 = new ArrayList();
        for (Object obj9 : listW6) {
            if (((String) obj9).length() > 0) {
                arrayList7.add(obj9);
            }
        }
        ArrayList arrayList8 = new ArrayList(ry.n.W(arrayList7, 10));
        int size6 = arrayList7.size();
        int i19 = 0;
        while (i19 < size6) {
            Object obj10 = arrayList7.get(i19);
            i19++;
            List listW7 = oz.q.W0((String) obj10, new String[]{":"}, 0, 6);
            arrayList8.add(new t0((String) listW7.get(0), oz.q.W0((String) listW7.get(1), new String[]{str}, 0, 6), Long.parseLong((String) listW7.get(2))));
            str = str;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        int size7 = arrayList6.size();
        int i21 = 0;
        while (i21 < size7) {
            Object obj11 = arrayList6.get(i21);
            i21++;
            t0 t0Var = (t0) obj11;
            linkedHashMap2.put(t0Var.f54287a, t0Var);
        }
        int size8 = arrayList8.size();
        int i22 = 0;
        while (i22 < size8) {
            Object obj12 = arrayList8.get(i22);
            i22++;
            t0 t0Var2 = (t0) obj12;
            String str5 = t0Var2.f54287a;
            t0 t0Var3 = (t0) linkedHashMap2.get(str5);
            if (t0Var3 == null) {
                linkedHashMap2.put(str5, t0Var2);
            } else {
                linkedHashMap2.put(str5, new t0(str5, ry.m.j0(ry.m.H0(t0Var3.f54288b, t0Var2.f54288b)), Math.min(t0Var3.f54289c, t0Var2.f54289c)));
            }
        }
        String strY1 = ry.m.y0(linkedHashMap2.values(), ";", null, null, new r(2), 30);
        String strD = d(userInfo.getAchievementLanguages(), serverData.getMeAchievementLanguages());
        return UserInfo.copy$default(userInfo, null, serverData.getTotalXP(), serverData.getTotalGems(), serverData.getTotalStreakFreezer(), serverData.getTotalStreakSaver(), serverData.getTotalTime(), serverData.getLeaderboardWeekXP(), serverData.getLeaderboardEmojiStatus(), serverData.getLeaderboardLearnedTime(), strY0, strA2, str3, str4, strY1, strD, serverData.getAllFollowersCollection(), serverData.getAllFollowingsCollection(), 0, 0, 0, 0, 0, 0, null, serverData.getAnimatedEmojis(), 16646145, null);
    }

    public static final int[] g(String str) {
        Integer numT0;
        if (oz.q.K0(str)) {
            return new int[]{1, 1, 1};
        }
        List listW0 = oz.q.W0(str, new String[]{":"}, 0, 6);
        if (listW0.size() < 3) {
            return new int[]{1, 1, 1};
        }
        int[] iArr = new int[3];
        for (int i11 = 0; i11 < 3; i11++) {
            oz.l lVarB = f56322a.b((String) listW0.get(i11));
            if (lVarB == null || (numT0 = oz.x.t0(lVarB.c())) == null) {
                return new int[]{1, 1, 1};
            }
            iArr[i11] = numT0.intValue();
        }
        return iArr;
    }
}
