package com.lingodeer.data.model;

import com.lingodeer.database.model.DailyGemHistoryEntity;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class DailyGemHistoryKt {
    public static final DailyGemHistoryEntity asEntityModel(DailyGemHistory dailyGemHistory) {
        m.f(dailyGemHistory, "<this>");
        return new DailyGemHistoryEntity(dailyGemHistory.getId(), dailyGemHistory.getAmount(), dailyGemHistory.getType(), dailyGemHistory.getPendingAmount(), dailyGemHistory.getDescription());
    }

    public static final DailyGemHistory asExternalModel(DailyGemHistoryEntity dailyGemHistoryEntity) {
        m.f(dailyGemHistoryEntity, "<this>");
        return new DailyGemHistory(dailyGemHistoryEntity.getId(), dailyGemHistoryEntity.getAmount(), dailyGemHistoryEntity.getType(), dailyGemHistoryEntity.getPendingAmount(), dailyGemHistoryEntity.getDescription(), 0, 32, null);
    }
}
