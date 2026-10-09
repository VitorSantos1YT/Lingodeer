package com.lingodeer.network.model;

import defpackage.e;
import ep.a;
import kotlin.jvm.internal.m;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class AnimatedEmojiRedeemResponse {
    private final String emoji_id_list;
    private final int flag;
    private final int total_gems;

    public AnimatedEmojiRedeemResponse(int i11, int i12, String emoji_id_list) {
        m.f(emoji_id_list, "emoji_id_list");
        this.flag = i11;
        this.total_gems = i12;
        this.emoji_id_list = emoji_id_list;
    }

    public static /* synthetic */ AnimatedEmojiRedeemResponse copy$default(AnimatedEmojiRedeemResponse animatedEmojiRedeemResponse, int i11, int i12, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = animatedEmojiRedeemResponse.flag;
        }
        if ((i13 & 2) != 0) {
            i12 = animatedEmojiRedeemResponse.total_gems;
        }
        if ((i13 & 4) != 0) {
            str = animatedEmojiRedeemResponse.emoji_id_list;
        }
        return animatedEmojiRedeemResponse.copy(i11, i12, str);
    }

    public final int component1() {
        return this.flag;
    }

    public final int component2() {
        return this.total_gems;
    }

    public final String component3() {
        return this.emoji_id_list;
    }

    public final AnimatedEmojiRedeemResponse copy(int i11, int i12, String emoji_id_list) {
        m.f(emoji_id_list, "emoji_id_list");
        return new AnimatedEmojiRedeemResponse(i11, i12, emoji_id_list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimatedEmojiRedeemResponse)) {
            return false;
        }
        AnimatedEmojiRedeemResponse animatedEmojiRedeemResponse = (AnimatedEmojiRedeemResponse) obj;
        return this.flag == animatedEmojiRedeemResponse.flag && this.total_gems == animatedEmojiRedeemResponse.total_gems && m.a(this.emoji_id_list, animatedEmojiRedeemResponse.emoji_id_list);
    }

    public final String getEmoji_id_list() {
        return this.emoji_id_list;
    }

    public final int getFlag() {
        return this.flag;
    }

    public final int getTotal_gems() {
        return this.total_gems;
    }

    public int hashCode() {
        return this.emoji_id_list.hashCode() + e.b(this.total_gems, Integer.hashCode(this.flag) * 31, 31);
    }

    public String toString() {
        int i11 = this.flag;
        int i12 = this.total_gems;
        return a.k(c.k("AnimatedEmojiRedeemResponse(flag=", i11, ", total_gems=", i12, ", emoji_id_list="), this.emoji_id_list, ")");
    }
}
