package com.lingodeer.data.model;

import b7.e0;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.android.material.datepicker.d;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseLesson {
    private final boolean canAccess;
    private final boolean canReview;
    private final String challengeRegex;
    private final String characterList;
    private final String description;
    private final CourseLessonFinishStatus finishStatus;
    private final boolean isCurrentOpen;
    private final String lastRegex;
    private final long lessonId;
    private final String lessonName;
    private final LessonState lessonState;
    private final LessonType lessonType;
    private final String normalRegex;
    private final int positionType;
    private final LessonState preLessonState;
    private final String repeatRegex;
    private final String sentenceList;
    private final boolean showCharacterDrill;
    private final boolean showPracticeComprehensive;
    private final boolean showPracticeSpeaking;
    private final int sortIndex;
    private final long unitId;
    private final String unitName;
    private final int unitSortIndex;
    private final String wordList;

    public CourseLesson(long j11, String lessonName, String description, int i11, String normalRegex, String lastRegex, String repeatRegex, String challengeRegex, String wordList, String sentenceList, String characterList, long j12, String unitName, int i12, boolean z11, boolean z12, boolean z13, CourseLessonFinishStatus courseLessonFinishStatus, boolean z14, boolean z15, boolean z16, int i13, LessonState preLessonState, LessonState lessonState, LessonType lessonType) {
        m.f(lessonName, "lessonName");
        m.f(description, "description");
        m.f(normalRegex, "normalRegex");
        m.f(lastRegex, "lastRegex");
        m.f(repeatRegex, "repeatRegex");
        m.f(challengeRegex, "challengeRegex");
        m.f(wordList, "wordList");
        m.f(sentenceList, "sentenceList");
        m.f(characterList, "characterList");
        m.f(unitName, "unitName");
        m.f(preLessonState, "preLessonState");
        m.f(lessonState, "lessonState");
        m.f(lessonType, "lessonType");
        this.lessonId = j11;
        this.lessonName = lessonName;
        this.description = description;
        this.sortIndex = i11;
        this.normalRegex = normalRegex;
        this.lastRegex = lastRegex;
        this.repeatRegex = repeatRegex;
        this.challengeRegex = challengeRegex;
        this.wordList = wordList;
        this.sentenceList = sentenceList;
        this.characterList = characterList;
        this.unitId = j12;
        this.unitName = unitName;
        this.positionType = i12;
        this.isCurrentOpen = z11;
        this.canAccess = z12;
        this.canReview = z13;
        this.finishStatus = courseLessonFinishStatus;
        this.showPracticeComprehensive = z14;
        this.showPracticeSpeaking = z15;
        this.showCharacterDrill = z16;
        this.unitSortIndex = i13;
        this.preLessonState = preLessonState;
        this.lessonState = lessonState;
        this.lessonType = lessonType;
    }

    public static /* synthetic */ CourseLesson copy$default(CourseLesson courseLesson, long j11, String str, String str2, int i11, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j12, String str10, int i12, boolean z11, boolean z12, boolean z13, CourseLessonFinishStatus courseLessonFinishStatus, boolean z14, boolean z15, boolean z16, int i13, LessonState lessonState, LessonState lessonState2, LessonType lessonType, int i14, Object obj) {
        LessonType lessonType2;
        LessonState lessonState3;
        long j13 = (i14 & 1) != 0 ? courseLesson.lessonId : j11;
        String str11 = (i14 & 2) != 0 ? courseLesson.lessonName : str;
        String str12 = (i14 & 4) != 0 ? courseLesson.description : str2;
        int i15 = (i14 & 8) != 0 ? courseLesson.sortIndex : i11;
        String str13 = (i14 & 16) != 0 ? courseLesson.normalRegex : str3;
        String str14 = (i14 & 32) != 0 ? courseLesson.lastRegex : str4;
        String str15 = (i14 & 64) != 0 ? courseLesson.repeatRegex : str5;
        String str16 = (i14 & 128) != 0 ? courseLesson.challengeRegex : str6;
        String str17 = (i14 & 256) != 0 ? courseLesson.wordList : str7;
        String str18 = (i14 & 512) != 0 ? courseLesson.sentenceList : str8;
        String str19 = (i14 & 1024) != 0 ? courseLesson.characterList : str9;
        long j14 = (i14 & 2048) != 0 ? courseLesson.unitId : j12;
        long j15 = j13;
        String str20 = (i14 & 4096) != 0 ? courseLesson.unitName : str10;
        int i16 = (i14 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? courseLesson.positionType : i12;
        String str21 = str20;
        boolean z17 = (i14 & 16384) != 0 ? courseLesson.isCurrentOpen : z11;
        boolean z18 = (i14 & 32768) != 0 ? courseLesson.canAccess : z12;
        boolean z19 = (i14 & 65536) != 0 ? courseLesson.canReview : z13;
        CourseLessonFinishStatus courseLessonFinishStatus2 = (i14 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? courseLesson.finishStatus : courseLessonFinishStatus;
        boolean z20 = (i14 & 262144) != 0 ? courseLesson.showPracticeComprehensive : z14;
        boolean z21 = (i14 & 524288) != 0 ? courseLesson.showPracticeSpeaking : z15;
        boolean z22 = (i14 & 1048576) != 0 ? courseLesson.showCharacterDrill : z16;
        int i17 = (i14 & 2097152) != 0 ? courseLesson.unitSortIndex : i13;
        LessonState lessonState4 = (i14 & 4194304) != 0 ? courseLesson.preLessonState : lessonState;
        LessonState lessonState5 = (i14 & 8388608) != 0 ? courseLesson.lessonState : lessonState2;
        if ((i14 & 16777216) != 0) {
            lessonState3 = lessonState5;
            lessonType2 = courseLesson.lessonType;
        } else {
            lessonType2 = lessonType;
            lessonState3 = lessonState5;
        }
        return courseLesson.copy(j15, str11, str12, i15, str13, str14, str15, str16, str17, str18, str19, j14, str21, i16, z17, z18, z19, courseLessonFinishStatus2, z20, z21, z22, i17, lessonState4, lessonState3, lessonType2);
    }

    public final long component1() {
        return this.lessonId;
    }

    public final String component10() {
        return this.sentenceList;
    }

    public final String component11() {
        return this.characterList;
    }

    public final long component12() {
        return this.unitId;
    }

    public final String component13() {
        return this.unitName;
    }

    public final int component14() {
        return this.positionType;
    }

    public final boolean component15() {
        return this.isCurrentOpen;
    }

    public final boolean component16() {
        return this.canAccess;
    }

    public final boolean component17() {
        return this.canReview;
    }

    public final CourseLessonFinishStatus component18() {
        return this.finishStatus;
    }

    public final boolean component19() {
        return this.showPracticeComprehensive;
    }

    public final String component2() {
        return this.lessonName;
    }

    public final boolean component20() {
        return this.showPracticeSpeaking;
    }

    public final boolean component21() {
        return this.showCharacterDrill;
    }

    public final int component22() {
        return this.unitSortIndex;
    }

    public final LessonState component23() {
        return this.preLessonState;
    }

    public final LessonState component24() {
        return this.lessonState;
    }

    public final LessonType component25() {
        return this.lessonType;
    }

    public final String component3() {
        return this.description;
    }

    public final int component4() {
        return this.sortIndex;
    }

    public final String component5() {
        return this.normalRegex;
    }

    public final String component6() {
        return this.lastRegex;
    }

    public final String component7() {
        return this.repeatRegex;
    }

    public final String component8() {
        return this.challengeRegex;
    }

    public final String component9() {
        return this.wordList;
    }

    public final CourseLesson copy(long j11, String lessonName, String description, int i11, String normalRegex, String lastRegex, String repeatRegex, String challengeRegex, String wordList, String sentenceList, String characterList, long j12, String unitName, int i12, boolean z11, boolean z12, boolean z13, CourseLessonFinishStatus courseLessonFinishStatus, boolean z14, boolean z15, boolean z16, int i13, LessonState preLessonState, LessonState lessonState, LessonType lessonType) {
        m.f(lessonName, "lessonName");
        m.f(description, "description");
        m.f(normalRegex, "normalRegex");
        m.f(lastRegex, "lastRegex");
        m.f(repeatRegex, "repeatRegex");
        m.f(challengeRegex, "challengeRegex");
        m.f(wordList, "wordList");
        m.f(sentenceList, "sentenceList");
        m.f(characterList, "characterList");
        m.f(unitName, "unitName");
        m.f(preLessonState, "preLessonState");
        m.f(lessonState, "lessonState");
        m.f(lessonType, "lessonType");
        return new CourseLesson(j11, lessonName, description, i11, normalRegex, lastRegex, repeatRegex, challengeRegex, wordList, sentenceList, characterList, j12, unitName, i12, z11, z12, z13, courseLessonFinishStatus, z14, z15, z16, i13, preLessonState, lessonState, lessonType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseLesson)) {
            return false;
        }
        CourseLesson courseLesson = (CourseLesson) obj;
        return this.lessonId == courseLesson.lessonId && m.a(this.lessonName, courseLesson.lessonName) && m.a(this.description, courseLesson.description) && this.sortIndex == courseLesson.sortIndex && m.a(this.normalRegex, courseLesson.normalRegex) && m.a(this.lastRegex, courseLesson.lastRegex) && m.a(this.repeatRegex, courseLesson.repeatRegex) && m.a(this.challengeRegex, courseLesson.challengeRegex) && m.a(this.wordList, courseLesson.wordList) && m.a(this.sentenceList, courseLesson.sentenceList) && m.a(this.characterList, courseLesson.characterList) && this.unitId == courseLesson.unitId && m.a(this.unitName, courseLesson.unitName) && this.positionType == courseLesson.positionType && this.isCurrentOpen == courseLesson.isCurrentOpen && this.canAccess == courseLesson.canAccess && this.canReview == courseLesson.canReview && m.a(this.finishStatus, courseLesson.finishStatus) && this.showPracticeComprehensive == courseLesson.showPracticeComprehensive && this.showPracticeSpeaking == courseLesson.showPracticeSpeaking && this.showCharacterDrill == courseLesson.showCharacterDrill && this.unitSortIndex == courseLesson.unitSortIndex && this.preLessonState == courseLesson.preLessonState && this.lessonState == courseLesson.lessonState && this.lessonType == courseLesson.lessonType;
    }

    public final boolean getCanAccess() {
        return this.canAccess;
    }

    public final boolean getCanReview() {
        return this.canReview;
    }

    public final String getChallengeRegex() {
        return this.challengeRegex;
    }

    public final String getCharacterList() {
        return this.characterList;
    }

    public final String getDescription() {
        return this.description;
    }

    public final CourseLessonFinishStatus getFinishStatus() {
        return this.finishStatus;
    }

    public final String getLastRegex() {
        return this.lastRegex;
    }

    public final long getLessonId() {
        return this.lessonId;
    }

    public final String getLessonName() {
        return this.lessonName;
    }

    public final LessonState getLessonState() {
        return this.lessonState;
    }

    public final LessonType getLessonType() {
        return this.lessonType;
    }

    public final String getNormalRegex() {
        return this.normalRegex;
    }

    public final int getPositionType() {
        return this.positionType;
    }

    public final LessonState getPreLessonState() {
        return this.preLessonState;
    }

    public final String getRepeatRegex() {
        return this.repeatRegex;
    }

    public final String getSentenceList() {
        return this.sentenceList;
    }

    public final boolean getShowCharacterDrill() {
        return this.showCharacterDrill;
    }

    public final boolean getShowPracticeComprehensive() {
        return this.showPracticeComprehensive;
    }

    public final boolean getShowPracticeSpeaking() {
        return this.showPracticeSpeaking;
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

    public final int getUnitSortIndex() {
        return this.unitSortIndex;
    }

    public final String getWordList() {
        return this.wordList;
    }

    public int hashCode() {
        int iE = e.e(e.e(e.e(e.b(this.positionType, e.d(e.f(this.unitId, e.d(e.d(e.d(e.d(e.d(e.d(e.d(e.b(this.sortIndex, e.d(e.d(Long.hashCode(this.lessonId) * 31, 31, this.lessonName), 31, this.description), 31), 31, this.normalRegex), 31, this.lastRegex), 31, this.repeatRegex), 31, this.challengeRegex), 31, this.wordList), 31, this.sentenceList), 31, this.characterList), 31), 31, this.unitName), 31), 31, this.isCurrentOpen), 31, this.canAccess), 31, this.canReview);
        CourseLessonFinishStatus courseLessonFinishStatus = this.finishStatus;
        return this.lessonType.hashCode() + ((this.lessonState.hashCode() + ((this.preLessonState.hashCode() + e.b(this.unitSortIndex, e.e(e.e(e.e((iE + (courseLessonFinishStatus == null ? 0 : courseLessonFinishStatus.hashCode())) * 31, 31, this.showPracticeComprehensive), 31, this.showPracticeSpeaking), 31, this.showCharacterDrill), 31)) * 31)) * 31);
    }

    public final boolean isCurrentOpen() {
        return this.isCurrentOpen;
    }

    public String toString() {
        long j11 = this.lessonId;
        String str = this.lessonName;
        String str2 = this.description;
        int i11 = this.sortIndex;
        String str3 = this.normalRegex;
        String str4 = this.lastRegex;
        String str5 = this.repeatRegex;
        String str6 = this.challengeRegex;
        String str7 = this.wordList;
        String str8 = this.sentenceList;
        String str9 = this.characterList;
        long j12 = this.unitId;
        String str10 = this.unitName;
        int i12 = this.positionType;
        boolean z11 = this.isCurrentOpen;
        boolean z12 = this.canAccess;
        boolean z13 = this.canReview;
        CourseLessonFinishStatus courseLessonFinishStatus = this.finishStatus;
        boolean z14 = this.showPracticeComprehensive;
        boolean z15 = this.showPracticeSpeaking;
        boolean z16 = this.showCharacterDrill;
        int i13 = this.unitSortIndex;
        LessonState lessonState = this.preLessonState;
        LessonState lessonState2 = this.lessonState;
        LessonType lessonType = this.lessonType;
        StringBuilder sbP = e0.p(j11, "CourseLesson(lessonId=", ", lessonName=", str);
        sbP.append(", description=");
        sbP.append(str2);
        sbP.append(", sortIndex=");
        sbP.append(i11);
        d.w(sbP, ", normalRegex=", str3, ", lastRegex=", str4);
        d.w(sbP, ", repeatRegex=", str5, ", challengeRegex=", str6);
        d.w(sbP, ", wordList=", str7, ", sentenceList=", str8);
        e.C(sbP, ", characterList=", str9, ", unitId=");
        e0.w(j12, ", unitName=", str10, sbP);
        sbP.append(", positionType=");
        sbP.append(i12);
        sbP.append(", isCurrentOpen=");
        sbP.append(z11);
        e0.z(", canAccess=", ", canReview=", sbP, z12, z13);
        sbP.append(", finishStatus=");
        sbP.append(courseLessonFinishStatus);
        sbP.append(", showPracticeComprehensive=");
        sbP.append(z14);
        e0.z(", showPracticeSpeaking=", ", showCharacterDrill=", sbP, z15, z16);
        sbP.append(", unitSortIndex=");
        sbP.append(i13);
        sbP.append(", preLessonState=");
        sbP.append(lessonState);
        sbP.append(", lessonState=");
        sbP.append(lessonState2);
        sbP.append(", lessonType=");
        sbP.append(lessonType);
        sbP.append(")");
        return sbP.toString();
    }

    public /* synthetic */ CourseLesson(long j11, String str, String str2, int i11, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j12, String str10, int i12, boolean z11, boolean z12, boolean z13, CourseLessonFinishStatus courseLessonFinishStatus, boolean z14, boolean z15, boolean z16, int i13, LessonState lessonState, LessonState lessonState2, LessonType lessonType, int i14, f fVar) {
        this(j11, str, str2, i11, str3, str4, str5, str6, str7, str8, str9, j12, (i14 & 4096) != 0 ? BuildConfig.VERSION_NAME : str10, (i14 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? 0 : i12, (i14 & 16384) != 0 ? false : z11, (32768 & i14) != 0 ? false : z12, (65536 & i14) != 0 ? false : z13, (131072 & i14) != 0 ? null : courseLessonFinishStatus, (262144 & i14) != 0 ? true : z14, (524288 & i14) != 0 ? true : z15, (1048576 & i14) != 0 ? false : z16, (2097152 & i14) != 0 ? 0 : i13, (4194304 & i14) != 0 ? LessonState.StateLocked : lessonState, (8388608 & i14) != 0 ? LessonState.StateLocked : lessonState2, (i14 & 16777216) != 0 ? LessonType.TypeLesson : lessonType);
    }
}
