package com.lingodeer.database.model;

import com.google.android.material.datepicker.d;
import defpackage.e;
import kotlin.jvm.internal.m;
import zt.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ChineseToneUnitEntity {
    private final a description;
    private final a iconResSuffix;
    private final a lessonList;
    private final long levelId;
    private final int sortIndex;
    private final long unitId;
    private final a unitName;

    public ChineseToneUnitEntity(long j11, a aVar, a aVar2, a aVar3, int i11, long j12, a aVar4) {
        this.unitId = j11;
        this.unitName = aVar;
        this.description = aVar2;
        this.lessonList = aVar3;
        this.sortIndex = i11;
        this.levelId = j12;
        this.iconResSuffix = aVar4;
    }

    public static /* synthetic */ ChineseToneUnitEntity copy$default(ChineseToneUnitEntity chineseToneUnitEntity, long j11, a aVar, a aVar2, a aVar3, int i11, long j12, a aVar4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = chineseToneUnitEntity.unitId;
        }
        long j13 = j11;
        if ((i12 & 2) != 0) {
            aVar = chineseToneUnitEntity.unitName;
        }
        a aVar5 = aVar;
        if ((i12 & 4) != 0) {
            aVar2 = chineseToneUnitEntity.description;
        }
        a aVar6 = aVar2;
        if ((i12 & 8) != 0) {
            aVar3 = chineseToneUnitEntity.lessonList;
        }
        return chineseToneUnitEntity.copy(j13, aVar5, aVar6, aVar3, (i12 & 16) != 0 ? chineseToneUnitEntity.sortIndex : i11, (i12 & 32) != 0 ? chineseToneUnitEntity.levelId : j12, (i12 & 64) != 0 ? chineseToneUnitEntity.iconResSuffix : aVar4);
    }

    public final long component1() {
        return this.unitId;
    }

    public final a component2() {
        return this.unitName;
    }

    public final a component3() {
        return this.description;
    }

    public final a component4() {
        return this.lessonList;
    }

    public final int component5() {
        return this.sortIndex;
    }

    public final long component6() {
        return this.levelId;
    }

    public final a component7() {
        return this.iconResSuffix;
    }

    public final ChineseToneUnitEntity copy(long j11, a aVar, a aVar2, a aVar3, int i11, long j12, a aVar4) {
        return new ChineseToneUnitEntity(j11, aVar, aVar2, aVar3, i11, j12, aVar4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChineseToneUnitEntity)) {
            return false;
        }
        ChineseToneUnitEntity chineseToneUnitEntity = (ChineseToneUnitEntity) obj;
        return this.unitId == chineseToneUnitEntity.unitId && m.a(this.unitName, chineseToneUnitEntity.unitName) && m.a(this.description, chineseToneUnitEntity.description) && m.a(this.lessonList, chineseToneUnitEntity.lessonList) && this.sortIndex == chineseToneUnitEntity.sortIndex && this.levelId == chineseToneUnitEntity.levelId && m.a(this.iconResSuffix, chineseToneUnitEntity.iconResSuffix);
    }

    public final a getDescription() {
        return this.description;
    }

    public final a getIconResSuffix() {
        return this.iconResSuffix;
    }

    public final a getLessonList() {
        return this.lessonList;
    }

    public final long getLevelId() {
        return this.levelId;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    public final long getUnitId() {
        return this.unitId;
    }

    public final a getUnitName() {
        return this.unitName;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.unitId) * 31;
        a aVar = this.unitName;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.description;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        a aVar3 = this.lessonList;
        int iF = e.f(this.levelId, e.b(this.sortIndex, (iHashCode3 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31, 31), 31);
        a aVar4 = this.iconResSuffix;
        return iF + (aVar4 != null ? aVar4.hashCode() : 0);
    }

    public String toString() {
        long j11 = this.unitId;
        a aVar = this.unitName;
        a aVar2 = this.description;
        a aVar3 = this.lessonList;
        int i11 = this.sortIndex;
        long j12 = this.levelId;
        a aVar4 = this.iconResSuffix;
        StringBuilder sb2 = new StringBuilder("ChineseToneUnitEntity(unitId=");
        sb2.append(j11);
        sb2.append(", unitName=");
        sb2.append(aVar);
        d.y(sb2, ", description=", aVar2, ", lessonList=", aVar3);
        sb2.append(", sortIndex=");
        sb2.append(i11);
        sb2.append(", levelId=");
        sb2.append(j12);
        sb2.append(", iconResSuffix=");
        sb2.append(aVar4);
        sb2.append(")");
        return sb2.toString();
    }
}
