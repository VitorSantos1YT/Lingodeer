package com.lingodeer.database.model;

import defpackage.e;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class UserFollowingEntity {
    private final String image;
    private final String joined;
    private final String nickname;
    private final String uid;

    public UserFollowingEntity(String uid, String nickname, String image, String joined) {
        m.f(uid, "uid");
        m.f(nickname, "nickname");
        m.f(image, "image");
        m.f(joined, "joined");
        this.uid = uid;
        this.nickname = nickname;
        this.image = image;
        this.joined = joined;
    }

    public static /* synthetic */ UserFollowingEntity copy$default(UserFollowingEntity userFollowingEntity, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = userFollowingEntity.uid;
        }
        if ((i11 & 2) != 0) {
            str2 = userFollowingEntity.nickname;
        }
        if ((i11 & 4) != 0) {
            str3 = userFollowingEntity.image;
        }
        if ((i11 & 8) != 0) {
            str4 = userFollowingEntity.joined;
        }
        return userFollowingEntity.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.uid;
    }

    public final String component2() {
        return this.nickname;
    }

    public final String component3() {
        return this.image;
    }

    public final String component4() {
        return this.joined;
    }

    public final UserFollowingEntity copy(String uid, String nickname, String image, String joined) {
        m.f(uid, "uid");
        m.f(nickname, "nickname");
        m.f(image, "image");
        m.f(joined, "joined");
        return new UserFollowingEntity(uid, nickname, image, joined);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserFollowingEntity)) {
            return false;
        }
        UserFollowingEntity userFollowingEntity = (UserFollowingEntity) obj;
        return m.a(this.uid, userFollowingEntity.uid) && m.a(this.nickname, userFollowingEntity.nickname) && m.a(this.image, userFollowingEntity.image) && m.a(this.joined, userFollowingEntity.joined);
    }

    public final String getImage() {
        return this.image;
    }

    public final String getJoined() {
        return this.joined;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        return this.joined.hashCode() + e.d(e.d(this.uid.hashCode() * 31, 31, this.nickname), 31, this.image);
    }

    public String toString() {
        String str = this.uid;
        String str2 = this.nickname;
        return e.p(e.s("UserFollowingEntity(uid=", str, ", nickname=", str2, ", image="), this.image, ", joined=", this.joined, ")");
    }
}
