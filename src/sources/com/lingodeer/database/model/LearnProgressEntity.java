package com.lingodeer.database.model;

import a.ar.MFeWs;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import b7.e0;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.android.material.datepicker.d;
import com.google.type.bACG.scNRoQgKSYX;
import defpackage.e;
import ep.a;
import kotlin.jvm.internal.m;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class LearnProgressEntity {
    private final int ackEnterPos;
    private final long ackUnitId;
    private final String audioLesson;
    private final long currentEnteredUnitId;
    private final int flashCardDisplayIn;
    private final boolean flashCardFocusGood;
    private final boolean flashCardFocusNew;
    private final boolean flashCardFocusPerfect;
    private final String flashCardFocusUnit;
    private final boolean flashCardFocusWeak;
    private final boolean flashCardIsLearnChar;
    private final boolean flashCardIsLearnSent;
    private final boolean flashCardIsLearnWord;
    private final int flashCardPracticeCount;
    private final String lan;
    private final String lessonExam;
    private final String lessonStars;
    private final String main;
    private final String mainTT;
    private final boolean pendingUpdate;
    private final int pronun;
    private final long restartTimestamp;
    private final int reviewFilterMethodChar;
    private final int reviewFilterMethodSent;
    private final int reviewFilterMethodWord;
    private final int reviewPracticeModelChar;
    private final int reviewPracticeModelSent;
    private final int reviewPracticeModelWord;
    private final String reviewSelectRecordChar;
    private final String reviewSelectRecordSent;
    private final String reviewSelectRecordWord;

    public LearnProgressEntity(String lan, String main, String mainTT, String lessonExam, String lessonStars, String audioLesson, int i11, long j11, int i12, int i13, String flashCardFocusUnit, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i14, int i15, int i16, int i17, int i18, int i19, String reviewSelectRecordChar, String reviewSelectRecordWord, String reviewSelectRecordSent, int i21, long j12, long j13, boolean z18) {
        m.f(lan, "lan");
        m.f(main, "main");
        m.f(mainTT, "mainTT");
        m.f(lessonExam, "lessonExam");
        m.f(lessonStars, "lessonStars");
        m.f(audioLesson, "audioLesson");
        m.f(flashCardFocusUnit, "flashCardFocusUnit");
        m.f(reviewSelectRecordChar, "reviewSelectRecordChar");
        m.f(reviewSelectRecordWord, "reviewSelectRecordWord");
        m.f(reviewSelectRecordSent, "reviewSelectRecordSent");
        this.lan = lan;
        this.main = main;
        this.mainTT = mainTT;
        this.lessonExam = lessonExam;
        this.lessonStars = lessonStars;
        this.audioLesson = audioLesson;
        this.pronun = i11;
        this.currentEnteredUnitId = j11;
        this.flashCardPracticeCount = i12;
        this.flashCardDisplayIn = i13;
        this.flashCardFocusUnit = flashCardFocusUnit;
        this.flashCardIsLearnChar = z11;
        this.flashCardIsLearnWord = z12;
        this.flashCardIsLearnSent = z13;
        this.flashCardFocusNew = z14;
        this.flashCardFocusWeak = z15;
        this.flashCardFocusGood = z16;
        this.flashCardFocusPerfect = z17;
        this.reviewFilterMethodChar = i14;
        this.reviewFilterMethodWord = i15;
        this.reviewFilterMethodSent = i16;
        this.reviewPracticeModelChar = i17;
        this.reviewPracticeModelWord = i18;
        this.reviewPracticeModelSent = i19;
        this.reviewSelectRecordChar = reviewSelectRecordChar;
        this.reviewSelectRecordWord = reviewSelectRecordWord;
        this.reviewSelectRecordSent = reviewSelectRecordSent;
        this.ackEnterPos = i21;
        this.ackUnitId = j12;
        this.restartTimestamp = j13;
        this.pendingUpdate = z18;
    }

    public static /* synthetic */ LearnProgressEntity copy$default(LearnProgressEntity learnProgressEntity, String str, String str2, String str3, String str4, String str5, String str6, int i11, long j11, int i12, int i13, String str7, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i14, int i15, int i16, int i17, int i18, int i19, String str8, String str9, String str10, int i21, long j12, long j13, boolean z18, int i22, Object obj) {
        boolean z19;
        long j14;
        String str11 = (i22 & 1) != 0 ? learnProgressEntity.lan : str;
        String str12 = (i22 & 2) != 0 ? learnProgressEntity.main : str2;
        String str13 = (i22 & 4) != 0 ? learnProgressEntity.mainTT : str3;
        String str14 = (i22 & 8) != 0 ? learnProgressEntity.lessonExam : str4;
        String str15 = (i22 & 16) != 0 ? learnProgressEntity.lessonStars : str5;
        String str16 = (i22 & 32) != 0 ? learnProgressEntity.audioLesson : str6;
        int i23 = (i22 & 64) != 0 ? learnProgressEntity.pronun : i11;
        long j15 = (i22 & 128) != 0 ? learnProgressEntity.currentEnteredUnitId : j11;
        int i24 = (i22 & 256) != 0 ? learnProgressEntity.flashCardPracticeCount : i12;
        int i25 = (i22 & 512) != 0 ? learnProgressEntity.flashCardDisplayIn : i13;
        String str17 = (i22 & 1024) != 0 ? learnProgressEntity.flashCardFocusUnit : str7;
        boolean z20 = (i22 & 2048) != 0 ? learnProgressEntity.flashCardIsLearnChar : z11;
        boolean z21 = (i22 & 4096) != 0 ? learnProgressEntity.flashCardIsLearnWord : z12;
        String str18 = str11;
        boolean z22 = (i22 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? learnProgressEntity.flashCardIsLearnSent : z13;
        boolean z23 = (i22 & 16384) != 0 ? learnProgressEntity.flashCardFocusNew : z14;
        boolean z24 = (i22 & 32768) != 0 ? learnProgressEntity.flashCardFocusWeak : z15;
        boolean z25 = (i22 & 65536) != 0 ? learnProgressEntity.flashCardFocusGood : z16;
        boolean z26 = (i22 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? learnProgressEntity.flashCardFocusPerfect : z17;
        int i26 = (i22 & 262144) != 0 ? learnProgressEntity.reviewFilterMethodChar : i14;
        int i27 = (i22 & 524288) != 0 ? learnProgressEntity.reviewFilterMethodWord : i15;
        int i28 = (i22 & 1048576) != 0 ? learnProgressEntity.reviewFilterMethodSent : i16;
        int i29 = (i22 & 2097152) != 0 ? learnProgressEntity.reviewPracticeModelChar : i17;
        int i30 = (i22 & 4194304) != 0 ? learnProgressEntity.reviewPracticeModelWord : i18;
        int i31 = (i22 & 8388608) != 0 ? learnProgressEntity.reviewPracticeModelSent : i19;
        String str19 = (i22 & 16777216) != 0 ? learnProgressEntity.reviewSelectRecordChar : str8;
        String str20 = (i22 & 33554432) != 0 ? learnProgressEntity.reviewSelectRecordWord : str9;
        String str21 = (i22 & 67108864) != 0 ? learnProgressEntity.reviewSelectRecordSent : str10;
        int i32 = (i22 & 134217728) != 0 ? learnProgressEntity.ackEnterPos : i21;
        boolean z27 = z23;
        long j16 = (i22 & 268435456) != 0 ? learnProgressEntity.ackUnitId : j12;
        long j17 = (i22 & 536870912) != 0 ? learnProgressEntity.restartTimestamp : j13;
        if ((i22 & 1073741824) != 0) {
            j14 = j17;
            z19 = learnProgressEntity.pendingUpdate;
        } else {
            z19 = z18;
            j14 = j17;
        }
        return learnProgressEntity.copy(str18, str12, str13, str14, str15, str16, i23, j15, i24, i25, str17, z20, z21, z22, z27, z24, z25, z26, i26, i27, i28, i29, i30, i31, str19, str20, str21, i32, j16, j14, z19);
    }

    public final String component1() {
        return this.lan;
    }

    public final int component10() {
        return this.flashCardDisplayIn;
    }

    public final String component11() {
        return this.flashCardFocusUnit;
    }

    public final boolean component12() {
        return this.flashCardIsLearnChar;
    }

    public final boolean component13() {
        return this.flashCardIsLearnWord;
    }

    public final boolean component14() {
        return this.flashCardIsLearnSent;
    }

    public final boolean component15() {
        return this.flashCardFocusNew;
    }

    public final boolean component16() {
        return this.flashCardFocusWeak;
    }

    public final boolean component17() {
        return this.flashCardFocusGood;
    }

    public final boolean component18() {
        return this.flashCardFocusPerfect;
    }

    public final int component19() {
        return this.reviewFilterMethodChar;
    }

    public final String component2() {
        return this.main;
    }

    public final int component20() {
        return this.reviewFilterMethodWord;
    }

    public final int component21() {
        return this.reviewFilterMethodSent;
    }

    public final int component22() {
        return this.reviewPracticeModelChar;
    }

    public final int component23() {
        return this.reviewPracticeModelWord;
    }

    public final int component24() {
        return this.reviewPracticeModelSent;
    }

    public final String component25() {
        return this.reviewSelectRecordChar;
    }

    public final String component26() {
        return this.reviewSelectRecordWord;
    }

    public final String component27() {
        return this.reviewSelectRecordSent;
    }

    public final int component28() {
        return this.ackEnterPos;
    }

    public final long component29() {
        return this.ackUnitId;
    }

    public final String component3() {
        return this.mainTT;
    }

    public final long component30() {
        return this.restartTimestamp;
    }

    public final boolean component31() {
        return this.pendingUpdate;
    }

    public final String component4() {
        return this.lessonExam;
    }

    public final String component5() {
        return this.lessonStars;
    }

    public final String component6() {
        return this.audioLesson;
    }

    public final int component7() {
        return this.pronun;
    }

    public final long component8() {
        return this.currentEnteredUnitId;
    }

    public final int component9() {
        return this.flashCardPracticeCount;
    }

    public final LearnProgressEntity copy(String lan, String main, String mainTT, String lessonExam, String lessonStars, String audioLesson, int i11, long j11, int i12, int i13, String flashCardFocusUnit, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i14, int i15, int i16, int i17, int i18, int i19, String reviewSelectRecordChar, String reviewSelectRecordWord, String reviewSelectRecordSent, int i21, long j12, long j13, boolean z18) {
        m.f(lan, "lan");
        m.f(main, "main");
        m.f(mainTT, "mainTT");
        m.f(lessonExam, "lessonExam");
        m.f(lessonStars, "lessonStars");
        m.f(audioLesson, "audioLesson");
        m.f(flashCardFocusUnit, "flashCardFocusUnit");
        m.f(reviewSelectRecordChar, "reviewSelectRecordChar");
        m.f(reviewSelectRecordWord, "reviewSelectRecordWord");
        m.f(reviewSelectRecordSent, "reviewSelectRecordSent");
        return new LearnProgressEntity(lan, main, mainTT, lessonExam, lessonStars, audioLesson, i11, j11, i12, i13, flashCardFocusUnit, z11, z12, z13, z14, z15, z16, z17, i14, i15, i16, i17, i18, i19, reviewSelectRecordChar, reviewSelectRecordWord, reviewSelectRecordSent, i21, j12, j13, z18);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LearnProgressEntity)) {
            return false;
        }
        LearnProgressEntity learnProgressEntity = (LearnProgressEntity) obj;
        return m.a(this.lan, learnProgressEntity.lan) && m.a(this.main, learnProgressEntity.main) && m.a(this.mainTT, learnProgressEntity.mainTT) && m.a(this.lessonExam, learnProgressEntity.lessonExam) && m.a(this.lessonStars, learnProgressEntity.lessonStars) && m.a(this.audioLesson, learnProgressEntity.audioLesson) && this.pronun == learnProgressEntity.pronun && this.currentEnteredUnitId == learnProgressEntity.currentEnteredUnitId && this.flashCardPracticeCount == learnProgressEntity.flashCardPracticeCount && this.flashCardDisplayIn == learnProgressEntity.flashCardDisplayIn && m.a(this.flashCardFocusUnit, learnProgressEntity.flashCardFocusUnit) && this.flashCardIsLearnChar == learnProgressEntity.flashCardIsLearnChar && this.flashCardIsLearnWord == learnProgressEntity.flashCardIsLearnWord && this.flashCardIsLearnSent == learnProgressEntity.flashCardIsLearnSent && this.flashCardFocusNew == learnProgressEntity.flashCardFocusNew && this.flashCardFocusWeak == learnProgressEntity.flashCardFocusWeak && this.flashCardFocusGood == learnProgressEntity.flashCardFocusGood && this.flashCardFocusPerfect == learnProgressEntity.flashCardFocusPerfect && this.reviewFilterMethodChar == learnProgressEntity.reviewFilterMethodChar && this.reviewFilterMethodWord == learnProgressEntity.reviewFilterMethodWord && this.reviewFilterMethodSent == learnProgressEntity.reviewFilterMethodSent && this.reviewPracticeModelChar == learnProgressEntity.reviewPracticeModelChar && this.reviewPracticeModelWord == learnProgressEntity.reviewPracticeModelWord && this.reviewPracticeModelSent == learnProgressEntity.reviewPracticeModelSent && m.a(this.reviewSelectRecordChar, learnProgressEntity.reviewSelectRecordChar) && m.a(this.reviewSelectRecordWord, learnProgressEntity.reviewSelectRecordWord) && m.a(this.reviewSelectRecordSent, learnProgressEntity.reviewSelectRecordSent) && this.ackEnterPos == learnProgressEntity.ackEnterPos && this.ackUnitId == learnProgressEntity.ackUnitId && this.restartTimestamp == learnProgressEntity.restartTimestamp && this.pendingUpdate == learnProgressEntity.pendingUpdate;
    }

    public final int getAckEnterPos() {
        return this.ackEnterPos;
    }

    public final long getAckUnitId() {
        return this.ackUnitId;
    }

    public final String getAudioLesson() {
        return this.audioLesson;
    }

    public final long getCurrentEnteredUnitId() {
        return this.currentEnteredUnitId;
    }

    public final int getFlashCardDisplayIn() {
        return this.flashCardDisplayIn;
    }

    public final boolean getFlashCardFocusGood() {
        return this.flashCardFocusGood;
    }

    public final boolean getFlashCardFocusNew() {
        return this.flashCardFocusNew;
    }

    public final boolean getFlashCardFocusPerfect() {
        return this.flashCardFocusPerfect;
    }

    public final String getFlashCardFocusUnit() {
        return this.flashCardFocusUnit;
    }

    public final boolean getFlashCardFocusWeak() {
        return this.flashCardFocusWeak;
    }

    public final boolean getFlashCardIsLearnChar() {
        return this.flashCardIsLearnChar;
    }

    public final boolean getFlashCardIsLearnSent() {
        return this.flashCardIsLearnSent;
    }

    public final boolean getFlashCardIsLearnWord() {
        return this.flashCardIsLearnWord;
    }

    public final int getFlashCardPracticeCount() {
        return this.flashCardPracticeCount;
    }

    public final String getLan() {
        return this.lan;
    }

    public final String getLessonExam() {
        return this.lessonExam;
    }

    public final String getLessonStars() {
        return this.lessonStars;
    }

    public final String getMain() {
        return this.main;
    }

    public final String getMainTT() {
        return this.mainTT;
    }

    public final boolean getPendingUpdate() {
        return this.pendingUpdate;
    }

    public final int getPronun() {
        return this.pronun;
    }

    public final long getRestartTimestamp() {
        return this.restartTimestamp;
    }

    public final int getReviewFilterMethodChar() {
        return this.reviewFilterMethodChar;
    }

    public final int getReviewFilterMethodSent() {
        return this.reviewFilterMethodSent;
    }

    public final int getReviewFilterMethodWord() {
        return this.reviewFilterMethodWord;
    }

    public final int getReviewPracticeModelChar() {
        return this.reviewPracticeModelChar;
    }

    public final int getReviewPracticeModelSent() {
        return this.reviewPracticeModelSent;
    }

    public final int getReviewPracticeModelWord() {
        return this.reviewPracticeModelWord;
    }

    public final String getReviewSelectRecordChar() {
        return this.reviewSelectRecordChar;
    }

    public final String getReviewSelectRecordSent() {
        return this.reviewSelectRecordSent;
    }

    public final String getReviewSelectRecordWord() {
        return this.reviewSelectRecordWord;
    }

    public int hashCode() {
        return Boolean.hashCode(this.pendingUpdate) + e.f(this.restartTimestamp, e.f(this.ackUnitId, e.b(this.ackEnterPos, e.d(e.d(e.d(e.b(this.reviewPracticeModelSent, e.b(this.reviewPracticeModelWord, e.b(this.reviewPracticeModelChar, e.b(this.reviewFilterMethodSent, e.b(this.reviewFilterMethodWord, e.b(this.reviewFilterMethodChar, e.e(e.e(e.e(e.e(e.e(e.e(e.e(e.d(e.b(this.flashCardDisplayIn, e.b(this.flashCardPracticeCount, e.f(this.currentEnteredUnitId, e.b(this.pronun, e.d(e.d(e.d(e.d(e.d(this.lan.hashCode() * 31, 31, this.main), 31, this.mainTT), 31, this.lessonExam), 31, this.lessonStars), 31, this.audioLesson), 31), 31), 31), 31), 31, this.flashCardFocusUnit), 31, this.flashCardIsLearnChar), 31, this.flashCardIsLearnWord), 31, this.flashCardIsLearnSent), 31, this.flashCardFocusNew), 31, this.flashCardFocusWeak), 31, this.flashCardFocusGood), 31, this.flashCardFocusPerfect), 31), 31), 31), 31), 31), 31), 31, this.reviewSelectRecordChar), 31, this.reviewSelectRecordWord), 31, this.reviewSelectRecordSent), 31), 31), 31);
    }

    public String toString() {
        String str = this.lan;
        String str2 = this.main;
        String str3 = this.mainTT;
        String str4 = this.lessonExam;
        String str5 = this.lessonStars;
        String str6 = this.audioLesson;
        int i11 = this.pronun;
        long j11 = this.currentEnteredUnitId;
        int i12 = this.flashCardPracticeCount;
        int i13 = this.flashCardDisplayIn;
        String str7 = this.flashCardFocusUnit;
        boolean z11 = this.flashCardIsLearnChar;
        boolean z12 = this.flashCardIsLearnWord;
        boolean z13 = this.flashCardIsLearnSent;
        boolean z14 = this.flashCardFocusNew;
        boolean z15 = this.flashCardFocusWeak;
        boolean z16 = this.flashCardFocusGood;
        boolean z17 = this.flashCardFocusPerfect;
        int i14 = this.reviewFilterMethodChar;
        int i15 = this.reviewFilterMethodWord;
        int i16 = this.reviewFilterMethodSent;
        int i17 = this.reviewPracticeModelChar;
        int i18 = this.reviewPracticeModelWord;
        int i19 = this.reviewPracticeModelSent;
        String str8 = this.reviewSelectRecordChar;
        String str9 = this.reviewSelectRecordWord;
        String str10 = this.reviewSelectRecordSent;
        int i21 = this.ackEnterPos;
        long j12 = this.ackUnitId;
        long j13 = this.restartTimestamp;
        boolean z18 = this.pendingUpdate;
        StringBuilder sbS = e.s("LearnProgressEntity(lan=", str, ", main=", str2, ", mainTT=");
        d.w(sbS, str3, ", lessonExam=", str4, ", lessonStars=");
        d.w(sbS, str5, ", audioLesson=", str6, ", pronun=");
        sbS.append(i11);
        sbS.append(scNRoQgKSYX.ZBjYLYYdMY);
        sbS.append(j11);
        c.t(i12, i13, ", flashCardPracticeCount=", ", flashCardDisplayIn=", sbS);
        sbS.append(", flashCardFocusUnit=");
        sbS.append(str7);
        sbS.append(", flashCardIsLearnChar=");
        sbS.append(z11);
        e0.z(", flashCardIsLearnWord=", ", flashCardIsLearnSent=", sbS, z12, z13);
        e0.z(", flashCardFocusNew=", scqhIrGXy.WlhNwancfmCAA, sbS, z14, z15);
        e0.z(", flashCardFocusGood=", ", flashCardFocusPerfect=", sbS, z16, z17);
        c.t(i14, i15, ", reviewFilterMethodChar=", ", reviewFilterMethodWord=", sbS);
        c.t(i16, i17, ", reviewFilterMethodSent=", ", reviewPracticeModelChar=", sbS);
        c.t(i18, i19, ", reviewPracticeModelWord=", MFeWs.oVzQtyu, sbS);
        d.w(sbS, ", reviewSelectRecordChar=", str8, ", reviewSelectRecordWord=", str9);
        sbS.append(", reviewSelectRecordSent=");
        sbS.append(str10);
        sbS.append(", ackEnterPos=");
        sbS.append(i21);
        a.y(j12, ", ackUnitId=", ", restartTimestamp=", sbS);
        sbS.append(j13);
        sbS.append(", pendingUpdate=");
        sbS.append(z18);
        sbS.append(")");
        return sbS.toString();
    }
}
