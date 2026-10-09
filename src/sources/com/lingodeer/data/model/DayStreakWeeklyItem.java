package com.lingodeer.data.model;

import defpackage.e;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class DayStreakWeeklyItem {
    private final String date;
    private DayStreakWeeklyItemStatus status;
    private final int weekDay;

    public DayStreakWeeklyItem(String date, int i11, DayStreakWeeklyItemStatus status) {
        m.f(date, "date");
        m.f(status, "status");
        this.date = date;
        this.weekDay = i11;
        this.status = status;
    }

    public static /* synthetic */ DayStreakWeeklyItem copy$default(DayStreakWeeklyItem dayStreakWeeklyItem, String str, int i11, DayStreakWeeklyItemStatus dayStreakWeeklyItemStatus, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = dayStreakWeeklyItem.date;
        }
        if ((i12 & 2) != 0) {
            i11 = dayStreakWeeklyItem.weekDay;
        }
        if ((i12 & 4) != 0) {
            dayStreakWeeklyItemStatus = dayStreakWeeklyItem.status;
        }
        return dayStreakWeeklyItem.copy(str, i11, dayStreakWeeklyItemStatus);
    }

    public final String component1() {
        return this.date;
    }

    public final int component2() {
        return this.weekDay;
    }

    public final DayStreakWeeklyItemStatus component3() {
        return this.status;
    }

    public final DayStreakWeeklyItem copy(String date, int i11, DayStreakWeeklyItemStatus status) {
        m.f(date, "date");
        m.f(status, "status");
        return new DayStreakWeeklyItem(date, i11, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DayStreakWeeklyItem)) {
            return false;
        }
        DayStreakWeeklyItem dayStreakWeeklyItem = (DayStreakWeeklyItem) obj;
        return m.a(this.date, dayStreakWeeklyItem.date) && this.weekDay == dayStreakWeeklyItem.weekDay && this.status == dayStreakWeeklyItem.status;
    }

    public final String getDate() {
        return this.date;
    }

    public final DayStreakWeeklyItemStatus getStatus() {
        return this.status;
    }

    public final int getWeekDay() {
        return this.weekDay;
    }

    public int hashCode() {
        return this.status.hashCode() + e.b(this.weekDay, this.date.hashCode() * 31, 31);
    }

    public final void setStatus(DayStreakWeeklyItemStatus dayStreakWeeklyItemStatus) {
        m.f(dayStreakWeeklyItemStatus, "<set-?>");
        this.status = dayStreakWeeklyItemStatus;
    }

    public String toString() {
        String str = this.date;
        int i11 = this.weekDay;
        DayStreakWeeklyItemStatus dayStreakWeeklyItemStatus = this.status;
        StringBuilder sbQ = e.q(i11, "DayStreakWeeklyItem(date=", str, ", weekDay=", ", status=");
        sbQ.append(dayStreakWeeklyItemStatus);
        sbQ.append(")");
        return sbQ.toString();
    }
}
