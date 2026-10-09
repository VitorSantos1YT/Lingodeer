package com.lingodeer.data.model;

import com.google.android.material.datepicker.d;
import defpackage.e;
import ep.a;
import java.util.List;
import kotlin.jvm.internal.m;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseSentenceModelQA {
    private final String answer;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f22300id;
    private final String optPosition;
    private final List<CourseWord> optionList;
    private final String options;
    private final CourseSentence sentence;
    private final CourseSentence sentence2;
    private final long sentenceId;
    private final long sentenceStem;

    public CourseSentenceModelQA(long j11, long j12, long j13, String options, String optPosition, String answer, CourseSentence sentence, CourseSentence sentence2, List<CourseWord> optionList) {
        m.f(options, "options");
        m.f(optPosition, "optPosition");
        m.f(answer, "answer");
        m.f(sentence, "sentence");
        m.f(sentence2, "sentence2");
        m.f(optionList, "optionList");
        this.f22300id = j11;
        this.sentenceId = j12;
        this.sentenceStem = j13;
        this.options = options;
        this.optPosition = optPosition;
        this.answer = answer;
        this.sentence = sentence;
        this.sentence2 = sentence2;
        this.optionList = optionList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CourseSentenceModelQA copy$default(CourseSentenceModelQA courseSentenceModelQA, long j11, long j12, long j13, String str, String str2, String str3, CourseSentence courseSentence, CourseSentence courseSentence2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = courseSentenceModelQA.f22300id;
        }
        return courseSentenceModelQA.copy(j11, (i11 & 2) != 0 ? courseSentenceModelQA.sentenceId : j12, (i11 & 4) != 0 ? courseSentenceModelQA.sentenceStem : j13, (i11 & 8) != 0 ? courseSentenceModelQA.options : str, (i11 & 16) != 0 ? courseSentenceModelQA.optPosition : str2, (i11 & 32) != 0 ? courseSentenceModelQA.answer : str3, (i11 & 64) != 0 ? courseSentenceModelQA.sentence : courseSentence, (i11 & 128) != 0 ? courseSentenceModelQA.sentence2 : courseSentence2, (i11 & 256) != 0 ? courseSentenceModelQA.optionList : list);
    }

    public final long component1() {
        return this.f22300id;
    }

    public final long component2() {
        return this.sentenceId;
    }

    public final long component3() {
        return this.sentenceStem;
    }

    public final String component4() {
        return this.options;
    }

    public final String component5() {
        return this.optPosition;
    }

    public final String component6() {
        return this.answer;
    }

    public final CourseSentence component7() {
        return this.sentence;
    }

    public final CourseSentence component8() {
        return this.sentence2;
    }

    public final List<CourseWord> component9() {
        return this.optionList;
    }

    public final CourseSentenceModelQA copy(long j11, long j12, long j13, String options, String optPosition, String answer, CourseSentence sentence, CourseSentence sentence2, List<CourseWord> optionList) {
        m.f(options, "options");
        m.f(optPosition, "optPosition");
        m.f(answer, "answer");
        m.f(sentence, "sentence");
        m.f(sentence2, "sentence2");
        m.f(optionList, "optionList");
        return new CourseSentenceModelQA(j11, j12, j13, options, optPosition, answer, sentence, sentence2, optionList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseSentenceModelQA)) {
            return false;
        }
        CourseSentenceModelQA courseSentenceModelQA = (CourseSentenceModelQA) obj;
        return this.f22300id == courseSentenceModelQA.f22300id && this.sentenceId == courseSentenceModelQA.sentenceId && this.sentenceStem == courseSentenceModelQA.sentenceStem && m.a(this.options, courseSentenceModelQA.options) && m.a(this.optPosition, courseSentenceModelQA.optPosition) && m.a(this.answer, courseSentenceModelQA.answer) && m.a(this.sentence, courseSentenceModelQA.sentence) && m.a(this.sentence2, courseSentenceModelQA.sentence2) && m.a(this.optionList, courseSentenceModelQA.optionList);
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final long getId() {
        return this.f22300id;
    }

    public final String getOptPosition() {
        return this.optPosition;
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

    public final CourseSentence getSentence2() {
        return this.sentence2;
    }

    public final long getSentenceId() {
        return this.sentenceId;
    }

    public final long getSentenceStem() {
        return this.sentenceStem;
    }

    public int hashCode() {
        return this.optionList.hashCode() + ((this.sentence2.hashCode() + ((this.sentence.hashCode() + e.d(e.d(e.d(e.f(this.sentenceStem, e.f(this.sentenceId, Long.hashCode(this.f22300id) * 31, 31), 31), 31, this.options), 31, this.optPosition), 31, this.answer)) * 31)) * 31);
    }

    public String toString() {
        long j11 = this.f22300id;
        long j12 = this.sentenceId;
        long j13 = this.sentenceStem;
        String str = this.options;
        String str2 = this.optPosition;
        String str3 = this.answer;
        CourseSentence courseSentence = this.sentence;
        CourseSentence courseSentence2 = this.sentence2;
        List<CourseWord> list = this.optionList;
        StringBuilder sbJ = c.j(j11, "CourseSentenceModelQA(id=", ", sentenceId=");
        sbJ.append(j12);
        a.y(j13, ", sentenceStem=", ", options=", sbJ);
        d.w(sbJ, str, ", optPosition=", str2, ", answer=");
        sbJ.append(str3);
        sbJ.append(", sentence=");
        sbJ.append(courseSentence);
        sbJ.append(", sentence2=");
        sbJ.append(courseSentence2);
        sbJ.append(", optionList=");
        sbJ.append(list);
        sbJ.append(")");
        return sbJ.toString();
    }
}
