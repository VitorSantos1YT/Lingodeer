package com.lingo.fluent.object;

import com.google.gson.annotations.SerializedName;
import defpackage.e;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SyncProgress {
    public static final int $stable = 8;

    @SerializedName("LessonFav")
    private String lessonFav;

    @SerializedName("LessonRead")
    private String lessonRead;

    @SerializedName("TipsCard")
    private String tipsCard;

    @SerializedName("Vocabulary")
    private String vocabulary;

    public SyncProgress(String lessonFav, String vocabulary, String tipsCard, String lessonRead) {
        m.f(lessonFav, "lessonFav");
        m.f(vocabulary, "vocabulary");
        m.f(tipsCard, "tipsCard");
        m.f(lessonRead, "lessonRead");
        this.lessonFav = lessonFav;
        this.vocabulary = vocabulary;
        this.tipsCard = tipsCard;
        this.lessonRead = lessonRead;
    }

    public static /* synthetic */ SyncProgress copy$default(SyncProgress syncProgress, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = syncProgress.lessonFav;
        }
        if ((i11 & 2) != 0) {
            str2 = syncProgress.vocabulary;
        }
        if ((i11 & 4) != 0) {
            str3 = syncProgress.tipsCard;
        }
        if ((i11 & 8) != 0) {
            str4 = syncProgress.lessonRead;
        }
        return syncProgress.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.lessonFav;
    }

    public final String component2() {
        return this.vocabulary;
    }

    public final String component3() {
        return this.tipsCard;
    }

    public final String component4() {
        return this.lessonRead;
    }

    public final SyncProgress copy(String lessonFav, String vocabulary, String tipsCard, String lessonRead) {
        m.f(lessonFav, "lessonFav");
        m.f(vocabulary, "vocabulary");
        m.f(tipsCard, "tipsCard");
        m.f(lessonRead, "lessonRead");
        return new SyncProgress(lessonFav, vocabulary, tipsCard, lessonRead);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncProgress)) {
            return false;
        }
        SyncProgress syncProgress = (SyncProgress) obj;
        return m.a(this.lessonFav, syncProgress.lessonFav) && m.a(this.vocabulary, syncProgress.vocabulary) && m.a(this.tipsCard, syncProgress.tipsCard) && m.a(this.lessonRead, syncProgress.lessonRead);
    }

    public final String getLessonFav() {
        return this.lessonFav;
    }

    public final String getLessonRead() {
        return this.lessonRead;
    }

    public final String getTipsCard() {
        return this.tipsCard;
    }

    public final String getVocabulary() {
        return this.vocabulary;
    }

    public int hashCode() {
        return this.lessonRead.hashCode() + e.d(e.d(this.lessonFav.hashCode() * 31, 31, this.vocabulary), 31, this.tipsCard);
    }

    public final void setLessonFav(String str) {
        m.f(str, "<set-?>");
        this.lessonFav = str;
    }

    public final void setLessonRead(String str) {
        m.f(str, "<set-?>");
        this.lessonRead = str;
    }

    public final void setTipsCard(String str) {
        m.f(str, "<set-?>");
        this.tipsCard = str;
    }

    public final void setVocabulary(String str) {
        m.f(str, "<set-?>");
        this.vocabulary = str;
    }

    public String toString() {
        String str = this.lessonFav;
        String str2 = this.vocabulary;
        return e.p(e.s("SyncProgress(lessonFav=", str, ", vocabulary=", str2, ", tipsCard="), this.tipsCard, ", lessonRead=", this.lessonRead, ")");
    }
}
