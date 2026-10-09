package com.lingodeer.data.model;

import b7.e0;
import defpackage.e;
import java.util.List;
import kotlin.jvm.internal.m;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseSentenceModel020 {
    private final String answer;
    private final List<CourseWord> answerList;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f22291id;
    private final CourseSentence sentence;
    private final long sentenceId;

    public CourseSentenceModel020(long j11, long j12, String answer, CourseSentence sentence, List<CourseWord> answerList) {
        m.f(answer, "answer");
        m.f(sentence, "sentence");
        m.f(answerList, "answerList");
        this.f22291id = j11;
        this.sentenceId = j12;
        this.answer = answer;
        this.sentence = sentence;
        this.answerList = answerList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CourseSentenceModel020 copy$default(CourseSentenceModel020 courseSentenceModel020, long j11, long j12, String str, CourseSentence courseSentence, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = courseSentenceModel020.f22291id;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            j12 = courseSentenceModel020.sentenceId;
        }
        long j14 = j12;
        if ((i11 & 4) != 0) {
            str = courseSentenceModel020.answer;
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            courseSentence = courseSentenceModel020.sentence;
        }
        CourseSentence courseSentence2 = courseSentence;
        if ((i11 & 16) != 0) {
            list = courseSentenceModel020.answerList;
        }
        return courseSentenceModel020.copy(j13, j14, str2, courseSentence2, list);
    }

    public final long component1() {
        return this.f22291id;
    }

    public final long component2() {
        return this.sentenceId;
    }

    public final String component3() {
        return this.answer;
    }

    public final CourseSentence component4() {
        return this.sentence;
    }

    public final List<CourseWord> component5() {
        return this.answerList;
    }

    public final CourseSentenceModel020 copy(long j11, long j12, String answer, CourseSentence sentence, List<CourseWord> answerList) {
        m.f(answer, "answer");
        m.f(sentence, "sentence");
        m.f(answerList, "answerList");
        return new CourseSentenceModel020(j11, j12, answer, sentence, answerList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseSentenceModel020)) {
            return false;
        }
        CourseSentenceModel020 courseSentenceModel020 = (CourseSentenceModel020) obj;
        return this.f22291id == courseSentenceModel020.f22291id && this.sentenceId == courseSentenceModel020.sentenceId && m.a(this.answer, courseSentenceModel020.answer) && m.a(this.sentence, courseSentenceModel020.sentence) && m.a(this.answerList, courseSentenceModel020.answerList);
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final List<CourseWord> getAnswerList() {
        return this.answerList;
    }

    public final long getId() {
        return this.f22291id;
    }

    public final CourseSentence getSentence() {
        return this.sentence;
    }

    public final long getSentenceId() {
        return this.sentenceId;
    }

    public int hashCode() {
        return this.answerList.hashCode() + ((this.sentence.hashCode() + e.d(e.f(this.sentenceId, Long.hashCode(this.f22291id) * 31, 31), 31, this.answer)) * 31);
    }

    public String toString() {
        long j11 = this.f22291id;
        long j12 = this.sentenceId;
        String str = this.answer;
        CourseSentence courseSentence = this.sentence;
        List<CourseWord> list = this.answerList;
        StringBuilder sbJ = c.j(j11, "CourseSentenceModel020(id=", ", sentenceId=");
        e0.w(j12, ", answer=", str, sbJ);
        sbJ.append(", sentence=");
        sbJ.append(courseSentence);
        sbJ.append(", answerList=");
        sbJ.append(list);
        sbJ.append(")");
        return sbJ.toString();
    }
}
