package com.lingodeer.network.model;

import bw.ORXQ.ADSb;
import com.bumptech.glide.e;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lingodeer.data.model.BookMarkCollectionItem;
import com.lingodeer.data.model.GemCollectionItem;
import com.lingodeer.data.model.LearnTimeCollectionItem;
import com.lingodeer.data.model.MeUserData;
import com.lingodeer.data.model.ProgressCollectionItem;
import com.lingodeer.data.model.ReviewVisibilityMode;
import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.StreakCollectionItem;
import com.lingodeer.data.model.SubCourseProgressCollectionItem;
import com.lingodeer.data.model.TaskLessonCollectionItem;
import com.lingodeer.data.model.TaskUnitCollectionItem;
import com.lingodeer.data.model.TaskUnitLessonCollection;
import com.lingodeer.data.model.XPCollectionItem;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.m;
import ns.o;
import oz.q;
import oz.x;
import ry.n;
import sz.xej.iFLeRCXvYCGdPW;
import wt.r;
import wt.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConvertUtilsKt {
    public static final List<BookMarkCollectionItem> toBookMarkCollectionItems(BookMarkResponse bookMarkResponse) {
        m.f(bookMarkResponse, "<this>");
        Set<String> setKeySet = bookMarkResponse.getAll_bookmark_collection().keySet();
        m.e(setKeySet, "keySet(...)");
        Set<String> set = setKeySet;
        ArrayList arrayList = new ArrayList(n.W(set, 10));
        for (String str : set) {
            JsonObject asJsonObject = bookMarkResponse.getAll_bookmark_collection().get(str).getAsJsonObject();
            m.c(str);
            String asString = asJsonObject.get("lan").getAsString();
            m.e(asString, "getAsString(...)");
            int asInt = asJsonObject.get("isFav").getAsInt();
            String asString2 = asJsonObject.get("value").getAsString();
            m.e(asString2, "getAsString(...)");
            long asLong = asJsonObject.get("time").getAsLong();
            JsonElement jsonElement = asJsonObject.get("folderid");
            arrayList.add(new BookMarkCollectionItem(str, asString, asInt, asString2, asLong, jsonElement != null ? jsonElement.getAsInt() : 0));
        }
        return arrayList;
    }

    public static final MeUserData toMeUserData(MeUserDataResponse meUserDataResponse) {
        m.f(meUserDataResponse, "<this>");
        Set<String> setKeySet = meUserDataResponse.getRecent_xp_collection().keySet();
        m.e(setKeySet, "keySet(...)");
        Set<String> set = setKeySet;
        ArrayList arrayList = new ArrayList(n.W(set, 10));
        for (String str : set) {
            m.c(str);
            arrayList.add(new XPCollectionItem(str, meUserDataResponse.getRecent_xp_collection().get(str).getAsJsonObject().get("xp").getAsInt(), meUserDataResponse.getRecent_xp_collection().get(str).getAsJsonObject().get("bsxp").getAsInt()));
        }
        Set<String> setKeySet2 = meUserDataResponse.getRecent_time_collection().keySet();
        m.e(setKeySet2, "keySet(...)");
        Set<String> set2 = setKeySet2;
        ArrayList arrayList2 = new ArrayList(n.W(set2, 10));
        for (String str2 : set2) {
            m.c(str2);
            arrayList2.add(new LearnTimeCollectionItem(str2, meUserDataResponse.getRecent_time_collection().get(str2).getAsJsonObject().get("seconds").getAsInt(), meUserDataResponse.getRecent_time_collection().get(str2).getAsJsonObject().get("bstime").getAsInt()));
        }
        Set<String> setKeySet3 = meUserDataResponse.getRecent_gems_collection().keySet();
        m.e(setKeySet3, "keySet(...)");
        Set<String> set3 = setKeySet3;
        ArrayList arrayList3 = new ArrayList(n.W(set3, 10));
        for (String str3 : set3) {
            m.c(str3);
            String asString = meUserDataResponse.getRecent_gems_collection().get(str3).getAsJsonObject().get("type").getAsString();
            m.e(asString, "getAsString(...)");
            arrayList3.add(new GemCollectionItem(str3, asString, meUserDataResponse.getRecent_gems_collection().get(str3).getAsJsonObject().get("amount").getAsInt()));
        }
        Set<String> setKeySet4 = meUserDataResponse.getRecent_streak_collection().keySet();
        m.e(setKeySet4, "keySet(...)");
        Set<String> set4 = setKeySet4;
        ArrayList arrayList4 = new ArrayList(n.W(set4, 10));
        for (String str4 : set4) {
            m.c(str4);
            String asString2 = meUserDataResponse.getRecent_streak_collection().get(str4).getAsJsonObject().get("type").getAsString();
            m.e(asString2, "getAsString(...)");
            arrayList4.add(new StreakCollectionItem(str4, asString2));
        }
        Set<String> setKeySet5 = meUserDataResponse.getAll_progress_collection().keySet();
        m.e(setKeySet5, "keySet(...)");
        Set<String> set5 = setKeySet5;
        ArrayList arrayList5 = new ArrayList(n.W(set5, 10));
        Iterator it = set5.iterator();
        while (it.hasNext()) {
            String str5 = (String) it.next();
            JsonObject asJsonObject = meUserDataResponse.getAll_progress_collection().get(str5).getAsJsonObject();
            JsonElement jsonElement = asJsonObject.get("restart_timestamp");
            m.c(str5);
            String asString3 = asJsonObject.get("main").getAsString();
            m.e(asString3, "getAsString(...)");
            String asString4 = asJsonObject.get("main_tt").getAsString();
            m.e(asString4, "getAsString(...)");
            String asString5 = asJsonObject.get("lesson_stars").getAsString();
            m.e(asString5, "getAsString(...)");
            String asString6 = asJsonObject.get("lesson_exam").getAsString();
            m.e(asString6, "getAsString(...)");
            Iterator it2 = it;
            arrayList5.add(new ProgressCollectionItem(str5, asString3, asString4, asString5, asString6, asJsonObject.get("pronun").getAsInt(), (jsonElement == null || jsonElement.isJsonNull()) ? 0L : jsonElement.getAsLong()));
            it = it2;
        }
        return new MeUserData(meUserDataResponse.getMax_streak(), meUserDataResponse.getTotal_xp(), meUserDataResponse.getTotal_time(), meUserDataResponse.getTotal_gems(), meUserDataResponse.getTotal_streaksaver(), meUserDataResponse.getTotal_streakfreezer(), meUserDataResponse.getMe_skills_mastery(), meUserDataResponse.getMe_achiev_topstudent(), meUserDataResponse.getMe_achiev_xpexpert(), meUserDataResponse.getMe_achiev_streakhero(), meUserDataResponse.getMe_achiev_leaderboard(), meUserDataResponse.getMe_achiev_languages(), meUserDataResponse.getLeaderboard_week_xp(), meUserDataResponse.getLeaderboard_emoji_status(), meUserDataResponse.getLeaderboard_learned_time(), meUserDataResponse.getUser_image(), meUserDataResponse.getUser_nickname(), meUserDataResponse.getBilling_page_views(), meUserDataResponse.getNews_feed_read_ids(), meUserDataResponse.getSetting_learning_lan(), meUserDataResponse.getSetting_uilan(), meUserDataResponse.getSetting_reminders(), meUserDataResponse.getSetting_soundeffect(), meUserDataResponse.getSetting_show_leaderboard(), meUserDataResponse.getM_user_joined(), meUserDataResponse.getM_buy_coffee(), meUserDataResponse.getM_review_data_tranfered(), arrayList, arrayList2, arrayList3, arrayList4, arrayList5, meUserDataResponse.getAll_followings(), meUserDataResponse.getAll_followers(), meUserDataResponse.getM_animated_emojis());
    }

    public static final List<StreakCollectionItem> toStreakCollectionItems(StreakFreezeApplyResponse streakFreezeApplyResponse) {
        m.f(streakFreezeApplyResponse, "<this>");
        Set<String> setKeySet = streakFreezeApplyResponse.getAll_streak_collection().keySet();
        m.e(setKeySet, "keySet(...)");
        Set<String> set = setKeySet;
        ArrayList arrayList = new ArrayList(n.W(set, 10));
        for (String str : set) {
            m.c(str);
            String asString = streakFreezeApplyResponse.getAll_streak_collection().get(str).getAsJsonObject().get("type").getAsString();
            m.e(asString, "getAsString(...)");
            arrayList.add(new StreakCollectionItem(str, asString));
        }
        return arrayList;
    }

    public static final List<SubCourseProgressCollectionItem> toSubCourseProgressCollectionItems(SubCourseProgressResponse subCourseProgressResponse) {
        m.f(subCourseProgressResponse, "<this>");
        Set<String> setKeySet = subCourseProgressResponse.getSubcourse_progress().keySet();
        m.e(setKeySet, "keySet(...)");
        Set<String> set = setKeySet;
        ArrayList arrayList = new ArrayList(n.W(set, 10));
        for (String str : set) {
            JsonObject asJsonObject = subCourseProgressResponse.getSubcourse_progress().get(str).getAsJsonObject();
            m.c(str);
            String asString = asJsonObject.get("progress").getAsString();
            m.e(asString, "getAsString(...)");
            arrayList.add(new SubCourseProgressCollectionItem(str, asString, asJsonObject.get("time").getAsLong()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0132  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final SRSStatus toSRSStatus(ServerReviewDataItem serverReviewDataItem) {
        List listL;
        Object objL;
        int i11;
        Object objL2;
        Object objL3;
        Object objL4;
        Long l9;
        List listL2;
        Object obj;
        Object next;
        Object obj2;
        String str;
        Object objL5;
        Object objL6;
        Object objL7;
        Object objL8;
        Object objL9;
        Object objL10;
        Object objL11;
        Object objL12;
        Object objL13;
        ReviewVisibilityMode reviewVisibilityModeFromValue;
        Long l11 = 0L;
        Integer num = 0;
        m.f(serverReviewDataItem, "<this>");
        String data_key = serverReviewDataItem.getData_key();
        if (q.K0(serverReviewDataItem.getPractice_meta_data())) {
            listL = o.L("0", "0", "0", "-1");
        } else {
            List listW0 = q.W0(serverReviewDataItem.getPractice_meta_data(), new String[]{":"}, 0, 6);
            listL = listW0.size() >= 4 ? o.L(listW0.get(0), listW0.get(1), listW0.get(2), listW0.get(3)) : listW0.size() == 3 ? o.L(listW0.get(0), listW0.get(1), listW0.get(2), "-1") : o.L("0", "0", "0", "-1");
        }
        String str2 = (String) listL.get(0);
        String str3 = (String) listL.get(1);
        String str4 = (String) listL.get(2);
        String str5 = (String) listL.get(3);
        List listW1 = q.W0(data_key, new String[]{"_"}, 0, 6);
        if (listW1.size() < 3) {
            throw new IllegalArgumentException("Invalid data_key format: ".concat(data_key));
        }
        try {
            objL = Long.valueOf(Long.parseLong((String) listW1.get(2)));
        } catch (Throwable th2) {
            objL = e.l(th2);
        }
        if (qy.o.a(objL) != null) {
            objL = l11;
        }
        long jLongValue = ((Number) objL).longValue();
        String str6 = (String) listW1.get(1);
        int iHashCode = str6.hashCode();
        if (iHashCode != 99) {
            if (iHashCode != 115) {
                if (iHashCode != 119) {
                    if (iHashCode != 3169) {
                        if (iHashCode == 3708 && str6.equals("tp")) {
                            i11 = 3;
                        } else {
                            i11 = -1;
                        }
                    } else if (str6.equals("cd")) {
                        i11 = 4;
                    } else {
                        i11 = -1;
                    }
                } else if (str6.equals("w")) {
                    i11 = 0;
                } else {
                    i11 = -1;
                }
            } else if (str6.equals("s")) {
                i11 = 1;
            } else {
                i11 = -1;
            }
        } else if (str6.equals("c")) {
            i11 = 2;
        } else {
            i11 = -1;
        }
        String data_lan = serverReviewDataItem.getData_lan();
        String data_type = serverReviewDataItem.getData_type();
        try {
            objL2 = Long.valueOf(Long.parseLong(str5));
        } catch (Throwable th3) {
            objL2 = e.l(th3);
        }
        if (qy.o.a(objL2) != null) {
            objL2 = -1L;
        }
        long jLongValue2 = ((Number) objL2).longValue();
        try {
            objL3 = Long.valueOf(Long.parseLong(str2));
        } catch (Throwable th4) {
            objL3 = e.l(th4);
        }
        if (qy.o.a(objL3) != null) {
            objL3 = l11;
        }
        long jLongValue3 = ((Number) objL3).longValue();
        try {
            wt.n nVar = wt.o.Companion;
            int i12 = Integer.parseInt(str3);
            nVar.getClass();
            objL4 = wt.n.a(i12);
        } catch (Throwable th5) {
            objL4 = e.l(th5);
        }
        if (qy.o.a(objL4) != null) {
            objL4 = wt.o.CORRECT;
        }
        wt.o oVar = (wt.o) objL4;
        boolean zA = m.a(str4, "1");
        boolean zK0 = q.K0(serverReviewDataItem.getSrs_meta_data());
        Object obj3 = BuildConfig.VERSION_NAME;
        if (zK0) {
            l9 = l11;
            num = num;
            listL2 = o.L("0", "0", "0", "0", "0", "0", "0", "0", "0", BuildConfig.VERSION_NAME);
        } else {
            try {
                List listW2 = q.W0(serverReviewDataItem.getSrs_meta_data(), new String[]{":"}, 0, 6);
                try {
                    if (listW2.size() >= 4) {
                        String str7 = (String) listW2.get(0);
                        String str8 = (String) listW2.get(1);
                        String str9 = (String) listW2.get(2);
                        String str10 = (String) listW2.get(3);
                        Iterator it = q.W0(str10, new String[]{"#"}, 0, 6).iterator();
                        while (true) {
                            obj = null;
                            if (!it.hasNext()) {
                                l9 = l11;
                                next = null;
                                break;
                            }
                            next = it.next();
                            Iterator it2 = it;
                            l9 = l11;
                            try {
                                if (x.s0((String) next, "hs-", false)) {
                                    break;
                                }
                                it = it2;
                                l11 = l9;
                            } catch (Exception unused) {
                                num = num;
                                listL2 = o.L("0", "0", "0", "0", iFLeRCXvYCGdPW.XWNSAYLRNLK, "0", "0", "0", "0", BuildConfig.VERSION_NAME);
                            }
                        }
                        String str11 = (String) next;
                        List listU0 = str11 != null ? ry.m.U0(ry.m.k0(q.W0(str11, new String[]{"-"}, 0, 6), 1), 2) : o.L("0", "0");
                        Iterator it3 = q.W0(str10, new String[]{"#"}, 0, 6).iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            Object next2 = it3.next();
                            Iterator it4 = it3;
                            if (x.s0((String) next2, "sm2-", false)) {
                                obj2 = next2;
                                break;
                            }
                            it3 = it4;
                        }
                        String str12 = (String) obj2;
                        List listU1 = str12 != null ? ry.m.U0(ry.m.k0(q.W0(str12, new String[]{"-"}, 0, 6), 1), 4) : o.L("0", "0", "0", "0");
                        for (Object obj4 : q.W0(str10, new String[]{"#"}, 0, 6)) {
                            if (x.s0((String) obj4, "rvm-", false)) {
                                obj = obj4;
                                break;
                            }
                        }
                        String str13 = (String) obj;
                        if (str13 == null || (str = (String) ry.m.t0(1, q.W0(str13, new String[]{r1}, 0, 6))) == null) {
                            str = BuildConfig.VERSION_NAME;
                        }
                        listL2 = ry.m.H0(ry.m.H0(ry.m.H0(o.L(str7, str8, str9), listU0), listU1), o.K(str));
                    } else {
                        l9 = l11;
                        num = num;
                        listL2 = o.L("0", "0", "0", "0", "0", "0", "0", "0", "0", BuildConfig.VERSION_NAME);
                    }
                } catch (Exception unused2) {
                    listL2 = o.L("0", "0", "0", "0", iFLeRCXvYCGdPW.XWNSAYLRNLK, "0", "0", "0", "0", BuildConfig.VERSION_NAME);
                }
            } catch (Exception unused3) {
                l9 = l11;
            }
        }
        String str14 = (String) (listL2.size() > 0 ? listL2.get(0) : "0");
        String str15 = (String) (1 < listL2.size() ? listL2.get(1) : "0");
        String str16 = (String) (2 < listL2.size() ? listL2.get(2) : "0");
        String str17 = (String) (3 < listL2.size() ? listL2.get(3) : "0");
        String str18 = (String) (4 < listL2.size() ? listL2.get(4) : "0");
        String str19 = (String) (5 < listL2.size() ? listL2.get(5) : "0");
        String str20 = (String) (6 < listL2.size() ? listL2.get(6) : "2.5");
        String str21 = (String) (7 < listL2.size() ? listL2.get(7) : "0");
        String str22 = (String) (8 < listL2.size() ? listL2.get(8) : "0");
        if (9 < listL2.size()) {
            obj3 = listL2.get(9);
        }
        String str23 = (String) obj3;
        try {
            objL5 = Long.valueOf(Long.parseLong(str14));
        } catch (Throwable th6) {
            objL5 = e.l(th6);
        }
        if (qy.o.a(objL5) != null) {
            objL5 = l9;
        }
        long jLongValue4 = ((Number) objL5).longValue();
        try {
            objL6 = Long.valueOf(Long.parseLong(str15));
        } catch (Throwable th7) {
            objL6 = e.l(th7);
        }
        if (qy.o.a(objL6) != null) {
            objL6 = l9;
        }
        long jLongValue5 = ((Number) objL6).longValue();
        try {
            objL7 = Integer.valueOf(Integer.parseInt(str17));
        } catch (Throwable th8) {
            objL7 = e.l(th8);
        }
        if (qy.o.a(objL7) != null) {
            objL7 = num;
        }
        int iIntValue = ((Number) objL7).intValue();
        try {
            objL8 = Integer.valueOf(Integer.parseInt(str18));
        } catch (Throwable th9) {
            objL8 = e.l(th9);
        }
        if (qy.o.a(objL8) != null) {
            objL8 = num;
        }
        int iIntValue2 = ((Number) objL8).intValue();
        try {
            r rVar = s.Companion;
            int i13 = Integer.parseInt(str16);
            rVar.getClass();
            objL9 = r.a(i13);
        } catch (Throwable th10) {
            objL9 = e.l(th10);
        }
        if (qy.o.a(objL9) != null) {
            objL9 = s.NEW;
        }
        s sVar = (s) objL9;
        try {
            objL10 = Integer.valueOf(Integer.parseInt(str19));
        } catch (Throwable th11) {
            objL10 = e.l(th11);
        }
        if (qy.o.a(objL10) != null) {
            objL10 = num;
        }
        int iIntValue3 = ((Number) objL10).intValue();
        try {
            objL11 = Float.valueOf(Float.parseFloat(str20));
        } catch (Throwable th12) {
            objL11 = e.l(th12);
        }
        if (qy.o.a(objL11) != null) {
            objL11 = Float.valueOf(2.5f);
        }
        float fFloatValue = ((Number) objL11).floatValue();
        try {
            objL12 = Long.valueOf(Long.parseLong(str21));
        } catch (Throwable th13) {
            objL12 = e.l(th13);
        }
        if (qy.o.a(objL12) != null) {
            objL12 = l9;
        }
        long jLongValue6 = ((Number) objL12).longValue();
        try {
            objL13 = Integer.valueOf(Integer.parseInt(str22));
        } catch (Throwable th14) {
            objL13 = e.l(th14);
        }
        if (qy.o.a(objL13) != null) {
            objL13 = num;
        }
        int iIntValue4 = ((Number) objL13).intValue();
        Integer numT0 = x.t0(str23);
        if (numT0 == null || (reviewVisibilityModeFromValue = ReviewVisibilityMode.Companion.fromValue(numT0.intValue())) == null) {
            reviewVisibilityModeFromValue = ReviewVisibilityMode.DEFAULT;
        }
        return new SRSStatus(data_key, jLongValue2, jLongValue, i11, data_lan, data_type, jLongValue3, oVar, zA, sVar, jLongValue4, jLongValue5, jLongValue6, fFloatValue, iIntValue3, iIntValue4, iIntValue, iIntValue2, serverReviewDataItem.getUpdate_timestamp(), false, reviewVisibilityModeFromValue);
    }

    public static final TaskUnitLessonCollection toTaskUnitLessonCollection(TaskUnitLessonResponse taskUnitLessonResponse) {
        m.f(taskUnitLessonResponse, "<this>");
        Set<String> setKeySet = taskUnitLessonResponse.getTask_lesson_collection().keySet();
        m.e(setKeySet, "keySet(...)");
        Set<String> set = setKeySet;
        ArrayList arrayList = new ArrayList(n.W(set, 10));
        for (String str : set) {
            m.c(str);
            String asString = taskUnitLessonResponse.getTask_lesson_collection().get(str).getAsJsonObject().get("lan").getAsString();
            m.e(asString, "getAsString(...)");
            arrayList.add(new TaskLessonCollectionItem(str, asString, taskUnitLessonResponse.getTask_lesson_collection().get(str).getAsJsonObject().get("practice_listening").getAsBoolean(), taskUnitLessonResponse.getTask_lesson_collection().get(str).getAsJsonObject().get("practice_speaking").getAsBoolean(), taskUnitLessonResponse.getTask_lesson_collection().get(str).getAsJsonObject().get("practice_spelling").getAsBoolean(), taskUnitLessonResponse.getTask_lesson_collection().get(str).getAsJsonObject().get("practice_comprehensive").getAsBoolean(), taskUnitLessonResponse.getTask_lesson_collection().get(str).getAsJsonObject().get("time").getAsLong()));
        }
        Set<String> setKeySet2 = taskUnitLessonResponse.getTask_unit_collection().keySet();
        m.e(setKeySet2, "keySet(...)");
        Set<String> set2 = setKeySet2;
        ArrayList arrayList2 = new ArrayList(n.W(set2, 10));
        for (String str2 : set2) {
            m.c(str2);
            String asString2 = taskUnitLessonResponse.getTask_unit_collection().get(str2).getAsJsonObject().get("lan").getAsString();
            m.e(asString2, "getAsString(...)");
            arrayList2.add(new TaskUnitCollectionItem(str2, asString2, taskUnitLessonResponse.getTask_unit_collection().get(str2).getAsJsonObject().get("cur_enter_lesson_index").getAsInt(), taskUnitLessonResponse.getTask_unit_collection().get(str2).getAsJsonObject().get("story_reading").getAsBoolean(), taskUnitLessonResponse.getTask_unit_collection().get(str2).getAsJsonObject().get("story_speaking").getAsBoolean(), taskUnitLessonResponse.getTask_unit_collection().get(str2).getAsJsonObject().get("tips_reading").getAsBoolean(), taskUnitLessonResponse.getTask_unit_collection().get(str2).getAsJsonObject().get("dialog_warm_up").getAsBoolean(), taskUnitLessonResponse.getTask_unit_collection().get(str2).getAsJsonObject().get(ADSb.UMrRJuerxXeyMI).getAsBoolean(), taskUnitLessonResponse.getTask_unit_collection().get(str2).getAsJsonObject().get("dialog_speaking").getAsBoolean(), taskUnitLessonResponse.getTask_unit_collection().get(str2).getAsJsonObject().get("time").getAsLong()));
        }
        return new TaskUnitLessonCollection(arrayList2, arrayList);
    }
}
