package com.lingodeer.data.model.chinesetone;

import am.rVFB.LwKl;
import b7.e0;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.android.material.datepicker.d;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.lingodeer.data.model.LessonState;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import ep.a;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ChineseToneLesson {
    private final String challengeRegex;
    private final String characterList;
    private final String description;
    private final String lastRegex;
    private final long lessonId;
    private final String lessonName;
    private final long levelId;
    private final String normalRegex;
    private final String repeatRegex;
    private final String sentenceList;
    private final int sortIndex;
    private final LessonState state;
    private final String tDescription;
    private final long unitId;
    private final String wordList;

    public ChineseToneLesson(long j11, String lessonName, String description, String tDescription, String wordList, String sentenceList, String characterList, String repeatRegex, String lastRegex, String challengeRegex, long j12, long j13, int i11, String normalRegex, LessonState state) {
        m.f(lessonName, "lessonName");
        m.f(description, "description");
        m.f(tDescription, "tDescription");
        m.f(wordList, "wordList");
        m.f(sentenceList, "sentenceList");
        m.f(characterList, "characterList");
        m.f(repeatRegex, "repeatRegex");
        m.f(lastRegex, "lastRegex");
        m.f(challengeRegex, "challengeRegex");
        m.f(normalRegex, "normalRegex");
        m.f(state, "state");
        this.lessonId = j11;
        this.lessonName = lessonName;
        this.description = description;
        this.tDescription = tDescription;
        this.wordList = wordList;
        this.sentenceList = sentenceList;
        this.characterList = characterList;
        this.repeatRegex = repeatRegex;
        this.lastRegex = lastRegex;
        this.challengeRegex = challengeRegex;
        this.levelId = j12;
        this.unitId = j13;
        this.sortIndex = i11;
        this.normalRegex = normalRegex;
        this.state = state;
    }

    public final long component1() {
        return this.lessonId;
    }

    public final String component10() {
        return this.challengeRegex;
    }

    public final long component11() {
        return this.levelId;
    }

    public final long component12() {
        return this.unitId;
    }

    public final int component13() {
        return this.sortIndex;
    }

    public final String component14() {
        return this.normalRegex;
    }

    public final LessonState component15() {
        return this.state;
    }

    public final String component2() {
        return this.lessonName;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.tDescription;
    }

    public final String component5() {
        return this.wordList;
    }

    public final String component6() {
        return this.sentenceList;
    }

    public final String component7() {
        return this.characterList;
    }

    public final String component8() {
        return this.repeatRegex;
    }

    public final String component9() {
        return this.lastRegex;
    }

    public final ChineseToneLesson copy(long j11, String lessonName, String description, String tDescription, String wordList, String sentenceList, String characterList, String repeatRegex, String lastRegex, String challengeRegex, long j12, long j13, int i11, String normalRegex, LessonState state) {
        m.f(lessonName, "lessonName");
        m.f(description, "description");
        m.f(tDescription, "tDescription");
        m.f(wordList, "wordList");
        m.f(sentenceList, "sentenceList");
        m.f(characterList, "characterList");
        m.f(repeatRegex, "repeatRegex");
        m.f(lastRegex, "lastRegex");
        m.f(challengeRegex, "challengeRegex");
        m.f(normalRegex, "normalRegex");
        m.f(state, "state");
        return new ChineseToneLesson(j11, lessonName, description, tDescription, wordList, sentenceList, characterList, repeatRegex, lastRegex, challengeRegex, j12, j13, i11, normalRegex, state);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChineseToneLesson)) {
            return false;
        }
        ChineseToneLesson chineseToneLesson = (ChineseToneLesson) obj;
        return this.lessonId == chineseToneLesson.lessonId && m.a(this.lessonName, chineseToneLesson.lessonName) && m.a(this.description, chineseToneLesson.description) && m.a(this.tDescription, chineseToneLesson.tDescription) && m.a(this.wordList, chineseToneLesson.wordList) && m.a(this.sentenceList, chineseToneLesson.sentenceList) && m.a(this.characterList, chineseToneLesson.characterList) && m.a(this.repeatRegex, chineseToneLesson.repeatRegex) && m.a(this.lastRegex, chineseToneLesson.lastRegex) && m.a(this.challengeRegex, chineseToneLesson.challengeRegex) && this.levelId == chineseToneLesson.levelId && this.unitId == chineseToneLesson.unitId && this.sortIndex == chineseToneLesson.sortIndex && m.a(this.normalRegex, chineseToneLesson.normalRegex) && this.state == chineseToneLesson.state;
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

    public final String getLastRegex() {
        return this.lastRegex;
    }

    public final long getLessonId() {
        return this.lessonId;
    }

    public final String getLessonName() {
        return this.lessonName;
    }

    public final long getLevelId() {
        return this.levelId;
    }

    public final String getNormalRegex() {
        return this.normalRegex;
    }

    public final String getRepeatRegex() {
        return this.repeatRegex;
    }

    public final String getSentenceList() {
        return this.sentenceList;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    public final LessonState getState() {
        return this.state;
    }

    public final String getTDescription() {
        return this.tDescription;
    }

    public final long getUnitId() {
        return this.unitId;
    }

    public final String getWordList() {
        return this.wordList;
    }

    public int hashCode() {
        return this.state.hashCode() + e.d(e.b(this.sortIndex, e.f(this.unitId, e.f(this.levelId, e.d(e.d(e.d(e.d(e.d(e.d(e.d(e.d(e.d(Long.hashCode(this.lessonId) * 31, 31, this.lessonName), 31, this.description), 31, this.tDescription), 31, this.wordList), 31, this.sentenceList), 31, this.characterList), 31, this.repeatRegex), 31, this.lastRegex), 31, this.challengeRegex), 31), 31), 31), 31, this.normalRegex);
    }

    public String toString() {
        long j11 = this.lessonId;
        String str = this.lessonName;
        String str2 = this.description;
        String str3 = this.tDescription;
        String str4 = this.wordList;
        String str5 = this.sentenceList;
        String str6 = this.characterList;
        String str7 = this.repeatRegex;
        String str8 = this.lastRegex;
        String str9 = this.challengeRegex;
        long j12 = this.levelId;
        long j13 = this.unitId;
        int i11 = this.sortIndex;
        String str10 = this.normalRegex;
        LessonState lessonState = this.state;
        StringBuilder sbP = e0.p(j11, LwKl.UgNRpyjxZDwNNBs, ", lessonName=", str);
        d.w(sbP, MzwEyWCkjXL.jRpKQRvQrBxmZAD, str2, ", tDescription=", str3);
        d.w(sbP, ", wordList=", str4, ", sentenceList=", str5);
        d.w(sbP, ", characterList=", str6, ", repeatRegex=", str7);
        d.w(sbP, ", lastRegex=", str8, ", challengeRegex=", str9);
        a.y(j12, ", levelId=", ", unitId=", sbP);
        sbP.append(j13);
        sbP.append(", sortIndex=");
        sbP.append(i11);
        sbP.append(", normalRegex=");
        sbP.append(str10);
        sbP.append(", state=");
        sbP.append(lessonState);
        sbP.append(")");
        return sbP.toString();
    }

    public /* synthetic */ ChineseToneLesson(long j11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j12, long j13, int i11, String str10, LessonState lessonState, int i12, f fVar) {
        this(j11, str, str2, str3, str4, str5, str6, str7, str8, str9, j12, j13, i11, (i12 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? BuildConfig.VERSION_NAME : str10, (i12 & 16384) != 0 ? LessonState.StateLocked : lessonState);
    }
}
