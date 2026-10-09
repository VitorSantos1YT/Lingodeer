package com.lingodeer.database.model;

import com.google.android.material.datepicker.d;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import defpackage.e;
import hh.p0;
import kotlin.jvm.internal.m;
import zt.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ChineseToneLessonEntity {
    private final a challengeRegex;
    private final a characterList;
    private final a description;
    private final a lastRegex;
    private final long lessonId;
    private final a lessonName;
    private final long levelId;
    private final a normalRegex;
    private final a repeatRegex;
    private final a sentenceList;
    private final int sortIndex;
    private final a tDescription;
    private final long unitId;
    private final a wordList;

    public ChineseToneLessonEntity(long j11, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, a aVar9, a aVar10, long j12, long j13, int i11) {
        this.lessonId = j11;
        this.lessonName = aVar;
        this.description = aVar2;
        this.tDescription = aVar3;
        this.wordList = aVar4;
        this.sentenceList = aVar5;
        this.characterList = aVar6;
        this.repeatRegex = aVar7;
        this.lastRegex = aVar8;
        this.normalRegex = aVar9;
        this.challengeRegex = aVar10;
        this.levelId = j12;
        this.unitId = j13;
        this.sortIndex = i11;
    }

    public final long component1() {
        return this.lessonId;
    }

    public final a component10() {
        return this.normalRegex;
    }

    public final a component11() {
        return this.challengeRegex;
    }

    public final long component12() {
        return this.levelId;
    }

    public final long component13() {
        return this.unitId;
    }

    public final int component14() {
        return this.sortIndex;
    }

    public final a component2() {
        return this.lessonName;
    }

    public final a component3() {
        return this.description;
    }

    public final a component4() {
        return this.tDescription;
    }

    public final a component5() {
        return this.wordList;
    }

    public final a component6() {
        return this.sentenceList;
    }

    public final a component7() {
        return this.characterList;
    }

    public final a component8() {
        return this.repeatRegex;
    }

    public final a component9() {
        return this.lastRegex;
    }

    public final ChineseToneLessonEntity copy(long j11, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, a aVar9, a aVar10, long j12, long j13, int i11) {
        return new ChineseToneLessonEntity(j11, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, j12, j13, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChineseToneLessonEntity)) {
            return false;
        }
        ChineseToneLessonEntity chineseToneLessonEntity = (ChineseToneLessonEntity) obj;
        return this.lessonId == chineseToneLessonEntity.lessonId && m.a(this.lessonName, chineseToneLessonEntity.lessonName) && m.a(this.description, chineseToneLessonEntity.description) && m.a(this.tDescription, chineseToneLessonEntity.tDescription) && m.a(this.wordList, chineseToneLessonEntity.wordList) && m.a(this.sentenceList, chineseToneLessonEntity.sentenceList) && m.a(this.characterList, chineseToneLessonEntity.characterList) && m.a(this.repeatRegex, chineseToneLessonEntity.repeatRegex) && m.a(this.lastRegex, chineseToneLessonEntity.lastRegex) && m.a(this.normalRegex, chineseToneLessonEntity.normalRegex) && m.a(this.challengeRegex, chineseToneLessonEntity.challengeRegex) && this.levelId == chineseToneLessonEntity.levelId && this.unitId == chineseToneLessonEntity.unitId && this.sortIndex == chineseToneLessonEntity.sortIndex;
    }

    public final a getChallengeRegex() {
        return this.challengeRegex;
    }

    public final a getCharacterList() {
        return this.characterList;
    }

    public final a getDescription() {
        return this.description;
    }

    public final a getLastRegex() {
        return this.lastRegex;
    }

    public final long getLessonId() {
        return this.lessonId;
    }

    public final a getLessonName() {
        return this.lessonName;
    }

    public final long getLevelId() {
        return this.levelId;
    }

    public final a getNormalRegex() {
        return this.normalRegex;
    }

    public final a getRepeatRegex() {
        return this.repeatRegex;
    }

    public final a getSentenceList() {
        return this.sentenceList;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    public final a getTDescription() {
        return this.tDescription;
    }

    public final long getUnitId() {
        return this.unitId;
    }

    public final a getWordList() {
        return this.wordList;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.lessonId) * 31;
        a aVar = this.lessonName;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.description;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        a aVar3 = this.tDescription;
        int iHashCode4 = (iHashCode3 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        a aVar4 = this.wordList;
        int iHashCode5 = (iHashCode4 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        a aVar5 = this.sentenceList;
        int iHashCode6 = (iHashCode5 + (aVar5 == null ? 0 : aVar5.hashCode())) * 31;
        a aVar6 = this.characterList;
        int iHashCode7 = (iHashCode6 + (aVar6 == null ? 0 : aVar6.hashCode())) * 31;
        a aVar7 = this.repeatRegex;
        int iHashCode8 = (iHashCode7 + (aVar7 == null ? 0 : aVar7.hashCode())) * 31;
        a aVar8 = this.lastRegex;
        int iHashCode9 = (iHashCode8 + (aVar8 == null ? 0 : aVar8.hashCode())) * 31;
        a aVar9 = this.normalRegex;
        int iHashCode10 = (iHashCode9 + (aVar9 == null ? 0 : aVar9.hashCode())) * 31;
        a aVar10 = this.challengeRegex;
        return Integer.hashCode(this.sortIndex) + e.f(this.unitId, e.f(this.levelId, (iHashCode10 + (aVar10 != null ? aVar10.hashCode() : 0)) * 31, 31), 31);
    }

    public String toString() {
        long j11 = this.lessonId;
        a aVar = this.lessonName;
        a aVar2 = this.description;
        a aVar3 = this.tDescription;
        a aVar4 = this.wordList;
        a aVar5 = this.sentenceList;
        a aVar6 = this.characterList;
        a aVar7 = this.repeatRegex;
        a aVar8 = this.lastRegex;
        a aVar9 = this.normalRegex;
        a aVar10 = this.challengeRegex;
        long j12 = this.levelId;
        long j13 = this.unitId;
        int i11 = this.sortIndex;
        StringBuilder sb2 = new StringBuilder("ChineseToneLessonEntity(lessonId=");
        sb2.append(j11);
        sb2.append(", lessonName=");
        sb2.append(aVar);
        d.y(sb2, ", description=", aVar2, ", tDescription=", aVar3);
        d.y(sb2, ", wordList=", aVar4, kHfjNGauVgdF.DfWOeZaiqTlwIpl, aVar5);
        d.y(sb2, ", characterList=", aVar6, ", repeatRegex=", aVar7);
        d.y(sb2, ", lastRegex=", aVar8, ", normalRegex=", aVar9);
        sb2.append(", challengeRegex=");
        sb2.append(aVar10);
        sb2.append(", levelId=");
        sb2.append(j12);
        ep.a.y(j13, ", unitId=", ", sortIndex=", sb2);
        return p0.i(i11, ")", sb2);
    }
}
