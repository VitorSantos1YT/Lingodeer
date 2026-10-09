package com.lingodeer.database.model;

import defpackage.e;
import ep.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class DailyStreakHistoryEntity {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22365id;
    private final String pendingType;
    private final String type;

    public DailyStreakHistoryEntity(String id2, String type, String pendingType) {
        m.f(id2, "id");
        m.f(type, "type");
        m.f(pendingType, "pendingType");
        this.f22365id = id2;
        this.type = type;
        this.pendingType = pendingType;
    }

    public static /* synthetic */ DailyStreakHistoryEntity copy$default(DailyStreakHistoryEntity dailyStreakHistoryEntity, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dailyStreakHistoryEntity.f22365id;
        }
        if ((i11 & 2) != 0) {
            str2 = dailyStreakHistoryEntity.type;
        }
        if ((i11 & 4) != 0) {
            str3 = dailyStreakHistoryEntity.pendingType;
        }
        return dailyStreakHistoryEntity.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f22365id;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.pendingType;
    }

    public final DailyStreakHistoryEntity copy(String id2, String type, String pendingType) {
        m.f(id2, "id");
        m.f(type, "type");
        m.f(pendingType, "pendingType");
        return new DailyStreakHistoryEntity(id2, type, pendingType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailyStreakHistoryEntity)) {
            return false;
        }
        DailyStreakHistoryEntity dailyStreakHistoryEntity = (DailyStreakHistoryEntity) obj;
        return m.a(this.f22365id, dailyStreakHistoryEntity.f22365id) && m.a(this.type, dailyStreakHistoryEntity.type) && m.a(this.pendingType, dailyStreakHistoryEntity.pendingType);
    }

    public final String getId() {
        return this.f22365id;
    }

    public final String getPendingType() {
        return this.pendingType;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.pendingType.hashCode() + e.d(this.f22365id.hashCode() * 31, 31, this.type);
    }

    public String toString() {
        String str = this.f22365id;
        String str2 = this.type;
        return a.k(e.s("DailyStreakHistoryEntity(id=", str, ", type=", str2, ", pendingType="), this.pendingType, ")");
    }
}
