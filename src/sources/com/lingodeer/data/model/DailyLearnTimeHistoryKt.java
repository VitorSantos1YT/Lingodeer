package com.lingodeer.data.model;

import com.lingodeer.database.model.DailyLearnTimeHistoryEntity;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class DailyLearnTimeHistoryKt {
    public static final DailyLearnTimeHistoryEntity asEntityModel(DailyLearnTimeHistory dailyLearnTimeHistory) {
        m.f(dailyLearnTimeHistory, "<this>");
        return new DailyLearnTimeHistoryEntity(dailyLearnTimeHistory.getId(), dailyLearnTimeHistory.getSeconds(), dailyLearnTimeHistory.getBaseTime(), dailyLearnTimeHistory.getPendingSeconds());
    }

    public static final DailyLearnTimeHistory asExternalModel(DailyLearnTimeHistoryEntity dailyLearnTimeHistoryEntity) {
        m.f(dailyLearnTimeHistoryEntity, "<this>");
        return new DailyLearnTimeHistory(dailyLearnTimeHistoryEntity.getId(), dailyLearnTimeHistoryEntity.getSeconds(), dailyLearnTimeHistoryEntity.getBaseTime(), dailyLearnTimeHistoryEntity.getPendingSeconds());
    }
}
