package com.lingodeer.data.model;

import b7.e0;
import defpackage.e;
import ep.a;
import hh.p0;
import java.util.List;
import kotlin.jvm.internal.m;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseSentenceModel080 {
    private final long answer;
    private final CourseSentence answerSentence;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f22297id;
    private final List<CourseSentence> optionList;
    private final String options;
    private final CourseSentence sentence;
    private final long sentenceId;

    public CourseSentenceModel080(long j11, long j12, String options, long j13, CourseSentence sentence, List<CourseSentence> optionList, CourseSentence answerSentence) {
        m.f(options, "options");
        m.f(sentence, "sentence");
        m.f(optionList, "optionList");
        m.f(answerSentence, "answerSentence");
        this.f22297id = j11;
        this.sentenceId = j12;
        this.options = options;
        this.answer = j13;
        this.sentence = sentence;
        this.optionList = optionList;
        this.answerSentence = answerSentence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CourseSentenceModel080 copy$default(CourseSentenceModel080 courseSentenceModel080, long j11, long j12, String str, long j13, CourseSentence courseSentence, List list, CourseSentence courseSentence2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = courseSentenceModel080.f22297id;
        }
        long j14 = j11;
        if ((i11 & 2) != 0) {
            j12 = courseSentenceModel080.sentenceId;
        }
        return courseSentenceModel080.copy(j14, j12, (i11 & 4) != 0 ? courseSentenceModel080.options : str, (i11 & 8) != 0 ? courseSentenceModel080.answer : j13, (i11 & 16) != 0 ? courseSentenceModel080.sentence : courseSentence, (i11 & 32) != 0 ? courseSentenceModel080.optionList : list, (i11 & 64) != 0 ? courseSentenceModel080.answerSentence : courseSentence2);
    }

    public final long component1() {
        return this.f22297id;
    }

    public final long component2() {
        return this.sentenceId;
    }

    public final String component3() {
        return this.options;
    }

    public final long component4() {
        return this.answer;
    }

    public final CourseSentence component5() {
        return this.sentence;
    }

    public final List<CourseSentence> component6() {
        return this.optionList;
    }

    public final CourseSentence component7() {
        return this.answerSentence;
    }

    public final CourseSentenceModel080 copy(long j11, long j12, String options, long j13, CourseSentence sentence, List<CourseSentence> optionList, CourseSentence answerSentence) {
        m.f(options, "options");
        m.f(sentence, "sentence");
        m.f(optionList, "optionList");
        m.f(answerSentence, "answerSentence");
        return new CourseSentenceModel080(j11, j12, options, j13, sentence, optionList, answerSentence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseSentenceModel080)) {
            return false;
        }
        CourseSentenceModel080 courseSentenceModel080 = (CourseSentenceModel080) obj;
        return this.f22297id == courseSentenceModel080.f22297id && this.sentenceId == courseSentenceModel080.sentenceId && m.a(this.options, courseSentenceModel080.options) && this.answer == courseSentenceModel080.answer && m.a(this.sentence, courseSentenceModel080.sentence) && m.a(this.optionList, courseSentenceModel080.optionList) && m.a(this.answerSentence, courseSentenceModel080.answerSentence);
    }

    public final long getAnswer() {
        return this.answer;
    }

    public final CourseSentence getAnswerSentence() {
        return this.answerSentence;
    }

    public final long getId() {
        return this.f22297id;
    }

    public final List<CourseSentence> getOptionList() {
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
        return this.answerSentence.hashCode() + p0.b((this.sentence.hashCode() + e.f(this.answer, e.d(e.f(this.sentenceId, Long.hashCode(this.f22297id) * 31, 31), 31, this.options), 31)) * 31, 31, this.optionList);
    }

    public String toString() {
        long j11 = this.f22297id;
        long j12 = this.sentenceId;
        String str = this.options;
        long j13 = this.answer;
        CourseSentence courseSentence = this.sentence;
        List<CourseSentence> list = this.optionList;
        CourseSentence courseSentence2 = this.answerSentence;
        StringBuilder sbJ = c.j(j11, "CourseSentenceModel080(id=", ", sentenceId=");
        e0.w(j12, ", options=", str, sbJ);
        a.y(j13, ", answer=", ", sentence=", sbJ);
        sbJ.append(courseSentence);
        sbJ.append(", optionList=");
        sbJ.append(list);
        sbJ.append(", answerSentence=");
        sbJ.append(courseSentence2);
        sbJ.append(")");
        return sbJ.toString();
    }
}
