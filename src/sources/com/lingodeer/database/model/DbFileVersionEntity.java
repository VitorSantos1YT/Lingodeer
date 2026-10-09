package com.lingodeer.database.model;

import com.google.android.material.datepicker.d;
import defpackage.e;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class DbFileVersionEntity {
    private final String fileName;
    private final long lastUpdateTime;
    private final boolean needUpdate;

    public DbFileVersionEntity(String fileName, long j11, boolean z11) {
        m.f(fileName, "fileName");
        this.fileName = fileName;
        this.lastUpdateTime = j11;
        this.needUpdate = z11;
    }

    public static /* synthetic */ DbFileVersionEntity copy$default(DbFileVersionEntity dbFileVersionEntity, String str, long j11, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dbFileVersionEntity.fileName;
        }
        if ((i11 & 2) != 0) {
            j11 = dbFileVersionEntity.lastUpdateTime;
        }
        if ((i11 & 4) != 0) {
            z11 = dbFileVersionEntity.needUpdate;
        }
        return dbFileVersionEntity.copy(str, j11, z11);
    }

    public final String component1() {
        return this.fileName;
    }

    public final long component2() {
        return this.lastUpdateTime;
    }

    public final boolean component3() {
        return this.needUpdate;
    }

    public final DbFileVersionEntity copy(String fileName, long j11, boolean z11) {
        m.f(fileName, "fileName");
        return new DbFileVersionEntity(fileName, j11, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DbFileVersionEntity)) {
            return false;
        }
        DbFileVersionEntity dbFileVersionEntity = (DbFileVersionEntity) obj;
        return m.a(this.fileName, dbFileVersionEntity.fileName) && this.lastUpdateTime == dbFileVersionEntity.lastUpdateTime && this.needUpdate == dbFileVersionEntity.needUpdate;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public final boolean getNeedUpdate() {
        return this.needUpdate;
    }

    public int hashCode() {
        return Boolean.hashCode(this.needUpdate) + e.f(this.lastUpdateTime, this.fileName.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.fileName;
        long j11 = this.lastUpdateTime;
        boolean z11 = this.needUpdate;
        StringBuilder sbM = d.m(j11, "DbFileVersionEntity(fileName=", str, ", lastUpdateTime=");
        sbM.append(", needUpdate=");
        sbM.append(z11);
        sbM.append(")");
        return sbM.toString();
    }
}
