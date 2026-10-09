package com.lingodeer.database.model;

import kotlin.jvm.internal.m;
import zt.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ChineseToneLevelEntity {
    private final long levelId;
    private final a levelName;
    private final a unitList;

    public ChineseToneLevelEntity(long j11, a aVar, a aVar2) {
        this.levelId = j11;
        this.levelName = aVar;
        this.unitList = aVar2;
    }

    public static /* synthetic */ ChineseToneLevelEntity copy$default(ChineseToneLevelEntity chineseToneLevelEntity, long j11, a aVar, a aVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = chineseToneLevelEntity.levelId;
        }
        if ((i11 & 2) != 0) {
            aVar = chineseToneLevelEntity.levelName;
        }
        if ((i11 & 4) != 0) {
            aVar2 = chineseToneLevelEntity.unitList;
        }
        return chineseToneLevelEntity.copy(j11, aVar, aVar2);
    }

    public final long component1() {
        return this.levelId;
    }

    public final a component2() {
        return this.levelName;
    }

    public final a component3() {
        return this.unitList;
    }

    public final ChineseToneLevelEntity copy(long j11, a aVar, a aVar2) {
        return new ChineseToneLevelEntity(j11, aVar, aVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChineseToneLevelEntity)) {
            return false;
        }
        ChineseToneLevelEntity chineseToneLevelEntity = (ChineseToneLevelEntity) obj;
        return this.levelId == chineseToneLevelEntity.levelId && m.a(this.levelName, chineseToneLevelEntity.levelName) && m.a(this.unitList, chineseToneLevelEntity.unitList);
    }

    public final long getLevelId() {
        return this.levelId;
    }

    public final a getLevelName() {
        return this.levelName;
    }

    public final a getUnitList() {
        return this.unitList;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.levelId) * 31;
        a aVar = this.levelName;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.unitList;
        return iHashCode2 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public String toString() {
        return "ChineseToneLevelEntity(levelId=" + this.levelId + ", levelName=" + this.levelName + ", unitList=" + this.unitList + ")";
    }
}
