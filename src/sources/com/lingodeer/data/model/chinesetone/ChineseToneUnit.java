package com.lingodeer.data.model.chinesetone;

import b7.e0;
import com.google.android.material.datepicker.d;
import defpackage.e;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ChineseToneUnit {
    private final String description;
    private final String iconResSuffix;
    private final String lessonList;
    private final List<ChineseToneLesson> lessons;
    private final long levelId;
    private final int sortIndex;
    private final long unitId;
    private final String unitName;

    public ChineseToneUnit(long j11, String unitName, String description, String lessonList, int i11, long j12, String iconResSuffix, List<ChineseToneLesson> lessons) {
        m.f(unitName, "unitName");
        m.f(description, "description");
        m.f(lessonList, "lessonList");
        m.f(iconResSuffix, "iconResSuffix");
        m.f(lessons, "lessons");
        this.unitId = j11;
        this.unitName = unitName;
        this.description = description;
        this.lessonList = lessonList;
        this.sortIndex = i11;
        this.levelId = j12;
        this.iconResSuffix = iconResSuffix;
        this.lessons = lessons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChineseToneUnit copy$default(ChineseToneUnit chineseToneUnit, long j11, String str, String str2, String str3, int i11, long j12, String str4, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = chineseToneUnit.unitId;
        }
        long j13 = j11;
        if ((i12 & 2) != 0) {
            str = chineseToneUnit.unitName;
        }
        String str5 = str;
        if ((i12 & 4) != 0) {
            str2 = chineseToneUnit.description;
        }
        return chineseToneUnit.copy(j13, str5, str2, (i12 & 8) != 0 ? chineseToneUnit.lessonList : str3, (i12 & 16) != 0 ? chineseToneUnit.sortIndex : i11, (i12 & 32) != 0 ? chineseToneUnit.levelId : j12, (i12 & 64) != 0 ? chineseToneUnit.iconResSuffix : str4, (i12 & 128) != 0 ? chineseToneUnit.lessons : list);
    }

    public final long component1() {
        return this.unitId;
    }

    public final String component2() {
        return this.unitName;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.lessonList;
    }

    public final int component5() {
        return this.sortIndex;
    }

    public final long component6() {
        return this.levelId;
    }

    public final String component7() {
        return this.iconResSuffix;
    }

    public final List<ChineseToneLesson> component8() {
        return this.lessons;
    }

    public final ChineseToneUnit copy(long j11, String unitName, String description, String lessonList, int i11, long j12, String iconResSuffix, List<ChineseToneLesson> lessons) {
        m.f(unitName, "unitName");
        m.f(description, "description");
        m.f(lessonList, "lessonList");
        m.f(iconResSuffix, "iconResSuffix");
        m.f(lessons, "lessons");
        return new ChineseToneUnit(j11, unitName, description, lessonList, i11, j12, iconResSuffix, lessons);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChineseToneUnit)) {
            return false;
        }
        ChineseToneUnit chineseToneUnit = (ChineseToneUnit) obj;
        return this.unitId == chineseToneUnit.unitId && m.a(this.unitName, chineseToneUnit.unitName) && m.a(this.description, chineseToneUnit.description) && m.a(this.lessonList, chineseToneUnit.lessonList) && this.sortIndex == chineseToneUnit.sortIndex && this.levelId == chineseToneUnit.levelId && m.a(this.iconResSuffix, chineseToneUnit.iconResSuffix) && m.a(this.lessons, chineseToneUnit.lessons);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIconResSuffix() {
        return this.iconResSuffix;
    }

    public final String getLessonList() {
        return this.lessonList;
    }

    public final List<ChineseToneLesson> getLessons() {
        return this.lessons;
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

    public final String getUnitName() {
        return this.unitName;
    }

    public int hashCode() {
        return this.lessons.hashCode() + e.d(e.f(this.levelId, e.b(this.sortIndex, e.d(e.d(e.d(Long.hashCode(this.unitId) * 31, 31, this.unitName), 31, this.description), 31, this.lessonList), 31), 31), 31, this.iconResSuffix);
    }

    public String toString() {
        long j11 = this.unitId;
        String str = this.unitName;
        String str2 = this.description;
        String str3 = this.lessonList;
        int i11 = this.sortIndex;
        long j12 = this.levelId;
        String str4 = this.iconResSuffix;
        List<ChineseToneLesson> list = this.lessons;
        StringBuilder sbP = e0.p(j11, "ChineseToneUnit(unitId=", ", unitName=", str);
        d.w(sbP, ", description=", str2, ", lessonList=", str3);
        sbP.append(", sortIndex=");
        sbP.append(i11);
        sbP.append(", levelId=");
        e0.w(j12, ", iconResSuffix=", str4, sbP);
        sbP.append(", lessons=");
        sbP.append(list);
        sbP.append(")");
        return sbP.toString();
    }

    public /* synthetic */ ChineseToneUnit(long j11, String str, String str2, String str3, int i11, long j12, String str4, List list, int i12, f fVar) {
        this(j11, str, str2, str3, i11, j12, str4, (i12 & 128) != 0 ? r.f50854a : list);
    }
}
