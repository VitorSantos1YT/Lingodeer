package com.lingodeer.data.model;

import com.lingodeer.database.model.DailyLearnHistoryEntity;
import kotlin.jvm.internal.m;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class DailyLearnHistoryKt {
    public static final DailyLearnHistoryEntity asEntityModel(DailyLearnHistory dailyLearnHistory) {
        m.f(dailyLearnHistory, "<this>");
        return new DailyLearnHistoryEntity(dailyLearnHistory.getId(), dailyLearnHistory.getAmount(), dailyLearnHistory.getBaseXP(), dailyLearnHistory.getPendingAmount());
    }

    public static final DailyLearnHistory asExternalModel(DailyLearnHistoryEntity dailyLearnHistoryEntity) {
        m.f(dailyLearnHistoryEntity, anrPHlQ.yRDzPLobSZJnK);
        return new DailyLearnHistory(dailyLearnHistoryEntity.getId(), dailyLearnHistoryEntity.getAmount(), dailyLearnHistoryEntity.getBaseXP(), dailyLearnHistoryEntity.getPendingAmount(), 0, 16, null);
    }
}
