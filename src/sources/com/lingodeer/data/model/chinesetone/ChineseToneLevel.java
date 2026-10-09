package com.lingodeer.data.model.chinesetone;

import b7.e0;
import defpackage.e;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ChineseToneLevel {
    private final long levelId;
    private final String levelName;
    private final String unitList;
    private final List<ChineseToneUnit> units;

    public ChineseToneLevel(long j11, String levelName, String unitList, List<ChineseToneUnit> units) {
        m.f(levelName, "levelName");
        m.f(unitList, "unitList");
        m.f(units, "units");
        this.levelId = j11;
        this.levelName = levelName;
        this.unitList = unitList;
        this.units = units;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChineseToneLevel copy$default(ChineseToneLevel chineseToneLevel, long j11, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = chineseToneLevel.levelId;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = chineseToneLevel.levelName;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            str2 = chineseToneLevel.unitList;
        }
        String str4 = str2;
        if ((i11 & 8) != 0) {
            list = chineseToneLevel.units;
        }
        return chineseToneLevel.copy(j12, str3, str4, list);
    }

    public final long component1() {
        return this.levelId;
    }

    public final String component2() {
        return this.levelName;
    }

    public final String component3() {
        return this.unitList;
    }

    public final List<ChineseToneUnit> component4() {
        return this.units;
    }

    public final ChineseToneLevel copy(long j11, String levelName, String unitList, List<ChineseToneUnit> units) {
        m.f(levelName, "levelName");
        m.f(unitList, "unitList");
        m.f(units, "units");
        return new ChineseToneLevel(j11, levelName, unitList, units);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChineseToneLevel)) {
            return false;
        }
        ChineseToneLevel chineseToneLevel = (ChineseToneLevel) obj;
        return this.levelId == chineseToneLevel.levelId && m.a(this.levelName, chineseToneLevel.levelName) && m.a(this.unitList, chineseToneLevel.unitList) && m.a(this.units, chineseToneLevel.units);
    }

    public final long getLevelId() {
        return this.levelId;
    }

    public final String getLevelName() {
        return this.levelName;
    }

    public final String getUnitList() {
        return this.unitList;
    }

    public final List<ChineseToneUnit> getUnits() {
        return this.units;
    }

    public int hashCode() {
        return this.units.hashCode() + e.d(e.d(Long.hashCode(this.levelId) * 31, 31, this.levelName), 31, this.unitList);
    }

    public String toString() {
        long j11 = this.levelId;
        String str = this.levelName;
        String str2 = this.unitList;
        List<ChineseToneUnit> list = this.units;
        StringBuilder sbP = e0.p(j11, "ChineseToneLevel(levelId=", ", levelName=", str);
        sbP.append(", unitList=");
        sbP.append(str2);
        sbP.append(", units=");
        sbP.append(list);
        sbP.append(")");
        return sbP.toString();
    }

    public /* synthetic */ ChineseToneLevel(long j11, String str, String str2, List list, int i11, f fVar) {
        this(j11, str, str2, (i11 & 8) != 0 ? r.f50854a : list);
    }
}
