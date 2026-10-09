package com.lingodeer.data.model;

import com.lingodeer.database.model.DbFileVersionEntity;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class DbFileVersionKt {
    public static final DbFileVersionEntity asEntityModel(DbFileVersion dbFileVersion) {
        m.f(dbFileVersion, "<this>");
        return new DbFileVersionEntity(dbFileVersion.getFileName(), dbFileVersion.getLastUpdateTime(), dbFileVersion.getNeedUpdate());
    }

    public static final DbFileVersion asExternalModel(DbFileVersionEntity dbFileVersionEntity) {
        m.f(dbFileVersionEntity, "<this>");
        return new DbFileVersion(dbFileVersionEntity.getFileName(), dbFileVersionEntity.getLastUpdateTime(), dbFileVersionEntity.getNeedUpdate());
    }
}
