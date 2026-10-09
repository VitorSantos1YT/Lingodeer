package com.lingodeer.data.model;

import b7.e0;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import defpackage.e;
import ep.a;
import hh.p0;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class DayStreakStatus {
    private final List<DailyStreakHistory> allHistoryItems;
    private final int dayStreak;
    private final String milestoneDate;
    private final ShareStreakType shareStreakType;
    private final List<DailyStreakHistory> streakedItems;
    private final TodayStreakType todayStreakType;
    private final int totalFreezeCount;
    private final int totalShieldCount;
    private final int usedShieldCount;

    public DayStreakStatus(int i11, TodayStreakType todayStreakType, ShareStreakType shareStreakType, String str, int i12, int i13, int i14, List<DailyStreakHistory> streakedItems, List<DailyStreakHistory> allHistoryItems) {
        m.f(todayStreakType, "todayStreakType");
        m.f(shareStreakType, "shareStreakType");
        m.f(streakedItems, "streakedItems");
        m.f(allHistoryItems, "allHistoryItems");
        this.dayStreak = i11;
        this.todayStreakType = todayStreakType;
        this.shareStreakType = shareStreakType;
        this.milestoneDate = str;
        this.usedShieldCount = i12;
        this.totalShieldCount = i13;
        this.totalFreezeCount = i14;
        this.streakedItems = streakedItems;
        this.allHistoryItems = allHistoryItems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DayStreakStatus copy$default(DayStreakStatus dayStreakStatus, int i11, TodayStreakType todayStreakType, ShareStreakType shareStreakType, String str, int i12, int i13, int i14, List list, List list2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = dayStreakStatus.dayStreak;
        }
        if ((i15 & 2) != 0) {
            todayStreakType = dayStreakStatus.todayStreakType;
        }
        if ((i15 & 4) != 0) {
            shareStreakType = dayStreakStatus.shareStreakType;
        }
        if ((i15 & 8) != 0) {
            str = dayStreakStatus.milestoneDate;
        }
        if ((i15 & 16) != 0) {
            i12 = dayStreakStatus.usedShieldCount;
        }
        if ((i15 & 32) != 0) {
            i13 = dayStreakStatus.totalShieldCount;
        }
        if ((i15 & 64) != 0) {
            i14 = dayStreakStatus.totalFreezeCount;
        }
        if ((i15 & 128) != 0) {
            list = dayStreakStatus.streakedItems;
        }
        if ((i15 & 256) != 0) {
            list2 = dayStreakStatus.allHistoryItems;
        }
        List list3 = list;
        List list4 = list2;
        int i16 = i13;
        int i17 = i14;
        int i18 = i12;
        ShareStreakType shareStreakType2 = shareStreakType;
        return dayStreakStatus.copy(i11, todayStreakType, shareStreakType2, str, i18, i16, i17, list3, list4);
    }

    public final int component1() {
        return this.dayStreak;
    }

    public final TodayStreakType component2() {
        return this.todayStreakType;
    }

    public final ShareStreakType component3() {
        return this.shareStreakType;
    }

    public final String component4() {
        return this.milestoneDate;
    }

    public final int component5() {
        return this.usedShieldCount;
    }

    public final int component6() {
        return this.totalShieldCount;
    }

    public final int component7() {
        return this.totalFreezeCount;
    }

    public final List<DailyStreakHistory> component8() {
        return this.streakedItems;
    }

    public final List<DailyStreakHistory> component9() {
        return this.allHistoryItems;
    }

    public final DayStreakStatus copy(int i11, TodayStreakType todayStreakType, ShareStreakType shareStreakType, String str, int i12, int i13, int i14, List<DailyStreakHistory> streakedItems, List<DailyStreakHistory> allHistoryItems) {
        m.f(todayStreakType, "todayStreakType");
        m.f(shareStreakType, "shareStreakType");
        m.f(streakedItems, "streakedItems");
        m.f(allHistoryItems, "allHistoryItems");
        return new DayStreakStatus(i11, todayStreakType, shareStreakType, str, i12, i13, i14, streakedItems, allHistoryItems);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DayStreakStatus)) {
            return false;
        }
        DayStreakStatus dayStreakStatus = (DayStreakStatus) obj;
        return this.dayStreak == dayStreakStatus.dayStreak && this.todayStreakType == dayStreakStatus.todayStreakType && this.shareStreakType == dayStreakStatus.shareStreakType && m.a(this.milestoneDate, dayStreakStatus.milestoneDate) && this.usedShieldCount == dayStreakStatus.usedShieldCount && this.totalShieldCount == dayStreakStatus.totalShieldCount && this.totalFreezeCount == dayStreakStatus.totalFreezeCount && m.a(this.streakedItems, dayStreakStatus.streakedItems) && m.a(this.allHistoryItems, dayStreakStatus.allHistoryItems);
    }

    public final List<DailyStreakHistory> getAllHistoryItems() {
        return this.allHistoryItems;
    }

    public final int getDayStreak() {
        return this.dayStreak;
    }

    public final String getMilestoneDate() {
        return this.milestoneDate;
    }

    public final ShareStreakType getShareStreakType() {
        return this.shareStreakType;
    }

    public final List<DailyStreakHistory> getStreakedItems() {
        return this.streakedItems;
    }

    public final TodayStreakType getTodayStreakType() {
        return this.todayStreakType;
    }

    public final int getTotalFreezeCount() {
        return this.totalFreezeCount;
    }

    public final int getTotalShieldCount() {
        return this.totalShieldCount;
    }

    public final int getUsedShieldCount() {
        return this.usedShieldCount;
    }

    public int hashCode() {
        int iHashCode = (this.shareStreakType.hashCode() + ((this.todayStreakType.hashCode() + (Integer.hashCode(this.dayStreak) * 31)) * 31)) * 31;
        String str = this.milestoneDate;
        return this.allHistoryItems.hashCode() + p0.b(e.b(this.totalFreezeCount, e.b(this.totalShieldCount, e.b(this.usedShieldCount, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31, this.streakedItems);
    }

    public String toString() {
        int i11 = this.dayStreak;
        TodayStreakType todayStreakType = this.todayStreakType;
        ShareStreakType shareStreakType = this.shareStreakType;
        String str = this.milestoneDate;
        int i12 = this.usedShieldCount;
        int i13 = this.totalShieldCount;
        int i14 = this.totalFreezeCount;
        List<DailyStreakHistory> list = this.streakedItems;
        List<DailyStreakHistory> list2 = this.allHistoryItems;
        StringBuilder sb2 = new StringBuilder("DayStreakStatus(dayStreak=");
        sb2.append(i11);
        sb2.append(", todayStreakType=");
        sb2.append(todayStreakType);
        sb2.append(", shareStreakType=");
        sb2.append(shareStreakType);
        sb2.append(", milestoneDate=");
        sb2.append(str);
        sb2.append(", usedShieldCount=");
        a.v(i12, i13, ", totalShieldCount=", ", totalFreezeCount=", sb2);
        sb2.append(i14);
        sb2.append(", streakedItems=");
        sb2.append(list);
        sb2.append(", allHistoryItems=");
        return e0.n(sb2, list2, ypOOxsaJG.zOgQjr);
    }

    public /* synthetic */ DayStreakStatus(int i11, TodayStreakType todayStreakType, ShareStreakType shareStreakType, String str, int i12, int i13, int i14, List list, List list2, int i15, f fVar) {
        this(i11, todayStreakType, shareStreakType, (i15 & 8) != 0 ? null : str, i12, i13, i14, list, list2);
    }
}
