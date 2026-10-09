package com.lingodeer.database.model;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import com.google.android.material.datepicker.d;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import ep.a;
import hh.p0;
import i0.pKy.shrCcjmOhAmRC;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class UserInfoEntity {
    private final String achievementLanguages;
    private final String achievementLeaderboard;
    private final String achievementStreakHero;
    private final String achievementTopStudent;
    private final String achievementXPExpert;
    private final List<String> allFollowers;
    private final List<String> allFollowings;
    private final String animatedEmojis;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22386id;
    private final int leaderboardEmojiStatus;
    private final long leaderboardLearnedTime;
    private final long leaderboardWeekXP;
    private final String skillMastery;
    private final int streakFreezer;
    private final int streakSaver;
    private final int totalGems;
    private final int totalTime;
    private final int totalXP;

    public UserInfoEntity(String id2, int i11, int i12, int i13, int i14, int i15, long j11, int i16, long j12, String skillMastery, String achievementTopStudent, String achievementXPExpert, String achievementStreakHero, String achievementLeaderboard, String achievementLanguages, List<String> allFollowings, List<String> allFollowers, String animatedEmojis) {
        m.f(id2, "id");
        m.f(skillMastery, "skillMastery");
        m.f(achievementTopStudent, "achievementTopStudent");
        m.f(achievementXPExpert, "achievementXPExpert");
        m.f(achievementStreakHero, "achievementStreakHero");
        m.f(achievementLeaderboard, "achievementLeaderboard");
        m.f(achievementLanguages, "achievementLanguages");
        m.f(allFollowings, "allFollowings");
        m.f(allFollowers, "allFollowers");
        m.f(animatedEmojis, "animatedEmojis");
        this.f22386id = id2;
        this.totalXP = i11;
        this.totalTime = i12;
        this.totalGems = i13;
        this.streakFreezer = i14;
        this.streakSaver = i15;
        this.leaderboardWeekXP = j11;
        this.leaderboardEmojiStatus = i16;
        this.leaderboardLearnedTime = j12;
        this.skillMastery = skillMastery;
        this.achievementTopStudent = achievementTopStudent;
        this.achievementXPExpert = achievementXPExpert;
        this.achievementStreakHero = achievementStreakHero;
        this.achievementLeaderboard = achievementLeaderboard;
        this.achievementLanguages = achievementLanguages;
        this.allFollowings = allFollowings;
        this.allFollowers = allFollowers;
        this.animatedEmojis = animatedEmojis;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserInfoEntity copy$default(UserInfoEntity userInfoEntity, String str, int i11, int i12, int i13, int i14, int i15, long j11, int i16, long j12, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, String str8, int i17, Object obj) {
        String str9;
        List list3;
        String str10 = (i17 & 1) != 0 ? userInfoEntity.f22386id : str;
        int i18 = (i17 & 2) != 0 ? userInfoEntity.totalXP : i11;
        int i19 = (i17 & 4) != 0 ? userInfoEntity.totalTime : i12;
        int i21 = (i17 & 8) != 0 ? userInfoEntity.totalGems : i13;
        int i22 = (i17 & 16) != 0 ? userInfoEntity.streakFreezer : i14;
        int i23 = (i17 & 32) != 0 ? userInfoEntity.streakSaver : i15;
        long j13 = (i17 & 64) != 0 ? userInfoEntity.leaderboardWeekXP : j11;
        int i24 = (i17 & 128) != 0 ? userInfoEntity.leaderboardEmojiStatus : i16;
        long j14 = (i17 & 256) != 0 ? userInfoEntity.leaderboardLearnedTime : j12;
        String str11 = (i17 & 512) != 0 ? userInfoEntity.skillMastery : str2;
        String str12 = (i17 & 1024) != 0 ? userInfoEntity.achievementTopStudent : str3;
        String str13 = (i17 & 2048) != 0 ? userInfoEntity.achievementXPExpert : str4;
        String str14 = str10;
        String str15 = (i17 & 4096) != 0 ? userInfoEntity.achievementStreakHero : str5;
        String str16 = (i17 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? userInfoEntity.achievementLeaderboard : str6;
        String str17 = (i17 & 16384) != 0 ? userInfoEntity.achievementLanguages : str7;
        List list4 = (i17 & 32768) != 0 ? userInfoEntity.allFollowings : list;
        List list5 = (i17 & 65536) != 0 ? userInfoEntity.allFollowers : list2;
        if ((i17 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0) {
            list3 = list5;
            str9 = userInfoEntity.animatedEmojis;
        } else {
            str9 = str8;
            list3 = list5;
        }
        return userInfoEntity.copy(str14, i18, i19, i21, i22, i23, j13, i24, j14, str11, str12, str13, str15, str16, str17, list4, list3, str9);
    }

    public final String component1() {
        return this.f22386id;
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
        return this.allFollowings;
    }

    public final List<String> component17() {
        return this.allFollowers;
    }

    public final String component18() {
        return this.animatedEmojis;
    }

    public final int component2() {
        return this.totalXP;
    }

    public final int component3() {
        return this.totalTime;
    }

    public final int component4() {
        return this.totalGems;
    }

    public final int component5() {
        return this.streakFreezer;
    }

    public final int component6() {
        return this.streakSaver;
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInfoEntity)) {
            return false;
        }
        UserInfoEntity userInfoEntity = (UserInfoEntity) obj;
        return m.a(this.f22386id, userInfoEntity.f22386id) && this.totalXP == userInfoEntity.totalXP && this.totalTime == userInfoEntity.totalTime && this.totalGems == userInfoEntity.totalGems && this.streakFreezer == userInfoEntity.streakFreezer && this.streakSaver == userInfoEntity.streakSaver && this.leaderboardWeekXP == userInfoEntity.leaderboardWeekXP && this.leaderboardEmojiStatus == userInfoEntity.leaderboardEmojiStatus && this.leaderboardLearnedTime == userInfoEntity.leaderboardLearnedTime && m.a(this.skillMastery, userInfoEntity.skillMastery) && m.a(this.achievementTopStudent, userInfoEntity.achievementTopStudent) && m.a(this.achievementXPExpert, userInfoEntity.achievementXPExpert) && m.a(this.achievementStreakHero, userInfoEntity.achievementStreakHero) && m.a(this.achievementLeaderboard, userInfoEntity.achievementLeaderboard) && m.a(this.achievementLanguages, userInfoEntity.achievementLanguages) && m.a(this.allFollowings, userInfoEntity.allFollowings) && m.a(this.allFollowers, userInfoEntity.allFollowers) && m.a(this.animatedEmojis, userInfoEntity.animatedEmojis);
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
        return this.f22386id;
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

    public final String getSkillMastery() {
        return this.skillMastery;
    }

    public final int getStreakFreezer() {
        return this.streakFreezer;
    }

    public final int getStreakSaver() {
        return this.streakSaver;
    }

    public final int getTotalGems() {
        return this.totalGems;
    }

    public final int getTotalTime() {
        return this.totalTime;
    }

    public final int getTotalXP() {
        return this.totalXP;
    }

    public int hashCode() {
        return this.animatedEmojis.hashCode() + p0.b(p0.b(e.d(e.d(e.d(e.d(e.d(e.d(e.f(this.leaderboardLearnedTime, e.b(this.leaderboardEmojiStatus, e.f(this.leaderboardWeekXP, e.b(this.streakSaver, e.b(this.streakFreezer, e.b(this.totalGems, e.b(this.totalTime, e.b(this.totalXP, this.f22386id.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31, this.skillMastery), 31, this.achievementTopStudent), 31, this.achievementXPExpert), 31, this.achievementStreakHero), 31, this.achievementLeaderboard), 31, this.achievementLanguages), 31, this.allFollowings), 31, this.allFollowers);
    }

    public final UserInfoEntity copy(String id2, int i11, int i12, int i13, int i14, int i15, long j11, int i16, long j12, String skillMastery, String achievementTopStudent, String achievementXPExpert, String achievementStreakHero, String str, String achievementLanguages, List<String> allFollowings, List<String> allFollowers, String animatedEmojis) {
        m.f(id2, "id");
        m.f(skillMastery, "skillMastery");
        m.f(achievementTopStudent, "achievementTopStudent");
        m.f(achievementXPExpert, "achievementXPExpert");
        m.f(achievementStreakHero, "achievementStreakHero");
        m.f(str, ualZoVVCQs.fvICWSeADb);
        m.f(achievementLanguages, "achievementLanguages");
        m.f(allFollowings, "allFollowings");
        m.f(allFollowers, "allFollowers");
        m.f(animatedEmojis, "animatedEmojis");
        return new UserInfoEntity(id2, i11, i12, i13, i14, i15, j11, i16, j12, skillMastery, achievementTopStudent, achievementXPExpert, achievementStreakHero, str, achievementLanguages, allFollowings, allFollowers, animatedEmojis);
    }

    public String toString() {
        String str = this.f22386id;
        int i11 = this.totalXP;
        int i12 = this.totalTime;
        int i13 = this.totalGems;
        int i14 = this.streakFreezer;
        int i15 = this.streakSaver;
        long j11 = this.leaderboardWeekXP;
        int i16 = this.leaderboardEmojiStatus;
        long j12 = this.leaderboardLearnedTime;
        String str2 = this.skillMastery;
        String str3 = this.achievementTopStudent;
        String str4 = this.achievementXPExpert;
        String str5 = this.achievementStreakHero;
        String str6 = this.achievementLeaderboard;
        String str7 = this.achievementLanguages;
        List<String> list = this.allFollowings;
        List<String> list2 = this.allFollowers;
        String str8 = this.animatedEmojis;
        StringBuilder sbQ = e.q(i11, "UserInfoEntity(id=", str, ", totalXP=", ", totalTime=");
        a.v(i12, i13, ", totalGems=", ", streakFreezer=", sbQ);
        a.v(i14, i15, ", streakSaver=", ", leaderboardWeekXP=", sbQ);
        sbQ.append(j11);
        sbQ.append(", leaderboardEmojiStatus=");
        sbQ.append(i16);
        a.y(j12, ", leaderboardLearnedTime=", ", skillMastery=", sbQ);
        d.w(sbQ, str2, ", achievementTopStudent=", str3, ", achievementXPExpert=");
        d.w(sbQ, str4, ", achievementStreakHero=", str5, ", achievementLeaderboard=");
        d.w(sbQ, str6, ", achievementLanguages=", str7, ", allFollowings=");
        sbQ.append(list);
        sbQ.append(shrCcjmOhAmRC.XoMDtJ);
        sbQ.append(list2);
        sbQ.append(", animatedEmojis=");
        return a.k(sbQ, str8, ")");
    }

    public /* synthetic */ UserInfoEntity(String str, int i11, int i12, int i13, int i14, int i15, long j11, int i16, long j12, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, String str8, int i17, f fVar) {
        this(str, i11, i12, i13, i14, i15, j11, i16, j12, str2, str3, str4, str5, str6, str7, list, list2, (i17 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? BuildConfig.VERSION_NAME : str8);
    }
}
