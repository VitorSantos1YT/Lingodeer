package com.lingodeer.data.model;

import com.google.android.material.datepicker.d;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ProgressCollectionItem {
    private final String lan;
    private final String lessonExam;
    private final String lessonStars;
    private final String main;
    private final String mainTT;
    private final int pronun;
    private final long restartTimestamp;

    public ProgressCollectionItem(String lan, String main, String mainTT, String lessonStars, String lessonExam, int i11, long j11) {
        m.f(lan, "lan");
        m.f(main, "main");
        m.f(mainTT, "mainTT");
        m.f(lessonStars, "lessonStars");
        m.f(lessonExam, "lessonExam");
        this.lan = lan;
        this.main = main;
        this.mainTT = mainTT;
        this.lessonStars = lessonStars;
        this.lessonExam = lessonExam;
        this.pronun = i11;
        this.restartTimestamp = j11;
    }

    public static /* synthetic */ ProgressCollectionItem copy$default(ProgressCollectionItem progressCollectionItem, String str, String str2, String str3, String str4, String str5, int i11, long j11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = progressCollectionItem.lan;
        }
        if ((i12 & 2) != 0) {
            str2 = progressCollectionItem.main;
        }
        if ((i12 & 4) != 0) {
            str3 = progressCollectionItem.mainTT;
        }
        if ((i12 & 8) != 0) {
            str4 = progressCollectionItem.lessonStars;
        }
        if ((i12 & 16) != 0) {
            str5 = progressCollectionItem.lessonExam;
        }
        if ((i12 & 32) != 0) {
            i11 = progressCollectionItem.pronun;
        }
        if ((i12 & 64) != 0) {
            j11 = progressCollectionItem.restartTimestamp;
        }
        long j12 = j11;
        String str6 = str5;
        int i13 = i11;
        return progressCollectionItem.copy(str, str2, str3, str4, str6, i13, j12);
    }

    public final String component1() {
        return this.lan;
    }

    public final String component2() {
        return this.main;
    }

    public final String component3() {
        return this.mainTT;
    }

    public final String component4() {
        return this.lessonStars;
    }

    public final String component5() {
        return this.lessonExam;
    }

    public final int component6() {
        return this.pronun;
    }

    public final long component7() {
        return this.restartTimestamp;
    }

    public final ProgressCollectionItem copy(String lan, String main, String mainTT, String lessonStars, String lessonExam, int i11, long j11) {
        m.f(lan, "lan");
        m.f(main, "main");
        m.f(mainTT, "mainTT");
        m.f(lessonStars, "lessonStars");
        m.f(lessonExam, "lessonExam");
        return new ProgressCollectionItem(lan, main, mainTT, lessonStars, lessonExam, i11, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressCollectionItem)) {
            return false;
        }
        ProgressCollectionItem progressCollectionItem = (ProgressCollectionItem) obj;
        return m.a(this.lan, progressCollectionItem.lan) && m.a(this.main, progressCollectionItem.main) && m.a(this.mainTT, progressCollectionItem.mainTT) && m.a(this.lessonStars, progressCollectionItem.lessonStars) && m.a(this.lessonExam, progressCollectionItem.lessonExam) && this.pronun == progressCollectionItem.pronun && this.restartTimestamp == progressCollectionItem.restartTimestamp;
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

    public final int getPronun() {
        return this.pronun;
    }

    public final long getRestartTimestamp() {
        return this.restartTimestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.restartTimestamp) + e.b(this.pronun, e.d(e.d(e.d(e.d(this.lan.hashCode() * 31, 31, this.main), 31, this.mainTT), 31, this.lessonStars), 31, this.lessonExam), 31);
    }

    public String toString() {
        String str = this.lan;
        String str2 = this.main;
        String str3 = this.mainTT;
        String str4 = this.lessonStars;
        String str5 = this.lessonExam;
        int i11 = this.pronun;
        long j11 = this.restartTimestamp;
        StringBuilder sbS = e.s("ProgressCollectionItem(lan=", str, ", main=", str2, ", mainTT=");
        d.w(sbS, str3, ", lessonStars=", str4, ", lessonExam=");
        sbS.append(str5);
        sbS.append(", pronun=");
        sbS.append(i11);
        sbS.append(", restartTimestamp=");
        return e.i(j11, ")", sbS);
    }

    public /* synthetic */ ProgressCollectionItem(String str, String str2, String str3, String str4, String str5, int i11, long j11, int i12, f fVar) {
        this(str, str2, str3, str4, str5, i11, (i12 & 64) != 0 ? 0L : j11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressCollectionItem(String lan) {
        this(lan, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, 0, 0L);
        m.f(lan, "lan");
    }

    public static /* synthetic */ void getLessonExam$annotations() {
    }

    public static /* synthetic */ void getLessonStars$annotations() {
    }

    public static /* synthetic */ void getMainTT$annotations() {
    }

    public static /* synthetic */ void getRestartTimestamp$annotations() {
    }
}
