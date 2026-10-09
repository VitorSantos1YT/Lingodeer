package com.lingodeer.data.model;

import b7.e0;
import defpackage.e;
import java.util.List;
import kotlin.jvm.internal.m;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseSentenceModel070 {
    private final String answer;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f22296id;
    private final List<CourseWord> optionList;
    private final String options;
    private final CourseSentence sentence;
    private final long sentenceId;

    public CourseSentenceModel070(long j11, long j12, String options, String answer, CourseSentence sentence, List<CourseWord> optionList) {
        m.f(options, "options");
        m.f(answer, "answer");
        m.f(sentence, "sentence");
        m.f(optionList, "optionList");
        this.f22296id = j11;
        this.sentenceId = j12;
        this.options = options;
        this.answer = answer;
        this.sentence = sentence;
        this.optionList = optionList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CourseSentenceModel070 copy$default(CourseSentenceModel070 courseSentenceModel070, long j11, long j12, String str, String str2, CourseSentence courseSentence, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = courseSentenceModel070.f22296id;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            j12 = courseSentenceModel070.sentenceId;
        }
        long j14 = j12;
        if ((i11 & 4) != 0) {
            str = courseSentenceModel070.options;
        }
        String str3 = str;
        if ((i11 & 8) != 0) {
            str2 = courseSentenceModel070.answer;
        }
        return courseSentenceModel070.copy(j13, j14, str3, str2, (i11 & 16) != 0 ? courseSentenceModel070.sentence : courseSentence, (i11 & 32) != 0 ? courseSentenceModel070.optionList : list);
    }

    public final long component1() {
        return this.f22296id;
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

    public final CourseSentenceModel070 copy(long j11, long j12, String options, String answer, CourseSentence sentence, List<CourseWord> optionList) {
        m.f(options, "options");
        m.f(answer, "answer");
        m.f(sentence, "sentence");
        m.f(optionList, "optionList");
        return new CourseSentenceModel070(j11, j12, options, answer, sentence, optionList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseSentenceModel070)) {
            return false;
        }
        CourseSentenceModel070 courseSentenceModel070 = (CourseSentenceModel070) obj;
        return this.f22296id == courseSentenceModel070.f22296id && this.sentenceId == courseSentenceModel070.sentenceId && m.a(this.options, courseSentenceModel070.options) && m.a(this.answer, courseSentenceModel070.answer) && m.a(this.sentence, courseSentenceModel070.sentence) && m.a(this.optionList, courseSentenceModel070.optionList);
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final long getId() {
        return this.f22296id;
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
        return this.optionList.hashCode() + ((this.sentence.hashCode() + e.d(e.d(e.f(this.sentenceId, Long.hashCode(this.f22296id) * 31, 31), 31, this.options), 31, this.answer)) * 31);
    }

    public String toString() {
        long j11 = this.f22296id;
        long j12 = this.sentenceId;
        String str = this.options;
        String str2 = this.answer;
        CourseSentence courseSentence = this.sentence;
        List<CourseWord> list = this.optionList;
        StringBuilder sbJ = c.j(j11, "CourseSentenceModel070(id=", ", sentenceId=");
        e0.w(j12, ", options=", str, sbJ);
        sbJ.append(", answer=");
        sbJ.append(str2);
        sbJ.append(", sentence=");
        sbJ.append(courseSentence);
        sbJ.append(", optionList=");
        sbJ.append(list);
        sbJ.append(")");
        return sbJ.toString();
    }
}
