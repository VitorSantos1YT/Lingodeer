package com.lingodeer.data.model;

import com.lingodeer.database.model.UserFollowerEntity;
import com.lingodeer.database.model.UserFollowingEntity;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class UserProfileKt {
    public static final UserFollowerEntity asUserFollowerEntity(UserProfile userProfile) {
        m.f(userProfile, "<this>");
        return new UserFollowerEntity(userProfile.getUid(), userProfile.getNickname(), userProfile.getImage(), userProfile.getJoined());
    }

    public static final UserFollowingEntity asUserFollowingEntity(UserProfile userProfile) {
        m.f(userProfile, "<this>");
        return new UserFollowingEntity(userProfile.getUid(), userProfile.getNickname(), userProfile.getImage(), userProfile.getJoined());
    }

    public static final UserProfile asUserProfile(UserFollowingEntity userFollowingEntity) {
        m.f(userFollowingEntity, "<this>");
        return new UserProfile(userFollowingEntity.getUid(), userFollowingEntity.getNickname(), userFollowingEntity.getImage(), userFollowingEntity.getJoined());
    }

    public static final UserProfile asUserProfile(UserFollowerEntity userFollowerEntity) {
        m.f(userFollowerEntity, "<this>");
        return new UserProfile(userFollowerEntity.getUid(), userFollowerEntity.getNickname(), userFollowerEntity.getImage(), userFollowerEntity.getJoined());
    }
}
