package com.lingodeer.data.model;

import b7.e0;
import com.google.android.material.datepicker.d;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import defpackage.e;
import hh.p0;
import java.util.List;
import kotlin.jvm.internal.m;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseSentenceModel030 {
    private final String answer;
    private final List<CourseWord> answerList;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f22292id;
    private final List<CourseWord> optionList;
    private final String options;
    private final CourseSentence sentence;
    private final long sentenceId;
    private final String stem;
    private final List<CourseWord> stemList;

    public CourseSentenceModel030(long j11, long j12, String stem, String options, String answer, CourseSentence sentence, List<CourseWord> stemList, List<CourseWord> optionList, List<CourseWord> answerList) {
        m.f(stem, "stem");
        m.f(options, "options");
        m.f(answer, "answer");
        m.f(sentence, "sentence");
        m.f(stemList, "stemList");
        m.f(optionList, "optionList");
        m.f(answerList, "answerList");
        this.f22292id = j11;
        this.sentenceId = j12;
        this.stem = stem;
        this.options = options;
        this.answer = answer;
        this.sentence = sentence;
        this.stemList = stemList;
        this.optionList = optionList;
        this.answerList = answerList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CourseSentenceModel030 copy$default(CourseSentenceModel030 courseSentenceModel030, long j11, long j12, String str, String str2, String str3, CourseSentence courseSentence, List list, List list2, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = courseSentenceModel030.f22292id;
        }
        return courseSentenceModel030.copy(j11, (i11 & 2) != 0 ? courseSentenceModel030.sentenceId : j12, (i11 & 4) != 0 ? courseSentenceModel030.stem : str, (i11 & 8) != 0 ? courseSentenceModel030.options : str2, (i11 & 16) != 0 ? courseSentenceModel030.answer : str3, (i11 & 32) != 0 ? courseSentenceModel030.sentence : courseSentence, (i11 & 64) != 0 ? courseSentenceModel030.stemList : list, (i11 & 128) != 0 ? courseSentenceModel030.optionList : list2, (i11 & 256) != 0 ? courseSentenceModel030.answerList : list3);
    }

    public final long component1() {
        return this.f22292id;
    }

    public final long component2() {
        return this.sentenceId;
    }

    public final String component3() {
        return this.stem;
    }

    public final String component4() {
        return this.options;
    }

    public final String component5() {
        return this.answer;
    }

    public final CourseSentence component6() {
        return this.sentence;
    }

    public final List<CourseWord> component7() {
        return this.stemList;
    }

    public final List<CourseWord> component8() {
        return this.optionList;
    }

    public final List<CourseWord> component9() {
        return this.answerList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseSentenceModel030)) {
            return false;
        }
        CourseSentenceModel030 courseSentenceModel030 = (CourseSentenceModel030) obj;
        return this.f22292id == courseSentenceModel030.f22292id && this.sentenceId == courseSentenceModel030.sentenceId && m.a(this.stem, courseSentenceModel030.stem) && m.a(this.options, courseSentenceModel030.options) && m.a(this.answer, courseSentenceModel030.answer) && m.a(this.sentence, courseSentenceModel030.sentence) && m.a(this.stemList, courseSentenceModel030.stemList) && m.a(this.optionList, courseSentenceModel030.optionList) && m.a(this.answerList, courseSentenceModel030.answerList);
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final List<CourseWord> getAnswerList() {
        return this.answerList;
    }

    public final long getId() {
        return this.f22292id;
    }

    public final List<CourseWord> getOptionList() {
        return this.optionList;
    }

    public final String getOptions() {
        return this.options;
    }

    public final CourseSentence getSentence() {
        return this.sentence;
    }

    public final long getSentenceId() {
        return this.sentenceId;
    }

    public final String getStem() {
        return this.stem;
    }

    public final List<CourseWord> getStemList() {
        return this.stemList;
    }

    public int hashCode() {
        return this.answerList.hashCode() + p0.b(p0.b((this.sentence.hashCode() + e.d(e.d(e.d(e.f(this.sentenceId, Long.hashCode(this.f22292id) * 31, 31), 31, this.stem), 31, this.options), 31, this.answer)) * 31, 31, this.stemList), 31, this.optionList);
    }

    public String toString() {
        long j11 = this.f22292id;
        long j12 = this.sentenceId;
        String str = this.stem;
        String str2 = this.options;
        String str3 = this.answer;
        CourseSentence courseSentence = this.sentence;
        List<CourseWord> list = this.stemList;
        List<CourseWord> list2 = this.optionList;
        List<CourseWord> list3 = this.answerList;
        StringBuilder sbJ = c.j(j11, "CourseSentenceModel030(id=", ", sentenceId=");
        e0.w(j12, ", stem=", str, sbJ);
        d.w(sbJ, ", options=", str2, ", answer=", str3);
        sbJ.append(", sentence=");
        sbJ.append(courseSentence);
        sbJ.append(", stemList=");
        sbJ.append(list);
        sbJ.append(", optionList=");
        sbJ.append(list2);
        sbJ.append(", answerList=");
        sbJ.append(list3);
        sbJ.append(")");
        return sbJ.toString();
    }

    public final CourseSentenceModel030 copy(long j11, long j12, String stem, String options, String answer, CourseSentence sentence, List<CourseWord> stemList, List<CourseWord> optionList, List<CourseWord> list) {
        m.f(stem, "stem");
        m.f(options, "options");
        m.f(answer, "answer");
        m.f(sentence, "sentence");
        m.f(stemList, "stemList");
        m.f(optionList, "optionList");
        m.f(list, gkbGsXmgaxRjJ.FHP);
        return new CourseSentenceModel030(j11, j12, stem, options, answer, sentence, stemList, optionList, list);
    }
}
