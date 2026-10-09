package com.lingodeer.data.model;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.android.material.datepicker.d;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import ep.a;
import hh.p0;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class MeUserData {
    private final List<String> allFollowersCollection;
    private final List<String> allFollowingsCollection;
    private final List<ProgressCollectionItem> allProgressCollection;
    private final String animatedEmojis;
    private final int billingPageViews;
    private final boolean buyCoffee;
    private final int leaderboardEmojiStatus;
    private final long leaderboardLearnedTime;
    private final long leaderboardWeekXP;
    private final int maxStreak;
    private final String meAchievementLanguages;
    private final String meAchievementLeaderboard;
    private final String meAchievementStreakHero;
    private final String meAchievementTopStudent;
    private final String meAchievementXPExpert;
    private final String meSkillsMastery;
    private final String newsFeedReadIds;
    private final List<GemCollectionItem> recentGemsCollection;
    private final List<StreakCollectionItem> recentStreakCollection;
    private final List<LearnTimeCollectionItem> recentTimeCollection;
    private final List<XPCollectionItem> recentXPCollection;
    private final boolean reviewDataTransferred;
    private final String settingLearningLan;
    private final String settingReminders;
    private final boolean settingShowLeaderboard;
    private final boolean settingSoundEffect;
    private final String settingUiLan;
    private final int totalGems;
    private final int totalStreakFreezer;
    private final int totalStreakSaver;
    private final int totalTime;
    private final int totalXP;
    private final String userImage;
    private final String userJoined;
    private final String userNickname;

    public MeUserData(int i11, int i12, int i13, int i14, int i15, int i16, String meSkillsMastery, String meAchievementTopStudent, String meAchievementXPExpert, String meAchievementStreakHero, String meAchievementLeaderboard, String meAchievementLanguages, long j11, int i17, long j12, String userImage, String userNickname, int i18, String newsFeedReadIds, String settingLearningLan, String settingUiLan, String settingReminders, boolean z11, boolean z12, String userJoined, boolean z13, boolean z14, List<XPCollectionItem> recentXPCollection, List<LearnTimeCollectionItem> recentTimeCollection, List<GemCollectionItem> recentGemsCollection, List<StreakCollectionItem> recentStreakCollection, List<ProgressCollectionItem> allProgressCollection, List<String> allFollowingsCollection, List<String> allFollowersCollection, String animatedEmojis) {
        m.f(meSkillsMastery, "meSkillsMastery");
        m.f(meAchievementTopStudent, "meAchievementTopStudent");
        m.f(meAchievementXPExpert, "meAchievementXPExpert");
        m.f(meAchievementStreakHero, "meAchievementStreakHero");
        m.f(meAchievementLeaderboard, "meAchievementLeaderboard");
        m.f(meAchievementLanguages, "meAchievementLanguages");
        m.f(userImage, "userImage");
        m.f(userNickname, "userNickname");
        m.f(newsFeedReadIds, "newsFeedReadIds");
        m.f(settingLearningLan, "settingLearningLan");
        m.f(settingUiLan, "settingUiLan");
        m.f(settingReminders, "settingReminders");
        m.f(userJoined, "userJoined");
        m.f(recentXPCollection, "recentXPCollection");
        m.f(recentTimeCollection, "recentTimeCollection");
        m.f(recentGemsCollection, "recentGemsCollection");
        m.f(recentStreakCollection, "recentStreakCollection");
        m.f(allProgressCollection, "allProgressCollection");
        m.f(allFollowingsCollection, "allFollowingsCollection");
        m.f(allFollowersCollection, "allFollowersCollection");
        m.f(animatedEmojis, "animatedEmojis");
        this.maxStreak = i11;
        this.totalXP = i12;
        this.totalTime = i13;
        this.totalGems = i14;
        this.totalStreakSaver = i15;
        this.totalStreakFreezer = i16;
        this.meSkillsMastery = meSkillsMastery;
        this.meAchievementTopStudent = meAchievementTopStudent;
        this.meAchievementXPExpert = meAchievementXPExpert;
        this.meAchievementStreakHero = meAchievementStreakHero;
        this.meAchievementLeaderboard = meAchievementLeaderboard;
        this.meAchievementLanguages = meAchievementLanguages;
        this.leaderboardWeekXP = j11;
        this.leaderboardEmojiStatus = i17;
        this.leaderboardLearnedTime = j12;
        this.userImage = userImage;
        this.userNickname = userNickname;
        this.billingPageViews = i18;
        this.newsFeedReadIds = newsFeedReadIds;
        this.settingLearningLan = settingLearningLan;
        this.settingUiLan = settingUiLan;
        this.settingReminders = settingReminders;
        this.settingSoundEffect = z11;
        this.settingShowLeaderboard = z12;
        this.userJoined = userJoined;
        this.buyCoffee = z13;
        this.reviewDataTransferred = z14;
        this.recentXPCollection = recentXPCollection;
        this.recentTimeCollection = recentTimeCollection;
        this.recentGemsCollection = recentGemsCollection;
        this.recentStreakCollection = recentStreakCollection;
        this.allProgressCollection = allProgressCollection;
        this.allFollowingsCollection = allFollowingsCollection;
        this.allFollowersCollection = allFollowersCollection;
        this.animatedEmojis = animatedEmojis;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MeUserData copy$default(MeUserData meUserData, int i11, int i12, int i13, int i14, int i15, int i16, String str, String str2, String str3, String str4, String str5, String str6, long j11, int i17, long j12, String str7, String str8, int i18, String str9, String str10, String str11, String str12, boolean z11, boolean z12, String str13, boolean z13, boolean z14, List list, List list2, List list3, List list4, List list5, List list6, List list7, String str14, int i19, int i21, Object obj) {
        String str15;
        List list8;
        int i22 = (i19 & 1) != 0 ? meUserData.maxStreak : i11;
        int i23 = (i19 & 2) != 0 ? meUserData.totalXP : i12;
        int i24 = (i19 & 4) != 0 ? meUserData.totalTime : i13;
        int i25 = (i19 & 8) != 0 ? meUserData.totalGems : i14;
        int i26 = (i19 & 16) != 0 ? meUserData.totalStreakSaver : i15;
        int i27 = (i19 & 32) != 0 ? meUserData.totalStreakFreezer : i16;
        String str16 = (i19 & 64) != 0 ? meUserData.meSkillsMastery : str;
        String str17 = (i19 & 128) != 0 ? meUserData.meAchievementTopStudent : str2;
        String str18 = (i19 & 256) != 0 ? meUserData.meAchievementXPExpert : str3;
        String str19 = (i19 & 512) != 0 ? meUserData.meAchievementStreakHero : str4;
        String str20 = (i19 & 1024) != 0 ? meUserData.meAchievementLeaderboard : str5;
        String str21 = (i19 & 2048) != 0 ? meUserData.meAchievementLanguages : str6;
        long j13 = (i19 & 4096) != 0 ? meUserData.leaderboardWeekXP : j11;
        int i28 = i22;
        int i29 = (i19 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? meUserData.leaderboardEmojiStatus : i17;
        long j14 = (i19 & 16384) != 0 ? meUserData.leaderboardLearnedTime : j12;
        String str22 = (i19 & 32768) != 0 ? meUserData.userImage : str7;
        String str23 = (i19 & 65536) != 0 ? meUserData.userNickname : str8;
        String str24 = str22;
        int i30 = (i19 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? meUserData.billingPageViews : i18;
        String str25 = (i19 & 262144) != 0 ? meUserData.newsFeedReadIds : str9;
        String str26 = (i19 & 524288) != 0 ? meUserData.settingLearningLan : str10;
        String str27 = (i19 & 1048576) != 0 ? meUserData.settingUiLan : str11;
        String str28 = (i19 & 2097152) != 0 ? meUserData.settingReminders : str12;
        boolean z15 = (i19 & 4194304) != 0 ? meUserData.settingSoundEffect : z11;
        boolean z16 = (i19 & 8388608) != 0 ? meUserData.settingShowLeaderboard : z12;
        String str29 = (i19 & 16777216) != 0 ? meUserData.userJoined : str13;
        boolean z17 = (i19 & 33554432) != 0 ? meUserData.buyCoffee : z13;
        boolean z18 = (i19 & 67108864) != 0 ? meUserData.reviewDataTransferred : z14;
        List list9 = (i19 & 134217728) != 0 ? meUserData.recentXPCollection : list;
        List list10 = (i19 & 268435456) != 0 ? meUserData.recentTimeCollection : list2;
        List list11 = (i19 & 536870912) != 0 ? meUserData.recentGemsCollection : list3;
        List list12 = (i19 & 1073741824) != 0 ? meUserData.recentStreakCollection : list4;
        List list13 = (i19 & Integer.MIN_VALUE) != 0 ? meUserData.allProgressCollection : list5;
        List list14 = (i21 & 1) != 0 ? meUserData.allFollowingsCollection : list6;
        List list15 = (i21 & 2) != 0 ? meUserData.allFollowersCollection : list7;
        if ((i21 & 4) != 0) {
            list8 = list15;
            str15 = meUserData.animatedEmojis;
        } else {
            str15 = str14;
            list8 = list15;
        }
        return meUserData.copy(i28, i23, i24, i25, i26, i27, str16, str17, str18, str19, str20, str21, j13, i29, j14, str24, str23, i30, str25, str26, str27, str28, z15, z16, str29, z17, z18, list9, list10, list11, list12, list13, list14, list8, str15);
    }

    public final int component1() {
        return this.maxStreak;
    }

    public final String component10() {
        return this.meAchievementStreakHero;
    }

    public final String component11() {
        return this.meAchievementLeaderboard;
    }

    public final String component12() {
        return this.meAchievementLanguages;
    }

    public final long component13() {
        return this.leaderboardWeekXP;
    }

    public final int component14() {
        return this.leaderboardEmojiStatus;
    }

    public final long component15() {
        return this.leaderboardLearnedTime;
    }

    public final String component16() {
        return this.userImage;
    }

    public final String component17() {
        return this.userNickname;
    }

    public final int component18() {
        return this.billingPageViews;
    }

    public final String component19() {
        return this.newsFeedReadIds;
    }

    public final int component2() {
        return this.totalXP;
    }

    public final String component20() {
        return this.settingLearningLan;
    }

    public final String component21() {
        return this.settingUiLan;
    }

    public final String component22() {
        return this.settingReminders;
    }

    public final boolean component23() {
        return this.settingSoundEffect;
    }

    public final boolean component24() {
        return this.settingShowLeaderboard;
    }

    public final String component25() {
        return this.userJoined;
    }

    public final boolean component26() {
        return this.buyCoffee;
    }

    public final boolean component27() {
        return this.reviewDataTransferred;
    }

    public final List<XPCollectionItem> component28() {
        return this.recentXPCollection;
    }

    public final List<LearnTimeCollectionItem> component29() {
        return this.recentTimeCollection;
    }

    public final int component3() {
        return this.totalTime;
    }

    public final List<GemCollectionItem> component30() {
        return this.recentGemsCollection;
    }

    public final List<StreakCollectionItem> component31() {
        return this.recentStreakCollection;
    }

    public final List<ProgressCollectionItem> component32() {
        return this.allProgressCollection;
    }

    public final List<String> component33() {
        return this.allFollowingsCollection;
    }

    public final List<String> component34() {
        return this.allFollowersCollection;
    }

    public final String component35() {
        return this.animatedEmojis;
    }

    public final int component4() {
        return this.totalGems;
    }

    public final int component5() {
        return this.totalStreakSaver;
    }

    public final int component6() {
        return this.totalStreakFreezer;
    }

    public final String component7() {
        return this.meSkillsMastery;
    }

    public final String component8() {
        return this.meAchievementTopStudent;
    }

    public final String component9() {
        return this.meAchievementXPExpert;
    }

    public final MeUserData copy(int i11, int i12, int i13, int i14, int i15, int i16, String meSkillsMastery, String meAchievementTopStudent, String meAchievementXPExpert, String meAchievementStreakHero, String meAchievementLeaderboard, String meAchievementLanguages, long j11, int i17, long j12, String userImage, String userNickname, int i18, String newsFeedReadIds, String settingLearningLan, String settingUiLan, String settingReminders, boolean z11, boolean z12, String userJoined, boolean z13, boolean z14, List<XPCollectionItem> recentXPCollection, List<LearnTimeCollectionItem> recentTimeCollection, List<GemCollectionItem> recentGemsCollection, List<StreakCollectionItem> recentStreakCollection, List<ProgressCollectionItem> allProgressCollection, List<String> allFollowingsCollection, List<String> allFollowersCollection, String animatedEmojis) {
        m.f(meSkillsMastery, "meSkillsMastery");
        m.f(meAchievementTopStudent, "meAchievementTopStudent");
        m.f(meAchievementXPExpert, "meAchievementXPExpert");
        m.f(meAchievementStreakHero, "meAchievementStreakHero");
        m.f(meAchievementLeaderboard, "meAchievementLeaderboard");
        m.f(meAchievementLanguages, "meAchievementLanguages");
        m.f(userImage, "userImage");
        m.f(userNickname, "userNickname");
        m.f(newsFeedReadIds, "newsFeedReadIds");
        m.f(settingLearningLan, "settingLearningLan");
        m.f(settingUiLan, "settingUiLan");
        m.f(settingReminders, "settingReminders");
        m.f(userJoined, "userJoined");
        m.f(recentXPCollection, "recentXPCollection");
        m.f(recentTimeCollection, "recentTimeCollection");
        m.f(recentGemsCollection, "recentGemsCollection");
        m.f(recentStreakCollection, "recentStreakCollection");
        m.f(allProgressCollection, "allProgressCollection");
        m.f(allFollowingsCollection, "allFollowingsCollection");
        m.f(allFollowersCollection, "allFollowersCollection");
        m.f(animatedEmojis, "animatedEmojis");
        return new MeUserData(i11, i12, i13, i14, i15, i16, meSkillsMastery, meAchievementTopStudent, meAchievementXPExpert, meAchievementStreakHero, meAchievementLeaderboard, meAchievementLanguages, j11, i17, j12, userImage, userNickname, i18, newsFeedReadIds, settingLearningLan, settingUiLan, settingReminders, z11, z12, userJoined, z13, z14, recentXPCollection, recentTimeCollection, recentGemsCollection, recentStreakCollection, allProgressCollection, allFollowingsCollection, allFollowersCollection, animatedEmojis);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MeUserData)) {
            return false;
        }
        MeUserData meUserData = (MeUserData) obj;
        return this.maxStreak == meUserData.maxStreak && this.totalXP == meUserData.totalXP && this.totalTime == meUserData.totalTime && this.totalGems == meUserData.totalGems && this.totalStreakSaver == meUserData.totalStreakSaver && this.totalStreakFreezer == meUserData.totalStreakFreezer && m.a(this.meSkillsMastery, meUserData.meSkillsMastery) && m.a(this.meAchievementTopStudent, meUserData.meAchievementTopStudent) && m.a(this.meAchievementXPExpert, meUserData.meAchievementXPExpert) && m.a(this.meAchievementStreakHero, meUserData.meAchievementStreakHero) && m.a(this.meAchievementLeaderboard, meUserData.meAchievementLeaderboard) && m.a(this.meAchievementLanguages, meUserData.meAchievementLanguages) && this.leaderboardWeekXP == meUserData.leaderboardWeekXP && this.leaderboardEmojiStatus == meUserData.leaderboardEmojiStatus && this.leaderboardLearnedTime == meUserData.leaderboardLearnedTime && m.a(this.userImage, meUserData.userImage) && m.a(this.userNickname, meUserData.userNickname) && this.billingPageViews == meUserData.billingPageViews && m.a(this.newsFeedReadIds, meUserData.newsFeedReadIds) && m.a(this.settingLearningLan, meUserData.settingLearningLan) && m.a(this.settingUiLan, meUserData.settingUiLan) && m.a(this.settingReminders, meUserData.settingReminders) && this.settingSoundEffect == meUserData.settingSoundEffect && this.settingShowLeaderboard == meUserData.settingShowLeaderboard && m.a(this.userJoined, meUserData.userJoined) && this.buyCoffee == meUserData.buyCoffee && this.reviewDataTransferred == meUserData.reviewDataTransferred && m.a(this.recentXPCollection, meUserData.recentXPCollection) && m.a(this.recentTimeCollection, meUserData.recentTimeCollection) && m.a(this.recentGemsCollection, meUserData.recentGemsCollection) && m.a(this.recentStreakCollection, meUserData.recentStreakCollection) && m.a(this.allProgressCollection, meUserData.allProgressCollection) && m.a(this.allFollowingsCollection, meUserData.allFollowingsCollection) && m.a(this.allFollowersCollection, meUserData.allFollowersCollection) && m.a(this.animatedEmojis, meUserData.animatedEmojis);
    }

    public final List<String> getAllFollowersCollection() {
        return this.allFollowersCollection;
    }

    public final List<String> getAllFollowingsCollection() {
        return this.allFollowingsCollection;
    }

    public final List<ProgressCollectionItem> getAllProgressCollection() {
        return this.allProgressCollection;
    }

    public final String getAnimatedEmojis() {
        return this.animatedEmojis;
    }

    public final int getBillingPageViews() {
        return this.billingPageViews;
    }

    public final boolean getBuyCoffee() {
        return this.buyCoffee;
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

    public final int getMaxStreak() {
        return this.maxStreak;
    }

    public final String getMeAchievementLanguages() {
        return this.meAchievementLanguages;
    }

    public final String getMeAchievementLeaderboard() {
        return this.meAchievementLeaderboard;
    }

    public final String getMeAchievementStreakHero() {
        return this.meAchievementStreakHero;
    }

    public final String getMeAchievementTopStudent() {
        return this.meAchievementTopStudent;
    }

    public final String getMeAchievementXPExpert() {
        return this.meAchievementXPExpert;
    }

    public final String getMeSkillsMastery() {
        return this.meSkillsMastery;
    }

    public final String getNewsFeedReadIds() {
        return this.newsFeedReadIds;
    }

    public final List<GemCollectionItem> getRecentGemsCollection() {
        return this.recentGemsCollection;
    }

    public final List<StreakCollectionItem> getRecentStreakCollection() {
        return this.recentStreakCollection;
    }

    public final List<LearnTimeCollectionItem> getRecentTimeCollection() {
        return this.recentTimeCollection;
    }

    public final List<XPCollectionItem> getRecentXPCollection() {
        return this.recentXPCollection;
    }

    public final boolean getReviewDataTransferred() {
        return this.reviewDataTransferred;
    }

    public final String getSettingLearningLan() {
        return this.settingLearningLan;
    }

    public final String getSettingReminders() {
        return this.settingReminders;
    }

    public final boolean getSettingShowLeaderboard() {
        return this.settingShowLeaderboard;
    }

    public final boolean getSettingSoundEffect() {
        return this.settingSoundEffect;
    }

    public final String getSettingUiLan() {
        return this.settingUiLan;
    }

    public final int getTotalGems() {
        return this.totalGems;
    }

    public final int getTotalStreakFreezer() {
        return this.totalStreakFreezer;
    }

    public final int getTotalStreakSaver() {
        return this.totalStreakSaver;
    }

    public final int getTotalTime() {
        return this.totalTime;
    }

    public final int getTotalXP() {
        return this.totalXP;
    }

    public final String getUserImage() {
        return this.userImage;
    }

    public final String getUserJoined() {
        return this.userJoined;
    }

    public final String getUserNickname() {
        return this.userNickname;
    }

    public int hashCode() {
        return this.animatedEmojis.hashCode() + p0.b(p0.b(p0.b(p0.b(p0.b(p0.b(p0.b(e.e(e.e(e.d(e.e(e.e(e.d(e.d(e.d(e.d(e.b(this.billingPageViews, e.d(e.d(e.f(this.leaderboardLearnedTime, e.b(this.leaderboardEmojiStatus, e.f(this.leaderboardWeekXP, e.d(e.d(e.d(e.d(e.d(e.d(e.b(this.totalStreakFreezer, e.b(this.totalStreakSaver, e.b(this.totalGems, e.b(this.totalTime, e.b(this.totalXP, Integer.hashCode(this.maxStreak) * 31, 31), 31), 31), 31), 31), 31, this.meSkillsMastery), 31, this.meAchievementTopStudent), 31, this.meAchievementXPExpert), 31, this.meAchievementStreakHero), 31, this.meAchievementLeaderboard), 31, this.meAchievementLanguages), 31), 31), 31), 31, this.userImage), 31, this.userNickname), 31), 31, this.newsFeedReadIds), 31, this.settingLearningLan), 31, this.settingUiLan), 31, this.settingReminders), 31, this.settingSoundEffect), 31, this.settingShowLeaderboard), 31, this.userJoined), 31, this.buyCoffee), 31, this.reviewDataTransferred), 31, this.recentXPCollection), 31, this.recentTimeCollection), 31, this.recentGemsCollection), 31, this.recentStreakCollection), 31, this.allProgressCollection), 31, this.allFollowingsCollection), 31, this.allFollowersCollection);
    }

    public String toString() {
        int i11 = this.maxStreak;
        int i12 = this.totalXP;
        int i13 = this.totalTime;
        int i14 = this.totalGems;
        int i15 = this.totalStreakSaver;
        int i16 = this.totalStreakFreezer;
        String str = this.meSkillsMastery;
        String str2 = this.meAchievementTopStudent;
        String str3 = this.meAchievementXPExpert;
        String str4 = this.meAchievementStreakHero;
        String str5 = this.meAchievementLeaderboard;
        String str6 = this.meAchievementLanguages;
        long j11 = this.leaderboardWeekXP;
        int i17 = this.leaderboardEmojiStatus;
        long j12 = this.leaderboardLearnedTime;
        String str7 = this.userImage;
        String str8 = this.userNickname;
        int i18 = this.billingPageViews;
        String str9 = this.newsFeedReadIds;
        String str10 = this.settingLearningLan;
        String str11 = this.settingUiLan;
        String str12 = this.settingReminders;
        boolean z11 = this.settingSoundEffect;
        boolean z12 = this.settingShowLeaderboard;
        String str13 = this.userJoined;
        boolean z13 = this.buyCoffee;
        boolean z14 = this.reviewDataTransferred;
        List<XPCollectionItem> list = this.recentXPCollection;
        List<LearnTimeCollectionItem> list2 = this.recentTimeCollection;
        List<GemCollectionItem> list3 = this.recentGemsCollection;
        List<StreakCollectionItem> list4 = this.recentStreakCollection;
        List<ProgressCollectionItem> list5 = this.allProgressCollection;
        List<String> list6 = this.allFollowingsCollection;
        List<String> list7 = this.allFollowersCollection;
        String str14 = this.animatedEmojis;
        StringBuilder sbK = c.k("MeUserData(maxStreak=", i11, ", totalXP=", i12, ", totalTime=");
        a.v(i13, i14, ", totalGems=", ", totalStreakSaver=", sbK);
        a.v(i15, i16, ", totalStreakFreezer=", ", meSkillsMastery=", sbK);
        d.w(sbK, str, ", meAchievementTopStudent=", str2, ", meAchievementXPExpert=");
        d.w(sbK, str3, ", meAchievementStreakHero=", str4, ", meAchievementLeaderboard=");
        d.w(sbK, str5, ", meAchievementLanguages=", str6, ", leaderboardWeekXP=");
        sbK.append(j11);
        sbK.append(", leaderboardEmojiStatus=");
        sbK.append(i17);
        a.y(j12, ", leaderboardLearnedTime=", ", userImage=", sbK);
        d.w(sbK, str7, ", userNickname=", str8, ", billingPageViews=");
        sbK.append(i18);
        sbK.append(", newsFeedReadIds=");
        sbK.append(str9);
        sbK.append(", settingLearningLan=");
        d.w(sbK, str10, ", settingUiLan=", str11, ", settingReminders=");
        sbK.append(str12);
        sbK.append(", settingSoundEffect=");
        sbK.append(z11);
        sbK.append(", settingShowLeaderboard=");
        sbK.append(z12);
        sbK.append(", userJoined=");
        sbK.append(str13);
        sbK.append(", buyCoffee=");
        a.B(", reviewDataTransferred=", ", recentXPCollection=", sbK, z13, z14);
        sbK.append(list);
        sbK.append(", recentTimeCollection=");
        sbK.append(list2);
        sbK.append(", recentGemsCollection=");
        sbK.append(list3);
        sbK.append(", recentStreakCollection=");
        sbK.append(list4);
        sbK.append(", allProgressCollection=");
        sbK.append(list5);
        sbK.append(", allFollowingsCollection=");
        sbK.append(list6);
        sbK.append(", allFollowersCollection=");
        sbK.append(list7);
        sbK.append(", animatedEmojis=");
        sbK.append(str14);
        sbK.append(")");
        return sbK.toString();
    }

    public /* synthetic */ MeUserData(int i11, int i12, int i13, int i14, int i15, int i16, String str, String str2, String str3, String str4, String str5, String str6, long j11, int i17, long j12, String str7, String str8, int i18, String str9, String str10, String str11, String str12, boolean z11, boolean z12, String str13, boolean z13, boolean z14, List list, List list2, List list3, List list4, List list5, List list6, List list7, String str14, int i19, int i21, f fVar) {
        this(i11, i12, i13, i14, i15, i16, str, str2, str3, str4, str5, str6, j11, i17, j12, str7, str8, i18, str9, str10, str11, str12, z11, z12, str13, z13, z14, list, list2, list3, list4, list5, list6, list7, (i21 & 4) != 0 ? BuildConfig.VERSION_NAME : str14);
    }
}
