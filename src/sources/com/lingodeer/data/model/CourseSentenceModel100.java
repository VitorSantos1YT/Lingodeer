package com.lingodeer.data.model;

import am.rVFB.LwKl;
import b7.e0;
import defpackage.e;
import hh.p0;
import java.util.List;
import kotlin.jvm.internal.m;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseSentenceModel100 {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f22299id;
    private final List<CourseWord> optionList;
    private final String options;
    private final CourseSentence sentence;
    private final long sentenceId;
    private final String sentenceStem;
    private final List<CourseWord> stemList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CourseSentenceModel100 copy$default(CourseSentenceModel100 courseSentenceModel100, long j11, long j12, String str, String str2, CourseSentence courseSentence, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = courseSentenceModel100.f22299id;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            j12 = courseSentenceModel100.sentenceId;
        }
        long j14 = j12;
        if ((i11 & 4) != 0) {
            str = courseSentenceModel100.sentenceStem;
        }
        return courseSentenceModel100.copy(j13, j14, str, (i11 & 8) != 0 ? courseSentenceModel100.options : str2, (i11 & 16) != 0 ? courseSentenceModel100.sentence : courseSentence, (i11 & 32) != 0 ? courseSentenceModel100.stemList : list, (i11 & 64) != 0 ? courseSentenceModel100.optionList : list2);
    }

    public final long component1() {
        return this.f22299id;
    }

    public final long component2() {
        return this.sentenceId;
    }

    public final String component3() {
        return this.sentenceStem;
    }

    public final String component4() {
        return this.options;
    }

    public final CourseSentence component5() {
        return this.sentence;
    }

    public final List<CourseWord> component6() {
        return this.stemList;
    }

    public final List<CourseWord> component7() {
        return this.optionList;
    }

    public final CourseSentenceModel100 copy(long j11, long j12, String sentenceStem, String options, CourseSentence sentence, List<CourseWord> stemList, List<CourseWord> optionList) {
        m.f(sentenceStem, "sentenceStem");
        m.f(options, "options");
        m.f(sentence, "sentence");
        m.f(stemList, "stemList");
        m.f(optionList, "optionList");
        return new CourseSentenceModel100(j11, j12, sentenceStem, options, sentence, stemList, optionList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseSentenceModel100)) {
            return false;
        }
        CourseSentenceModel100 courseSentenceModel100 = (CourseSentenceModel100) obj;
        return this.f22299id == courseSentenceModel100.f22299id && this.sentenceId == courseSentenceModel100.sentenceId && m.a(this.sentenceStem, courseSentenceModel100.sentenceStem) && m.a(this.options, courseSentenceModel100.options) && m.a(this.sentence, courseSentenceModel100.sentence) && m.a(this.stemList, courseSentenceModel100.stemList) && m.a(this.optionList, courseSentenceModel100.optionList);
    }

    public final long getId() {
        return this.f22299id;
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

    public final String getSentenceStem() {
        return this.sentenceStem;
    }

    public final List<CourseWord> getStemList() {
        return this.stemList;
    }

    public int hashCode() {
        return this.optionList.hashCode() + p0.b((this.sentence.hashCode() + e.d(e.d(e.f(this.sentenceId, Long.hashCode(this.f22299id) * 31, 31), 31, this.sentenceStem), 31, this.options)) * 31, 31, this.stemList);
    }

    public String toString() {
        long j11 = this.f22299id;
        long j12 = this.sentenceId;
        String str = this.sentenceStem;
        String str2 = this.options;
        CourseSentence courseSentence = this.sentence;
        List<CourseWord> list = this.stemList;
        List<CourseWord> list2 = this.optionList;
        StringBuilder sbJ = c.j(j11, "CourseSentenceModel100(id=", ", sentenceId=");
        e0.w(j12, ", sentenceStem=", str, sbJ);
        sbJ.append(", options=");
        sbJ.append(str2);
        sbJ.append(", sentence=");
        sbJ.append(courseSentence);
        sbJ.append(", stemList=");
        sbJ.append(list);
        sbJ.append(", optionList=");
        sbJ.append(list2);
        sbJ.append(")");
        return sbJ.toString();
    }

    public CourseSentenceModel100(long j11, long j12, String sentenceStem, String options, CourseSentence sentence, List<CourseWord> list, List<CourseWord> optionList) {
        m.f(sentenceStem, "sentenceStem");
        m.f(options, "options");
        m.f(sentence, "sentence");
        m.f(list, LwKl.GrNcLcr);
        m.f(optionList, "optionList");
        this.f22299id = j11;
        this.sentenceId = j12;
        this.sentenceStem = sentenceStem;
        this.options = options;
        this.sentence = sentence;
        this.stemList = list;
        this.optionList = optionList;
    }
}
