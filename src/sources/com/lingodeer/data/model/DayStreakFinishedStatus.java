package com.lingodeer.data.model;

import defpackage.e;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class DayStreakFinishedStatus {
    private final int dayStreak;
    private boolean isMilestone;
    private int refillShieldCount;
    private String source;

    public DayStreakFinishedStatus(int i11, boolean z11, int i12, String source) {
        m.f(source, "source");
        this.dayStreak = i11;
        this.isMilestone = z11;
        this.refillShieldCount = i12;
        this.source = source;
    }

    public static /* synthetic */ DayStreakFinishedStatus copy$default(DayStreakFinishedStatus dayStreakFinishedStatus, int i11, boolean z11, int i12, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = dayStreakFinishedStatus.dayStreak;
        }
        if ((i13 & 2) != 0) {
            z11 = dayStreakFinishedStatus.isMilestone;
        }
        if ((i13 & 4) != 0) {
            i12 = dayStreakFinishedStatus.refillShieldCount;
        }
        if ((i13 & 8) != 0) {
            str = dayStreakFinishedStatus.source;
        }
        return dayStreakFinishedStatus.copy(i11, z11, i12, str);
    }

    public final int component1() {
        return this.dayStreak;
    }

    public final boolean component2() {
        return this.isMilestone;
    }

    public final int component3() {
        return this.refillShieldCount;
    }

    public final String component4() {
        return this.source;
    }

    public final DayStreakFinishedStatus copy(int i11, boolean z11, int i12, String source) {
        m.f(source, "source");
        return new DayStreakFinishedStatus(i11, z11, i12, source);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DayStreakFinishedStatus)) {
            return false;
        }
        DayStreakFinishedStatus dayStreakFinishedStatus = (DayStreakFinishedStatus) obj;
        return this.dayStreak == dayStreakFinishedStatus.dayStreak && this.isMilestone == dayStreakFinishedStatus.isMilestone && this.refillShieldCount == dayStreakFinishedStatus.refillShieldCount && m.a(this.source, dayStreakFinishedStatus.source);
    }

    public final int getDayStreak() {
        return this.dayStreak;
    }

    public final int getRefillShieldCount() {
        return this.refillShieldCount;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return this.source.hashCode() + e.b(this.refillShieldCount, e.e(Integer.hashCode(this.dayStreak) * 31, 31, this.isMilestone), 31);
    }

    public final boolean isMilestone() {
        return this.isMilestone;
    }

    public final void setMilestone(boolean z11) {
        this.isMilestone = z11;
    }

    public final void setRefillShieldCount(int i11) {
        this.refillShieldCount = i11;
    }

    public final void setSource(String str) {
        m.f(str, "<set-?>");
        this.source = str;
    }

    public String toString() {
        return "DayStreakFinishedStatus(dayStreak=" + this.dayStreak + ", isMilestone=" + this.isMilestone + ", refillShieldCount=" + this.refillShieldCount + ", source=" + this.source + ")";
    }
}
