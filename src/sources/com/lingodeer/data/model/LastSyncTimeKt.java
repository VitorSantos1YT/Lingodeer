package com.lingodeer.data.model;

import com.lingodeer.database.model.LastSyncTimeEntity;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class LastSyncTimeKt {
    public static final LastSyncTimeEntity asEntityModel(LastSyncTime lastSyncTime) {
        m.f(lastSyncTime, "<this>");
        return new LastSyncTimeEntity(lastSyncTime.getId(), lastSyncTime.getLastSyncTime());
    }

    public static final LastSyncTime asExternalModel(LastSyncTimeEntity lastSyncTimeEntity) {
        m.f(lastSyncTimeEntity, "<this>");
        return new LastSyncTime(lastSyncTimeEntity.getId(), lastSyncTimeEntity.getLastSyncTime());
    }
}
