package com.lingodeer.data.model;

import defpackage.e;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class DailyLearnWithLearnTimeHistory {
    private final int dayOfWeek;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22306id;
    private final int learnTime;

    /* JADX INFO: renamed from: xp, reason: collision with root package name */
    private final int f22307xp;

    public DailyLearnWithLearnTimeHistory(String id2, int i11, int i12, int i13) {
        m.f(id2, "id");
        this.f22306id = id2;
        this.f22307xp = i11;
        this.learnTime = i12;
        this.dayOfWeek = i13;
    }

    public static /* synthetic */ DailyLearnWithLearnTimeHistory copy$default(DailyLearnWithLearnTimeHistory dailyLearnWithLearnTimeHistory, String str, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = dailyLearnWithLearnTimeHistory.f22306id;
        }
        if ((i14 & 2) != 0) {
            i11 = dailyLearnWithLearnTimeHistory.f22307xp;
        }
        if ((i14 & 4) != 0) {
            i12 = dailyLearnWithLearnTimeHistory.learnTime;
        }
        if ((i14 & 8) != 0) {
            i13 = dailyLearnWithLearnTimeHistory.dayOfWeek;
        }
        return dailyLearnWithLearnTimeHistory.copy(str, i11, i12, i13);
    }

    public final String component1() {
        return this.f22306id;
    }

    public final int component2() {
        return this.f22307xp;
    }

    public final int component3() {
        return this.learnTime;
    }

    public final int component4() {
        return this.dayOfWeek;
    }

    public final DailyLearnWithLearnTimeHistory copy(String id2, int i11, int i12, int i13) {
        m.f(id2, "id");
        return new DailyLearnWithLearnTimeHistory(id2, i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailyLearnWithLearnTimeHistory)) {
            return false;
        }
        DailyLearnWithLearnTimeHistory dailyLearnWithLearnTimeHistory = (DailyLearnWithLearnTimeHistory) obj;
        return m.a(this.f22306id, dailyLearnWithLearnTimeHistory.f22306id) && this.f22307xp == dailyLearnWithLearnTimeHistory.f22307xp && this.learnTime == dailyLearnWithLearnTimeHistory.learnTime && this.dayOfWeek == dailyLearnWithLearnTimeHistory.dayOfWeek;
    }

    public final int getDayOfWeek() {
        return this.dayOfWeek;
    }

    public final String getId() {
        return this.f22306id;
    }

    public final int getLearnTime() {
        return this.learnTime;
    }

    public final int getXp() {
        return this.f22307xp;
    }

    public int hashCode() {
        return Integer.hashCode(this.dayOfWeek) + e.b(this.learnTime, e.b(this.f22307xp, this.f22306id.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.f22306id;
        int i11 = this.f22307xp;
        int i12 = this.learnTime;
        int i13 = this.dayOfWeek;
        StringBuilder sbQ = e.q(i11, "DailyLearnWithLearnTimeHistory(id=", str, ", xp=", ", learnTime=");
        sbQ.append(i12);
        sbQ.append(", dayOfWeek=");
        sbQ.append(i13);
        sbQ.append(")");
        return sbQ.toString();
    }

    public /* synthetic */ DailyLearnWithLearnTimeHistory(String str, int i11, int i12, int i13, int i14, f fVar) {
        this(str, i11, i12, (i14 & 8) != 0 ? 0 : i13);
    }
}
