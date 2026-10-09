package com.lingodeer.database.model;

import com.google.type.bACG.scNRoQgKSYX;
import defpackage.e;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class UserFollowerEntity {
    private final String image;
    private final String joined;
    private final String nickname;
    private final String uid;

    public UserFollowerEntity(String uid, String nickname, String image, String joined) {
        m.f(uid, "uid");
        m.f(nickname, "nickname");
        m.f(image, "image");
        m.f(joined, "joined");
        this.uid = uid;
        this.nickname = nickname;
        this.image = image;
        this.joined = joined;
    }

    public static /* synthetic */ UserFollowerEntity copy$default(UserFollowerEntity userFollowerEntity, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = userFollowerEntity.uid;
        }
        if ((i11 & 2) != 0) {
            str2 = userFollowerEntity.nickname;
        }
        if ((i11 & 4) != 0) {
            str3 = userFollowerEntity.image;
        }
        if ((i11 & 8) != 0) {
            str4 = userFollowerEntity.joined;
        }
        return userFollowerEntity.copy(str, str2, str3, str4);
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

    public final UserFollowerEntity copy(String uid, String nickname, String image, String joined) {
        m.f(uid, "uid");
        m.f(nickname, "nickname");
        m.f(image, "image");
        m.f(joined, "joined");
        return new UserFollowerEntity(uid, nickname, image, joined);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserFollowerEntity)) {
            return false;
        }
        UserFollowerEntity userFollowerEntity = (UserFollowerEntity) obj;
        return m.a(this.uid, userFollowerEntity.uid) && m.a(this.nickname, userFollowerEntity.nickname) && m.a(this.image, userFollowerEntity.image) && m.a(this.joined, userFollowerEntity.joined);
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
        return e.p(e.s("UserFollowerEntity(uid=", str, scNRoQgKSYX.mADdonw, str2, ", image="), this.image, ", joined=", this.joined, ")");
    }
}
