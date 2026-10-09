package com.lingodeer.data.model;

import com.lingodeer.database.model.UserInfoEntity;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class UserInfoKt {
    public static final UserInfoEntity asEntityModel(UserInfo userInfo) {
        m.f(userInfo, "<this>");
        return new UserInfoEntity(userInfo.getId(), userInfo.getTotalXP(), userInfo.getTotalTime(), userInfo.getTotalGems(), userInfo.getStreakFreezer(), userInfo.getStreakSaver(), userInfo.getLeaderboardWeekXP(), userInfo.getLeaderboardEmojiStatus(), userInfo.getLeaderboardLearnedTime(), userInfo.getSkillMastery(), userInfo.getAchievementTopStudent(), userInfo.getAchievementXPExpert(), userInfo.getAchievementStreakHero(), userInfo.getAchievementLeaderboard(), userInfo.getAchievementLanguages(), userInfo.getAllFollowings(), userInfo.getAllFollowers(), userInfo.getAnimatedEmojis());
    }

    public static final UserInfo asExternalModel(UserInfoEntity userInfoEntity) {
        m.f(userInfoEntity, "<this>");
        return new UserInfo(userInfoEntity.getId(), userInfoEntity.getTotalXP(), userInfoEntity.getTotalGems(), userInfoEntity.getStreakFreezer(), userInfoEntity.getStreakSaver(), userInfoEntity.getTotalTime(), userInfoEntity.getLeaderboardWeekXP(), userInfoEntity.getLeaderboardEmojiStatus(), userInfoEntity.getLeaderboardLearnedTime(), userInfoEntity.getSkillMastery(), userInfoEntity.getAchievementTopStudent(), userInfoEntity.getAchievementXPExpert(), userInfoEntity.getAchievementStreakHero(), userInfoEntity.getAchievementLeaderboard(), userInfoEntity.getAchievementLanguages(), userInfoEntity.getAllFollowers(), userInfoEntity.getAllFollowings(), 0, 0, 0, 0, 0, 0, null, userInfoEntity.getAnimatedEmojis(), 16646144, null);
    }
}
