package com.lingodeer.data.model;

import b7.e0;
import com.google.android.material.datepicker.d;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import ep.a;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseACK {
    private final long ackId;
    private final String bookmarkId;
    private final boolean canAccess;
    private final List<CourseSentence> exampleSentences;
    private final String examples;
    private final String explanation;
    private final String grammarACK;
    private final boolean isFav;
    private final String note;
    private final String translation;
    private final long unitId;
    private final String unitName;
    private final int unitSortIndex;

    public CourseACK(long j11, String grammarACK, String translation, String explanation, long j12, String examples, int i11, boolean z11, String bookmarkId, boolean z12, String note, String unitName, List<CourseSentence> exampleSentences) {
        m.f(grammarACK, "grammarACK");
        m.f(translation, "translation");
        m.f(explanation, "explanation");
        m.f(examples, "examples");
        m.f(bookmarkId, "bookmarkId");
        m.f(note, "note");
        m.f(unitName, "unitName");
        m.f(exampleSentences, "exampleSentences");
        this.ackId = j11;
        this.grammarACK = grammarACK;
        this.translation = translation;
        this.explanation = explanation;
        this.unitId = j12;
        this.examples = examples;
        this.unitSortIndex = i11;
        this.canAccess = z11;
        this.bookmarkId = bookmarkId;
        this.isFav = z12;
        this.note = note;
        this.unitName = unitName;
        this.exampleSentences = exampleSentences;
    }

    public final long component1() {
        return this.ackId;
    }

    public final boolean component10() {
        return this.isFav;
    }

    public final String component11() {
        return this.note;
    }

    public final String component12() {
        return this.unitName;
    }

    public final List<CourseSentence> component13() {
        return this.exampleSentences;
    }

    public final String component2() {
        return this.grammarACK;
    }

    public final String component3() {
        return this.translation;
    }

    public final String component4() {
        return this.explanation;
    }

    public final long component5() {
        return this.unitId;
    }

    public final String component6() {
        return this.examples;
    }

    public final int component7() {
        return this.unitSortIndex;
    }

    public final boolean component8() {
        return this.canAccess;
    }

    public final String component9() {
        return this.bookmarkId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseACK)) {
            return false;
        }
        CourseACK courseACK = (CourseACK) obj;
        return this.ackId == courseACK.ackId && m.a(this.grammarACK, courseACK.grammarACK) && m.a(this.translation, courseACK.translation) && m.a(this.explanation, courseACK.explanation) && this.unitId == courseACK.unitId && m.a(this.examples, courseACK.examples) && this.unitSortIndex == courseACK.unitSortIndex && this.canAccess == courseACK.canAccess && m.a(this.bookmarkId, courseACK.bookmarkId) && this.isFav == courseACK.isFav && m.a(this.note, courseACK.note) && m.a(this.unitName, courseACK.unitName) && m.a(this.exampleSentences, courseACK.exampleSentences);
    }

    public final long getAckId() {
        return this.ackId;
    }

    public final String getBookmarkId() {
        return this.bookmarkId;
    }

    public final boolean getCanAccess() {
        return this.canAccess;
    }

    public final List<CourseSentence> getExampleSentences() {
        return this.exampleSentences;
    }

    public final String getExamples() {
        return this.examples;
    }

    public final String getExplanation() {
        return this.explanation;
    }

    public final String getGrammarACK() {
        return this.grammarACK;
    }

    public final String getNote() {
        return this.note;
    }

    public final String getTranslation() {
        return this.translation;
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

    public int hashCode() {
        return this.exampleSentences.hashCode() + e.d(e.d(e.e(e.d(e.e(e.b(this.unitSortIndex, e.d(e.f(this.unitId, e.d(e.d(e.d(Long.hashCode(this.ackId) * 31, 31, this.grammarACK), 31, this.translation), 31, this.explanation), 31), 31, this.examples), 31), 31, this.canAccess), 31, this.bookmarkId), 31, this.isFav), 31, this.note), 31, this.unitName);
    }

    public final boolean isFav() {
        return this.isFav;
    }

    public String toString() {
        long j11 = this.ackId;
        String str = this.grammarACK;
        String str2 = this.translation;
        String str3 = this.explanation;
        long j12 = this.unitId;
        String str4 = this.examples;
        int i11 = this.unitSortIndex;
        boolean z11 = this.canAccess;
        String str5 = this.bookmarkId;
        boolean z12 = this.isFav;
        String str6 = this.note;
        String str7 = this.unitName;
        List<CourseSentence> list = this.exampleSentences;
        StringBuilder sbP = e0.p(j11, "CourseACK(ackId=", ", grammarACK=", str);
        d.w(sbP, ", translation=", str2, ", explanation=", str3);
        a.y(j12, ", unitId=", ", examples=", sbP);
        sbP.append(str4);
        sbP.append(", unitSortIndex=");
        sbP.append(i11);
        sbP.append(", canAccess=");
        sbP.append(z11);
        sbP.append(", bookmarkId=");
        sbP.append(str5);
        sbP.append(", isFav=");
        sbP.append(z12);
        sbP.append(", note=");
        sbP.append(str6);
        sbP.append(", unitName=");
        sbP.append(str7);
        sbP.append(", exampleSentences=");
        sbP.append(list);
        sbP.append(")");
        return sbP.toString();
    }

    public final CourseACK copy(long j11, String grammarACK, String translation, String explanation, long j12, String examples, int i11, boolean z11, String bookmarkId, boolean z12, String note, String unitName, List<CourseSentence> list) {
        m.f(grammarACK, "grammarACK");
        m.f(translation, "translation");
        m.f(explanation, "explanation");
        m.f(examples, "examples");
        m.f(bookmarkId, "bookmarkId");
        m.f(note, "note");
        m.f(unitName, "unitName");
        m.f(list, OCBJEWZHh.cSpMJgF);
        return new CourseACK(j11, grammarACK, translation, explanation, j12, examples, i11, z11, bookmarkId, z12, note, unitName, list);
    }

    public /* synthetic */ CourseACK(long j11, String str, String str2, String str3, long j12, String str4, int i11, boolean z11, String str5, boolean z12, String str6, String str7, List list, int i12, f fVar) {
        this(j11, str, str2, str3, j12, str4, (i12 & 64) != 0 ? -1 : i11, (i12 & 128) != 0 ? false : z11, (i12 & 256) != 0 ? BuildConfig.VERSION_NAME : str5, (i12 & 512) != 0 ? false : z12, (i12 & 1024) != 0 ? BuildConfig.VERSION_NAME : str6, (i12 & 2048) != 0 ? BuildConfig.VERSION_NAME : str7, (i12 & 4096) != 0 ? r.f50854a : list);
    }
}
