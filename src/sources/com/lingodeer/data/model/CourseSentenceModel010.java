package com.lingodeer.data.model;

import b7.e0;
import com.google.android.material.datepicker.d;
import defpackage.e;
import java.util.List;
import kotlin.jvm.internal.m;
import pt.ImS.aYZzTH;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseSentenceModel010 {
    private final String answer;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f22290id;
    private final List<CourseSentence> optionList;
    private final String options;
    private final CourseSentence sentence;
    private final long sentenceId;
    private final String sentenceStem;
    private final String tOptions;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CourseSentenceModel010 copy$default(CourseSentenceModel010 courseSentenceModel010, long j11, long j12, String str, String str2, String str3, String str4, CourseSentence courseSentence, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = courseSentenceModel010.f22290id;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            j12 = courseSentenceModel010.sentenceId;
        }
        return courseSentenceModel010.copy(j13, j12, (i11 & 4) != 0 ? courseSentenceModel010.sentenceStem : str, (i11 & 8) != 0 ? courseSentenceModel010.options : str2, (i11 & 16) != 0 ? courseSentenceModel010.tOptions : str3, (i11 & 32) != 0 ? courseSentenceModel010.answer : str4, (i11 & 64) != 0 ? courseSentenceModel010.sentence : courseSentence, (i11 & 128) != 0 ? courseSentenceModel010.optionList : list);
    }

    public final long component1() {
        return this.f22290id;
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

    public final String component5() {
        return this.tOptions;
    }

    public final String component6() {
        return this.answer;
    }

    public final CourseSentence component7() {
        return this.sentence;
    }

    public final List<CourseSentence> component8() {
        return this.optionList;
    }

    public final CourseSentenceModel010 copy(long j11, long j12, String sentenceStem, String options, String tOptions, String answer, CourseSentence sentence, List<CourseSentence> optionList) {
        m.f(sentenceStem, "sentenceStem");
        m.f(options, "options");
        m.f(tOptions, "tOptions");
        m.f(answer, "answer");
        m.f(sentence, "sentence");
        m.f(optionList, "optionList");
        return new CourseSentenceModel010(j11, j12, sentenceStem, options, tOptions, answer, sentence, optionList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseSentenceModel010)) {
            return false;
        }
        CourseSentenceModel010 courseSentenceModel010 = (CourseSentenceModel010) obj;
        return this.f22290id == courseSentenceModel010.f22290id && this.sentenceId == courseSentenceModel010.sentenceId && m.a(this.sentenceStem, courseSentenceModel010.sentenceStem) && m.a(this.options, courseSentenceModel010.options) && m.a(this.tOptions, courseSentenceModel010.tOptions) && m.a(this.answer, courseSentenceModel010.answer) && m.a(this.sentence, courseSentenceModel010.sentence) && m.a(this.optionList, courseSentenceModel010.optionList);
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final long getId() {
        return this.f22290id;
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

    public final String getSentenceStem() {
        return this.sentenceStem;
    }

    public final String getTOptions() {
        return this.tOptions;
    }

    public int hashCode() {
        return this.optionList.hashCode() + ((this.sentence.hashCode() + e.d(e.d(e.d(e.d(e.f(this.sentenceId, Long.hashCode(this.f22290id) * 31, 31), 31, this.sentenceStem), 31, this.options), 31, this.tOptions), 31, this.answer)) * 31);
    }

    public String toString() {
        long j11 = this.f22290id;
        long j12 = this.sentenceId;
        String str = this.sentenceStem;
        String str2 = this.options;
        String str3 = this.tOptions;
        String str4 = this.answer;
        CourseSentence courseSentence = this.sentence;
        List<CourseSentence> list = this.optionList;
        StringBuilder sbJ = c.j(j11, "CourseSentenceModel010(id=", ", sentenceId=");
        e0.w(j12, ", sentenceStem=", str, sbJ);
        d.w(sbJ, ", options=", str2, ", tOptions=", str3);
        sbJ.append(", answer=");
        sbJ.append(str4);
        sbJ.append(", sentence=");
        sbJ.append(courseSentence);
        sbJ.append(", optionList=");
        sbJ.append(list);
        sbJ.append(")");
        return sbJ.toString();
    }

    public CourseSentenceModel010(long j11, long j12, String sentenceStem, String str, String tOptions, String answer, CourseSentence sentence, List<CourseSentence> optionList) {
        m.f(sentenceStem, "sentenceStem");
        m.f(str, aYZzTH.dSUQxCxOYD);
        m.f(tOptions, "tOptions");
        m.f(answer, "answer");
        m.f(sentence, "sentence");
        m.f(optionList, "optionList");
        this.f22290id = j11;
        this.sentenceId = j12;
        this.sentenceStem = sentenceStem;
        this.options = str;
        this.tOptions = tOptions;
        this.answer = answer;
        this.sentence = sentence;
        this.optionList = optionList;
    }
}
