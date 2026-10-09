package com.lingodeer.data.model;

import b7.e0;
import defpackage.e;
import ep.a;
import java.util.List;
import kotlin.jvm.internal.m;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseSentenceModel040 {
    private final long answer;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f22293id;
    private final List<CourseWord> optionList;
    private final String options;
    private final CourseSentence sentence;
    private final long sentenceId;

    public CourseSentenceModel040(long j11, long j12, String options, long j13, CourseSentence sentence, List<CourseWord> optionList) {
        m.f(options, "options");
        m.f(sentence, "sentence");
        m.f(optionList, "optionList");
        this.f22293id = j11;
        this.sentenceId = j12;
        this.options = options;
        this.answer = j13;
        this.sentence = sentence;
        this.optionList = optionList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CourseSentenceModel040 copy$default(CourseSentenceModel040 courseSentenceModel040, long j11, long j12, String str, long j13, CourseSentence courseSentence, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = courseSentenceModel040.f22293id;
        }
        long j14 = j11;
        if ((i11 & 2) != 0) {
            j12 = courseSentenceModel040.sentenceId;
        }
        long j15 = j12;
        if ((i11 & 4) != 0) {
            str = courseSentenceModel040.options;
        }
        return courseSentenceModel040.copy(j14, j15, str, (i11 & 8) != 0 ? courseSentenceModel040.answer : j13, (i11 & 16) != 0 ? courseSentenceModel040.sentence : courseSentence, (i11 & 32) != 0 ? courseSentenceModel040.optionList : list);
    }

    public final long component1() {
        return this.f22293id;
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

    public final List<CourseWord> component6() {
        return this.optionList;
    }

    public final CourseSentenceModel040 copy(long j11, long j12, String options, long j13, CourseSentence sentence, List<CourseWord> optionList) {
        m.f(options, "options");
        m.f(sentence, "sentence");
        m.f(optionList, "optionList");
        return new CourseSentenceModel040(j11, j12, options, j13, sentence, optionList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseSentenceModel040)) {
            return false;
        }
        CourseSentenceModel040 courseSentenceModel040 = (CourseSentenceModel040) obj;
        return this.f22293id == courseSentenceModel040.f22293id && this.sentenceId == courseSentenceModel040.sentenceId && m.a(this.options, courseSentenceModel040.options) && this.answer == courseSentenceModel040.answer && m.a(this.sentence, courseSentenceModel040.sentence) && m.a(this.optionList, courseSentenceModel040.optionList);
    }

    public final long getAnswer() {
        return this.answer;
    }

    public final long getId() {
        return this.f22293id;
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
        return this.optionList.hashCode() + ((this.sentence.hashCode() + e.f(this.answer, e.d(e.f(this.sentenceId, Long.hashCode(this.f22293id) * 31, 31), 31, this.options), 31)) * 31);
    }

    public String toString() {
        long j11 = this.f22293id;
        long j12 = this.sentenceId;
        String str = this.options;
        long j13 = this.answer;
        CourseSentence courseSentence = this.sentence;
        List<CourseWord> list = this.optionList;
        StringBuilder sbJ = c.j(j11, "CourseSentenceModel040(id=", ", sentenceId=");
        e0.w(j12, ", options=", str, sbJ);
        a.y(j13, ", answer=", ", sentence=", sbJ);
        sbJ.append(courseSentence);
        sbJ.append(", optionList=");
        sbJ.append(list);
        sbJ.append(")");
        return sbJ.toString();
    }
}
