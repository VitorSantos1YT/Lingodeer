package com.lingodeer.data.model;

import com.lingodeer.database.model.DailyStreakHistoryEntity;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class DailyStreakHistoryKt {
    public static final DailyStreakHistoryEntity asEntityModel(DailyStreakHistory dailyStreakHistory) {
        m.f(dailyStreakHistory, "<this>");
        return new DailyStreakHistoryEntity(dailyStreakHistory.getId(), dailyStreakHistory.getType(), dailyStreakHistory.getPendingType());
    }

    public static final DailyStreakHistory asExternalModel(DailyStreakHistoryEntity dailyStreakHistoryEntity) {
        m.f(dailyStreakHistoryEntity, "<this>");
        return new DailyStreakHistory(dailyStreakHistoryEntity.getId(), dailyStreakHistoryEntity.getType(), dailyStreakHistoryEntity.getPendingType(), 0, 8, null);
    }
}
