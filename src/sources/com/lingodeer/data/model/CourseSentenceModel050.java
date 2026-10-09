package com.lingodeer.data.model;

import b7.e0;
import defpackage.e;
import hh.p0;
import java.util.List;
import kotlin.jvm.internal.m;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseSentenceModel050 {
    private final String answer;
    private final List<List<Long>> answerList;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f22294id;
    private final List<CourseWord> optionList;
    private final String options;
    private final CourseSentence sentence;
    private final long sentenceId;

    /* JADX WARN: Multi-variable type inference failed */
    public CourseSentenceModel050(long j11, long j12, String options, String answer, CourseSentence sentence, List<CourseWord> optionList, List<? extends List<Long>> answerList) {
        m.f(options, "options");
        m.f(answer, "answer");
        m.f(sentence, "sentence");
        m.f(optionList, "optionList");
        m.f(answerList, "answerList");
        this.f22294id = j11;
        this.sentenceId = j12;
        this.options = options;
        this.answer = answer;
        this.sentence = sentence;
        this.optionList = optionList;
        this.answerList = answerList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CourseSentenceModel050 copy$default(CourseSentenceModel050 courseSentenceModel050, long j11, long j12, String str, String str2, CourseSentence courseSentence, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = courseSentenceModel050.f22294id;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            j12 = courseSentenceModel050.sentenceId;
        }
        long j14 = j12;
        if ((i11 & 4) != 0) {
            str = courseSentenceModel050.options;
        }
        return courseSentenceModel050.copy(j13, j14, str, (i11 & 8) != 0 ? courseSentenceModel050.answer : str2, (i11 & 16) != 0 ? courseSentenceModel050.sentence : courseSentence, (i11 & 32) != 0 ? courseSentenceModel050.optionList : list, (i11 & 64) != 0 ? courseSentenceModel050.answerList : list2);
    }

    public final long component1() {
        return this.f22294id;
    }

    public final long component2() {
        return this.sentenceId;
    }

    public final String component3() {
        return this.options;
    }

    public final String component4() {
        return this.answer;
    }

    public final CourseSentence component5() {
        return this.sentence;
    }

    public final List<CourseWord> component6() {
        return this.optionList;
    }

    public final List<List<Long>> component7() {
        return this.answerList;
    }

    public final CourseSentenceModel050 copy(long j11, long j12, String options, String answer, CourseSentence sentence, List<CourseWord> optionList, List<? extends List<Long>> answerList) {
        m.f(options, "options");
        m.f(answer, "answer");
        m.f(sentence, "sentence");
        m.f(optionList, "optionList");
        m.f(answerList, "answerList");
        return new CourseSentenceModel050(j11, j12, options, answer, sentence, optionList, answerList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseSentenceModel050)) {
            return false;
        }
        CourseSentenceModel050 courseSentenceModel050 = (CourseSentenceModel050) obj;
        return this.f22294id == courseSentenceModel050.f22294id && this.sentenceId == courseSentenceModel050.sentenceId && m.a(this.options, courseSentenceModel050.options) && m.a(this.answer, courseSentenceModel050.answer) && m.a(this.sentence, courseSentenceModel050.sentence) && m.a(this.optionList, courseSentenceModel050.optionList) && m.a(this.answerList, courseSentenceModel050.answerList);
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final List<List<Long>> getAnswerList() {
        return this.answerList;
    }

    public final long getId() {
        return this.f22294id;
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

    public int hashCode() {
        return this.answerList.hashCode() + p0.b((this.sentence.hashCode() + e.d(e.d(e.f(this.sentenceId, Long.hashCode(this.f22294id) * 31, 31), 31, this.options), 31, this.answer)) * 31, 31, this.optionList);
    }

    public String toString() {
        long j11 = this.f22294id;
        long j12 = this.sentenceId;
        String str = this.options;
        String str2 = this.answer;
        CourseSentence courseSentence = this.sentence;
        List<CourseWord> list = this.optionList;
        List<List<Long>> list2 = this.answerList;
        StringBuilder sbJ = c.j(j11, "CourseSentenceModel050(id=", ", sentenceId=");
        e0.w(j12, ", options=", str, sbJ);
        sbJ.append(", answer=");
        sbJ.append(str2);
        sbJ.append(", sentence=");
        sbJ.append(courseSentence);
        sbJ.append(", optionList=");
        sbJ.append(list);
        sbJ.append(", answerList=");
        sbJ.append(list2);
        sbJ.append(")");
        return sbJ.toString();
    }
}
