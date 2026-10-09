package com.lingodeer.data.model;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.android.material.datepicker.d;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import ep.a;
import hh.p0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class UserInfo {
    private final String achievementLanguages;
    private final String achievementLeaderboard;
    private final String achievementStreakHero;
    private final String achievementTopStudent;
    private final String achievementXPExpert;
    private final List<String> allFollowers;
    private final List<String> allFollowings;
    private final String animatedEmojis;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22326id;
    private final int leaderboardEmojiStatus;
    private final long leaderboardLearnedTime;
    private final long leaderboardWeekXP;
    private final List<DailyLearnHistory> learnHistories;
    private final int level;
    private final String skillMastery;
    private final int streakFreezer;
    private final int streakSaver;
    private final int todayXP;
    private final int totalDayStreak;
    private final int totalFinishedLesson;
    private final int totalGems;
    private final int totalKnowledgePoints;
    private final int totalTime;
    private final int totalXP;
    private final int weeklyXP;

    public UserInfo(String id2, int i11, int i12, int i13, int i14, int i15, long j11, int i16, long j12, String skillMastery, String achievementTopStudent, String achievementXPExpert, String achievementStreakHero, String achievementLeaderboard, String achievementLanguages, List<String> allFollowers, List<String> allFollowings, int i17, int i18, int i19, int i21, int i22, int i23, List<DailyLearnHistory> learnHistories, String animatedEmojis) {
        m.f(id2, "id");
        m.f(skillMastery, "skillMastery");
        m.f(achievementTopStudent, "achievementTopStudent");
        m.f(achievementXPExpert, "achievementXPExpert");
        m.f(achievementStreakHero, "achievementStreakHero");
        m.f(achievementLeaderboard, "achievementLeaderboard");
        m.f(achievementLanguages, "achievementLanguages");
        m.f(allFollowers, "allFollowers");
        m.f(allFollowings, "allFollowings");
        m.f(learnHistories, "learnHistories");
        m.f(animatedEmojis, "animatedEmojis");
        this.f22326id = id2;
        this.totalXP = i11;
        this.totalGems = i12;
        this.streakFreezer = i13;
        this.streakSaver = i14;
        this.totalTime = i15;
        this.leaderboardWeekXP = j11;
        this.leaderboardEmojiStatus = i16;
        this.leaderboardLearnedTime = j12;
        this.skillMastery = skillMastery;
        this.achievementTopStudent = achievementTopStudent;
        this.achievementXPExpert = achievementXPExpert;
        this.achievementStreakHero = achievementStreakHero;
        this.achievementLeaderboard = achievementLeaderboard;
        this.achievementLanguages = achievementLanguages;
        this.allFollowers = allFollowers;
        this.allFollowings = allFollowings;
        this.todayXP = i17;
        this.weeklyXP = i18;
        this.level = i19;
        this.totalKnowledgePoints = i21;
        this.totalDayStreak = i22;
        this.totalFinishedLesson = i23;
        this.learnHistories = learnHistories;
        this.animatedEmojis = animatedEmojis;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, String str, int i11, int i12, int i13, int i14, int i15, long j11, int i16, long j12, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, int i17, int i18, int i19, int i21, int i22, int i23, List list3, String str8, int i24, Object obj) {
        String str9;
        List list4;
        String str10 = (i24 & 1) != 0 ? userInfo.f22326id : str;
        int i25 = (i24 & 2) != 0 ? userInfo.totalXP : i11;
        int i26 = (i24 & 4) != 0 ? userInfo.totalGems : i12;
        int i27 = (i24 & 8) != 0 ? userInfo.streakFreezer : i13;
        int i28 = (i24 & 16) != 0 ? userInfo.streakSaver : i14;
        int i29 = (i24 & 32) != 0 ? userInfo.totalTime : i15;
        long j13 = (i24 & 64) != 0 ? userInfo.leaderboardWeekXP : j11;
        int i30 = (i24 & 128) != 0 ? userInfo.leaderboardEmojiStatus : i16;
        long j14 = (i24 & 256) != 0 ? userInfo.leaderboardLearnedTime : j12;
        String str11 = (i24 & 512) != 0 ? userInfo.skillMastery : str2;
        String str12 = (i24 & 1024) != 0 ? userInfo.achievementTopStudent : str3;
        String str13 = (i24 & 2048) != 0 ? userInfo.achievementXPExpert : str4;
        String str14 = str10;
        String str15 = (i24 & 4096) != 0 ? userInfo.achievementStreakHero : str5;
        String str16 = (i24 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? userInfo.achievementLeaderboard : str6;
        String str17 = (i24 & 16384) != 0 ? userInfo.achievementLanguages : str7;
        List list5 = (i24 & 32768) != 0 ? userInfo.allFollowers : list;
        List list6 = (i24 & 65536) != 0 ? userInfo.allFollowings : list2;
        int i31 = (i24 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? userInfo.todayXP : i17;
        int i32 = (i24 & 262144) != 0 ? userInfo.weeklyXP : i18;
        int i33 = (i24 & 524288) != 0 ? userInfo.level : i19;
        int i34 = (i24 & 1048576) != 0 ? userInfo.totalKnowledgePoints : i21;
        int i35 = (i24 & 2097152) != 0 ? userInfo.totalDayStreak : i22;
        int i36 = (i24 & 4194304) != 0 ? userInfo.totalFinishedLesson : i23;
        List list7 = (i24 & 8388608) != 0 ? userInfo.learnHistories : list3;
        if ((i24 & 16777216) != 0) {
            list4 = list7;
            str9 = userInfo.animatedEmojis;
        } else {
            str9 = str8;
            list4 = list7;
        }
        return userInfo.copy(str14, i25, i26, i27, i28, i29, j13, i30, j14, str11, str12, str13, str15, str16, str17, list5, list6, i31, i32, i33, i34, i35, i36, list4, str9);
    }

    public final String component1() {
        return this.f22326id;
    }

    public final String component10() {
        return this.skillMastery;
    }

    public final String component11() {
        return this.achievementTopStudent;
    }

    public final String component12() {
        return this.achievementXPExpert;
    }

    public final String component13() {
        return this.achievementStreakHero;
    }

    public final String component14() {
        return this.achievementLeaderboard;
    }

    public final String component15() {
        return this.achievementLanguages;
    }

    public final List<String> component16() {
        return this.allFollowers;
    }

    public final List<String> component17() {
        return this.allFollowings;
    }

    public final int component18() {
        return this.todayXP;
    }

    public final int component19() {
        return this.weeklyXP;
    }

    public final int component2() {
        return this.totalXP;
    }

    public final int component20() {
        return this.level;
    }

    public final int component21() {
        return this.totalKnowledgePoints;
    }

    public final int component22() {
        return this.totalDayStreak;
    }

    public final int component23() {
        return this.totalFinishedLesson;
    }

    public final List<DailyLearnHistory> component24() {
        return this.learnHistories;
    }

    public final String component25() {
        return this.animatedEmojis;
    }

    public final int component3() {
        return this.totalGems;
    }

    public final int component4() {
        return this.streakFreezer;
    }

    public final int component5() {
        return this.streakSaver;
    }

    public final int component6() {
        return this.totalTime;
    }

    public final long component7() {
        return this.leaderboardWeekXP;
    }

    public final int component8() {
        return this.leaderboardEmojiStatus;
    }

    public final long component9() {
        return this.leaderboardLearnedTime;
    }

    public final UserInfo copy(String id2, int i11, int i12, int i13, int i14, int i15, long j11, int i16, long j12, String skillMastery, String achievementTopStudent, String achievementXPExpert, String achievementStreakHero, String achievementLeaderboard, String achievementLanguages, List<String> allFollowers, List<String> allFollowings, int i17, int i18, int i19, int i21, int i22, int i23, List<DailyLearnHistory> learnHistories, String animatedEmojis) {
        m.f(id2, "id");
        m.f(skillMastery, "skillMastery");
        m.f(achievementTopStudent, "achievementTopStudent");
        m.f(achievementXPExpert, "achievementXPExpert");
        m.f(achievementStreakHero, "achievementStreakHero");
        m.f(achievementLeaderboard, "achievementLeaderboard");
        m.f(achievementLanguages, "achievementLanguages");
        m.f(allFollowers, "allFollowers");
        m.f(allFollowings, "allFollowings");
        m.f(learnHistories, "learnHistories");
        m.f(animatedEmojis, "animatedEmojis");
        return new UserInfo(id2, i11, i12, i13, i14, i15, j11, i16, j12, skillMastery, achievementTopStudent, achievementXPExpert, achievementStreakHero, achievementLeaderboard, achievementLanguages, allFollowers, allFollowings, i17, i18, i19, i21, i22, i23, learnHistories, animatedEmojis);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) obj;
        return m.a(this.f22326id, userInfo.f22326id) && this.totalXP == userInfo.totalXP && this.totalGems == userInfo.totalGems && this.streakFreezer == userInfo.streakFreezer && this.streakSaver == userInfo.streakSaver && this.totalTime == userInfo.totalTime && this.leaderboardWeekXP == userInfo.leaderboardWeekXP && this.leaderboardEmojiStatus == userInfo.leaderboardEmojiStatus && this.leaderboardLearnedTime == userInfo.leaderboardLearnedTime && m.a(this.skillMastery, userInfo.skillMastery) && m.a(this.achievementTopStudent, userInfo.achievementTopStudent) && m.a(this.achievementXPExpert, userInfo.achievementXPExpert) && m.a(this.achievementStreakHero, userInfo.achievementStreakHero) && m.a(this.achievementLeaderboard, userInfo.achievementLeaderboard) && m.a(this.achievementLanguages, userInfo.achievementLanguages) && m.a(this.allFollowers, userInfo.allFollowers) && m.a(this.allFollowings, userInfo.allFollowings) && this.todayXP == userInfo.todayXP && this.weeklyXP == userInfo.weeklyXP && this.level == userInfo.level && this.totalKnowledgePoints == userInfo.totalKnowledgePoints && this.totalDayStreak == userInfo.totalDayStreak && this.totalFinishedLesson == userInfo.totalFinishedLesson && m.a(this.learnHistories, userInfo.learnHistories) && m.a(this.animatedEmojis, userInfo.animatedEmojis);
    }

    public final String getAchievementLanguages() {
        return this.achievementLanguages;
    }

    public final String getAchievementLeaderboard() {
        return this.achievementLeaderboard;
    }

    public final String getAchievementStreakHero() {
        return this.achievementStreakHero;
    }

    public final String getAchievementTopStudent() {
        return this.achievementTopStudent;
    }

    public final String getAchievementXPExpert() {
        return this.achievementXPExpert;
    }

    public final List<String> getAllFollowers() {
        return this.allFollowers;
    }

    public final List<String> getAllFollowings() {
        return this.allFollowings;
    }

    public final String getAnimatedEmojis() {
        return this.animatedEmojis;
    }

    public final String getId() {
        return this.f22326id;
    }

    public final int getLeaderboardEmojiStatus() {
        return this.leaderboardEmojiStatus;
    }

    public final long getLeaderboardLearnedTime() {
        return this.leaderboardLearnedTime;
    }

    public final long getLeaderboardWeekXP() {
        return this.leaderboardWeekXP;
    }

    public final List<DailyLearnHistory> getLearnHistories() {
        return this.learnHistories;
    }

    public final int getLevel() {
        return this.level;
    }

    public final String getSkillMastery() {
        return this.skillMastery;
    }

    public final int getStreakFreezer() {
        return this.streakFreezer;
    }

    public final int getStreakSaver() {
        return this.streakSaver;
    }

    public final int getTodayXP() {
        return this.todayXP;
    }

    public final int getTotalDayStreak() {
        return this.totalDayStreak;
    }

    public final int getTotalFinishedLesson() {
        return this.totalFinishedLesson;
    }

    public final int getTotalGems() {
        return this.totalGems;
    }

    public final int getTotalKnowledgePoints() {
        return this.totalKnowledgePoints;
    }

    public final int getTotalTime() {
        return this.totalTime;
    }

    public final int getTotalXP() {
        return this.totalXP;
    }

    public final int getWeeklyXP() {
        return this.weeklyXP;
    }

    public int hashCode() {
        return this.animatedEmojis.hashCode() + p0.b(e.b(this.totalFinishedLesson, e.b(this.totalDayStreak, e.b(this.totalKnowledgePoints, e.b(this.level, e.b(this.weeklyXP, e.b(this.todayXP, p0.b(p0.b(e.d(e.d(e.d(e.d(e.d(e.d(e.f(this.leaderboardLearnedTime, e.b(this.leaderboardEmojiStatus, e.f(this.leaderboardWeekXP, e.b(this.totalTime, e.b(this.streakSaver, e.b(this.streakFreezer, e.b(this.totalGems, e.b(this.totalXP, this.f22326id.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31, this.skillMastery), 31, this.achievementTopStudent), 31, this.achievementXPExpert), 31, this.achievementStreakHero), 31, this.achievementLeaderboard), 31, this.achievementLanguages), 31, this.allFollowers), 31, this.allFollowings), 31), 31), 31), 31), 31), 31), 31, this.learnHistories);
    }

    public final Map<String, Object> toBasicMap() {
        return new HashMap();
    }

    public final Map<String, Object> toDetailMap() {
        return new HashMap();
    }

    public final Map<String, Object> toMap() {
        return new HashMap();
    }

    public String toString() {
        String str = this.f22326id;
        int i11 = this.totalXP;
        int i12 = this.totalGems;
        int i13 = this.streakFreezer;
        int i14 = this.streakSaver;
        int i15 = this.totalTime;
        long j11 = this.leaderboardWeekXP;
        int i16 = this.leaderboardEmojiStatus;
        long j12 = this.leaderboardLearnedTime;
        String str2 = this.skillMastery;
        String str3 = this.achievementTopStudent;
        String str4 = this.achievementXPExpert;
        String str5 = this.achievementStreakHero;
        String str6 = this.achievementLeaderboard;
        String str7 = this.achievementLanguages;
        List<String> list = this.allFollowers;
        List<String> list2 = this.allFollowings;
        int i17 = this.todayXP;
        int i18 = this.weeklyXP;
        int i19 = this.level;
        int i21 = this.totalKnowledgePoints;
        int i22 = this.totalDayStreak;
        int i23 = this.totalFinishedLesson;
        List<DailyLearnHistory> list3 = this.learnHistories;
        String str8 = this.animatedEmojis;
        StringBuilder sbQ = e.q(i11, "UserInfo(id=", str, ", totalXP=", ", totalGems=");
        a.v(i12, i13, ", streakFreezer=", ", streakSaver=", sbQ);
        a.v(i14, i15, ", totalTime=", ", leaderboardWeekXP=", sbQ);
        sbQ.append(j11);
        sbQ.append(", leaderboardEmojiStatus=");
        sbQ.append(i16);
        a.y(j12, ", leaderboardLearnedTime=", ", skillMastery=", sbQ);
        d.w(sbQ, str2, ", achievementTopStudent=", str3, ", achievementXPExpert=");
        d.w(sbQ, str4, ", achievementStreakHero=", str5, ", achievementLeaderboard=");
        d.w(sbQ, str6, ", achievementLanguages=", str7, ", allFollowers=");
        sbQ.append(list);
        sbQ.append(", allFollowings=");
        sbQ.append(list2);
        sbQ.append(", todayXP=");
        a.v(i17, i18, ", weeklyXP=", ", level=", sbQ);
        a.v(i19, i21, ", totalKnowledgePoints=", ", totalDayStreak=", sbQ);
        a.v(i22, i23, ", totalFinishedLesson=", ", learnHistories=", sbQ);
        sbQ.append(list3);
        sbQ.append(", animatedEmojis=");
        sbQ.append(str8);
        sbQ.append(")");
        return sbQ.toString();
    }

    public /* synthetic */ UserInfo(String str, int i11, int i12, int i13, int i14, int i15, long j11, int i16, long j12, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, int i17, int i18, int i19, int i21, int i22, int i23, List list3, String str8, int i24, f fVar) {
        this(str, i11, i12, i13, i14, i15, j11, i16, j12, str2, str3, str4, str5, str6, str7, list, list2, (i24 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? 0 : i17, (i24 & 262144) != 0 ? 0 : i18, (i24 & 524288) != 0 ? 0 : i19, (i24 & 1048576) != 0 ? 0 : i21, (i24 & 2097152) != 0 ? 0 : i22, (i24 & 4194304) != 0 ? 0 : i23, (i24 & 8388608) != 0 ? r.f50854a : list3, (i24 & 16777216) != 0 ? BuildConfig.VERSION_NAME : str8);
    }
}
