package com.lingodeer.data.model;

import b7.e0;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.android.material.datepicker.d;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import g2.x;
import hh.p0;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import ry.r;
import w4.c;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseUnit {
    private final long activeColor;
    private final long activeDashLineColor;
    private final String activeIcon;
    private final String activeTopBannerRes;
    private final String description;
    private final int finishedLessonCount;
    private final String greyIcon;
    private final boolean hasAudioLesson;
    private final boolean isDownloaded;
    private final boolean isTestOut;
    private final boolean isTestOutActive;
    private final boolean isTestOutReview;
    private final String lessonList;
    private final long levelId;
    private final CourseUnit nextUnit;
    private final CourseUnit preUnit;
    private final int sortIndex;
    private final int testOutIndex;
    private final int totalLessonCount;
    private final UnitDirection unitDirection;
    private final long unitId;
    private final List<Long> unitList;
    private final String unitName;
    private final UnitState unitState;

    public /* synthetic */ CourseUnit(long j11, String str, String str2, String str3, int i11, long j12, boolean z11, List list, boolean z12, boolean z13, boolean z14, boolean z15, long j13, long j14, String str4, String str5, String str6, UnitState unitState, UnitDirection unitDirection, CourseUnit courseUnit, CourseUnit courseUnit2, int i12, int i13, int i14, f fVar) {
        this(j11, str, str2, str3, i11, j12, z11, list, z12, z13, z14, z15, j13, j14, str4, str5, str6, unitState, unitDirection, courseUnit, courseUnit2, i12, i13, i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-pls4pCs$default, reason: not valid java name */
    public static /* synthetic */ CourseUnit m213copypls4pCs$default(CourseUnit courseUnit, long j11, String str, String str2, String str3, int i11, long j12, boolean z11, List list, boolean z12, boolean z13, boolean z14, boolean z15, long j13, long j14, String str4, String str5, String str6, UnitState unitState, UnitDirection unitDirection, CourseUnit courseUnit2, CourseUnit courseUnit3, int i12, int i13, int i14, int i15, Object obj) {
        int i16;
        int i17;
        long j15 = (i15 & 1) != 0 ? courseUnit.unitId : j11;
        String str7 = (i15 & 2) != 0 ? courseUnit.unitName : str;
        String str8 = (i15 & 4) != 0 ? courseUnit.description : str2;
        String str9 = (i15 & 8) != 0 ? courseUnit.lessonList : str3;
        int i18 = (i15 & 16) != 0 ? courseUnit.sortIndex : i11;
        long j16 = (i15 & 32) != 0 ? courseUnit.levelId : j12;
        boolean z16 = (i15 & 64) != 0 ? courseUnit.isDownloaded : z11;
        List list2 = (i15 & 128) != 0 ? courseUnit.unitList : list;
        boolean z17 = (i15 & 256) != 0 ? courseUnit.isTestOutReview : z12;
        boolean z18 = (i15 & 512) != 0 ? courseUnit.isTestOut : z13;
        boolean z19 = (i15 & 1024) != 0 ? courseUnit.isTestOutActive : z14;
        boolean z20 = (i15 & 2048) != 0 ? courseUnit.hasAudioLesson : z15;
        long j17 = j15;
        long j18 = (i15 & 4096) != 0 ? courseUnit.activeColor : j13;
        long j19 = (i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? courseUnit.activeDashLineColor : j14;
        String str10 = (i15 & 16384) != 0 ? courseUnit.activeTopBannerRes : str4;
        String str11 = (32768 & i15) != 0 ? courseUnit.activeIcon : str5;
        String str12 = (i15 & 65536) != 0 ? courseUnit.greyIcon : str6;
        UnitState unitState2 = (i15 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? courseUnit.unitState : unitState;
        UnitDirection unitDirection2 = (i15 & 262144) != 0 ? courseUnit.unitDirection : unitDirection;
        CourseUnit courseUnit4 = (i15 & 524288) != 0 ? courseUnit.nextUnit : courseUnit2;
        CourseUnit courseUnit5 = (i15 & 1048576) != 0 ? courseUnit.preUnit : courseUnit3;
        int i19 = (i15 & 2097152) != 0 ? courseUnit.testOutIndex : i12;
        int i21 = (i15 & 4194304) != 0 ? courseUnit.totalLessonCount : i13;
        if ((i15 & 8388608) != 0) {
            i17 = i21;
            i16 = courseUnit.finishedLessonCount;
        } else {
            i16 = i14;
            i17 = i21;
        }
        return courseUnit.m216copypls4pCs(j17, str7, str8, str9, i18, j16, z16, list2, z17, z18, z19, z20, j18, j19, str10, str11, str12, unitState2, unitDirection2, courseUnit4, courseUnit5, i19, i17, i16);
    }

    public final long component1() {
        return this.unitId;
    }

    public final boolean component10() {
        return this.isTestOut;
    }

    public final boolean component11() {
        return this.isTestOutActive;
    }

    public final boolean component12() {
        return this.hasAudioLesson;
    }

    /* JADX INFO: renamed from: component13-0d7_KjU, reason: not valid java name */
    public final long m214component130d7_KjU() {
        return this.activeColor;
    }

    /* JADX INFO: renamed from: component14-0d7_KjU, reason: not valid java name */
    public final long m215component140d7_KjU() {
        return this.activeDashLineColor;
    }

    public final String component15() {
        return this.activeTopBannerRes;
    }

    public final String component16() {
        return this.activeIcon;
    }

    public final String component17() {
        return this.greyIcon;
    }

    public final UnitState component18() {
        return this.unitState;
    }

    public final UnitDirection component19() {
        return this.unitDirection;
    }

    public final String component2() {
        return this.unitName;
    }

    public final CourseUnit component20() {
        return this.nextUnit;
    }

    public final CourseUnit component21() {
        return this.preUnit;
    }

    public final int component22() {
        return this.testOutIndex;
    }

    public final int component23() {
        return this.totalLessonCount;
    }

    public final int component24() {
        return this.finishedLessonCount;
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

    public final boolean component7() {
        return this.isDownloaded;
    }

    public final List<Long> component8() {
        return this.unitList;
    }

    public final boolean component9() {
        return this.isTestOutReview;
    }

    /* JADX INFO: renamed from: copy-pls4pCs, reason: not valid java name */
    public final CourseUnit m216copypls4pCs(long j11, String unitName, String description, String lessonList, int i11, long j12, boolean z11, List<Long> unitList, boolean z12, boolean z13, boolean z14, boolean z15, long j13, long j14, String activeTopBannerRes, String str, String greyIcon, UnitState unitState, UnitDirection unitDirection, CourseUnit courseUnit, CourseUnit courseUnit2, int i12, int i13, int i14) {
        m.f(unitName, "unitName");
        m.f(description, "description");
        m.f(lessonList, "lessonList");
        m.f(unitList, "unitList");
        m.f(activeTopBannerRes, "activeTopBannerRes");
        m.f(str, anrPHlQ.fYxtIUaq);
        m.f(greyIcon, "greyIcon");
        m.f(unitState, "unitState");
        m.f(unitDirection, "unitDirection");
        return new CourseUnit(j11, unitName, description, lessonList, i11, j12, z11, unitList, z12, z13, z14, z15, j13, j14, activeTopBannerRes, str, greyIcon, unitState, unitDirection, courseUnit, courseUnit2, i12, i13, i14, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseUnit)) {
            return false;
        }
        CourseUnit courseUnit = (CourseUnit) obj;
        return this.unitId == courseUnit.unitId && m.a(this.unitName, courseUnit.unitName) && m.a(this.description, courseUnit.description) && m.a(this.lessonList, courseUnit.lessonList) && this.sortIndex == courseUnit.sortIndex && this.levelId == courseUnit.levelId && this.isDownloaded == courseUnit.isDownloaded && m.a(this.unitList, courseUnit.unitList) && this.isTestOutReview == courseUnit.isTestOutReview && this.isTestOut == courseUnit.isTestOut && this.isTestOutActive == courseUnit.isTestOutActive && this.hasAudioLesson == courseUnit.hasAudioLesson && x.d(this.activeColor, courseUnit.activeColor) && x.d(this.activeDashLineColor, courseUnit.activeDashLineColor) && m.a(this.activeTopBannerRes, courseUnit.activeTopBannerRes) && m.a(this.activeIcon, courseUnit.activeIcon) && m.a(this.greyIcon, courseUnit.greyIcon) && this.unitState == courseUnit.unitState && this.unitDirection == courseUnit.unitDirection && m.a(this.nextUnit, courseUnit.nextUnit) && m.a(this.preUnit, courseUnit.preUnit) && this.testOutIndex == courseUnit.testOutIndex && this.totalLessonCount == courseUnit.totalLessonCount && this.finishedLessonCount == courseUnit.finishedLessonCount;
    }

    /* JADX INFO: renamed from: getActiveColor-0d7_KjU, reason: not valid java name */
    public final long m217getActiveColor0d7_KjU() {
        return this.activeColor;
    }

    /* JADX INFO: renamed from: getActiveDashLineColor-0d7_KjU, reason: not valid java name */
    public final long m218getActiveDashLineColor0d7_KjU() {
        return this.activeDashLineColor;
    }

    public final String getActiveIcon() {
        return this.activeIcon;
    }

    public final String getActiveTopBannerRes() {
        return this.activeTopBannerRes;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getFinishedLessonCount() {
        return this.finishedLessonCount;
    }

    public final String getGreyIcon() {
        return this.greyIcon;
    }

    public final boolean getHasAudioLesson() {
        return this.hasAudioLesson;
    }

    public final String getLessonList() {
        return this.lessonList;
    }

    public final long getLevelId() {
        return this.levelId;
    }

    public final CourseUnit getNextUnit() {
        return this.nextUnit;
    }

    public final CourseUnit getPreUnit() {
        return this.preUnit;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    public final int getTestOutIndex() {
        return this.testOutIndex;
    }

    public final int getTotalLessonCount() {
        return this.totalLessonCount;
    }

    public final UnitDirection getUnitDirection() {
        return this.unitDirection;
    }

    public final long getUnitId() {
        return this.unitId;
    }

    public final List<Long> getUnitList() {
        return this.unitList;
    }

    public final String getUnitName() {
        return this.unitName;
    }

    public final UnitState getUnitState() {
        return this.unitState;
    }

    public int hashCode() {
        int iE = e.e(e.e(e.e(e.e(p0.b(e.e(e.f(this.levelId, e.b(this.sortIndex, e.d(e.d(e.d(Long.hashCode(this.unitId) * 31, 31, this.unitName), 31, this.description), 31, this.lessonList), 31), 31), 31, this.isDownloaded), 31, this.unitList), 31, this.isTestOutReview), 31, this.isTestOut), 31, this.isTestOutActive), 31, this.hasAudioLesson);
        long j11 = this.activeColor;
        int i11 = x.f28623j;
        int iHashCode = (this.unitDirection.hashCode() + ((this.unitState.hashCode() + e.d(e.d(e.d(e.f(this.activeDashLineColor, e.f(j11, iE, 31), 31), 31, this.activeTopBannerRes), 31, this.activeIcon), 31, this.greyIcon)) * 31)) * 31;
        CourseUnit courseUnit = this.nextUnit;
        int iHashCode2 = (iHashCode + (courseUnit == null ? 0 : courseUnit.hashCode())) * 31;
        CourseUnit courseUnit2 = this.preUnit;
        return Integer.hashCode(this.finishedLessonCount) + e.b(this.totalLessonCount, e.b(this.testOutIndex, (iHashCode2 + (courseUnit2 != null ? courseUnit2.hashCode() : 0)) * 31, 31), 31);
    }

    public final boolean isDownloaded() {
        return this.isDownloaded;
    }

    public final boolean isTestOut() {
        return this.isTestOut;
    }

    public final boolean isTestOutActive() {
        return this.isTestOutActive;
    }

    public final boolean isTestOutReview() {
        return this.isTestOutReview;
    }

    public String toString() {
        long j11 = this.unitId;
        String str = this.unitName;
        String str2 = this.description;
        String str3 = this.lessonList;
        int i11 = this.sortIndex;
        long j12 = this.levelId;
        boolean z11 = this.isDownloaded;
        List<Long> list = this.unitList;
        boolean z12 = this.isTestOutReview;
        boolean z13 = this.isTestOut;
        boolean z14 = this.isTestOutActive;
        boolean z15 = this.hasAudioLesson;
        String strJ = x.j(this.activeColor);
        String strJ2 = x.j(this.activeDashLineColor);
        String str4 = this.activeTopBannerRes;
        String str5 = this.activeIcon;
        String str6 = this.greyIcon;
        UnitState unitState = this.unitState;
        UnitDirection unitDirection = this.unitDirection;
        CourseUnit courseUnit = this.nextUnit;
        CourseUnit courseUnit2 = this.preUnit;
        int i12 = this.testOutIndex;
        int i13 = this.totalLessonCount;
        int i14 = this.finishedLessonCount;
        StringBuilder sbP = e0.p(j11, "CourseUnit(unitId=", ", unitName=", str);
        d.w(sbP, ", description=", str2, ", lessonList=", str3);
        sbP.append(", sortIndex=");
        sbP.append(i11);
        sbP.append(", levelId=");
        sbP.append(j12);
        sbP.append(", isDownloaded=");
        sbP.append(z11);
        sbP.append(", unitList=");
        sbP.append(list);
        sbP.append(", isTestOutReview=");
        sbP.append(z12);
        e0.z(", isTestOut=", ", isTestOutActive=", sbP, z13, z14);
        sbP.append(", hasAudioLesson=");
        sbP.append(z15);
        sbP.append(", activeColor=");
        sbP.append(strJ);
        d.w(sbP, ", activeDashLineColor=", strJ2, ", activeTopBannerRes=", str4);
        d.w(sbP, ", activeIcon=", str5, ", greyIcon=", str6);
        sbP.append(", unitState=");
        sbP.append(unitState);
        sbP.append(", unitDirection=");
        sbP.append(unitDirection);
        sbP.append(", nextUnit=");
        sbP.append(courseUnit);
        sbP.append(", preUnit=");
        sbP.append(courseUnit2);
        c.t(i12, i13, ", testOutIndex=", ", totalLessonCount=", sbP);
        sbP.append(", finishedLessonCount=");
        sbP.append(i14);
        sbP.append(")");
        return sbP.toString();
    }

    private CourseUnit(long j11, String unitName, String description, String lessonList, int i11, long j12, boolean z11, List<Long> unitList, boolean z12, boolean z13, boolean z14, boolean z15, long j13, long j14, String activeTopBannerRes, String activeIcon, String greyIcon, UnitState unitState, UnitDirection unitDirection, CourseUnit courseUnit, CourseUnit courseUnit2, int i12, int i13, int i14) {
        m.f(unitName, "unitName");
        m.f(description, "description");
        m.f(lessonList, "lessonList");
        m.f(unitList, "unitList");
        m.f(activeTopBannerRes, "activeTopBannerRes");
        m.f(activeIcon, "activeIcon");
        m.f(greyIcon, "greyIcon");
        m.f(unitState, "unitState");
        m.f(unitDirection, "unitDirection");
        this.unitId = j11;
        this.unitName = unitName;
        this.description = description;
        this.lessonList = lessonList;
        this.sortIndex = i11;
        this.levelId = j12;
        this.isDownloaded = z11;
        this.unitList = unitList;
        this.isTestOutReview = z12;
        this.isTestOut = z13;
        this.isTestOutActive = z14;
        this.hasAudioLesson = z15;
        this.activeColor = j13;
        this.activeDashLineColor = j14;
        this.activeTopBannerRes = activeTopBannerRes;
        this.activeIcon = activeIcon;
        this.greyIcon = greyIcon;
        this.unitState = unitState;
        this.unitDirection = unitDirection;
        this.nextUnit = courseUnit;
        this.preUnit = courseUnit2;
        this.testOutIndex = i12;
        this.totalLessonCount = i13;
        this.finishedLessonCount = i14;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CourseUnit(long j11, String str, String str2, String str3, int i11, long j12, boolean z11, List list, boolean z12, boolean z13, boolean z14, boolean z15, long j13, long j14, String str4, String str5, String str6, UnitState unitState, UnitDirection unitDirection, CourseUnit courseUnit, CourseUnit courseUnit2, int i12, int i13, int i14, int i15, f fVar) {
        long j15;
        long j16;
        boolean z16 = (i15 & 64) != 0 ? false : z11;
        List list2 = (i15 & 128) != 0 ? r.f50854a : list;
        boolean z17 = (i15 & 256) != 0 ? false : z12;
        boolean z18 = (i15 & 512) != 0 ? false : z13;
        boolean z19 = (i15 & 1024) != 0 ? false : z14;
        boolean z20 = (i15 & 2048) != 0 ? false : z15;
        if ((i15 & 4096) != 0) {
            int i16 = x.f28623j;
            j15 = x.f28621h;
        } else {
            j15 = j13;
        }
        if ((i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
            int i17 = x.f28623j;
            j16 = x.f28621h;
        } else {
            j16 = j14;
        }
        this(j11, str, str2, str3, i11, j12, z16, list2, z17, z18, z19, z20, j15, j16, (i15 & 16384) != 0 ? BuildConfig.VERSION_NAME : str4, (32768 & i15) != 0 ? BuildConfig.VERSION_NAME : str5, (65536 & i15) != 0 ? BuildConfig.VERSION_NAME : str6, (131072 & i15) != 0 ? UnitState.StateLocked : unitState, (262144 & i15) != 0 ? UnitDirection.Left : unitDirection, (524288 & i15) != 0 ? null : courseUnit, (1048576 & i15) != 0 ? null : courseUnit2, (2097152 & i15) != 0 ? 0 : i12, (4194304 & i15) != 0 ? 0 : i13, (i15 & 8388608) != 0 ? 0 : i14, null);
    }
}
