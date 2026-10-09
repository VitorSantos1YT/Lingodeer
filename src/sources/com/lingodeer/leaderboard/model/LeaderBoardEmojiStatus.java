package com.lingodeer.leaderboard.model;

import defpackage.e;
import hh.p0;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class LeaderBoardEmojiStatus {
    public static final int $stable = 0;
    private final int drawableRes;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f22388id;
    private final boolean isSelected;

    public LeaderBoardEmojiStatus(int i11, int i12, boolean z11) {
        this.f22388id = i11;
        this.drawableRes = i12;
        this.isSelected = z11;
    }

    public static /* synthetic */ LeaderBoardEmojiStatus copy$default(LeaderBoardEmojiStatus leaderBoardEmojiStatus, int i11, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = leaderBoardEmojiStatus.f22388id;
        }
        if ((i13 & 2) != 0) {
            i12 = leaderBoardEmojiStatus.drawableRes;
        }
        if ((i13 & 4) != 0) {
            z11 = leaderBoardEmojiStatus.isSelected;
        }
        return leaderBoardEmojiStatus.copy(i11, i12, z11);
    }

    public final int component1() {
        return this.f22388id;
    }

    public final int component2() {
        return this.drawableRes;
    }

    public final boolean component3() {
        return this.isSelected;
    }

    public final LeaderBoardEmojiStatus copy(int i11, int i12, boolean z11) {
        return new LeaderBoardEmojiStatus(i11, i12, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderBoardEmojiStatus)) {
            return false;
        }
        LeaderBoardEmojiStatus leaderBoardEmojiStatus = (LeaderBoardEmojiStatus) obj;
        return this.f22388id == leaderBoardEmojiStatus.f22388id && this.drawableRes == leaderBoardEmojiStatus.drawableRes && this.isSelected == leaderBoardEmojiStatus.isSelected;
    }

    public final int getDrawableRes() {
        return this.drawableRes;
    }

    public final int getId() {
        return this.f22388id;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelected) + e.b(this.drawableRes, Integer.hashCode(this.f22388id) * 31, 31);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        int i11 = this.f22388id;
        int i12 = this.drawableRes;
        return p0.p(c.k("LeaderBoardEmojiStatus(id=", i11, ", drawableRes=", i12, ", isSelected="), this.isSelected, ")");
    }
}
