package com.lingodeer.data.model;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.android.material.datepicker.d;
import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import ep.a;
import kotlin.jvm.internal.m;
import mf.sOm.txBUGYhC;
import oz.q;
import pt.ImS.aYZzTH;
import ry.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class LearnProgress {
    private final int ackEnterPos;
    private final int ackUnitId;
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

    public LearnProgress(String lan, String main, String mainTT, String lessonExam, String lessonStars, String audioLesson, int i11, long j11, long j12, int i12, int i13, String flashCardFocusUnit, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i14, int i15, int i16, int i17, int i18, int i19, String reviewSelectRecordChar, String reviewSelectRecordWord, String reviewSelectRecordSent, int i21, int i22, boolean z18) {
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
        this.restartTimestamp = j11;
        this.currentEnteredUnitId = j12;
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
        this.ackUnitId = i22;
        this.pendingUpdate = z18;
    }

    public static /* synthetic */ LearnProgress copy$default(LearnProgress learnProgress, String str, String str2, String str3, String str4, String str5, String str6, int i11, long j11, long j12, int i12, int i13, String str7, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i14, int i15, int i16, int i17, int i18, int i19, String str8, String str9, String str10, int i21, int i22, boolean z18, int i23, Object obj) {
        boolean z19;
        int i24;
        String str11 = (i23 & 1) != 0 ? learnProgress.lan : str;
        String str12 = (i23 & 2) != 0 ? learnProgress.main : str2;
        String str13 = (i23 & 4) != 0 ? learnProgress.mainTT : str3;
        String str14 = (i23 & 8) != 0 ? learnProgress.lessonExam : str4;
        String str15 = (i23 & 16) != 0 ? learnProgress.lessonStars : str5;
        String str16 = (i23 & 32) != 0 ? learnProgress.audioLesson : str6;
        int i25 = (i23 & 64) != 0 ? learnProgress.pronun : i11;
        long j13 = (i23 & 128) != 0 ? learnProgress.restartTimestamp : j11;
        long j14 = (i23 & 256) != 0 ? learnProgress.currentEnteredUnitId : j12;
        int i26 = (i23 & 512) != 0 ? learnProgress.flashCardPracticeCount : i12;
        int i27 = (i23 & 1024) != 0 ? learnProgress.flashCardDisplayIn : i13;
        String str17 = (i23 & 2048) != 0 ? learnProgress.flashCardFocusUnit : str7;
        String str18 = str11;
        boolean z20 = (i23 & 4096) != 0 ? learnProgress.flashCardIsLearnChar : z11;
        boolean z21 = (i23 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? learnProgress.flashCardIsLearnWord : z12;
        boolean z22 = (i23 & 16384) != 0 ? learnProgress.flashCardIsLearnSent : z13;
        boolean z23 = (i23 & 32768) != 0 ? learnProgress.flashCardFocusNew : z14;
        boolean z24 = (i23 & 65536) != 0 ? learnProgress.flashCardFocusWeak : z15;
        boolean z25 = (i23 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? learnProgress.flashCardFocusGood : z16;
        boolean z26 = (i23 & 262144) != 0 ? learnProgress.flashCardFocusPerfect : z17;
        int i28 = (i23 & 524288) != 0 ? learnProgress.reviewFilterMethodChar : i14;
        int i29 = (i23 & 1048576) != 0 ? learnProgress.reviewFilterMethodWord : i15;
        int i30 = (i23 & 2097152) != 0 ? learnProgress.reviewFilterMethodSent : i16;
        int i31 = (i23 & 4194304) != 0 ? learnProgress.reviewPracticeModelChar : i17;
        int i32 = (i23 & 8388608) != 0 ? learnProgress.reviewPracticeModelWord : i18;
        int i33 = (i23 & 16777216) != 0 ? learnProgress.reviewPracticeModelSent : i19;
        String str19 = (i23 & 33554432) != 0 ? learnProgress.reviewSelectRecordChar : str8;
        String str20 = (i23 & 67108864) != 0 ? learnProgress.reviewSelectRecordWord : str9;
        String str21 = (i23 & 134217728) != 0 ? learnProgress.reviewSelectRecordSent : str10;
        int i34 = (i23 & 268435456) != 0 ? learnProgress.ackEnterPos : i21;
        int i35 = (i23 & 536870912) != 0 ? learnProgress.ackUnitId : i22;
        if ((i23 & 1073741824) != 0) {
            i24 = i35;
            z19 = learnProgress.pendingUpdate;
        } else {
            z19 = z18;
            i24 = i35;
        }
        return learnProgress.copy(str18, str12, str13, str14, str15, str16, i25, j13, j14, i26, i27, str17, z20, z21, z22, z23, z24, z25, z26, i28, i29, i30, i31, i32, i33, str19, str20, str21, i34, i24, z19);
    }

    public final String component1() {
        return this.lan;
    }

    public final int component10() {
        return this.flashCardPracticeCount;
    }

    public final int component11() {
        return this.flashCardDisplayIn;
    }

    public final String component12() {
        return this.flashCardFocusUnit;
    }

    public final boolean component13() {
        return this.flashCardIsLearnChar;
    }

    public final boolean component14() {
        return this.flashCardIsLearnWord;
    }

    public final boolean component15() {
        return this.flashCardIsLearnSent;
    }

    public final boolean component16() {
        return this.flashCardFocusNew;
    }

    public final boolean component17() {
        return this.flashCardFocusWeak;
    }

    public final boolean component18() {
        return this.flashCardFocusGood;
    }

    public final boolean component19() {
        return this.flashCardFocusPerfect;
    }

    public final String component2() {
        return this.main;
    }

    public final int component20() {
        return this.reviewFilterMethodChar;
    }

    public final int component21() {
        return this.reviewFilterMethodWord;
    }

    public final int component22() {
        return this.reviewFilterMethodSent;
    }

    public final int component23() {
        return this.reviewPracticeModelChar;
    }

    public final int component24() {
        return this.reviewPracticeModelWord;
    }

    public final int component25() {
        return this.reviewPracticeModelSent;
    }

    public final String component26() {
        return this.reviewSelectRecordChar;
    }

    public final String component27() {
        return this.reviewSelectRecordWord;
    }

    public final String component28() {
        return this.reviewSelectRecordSent;
    }

    public final int component29() {
        return this.ackEnterPos;
    }

    public final String component3() {
        return this.mainTT;
    }

    public final int component30() {
        return this.ackUnitId;
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
        return this.restartTimestamp;
    }

    public final long component9() {
        return this.currentEnteredUnitId;
    }

    public final LearnProgress copy(String lan, String main, String mainTT, String lessonExam, String lessonStars, String audioLesson, int i11, long j11, long j12, int i12, int i13, String flashCardFocusUnit, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i14, int i15, int i16, int i17, int i18, int i19, String reviewSelectRecordChar, String reviewSelectRecordWord, String str, int i21, int i22, boolean z18) {
        m.f(lan, "lan");
        m.f(main, "main");
        m.f(mainTT, "mainTT");
        m.f(lessonExam, "lessonExam");
        m.f(lessonStars, "lessonStars");
        m.f(audioLesson, "audioLesson");
        m.f(flashCardFocusUnit, "flashCardFocusUnit");
        m.f(reviewSelectRecordChar, "reviewSelectRecordChar");
        m.f(reviewSelectRecordWord, "reviewSelectRecordWord");
        m.f(str, SemtNwfPgIhi.utrWWdqYTEUL);
        return new LearnProgress(lan, main, mainTT, lessonExam, lessonStars, audioLesson, i11, j11, j12, i12, i13, flashCardFocusUnit, z11, z12, z13, z14, z15, z16, z17, i14, i15, i16, i17, i18, i19, reviewSelectRecordChar, reviewSelectRecordWord, str, i21, i22, z18);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LearnProgress)) {
            return false;
        }
        LearnProgress learnProgress = (LearnProgress) obj;
        return m.a(this.lan, learnProgress.lan) && m.a(this.main, learnProgress.main) && m.a(this.mainTT, learnProgress.mainTT) && m.a(this.lessonExam, learnProgress.lessonExam) && m.a(this.lessonStars, learnProgress.lessonStars) && m.a(this.audioLesson, learnProgress.audioLesson) && this.pronun == learnProgress.pronun && this.restartTimestamp == learnProgress.restartTimestamp && this.currentEnteredUnitId == learnProgress.currentEnteredUnitId && this.flashCardPracticeCount == learnProgress.flashCardPracticeCount && this.flashCardDisplayIn == learnProgress.flashCardDisplayIn && m.a(this.flashCardFocusUnit, learnProgress.flashCardFocusUnit) && this.flashCardIsLearnChar == learnProgress.flashCardIsLearnChar && this.flashCardIsLearnWord == learnProgress.flashCardIsLearnWord && this.flashCardIsLearnSent == learnProgress.flashCardIsLearnSent && this.flashCardFocusNew == learnProgress.flashCardFocusNew && this.flashCardFocusWeak == learnProgress.flashCardFocusWeak && this.flashCardFocusGood == learnProgress.flashCardFocusGood && this.flashCardFocusPerfect == learnProgress.flashCardFocusPerfect && this.reviewFilterMethodChar == learnProgress.reviewFilterMethodChar && this.reviewFilterMethodWord == learnProgress.reviewFilterMethodWord && this.reviewFilterMethodSent == learnProgress.reviewFilterMethodSent && this.reviewPracticeModelChar == learnProgress.reviewPracticeModelChar && this.reviewPracticeModelWord == learnProgress.reviewPracticeModelWord && this.reviewPracticeModelSent == learnProgress.reviewPracticeModelSent && m.a(this.reviewSelectRecordChar, learnProgress.reviewSelectRecordChar) && m.a(this.reviewSelectRecordWord, learnProgress.reviewSelectRecordWord) && m.a(this.reviewSelectRecordSent, learnProgress.reviewSelectRecordSent) && this.ackEnterPos == learnProgress.ackEnterPos && this.ackUnitId == learnProgress.ackUnitId && this.pendingUpdate == learnProgress.pendingUpdate;
    }

    public final int getAckEnterPos() {
        return this.ackEnterPos;
    }

    public final int getAckUnitId() {
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
        return Boolean.hashCode(this.pendingUpdate) + e.b(this.ackUnitId, e.b(this.ackEnterPos, e.d(e.d(e.d(e.b(this.reviewPracticeModelSent, e.b(this.reviewPracticeModelWord, e.b(this.reviewPracticeModelChar, e.b(this.reviewFilterMethodSent, e.b(this.reviewFilterMethodWord, e.b(this.reviewFilterMethodChar, e.e(e.e(e.e(e.e(e.e(e.e(e.e(e.d(e.b(this.flashCardDisplayIn, e.b(this.flashCardPracticeCount, e.f(this.currentEnteredUnitId, e.f(this.restartTimestamp, e.b(this.pronun, e.d(e.d(e.d(e.d(e.d(this.lan.hashCode() * 31, 31, this.main), 31, this.mainTT), 31, this.lessonExam), 31, this.lessonStars), 31, this.audioLesson), 31), 31), 31), 31), 31), 31, this.flashCardFocusUnit), 31, this.flashCardIsLearnChar), 31, this.flashCardIsLearnWord), 31, this.flashCardIsLearnSent), 31, this.flashCardFocusNew), 31, this.flashCardFocusWeak), 31, this.flashCardFocusGood), 31, this.flashCardFocusPerfect), 31), 31), 31), 31), 31), 31), 31, this.reviewSelectRecordChar), 31, this.reviewSelectRecordWord), 31, this.reviewSelectRecordSent), 31), 31);
    }

    public String toString() {
        String str = this.lan;
        String str2 = this.main;
        String str3 = this.mainTT;
        String str4 = this.lessonExam;
        String str5 = this.lessonStars;
        String str6 = this.audioLesson;
        int i11 = this.pronun;
        long j11 = this.restartTimestamp;
        long j12 = this.currentEnteredUnitId;
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
        int i22 = this.ackUnitId;
        boolean z18 = this.pendingUpdate;
        StringBuilder sbS = e.s("LearnProgress(lan=", str, ", main=", str2, ", mainTT=");
        d.w(sbS, str3, ", lessonExam=", str4, ", lessonStars=");
        d.w(sbS, str5, ", audioLesson=", str6, ", pronun=");
        sbS.append(i11);
        sbS.append(", restartTimestamp=");
        sbS.append(j11);
        a.y(j12, ", currentEnteredUnitId=", ", flashCardPracticeCount=", sbS);
        a.v(i12, i13, ", flashCardDisplayIn=", ", flashCardFocusUnit=", sbS);
        sbS.append(str7);
        sbS.append(", flashCardIsLearnChar=");
        sbS.append(z11);
        sbS.append(", flashCardIsLearnWord=");
        a.B(", flashCardIsLearnSent=", ", flashCardFocusNew=", sbS, z12, z13);
        a.B(", flashCardFocusWeak=", ", flashCardFocusGood=", sbS, z14, z15);
        a.B(", flashCardFocusPerfect=", txBUGYhC.TPnWFCxzVEefHk, sbS, z16, z17);
        a.v(i14, i15, ", reviewFilterMethodWord=", ", reviewFilterMethodSent=", sbS);
        a.v(i16, i17, ", reviewPracticeModelChar=", ", reviewPracticeModelWord=", sbS);
        a.v(i18, i19, ", reviewPracticeModelSent=", aYZzTH.QmXtAXC, sbS);
        d.w(sbS, str8, ", reviewSelectRecordWord=", str9, ", reviewSelectRecordSent=");
        sbS.append(str10);
        sbS.append(", ackEnterPos=");
        sbS.append(i21);
        sbS.append(", ackUnitId=");
        sbS.append(i22);
        sbS.append(", pendingUpdate=");
        sbS.append(z18);
        sbS.append(")");
        return sbS.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LearnProgress(String lan) {
        this(lan, (!q.v0(lan, "up", false) || l.D(new String[]{"cnup", "jpup", "krup"}, lan)) ? "1:1:1" : "2:1:1", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, 1, 0L, -1L, 15, l.D(new String[]{"jp", "jpup", "kr", "krup", "cn", "cnup"}, lan) ? 3 : 2, "-1", true, true, true, true, true, true, false, 0, 0, 0, 0, 0, 0, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, 0, 0, true);
        m.f(lan, "lan");
    }
}
