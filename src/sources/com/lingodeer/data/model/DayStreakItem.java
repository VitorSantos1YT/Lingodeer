package com.lingodeer.data.model;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class DayStreakItem {
    private final String date;
    private boolean useShield;

    public DayStreakItem(String date, boolean z11) {
        m.f(date, "date");
        this.date = date;
        this.useShield = z11;
    }

    public static /* synthetic */ DayStreakItem copy$default(DayStreakItem dayStreakItem, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dayStreakItem.date;
        }
        if ((i11 & 2) != 0) {
            z11 = dayStreakItem.useShield;
        }
        return dayStreakItem.copy(str, z11);
    }

    public final String component1() {
        return this.date;
    }

    public final boolean component2() {
        return this.useShield;
    }

    public final DayStreakItem copy(String date, boolean z11) {
        m.f(date, "date");
        return new DayStreakItem(date, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DayStreakItem)) {
            return false;
        }
        DayStreakItem dayStreakItem = (DayStreakItem) obj;
        return m.a(this.date, dayStreakItem.date) && this.useShield == dayStreakItem.useShield;
    }

    public final String getDate() {
        return this.date;
    }

    public final boolean getUseShield() {
        return this.useShield;
    }

    public int hashCode() {
        return Boolean.hashCode(this.useShield) + (this.date.hashCode() * 31);
    }

    public final void setUseShield(boolean z11) {
        this.useShield = z11;
    }

    public String toString() {
        return "DayStreakItem(date=" + this.date + ", useShield=" + this.useShield + ")";
    }
}
