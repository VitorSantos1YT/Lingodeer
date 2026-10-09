package com.lingodeer.database.model;

import defpackage.e;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class DailyLearnTimeHistoryEntity {
    private final int baseTime;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22364id;
    private final int pendingSeconds;
    private final int seconds;

    public DailyLearnTimeHistoryEntity(String id2, int i11, int i12, int i13) {
        m.f(id2, "id");
        this.f22364id = id2;
        this.seconds = i11;
        this.baseTime = i12;
        this.pendingSeconds = i13;
    }

    public static /* synthetic */ DailyLearnTimeHistoryEntity copy$default(DailyLearnTimeHistoryEntity dailyLearnTimeHistoryEntity, String str, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = dailyLearnTimeHistoryEntity.f22364id;
        }
        if ((i14 & 2) != 0) {
            i11 = dailyLearnTimeHistoryEntity.seconds;
        }
        if ((i14 & 4) != 0) {
            i12 = dailyLearnTimeHistoryEntity.baseTime;
        }
        if ((i14 & 8) != 0) {
            i13 = dailyLearnTimeHistoryEntity.pendingSeconds;
        }
        return dailyLearnTimeHistoryEntity.copy(str, i11, i12, i13);
    }

    public final String component1() {
        return this.f22364id;
    }

    public final int component2() {
        return this.seconds;
    }

    public final int component3() {
        return this.baseTime;
    }

    public final int component4() {
        return this.pendingSeconds;
    }

    public final DailyLearnTimeHistoryEntity copy(String id2, int i11, int i12, int i13) {
        m.f(id2, "id");
        return new DailyLearnTimeHistoryEntity(id2, i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailyLearnTimeHistoryEntity)) {
            return false;
        }
        DailyLearnTimeHistoryEntity dailyLearnTimeHistoryEntity = (DailyLearnTimeHistoryEntity) obj;
        return m.a(this.f22364id, dailyLearnTimeHistoryEntity.f22364id) && this.seconds == dailyLearnTimeHistoryEntity.seconds && this.baseTime == dailyLearnTimeHistoryEntity.baseTime && this.pendingSeconds == dailyLearnTimeHistoryEntity.pendingSeconds;
    }

    public final int getBaseTime() {
        return this.baseTime;
    }

    public final String getId() {
        return this.f22364id;
    }

    public final int getPendingSeconds() {
        return this.pendingSeconds;
    }

    public final int getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        return Integer.hashCode(this.pendingSeconds) + e.b(this.baseTime, e.b(this.seconds, this.f22364id.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.f22364id;
        int i11 = this.seconds;
        int i12 = this.baseTime;
        int i13 = this.pendingSeconds;
        StringBuilder sbQ = e.q(i11, "DailyLearnTimeHistoryEntity(id=", str, ", seconds=", ", baseTime=");
        sbQ.append(i12);
        sbQ.append(", pendingSeconds=");
        sbQ.append(i13);
        sbQ.append(")");
        return sbQ.toString();
    }
}
