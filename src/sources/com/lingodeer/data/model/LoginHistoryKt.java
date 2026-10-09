package com.lingodeer.data.model;

import com.lingodeer.database.model.LoginHistoryEntity;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class LoginHistoryKt {
    public static final LoginHistoryEntity asEntityModel(LoginHistory loginHistory) {
        m.f(loginHistory, "<this>");
        return new LoginHistoryEntity(loginHistory.getUid(), loginHistory.getNickName(), loginHistory.getEmail(), loginHistory.getAccountType(), loginHistory.isMember(), loginHistory.getLearningLan(), loginHistory.getUiLan(), loginHistory.getLastLogOutTime());
    }

    public static final LoginHistory asExternalModel(LoginHistoryEntity loginHistoryEntity) {
        m.f(loginHistoryEntity, "<this>");
        return new LoginHistory(loginHistoryEntity.getUid(), loginHistoryEntity.getNickName(), loginHistoryEntity.getEmail(), loginHistoryEntity.getAccountType(), loginHistoryEntity.isMember(), loginHistoryEntity.getLearningLan(), loginHistoryEntity.getUiLan(), loginHistoryEntity.getLastLogOutTime());
    }
}
